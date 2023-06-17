package com.mjr.twaire.code.physic.kinematics.uvm;

import com.mjr.twaire.code.physic.Calculation;
import com.mjr.twaire.code.physic.Physic;
import java.math.BigDecimal;

public final class Time4 extends Calculation {
    @Deprecated
	private static Time4 instance; 
    private double initialTime;
    private double deltaSpeed;
    private double acceleration;

    private int initialTimeUnit;
    private int deltaSpeedUnit;
    private int accelerationUnit;
    private int unitOfResult;

    private double step1;
    private double step2;
    private boolean hasCustomUnits;

    protected Time4() {}

    protected Time4(double initialTime, 
                    double deltaSpeed, 
                    double acceleration) {
        this.initialTime = initialTime;
        this.deltaSpeed = deltaSpeed;
        this.acceleration = acceleration;
        hasCustomUnits = false;
        calculate();
    }

    protected Time4(double initialTime, 
                    int initialTimeUnit,
                    double deltaSpeed, 
                    int deltaSpeedUnit,
                    double acceleration,
                    int accelerationUnit,
                    int unitOfResult) {
        this.initialTime = initialTime;
        this.deltaSpeed = deltaSpeed;
        this.acceleration = acceleration;
        this.initialTimeUnit = initialTimeUnit;
        this.deltaSpeedUnit = deltaSpeedUnit;
        this.accelerationUnit = accelerationUnit;
        this.unitOfResult = unitOfResult;
        hasCustomUnits = true;
        calculate();
    }
    
    @Override
    public Time4 calculate() {
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
        step2 = step1 + initialTime;
    }
    
    @Override
    public BigDecimal getResult() {
        return null; //step2;
    }
    
    @Override
    public String getSteps() {
        if (hasCustomUnits)
            return null;
        StringBuilder resolution = new StringBuilder();
        String initialTime = (this.initialTime < 0) ? "(" + this.initialTime + "s)" : this.initialTime + "s";
        String deltaSpeed = (this.deltaSpeed < 0) ? "(" + this.deltaSpeed + "m/s)" : this.deltaSpeed + "m/s";
        String acceleration = (this.acceleration < 0) ? "(" + this.acceleration + "m/s²)" : this.acceleration + "m/s²";
        String step1 = (this.step1 < 0) ? "(" + this.step1 + "s)" : this.step1 + "s";
        resolution.append("ti = " + initialTime + " + " + deltaSpeed + " ÷ " + acceleration);
        resolution.append("ti = " + initialTime + " + " + step1);
        resolution.append("ti = " + step2 + "s");
        return resolution.toString();
    }
    
    public Time4 setInitialTime(double initialTime) {
        this.initialTime = initialTime;
        return this;
    }

    public double getInitialTime() {
        return initialTime;
    }

    public Time4 setDeltaSpeed(double deltaSpeed) {
        this.deltaSpeed = deltaSpeed;
        return this;
    }

    public double getDeltaSpeed() {
        return deltaSpeed;
    }

    public Time4 setAcceleration(double acceleration) {
        this.acceleration = acceleration;
        return this;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public Time4 setInitialTimeUnit(int initialTimeUnit) {
        this.initialTimeUnit = initialTimeUnit;
        return this;
    }

    public int getInitialTimeUnit() {
        return initialTimeUnit;
    }

    public Time4 setDeltaSpeedUnit(int deltaSpeedUnit) {
        this.deltaSpeedUnit = deltaSpeedUnit;
        return this;
    }

    public int getDeltaSpeedUnit() {
        return deltaSpeedUnit;
    }

    public Time4 setAccelerationUnit(int accelerationUnit) {
        this.accelerationUnit = accelerationUnit;
        return this;
    }

    public int getAccelerationUnit() {
        return accelerationUnit;
    }

    public Time4 setUnitOfResult(int unitOfResult) {
        this.unitOfResult = unitOfResult;
        return this;
    }

    public int getUnitOfResult() {
        return unitOfResult;
    }
    
    @Override
    public String getFormula() {
        return "t = t + ∆v ÷ a";
    }

    @Deprecated
    // t = ti + ∆v ÷ a
	protected String time(
		double initialTime, 
		double deltaSpeed, 
		double acceleration, 
		int stepOrResult) {
		double step1 = deltaSpeed / acceleration;
		double step2 = step1 + initialTime;
		String res;
	    if (stepOrResult == Physic.GET_STEP) {
			res = "tf = "
				+ initialTime
				+ "s + ("
				+ deltaSpeed
				+ "m/s ÷ "
				+ acceleration
				+ "m/s²)"
				+ "\ntf = "
				+ initialTime
				+ "s + "
				+ step1
				+ "s"
				+ "\ntf = "
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
	protected  String time(
		double initialTime, 
		String initialTimeUnit,
		double deltaSpeed, 
		String deltaSpeedUnit,
		double acceleration,
		String accelerationUnit,
		String unitOfResult,
		int stepOrResult) {
		return null;
    }

    @Deprecated
    public static Time4 getInstance() {
		if (instance == null) {
			instance = new Time4();
		}
		return instance;
    }
}
