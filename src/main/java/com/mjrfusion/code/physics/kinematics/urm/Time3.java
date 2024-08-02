package com.mjrfusion.code.physics.kinematics.urm;

import com.mjrfusion.code.physics.Calculation;
import com.mjrfusion.code.physics.units.Unit;

public class Time3 extends Calculation {
	private static Time3 instance; 
    private double initialDisplacement;
    private double finalDisplacement;
    private double deltaSpeed;
    
    private int initialDisplacementUnit;
    private int finalDisplacementUnit;
    private int deltaSpeedUnit;
    private int unitOfResult;

    private double step1;
    private double step2;
    private boolean hasCustomUnits;
    
	private Time3() {}
    
    @Override
    public Time3 calculate() {
        if (hasCustomUnits)
            calculateWithCustomUnits();
        else
            calculateWithoutCustomUnits();
        return this;
    }

    private void calculateWithCustomUnits () {
    }

    private void calculateWithoutCustomUnits () {
        step1 = finalDisplacement - initialDisplacement;
        step2 = step1 / deltaSpeed;
    }

    @Override
    public Unit getResult () {
        return null; //step2;
	}
  
    @Override
    public String getSteps() {
        if (initialDisplacement < 0)
            return "∆t = [" + finalDisplacement + "m - (" + initialDisplacement + "m)] / (" + deltaSpeed + "m/s)"
                + "\n∆t = " + step1 + "m / (" + deltaSpeed + "m/s)"
                + "\n∆t = " + step2 + "s";
        return "∆t = (" + finalDisplacement + "m - " + initialDisplacement + "m) / (" + deltaSpeed + "m/s)"
            + "\n∆t = " + step1 + "m / (" + deltaSpeed + "m/s)"
            + "\n∆t = " + step2 + "s";
    }
    
    private Time3 setInitialDisplacement(double initialDisplacement) {
        this.initialDisplacement = initialDisplacement;
        return this;
    }

    public double getInitialDisplacement() {
        return initialDisplacement;
    }

    private Time3 setFinalDisplacement(double finalDisplacement) {
        this.finalDisplacement = finalDisplacement;
        return this;
    }

    public double getFinalDisplacement() {
        return finalDisplacement;
    }

    private Time3 setDeltaSpeed(double deltaSpeed) {
        this.deltaSpeed = deltaSpeed;
        return this;
    }

    public double getDeltaSpeed() {
        return deltaSpeed;
    }

    private Time3 setInitialDisplacementUnit(int initialDisplacementUnit) {
        this.initialDisplacementUnit = initialDisplacementUnit;
        return this;
    }

    public int getInitialDisplacementUnit() {
        return initialDisplacementUnit;
    }

    private Time3 setFinalDisplacementUnit(int finalDisplacementUnit) {
        this.finalDisplacementUnit = finalDisplacementUnit;
        return this;
    }

    public int getFinalDisplacementUnit() {
        return finalDisplacementUnit;
    }

    private Time3 setDeltaSpeedUnit(int deltaSpeedUnit) {
        this.deltaSpeedUnit = deltaSpeedUnit;
        return this;
    }

    public int getDeltaSpeedUnit() {
        return deltaSpeedUnit;
    }

    private Time3 setUnitOfResult(int unitOfResult) {
        this.unitOfResult = unitOfResult;
        return this;
    }

    public int getUnitOfResult() {
        return unitOfResult;
    }
    
    @Override
    public String getFormula() {
        return "∆t = (S - Si) / ∆v";
    }
    
    private Time3 setHasCustomUnits (boolean hasCustomUnits) {
        this.hasCustomUnits = hasCustomUnits;
        return this;
    }
    
    public static Time3 getInstance (double initialDisplacement,
                                     double finalDisplacement,
                                     double deltaSpeed) {
		if(!(instance instanceof Time3))
			instance = new Time3();
		return instance.setInitialDisplacement(initialDisplacement)
            .setFinalDisplacement(finalDisplacement)
            .setDeltaSpeed(deltaSpeed)
            .setHasCustomUnits(false)
            .calculate();
    }
    
    public static Time3 getInstance (double initialDisplacement,
                                     int initialDisplacementUnit,
                                     double finalDisplacement,
                                     int finalDisplacementUnit,
                                     double deltaSpeed,
                                     int deltaSpeedUnit,
                                     int unitOfResult) {
        if(!(instance instanceof Time3))
            instance = new Time3();
        return instance.setInitialDisplacement(initialDisplacement)
            .setInitialDisplacementUnit(initialDisplacementUnit)
            .setFinalDisplacement(finalDisplacement)
            .setFinalDisplacementUnit(finalDisplacementUnit)
            .setDeltaSpeed(deltaSpeed)
            .setDeltaSpeedUnit(deltaSpeedUnit)
            .setUnitOfResult(unitOfResult)
            .setHasCustomUnits(true)
            .calculate();
    }
}
