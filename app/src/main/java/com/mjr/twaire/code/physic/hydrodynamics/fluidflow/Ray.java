package com.mjr.twaire.code.physic.hydrodynamics.fluidflow;

import com.mjr.twaire.code.physic.Calculations;

public final class Ray extends Calculations {
    @Deprecated
    private static Ray instance;

	private double flowRate;
	private double velocity;

	private int flowRateUnit;
	private int velocityUnit;
	private int unitOfResult;

	private double step1;
	private double step2;
	private double step3;
	private boolean hasCustomUnits;
    
    protected Ray() {}

    protected Ray(double flowRate, double velocity) {
        this.flowRate = flowRate;
        this.velocity = velocity;
        hasCustomUnits = false;
        calculate();
    }

    protected Ray(double flowRate, double velocity, int flowRateUnit, int velocityUnit, int unitOfResult) {
        this.flowRate = flowRate;
        this.velocity = velocity;
        this.flowRateUnit = flowRateUnit;
        this.velocityUnit = velocityUnit;
        this.unitOfResult = unitOfResult;
        hasCustomUnits = true;
        calculate();
    }
    
    @Override
    public Ray calculate() {
        if (hasCustomUnits)
            calculateWithCustomUnits();
        else
            calculateWithoutCustomUnits();
        return this;
    }

	private void calculateWithCustomUnits () {
	}

	private void calculateWithoutCustomUnits () {
		step1 = velocity * 3.14;
		step2 = flowRate / step1;
		step3 = Math.sqrt(step2);
	}

	@Override
	public double getResult () {
		return step3;
	}

	@Override
	public String getSteps () {
		if (hasCustomUnits)
			return null;
		return "r = √[" + flowRate + "m³/s ÷ (3.14 × " + velocity + "m/s)]"
			+ "\nr = √(" + flowRate + "m³/s ÷ " + step1 + "m/s)"
			+ "\nr = √(" + step2 + "m²)"
			+ "\nr = " + step3 + "m";
	}

    public Ray setFlowRate (double flowRate) {
		this.flowRate = flowRate;
		return this;
	}

	public double getFlowRate () {
		return flowRate;
	}

	public Ray setVelocity (double velocity) {
		this.velocity = velocity;
		return this;
	}

	public double getVelocity () {
		return velocity;
	}

	public Ray setFlowRateUnit (int flowRateUnit) {
		this.flowRateUnit  = flowRateUnit;
		return this;
	}

	public int getFlowRateUnit () {
		return flowRateUnit;
	}


	public Ray setVelocityUnit (int velocityUnit) {
		this.velocityUnit = velocityUnit;
		return this;
	}

	public int getVelocityUnit () {
		return velocityUnit;
	}

	public Ray setUnitOfResut (int unitOfResult) {
		this.unitOfResult = unitOfResult;
		return this;
	}

	public int getUnitOfResult () {
		return unitOfResult;
	}

	@Override
	public String getFormula() {
		return "r = √[Q / (π × v)]";
	}
    
    @Deprecated
    private Ray setHasCustomUnits (boolean hasCustomUnits) {
        this.hasCustomUnits = hasCustomUnits;
        return this;
	}

    @Deprecated
    protected static Ray getInstance (double flowRate, double velocity) {
        if (!(instance instanceof Ray))
			instance = new Ray();
		return instance.setFlowRate(flowRate)
		    .setVelocity(velocity)
		    .setHasCustomUnits(false)
            .calculate();
    }

    @Deprecated
	protected static Ray getInstance (double flowRate,
									  int flowRateUnit,
									  double velocity,
									  int velocityUnit,
									  int unitOfResult) {
        if (!(instance instanceof Ray))
			instance = new Ray();
		return instance.setFlowRate(flowRate)
		    .setFlowRateUnit(flowRateUnit)
		    .setVelocity(velocity)
		    .setVelocityUnit(velocityUnit)
		    .setUnitOfResut(unitOfResult)
		    .setHasCustomUnits(true)
            .calculate();
    }
}
