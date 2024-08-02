package com.mjrfusion.code.physics.hydrodynamics.fluidflow;

import com.mjrfusion.code.physics.Calculation;
import com.mjrfusion.code.physics.units.Unit;

public class Time extends Calculation {
    @Deprecated
    private static Time instance;

	private double volume;
	private double flowRate;

	private int volumeUnit;
	private int flowRateUnit;
	private int unitOfResult;

	private double step1;
	private boolean hasCustomUnits;

    protected Time() {}

    protected Time(double volume, double flowRate) {
        this.volume = volume;
        this.flowRate = flowRate;
        hasCustomUnits = false;
        calculate();
    }

    protected Time(double volume, 
                   int volumeUnit, 
                   double flowRate, 
                   int flowRateUnit,
                   int unitOfResult) {
        this.volume = volume;
        this.flowRate = flowRate;
        this.volumeUnit = volumeUnit;
        this.flowRateUnit = flowRateUnit;
        this.unitOfResult = unitOfResult;
        hasCustomUnits = true;
        calculate();
    }


    @Override
    public Time calculate() {
        if (hasCustomUnits)
            calculateWithCustomUnits();
        else
            calculateWithoutCustomUnits();
        return this;
    }

	private void calculateWithCustomUnits() {}

	private void calculateWithoutCustomUnits() {
		step1 = volume / flowRate;
	}

	@Override
	public Unit getResult() {
		return null; //step1;
	}

	@Override
	public String getSteps() {
		return "∆t = " + volume + "m³ ÷ " + flowRate + "m³/s"
			+ "\n∆t = " + step1 + "s";
	}

    public Time setVolume(double volume) {
		this.volume = volume;
		return this;
	}

	public double getVolume() {
		return volume;
	}

	public Time setFlowRate(double flowRate) {
		this.flowRate = flowRate;
		return this;
	}

	public double getFlowRate() {
		return flowRate;
	}

	public Time setVolumeUnit(int volumeUnit) {
		this.volumeUnit = volumeUnit;
		return this;
	}

	public int getVolumeUnit() {
		return volumeUnit;
	}

	public Time setFlowRateUnit(int flowRateUnit) {
		this.flowRateUnit = flowRateUnit;
		return this;
	}

	public int getFlowRateUnit() {
		return flowRateUnit;
	}

	public Time setUnitOfResult(int unitOfResult) {
		this.unitOfResult = unitOfResult;
		return this;
	}

	public int getUnitOfResult() {
		return unitOfResult;
	}

	@Override
	public String getFormula() {
		return "∆t = V/ Q";
	}

    @Deprecated
    private Time setHasCustUnits(boolean hasCustomUnits) {
        this.hasCustomUnits = hasCustomUnits;
        return this;
	}

    @Deprecated
    protected static Time getInstance(double volume, double flowRate) {
        if (!(instance instanceof Time))
			instance = new Time();
        return instance.setVolume(volume)
		    .setFlowRate(flowRate)
		    .setHasCustUnits(false)
            .calculate();
    }

    @Deprecated
	protected static Time getInstance(double volume,
                                      int volumeUnit,
                                      double flowRate,
                                      int flowRateUnit,
                                      int unitOfResult) {
        if (!(instance instanceof Time))
			instance = new Time();
        return instance.setVolume(volume)
		    .setVolumeUnit(volumeUnit)
		    .setFlowRate(flowRate)
		    .setFlowRateUnit(flowRateUnit)
		    .setUnitOfResult(unitOfResult)
		    .setHasCustUnits(true)
            .calculate();
    }
}
