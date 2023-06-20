package com.mjr.twaire.code.physic.kinematics.uvm;

import com.mjr.twaire.code.physic.Calculation;
import com.mjr.twaire.code.physic.units.Unit;

public final class Speed1 extends Calculation {
    @Deprecated
	private static Speed1 instance; 
    private double deltaTime;
    private double acceleration;

    private int deltaTimeUnit;
    private int accelerationUnit;
    private int unitOfResult;
    
    private double step1;
    private boolean hasCustomUnits;

    protected Speed1() {}

    protected Speed1(double deltaTime,
                     int deltaTimeUnit,
                     double acceleration,
                     int accelerationUnit,
                     int unitOfResult) {
        this.deltaTime = deltaTime;
        this.acceleration = acceleration;
        this.deltaTimeUnit = deltaTimeUnit;
        this.accelerationUnit = accelerationUnit;
        this.unitOfResult = unitOfResult;
        hasCustomUnits = true;
        calculate();
    }

	protected Speed1(double deltaTime, double acceleration) {
        this.deltaTime = deltaTime;
        this.acceleration = acceleration;
        hasCustomUnits = false;
        calculate();
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
        String acceleration = (this.acceleration < 0) ? "(" + this.acceleration + "m/s²)" : this.acceleration + "m/s²";
        String deltaTime = (this.deltaTime < 0) ? "(" + this.deltaTime + "s)" : this.deltaTime + "s";
        resolution.append("∆v = " + acceleration + deltaTime);
        resolution.append(step1 + "m/s");
        return resolution.toString();
    }
    
    @Override
    public String getFormula() {
        return "∆v = a × ∆t";
    }
    
    public Speed1 setDeltaTime(double deltaTime) {
        this.deltaTime = deltaTime;
        return this;
    }

    public double getDeltaTime() {
        return deltaTime;
    }

    public Speed1 setAcceleration(double acceleration) {
        this.acceleration = acceleration;
        return this;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public Speed1 setDeltaTimeUnit(int deltaTimeUnit) {
        this.deltaTimeUnit = deltaTimeUnit;
        return this;
    }

    public int getDeltaTimeUnit() {
        return deltaTimeUnit;
    }

    public Speed1 setAccelerationUnit(int accelerationUnit) {
        this.accelerationUnit = accelerationUnit;
        return this;
    }

    public int getAccelerationUnit() {
        return accelerationUnit;
    }

    @Override
    public Speed1 calculate() {
        if (hasCustomUnits)
            calculateWithCustomUnits();
        else
            calculateWithoutCustomUnits();
        return this;
    }

    private void calculateWithCustomUnits() {
    }

    private void calculateWithoutCustomUnits() {
        step1 = deltaTime * acceleration;
    }

    @Deprecated
    protected String speed(double deltaTime, double acceleration) {
		return String.valueOf(deltaTime * acceleration);
    }

    @Deprecated
    public String speed(
		double deltaTime,
		String deltaTimeUnit,
		double acceleration,
		String accelerationUnit,
		String unitOfResult) {
		return null;
    }

    @Deprecated
    public static Speed1 getInstance() {
		if (instance == null) {
			instance = new Speed1();
		}
		return instance;
    }
}
