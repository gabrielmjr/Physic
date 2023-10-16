package com.mjr.code.physics.kinematics.urm;

import com.mjr.code.physics.Calculation;
import com.mjr.code.physics.units.Unit;

public final class Time5 extends Calculation {
	private static Time5 instance;
    private double initialTime;
    private double deltaTime;
    
    private int initialTimeUnit;
    private int deltaTimeUnit;
    private int unitOfResult;

    private double step1;
    private boolean hasCustomUnits;
    
	private Time5() {}
    
    @Override
    public Time5 calculate() {
        if (hasCustomUnits)
            calculateWithCustomUnits();
        else
            calculateWithoutCustomUnits();
        return this;
    }

    private void calculateWithCustomUnits () {
    }

    private void calculateWithoutCustomUnits () {
        step1 = deltaTime + initialTime;
    }

    @Override
    public Unit getResult () {
        return null; //step1;
	}
    
    @Override
    public String getSteps() {
        if (initialTime < 0)
            return "t = " + deltaTime + "s - (" + initialTime + "s)" 
                + "\nt = " + step1 + "s";
        return "t = " + deltaTime + "s - " + initialTime + "s" 
            + "\nt = " + step1 + "s";
    }

    private Time5 setInitialTime(double initialTime) {
        this.initialTime = initialTime;
        return this;
    }

    public double getInitialTime() {
        return initialTime;
    }

    private Time5 setDeltaTime(double deltaTime) {
        this.deltaTime = deltaTime;
        return this;
    }

    public double getDeltaTime() {
        return deltaTime;
    }

    private Time5 setInitialTimeUnit(int initialTimeUnit) {
        this.initialTimeUnit = initialTimeUnit;
        return this;
    }

    public int getInitialTimeUnit() {
        return initialTimeUnit;
    }

    private Time5 setDeltaTimeUnit(int deltaTimeUnit) {
        this.deltaTimeUnit = deltaTimeUnit;
        return this;
    }

    public int getDeltaTimeUnit() {
        return deltaTimeUnit;
    }

    private Time5 setUnitOfResult(int unitOfResult) {
        this.unitOfResult = unitOfResult;
        return this;
    }

    public int getUnitOfResult() {
        return unitOfResult;
    }
    
    @Override
    public String getFormula() {
        return "t = ∆t + ti";
    }

    private Time5 setHasCustomUnits (boolean hasCustomUnits) {
        this.hasCustomUnits = hasCustomUnits;
        return this;
    }
    
    public static Time5 getInstance (double initialTime, double deltaTime) {
		if(!(instance instanceof Time5))
			instance = new Time5();
		return instance.setInitialTime(initialTime)
            .setDeltaTime(deltaTime)
            .setHasCustomUnits(false)
            .calculate();
    }
    
    public static Time5 getInstance (double initialTime, 
                                     int initialTimeUnit,
                                     double deltaTime,
                                     int deltaTimeUnit,
                                     int unitOfResult) {
        if(!(instance instanceof Time5))
            instance = new Time5();
        return instance.setInitialTime(initialTime)
            .setInitialTimeUnit(initialTimeUnit)
            .setDeltaTime(deltaTime)
            .setDeltaTimeUnit(deltaTimeUnit)
            .setUnitOfResult(unitOfResult)
            .setHasCustomUnits(true)
            .calculate();
    }
}
