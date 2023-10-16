package com.mjr.code.physics.hydrodynamics.fluidflow;

import com.mjr.code.physics.Calculation;
import com.mjr.code.physics.units.Unit;

public final class Speed2 extends Calculation {
    @Deprecated
    private static Speed2 instance;

	private double flowRate;
	private double ray;

	private int flowRateUnit;
	private int rayUnit;
	private int unitOfResult;

	private double step1;
	private double step2;
	private double step3;
	private boolean hasCustomUnits;

    protected Speed2() {}

    protected Speed2(double flowRate, double ray) {
        this.flowRate = flowRate;
        this.ray = ray;
        hasCustomUnits = false;
        calculate();
    }

    protected Speed2(double flowRate,
                     int flowRateUnit,
                     double ray,
                     int rayUnit,
                     int unitOfResult) {
        this.flowRate = flowRate;
        this.ray = ray;
        this.flowRateUnit = flowRateUnit;
        this.rayUnit = rayUnit;
        this.unitOfResult = unitOfResult;
        hasCustomUnits = true;
        calculate();
    }

    @Override
    public Speed2 calculate() {
        if (hasCustomUnits)
            calculateWithCustomUnits();
        else
            calculateWithoutCustomUnits();
        return this;
    }

	private void calculateWithCustomUnits() {}

	private void calculateWithoutCustomUnits() {
		step1 = Math.pow(ray, 2);
		step2 = step1 * 3.14;
		step3 = flowRate / step2;
	}

	@Override
	public Unit getResult() {
		return null; //step3;
	}

	@Override
	public String getSteps() {
		if (hasCustomUnits)
			return null;
		return "v = " + flowRate + "m³/s ÷ [3.14 × (" + ray + "m)²]"
			+ "\nv = " + flowRate + "m³/s ÷ (3.14 × " + step1 + "m²"
			+ "\nv = " + flowRate + "m³/s ÷ " + step2 + "m²"
			+ "\nv = " + step3 + "m/s";
	}

	public Speed2 setFlowRate(double flowRate) {
		this.flowRate = flowRate;
		return this;
	}

	public double getFlowRate() {
		return flowRate;
	}

	public Speed2 setRay(double ray) {
		this.ray = ray;
		return this;
	}

	public double getRay() {
		return ray;
	}

	public Speed2 setFlowRateUnit(int flowRateUnit) {
		this.flowRateUnit = flowRateUnit;
		return this;
	}

	public int getFlowRateUnit() {
		return flowRateUnit;
	}

	public Speed2 setRayUnit(int rayUnit) {
		this.rayUnit = rayUnit;
		return this;
	}

	public int getRayUnit() {
		return rayUnit;
	}

	public Speed2 setUnitOfRest(int unitOfResult) {
		this.unitOfResult = unitOfResult;
		return this;
	}

	public int getUnitOfResult() {
		return unitOfResult;
	}

	@Override
	public String getFormula() {
		return "v = Q / [π × (r)²]";
	}

    @Deprecated
    private Speed2 setHasCustomUnits(boolean hasCustomUnits) {
        this.hasCustomUnits = hasCustomUnits;
        return this;
    }

    @Deprecated
    protected static Speed2 getInstance(double flowRate, double ray) {
        if (!(instance instanceof Speed2))
            instance = new Speed2();
		return instance.setFlowRate(flowRate)
		    .setRay(ray)
		    .setHasCustomUnits(false)
            .calculate();
    }

    @Deprecated
	protected static Speed2 getInstance(double flowRate,
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
		    .setHasCustomUnits(true)
            .calculate();
    }
}
