package com.mjr.code.physic.kinematics.mru;

import static com.mjr.code.tools.NumberAnalyst.putParenthesesIfNegative;

// S = Si + v * ∆t
final class Displacement6 {
	private static Displacement6 instance;
	private double initialDisplacement;
	private double velocity;
	private double deltaTime;

	private int initialDisplacementUnit;
	private int velocityUnit;
	private int deltaTimeUnit;
	private int unitOfResult;

	private double step1;
	private double step2;
	private boolean hasCustomUnits;

	private Displacement6 () {}

	private Displacement6 setHasCustomUnits (boolean hasCustomUnits) {
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
		step1 = velocity * deltaTime;
		step2 = initialDisplacement + step1;
	}

	public double getResult () {
		return step2;
	}

	public String getSteps () {
		String velocity = putParenthesesIfNegative(this.velocity) + "m/s";
		if (hasCustomUnits)
			return null;
		if (this.velocity < 0)
			return "S = " + initialDisplacement + "m + " + velocity + " × " + deltaTime + "s"
			    + "\nS = " + initialDisplacement + "m - " + (- this.velocity) + "m/s × " + deltaTime + "s"
				+ "\nS = " + initialDisplacement + "m - " + step1 + "m"
				+ "\nS = " + step2 + "m";
		return "S = " + initialDisplacement + "m + " + velocity + " × " + deltaTime + "s"
			+ "\nS = " + initialDisplacement + "m + " + step1 + "m"
			+ "\nS = " + step2 + "m";
	}

	private Displacement6 setInitialDisplacement (double initialDisplacement) {
		this.initialDisplacement = initialDisplacement;
		return this;
	}

	public double getInitialDisplacement () {
		return initialDisplacement;
	}

	private Displacement6 setVelocity (double velocity) {
		this.velocity = velocity;
		return this;
	}

	public double getVelocity () {
		return velocity;
	}

	private Displacement6 setDeltaTime (double deltaTime) {
		this.deltaTime = deltaTime;
		return this;
	}

	public double getDeltaTime () {
		return deltaTime;
	}

	private Displacement6 setInitialDisplacementUnit (int initialDisplacementUnit) {
		this.initialDisplacementUnit = initialDisplacementUnit;
		return this;
	}

	public int getInitialDisplacementUnit () {
		return initialDisplacementUnit;
	}

	private Displacement6 setVelocityUnit (int velocityUnit) {
		this.velocityUnit = velocityUnit;
		return this;
	}

	public int getVelocityUnit () {
		return velocityUnit;
	}

	private Displacement6 setDeltaTimeUnit (int deltaTimeUnit) {
		this.deltaTimeUnit = deltaTimeUnit;
		return this;
	}

	public int getDeltaTimeUnit () {
		return deltaTimeUnit;
	}

	private Displacement6 setUnitOfResult (int unitOfResult) {
		this.unitOfResult = unitOfResult;
		return this;
	}

	public int getUnitOfResult () {
		return unitOfResult;
	}

	public static Displacement6 getInstance (double initialDisplacement,
											 double velocity,
											 double deltaTime) {
		if (!(instance instanceof Displacement6))
			instance = new Displacement6();
		return instance.setInitialDisplacement(initialDisplacement)
		    .setVelocity(velocity)
		    .setDeltaTime(deltaTime)
		    .setHasCustomUnits(false);
	}

	public static Displacement6 getInstance (double initialDisplacement, 
											 int initialDisplacementUnit,
											 double velocity, 
											 int velocityUnit,
											 double deltaTime, 
											 int deltaTimeUnit,
											 int unitOfResult) {
		if (!(instance instanceof Displacement6))
			instance = new Displacement6();
		return instance.setInitialDisplacement(initialDisplacement)
		    .setInitialDisplacementUnit(initialDisplacementUnit)
		    .setVelocity(velocity)
		    .setVelocityUnit(velocityUnit)
		    .setDeltaTime(deltaTime)
		    .setDeltaTimeUnit(deltaTimeUnit)
		    .setUnitOfResult(unitOfResult)
		    .setHasCustomUnits(false);
	}
}
