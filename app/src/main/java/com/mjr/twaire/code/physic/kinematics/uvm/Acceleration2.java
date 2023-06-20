package com.mjr.twaire.code.physic.kinematics.uvm;

import com.mjr.twaire.code.physic.Calculation;
import com.mjr.twaire.code.physic.Physic;
import com.mjr.twaire.code.physic.units.Unit;

import static com.mjr.code.tools.NumberAnalyst.putParenthesesIfNegative;

public final class Acceleration2 extends Calculation {
    @Deprecated
	private static Acceleration2 instance; 
    private double deltaSpeed;
    private double initialTime;
    private double finalTime;

    private int deltaSpeedUnit;
    private int initialTimeUnit;
    private int finalTimeUnit;
    private int unitOfResult;

    private double step1;
    private double step2;
    private boolean hasCustomUnits;

    protected Acceleration2() {}

    protected Acceleration2(double deltaSpeed, double initialTime, double finalTime) {
        this.deltaSpeed = deltaSpeed;
        this.initialTime = initialTime;
        this.finalTime = finalTime;
        hasCustomUnits = false;
        calculate();
    }

    protected Acceleration2(double deltaSpeed,
                            int deltaSpeedUnit,
                            double initialTime,
                            int initialTimeUnit,
                            double finalTime,
                            int finalTimeUnit,
                            int unitOfResult) {
        this.deltaSpeed = deltaSpeed;
        this.initialTime = initialTime;
        this.finalTime = finalTime;
        this.deltaSpeedUnit = deltaSpeedUnit;
        this.initialTimeUnit = initialTimeUnit;
        this.finalTimeUnit = finalTimeUnit;
        this.unitOfResult = unitOfResult;
        hasCustomUnits = true;
        calculate();
    }

    @Override
    public Acceleration2 calculate() {
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
        step2 = deltaSpeed / step1;
    }

    @Override
    public Unit getResult() {
        return null; //step2;
    }

    @Override
    public String getSteps() {
        if (hasCustomUnits)
            return null;
        String step1 = putParenthesesIfNegative(this.step1);
        if (initialTime < 0)
            return "a = " + deltaSpeed + "m/s ÷ [" + finalTime + "s - (" + initialTime + "s)]"
                + "\na = " + deltaSpeed + "m/s ÷ " + step1 + "s"
                + "\na = " + step2 + "m/s²";
        return "a = " + deltaSpeed + "m/s ÷ (" + finalTime + "s - " + initialTime + "s)"
            + "\na = " + deltaSpeed + "m/s ÷ " + step1 + "s"
            + "\na = " + step2 + "m/s²";
    }

    public Acceleration2 setDeltaSpeed(double deltaSpeed) {
        this.deltaSpeed = deltaSpeed;
        return this;
    }

    public double getDeltaSpeed() {
        return deltaSpeed;
    }

    public Acceleration2 setInitialTime(double initialTime) {
        this.initialTime = initialTime;
        return this;
    }

    public double getInitialTime() {
        return initialTime;
    }

    public Acceleration2 setFinalTime(double finalTime) {
        this.finalTime = finalTime;
        return this;
    }

    public double getFinalTime() {
        return finalTime;
    }

    public Acceleration2 setDeltaSpeedUnit(int deltaSpeedUnit) {
        this.deltaSpeedUnit = deltaSpeedUnit;
        return this;
    }

    public int getDeltaSpeedUnit() {
        return deltaSpeedUnit;
    }

    public Acceleration2 setInitialTimeUnit(int initialTimeUnit) {
        this.initialTimeUnit = initialTimeUnit;
        return this;
    }

    public int getInitialTimeUnit() {
        return initialTimeUnit;
    }

    public Acceleration2 setFinalTimeUnit(int finalTimeUnit) {
        this.finalTimeUnit = finalTimeUnit;
        return this;
    }

    public int getFinalTimeUnit() {
        return finalTimeUnit;
    }

    public Acceleration2 setUnitOfResult(int unitOfResult) {
        this.unitOfResult = unitOfResult;
        return this;
    }

    public int getUnitOfResult() {
        return unitOfResult;
    }

    @Override
    public String getFormula() {
        return "a = ∆v / (tf - ti)";
    }

    @Deprecated
	protected String acceleration(
		double deltaSpeed,
		double initialTime,
		double finalTime,
		int stepOrResult) {
		double step1 = finalTime - initialTime;
		double step2 = deltaSpeed / step1;
		String res = "a = (";
		if (stepOrResult == Physic.GET_STEP) {
			res += deltaSpeed
				+ "m/s) ÷ ("
				+ finalTime
				+ " s - "
				+ initialTime
				+ "s)"
				+ "\na = ("
				+ deltaSpeed
				+ "m/s) ÷ ("
				+ step1
				+ "s)"
				+ "\n"
				+ "a = "
				+ step2
				+ "m/s²";
			return res;
		} else if (stepOrResult == Physic.GET_RESULT) {
			return String.valueOf((deltaSpeed) / (finalTime - initialTime));
		} else {
			return "Error 404: fourth parameter not found.";
		}
	}

    @Deprecated
    public static Acceleration2 getInstance() {
		if (instance == null) {
			instance = new Acceleration2();
		}
		return instance;
    }
}
