package com.gabrielMJr.twaire.physic.kinematics.vertical_launch.downward;

// vi = v + g * ∆t
final class InitialVelocity {
    private static InitialVelocity instance;
    private double velocity;
    private double gravity;
    private double deltaTime;

    private int velocityUnit;
    private int gravityUnit;
    private int deltaTimeunit;
    private int unitOfResult;

    private double step1;
    private double step2;
    private boolean hasCustomUnits;

    private InitialVelocity setHasCustomUnits(boolean hasCustomUnits) {
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
        step1 = gravity * deltaTime;
        step2 = velocity - step1;
    }

    public double getResult() {
        return step2;
    }

    public String getSteps() {
        if (hasCustomUnits)
            return null;
        return "vi = " + velocity + "m/s - " + gravity + "m/s × " + deltaTime + "s"
            + "\nvi = " + velocity + "m/s - " + step1 + "m/s"
            + "\nvi = " + step2 + "m/s";
    }

    private InitialVelocity setVelocity(double velocity) {
        this.velocity = velocity;
        return this;
    }

    public double getVelocity() {
        return velocity;
    }

    private InitialVelocity setGravity(double gravity) {
        this.gravity = gravity;
        return this;
    }

    public double getGravity() {
        return gravity;
    }

    private InitialVelocity setDeltaTime(double deltaTime) {
        this.deltaTime = deltaTime;
        return this;
    }

    public double getDeltaTime() {
        return deltaTime;
    }

    private InitialVelocity setVelocityUnit(int velocityUnit) {
        this.velocityUnit = velocityUnit;
        return this;
    }

    public int getVelocityUnit() {
        return velocityUnit;
    }

    private InitialVelocity setGravityUnit(int gravityUnit) {
        this.gravityUnit = gravityUnit;
        return this;
    }

    public int getGravityUnit() {
        return gravityUnit;
    }

    private InitialVelocity setDeltaTimeunit(int deltaTimeunit) {
        this.deltaTimeunit = deltaTimeunit;
        return this;
    }

    public int getDeltaTimeunit() {
        return deltaTimeunit;
    }
    
    private InitialVelocity setUnitOfResult (int unitOfResult) {
        this.unitOfResult = unitOfResult;
        return this;
    }
    
    public int getUnitOfResult () {
        return unitOfResult;
    }

    protected static InitialVelocity getInstance(double velocity,
                                                 double gravity,
                                                 double deltaTime) {
        if (!(instance instanceof InitialVelocity))
            instance = new InitialVelocity();
        return instance.setVelocity(velocity)
             .setGravity(gravity)
             .setDeltaTime(deltaTime)
             .setHasCustomUnits(false);
    }

    protected static InitialVelocity getInstance(double velocity, 
                                                 int velocityUnit,
                                                 double gravity, 
                                                 int gravityUnit,
                                                 double deltaTime,
                                                 int deltaTimeUnit,
                                                 int unitOfResult) {
        if (!(instance instanceof InitialVelocity))
            instance = new InitialVelocity();
        return instance.setVelocity(velocity)
            .setVelocityUnit(velocityUnit)
            .setGravity(gravity)
            .setGravityUnit(gravityUnit)
            .setDeltaTime(deltaTime)
            .setDeltaTimeunit(deltaTimeUnit)
            .setUnitOfResult(unitOfResult)
            .setHasCustomUnits(true);
    }
}
