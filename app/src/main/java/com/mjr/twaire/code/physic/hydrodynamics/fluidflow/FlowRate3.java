package com.mjr.twaire.code.physic.hydrodynamics.fluidflow;

import com.mjr.twaire.code.physic.Calculations;

public final class FlowRate3 extends Calculations {
    private static FlowRate3 instance;

	private double ray;
	private double velocity;

	private int rayUnit;
	private int velocityUnit;
	private int unitOfResult;

	private double step1;
	private double step2;
	private double step3;
	private boolean hasCustomUnits;

    private FlowRate3 () {}

	private FlowRate3 setHasCustomUnits (boolean hasCustomUnits) {
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
		step1 = Math.pow(ray, 2);
		step2 = 3.14 * step1;
		step3 = step2 * velocity;
	}

	@Override
	public double getResult () {
		return step3;
	}

	@Override
	public String getSteps () {
		if (hasCustomUnits)
			return null;
		else
			return "Q = 3.14 × (" + ray + "m)² × " + velocity + "m/s"
				+ "\nQ = 3.14 × " + step1 + "m² × " + velocity + "m/s"
				+ "\nQ = " + step2 + "m² × " + velocity + "m/s"
				+ "\nQ = " + step3 + "m³/s";
	}

	private FlowRate3 setRay (double ray) {
		this.ray = ray;
		return this;
	}

	public double getRay () {
		return ray;
	}

	private FlowRate3 setVelocity (double velocity) {
		this.velocity = velocity;
		return this;
	}

	private FlowRate3 setRayUnit (int rayUnit) {
		this.rayUnit = rayUnit;
		return this;
	}

	public int getRayUnit () {
		return rayUnit;
	}

	private FlowRate3 setVelocityUnit (int velocityUnit) {
		this.velocityUnit = velocityUnit;
		return this;
	}

	public int getVelocityUnit () {
		return velocityUnit;
	}

	private FlowRate3 setUnitOfResult (int unitOfResult) {
		this.unitOfResult = unitOfResult;
		return this;
	}

	public int getUnitOfResult () {
		return unitOfResult;
	}
	
	@Override
	public String getFormula() {
		return "Q = π × r² * v";
	}

    protected static FlowRate3 getInstance (double ray,
										 double velocity) {
        if (!(instance instanceof FlowRate3))
            instance = new FlowRate3();
        return instance.setRay(ray)
		    .setVelocity(velocity)
		    .setHasCustomUnits(false);
    }

	protected static FlowRate3 getInstance (double ray,
										 int rayUnit,
										 double velocity,
										 int velocityUnit,
										 int unitOfResult) {
        if (!(instance instanceof FlowRate3))
            instance = new FlowRate3();
        return instance.setRay(ray)
		    .setRayUnit(rayUnit)
		    .setVelocity(velocity)
		    .setVelocityUnit(velocityUnit)
		    .setUnitOfResult(unitOfResult)
		    .setHasCustomUnits(true);
    }
}
