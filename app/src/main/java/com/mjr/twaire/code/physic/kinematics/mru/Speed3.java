package com.mjr.twaire.code.physic.kinematics.mru;

import com.mjr.twaire.code.physic.Calculations;

import static com.mjr.code.tools.NumberAnalyst.putParenthesesIfNegative;

public final class Speed3 extends Calculations {
	private static Speed3 instance; 
    private double initialDisplacement;
    private double finalDisplacement;
    private double deltaTime;

    private int initialDisplacementUnit;
    private int finalDisplacementUnit;
    private int deltaTimeUnit;
    private int unitOfResult;

    private double step1;
    private double step2;
    private boolean hasCustomUnits;

	private Speed3() {}

    private Speed3 setHasCustomUnits(boolean hasCustomUnits) {
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
        step1 = finalDisplacement - initialDisplacement;
	    step2 = step1 / deltaTime;
	}
    
    @Override
    public double getResult() {
        return step2;
	}
  
    @Override
    public String getSteps() {
       String deltaTime = putParenthesesIfNegative(this.deltaTime);
       if (initialDisplacement < 0)
           return "∆v = [" + finalDisplacement + "m - (" + initialDisplacement + "m)] / " + deltaTime + "s"
               + "\n∆v = " + step1 + "m / " + deltaTime + "s"
               + "\n∆v = " + step2 + "m/s";
       return "∆v = (" + finalDisplacement + "m - " + initialDisplacement + "m) / " + deltaTime + "s"
            + "\n∆v = " + step1 +"m / + " + deltaTime + "s"
            + "\n∆v = " + step2 + "m/s";
    }

    private Speed3 setInitialDisplacement(double initialDisplacement) {
        this.initialDisplacement = initialDisplacement;
        return this;
    }

    public double getInitialDisplacement() {
        return initialDisplacement;
    }

    private Speed3 setFinalDisplacement(double finalDisplacement) {
        this.finalDisplacement = finalDisplacement;
        return this;
    }

    public double getFinalDisplacement() {
        return finalDisplacement;
    }

    private Speed3 setDeltaTime(double deltaTime) {
        this.deltaTime = deltaTime;
        return this;
    }

    public double getDeltaTime() {
        return deltaTime;
    }

    private Speed3 setInitialDisplacementUnit(int initialDisplacementUnit) {
        this.initialDisplacementUnit = initialDisplacementUnit;
        return this;
    }

    public int getInitialDisplacementUnit() {
        return initialDisplacementUnit;
    }

    private Speed3 setFinalDisplacementUnit(int finalDisplacementUnit) {
        this.finalDisplacementUnit = finalDisplacementUnit;
        return this;
    }

    public int getFinalDisplacementUnit() {
        return finalDisplacementUnit;
    }

    private Speed3 setDeltaTimeUnit(int deltaTimeUnit) {
        this.deltaTimeUnit = deltaTimeUnit;
        return this;
    }

    public int getDeltaTimeUnit() {
        return deltaTimeUnit;
    }

    private Speed3 setUnitOfResult(int unitOfResult) {
        this.unitOfResult = unitOfResult;
        return this;
    }

    public int getUnitOfResult() {
        return unitOfResult;
    }
    
    @Override
    public String getFormula() {
        return "∆v = (S - Si) / ∆t";
    }

    public static Speed3 getInstance(double initialDisplacement,
                                     double finalDisplacement,
                                     double deltaTime) {
        if (!(instance instanceof Speed3))
            instance = new Speed3();
        return instance.setInitialDisplacement(initialDisplacement)
            .setFinalDisplacement(finalDisplacement)
            .setDeltaTime(deltaTime)
            .setHasCustomUnits(false);
    }
    
    public static Speed3 getInstance(double initialDisplacement,
                                     int initialDisplacementUnit,
                                     double finalDisplacement,
                                     int finalDisplacementUnit,
                                     double deltaTime,
                                     int deltaTimeUnit,
                                     int unitOfResult) {
        if (!(instance instanceof Speed3))
            instance = new Speed3();
        return instance.setInitialDisplacement(initialDisplacement)
            .setInitialDisplacementUnit(initialDisplacementUnit)
            .setFinalDisplacement(finalDisplacement)
            .setFinalDisplacementUnit(finalDisplacementUnit)
            .setDeltaTime(deltaTime)
            .setDeltaTimeUnit(deltaTimeUnit)
            .setUnitOfResult(unitOfResult)
            .setHasCustomUnits(true);
    }
}
