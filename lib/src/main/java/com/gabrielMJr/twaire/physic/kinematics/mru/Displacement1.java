package com.gabrielMJr.twaire.physic.kinematics.mru;

import static com.gabrielMJr.twaire.tools.NumberAnalyst.putParenthesesIfNegative;

// ∆S = sf - si
final class Displacement1 {
	private static Displacement1 instance; 

	private double initialDisplacement;
	private double finalDisplacement;

	private int initialDisplacementUnit;
	private int finalDisplacementUnit;
	private int unitOfResult;

	private double step1;
	private boolean hasCustomUnits;

	private Displacement1 () {}

	private Displacement1 setHasCustomUnits (boolean hasCustomUnits) {
		this.hasCustomUnits = hasCustomUnits;
		if (hasCustomUnits)
			calculateWithCustomUnits();
		else
			calculateWithoutCustomUnits();
		return this;
	}

	private void calculateWithCustomUnits () {
	}

	private void calculateWithoutCustomUnits () {
		step1 = finalDisplacement - initialDisplacement;
	}

	public double getResult () {
		return step1;
	}

	public String getSteps () {
		String initialDisplacement = putParenthesesIfNegative(this.initialDisplacement) + "m";
		boolean isInitialDisplacementNegative = this.initialDisplacement < 0;
		if (hasCustomUnits)
			return null;
		else return "∆S = " + finalDisplacement + "m - " + initialDisplacement
				+ "\n∆S = " + finalDisplacement + "m " + ((isInitialDisplacementNegative) ? "+ " + (- this.initialDisplacement) : "- " + this.initialDisplacement) + "m"
				+ "\n∆S = " + step1 + "m";
	}

	private Displacement1 setInitiDisplacement (double initialDisplacement) {
		this.initialDisplacement = initialDisplacement;
		return this;
	}

	public double getInitialDisplacement () {
		return initialDisplacement;
	}

	private Displacement1 setFinalDisplacement (double finalDisplacement) {
		this.finalDisplacement = finalDisplacement;
		return this;
	}

	public double getFinalDisplacement () {
		return finalDisplacement;
	}

	private Displacement1 setInitialDisplacementUnit (int initialDisplacementUnit) {
		this.initialDisplacementUnit = initialDisplacementUnit;

		return this;
	}
	
	public int getInitialDisplacementUnit () {
		return initialDisplacementUnit;
	}
	
	private Displacement1 setFinalDisplacementUnit (int finalDisplacementUnit) {
		this.finalDisplacementUnit = finalDisplacementUnit;
		return this;
	}
	
	public int getFinalDisplacementUnit () {
		return finalDisplacementUnit;
	}
	
	private Displacement1 setUnitOfResult (int unitOfResult) {
		this.unitOfResult = unitOfResult;
		return this;
	}
	
	public int getUnitOfResult () {
		return unitOfResult;
	}

    public static Displacement1 getInstance (double initialDisplacement, double finalDisplacement) {
		if (!(instance instanceof Displacement1))
			instance = new Displacement1();
		return instance.setInitiDisplacement(initialDisplacement)
		    .setFinalDisplacement(finalDisplacement)
		    .setHasCustomUnits(false);
    }

	public static Displacement1 getInstance (double initialDisplacement, 
											 int initialDisplacementUnit,
											 double finalDisplacement,
											 int finalDisplacementUnit,
											 int unitOfResult) {
		if (!(instance instanceof Displacement1))
			instance = new Displacement1();
		return instance.setInitiDisplacement(initialDisplacement)
		    .setInitialDisplacementUnit(initialDisplacementUnit)
		    .setFinalDisplacement(finalDisplacement)
		    .setFinalDisplacementUnit(finalDisplacementUnit)
		    .setUnitOfResult(unitOfResult)
		    .setHasCustomUnits(true);
    }
}
