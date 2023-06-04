package com.mjr.twaire.code.physic.hydrodynamics.fluidflow;

import com.mjr.twaire.code.physic.Calculations;

public final class Time extends Calculations { 
    private static Time instance;
	
	private double volume;
	private double flowRate;

	private int volumeUnit;
	private int flowRateUnit;
	private int unitOfResult;

	private double step1;
	private boolean hasCustomUnits;

    private Time () {}

    @Override
    public Time calculate() {
        if (hasCustomUnits)
            calculateWithCustomUnits();
        else
            calculateWithoutCustomUnits();
        return this;
    }

	private void calculateWithCustomUnits () {}

	private void calculateWithoutCustomUnits () {
		step1 = volume / flowRate;
	}

	@Override
	public double getResult () {
		return step1;
	}

	@Override
	public String getSteps () {
		return "∆t = " + volume + "m³ ÷ " + flowRate + "m³/s"
			+ "\n∆t = " + step1 + "s";
	}

    private Time setVolume (double volume) {
		this.volume = volume;
		return this;
	}

	public double getVolume () {
		return volume;
	}

	private Time setFlowRate (double flowRate) {
		this.flowRate = flowRate;
		return this;
	}

	public double getFlowRate () {
		return flowRate;
	}

	private Time setVolumeUnit (int volumeUnit) {
		this.volumeUnit = volumeUnit;
		return this;
	}

	public int getVolumeUnit () {
		return volumeUnit;
	}

	private Time setFlowRateUnit (int flowRateUnit) {
		this.flowRateUnit = flowRateUnit;
		return this;
	}

	public int getFlowRateUnit () {
		return flowRateUnit;
	}

	private Time setUnitOfResult (int unitOfResult) {
		this.unitOfResult = unitOfResult;
		return this;
	}

	public int getUnitOfResult () {
		return unitOfResult;
	}
	
	@Override
	public String getFormula() {
		return "∆t = V/ Q";
	}
    
    private Time setHasCustUnits (boolean hasCustomUnits) {
        this.hasCustomUnits = hasCustomUnits;
        return this;
	}

    protected static Time getInstance (double volume, double flowRate) {
        if (!(instance instanceof Time))
			instance = new Time();
        return instance.setVolume(volume)
		    .setFlowRate(flowRate)
		    .setHasCustUnits(false)
            .calculate();
    }

	protected static Time getInstance (double volume,
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
