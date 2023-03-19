package com.gabrielMJr.twaire.physic.hydrodynamics.fluidflow;

// A = Q / v
final class Area {
    private static Area instance;

	private double flowRate;
	private double velocity;

	private int flowRateUnit;
	private int velocityUnit;
	private int unitOfResult;

	private double step1;
	private boolean hasCustomUnits;

    private Area () {}

	private Area setHasCustomUnist (boolean hasCustomUnits) {
		this.hasCustomUnits = hasCustomUnits;
		if (hasCustomUnits)
			calculateWithCustomUnit();
		else
			calculateWithoutCustomUnit();
		return this;
	}

	private void calculateWithCustomUnit () {
	}

	private void calculateWithoutCustomUnit () {
		step1 = flowRate / velocity;
	}

	public double getResult () {
		return step1;
	} 

	public String getSteps () {
		if (hasCustomUnits)
			return null;
		return "A = " + flowRate + "m³/s ÷ " + velocity + "m/s"
			+ "\nA = " + step1 + "m²";
	}

	private Area setFlowwRate (double flowRate) {
		this.flowRate = flowRate;
		return this;
	}

	public double getFlowRate () {
		return flowRate;
	}

	private Area setVelocity (double velocity) {
		this.velocity = velocity;
		return this;
	}

	public double getVelocity () {
		return velocity;
	}

	private Area setFlowRateUnit (int flowRateUnit) {
		this.flowRateUnit = flowRateUnit;
		return this;
	}

	public int getFlowRateUnit () {
		return flowRateUnit;
	}

	private Area setVelocityUnit (int velocityUnit) {
		this.velocityUnit = velocityUnit;
		return this;
	}

	public int getVelocityUnit () {
		return velocityUnit;
	}

	private Area setUnitOfResult (int unitOfResult) {
		this.unitOfResult = unitOfResult;
		return this;
	}

	public int getUnitOfResult () {
		return unitOfResult;
	}

    protected static Area getInstance (double flowRate, double velocity) {
        if (!(instance instanceof Area))
            instance = new Area();
        return instance.setFlowwRate(flowRate)
		    .setVelocity(velocity)
		    .setHasCustomUnist(false);
    }

	protected static Area getInstance (double flowRate,
									   int flowRateUnit, 
									   double velocity,
									   int velocityUnit,
									   int unitOfResult) {
        if (!(instance instanceof Area))
            instance = new Area();
        return instance.setFlowwRate(flowRate)
		    .setFlowRateUnit(flowRateUnit)
		    .setVelocity(velocity)
		    .setVelocityUnit(velocityUnit)
		    .setUnitOfResult(unitOfResult)
		    .setHasCustomUnist(true);
    }
}
