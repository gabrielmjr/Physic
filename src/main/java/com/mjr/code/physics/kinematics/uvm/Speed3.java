package com.mjr.code.physics.kinematics.uvm;

import com.mjr.code.physics.Calculation;
import com.mjr.code.physics.Physic;
import com.mjr.code.physics.units.Unit;

public final class Speed3 extends Calculation {
    @Deprecated
	private static Speed3 instance; 
    private double finalVelocity;
    private double deltaTime;
    private double acceleration;

    private int finalVelocityUnit;
    private int deltaTimeUnit;
    private int accelerationUnit;
    private int unitOfResult;

    private double step1;
    private double step2;
    private boolean hasCustomUnits;

    protected Speed3() {}

    protected Speed3(double finalVelocity,
                     double deltaTime,
                     double acceleration) {
        this.finalVelocity = finalVelocity;
        this.deltaTime = deltaTime;
        this.acceleration = acceleration;
        hasCustomUnits = false;
        calculate();
    }

    protected Speed3(double finalVelocity,
                     int finalVelocityUnit,
                     double deltaTime,
                     int deltaTimeUnit, 
                     double acceleration,     
                     int accelerationUnit,
                     int unitOfResult) {
        this.finalVelocity = finalVelocity;
        this.deltaTime = deltaTime;
        this.acceleration = acceleration;
        this.finalVelocityUnit = finalVelocityUnit;
        this.deltaTimeUnit = deltaTimeUnit;
        this.accelerationUnit = accelerationUnit;
        this.unitOfResult = unitOfResult;
        hasCustomUnits = true;
        calculate();
    }

    @Override
    public Speed3 calculate() {
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
        step2 = finalVelocity - step1;
    }

    @Override
    public Unit getResult() {
        return null; //step2;
    }

    @Override
    public String getSteps() {
        if (hasCustomUnits)
            return null;
        StringBuilder resolution = new StringBuilder();
        String finalVelocity = (this.finalVelocity < 0) ? "(" + this.finalVelocity + "m/s)" : this.finalVelocity + "m/s";
        String deltaTime = (this.deltaTime < 0) ? "(" + this.deltaTime + "s)" : this.deltaTime + "s";
        String acceleration = (this.acceleration < 0) ? "(" + this.acceleration + "m/s²)" : this.acceleration + "m/s²";
        String step1 = (this.step1 < 0) ? "(" + this.step1 + "m/s)" : this.step1 + "m/s";
        String step2 = (this.step2 < 0) ? "(" + this.step2 + "m/s)" : this.step2 + "m/s";
        resolution.append("vi = " + finalVelocity + " - " + deltaTime + " × " + acceleration);
        resolution.append("vi = " + finalVelocity + " - " + step1);
        resolution.append("vi = " + step2);
        return resolution.toString();
    }

    public Speed3 setFinalVelocity(double finalVelocity) {
        this.finalVelocity = finalVelocity;
        return this;
    }

    public double getFinalVelocity() {
        return finalVelocity;
    }

    public Speed3 setDeltaTime(double deltaTime) {
        this.deltaTime = deltaTime;
        return this;
    }

    public double getDeltaTime() {
        return deltaTime;
    }

    public Speed3 setAcceleration(double acceleration) {
        this.acceleration = acceleration;
        return this;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public Speed3 setFinalVelocityUnit(int finalVelocityUnit) {
        this.finalVelocityUnit = finalVelocityUnit;
        return this;
    }

    public int getFinalVelocityUnit() {
        return finalVelocityUnit;
    }

    public Speed3 setDeltaTimeUnit(int deltaTimeUnit) {
        this.deltaTimeUnit = deltaTimeUnit;
        return this;
    }

    public int getDeltaTimeUnit() {
        return deltaTimeUnit;
    }

    public Speed3 setAccelerationUnit(int accelerationUnit) {
        this.accelerationUnit = accelerationUnit;
        return this;
    }

    public int getAccelerationUnit() {
        return accelerationUnit;
    }

    public Speed3 setUnitOfResult(int unitOfResult) {
        this.unitOfResult = unitOfResult;
        return this;
    }

    public int getUnitOfResult() {
        return unitOfResult;
    }

    @Override
    public String getFormula() {
        return "vi = v - ∆t × a";
    }

    // vi = v - ∆t * a
    @Deprecated
	protected String speed(
		double finalVelocity,
		double deltaTime,
		double acceleration,
		int stepOrResult) {
        double step1 = deltaTime * acceleration;
        double step2 = finalVelocity - step1;
        String res;
        if (stepOrResult == Physic.GET_STEP) {
			res = "vi = "
				+ finalVelocity
				+ "m/s - "
				+ deltaTime
				+ "s × "
				+ acceleration
				+ "m/s²"
				+ "\nvi = "
				+ finalVelocity
				+ "m/s - "
				+ step1
				+ "m/s"
				+ "\nvi = "
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
		double finalVelocity, 
		String finalSpeedUnit,
		double deltaTime, 
		String deltaTimeUnit,
		double acceleration, 
		String accelerationUnit,
		String unit_of_result,
		int stepOrResult) {
		return null;
	}

    @Deprecated
    public static Speed3 getInstance() {
		if (instance == null) {
			instance = new Speed3();
		}
		return instance;
    }
}
