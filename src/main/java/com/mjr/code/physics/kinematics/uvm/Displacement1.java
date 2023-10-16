package com.mjr.code.physics.kinematics.uvm;

import com.mjr.code.physics.Calculation;
import com.mjr.code.physics.Physic;
import com.mjr.code.physics.units.Unit;

public final class Displacement1 extends Calculation {
    @Deprecated
	private static Displacement1 instance; 
    private double initialDisplacement;
    private double initialVelocity;
    private double deltaTime;
    private double acceleration;

    private int initialDisplacementUnit;
    private int initialVelocityUnit;
    private int deltaTimeUnit;
    private int accelerationUnit;
    private int unitOfResult;

    private double step1;
    private double step2;
    private double step3;
    private double step4;
    private double step5;
    private double step6;
    private boolean hasCustomUnits;

    protected Displacement1() {}

    protected Displacement1(double initialDisplacement,
                            double initialVelocity,
                            double deltaTime, 
                            double acceleration) {
        this.initialDisplacement = initialDisplacement;
        this.initialVelocity = initialVelocity;
        this.deltaTime = deltaTime;
        this.acceleration = acceleration;
        hasCustomUnits = false;
        calculate();
    }

    protected Displacement1(double initialDisplacement, 
                            int initialDisplacementUnit,
                            double initialVelocity, 
                            int initialVelocityUnit, 
                            double deltaTime, 
                            int deltaTimeUnit,
                            double acceleration, 
                            int accelerationUnit, 
                            int unitOfResult) {
        this.initialDisplacement = initialDisplacement;
        this.initialVelocity = initialVelocity;
        this.deltaTime = deltaTime;
        this.acceleration = acceleration;
        this.initialDisplacementUnit = initialDisplacementUnit;
        this.initialVelocityUnit = initialVelocityUnit;
        this.deltaTimeUnit = deltaTimeUnit;
        this.accelerationUnit = accelerationUnit;
        this.unitOfResult = unitOfResult;
        hasCustomUnits = true;
        calculate();
    }

    @Override
    public Displacement1 calculate() {
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
        step5 = initialDisplacement + step1;
        step6 = step5 + step4;
    }

    @Override
    public Unit getResult() {
        return null; //step6;
    }

    @Override
    public String getSteps() {
        if (hasCustomUnits)
            return null;
        StringBuilder resolution = new StringBuilder();
        String initialVelocity = (this.initialVelocity < 0) ? "(" + this.initialVelocity + "m/s)" : this.initialVelocity + "m/s";
        String deltaTime = "(" + this.deltaTime + "s)";
        String acceleration = (this.acceleration < 0) ? "(" + this.acceleration + "m/s²)" : this.acceleration + "m/s²";
        String step1 = (this.step1 < 0) ? "(" + this.step1 + "m)" : this.step1 + "m";
        String step2 = (this.step2 < 0) ? "(" + this.step2 + "s²)" : this.step2 + "s²";
        String step3 = (this.step3 < 0) ? "(" + this.step3 + "m)" : this.step3 + "m";
        String step4 = (this.step4 < 0) ? "(" + this.step4 + "m)" : this.step4 + "m";
        resolution.append("S = " + initialDisplacement + "m + " + initialVelocity + " × " + deltaTime + "+ [" + acceleration + " × " + deltaTime + "²] ÷ 2");
        resolution.append("S = " + initialDisplacement + "m + " + step1 + " + " + acceleration + " × " + step2 + " ÷ 2");
        resolution.append("S = " + initialDisplacement + "m + " + step1 + " + " + step3 + " ÷ 2");
        resolution.append("S = " + initialDisplacement + "m + " + step1 + " + " + step4);
        resolution.append("S = " + step5 + "m + " + step4);
        resolution.append("S = " + step6 + "m");
        return resolution.toString();
    }

    public Displacement1 setInitialDisplacement(double initialDisplacement) {
        this.initialDisplacement = initialDisplacement;
        return this;
    }

    public double getInitialDisplacement() {
        return initialDisplacement;
    }

    public Displacement1 setInitialVelocity(double initialVelocity) {
        this.initialVelocity = initialVelocity;
        return this;
    }

    public double getInitialVelocity() {
        return initialVelocity;
    }

    public Displacement1 setDeltaTime(double deltaTime) {
        this.deltaTime = deltaTime;
        return this;
    }

    public double getDeltaTime() {
        return deltaTime;
    }

    public Displacement1 setAcceleration(double acceleration) {
        this.acceleration = acceleration;
        return this;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public Displacement1 setInitialDisplacementUnit(int initialDisplacementUnit) {
        this.initialDisplacementUnit = initialDisplacementUnit;
        return this;
    }

    public int getInitialDisplacementUnit() {
        return initialDisplacementUnit;
    }

    public Displacement1 setInitialVelocityUnit(int initialVelocityUnit) {
        this.initialVelocityUnit = initialVelocityUnit;
        return this;
    }

    public int getInitialVelocityUnit() {
        return initialVelocityUnit;
    }

    public Displacement1 setDeltaTimeUnit(int deltaTimeUnit) {
        this.deltaTimeUnit = deltaTimeUnit;
        return this;
    }

    public int getDeltaTimeUnit() {
        return deltaTimeUnit;
    }

    public Displacement1 setAccelerationUnit(int accelerationUnit) {
        this.accelerationUnit = accelerationUnit;
        return this;
    }

    public int getAccelerationUnit() {
        return accelerationUnit;
    }

    public Displacement1 setUnitOfResult(int unitOfResult) {
        this.unitOfResult = unitOfResult;
        return this;
    }

    public int getUnitOfResult() {
        return unitOfResult;
    }
    
    @Override
    public String getFormula() {
        return "S = Si + vi × ∆t + (a × ∆t²) ÷ 2";
    }

	// S = Si + vi * ∆t + (a * ∆t²) / 2
    @Deprecated
	protected  String displacement(
		double initialDisplacement, 
		double initialVelocity, 
		double deltaTime, 
		double acceleration, 
		int stepOrResult) {
		double step1 = initialVelocity * deltaTime;
		double step11 = Math.pow(deltaTime, 2);
		double step2 = initialDisplacement + step1;
		double step22 = acceleration * step11;
		double step3 = step22 / 2;
		double step4 = step2 + step3;
		String res;
		if (stepOrResult == Physic.GET_STEP) {             
			res = "S = "
				+ initialDisplacement
				+ "m + "
				+ initialVelocity
				+ "m/s × "
				+ deltaTime
				+ "s + ["
				+ acceleration
				+ "m/s² × ("
				+ deltaTime
				+ "s)²] ÷ 2"
				+ "\nS = "
				+ initialDisplacement
				+ "m + "
				+ step1
				+ "m + ("
				+ acceleration
				+ "m/s² × "
				+ step11
				+ "s²) ÷ 2"
				+ "\nS = "
				+ step2
				+ "m + ("
				+ step22
				+ " ÷ 2) (m×s²)/s²"
				+ "\nS = "
				+ step2
				+ "m + "
				+ step3
				+ "m"
				+ "\nS = "
				+ step4
				+ "m";
			return res;
		} else if 
		(stepOrResult == Physic.GET_RESULT) {            
			return String.valueOf(step4);
		} else {
			return "Error 404: fifth parameter not found.";
		}
	}

    @Deprecated
	protected String displacement(
		double initialDisplacement,
		String initialDisplacementUnit,
		double initialVelocity,
		String initialVelocityUnit,
		double deltaTime,
		String deltaTimeUnit,
		double acceleration,
		String accelerationUnit,
		String unitOfResult,
		int stepOrResult) {
		return null;
    }

    @Deprecated
    public static Displacement1 getInstance() {
		if (instance == null) {
			instance = new Displacement1();
		}
		return instance;
    }
}
