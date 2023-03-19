package com.gabrielMJr.twaire.physic.kinematics.mru;

// ∆S = ∆t × deltaSpeed
final class Displacement2 {
	private static Displacement2 instance; 

	private double deltaTime;
	private double deltaSpeed;

	private int deltaTimeUnit;
	private int deltaSpeedUnit;
	private int unitOfResult;

	private double step1;
	private boolean hasCustomUnits;

	private Displacement2 () {}

	private Displacement2 setHasCustomUnit (boolean hasCustomUnits) {
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
		step1 = deltaTime * deltaSpeed;
	}

	public double getResult () {
		return step1;
	}

	public String getSteps () {
		if (hasCustomUnits)
			return null;
		return "∆S = " + deltaTime + "s × " + deltaSpeed + "m/s"
			+ "\nS = " + step1 + "m";
	}

	private Displacement2 setDeltaTime (double deltaTime) {
		this.deltaTime = deltaTime;
		return this;
	}

	public double getDeltaTime () {
		return deltaTime;
	}

	private Displacement2 setDeltaSpeed (double deltaSpeed) {
		this.deltaSpeed = deltaSpeed;
		return this;
	}

	public double getdeltaSpeed () {
		return deltaSpeed;
	}

	private Displacement2 setDeltaTimeUnit (int deltaTimeUnit) {
		this.deltaTimeUnit = deltaTimeUnit;
		return this;
	}

	public int getDeltaTimeUnit () {
		return deltaTimeUnit;
	}

	private Displacement2 setDeltaSpeedUnit (int deltaSpeedUnit) {
		this.deltaSpeedUnit = deltaSpeedUnit;
		return this;
	}

	public int getDeltaSpeedUnit () {
		return deltaSpeedUnit;
	}

	private Displacement2 setUnitOfResult (int unitOfResult) {
		this.unitOfResult = unitOfResult;
		return this;
	}

	public int getUnitOfResult () {
		return unitOfResult;
	}

    public static Displacement2 getInstance (double deltaTime, double deltaSpeed) {
		if (!(instance instanceof Displacement2))
			instance = new Displacement2();
		return instance.setDeltaTime(deltaTime)
		    .setDeltaSpeed(deltaSpeed)
		    .setHasCustomUnit(false);
    }

	public static Displacement2 getInstance (double deltaTime,
											 int deltaTimeUnit,
											 double deltaSpeed,
											 int deltaSpeedUnit,
											 int unitOfResult) {
		if (!(instance instanceof Displacement2))
			instance = new Displacement2();
		return instance.setDeltaTime(deltaTime)
		    .setDeltaTimeUnit(deltaTimeUnit)
		    .setDeltaSpeed(deltaSpeed)
		    .setDeltaSpeedUnit(deltaSpeedUnit)
		    .setUnitOfResult(unitOfResult)
		    .setHasCustomUnit(true);
    }
}
