package com.mjr.twaire.code.physic.kinematics.uvm;

import com.mjr.twaire.code.physic.Calculation;
import com.mjr.twaire.code.physic.Physic;
import java.math.BigDecimal;

public final class Acceleration4 extends Calculation {
    @Deprecated
	private static Acceleration4 instance; 
    private double initialVelocity;
    private double finalVelocity;
    private double initialTime;
    private double finalTime;

    private int initialVelocityUnit;
    private int finalVelocityUnit;
    private int initialTimeUnit;
    private int finalTimeUnit;
    private int unitOfResult;

    private double step1;
    private double step2;
    private double step3;
    private boolean hasCustomUnits;

    protected Acceleration4() {}

    protected Acceleration4(double initialVelocity,
                            double finalVelocity,
                            double initialTime, 
                            double finalTime) {
        this.initialVelocity = initialVelocity;
        this.finalVelocity = finalVelocity;
        this.initialTime = initialTime;
        this.finalTime = finalTime;
        hasCustomUnits = false;
        calculate();
    }

    protected Acceleration4(double initialVelocity,
                            int initialVelocityUnit,
                            double finalVelocity,
                            int finalVelocityUnit,
                            double initialTime,
                            int initialTimeUnit, 
                            double finalTime,                                                             
                            int finalTimeUnit,
                            int unitOfResult) {
        this.initialVelocity = initialVelocity;
        this.finalVelocity = finalVelocity;
        this.initialTime = initialTime;
        this.finalTime = finalTime;
        this.initialVelocityUnit = initialVelocityUnit;
        this.finalVelocityUnit = finalVelocityUnit;
        this.initialTimeUnit = initialTimeUnit;
        this.finalTimeUnit = finalTimeUnit;
        this.unitOfResult = unitOfResult;
        hasCustomUnits = true;
        calculate();
    }
    
    @Override
    public Acceleration4 calculate() {
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
        step2 = finalTime - initialTime;
        step3 = step1 / step2;
    }
    
    @Override
    public BigDecimal getResult() {
        return null; //step3;
    }
    
    @Override
    public String getSteps() {
        return buildResolution();
    }
    
    private String buildResolution() {
        if (hasCustomUnits)
            return null;
        StringBuilder resolution = new StringBuilder();
        resolution.append("a = ");
        if (initialVelocity < 0)
            resolution.append("[" + finalVelocity + "m/s - (" + initialVelocity + "m/s)]");
        else 
            resolution.append("(" + finalVelocity + "m/s - " + initialVelocity + "m/s)");
        resolution.append(" ÷ ");
        if (initialTime < 0)
            resolution.append("[" + finalTime + "s - (" + initialTime + "s)]");
        else 
            resolution.append("(" + finalTime + "s - " + initialTime + "s)");
        resolution.append("\n");
        if (step1 < 0)
            resolution.append("a = (" + step1 + "m/s)");
        else
            resolution.append("a = " + step1 + "m/s");
        resolution.append("÷");
        if (step2 < 0)
            resolution.append("(" + step2 + "s)");
        else
            resolution.append(step2 + "s");
        resolution.append("\na = " + step3 + "m/s²");
        return resolution.toString();
    }
    
    public Acceleration4 setInitialVelocity(double initialVelocity) {
        this.initialVelocity = initialVelocity;
        return this;
    }

    public double getInitialVelocity() {
        return initialVelocity;
    }

    public Acceleration4 setFinalVelocity(double finalVelocity) {
        this.finalVelocity = finalVelocity;
        return this;
    }

    public double getFinalVelocity() {
        return finalVelocity;
    }

    public Acceleration4 setInitialTime(double initialTime) {
        this.initialTime = initialTime;
        return this;
    }

    public double getInitialTime() {
        return initialTime;
    }

    public Acceleration4 setFinalTime(double finalTime) {
        this.finalTime = finalTime;
        return this;
    }

    public double getFinalTime() {
        return finalTime;
    }

    public Acceleration4 setInitialVelocityUnit(int initialVelocityUnit) {
        this.initialVelocityUnit = initialVelocityUnit;
        return this;
    }

    public int getInitialVelocityUnit() {
        return initialVelocityUnit;
    }

    public Acceleration4 setFinalVelocityUnit(int finalVelocityUnit) {
        this.finalVelocityUnit = finalVelocityUnit;
        return this;
    }

    public int getFinalVelocityUnit() {
        return finalVelocityUnit;
    }

    public Acceleration4 setInitialTimeUnit(int initialTimeUnit) {
        this.initialTimeUnit = initialTimeUnit;
        return this;
    }

    public int getInitialTimeUnit() {
        return initialTimeUnit;
    }

    public Acceleration4 setFinalTimeUnit(int finalTimeUnit) {
        this.finalTimeUnit = finalTimeUnit;
        return this;
    }

    public int getFinalTimeUnit() {
        return finalTimeUnit;
    }

    public Acceleration4 setUnitOfResult(int unitOfResult) {
        this.unitOfResult = unitOfResult;
        return this;
    }

    public int getUnitOfResult() {
        return unitOfResult;
    }
    
    @Override
    public String getFormula() {
        return "a = (v - vi) / (t - ti)";
    }

    @Deprecated
	protected String acceleration(
		double initialVelocity,
		double finalVelocity,
		double initialTime,
		double finalTime,
		int stepOrResult) {
		double step1 = finalVelocity - initialVelocity;
		double step2 = finalTime - initialTime;
		double step3 = step1 / step2;
		String res;
		if (stepOrResult == Physic.GET_STEP) {
			res = "a = ("
				+ finalVelocity
				+ "m/s - "
				+ initialVelocity
				+ "m/s) ÷ ("
				+ finalTime
				+ "s - "
				+ initialTime
				+ "s)"
				+ "\na = ("
				+ step1
				+ "m/s) ÷ "
				+ step2
				+ "s"
				+ "\na = "
				+ step3
				+ "m/s²";
			return res;
		} else if (stepOrResult == Physic.GET_RESULT) {
		    return String.valueOf(step3);
		} else {
			return "Error 404: fifth parameter not found.";
		}
    }

    @Deprecated
    protected String acceleration(
		double initialVelocity, 
		String initialVelocityUnit, 
		double finalVelocity, 
		String finalVelocityUnit, 
		double initialTime, 
		String initialTimeUnit, 
		double finalTime, 
		String finalTimeUnit,
		String unitOfResult, 
		int stepOrResult) {
		return null;
    }

    @Deprecated
    public static Acceleration4 getInstance() {
		if (instance == null) {
			instance = new Acceleration4();
		}
		return instance;
    }
}
