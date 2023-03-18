package com.gabrielMJr.twaire.physic.hydrodynamics.fluidflow;

import com.gabrielMJr.twaire.physic.Physic;

final class Speed2 {
    private static Speed2 instance;

	private double flowRate;
	private double ray;

	private int flowRateUnit;
	private int rayUnit;
	private int unitOfResult;

	private double step1;
	private double step2;
	private double step3;
	private boolean hasCustomUnit;

    private Speed2 () {}

	private Speed2 setHasCustomUnit (boolean hasCustomUnit) {
		this.hasCustomUnit = hasCustomUnit;
		if (hasCustomUnit)
			calculateWithCustomUnit();
		else
			calculateWithoutCustomUnit();
		return this;
	}

	private void calculateWithCustomUnit () {}

	private void calculateWithoutCustomUnit () {
		step1 = Math.pow(ray, 2);
		step2 = step1 * 3.14;
		step3 = flowRate / step2;
	}

	public double getResult () {
		return step3;
	}

	public String getSteps () {
		if (hasCustomUnit)
			return null;
		return "v = " + flowRate + "m³/s ÷ [3.14 × (" + ray + "m)²]"
			+ "\nv = " + flowRate + "m³/s ÷ (3.14 × " + step1 + "m²"
			+ "\nv = " + flowRate + "m³/s ÷ " + step2 + "m²"
			+ "\nv = " + step3 + "m/s";
	}

	private Speed2 setFlowRate (double flowRate) {
		this.flowRate = flowRate;
		return this;
	}

	public double getFlowRate () {
		return flowRate;
	}

	private Speed2 setRay (double ray) {
		this.ray = ray;
		return this;
	}

	public double getRay () {
		return ray;
	}

	private Speed2 setFlowRateUnit (int flowRateUnit) {
		this.flowRateUnit = flowRateUnit;
		return this;
	}

	public int getFlowRateUnit () {
		return flowRateUnit;
	}

	private Speed2 setRayUnit (int rayUnit) {
		this.rayUnit = rayUnit;
		return this;
	}

	public int getRayUnit () {
		return rayUnit;
	}

	private Speed2 setUnitOfRest (int unitOfResult) {
		this.unitOfResult = unitOfResult;
		return this;
	}

	public int getUnitOfResult () {
		return unitOfResult;
	}

    public static Speed2 getInstance (double flowRate, double ray) {
        if (!(instance instanceof Speed2))
            instance = new Speed2();
		return instance.setFlowRate(flowRate)
		    .setRay(ray)
		    .setHasCustomUnit(false);
    }

	public static Speed2 getInstance (double flowRate,
									  int flowRateUnit,
									  double ray,
									  int rayUnit,
									  int unitOfResult) {
        if (!(instance instanceof Speed2))
            instance = new Speed2();
		return instance.setFlowRate(flowRate)
		    .setFlowRateUnit(flowRateUnit)
		    .setRay(ray)
		    .setRayUnit(rayUnit)
		    .setUnitOfRest(unitOfResult)
		    .setHasCustomUnit(true);
    }
}
