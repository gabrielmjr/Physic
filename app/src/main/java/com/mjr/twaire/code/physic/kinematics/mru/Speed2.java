package com.mjr.twaire.code.physic.kinematics.mru;

import com.mjr.twaire.code.physic.Calculations;

import static com.mjr.code.tools.NumberAnalyst.putParenthesesIfNegative;

public final class Speed2 extends Calculations {
	private static Speed2 instance; 
	private double initialDisplacement;
	private double finalDisplacement;
	private double initialTime;
	private double finalTime;

	private int initialDisplacementUnit;
	private int finalDisplacementUnit;
	private int initialTimeUnit;
	private int finalTimeUnit;
	private int unitOfResult;
	
	private double step1;
	private double step2;
	private double step3;
	private boolean hasCustomUnits;
	
	private Speed2() {}
    
    @Override
    public Speed2 calculate() {
        if (hasCustomUnits)
            calculateWithCustomUnits();
        else
            calculateWithoutCustomUnits();
        return this;
    }
	
	private void calculateWithCustomUnits() {
	}

	private void calculateWithoutCustomUnits() {
		step1 = finalDisplacement - initialDisplacement;
		step2 = finalTime - initialTime;
		step3 = step1 / step2;
	}
	
	@Override
	public double getResult() {
		return step3;
	}
	
	@Override
	public String getSteps() {
		String initialDisplacement = putParenthesesIfNegative(this.initialDisplacement);
		String initialTime = putParenthesesIfNegative(this.initialTime);
		String finalTime = putParenthesesIfNegative(this.finalTime);
		return "∆v = (" + finalDisplacement + "m - " + initialDisplacement + "m) ÷ (" + finalTime + "s - " + initialTime + "s)"
		    + "\n∆v = " + step1 + "m ÷ " + finalTime + "s - " + initialTime + "s"
			+ "\n∆v = " + step1 + "m ÷ " + step2 + "s"
			+ "\n∆v = " + step3 + "m/s";
	}
	
	private Speed2 setInitialDisplacement(double initialDisplacement) {
		this.initialDisplacement = initialDisplacement;
		return this;
	}

	public double getInitialDisplacement() {
		return initialDisplacement;
	}

	private Speed2 setFinalDisplacement(double finalDisplacement) {
		this.finalDisplacement = finalDisplacement;
		return this;
	}

	public double getFinalDisplacement() {
		return finalDisplacement;
	}

	private Speed2 setInitialTime(double initialTime) {
		this.initialTime = initialTime;
		return this;
	}

	public double getInitialTime() {
		return initialTime;
	}

	private Speed2 setFinalTime(double finalTime) {
		this.finalTime = finalTime;
		return this;
	}

	public double getFinalTime() {
		return finalTime;
	}

	private Speed2 setInitialDisplacementUnit(int initialDisplacementUnit) {
		this.initialDisplacementUnit = initialDisplacementUnit;
		return this;
	}

	public int getInitialDisplacementUnit() {
		return initialDisplacementUnit;
	}

	private Speed2 setFinalDisplacementUnit(int finalDisplacementUnit) {
		this.finalDisplacementUnit = finalDisplacementUnit;
		return this;
	}

	public int getFinalDisplacementUnit() {
		return finalDisplacementUnit;
	}

	private Speed2 setInitialTimeUnit(int initialTimeUnit) {
		this.initialTimeUnit = initialTimeUnit;
		return this;
	}

	public int getInitialTimeUnit() {
		return initialTimeUnit;
	}

	private Speed2 setFinalTimeUnit(int finalTimeUnit) {
		this.finalTimeUnit = finalTimeUnit;
		return this;
	}

	public int getFinalTimeUnit() {
		return finalTimeUnit;
	}

	private Speed2 setUnitOfResult(int unitOfResult) {
		this.unitOfResult = unitOfResult;
		return this;
	}

	public int getUnitOfResult() {
		return unitOfResult;
	}
	
	@Override
	public String getFormula() {
		return "∆v = (S - Si) ÷ (t - ti)";
	}
    
    private Speed2 setHasCustomUnits(boolean hasCustomUnits) {
        this.hasCustomUnits = hasCustomUnits;
        return this;
	}

    public static Speed2 getInstance(double initialDisplacement,
		double finalDisplacement,
		double initialTime,
		double finalTime) {
		if(!(instance instanceof Speed2))
			instance = new Speed2();
		return instance.setInitialDisplacement(initialDisplacement)
		    .setFinalDisplacement(finalDisplacement)
		    .setInitialTime(initialTime)
            .setFinalTime(finalTime)
            .setHasCustomUnits(false)
            .calculate();
    }
    
    public static Speed2 getInstance(double initialDisplacement,
        int initialDisplacementUnit,
        double finalDisplacement,
        int finalDisplacementUnit,
        double initialTime,
        int initialTimeUnit,
        double finalTime,
        int finalTimeUnit,
        int unitOfResult) {
            if (!(instance instanceof Speed2))
                instance = new Speed2();
        return instance.setInitialDisplacement(initialDisplacement)
        .setInitialDisplacementUnit(initialDisplacementUnit)
            .setFinalDisplacement(finalDisplacement)
            .setFinalDisplacementUnit(finalDisplacementUnit)
            .setInitialTime(initialTime)

            .setInitialTimeUnit(initialTimeUnit)
            .setFinalTime(finalTime)
            .setFinalTimeUnit(finalTimeUnit)
            .setUnitOfResult(unitOfResult)
            .setHasCustomUnits(true)
            .calculate();
        }
}
