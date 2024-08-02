package com.mjrfusion.code.physics.kinematics.urm;

import com.mjrfusion.code.physics.Calculation;
import com.mjrfusion.code.physics.units.Unit;

import static com.mjr.code.tools.NumberAnalyst.putParenthesesIfNegative;

public class Speed3 extends Calculation {
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
    
    @Override
    public Speed3 calculate() {
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
    public Unit getResult() {
        return null; //step2;
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

    private Speed3 setHasCustomUnits(boolean hasCustomUnits) {
        this.hasCustomUnits = hasCustomUnits;
        return this;
    }
    
    public static Speed3 getInstance(double initialDisplacement,
                                     double finalDisplacement,
                                     double deltaTime) {
        if (!(instance instanceof Speed3))
            instance = new Speed3();
        return instance.setInitialDisplacement(initialDisplacement)
            .setFinalDisplacement(finalDisplacement)
            .setDeltaTime(deltaTime)
            .setHasCustomUnits(false)
            .calculate();
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
            .setHasCustomUnits(true)
            .calculate();
    }
}
