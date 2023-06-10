package com.mjr.twaire.code.physic.kinematics.vertical_launch.upward;

import static com.mjr.code.tools.NumberAnalyst.putParenthesesIfNegative;

// y = yi - vi * ∆t - (g * ∆t²)/2
public final class Height {
    @Deprecated
    private static Height instance;
    private double initialHeight;
    private double initialVelocity;
    private double deltaTime;
    private double gravity;

    private int initialHeightUnit;
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

    private Height() {}

    @Deprecated
    private Height setHasCustomUnits(boolean hasCustomUnits) {
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
        step5 = step4 + step3;
        step6 = initialHeight - step5;
    }

    public double getResult() {
        return step6;
    }

    public String getSteps() {
        if (hasCustomUnits)
            return null;
        return "y = " + initialHeight + "m - " + initialVelocity + "m/s × " + deltaTime + "s + [" + gravity + "m/s² × (" + deltaTime + "s)² / 2]"
            + "\ny = " + initialHeight + "m - " + initialVelocity + "m/s × " + deltaTime + "s + (" + gravity + "m/s² × " + step1 + "s²) / 2"
            + "\ny = " + initialHeight + "m - " + initialVelocity + "m/s × " + deltaTime + "s + (" + step2 + "m) / 2"
            + "\ny = " + initialHeight + "m - " + initialVelocity + "m/s × " + deltaTime + "s + " + step3 + "m"
            + "\ny = " + initialHeight + "m - " + step4 + "m + " + step3 + "m"
            + "\ny = " + initialHeight + "m - " + step5 + "m"
            + "\ny = " + step6 + "m";
    }

    private Height setInitialHeight(double initialHeight) {
        this.initialHeight = initialHeight;
        return this;
    }

    public double getInitialHeight() {
        return initialHeight;
    }

    private Height setInitialVelocity(double initialVelocity) {
        this.initialVelocity = initialVelocity;
        return this;
    }

    public double getiInitialVelocity() {
        return initialVelocity;
    }

    private Height setDeltaTime(double deltaTime) {
        this.deltaTime = deltaTime;
        return this;
    }

    public double getDeltaTime() {
        return deltaTime;
    }

    private Height setGravity(double gravity) {
        this.gravity = gravity;
        return this;
    }

    public double getGravity() {
        return gravity;
    }

    private Height setInitialHeightUnit(int initialHeightUnit) {
        this.initialHeightUnit = initialHeightUnit;
        return this;
    }

    public int getInitialHeightUnit() {
        return initialHeightUnit;
    }

    private Height setInitialVelocityUnit(int initialVelocityUnit) {
        this.initialVelocityUnit = initialVelocityUnit;
        return this;
    }

    public int getInitialVelocityUnit() {
        return initialVelocityUnit;
    }

    private Height setDeltaTimeUnit(int deltaTimeUnit) {
        this.deltaTimeUnit = deltaTimeUnit;
        return this;
    }

    public int getDeltaTimeUnit() {
        return deltaTimeUnit;
    }

    private Height setGravityUnit(int gravityUnit) {
        this.gravityUnit = gravityUnit;
        return this;
    }

    public int getGravityUnit() {
        return gravityUnit;
    }

    private Height setUnitOfResult(int unitOfResult) {
        this.unitOfResult = unitOfResult;
        return this;
    }

    public int getUnitOfResult() {
        return unitOfResult;
    }

    @Deprecated
    protected static Height getInstance(double initialHeight, 
                                        double initialVelocity, 
                                        double deltaTime,
                                        double gravity) {
        if (!(instance instanceof Height))
            instance = new Height();
        return instance.setInitialHeight(initialHeight)
            .setInitialVelocity(initialVelocity)
            .setDeltaTime(deltaTime)
            .setGravity(gravity)
            .setHasCustomUnits(false);
    }

    @Deprecated
    protected static Height getInstance(double initialHeight, 
                                        int initialHeightUnit,
                                        double initialVelocity,
                                        int initialVelocityUnit,
                                        double deltaTime, 
                                        int deltaTimeUnit,
                                        double gravity,
                                        int gravityUnit,
                                        int unitOfResult) {
        if (!(instance instanceof Height))
            instance = new Height();
        return instance.setInitialHeight(initialHeight)
            .setInitialHeightUnit(initialHeightUnit)
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
