package com.mjrfusion.code.physics.kinematics.urm;

import com.mjrfusion.code.physics.Calculation;
import com.mjrfusion.code.physics.units.Unit;

public class Time1 extends Calculation {
	private static Time1 instance; 
    private double initialTime;
    private double finalTime;
    
    private int initialTimeUnit;
    private int finalTimeUnit;
    private int unitOfResult;
    
    private double step1;
    private boolean hasCustomUnits;

	private Time1() {}
    
    @Override
    public Time1 calculate() {
        if (hasCustomUnits)
            calculateWithCustomUnits();
        else
            calculateWithoutCustomUnits();
        return this;
    }

    private void calculateWithCustomUnits() {
    }

    private void calculateWithoutCustomUnits() {
        step1 = finalTime - initialTime;
    }

    @Override
    public Unit getResult() {
        return null; //step1;
    }
    
    @Override
    public String getSteps() {
        if (initialTime < 0)
            return "∆t = " + finalTime + "s - (" + initialTime + "s)"
                + "\n∆t = " + step1 + "s";
        return "∆t = " + finalTime + "s - " + initialTime + "s"
            + "\n∆t += " + step1 + "s";
    }

	protected String time (double initialTime, double finalTime) {
		return String.valueOf(finalTime - initialTime);
	}

	protected String time (
		) {
		return null;
	}
    
    private Time1 setInitialTime(double initialTime) {
        this.initialTime = initialTime;
        return this;
    }

    public double getInitialTime() {
        return initialTime;
    }

    private Time1 setFinalTime(double finalTime) {
        this.finalTime = finalTime;
        return this;
    }

    public double getFinalTime() {
        return finalTime;
    }

    private Time1 setInitialTimeUnit(int initialTimeUnit) {
        this.initialTimeUnit = initialTimeUnit;
        return this;
    }

    public int getInitialTimeUnit() {
        return initialTimeUnit;
    }

    private Time1 setFinalTimeUnit(int finalTimeUnit) {
        this.finalTimeUnit = finalTimeUnit;
        return this;
    }

    public int getFinalTimeUnit() {
        return finalTimeUnit;
    }

    private Time1 setUnitOfResult(int unitOfResult) {
        this.unitOfResult = unitOfResult;
        return this;
    }

    public int getUnitOfResult() {
        return unitOfResult;
    }
    
    @Override
    public String getFormula() {
        return "∆t = t - ti";
    }
    
    private Time1 setHasCustomUnits(boolean hasCustomUnits) {
        this.hasCustomUnits = hasCustomUnits;
        return this;
    }

    public static Time1 getInstance(double initialTime, double finalTime) {
		if(!(instance instanceof Time1))
			instance = new Time1();
		return instance.setInitialTime(initialTime)
            .setFinalTime(finalTime)
            .setHasCustomUnits(false)
            .calculate();
    }
    
    public static Time1 getInstance(double initialTime,
                                    int initialTimeUnit,
                                    double finalTime,
                                    int finalTimeUnit,
                                    int unitOfResult) {
        if(!(instance instanceof Time1))
            instance = new Time1();
        return instance.setInitialTime(initialTime)
            .setInitialTimeUnit(initialTimeUnit)
            .setFinalTime(finalTime)
            .setFinalTimeUnit(finalTimeUnit)
            .setUnitOfResult(unitOfResult)
            .setHasCustomUnits(true)
            .calculate();
    }
}
