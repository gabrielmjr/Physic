package com.mjrfusion.code.physics.kinematics.uvm;

import com.mjrfusion.code.physics.Calculation;
import com.mjrfusion.code.physics.units.Unit;

public class Time1 extends Calculation {
    @Deprecated
	private static Time1 instance; 
    private double deltaSpeed;
    private double acceleration;

    private int deltaSpeedUnit;
    private int accelerationUnit;
    private int unitOfResult;

    private double step1;
    private boolean hasCustomUnits;

    protected Time1() {}

    protected Time1(double deltaSpeed, double acceleration) {
        this.deltaSpeed = deltaSpeed;
        this.acceleration = acceleration;
        hasCustomUnits = false;
        calculate();
    }

    protected Time1(double deltaSpeed,
                    int deltaSpeedUnit, 
                    double acceleration,
                    int accelerationUnit,
                    int unitOfResult) {
        this.deltaSpeed = deltaSpeed;
        this.acceleration = acceleration;
        this.deltaSpeedUnit = deltaSpeedUnit;
        this.accelerationUnit = accelerationUnit;
        this.unitOfResult = unitOfResult;
        hasCustomUnits = true;
        calculate();
    }

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
        step1 = deltaSpeed / acceleration;
    }

    @Override
    public Unit getResult() {
        return null; //step1;
    }

    @Override
    public String getSteps() {
        if (hasCustomUnits)
            return null;
        StringBuilder resolution = new StringBuilder();
        String deltaSpeed = (this.deltaSpeed < 0) ? "(" + this.deltaSpeed + "m/s)" : this.deltaSpeed + "m/s";
        String acceleration = (this.acceleration < 0) ? "(" + this.acceleration + "m/s²)" : this.acceleration + "m/s²";
        resolution.append("∆t=  " + deltaSpeed + " ÷ " + acceleration);
        resolution.append("t = " + step1 + "s");
        return resolution.toString();
    }

    public Time1 setDeltaSpeed(double deltaSpeed) {
        this.deltaSpeed = deltaSpeed;
        return this;
    }

    public double getDeltaSpeed() {
        return deltaSpeed;
    }

    public Time1 setAcceleration(double acceleration) {
        this.acceleration = acceleration;
        return this;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public Time1 setDeltaSpeedUnit(int deltaSpeedUnit) {
        this.deltaSpeedUnit = deltaSpeedUnit;
        return this;
    }

    public int getDeltaSpeedUnit() {
        return deltaSpeedUnit;
    }

    public Time1 setAccelerationUnit(int accelerationUnit) {
        this.accelerationUnit = accelerationUnit;
        return this;
    }

    public int getAccelerationUnit() {
        return accelerationUnit;
    }

    public Time1 setUnitOfResult(int unitOfResult) {
        this.unitOfResult = unitOfResult;
        return this;
    }

    public int getUnitOfResult() {
        return unitOfResult;
    }

    @Override
    public String getFormula() {
        return "∆t = ∆v ÷ a";
    }

	@Deprecated
	protected String time(
		double deltaSpeed, 
		double acceleration) {
		return String.valueOf(deltaSpeed / acceleration);
    }

    @Deprecated
    protected String time(
		double deltaSpeed,
		String deltaSpeedUnit, 
		double acceleration,
		String accelerationUnit,
		String unitOfResult) {
	    return null;
    }

    @Deprecated
    public static Time1 getInstance() {
		if (instance == null) {
			instance = new Time1();
		}
		return instance;
    }
}
