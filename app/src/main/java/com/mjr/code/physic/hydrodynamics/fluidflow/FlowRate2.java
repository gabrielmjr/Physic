package com.mjr.code.physic.hydrodynamics.fluidflow;

// Q = A * v
final class FlowRate2 {
    private static FlowRate2 instance;

	private double area;
	private double velocity;

	private int areaUnit;
	private int velocityUnit;
	private int unitOfResult;

	private double step1;
	private boolean hasCustomUnits;

    private FlowRate2 () {}

    private FlowRate2 setHasCustomUnits (boolean hasCustomUnits) {
		this.hasCustomUnits = hasCustomUnits;
		if (hasCustomUnits)
			calculateWithCustomUnit();
		else
			calculateWithoutCustomUnit();
		return this;
	}

	private void calculateWithCustomUnit () {}

	private void calculateWithoutCustomUnit () {
		step1 = area * velocity;
	}

	public double getResult () {
		return step1;
	}

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

    protected static FlowRate2 getInstance (double area, double velocity) {
        if (!(instance instanceof FlowRate2))
            instance = new FlowRate2();
        return instance.setArea(area)
		    .setVelocity(velocity)
		    .setHasCustomUnits(false);
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
		    .setHasCustomUnits(true);
    }
}
