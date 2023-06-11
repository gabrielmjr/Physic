package com.mjr.twaire.code.physic.kinematics.uvm;

import com.mjr.twaire.code.physic.Calculation;
import com.mjr.twaire.code.physic.Physic;

public final class Time3 extends Calculation {
    @Deprecated
	private static Time3 instance;
    private double finalTime;
    private double deltaSpeed;
    private double acceleration;

    private int finalTimeUnit;
    private int deltaSpeedUnit;
    private int accelerationUnit;
    private int unitOfResult;

    private double step1;
    private double step2;
    private boolean hasCustomUnits;

    protected Time3() {}

	protected Time3(double finalTime, 
                    double deltaSpeed, 
                    double acceleration) {
        this.finalTime = finalTime;
        this.deltaSpeed = deltaSpeed;
        this.acceleration = acceleration;
        hasCustomUnits = false;
        calculate();
    }

    protected Time3(double finalTime, 
                    int finalTimeUnit,
                    double deltaSpeed, 
                    int deltaSpeedUnit,
                    double acceleration, 
                    int accelerationUnit,
                    int unitOfResult) {
        this.finalTime = finalTime;
        this.deltaSpeed = deltaSpeed;
        this.acceleration = acceleration;
        this.finalTimeUnit = finalTimeUnit;
        this.deltaSpeedUnit = deltaSpeedUnit;
        this.accelerationUnit = accelerationUnit;
        this.unitOfResult = unitOfResult;
        hasCustomUnits = true;
        calculate();
    }

    @Override
    public Time3 calculate() {
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
        step2 = finalTime - step1;
    }

    @Override
    public double getResult() {
        return step2;
    }
    
    @Override
    public String getSteps() {
        if (hasCustomUnits)
            return null;
        StringBuilder resolution = new StringBuilder();
        String finalTime = (this.finalTime < 0) ? "(" + this.finalTime + "s)" : this.finalTime + "s";
        String deltaSpeed = (this.deltaSpeed < 0) ? "(" + this.deltaSpeed + "m/s)" : this.deltaSpeed + "m/s";
        String acceleration = (this.acceleration < 0) ? "(" + this.acceleration + "m/s²)" : this.acceleration + "m/s²";
        String step1 = (this.step1 < 0) ? "(" + this.step1 + "s)" : this.step1 + "s";
        resolution.append("∆t = " + finalTime + " - " + deltaSpeed + " ÷ " + acceleration);
        resolution.append("∆t = " + finalTime + " - " + step1);
        resolution.append("∆t = " + step2 + "s");
        return resolution.toString();
    }
    
    public Time3 setFinalTime(double finalTime) {
        this.finalTime = finalTime;
        return this;
    }

    public double getFinalTime() {
        return finalTime;
    }

    public Time3 setDeltaSpeed(double deltaSpeed) {
        this.deltaSpeed = deltaSpeed;
        return this;
    }

    public double getDeltaSpeed() {
        return deltaSpeed;
    }

    public Time3 setAcceleration(double acceleration) {
        this.acceleration = acceleration;
        return this;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public Time3 setFinalTimeUnit(int finalTimeUnit) {
        this.finalTimeUnit = finalTimeUnit;
        return this;
    }

    public int getFinalTimeUnit() {
        return finalTimeUnit;
    }

    public Time3 setDeltaSpeedUnit(int deltaSpeedUnit) {
        this.deltaSpeedUnit = deltaSpeedUnit;
        return this;
    }

    public int getDeltaSpeedUnit() {
        return deltaSpeedUnit;
    }

    public Time3 setAccelerationUnit(int accelerationUnit) {
        this.accelerationUnit = accelerationUnit;
        return this;
    }

    public int getAccelerationUnit() {
        return accelerationUnit;
    }

    public Time3 setUnitOfResult(int unitOfResult) {
        this.unitOfResult = unitOfResult;
        return this;
    }

    public int getUnitOfResult() {
        return unitOfResult;
    }
    
    @Override
    public String getFormula() {
        return "ti = t - ∆t ÷ a";
    }
    
    @Deprecated
	protected String time(
		double finalTime,
		double deltaSpeed,
		double acceleration,
		int stepOrResult) {
		double step1 = deltaSpeed / acceleration;
		double step2 = finalTime - step1;
		String res;
		if (stepOrResult == Physic.GET_STEP) {
			res = "ti = "
				+ finalTime
				+ "s - "
				+ deltaSpeed
				+ "m/s ÷ "
				+ acceleration
				+ "m/s²"
				+ "\nti = "
				+ finalTime
				+ "s - "
				+ step1
				+ "s"
				+ "\nti = "
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
    public String time(
		double finalTime,
		String finalTimeUnit,
		double deltaSpeed, 
		String deltaSpeedUnit,
		double acceleration, 
		String accelerationUnit,
		String unitOfResult,
		int stepOrResult) {
		return null;
    }

    @Deprecated
    public static Time3 getInstance() {
		if (instance == null) {
			instance = new Time3();
		}
		return instance;
    }
}
