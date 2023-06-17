package com.mjr.twaire.code.physic.kinematics.uvm;

import com.mjr.twaire.code.physic.Calculation;
import com.mjr.twaire.code.physic.Physic;
import java.math.BigDecimal;

public final class Time2 extends Calculation {
    @Deprecated
	private static Time2 instance; 
    private double initialVelocity;
    private double finalVelocity;
    private double acceleration;

    private int initialVelocityUnit;
    private int finalVelocityUnit;
    private int accelerationUnit;
    private int unitOfResult;

    private double step1;
    private double step2;
    private boolean hasCustomUnits;

    protected Time2() {}

    protected Time2(double initialVelocity, 
                    double finalVelocity,
                    double acceleration) {
        this.initialVelocity = initialVelocity;
        this.finalVelocity = finalVelocity;
        this.acceleration = acceleration; 
        hasCustomUnits = false;
        calculate();
    }

    protected Time2(double initialVelocity, 
                    int initialVelocityUnit,
                    double finalVelocity, 
                    int finalVelocityUnit,
                    double acceleration,
                    int accelerationUnit,
                    int unitOfResult) {
        this.initialVelocity = initialVelocity;
        this.finalVelocity = finalVelocity;
        this.acceleration = acceleration;
        this.initialVelocityUnit = initialVelocityUnit;
        this.finalVelocityUnit = finalVelocityUnit;
        this.accelerationUnit = accelerationUnit;
        this.unitOfResult = unitOfResult;
        hasCustomUnits = true;
        calculate();
    }
    
    @Override
    public Time2 calculate() {
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
        step2 = step1 / acceleration;
    }
    
    @Override
    public BigDecimal getResult() {
        return null; //step2;
    }
    
    @Override
    public String getSteps() {
        if (hasCustomUnits)
            return null;
        StringBuilder resolution=  new StringBuilder();
        String initialVelocity = "(" + this.initialVelocity + "m/s)";
        String finalVelocity = (this.finalVelocity < 0) ? "(" + this.finalVelocity + "m/s)" : this.finalVelocity + "m/s";
        String acceleration = (this.acceleration < 0) ? "(" + this.acceleration + "m/s²)" : this.acceleration + "m/s²";
        String step1 = (this.step1 < 0) ? "(" + this.step1 + "m/s)" : this.step1 + "m/s";
        resolution.append("∆t = [" + finalVelocity + " - " + initialVelocity + "] ÷ " + acceleration);
        resolution.append("∆t = " + step1 + " ÷ " + acceleration);
        resolution.append("∆t = " + step2 + "s");
        return resolution.toString();
    }
    
    public Time2 setInitialVelocity(double initialVelocity) {
        this.initialVelocity = initialVelocity;
        return this;
    }

    public double getInitialVelocity() {
        return initialVelocity;
    }

    public Time2 setFinalVelocity(double finalVelocity) {
        this.finalVelocity = finalVelocity;
        return this;
    }

    public double getFinalVelocity() {
        return finalVelocity;
    }

    public Time2 setAcceleration(double acceleration) {
        this.acceleration = acceleration;
        return this;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public Time2 setInitialVelocityUnit(int initialVelocityUnit) {
        this.initialVelocityUnit = initialVelocityUnit;
        return this;
    }

    public int getInitialVelocityUnit() {
        return initialVelocityUnit;
    }

    public Time2 setFinalVelocityUnit(int finalVelocityUnit) {
        this.finalVelocityUnit = finalVelocityUnit;
        return this;
    }

    public int getFinalVelocityUnit() {
        return finalVelocityUnit;
    }

    public Time2 setAccelerationUnit(int accelerationUnit) {
        this.accelerationUnit = accelerationUnit;
        return this;
    }

    public int getAccelerationUnit() {
        return accelerationUnit;
    }

    public Time2 setUnitOfResult(int unitOfResult) {
        this.unitOfResult = unitOfResult;
        return this;
    }

    public int getUnitOfResult() {
        return unitOfResult;
    }
    
    @Override
    public String getFormula() {
        return "∆t = (v - vi) ÷ a";
    }

    @Deprecated
    //∆t = (v - vi) / a
	protected String time(
		double initialVelocity, 
		double finalVelocity, 
		double acceleration, 
		int stepOrResult) {
		double step1 = finalVelocity - initialVelocity;
		double step2 = step1 / acceleration;
		String res;
		if (stepOrResult == Physic.GET_STEP) {
            res = "∆t = ("
                + finalVelocity
                + "m/s - "
                + initialVelocity
                + "m/s) ÷ "
                + acceleration
                + "m/s²"
                + "\n∆t = "
                + step1
                + "m/s ÷ "
                + acceleration
                + "m/s²"
                + "\n∆t = "
                + step2
                + "s";
            return res;
		} else if (stepOrResult == Physic.GET_RESULT) {
            return String.valueOf(step2);
		} else {
            return "Error 404: fourth parameter not found.";
		}
	}

    @Deprecated
	protected String time(
		double initialVelocity,
		String initialVelocityUnit,
		double finalVelocity,
		String finalVelocityUnit,
		double acceleration,
		String accelerationUnit,
		String unitOfResult,
		int stepOrResult) {
		return null;
	}

    @Deprecated
    public static Time2 getInstance() {
		if (instance == null) {
			instance = new Time2();
		}
		return instance;
    }
}
