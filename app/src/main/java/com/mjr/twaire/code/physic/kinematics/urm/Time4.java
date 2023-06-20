package com.mjr.twaire.code.physic.kinematics.urm;

import com.mjr.twaire.code.physic.Calculation;
import com.mjr.twaire.code.physic.units.Unit;

public final class Time4 extends Calculation {
	private static Time4 instance;
    private double deltaTime;
    private double finalTime;
    
    private int deltaTimeUnit;
    private int finalTimeUnit;
    private int unitOfResult;
    
    private double step1;
    private boolean hasCustomUnits;

	private Time4() {}
    
    @Override
    public Time4 calculate() {
        if (hasCustomUnits)
            calculateWithCustomUnits();
        else
            calculateWithoutCustomUnits();
        return this;
    }

    private void calculateWithCustomUnits () {
    }

    private void calculateWithoutCustomUnits () {
        step1 = finalTime - deltaTime;
    }

    @Override
    public Unit getResult () {
        return null; //step1;
	}
    
    @Override
    public String getSteps() {
        if (deltaTime < 0)
            return "ti = " + finalTime + "s - (" + deltaTime + "s)"
                + "\nti = " + step1;
        return "ti = " + finalTime + "s - " + deltaTime + "s"
            + "\nti = " + step1;
    }

    private Time4 setDeltaTime(double deltaTime) {
        this.deltaTime = deltaTime;
        return this;
    }

    public double getDeltaTime() {
        return deltaTime;
    }

    private Time4 setFinalTime(double finalTime) {
        this.finalTime = finalTime;
        return this;
    }

    public double getFinalTime() {
        return finalTime;
    }

    private Time4 setDeltaTimeUnit(int deltaTimeUnit) {
        this.deltaTimeUnit = deltaTimeUnit;
        return this;
    }

    public int getDeltaTimeUnit() {
        return deltaTimeUnit;
    }

    private Time4 setFinalTimeUnit(int finalTimeUnit) {
        this.finalTimeUnit = finalTimeUnit;
        return this;
    }

    public int getFinalTimeUnit() {
        return finalTimeUnit;
    }

    private Time4 setUnitOfResult(int unitOfResult) {
        this.unitOfResult = unitOfResult;
        return this;
    }

    public int getUnitOfResult() {
        return unitOfResult;
    }
     
   @Override
   public String getFormula() {
       return "ti = t - ∆t";
   }
   
    private Time4 setHasCustomUnits (boolean hasCustomUnits) {
        this.hasCustomUnits = hasCustomUnits;
        return this;
    }

    public static Time4 getInstance (double deltaTime, double finalTime) {
		if(!(instance instanceof Time4))
			instance = new Time4();
		return instance.setDeltaTime(deltaTime)
            .setFinalTime(finalTime)
            .setHasCustomUnits(false)
            .calculate();
    }
    
    public static Time4 getInstance (double deltaTime, 
                                     int deltaTimeUnit,
                                     double finalTime,
                                     int finalTimeUnit,
                                     int unitOfResult) {
        if(!(instance instanceof Time4))
            instance = new Time4();
        return instance.setDeltaTime(deltaTime)
            .setDeltaTimeUnit(deltaTimeUnit)
            .setFinalTime(finalTime)
            .setFinalTimeUnit(finalTimeUnit)
            .setUnitOfResult(unitOfResult)
            .setHasCustomUnits(true)
            .calculate();
    }
}
