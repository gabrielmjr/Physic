package com.mjrfusion.code.physics.hydrodynamics.fluidflow;

import com.mjrfusion.code.physics.Calculation;
import com.mjrfusion.code.physics.units.Unit;

public class Volume extends Calculation {
    @Deprecated
    private static Volume instance;

	private double deltaTime;
	private double flowRate;

	private int deltaTimeUnit;
	private int flowRateUnit;
	private int unitOfResult;

	private double step1;
	private boolean hasCustomUnits;

    protected Volume() {}

    protected Volume(double deltaTime, double flowRate) {
        this.deltaTime = deltaTime;
        this.flowRate = flowRate;
        hasCustomUnits = false;
        calculate();
    }

    protected Volume(double deltaTime, 
                     int deltaTimeUnit,
                     double flowRate, 
                     int flowRateUnit, 
                     int unitOfResult) {
        this.deltaTime = deltaTime;
        this.flowRate = flowRate;
        this.deltaTimeUnit = deltaTimeUnit;
        this.flowRateUnit = flowRateUnit;
        this.unitOfResult = unitOfResult;
        hasCustomUnits = false;
        calculate();
    }


    @Override
    public Volume calculate() {
        if (hasCustomUnits)
            calculateWithCustomUnits();
        else
            calculateWithoutCustomUnits();
        return this;
    }

	private void calculateWithCustomUnits() {
	}

	private void calculateWithoutCustomUnits() {
		step1 = deltaTime * flowRate;
	}

	@Override
	public Unit getResult() {
		return null; //step1;
	}

	@Override
	public String getSteps() {
		if (hasCustomUnits)
			return null;
		return "V = " + deltaTime + "s × " + flowRate + "m³/s"
			+ "\nV = " + step1 + "m³";
	}

    public Volume setDeltaTime(double deltaTime) {
		this.deltaTime = deltaTime;
		return this;
	}

	public double getDeltaTime() {
		return deltaTime;
	}

	public Volume setFlowRate(double flowRate) {
		this.flowRate = flowRate;
		return this;
	}

	public double getFlowRate() {
		return flowRate;
	}

	public Volume setDeltaTimeUnit(int deltaTimeUnit) {
		this.deltaTimeUnit = deltaTimeUnit;
		return this;
	}

	public int getDeltaTimeUnit() {
		return deltaTimeUnit;
	}

	public Volume setFlowRateUnit(int flowRateUnit) {
		this.flowRateUnit = flowRateUnit;
		return this;
	}

	public int getFlowRateUnit() {
		return flowRateUnit;
	}

	public Volume setUnitOfResult(int unitOfResult) {
		this.unitOfResult = unitOfResult;
		return this;
	}

	public int getUnitOfResult() {
		return unitOfResult;
	}

	@Override
	public String getFormula() {
		return "V = ∆t × Q";
	}

    @Deprecated
    private Volume setHasCustomUnits(boolean hasCustomUnits) {
        this.hasCustomUnits = hasCustomUnits;
        return this;
	}

    @Deprecated
    protected static Volume getInstance(double deltaTime, double flowRate) {
        if (!(instance instanceof Volume))
			instance = new Volume();
		return instance.setDeltaTime(deltaTime)
		    .setFlowRate(flowRate)
		    .setHasCustomUnits(false)
            .calculate();
    }

    @Deprecated
	protected static Volume getInstance(double deltaTime,
                                        int deltaTimeUnit,
                                        double flowRate,
                                        int flowRateUnit,
                                        int unitOfResult) {
        if (!(instance instanceof Volume))
			instance = new Volume();
		return instance.setDeltaTime(deltaTime)
		    .setDeltaTimeUnit(deltaTimeUnit)
            .setFlowRate(flowRate)
		    .setFlowRateUnit(flowRateUnit)
		    .setUnitOfResult(unitOfResult)
		    .setHasCustomUnits(true)
            .calculate();
    }
}
