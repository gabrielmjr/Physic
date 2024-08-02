package com.mjrfusion.code.physics.kinematics.urm;

import com.mjrfusion.code.physics.Calculation;
import com.mjrfusion.code.physics.units.Unit;

import static com.mjr.code.tools.NumberAnalyst.putParenthesesIfNegative;

public final class Speed4 extends Calculation {
	private static Speed4 instance; 
    private double deltaDisplacement;
    private double initialTime;
    private double finalTime;

    private int deltaDisplacementUnit;
    private int initialTimeUnit;
    private int finalTimeUnit;
    private int unitOfResult;

    private double step1;
    private double step2;
    private boolean hasCustomUnits;;

	private Speed4() {}
    
    @Override
    public Speed4 calculate() {
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
		step2 = deltaDisplacement / step1;
    }

    @Override
    public Unit getResult() {
        return null; //step2;
    }

    @Override
    public String getSteps() {
        if (this.initialTime < 0)
            return "∆v = " + deltaDisplacement + "m / [" + finalTime + "s - (" + initialTime + "s)]"
                + "\n∆v = " + deltaDisplacement + "m / " + step1 + "s"
                + "\n∆v = " + step2 + "m/s";
        return "∆v = " + deltaDisplacement + "m / (" + finalTime + "s - " + initialTime + "s)"
            + "\n∆v = " + deltaDisplacement + "m / " + step1 + "s"
            + "\n∆v = " + step2 + "m/s"; 
    }

    private Speed4 setDeltaDisplacement(double deltaDisplacement) {
        this.deltaDisplacement = deltaDisplacement;
        return this;
    }

    public double getDeltaDisplacement() {
        return deltaDisplacement;
    }

    private Speed4 setInitialTime(double initialTime) {
        this.initialTime = initialTime;
        return this;
    }

    public double getInitialTime() {
        return initialTime;
    }

    private Speed4 setFinalTime(double finalTime) {
        this.finalTime = finalTime;
        return this;
    }

    public double getFinalTime() {
        return finalTime;
    }

    private Speed4 setDeltaDisplacementUnit(int deltaDisplacementUnit) {
        this.deltaDisplacementUnit = deltaDisplacementUnit;
        return this;
    }

    public int getDeltaDisplacementUnit() {
        return deltaDisplacementUnit;
    }

    private Speed4 setInitialTimeUnit(int initialTimeUnit) {
        this.initialTimeUnit = initialTimeUnit;
        return this;
    }

    public int getInitialTimeUnit() {
        return initialTimeUnit;
    }

    private Speed4 setFinalTimeUnit(int finalTimeUnit) {
        this.finalTimeUnit = finalTimeUnit;
        return this;
    }

    public int getFinalTimeUnit() {
        return finalTimeUnit;
    }

    private Speed4 setUnitOfResult(int unitOfResult) {
        this.unitOfResult = unitOfResult;
        return this;
    }

    public int getUnitOfResult() {
        return unitOfResult;
    }
    
    @Override
    public String getFormula() {
        return "v = ∆S ÷ (t - ti)";
    }
    
    private Speed4 setHasCustomUnits(boolean hasCustomUnits) {
        this.hasCustomUnits = hasCustomUnits;
        return this;
    }

    public static Speed4 getInstance(double deltaDisplacement,
                                     double initialTime,
                                     double finalTime) {
		if (!(instance instanceof Speed4))
			instance = new Speed4();
		return instance.setDeltaDisplacement(deltaDisplacement)
            .setInitialTime(initialTime)
            .setFinalTime(finalTime)
            .setHasCustomUnits(false)
            .calculate();
    }

    public static Speed4 getInstance(double deltaDisplacement,
                                     int deltaDisplacementUnit,
                                     double initialTime,
                                     int initialTimeUnit,
                                     double finalTime,
                                     int finalTimeUnit,
                                     int unitOfResult) {
        if (!(instance instanceof Speed4))
            instance = new Speed4();
        return instance.setDeltaDisplacement(deltaDisplacement)
            .setDeltaDisplacementUnit(deltaDisplacementUnit)
            .setInitialTime(initialTime)
            .setInitialTimeUnit(initialTimeUnit)
            .setFinalTime(finalTime)
            .setFinalTimeUnit(finalTimeUnit)
            .setUnitOfResult(unitOfResult)
            .setHasCustomUnits(true)
            .calculate();
    }
}
