package com.gabrielmjr.physic.kinematics.mru;

import static com.gabrielmjr.tools.NumberAnalyst.putParenthesesIfNegative;

// Sf = Si + ∆S
final class Displacement5 {
	private static Displacement5 instance; 
	private double initialDisplacement;
	private double deltaDisplacement;

	private int initialDisplacementUnit;
	private int deltaDisplacementUnit;
	private int unitOfResult;

	private double step1;
	private boolean hasCustomUnits;

	private Displacement5 () {}

	private Displacement5 setHasCustomUnits (boolean hasCustomUnits) {
		if (hasCustomUnits)
			calculateWithCustomUnits();
		else
			calculeWithoutCustomUnits();
		return this;
	}

	private void calculateWithCustomUnits () {
	}

	private void calculeWithoutCustomUnits () {
		step1 = initialDisplacement + deltaDisplacement;
	}

	public double getResult () {
		return step1;
	}

	public String getSteps () {
		String deltaDisplacement = putParenthesesIfNegative(this.deltaDisplacement) + "m";
		if (hasCustomUnits)
			return null;
		if (this.deltaDisplacement < 0)
			return "Sf = " + initialDisplacement + "m + " + deltaDisplacement
			    + "\nSf = " + initialDisplacement + "m - " + this.deltaDisplacement
				+ "\nSf = " + step1 + "m";
		return "Sf = " + initialDisplacement + "m + " + deltaDisplacement
			+ "\nSf = " + step1 + "m";
	}

	private Displacement5 setInitialDisplacement (double initialDisplacement) {
		this.initialDisplacement = initialDisplacement;
		return this;
	}

	public double getInitialDisplacement () {
		return initialDisplacement;
	}

	private Displacement5 setDeltaDisplacement (double deltaDisplacement) {
		this.deltaDisplacement = deltaDisplacement;
		return this;
	}

	public double getDeltaDisplacement () {
		return deltaDisplacement;
	}

	private Displacement5 setInitialDisplacementUnit (int initialDisplacementUnit) {
		this.initialDisplacementUnit = initialDisplacementUnit;
		return this;
	}

	public int getInitialDisplacementUnit () {
		return initialDisplacementUnit;
	}

	private Displacement5 setDeltaDisplacementUnit (int deltaDisplacementUnit) {
		this.deltaDisplacementUnit = deltaDisplacementUnit;
		return this;
	}

	public int getDeltaDisplacementUnit () {
		return deltaDisplacementUnit;
	}

	private Displacement5 setUnitOfResult (int unitOfResult) {
		this.unitOfResult = unitOfResult;
		return this;
	}

	public int getUnitOfResult () {
		return unitOfResult;
	}

	public static Displacement5 getInstance (double initialDisplacement, double deltaDisplacement) {
		if (!(instance instanceof Displacement5))
			instance = new Displacement5();
		return instance.setInitialDisplacement(initialDisplacement)
		    .setDeltaDisplacement(deltaDisplacement)
	        .setHasCustomUnits(false);
	}

	public static Displacement5 getInstance (double initialDisplacement,
											 int initialDisplacementUnit,
											 double deltaDisplacement,
											 int deltaDisplacementUnit,
											 int unitOfResult) {
		return null;
	}
}
