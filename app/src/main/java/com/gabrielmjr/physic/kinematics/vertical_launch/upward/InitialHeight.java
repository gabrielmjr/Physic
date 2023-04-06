package com.gabrielmjr.physic.kinematics.vertical_launch.upward;

// yi = y + [vi * ∆t + (g * t²)/2]
final class InitialHeight {
    private static InitialHeight instance;
    private double height;
    private double initialVelocity;
    private double deltaTime;
    private double gravity;

    private int heightUnit;
    private int initialVelocityUnit;
    private int deltaTimeUnit;
    private int gravityUnit;
    private int unitOfResult;

    private double step1;
    private double step2;
    private double step3;
    private double step4;
    private double step5;
    private double step6;
    private boolean hasCustomUnits;

    private InitialHeight setHasCustomUnits(boolean hasCustomUnits) {
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
        step1 = Math.pow(deltaTime, 2);
        step2 = gravity * step1;
        step3 = step2 / 2;
        step4 = initialVelocity * deltaTime;
        step5 = step3 + step4;
        step6 = height + step5;
    }

    public double getResult() {
        return step6;
    }

    public String getSeps() {
        if (hasCustomUnits)
            return null;
        return "yi = " + height + "m + [" + initialVelocity + "m/s × " + deltaTime + "s + " + gravity + "m/s² × (" + deltaTime + "s)² ÷ 2]"
            + "\nyi = " + height + "m + (" + initialVelocity + "m/s × " + deltaTime + "s + " + gravity + "m/s² × " + step1 + "s² ÷ 2)"
            + "\nyi = " + height + "m + (" + initialVelocity + "m/s × " + deltaTime + "s + " + step2 + "m ÷ 2)"
            + "\nyi = " + height + "m + (" + initialVelocity + "m/s × " + deltaTime + "s + " + step3 + "m)"
            + "\nyi = " + height + "m + (" + step4 + "m + " + step3 + "m)"
            + "\nyi = " + height + "m + " + step5 + "m"
            + "\nyi = " + step6 + "m";
    }

    private InitialHeight setHeight(double height) {
        this.height = height;
        return this;
    }

    public double getHeight() {
        return height;
    }

    private InitialHeight setInitialVelocity(double initialVelocity) {
        this.initialVelocity = initialVelocity;
        return this;
    }

    public double getInitialVelocity() {
        return initialVelocity;
    }

    private InitialHeight setDeltaTime(double deltaTime) {
        this.deltaTime = deltaTime;
        return this;
    }

    public double getDeltaTime() {
        return deltaTime;
    }

    private InitialHeight setGravity(double gravity) {
        this.gravity = gravity;
        return this;
    }

    public double getGravity() {
        return gravity;
    }

    private InitialHeight setHeightUnit(int heightUnit) {
        this.heightUnit = heightUnit;
        return this;
    }

    public int getHeightUnit() {
        return heightUnit;
    }

    private InitialHeight setInitialVelocityUnit(int initialVelocityUnit) {
        this.initialVelocityUnit = initialVelocityUnit;
        return this;
    }

    public int getInitialVelocityUnit() {
        return initialVelocityUnit;
    }

    private InitialHeight setDeltaTimeUnit(int deltaTimeUnit) {
        this.deltaTimeUnit = deltaTimeUnit;
        return this;
    }

    public int getDeltaTimeUnit() {
        return deltaTimeUnit;
    }

    private InitialHeight setGravityUnit(int gravityUnit) {
        this.gravityUnit = gravityUnit;
        return this;
    }

    public int getGravityUnit() {
        return gravityUnit;
    }

    private InitialHeight setUnitOfResult(int unitOfResult) {
        this.unitOfResult = unitOfResult;
        return this;
    }

    public int getUnitOfResult() {
        return unitOfResult;
    }

    public static InitialHeight getInstance(double height,
                                            double initialVelocity,
                                            double deltaTime,
                                            double gravity) {
        if (!(instance instanceof InitialHeight))
            instance = new InitialHeight();
        return instance.setHeight(height)
            .setInitialVelocity(initialVelocity)
            .setDeltaTime(deltaTime)
            .setGravity(gravity)
            .setHasCustomUnits(false);
    }

    public static InitialHeight getInstance(double height,
                                            int heightUnit,
                                            double initialVelocity,
                                            int initialVelocityUnit, 
                                            double deltaTime,
                                            int deltaTimeUnit,
                                            double gravity,
                                            int gravityUnit,
                                            int unitOfResult) {
        if (!(instance instanceof InitialHeight))
            instance = new InitialHeight();
        return instance.setHeight(height)
            .setHeightUnit(heightUnit)
            .setInitialVelocity(initialVelocity)
            .setInitialVelocityUnit(initialVelocityUnit)
            .setDeltaTime(deltaTime)
            .setDeltaTimeUnit(deltaTimeUnit)
            .setGravity(gravity)
            .setGravityUnit(gravityUnit)
            .setUnitOfResult(unitOfResult)
            .setHasCustomUnits(true);
    }
}
