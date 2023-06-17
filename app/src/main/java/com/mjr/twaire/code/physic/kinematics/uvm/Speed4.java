package com.mjr.twaire.code.physic.kinematics.uvm;

import com.mjr.twaire.code.physic.Calculation;
import com.mjr.twaire.code.physic.Physic;
import java.math.BigDecimal;

public final class Speed4 extends Calculation {
    @Deprecated
	private static Speed4 instance;
    private double initialVelocity;
    private double deltaTime;
    private double acceleration;

    private int initialVelocityUnit;
    private int deltaTimeUnit;
    private int accelerationUnit;
    private int unitOfResult;

    private double step1;
    private double step2;
    private boolean hasCustomUnits;

    protected Speed4() {}

	protected Speed4(double initialVelocity,
                     double deltaTime,
                     double acceleration) {
        this.initialVelocity = initialVelocity;
        this.deltaTime = deltaTime;
        this.acceleration = acceleration;
        hasCustomUnits = false;
        calculate();
    }

    protected Speed4(double initialVelocity, 
                     int initialVelocityUnit,
                     double deltaTime, 
                     int deltaTimeUnit,
                     double acceleration, 
                     int accelerationUnit,
                     int unitOfResult) {
        this.initialVelocity = initialVelocity;
        this.deltaTime = deltaTime;
        this.acceleration = acceleration;
        this.initialVelocityUnit = initialVelocityUnit;
        this.deltaTimeUnit = deltaTimeUnit;
        this.accelerationUnit = accelerationUnit;
        this.unitOfResult = unitOfResult;
        hasCustomUnits = true;
        calculate();
    }
    
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
        step1 = deltaTime * acceleration;
        step2 = step1 + initialVelocity;
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
        String initialVelocity = (this.initialVelocity < 0) ? "(" + this.initialVelocity + "m/s)" : this.initialVelocity + "m/s";
        String deltaTime = (this.deltaTime < 0) ? "(" + this.deltaTime + "s)" : this.deltaTime + "s";
        String step1 = (this.step1 < 0) ? "(" + this.step1 + "m/s)" : this.step1 + "m/s";
        resolution.append("v = " + initialVelocity + " + " + acceleration + " × " + deltaTime);
        resolution.append("v = " + initialVelocity + " + " + step1);
        resolution.append("v = " + step2 + "m/s");
        return resolution.toString();
    }
    
    public Speed4 setInitialVelocity(double initialVelocity) {
        this.initialVelocity = initialVelocity;
        return this;
    }

    public double getInitialVelocity() {
        return initialVelocity;
    }

    public Speed4 setDeltaTime(double deltaTime) {
        this.deltaTime = deltaTime;
        return this;
    }

    public double getDeltaTime() {
        return deltaTime;
    }

    public Speed4 setAcceleration(double acceleration) {
        this.acceleration = acceleration;
        return this;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public Speed4 setInitialVelocityUnit(int initialVelocityUnit) {
        this.initialVelocityUnit = initialVelocityUnit;
        return this;
    }

    public int getInitialVelocityUnit() {
        return initialVelocityUnit;
    }

    public Speed4 setDeltaTimeUnit(int deltaTimeUnit) {
        this.deltaTimeUnit = deltaTimeUnit;
        return this;
    }

    public int getDeltaTimeUnit() {
        return deltaTimeUnit;
    }

    public Speed4 setAccelerationUnit(int accelerationUnit) {
        this.accelerationUnit = accelerationUnit;
        return this;
    }

    public int getAccelerationUnit() {
        return accelerationUnit;
    }

    public Speed4 setUnitOfResult(int unitOfResult) {
        this.unitOfResult = unitOfResult;
        return this;
    }

    public int getUnitOfResult() {
        return unitOfResult;
    }
    
    @Override
    public String getFormula() {
        return "v = vi + a × ∆t";
    }
    
    // v = initialVelocity + acceleration * deltaTime
    @Deprecated
	protected String speed(
		double initialSpeed, 
		double deltaTime, 
		double acceleration, 
		int stepOrResult) {
        double step1 = deltaTime * acceleration;
		double step2 = step1 + initialSpeed;
		String res;
		if (stepOrResult == Physic.GET_STEP) {
			res = "vf = "
				+ deltaTime
				+ "s × "
				+ acceleration
				+ "m/s² + "
				+ initialSpeed
				+ "m/s"
				+ "\nvf = "
				+ step1
				+ "m/s + "
				+ initialSpeed
				+ "m/s"
				+ "\nvf = "
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
		double initialSpeed, 
		String initialSpeedUnit,
		double deltaTime, 
		String deltaTimeUnit,
		double acceleration, 
		String accelerationUnit,
		String unitOfResult,
		int stepOrResult) {
		return null;
    }

    @Deprecated
    public static Speed4 getInstance() {
		if (instance == null) {
			instance = new Speed4();
		}
		return instance;
    }
}
