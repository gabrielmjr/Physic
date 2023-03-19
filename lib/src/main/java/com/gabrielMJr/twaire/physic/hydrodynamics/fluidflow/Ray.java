package com.gabrielMJr.twaire.physic.hydrodynamics.fluidflow;

// r = √[Q / (π * v)]
final class Ray {
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

    private Ray () {}

	private Ray setHasCustomUnits (boolean hasCustomUnits) {
		this.hasCustomUnits = hasCustomUnits;
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

	public double getResult () {
		return step3;
	}

	public String getSteps () {
		if (hasCustomUnits)
			return null;
		return "r = √[" + flowRate + "m³/s ÷ (3.14 × " + velocity + "m/s)]"
			+ "\nr = √(" + flowRate + "m³/s ÷ " + step1 + "m/s)"
			+ "\nr = √(" + step2 + "m²)"
			+ "\nr = " + step3 + "m";
	}

    private Ray setFlowRate (double flowRate) {
		this.flowRate = flowRate;
		return this;
	}

	public double getFlowRate () {
		return flowRate;
	}

	private Ray setVelocity (double velocity) {
		this.velocity = velocity;
		return this;
	}

	public double getVelocity () {
		return velocity;
	}

	private Ray setFlowRateUnit (int flowRateUnit) {
		this.flowRateUnit  = flowRateUnit;
		return this;
	}

	public int getFlowRateUnit () {
		return flowRateUnit;
	}


	private Ray setVelocityUnit (int velocityUnit) {
		this.velocityUnit = velocityUnit;
		return this;
	}

	public int getVelocityUnit () {
		return velocityUnit;
	}

	private Ray setUnitOfResut (int unitOfResult) {
		this.unitOfResult = unitOfResult;
		return this;
	}

	public int getUnitOfResult () {
		return unitOfResult;
	}

    protected static Ray getInstance (double flowRate, double velocity) {
        if (!(instance instanceof Ray))
			instance = new Ray();
		return instance.setFlowRate(flowRate)
		    .setVelocity(velocity)
		    .setHasCustomUnits(false);
    }

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
		    .setHasCustomUnits(true);
    }
}
