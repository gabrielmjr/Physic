package com.mjr.code.physics.kinematics.vertical_launch.downward;

import com.mjr.code.physics.Calculation;
import com.mjr.code.physics.units.Unit;

public final class DeltaTime2 extends Calculation {
    @Deprecated
    private static DeltaTime2 instance;
    private double initialVelocity;
    private double finalVelocity;
    private double gravity;

    private int initialVelocityUnit;
    private int finalVelocityUnit;
    private int gravityUnit;
    private int unitOfResult;

    private double step1;
    private double step2;
    private boolean hasCustomUnits;

    @Override
    public DeltaTime2 calculate() {
        if (hasCustomUnits)
            calculateWithCustomUnits();
        else
            calculateWithoutCustomUnits();
        return this;
    }

    private void calculateWithCustomUnits() {
    }

    private void calculateWithoutCustomUnits() {
        step1 = finalVelocity - initialVelocity;
        step2 = step1 / gravity;
    }

	@Override
    public Unit getResult() {
        return null; //step2;
    }

	@Override
    public String getSteps() {
        if (hasCustomUnits)
            return null;
        else if (initialVelocity < 0) 
            return "∆t = [" + finalVelocity + "m/s - (" + initialVelocity + "m/s)] ÷ " + gravity + "m/s²"
                + "\n∆t = (" + step1 + "m/s ÷ " + gravity + "m/s²"
                + "\n∆t = " + step2 + "s";
        else
            return "∆t = (" + finalVelocity + "m/s - " + initialVelocity + "m/s) ÷ " + gravity + "m/s²"
                + "\n∆t = (" + step1 + "m/s ÷ " + gravity + "m/s²"
                + "\n∆t = " + step2 + "s";
    }
    
    private DeltaTime2 setInitialVelocity(double initialVelocity) {
        this.initialVelocity = initialVelocity;
        return this;
    }

    public double getInitialVelocity() {
        return initialVelocity;
    }

    private DeltaTime2 setFinalVelocity(double finalVelocity) {
        this.finalVelocity = finalVelocity;
        return this;
    }

    public double getFinalVelocity() {
        return finalVelocity;
    }

    private DeltaTime2 setGravity(double gravity) {
        this.gravity = gravity;
        return this;
    }

    public double getGravity() {
        return gravity;
    }

    private DeltaTime2 setInitialVelocityUnit(int initialVelocityUnit) {
        this.initialVelocityUnit = initialVelocityUnit;
        return this;
    }

    public int getInitialVelocityUnit() {
        return initialVelocityUnit;
    }

    private DeltaTime2 setFinalVelocityUnit(int finalVelocityUnit) {
        this.finalVelocityUnit = finalVelocityUnit;
        return this;
    }

    public int getFinalVelocityUnit() {
        return finalVelocityUnit;
    }

    private DeltaTime2 setGravityUnit(int gravityUnit) {
        this.gravityUnit = gravityUnit;
        return this;
    }

    public int getGravityUnit() {
        return gravityUnit;
    }

    private DeltaTime2 setUnitOfResult(int unitOfResult) {
        this.unitOfResult = unitOfResult;
        return this;
    }

    public int getUnitOfResult() {
        return unitOfResult;
    }
	
	@Override
	public String getFormula() {
		return "∆t = (v - vi) / g";
	}
   
    @Deprecated
    private DeltaTime2 setHasCustomUnits(boolean hasCustomUnits) {
        this.hasCustomUnits = hasCustomUnits;
        return this;
    }

    @Deprecated
    public static DeltaTime2 getInstance(double initialVelocity,
                                         double finalVelocity,
                                         double gravity) {
        if (!(instance instanceof DeltaTime2))
            instance = new DeltaTime2();
        return instance.setInitialVelocity(initialVelocity)
            .setFinalVelocity(finalVelocity)
            .setGravity(gravity)
            .setHasCustomUnits(false)
            .calculate();
    }

    @Deprecated
    public static DeltaTime2 getInstance(double initialVelocity, 
                                         int initialVelocityUnit,
                                         double finalVelocity,
                                         int finalVelocityUnit,
                                         double gravity, 
                                         int gravityUnit,
                                         int unitOfResult) {
        if (!(instance instanceof DeltaTime2))
            instance = new DeltaTime2();
        return instance.setInitialVelocity(initialVelocity)
            .setInitialVelocityUnit(initialVelocityUnit)
            .setFinalVelocity(finalVelocity)
            .setFinalVelocityUnit(finalVelocityUnit)
            .setGravity(gravity)
            .setGravityUnit(gravityUnit)
            .setUnitOfResult(unitOfResult)
            .setHasCustomUnits(true)
            .calculate();
    }
}
