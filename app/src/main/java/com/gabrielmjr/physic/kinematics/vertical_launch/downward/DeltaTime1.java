package com.gabrielmjr.physic.kinematics.vertical_launch.downward;

// ∆t = ∆v / g
final class DeltaTime1 {
    private static DeltaTime1 instance;
    private double deltaSpeed;
    private double gravity;
    
    private int deltaSpeedUnit;
    private int gravityUnit;
    private int unitOfResult;
    
    private double step1;
    private boolean hasCustomUnits;
    
    private DeltaTime1() {}
    
    private DeltaTime1 setHasCustomUnits(boolean hasCustomUnits) {
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
        step1 = deltaSpeed / gravity;
    }
    
    public double getResult() {
        return step1;
    }
    
    public String getSteps() {
        if (hasCustomUnits)
            return null;
        return "∆t = " + deltaSpeed + "m/s ÷ " + gravity + "m/s²"
            + "\n∆t = " + step1 + "s";
    }
    
    private DeltaTime1 setDeltaSpeed(double deltaSpeed) {
        this.deltaSpeed = deltaSpeed;
        return this;
    }

    public double getDeltaSpeed() {
        return deltaSpeed;
    }

    private DeltaTime1 setGravity(double gravity) {
        this.gravity = gravity;
        return this;
    }

    public double getGravity() {
        return gravity;
    }

    private DeltaTime1 setDeltaSpeedUnit(int deltaSpeedUnit) {
        this.deltaSpeedUnit = deltaSpeedUnit;
        return this;
    }

    public int getDeltaSpeedUnit() {
        return deltaSpeedUnit;
    }

    private DeltaTime1 setGravityUnit(int gravityUnit) {
        this.gravityUnit = gravityUnit;
        return this;
    }

    public int getGravityUnit() {
        return gravityUnit;
    }

    private DeltaTime1 setUnitOfResult(int unitOfResult) {
        this.unitOfResult = unitOfResult;
        return this;
    }

    public int getUnitOfResult() {
        return unitOfResult;
    }

    public static DeltaTime1 getInstance(double deltaSpeed, double gravity) {
        if (!(instance instanceof DeltaTime1))
            instance = new DeltaTime1();
        return instance.setDeltaSpeed(deltaSpeed)
            .setGravity(gravity)
            .setHasCustomUnits(false);
    }

    public static DeltaTime1 getInstance(double deltaSpeed,
    int deltaSpeedUnit,
    double gravity,
    int gravityUnit,
    int unitOfResult) {
        if (!(instance instanceof DeltaTime1))
            instance = new DeltaTime1();
        return instance.setDeltaSpeed(deltaSpeed)
            .setDeltaSpeedUnit(deltaSpeedUnit)
            .setGravity(gravity)
            .setGravityUnit(gravityUnit)
            .setUnitOfResult(unitOfResult)
            .setHasCustomUnits(true);
    }
}
