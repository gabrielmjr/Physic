package com.mjr.twaire.code.physic.kinematics.muv;

import com.mjr.twaire.code.physic.Calculation;
import com.mjr.twaire.code.physic.Physic;

public final class Speed2 extends Calculation {
    @Deprecated
	private static Speed2 instance; 
    private double initialTime;
    private double finalTime;
    private double acceleration;

    private int initialTimeUnit;
    private int finalTimeUnit;
    private int accelerationUnit;
    private int unitOfResult;

    private double step1;
    private double step2;
    private boolean hasCustomUnits;
    
    protected Speed2() {}

    protected Speed2(double initialTime,
                     double finalTime, 
                     double acceleration) {
        this.initialTime = initialTime;
        this.finalTime = finalTime;
        this.acceleration = acceleration;
        hasCustomUnits = false;
        calculate();
    }
    
	protected Speed2(double initialTime,
                     int initialTimeUnit,
                     double finalTime, 
                     int finalTimeUnit,
                     double acceleration,
                     int accelerationUnit,
                     int unitOfResult) {
        this.initialTime = initialTime;
        this.finalTime = finalTime;
        this.acceleration = acceleration;
        this.initialTimeUnit = initialTimeUnit;
        this.finalTimeUnit = finalTimeUnit;
        this.accelerationUnit = accelerationUnit;
        this.unitOfResult = unitOfResult;
        hasCustomUnits = true;
        calculate();
    }

    @Override
    public Speed2 calculate() {
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
        step2 = step1 * acceleration;
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
        String initialTime = "(" + this.initialTime + "s)";
        String acceleration = (this.acceleration < 0) ? "(" + this.acceleration + "m/s²)" : this.acceleration + "m/s²";
        String step1 = (this.step1 < 0) ? "(" + this.step1 + "s)" : this.step1 + "s";
        resolution.append("∆v = [" + finalTime + "s - " + initialTime +"] × " + acceleration);
        resolution.append("∆v = " + step1 + " × " + acceleration);
        resolution.append("∆v = " + step2 + "m/s");
        return resolution.toString();
    }
    
    @Override
    public String getFormula() {
        return "∆v = (t - ti) × a";
    }
    
    public Speed2 setInitialTime(double initialTime) {
        this.initialTime = initialTime;
        return this;
    }

    public double getInitialTime() {
        return initialTime;
    }

    public Speed2 setFinalTime(double finalTime) {
        this.finalTime = finalTime;
        return this;
    }

    public double getFinalTime() {
        return finalTime;
    }

    public Speed2 setAcceleration(double acceleration) {
        this.acceleration = acceleration;
        return this;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public Speed2 setInitialTimeUnit(int initialTimeUnit) {
        this.initialTimeUnit = initialTimeUnit;
        return this;
    }

    public int getInitialTimeUnit() {
        return initialTimeUnit;
    }

    public Speed2 setFinalTimeUnit(int finalTimeUnit) {
        this.finalTimeUnit = finalTimeUnit;
        return this;
    }

    public int getFinalTimeUnit() {
        return finalTimeUnit;
    }

    public Speed2 setAccelerationUnit(int accelerationUnit) {
        this.accelerationUnit = accelerationUnit;
        return this;
    }

    public int getAccelerationUnit() {
        return accelerationUnit;
    }

    public Speed2 setUnitOfResult(int unitOfResult) {
        this.unitOfResult = unitOfResult;
        return this;
    }

    public int getUnitOfResult() {
        return unitOfResult;
    }
    
    @Deprecated
	protected String speed(
		double initialTime,
		double finalTime, 
		double acceleration,
		int stepOrResult) {
        double step1 = finalTime - initialTime;
        double step2 = step1 * acceleration;
        String res;
        if (stepOrResult == Physic.GET_STEP) {
			res = "∆v = ("
				+ finalTime
				+ "s - "
				+ initialTime
				+ "s) × ("
				+ acceleration
				+ "m/s²)"
				+ "\n∆v = "
				+ step1
				+ "s × ("
				+ acceleration
				+ "m/s²)"
				+ "\n∆v = "
				+ step2
				+ "m/s";
			return res;
        } else if (stepOrResult == Physic.GET_RESULT) {
			return String.valueOf(step2);
        } else {
			return "Error 404: fourth parameter not found.";
        }
	}

    @Deprecated
	protected String speed(
		double initialTime,
		String initialTimeUnit,
		double finalTime, 
		String finalTimeUnit,
		double acceleration,
		String accelerationUnit,
		String unitOfResult,
		int stepOrResult) {
        return null;
	}

    @Deprecated
    public static Speed2 getInstance() {
		if (instance == null) {
			instance = new Speed2();
		}
		return instance;
    }
}
