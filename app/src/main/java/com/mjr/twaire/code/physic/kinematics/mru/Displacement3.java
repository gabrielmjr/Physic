package com.mjr.twaire.code.physic.kinematics.mru;

import com.mjr.twaire.code.physic.Calculation;

import static com.mjr.code.tools.NumberAnalyst.putParenthesesIfNegative;

public final class Displacement3 extends Calculation {
    @Deprecated
	private static Displacement3 instance; 
	private double initialTime;
	private double finalTime;
	private double deltaSpeed;

	private int initialTimeUnit;
	private int finalTimeUnit;
	private int deltaSpeedUnit;
	private int unitOfResult;

	private double step1;
	private double step2;
	private boolean hasCustomUnits;
    
    protected Displacement3() {}

    protected Displacement3(double initialTime,
                         double finalTime,
                         double deltaSpeed) {
        this.initialTime = initialTime;
        this.finalTime = finalTime;
        this.deltaSpeed = deltaSpeed;
        hasCustomUnits = false;
        calculate();
    }

    protected Displacement3(double initialTime,
                         int initialTimeUnit, 
                         double finalTime, 
                         int finalTimeUnit,
                         double deltaSpeed,
                         int deltaSpeedUnit, 
                         int unitOfResult) {
        this.initialTime = initialTime;
        this.finalTime = finalTime;
        this.deltaSpeed = deltaSpeed;
        this.initialTimeUnit = initialTimeUnit;
        this.finalTimeUnit = finalTimeUnit;
        this.deltaSpeedUnit = deltaSpeedUnit;
        this.unitOfResult = unitOfResult;
        hasCustomUnits = true;
        calculate();
    }


    @Override
    public Displacement3 calculate() {
        if (hasCustomUnits)
            calculateWithCustomUnits();
        else
            calculateWithoutCustomUnits();
        return this;
    }

	private void calculateWithCustomUnits() {
	}

	private void calculateWithoutCustomUnits() {
		step1 = finalTime - initialTime;
		step2 = step1 * deltaSpeed;
	}

    @Override
	public double getResult() {
		return step2;
	}

    @Override
	public String getSteps() {
		if (hasCustomUnits)
			return null;
		else {
			String initialTime = putParenthesesIfNegative(this.initialTime) + "s";
			String deltaSpeed = putParenthesesIfNegative(this.deltaSpeed) + "m/s";
			if (this.initialTime < 0) 
				return "∆S = [" + finalTime + "s - " + initialTime + "] × " + deltaSpeed
					+ "\n∆S = (" + finalTime + "s + " + (- this.initialTime) + "s) × " + deltaSpeed
					+ "\n∆S = " + step1 + "s × " + deltaSpeed
					+ "\n∆S 5 " + step2 + "s";
			return "∆S = (" + finalTime + "s - " + initialTime + "s) × " + deltaSpeed
                + "\n∆S = " + step1 + "s × " + deltaSpeed
                + "\n∆S = " + step2 + "m";
		}
	}

	private Displacement3 setInitialTime(double initialTime) {
		this.initialTime = initialTime;
		return this;
	}

	public double getInitialTime() {
		return initialTime;
	}

	private Displacement3 setFinalTime(double finalTime) {
		this.finalTime = finalTime;
		return this;
	}

	public double getFinalTime() {
		return finalTime;
	}

	private Displacement3 setDeltaSpeed(double deltaSpeed) {
		this.deltaSpeed = deltaSpeed;
		return this;
	}

	public double getDeltaSpeed() {
		return deltaSpeed;
	}

	private Displacement3 setInitialTimeUnit(int initialTimeUnit) {
		this.initialTimeUnit = initialTimeUnit;
		return this;
	}

	public int getInitialTimeUnit() {
		return initialTimeUnit;
	}

	private Displacement3 setFinalTimeUnit(int finalTimeUnit) {
		this.finalTimeUnit = finalTimeUnit;
		return this;
	}

	public int getFinalTimeUnit() {
		return finalTimeUnit;
	}

	private Displacement3 setDeltaSpeedUnit(int deltaSpeedUnit) {
		this.deltaSpeedUnit = deltaSpeedUnit;
		return this;
	}

	public int getDeltaSpeedUnit() {
		return deltaSpeedUnit;
	}

	private Displacement3 setUnitOfResult(int unitOfResult) {
		this.unitOfResult = unitOfResult;
		return this;
	}

	public int getUnitOfResult() {
		return unitOfResult;
	}

    @Override
    public String getFormula() {
        return "∆S = (t - ti) × ∆v";
    }

    private Displacement3 setHasCustomUnit(boolean hasCustomUnits) {
        this.hasCustomUnits = hasCustomUnits;
        return this;
	}

	public static Displacement3 getInstance(double initialTime,
                                            double finalTime,
                                            double deltaSpeed)  {
		if (!(instance instanceof Displacement3))
			instance = new Displacement3();
		return instance.setInitialTime(initialTime)
		    .setFinalTime(finalTime)
		    .setDeltaSpeed(deltaSpeed)
		    .setHasCustomUnit(false)
            .calculate();
    }

    public static Displacement3 getInstance(double initialTime,
                                            int initialTimeUnit,
                                            double finalTime,
                                            int finalTimeUnit,
                                            double deltaSpeed,
                                            int deltaSpeedUnit,
                                            int unitOfResult)  {
		if (!(instance instanceof Displacement3))
			instance = new Displacement3();
		return instance.setInitialTime(initialTime)
		    .setInitialTimeUnit(initialTimeUnit)
		    .setFinalTime(finalTime)
		    .setFinalTimeUnit(finalTimeUnit)
	        .setDeltaSpeed(deltaSpeed)
		    .setDeltaSpeedUnit(deltaSpeedUnit)
		    .setUnitOfResult(unitOfResult)
		    .setHasCustomUnit(true)
            .calculate();
    }
}
