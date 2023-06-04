package com.mjr.twaire.code.physic.kinematics.muv;

// a = ∆v / ∆t
public final class Acceleration1 {
	private static Acceleration1 instance; 
    private double deltaSpeed;
    private double deltaTime;
    
    private int deltaSpeedUnit;
    private int deltaTimeUnit;
    private int unitOfResult;
    
    private double step1;
    private boolean hasCustomUnits;

	private Acceleration1() {}
    
    private Acceleration1 setHasCustomUnit (boolean hasCustomUnits) {
        this.hasCustomUnits = hasCustomUnits;
        if (hasCustomUnits)
            calculateWithCustomUnits();
        else
            calculateWithoutCUstomUnits();
        return this;
    }

    private void calculateWithCustomUnits () {
    }

    private void calculateWithoutCUstomUnits () {
        step1 = deltaSpeed / deltaTime;
    }

    public double getResult () {
        return step1;
	}
    
    public String getSteps() {
        return "a = (" + deltaSpeed + "m/s) / (" + deltaSpeed + "s)"
            + "\na = " + step1 + "m/s²";
    }
    
    private Acceleration1 setDeltaSpeed(double deltaSpeed) {
        this.deltaSpeed = deltaSpeed;
        return this;
    }

    public double getDeltaSpeed() {
        return deltaSpeed;
    }

    private Acceleration1 setDeltaTime(double deltaTime) {
        this.deltaTime = deltaTime;
        return this;
    }

    public double getDeltaTime() {
        return deltaTime;
    }

    private Acceleration1 setDeltaSpeedUnit(int deltaSpeedUnit) {
        this.deltaSpeedUnit = deltaSpeedUnit;
        return this;
    }

    public int getDeltaSpeedUnit() {
        return deltaSpeedUnit;
    }

    private Acceleration1 setDeltaTimeUnit(int deltaTimeUnit) {
        this.deltaTimeUnit = deltaTimeUnit;
        return this;
    }

    public int getDeltaTimeUnit() {
        return deltaTimeUnit;
    }

    private Acceleration1 setUnitOfResult(int unitOfResult) {
        this.unitOfResult = unitOfResult;
        return this;
    }

    public int getUnitOfResult() {
        return unitOfResult;
    }

    public static Acceleration1 getInstance(double deltaSpeed, double deltaTime) {
		if (instance == null) {
			instance = new Acceleration1();
		}
		return instance.setDeltaSpeed(deltaSpeed)
            .setDeltaTime(deltaTime)
            .setHasCustomUnit(false);
    }
    
    public static Acceleration1 getInstance(double deltaSpeed, 
                                            int deltaSpeedUnit,
                                            double deltaTime,
                                            int deltaTimeUnit,
                                            int unitOfResult) {
        if (instance == null) {
            instance = new Acceleration1();
        }
        return instance.setDeltaSpeed(deltaSpeed)
            .setDeltaSpeedUnit(deltaSpeedUnit)
            .setDeltaTime(deltaTime)
            .setDeltaTimeUnit(deltaTimeUnit)
            .setUnitOfResult(unitOfResult)
            .setHasCustomUnit(true);
    }
}
