package com.mjr.twaire.code.physic.hydrodynamics.fluidflow;

import com.mjr.twaire.code.physic.Calculations;

public final class FlowRate2 extends Calculations {
    private static FlowRate2 instance;

	private double area;
	private double velocity;

	private int areaUnit;
	private int velocityUnit;
	private int unitOfResult;

	private double step1;
	private boolean hasCustomUnits;

    private FlowRate2 () {}
    
    @Override
    public FlowRate2 calculate() {
        if (hasCustomUnits)
            calculateWithCustomUnits();
        else
            calculateWithoutCustomUnits();
        return this;
    }

	private void calculateWithCustomUnits () {}

	private void calculateWithoutCustomUnits () {
		step1 = area * velocity;
	}

	@Override
	public double getResult () {
		return step1;
	}

	@Override
	public String getSteps () {
		if (hasCustomUnits)
			return null;
	    else {
			return "Q = " + area + " × " + velocity
			    + "\nQ = " + step1 + "m³/s";
		}
	}

	private FlowRate2 setArea (double area) {
		this.area = area;
		return this;
	}

	public double getArea () {
		return area;
	}

	private FlowRate2 setVelocity (double velocity) {
		this.velocity = velocity;
		return this;
	}

	public double getVelocity () {
		return velocity;
	}

	private FlowRate2 setAreaUnit (int areaUnit) {
		this.areaUnit = areaUnit;
		return this;
	}

	public int getAreaUnit () {
		return areaUnit;
	}

	private FlowRate2 setVelocityUnit (int velocityUnit) {
		this.velocityUnit = velocityUnit;
		return this;
	}

	public int getVelocityUnit () {
		return velocityUnit;
	}

	private FlowRate2 setUnitOfResult (int unitOfResult) {
		this.unitOfResult = unitOfResult;
		return this;
	}

	public int getUnitOfResult () {
		return unitOfResult;
	}
	
	@Override
	public String getFormula() {
		return "Q = A * v";
	}
    
    private FlowRate2 setHasCustomUnits (boolean hasCustomUnits) {
        this.hasCustomUnits = hasCustomUnits;
        return this;
	}

    protected static FlowRate2 getInstance (double area, double velocity) {
        if (!(instance instanceof FlowRate2))
            instance = new FlowRate2();
        return instance.setArea(area)
		    .setVelocity(velocity)
		    .setHasCustomUnits(false)
            .calculate();
    }

	protected static FlowRate2 getInstance (double area,
										 int areaUnit,
										 double velocity,
										 int velocityUnit, 
										 int unitOfResult) {
        if (!(instance instanceof FlowRate2))
			instance = new FlowRate2();
	    return instance.setArea(area)
		    .setAreaUnit(areaUnit)
		    .setVelocity(velocity)
		    .setVelocityUnit(velocityUnit)
		    .setUnitOfResult(unitOfResult)
		    .setHasCustomUnits(true)
            .calculate();
    }
}
