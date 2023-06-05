package com.mjr.twaire.code.physic.kinematics.muv;

import com.mjr.twaire.code.physic.Calculations;
import com.mjr.twaire.code.physic.Physic;

import static com.mjr.code.tools.NumberAnalyst.putParenthesesIfNegative;

public final class Acceleration3 extends Calculations {
    @Deprecated
	private static Acceleration3 instance; 
    private double initialVelocity;
    private double finalVelocity;
    private double deltaTime;

    private int initialVelocityUnit;
    private int finalVelocityUnit;
    private int deltaTimeUnit;
    private int unitOfResult;

    private double step1;
    private double step2;
    private boolean hasCustomUnits;

    protected Acceleration3() {}
    
    protected Acceleration3(double initialVelocity,
                         double finalVelocity,
                         double deltaTime) {
        this.initialVelocity = initialVelocity;
        this.finalVelocity = finalVelocity;
        this.deltaTime = deltaTime;
        hasCustomUnits = false;
        calculate();
    }

    protected Acceleration3(double initialVelocity,
                         int initialVelocityUnit,
                         double finalVelocity,
                         int finalVelocityUnit, 
                         double deltaTime, 
                         int deltaTimeUnit,
                         int unitOfResult) {
        this.initialVelocity = initialVelocity;
        this.finalVelocity = finalVelocity;
        this.deltaTime = deltaTime;
        this.initialVelocityUnit = initialVelocityUnit;
        this.finalVelocityUnit = finalVelocityUnit;
        this.deltaTimeUnit = deltaTimeUnit;
        this.unitOfResult = unitOfResult;
        hasCustomUnits = true;
        calculate();
    }
    
    @Override
    public Acceleration3 calculate() {
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
        step2 = step1 / deltaTime;
    }
    
    @Override
    public double getResult() {
        return step2;
    }
    
    @Override
    public String getSteps() {
        if (hasCustomUnits)
            return null;
        String deltaTime = putParenthesesIfNegative(this.deltaTime);
        String step1 = putParenthesesIfNegative(this.step1);
        if (initialVelocity < 0)
            return "a = [" + finalVelocity + "m/s - (" + initialVelocity + "m/s)] ÷ " + deltaTime + "s"
                + "\na = " + step1 + "m/s " + deltaTime + "s"
                + "\na = " + step2 + "m/s²";
        return "a = (" + finalVelocity + "m/s - " + initialVelocity + "m/s) ÷ " + deltaTime + "s"
            + "\na = " + step1 + "m/s " + deltaTime + "s"
            + "\na = " + step2 + "m/s²";
    }
    
    public Acceleration3 setInitialVelocity(double initialVelocity) {
        this.initialVelocity = initialVelocity;
        return this;
    }

    public double getInitialVelocity() {
        return initialVelocity;
    }

    public Acceleration3 setFinalVelocity(double finalVelocity) {
        this.finalVelocity = finalVelocity;
        return this;
    }

    public double getFinalVelocity() {
        return finalVelocity;
    }

    public Acceleration3 setDeltaTime(double deltaTime) {
        this.deltaTime = deltaTime;
        return this;
    }

    public double getDeltaTime() {
        return deltaTime;
    }

    public Acceleration3 setInitialVelocityUnit(int initialVelocityUnit) {
        this.initialVelocityUnit = initialVelocityUnit;
        return this;
    }

    public int getInitialVelocityUnit() {
        return initialVelocityUnit;
    }

    public Acceleration3 setFinalVelocityUnit(int finalVelocityUnit) {
        this.finalVelocityUnit = finalVelocityUnit;
        return this;
    }

    public int getFinalVelocityUnit() {
        return finalVelocityUnit;
    }

    public Acceleration3 setDeltaTimeUnit(int deltaTimeUnit) {
        this.deltaTimeUnit = deltaTimeUnit;
        return this;
    }

    public int getDeltaTimeUnit() {
        return deltaTimeUnit;
    }

    public Acceleration3 setUnitOfResult(int unitOfResult) {
        this.unitOfResult = unitOfResult;
        return this;
    }

    public int getUnitOfResult() {
        return unitOfResult;
    }
    
    @Override
    public String getFormula() {
        return "a = (vf - vi) / ∆t";
    }
    
    @Deprecated
	protected String acceleration(
		double initialVelocity,
		double finalVelocity, 
		double deltaTime,
		int stepOrResult) {
		double step1 = finalVelocity - initialVelocity;
		double step2 = step1 / deltaTime;
		String res; 
		if (stepOrResult == Physic.GET_STEP) {
			res = "a = ("
				+ finalVelocity
				+ "m/s - "
				+ initialVelocity
				+ "m/s) ÷ ("
				+ deltaTime
				+ "s)"
				+ "\na = ("
				+ step1
				+ "m/s) ÷ "
				+ deltaTime
				+ "s"
				+ "\na = "
				+ step2
				+ "m/s²";
			return res;
		} else if (stepOrResult == Physic.GET_RESULT) {
			return String.valueOf(step2);
		} else {
			return "Error 404: fourth parameter not found.";
		}
	}

    @Deprecated
	public String acceleration(
		double initialVelocity, 
		String initial_speed_unit, 
		double finalVelocity, 
		String final_speed_unit, 
		double deltaTime, 
		String variation_time_unit, 
		String unit_of_result, 
		int stepOrResult) {
		return null;
	}

    @Deprecated
    public static Acceleration3 getInstance() {
		if (instance == null) {
			instance = new Acceleration3();
		}
		return instance;
    }
}
