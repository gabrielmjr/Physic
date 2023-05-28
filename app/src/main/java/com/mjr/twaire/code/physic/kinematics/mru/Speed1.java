package com.mjr.twaire.code.physic.kinematics.mru;

import static com.mjr.code.tools.NumberAnalyst.putParenthesesIfNegative;

// ∆v = ∆S / ∆t
final class Speed1 {
	private static Speed1 instance;
	private double deltaDisplacement;
	private double deltaTime;
	
	private int deltaDisplacementUnit;
	private int deltaTimeUnit;
	private int unitOfResult;
	
	private double step1;
	private boolean hasCustomUnits;

	private Speed1() {}

	private Speed1 setHasCustomUnits (boolean hasCustomUnits) {
		this.hasCustomUnits = hasCustomUnits;
		if (hasCustomUnits)
			calculateWithCustomUnits();
		else
			calculateWithoutCustomUnits();
		return this;
	}

	private void calculateWithCustomUnits() {
	}

	private void calculateWithoutCustomUnits() {
		step1 = deltaDisplacement / deltaTime;
	}
	
	public double getResult () {
		return step1;
	}
	
	public String getSteps() {
		String deltaTime = putParenthesesIfNegative(this.deltaTime);
		if (hasCustomUnits)
			return null;
		return "∆v = " + deltaDisplacement + "m × " + deltaTime + "s"
		    + "\n∆v = " + step1 + "m/s";
	}

	private Speed1 setDeltaDisplacement(double deltaDisplacement) {
		this.deltaDisplacement = deltaDisplacement;
		return this;
	}

	public double getDeltaDisplacement() {
		return deltaDisplacement;
	}

	private Speed1 setDeltaTime(double deltaTime) {
		this.deltaTime = deltaTime;
		return this;
	}

	public double getDeltaTime() {
		return deltaTime;
	}

	private Speed1 setDeltaDisplacementUnit(int deltaDisplacementUnit) {
		this.deltaDisplacementUnit = deltaDisplacementUnit;
		return this;
	}

	public int getDeltaDisplacementUnit() {
		return deltaDisplacementUnit;
	}

	private Speed1 setDeltaTimeUnit(int deltaTimeUnit) {
		this.deltaTimeUnit = deltaTimeUnit;
		return this;
	}

	public int getDeltaTimeUnit() {
		return deltaTimeUnit;
	}
	
	private Speed1 setUnitOfResult(int unitOfResult) {
		this.unitOfResult = unitOfResult;
		return this;
	}

	public int getUnitOfResult() {
		return unitOfResult;
	}

    public static Speed1 getInstance (double deltaDisplacement,
	                                  double deltaTime) {
		if(!(instance instanceof Speed1))
			instance = new Speed1();
		return instance.setDeltaDisplacement(deltaDisplacement)
		    .setDeltaTime(deltaTime)
		    .setHasCustomUnits(false);
    }
	
	public static Speed1 getInstance (double deltaDisplacement,
	                                  int deltaDisplacementUnit,
	                                  double deltaTime,
									  int deltaTimeUnit,
									  int unitOfResult) {
		if(!(instance instanceof Speed1))
			instance = new Speed1();
		return instance.setDeltaDisplacement(deltaDisplacement)
		    .setDeltaDisplacementUnit(deltaDisplacementUnit)
		    .setDeltaTime(deltaTime)
		    .setDeltaTimeUnit(deltaTimeUnit)
		    .setUnitOfResult(unitOfResult)
		    .setHasCustomUnits(true);
    }
}
