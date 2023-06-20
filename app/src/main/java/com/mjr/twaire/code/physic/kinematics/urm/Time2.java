package com.mjr.twaire.code.physic.kinematics.urm;

import com.mjr.twaire.code.physic.Calculation;
import com.mjr.twaire.code.physic.units.Unit;

public final class Time2 extends Calculation {
	private static Time2 instance; 
    private double deltaDisplacement;
    private double deltaSpeed;
    
    private int deltaDisplacementUnit;
    private int deltaSpeedUnit;
    private int unitOfResult;
    
    private double step1;
    private boolean hasCustomUnits;

	private Time2() {}
    
    @Override
    public Time2 calculate() {
        if (hasCustomUnits)
            calculateWithCustomUnits();
        else
            calculateWithoutCustomUnits();
        return this;
    }
    
    private void calculateWithCustomUnits () {
    }

    private void calculateWithoutCustomUnits () {
        step1 = deltaDisplacement / deltaSpeed;
    }
    
    @Override
    public Unit getResult () {
        return null; //step1;
	}
    
    @Override
    public String getSteps() {
        if (deltaSpeed < 0)
            return "∆t = " + deltaDisplacement + "m / (" + deltaSpeed + "m/s)"
                + "\n∆t = " + step1 + "s";
        return "∆t = " + deltaDisplacement + "m /" + deltaSpeed + "m/s"
            + "\n∆t = " + step1 + "s";
    }
    
    private Time2 setDeltaDisplacement(double deltaDisplacement) {
        this.deltaDisplacement = deltaDisplacement;
        return this;
    }

    public double getDeltaDisplacement() {
        return deltaDisplacement;
    }

    private Time2 setDeltaSpeed(double deltaSpeed) {
        this.deltaSpeed = deltaSpeed;
        return this;
    }

    public double getDeltaSpeed() {
        return deltaSpeed;
    }

    private Time2 setDeltaDisplacementUnit(int deltaDisplacementUnit) {
        this.deltaDisplacementUnit = deltaDisplacementUnit;
        return this;
    }

    public int getDeltaDisplacementUnit() {
        return deltaDisplacementUnit;
    }

    private Time2 setDeltaSpeedUnit(int deltaSpeedUnit) {
        this.deltaSpeedUnit = deltaSpeedUnit;
        return this;
    }

    public int getDeltaSpeedUnit() {
        return deltaSpeedUnit;
    }

    private Time2 setUnitOfResult(int unitOfResult) {
        this.unitOfResult = unitOfResult;
        return this;
    }

    public int getUnitOfResult() {
        return unitOfResult;
    }

    
    @Override
    public String getFormula() {
        return "∆t = ∆S / ∆v";
    }

    public static Time2 getInstance(double deltaDisplacement, double deltaSpeed) {
		if(!(instance instanceof Time2))
			instance = new Time2();
		return instance.setDeltaDisplacement(deltaDisplacement)
            .setDeltaSpeed(deltaSpeed)
            .setHasCustomUnits(false)
            .calculate();
    }
    
    private Time2 setHasCustomUnits (boolean hasCustomUnits) {
        this.hasCustomUnits = hasCustomUnits;
        return this;
    }
    
    public static Time2 getInstance(double deltaDisplacement, 
                                    int deltaDisplacementUnit,
                                    double deltaSpeed,
                                    int deltaSpeedUnit,
                                    int unitOfResult) {
        if(!(instance instanceof Time2))
            instance = new Time2();
        return instance.setDeltaDisplacement(deltaDisplacement)
            .setDeltaDisplacementUnit(deltaDisplacementUnit)
            .setDeltaSpeed(deltaSpeed)
            .setDeltaSpeedUnit(deltaSpeedUnit)
            .setUnitOfResult(unitOfResult)
            .setHasCustomUnits(true)
            .calculate();
    }
}
