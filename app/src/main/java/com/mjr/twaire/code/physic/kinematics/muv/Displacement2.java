package com.mjr.twaire.code.physic.kinematics.muv;

import com.mjr.twaire.code.physic.Calculation;
import com.mjr.twaire.code.physic.Physic;

public final class Displacement2 extends Calculation {
    @Deprecated
	private static Displacement2 instance;
    private double initialVelocity;
    private double deltaTime;
    private double acceleration;
    private double displacement;
    
    private int initialVelocityUnit;
    private int deltaTimeUnit;
    private int accelerationUnit;
    private int displacementUnit;
    private int unitOfResult;
    
    private double step1;
    private double step2;
    private double step3;
    private double step4;
    private double step5;
    private double step6;
    private boolean hasCustomUnits;
    
    protected Displacement2() {
        hasCustomUnits = false;
    }

    protected Displacement2(double initialVelocity, 
                            int initialVelocityUnit,
                            double deltaTime, 
                            int deltaTimeUnit,
                            double acceleration, 
                            int accelerationUnit,
                            double displacement, 
                            int displacementUnit,
                            int unitOfResult) {
        this.initialVelocity = initialVelocity;
        this.deltaTime = deltaTime;
        this.acceleration = acceleration;
        this.displacement = displacement;
        this.initialVelocityUnit = initialVelocityUnit;
        this.deltaTimeUnit = deltaTimeUnit;
        this.accelerationUnit = accelerationUnit;
        this.displacementUnit = displacementUnit;
        this.unitOfResult = unitOfResult;
        hasCustomUnits = true;
        calculate();
    }

	protected Displacement2(double initialVelocity, 
                            double deltaTime, 
                            double acceleration, 
                            double displacement) {
        this.initialVelocity = initialVelocity;
        this.deltaTime = deltaTime;
        this.acceleration = acceleration;
        this.displacement = displacement;
        hasCustomUnits = false;
        calculate();
    }

    
    
    @Override
    public Displacement2 calculate() {
        if (hasCustomUnits)
            calculateWithCustomUnits();
        else
            calculateWithoutCustomUnits();
        return this;
    }

    private void calculateWithCustomUnits() {
    }
    
    private void calculateWithoutCustomUnits() {
        step1 = initialVelocity * deltaTime;
        step2 = Math.pow(deltaTime, 2);
        step3 = acceleration * step2;
        step4 = step3 / 2;
        step5 = step1 + step4;
        step6 = displacement - step5;
    }
    
    @Override
    public double getResult() {
        return step6;
    }
    
    @Override
    public String getSteps() {
        if (hasCustomUnits)
            return null;
        StringBuilder resolution = new StringBuilder();
        String initialVelocity = (this.initialVelocity < 0) ? "(" + this.initialVelocity + "m/s)" : this.initialVelocity + "m/s";
        String deltaTime =  "(" + this.deltaTime + "s)";
        String acceleration = (this.acceleration < 0) ? "(" + this.acceleration + "m/s²)" : this.acceleration + "m/s²";
        String step1 = (this.step1 < 0) ? "(" + this.step1 + "m)" : this.step1 + "m";
        String step2 = (this.step2 < 0) ? "(" + this.step2 + "s²)" : this.step2 + "s²";
        String step3 = (this.step3 < 0) ? "(" + this.step3 + "m)" : this.step3 + "m";
        String step4 = (this.step4 < 0) ? "(" + this.step4 + "m)" : this.step4 + "m";
        String step5 = (this.step5 < 0) ? "(" + this.step5 + "m)" : this.step5 + "m";
        resolution.append("Si = " + displacement + "m + [" + initialVelocity + " × " + deltaTime + " + " + acceleration + " × " + deltaTime + "² ÷ 2]");
        resolution.append("Si = " + displacement + "m + [" + step1 + " + " + acceleration + " × " + step2 + " ÷ 2]");
        resolution.append("Si = " + displacement + "m + [" + step1 + " + " + step3 + " ÷ 2]");
        resolution.append("Si = " + displacement + "m + [" + step1 + " + " + step4 + "]");
        resolution.append("Si = " + displacement + "m + " + step5);
        resolution.append("Si = " + step6 + "m");
        return resolution.toString();
    }
    
    @Override
    public String getFormula() {
        return "Si = S - [(vi × ∆t) + (a × ∆t²) ÷ 2]";
    }
    
    @Deprecated
	protected String displacement(
		double initialVelocity, 
		double deltaTime, 
		double acceleration, 
		double displacement, 
		int stepOrResult) {
		double step1 = initialVelocity * deltaTime;
		double step11 = Math.pow(deltaTime, 2);
		double step2 = acceleration * step11;
		double step3 = step2 / 2;
		double step4 = step1 + step3;
		double step5 = displacement - step4;
		String res;
		if (stepOrResult == Physic.GET_STEP) {
			res = "Si = "
				+ displacement
				+ "m - [("
				+ initialVelocity 
				+ "m/s × "
				+ deltaTime
				+ "s) + ["
				+ acceleration 
				+ "m/s² × ("
				+ deltaTime
				+ "s)²] ÷ 2]"
				+ "\nSi = "
				+ displacement 
				+ "m - ["
				+ step1
				+ "m + ("
				+ acceleration
				+ "m/s² × "
				+ step11
				+ "s²) ÷ 2]"
				+ "\nSi = "
				+ displacement
				+ "m - ["
				+ step1
				+ "m + ("
				+ step2
				+ " ÷ 2)m]"
				+ "\nSi = "
				+ displacement 
				+ "m - ("
				+ step1
				+ "m + "
				+ step3
				+ "m)"
				+ "\nSi = "
				+ displacement 
				+ "m - "
				+ step4
				+ "m \nSi = "
				+ step5
				+ "m";
            return res;
		} else if (stepOrResult == Physic.GET_RESULT) {
			return String.valueOf(step5);   
		} else {              
			return "Error 404: fifth parameter not found.";
		}
	}

    @Deprecated
	protected String displacement(
		double initialVelocity, 
		String initialVelocityUnit,
		double deltaTime, 
		String deltaTimeUnit,
		double acceleration, 
		String accelerationUnit,
		double displacement, 
		String displacementUnit,
		String unitOfResult,
		int stepOrResult) {
		return null;
    }

    @Deprecated
    public static Displacement2 getInstance() {
		if (instance == null) {
			instance = new Displacement2();
		}
		return instance;
    }
}
