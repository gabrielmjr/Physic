package com.mjr.twaire.code.physic.hydrodynamics.fluidflow;

import com.mjr.twaire.code.physic.Calculations;

public final class Area extends Calculations {
    @Deprecated
    private static Area instance;

	private double flowRate;
	private double velocity;

	private int flowRateUnit;
	private int velocityUnit;
	private int unitOfResult;

	private double step1;
	private boolean hasCustomUnits;

    protected Area() {}
    
    protected Area(double flowRate, double velocity) {
        this.flowRate = flowRate;
        this.velocity = velocity;
        hasCustomUnits = false;
        calculate();
    }

    protected Area(double flowRate, double velocity, int flowRateUnit, int velocityUnit, int unitOfResult) {
        this.flowRate = flowRate;
        this.velocity = velocity;
        this.flowRateUnit = flowRateUnit;
        this.velocityUnit = velocityUnit;
        this.unitOfResult = unitOfResult;
        hasCustomUnits = true;
        calculate();
    }

    
    @Override
    public Area calculate() {
        if (hasCustomUnits)
            calculateWithCustomUnits();
        else
            calculateWithoutCustomUnits();
        return this;
    }

	private void calculateWithCustomUnits () {
	}

	private void calculateWithoutCustomUnits () {
		step1 = flowRate / velocity;
	}

	@Override
	public double getResult () {
		return step1;
	} 

	@Override
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
	
	@Override
	public String getFormula() {
		return "A = Q / v";
	}
    
    @Deprecated
    private Area setHasCustomUnits (boolean hasCustomUnits) {
        this.hasCustomUnits = hasCustomUnits;
        return this;
	}

    @Deprecated
    protected static Area getInstance (double flowRate, double velocity) {
        if (!(instance instanceof Area))
            instance = new Area();
        return instance.setFlowwRate(flowRate)
		    .setVelocity(velocity)
		    .setHasCustomUnits(false)
            .calculate();
    }

    @Deprecated
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
		    .setHasCustomUnits(true)
            .calculate();
    }
}
