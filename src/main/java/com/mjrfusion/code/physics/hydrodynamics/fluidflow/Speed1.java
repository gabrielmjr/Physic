package com.mjrfusion.code.physics.hydrodynamics.fluidflow;

import com.mjrfusion.code.physics.Calculation;
import com.mjrfusion.code.physics.units.Unit;

public class Speed1 extends Calculation {
    @Deprecated
    private static Speed1 instance;

	private double flowRate;
	private double area;

	private int flowRateUnit;
	private int areaUnit;
	private int unitOfResult;

	private double step1;
	private boolean hasCustomUnits;

    protected Speed1() {}

    protected Speed1(double flowRate, double area) {
        this.flowRate = flowRate;
        this.area = area;
        hasCustomUnits = false;
        calculate();
    }

    protected Speed1(double flowRate, 
                     int flowRateUnit,
                     double area,
                     int areaUnit, 
                     int unitOfResult) {
        this.flowRate = flowRate;
        this.area = area;
        this.flowRateUnit = flowRateUnit;
        this.areaUnit = areaUnit;
        this.unitOfResult = unitOfResult;
        hasCustomUnits = true;
        calculate();
    }


    @Override
    public Speed1 calculate() {
        if (hasCustomUnits)
            calculateWithCustomUnits();
        else
            calculateWithoutCustomUnits();
        return this;
    }

	private void calculateWithCustomUnits() {}

	private void calculateWithoutCustomUnits() {
		step1 = flowRate / area;
	}

	@Override
	public Unit getResult() {
		return null; //step1;
	}

	@Override
	public String getSteps() {
		if (hasCustomUnits)
			return null;
		return "v = " + flowRate + "m³/s ÷ " + area + "m²"
			+ "\nv = " + step1 + "m/s";
	}

    public Speed1 setFlowRate(double flowRate) {
		this.flowRate = flowRate;
		return this;
	}

	public double getFlowRate() {
		return flowRate;
	}

	public Speed1 setArea(double area) {
		this.area = area;
		return this;
	}

	public double getArea() {
		return area;
	}

	public Speed1 setFlowRateUnit(int flowRateUnit) {
		this.flowRateUnit = flowRateUnit;
		return this;
	}

	public int getFlowRateUnit() {
		return flowRateUnit;
	}

	public Speed1 setAreaUnit(int areaUnit) {
		this.areaUnit = areaUnit;
		return this;
	}

	public int getAreaUnit() {
		return areaUnit;
	}

	public Speed1 setUnitOfResult(int unitOfResult) {
		this.unitOfResult = unitOfResult;
		return this;
	}

	public int getUnitOfResult() {
		return unitOfResult;
	}

	@Override
	public String getFormula() {
		return "v = Q / A";
	}

    @Deprecated
    private Speed1 setHasCustomUnits(boolean hasCustomUnits) {
        this.hasCustomUnits = hasCustomUnits;
        return this;
	}

    @Deprecated
    protected static Speed1 getInstance(double flowRate, double area) {
        if (!(instance instanceof Speed1))
            instance = new Speed1();
		return instance
			.setFlowRate(flowRate)
			.setArea(area)
			.setHasCustomUnits(false)
            .calculate();
    }

    @Deprecated
	protected static Speed1 getInstance(double flowRate, 
                                        int flowRateUnit,
                                        double area,
                                        int areaUnit,
                                        int unitOfResult) {
        if (!(instance instanceof Speed1))
            instance = new Speed1();
		return instance
		    .setFlowRate(flowRate)
		    .setFlowRateUnit(flowRateUnit)
		    .setArea(area)
		    .setAreaUnit(areaUnit)
		    .setUnitOfResult(unitOfResult)
		    .setHasCustomUnits(true)
            .calculate();
    }
}
