package com.mjr.twaire.code.physic.hydrodynamics.fluidflow;

import com.mjr.twaire.code.physic.Calculations;

public final class FlowRate1 extends Calculations {
    private static FlowRate1 instance;

	private double volume;
	private double deltaTime;

	private int volumeUnit;
	private int deltaTimeUnit;
	private int unitOfResult;

	private double step1;
	private boolean hasCustomUnits;

    private FlowRate1 () {}
    
    @Override
    public FlowRate1 calculate() {
        if (hasCustomUnits)
            calculateWithCustomUnits();
        else
            calculateWithoutCustomUnits();
        return this;
    }

	private void calculateWithCustomUnits () {
    }

	private void calculateWithoutCustomUnits () {
		step1 = volume / deltaTime;
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
			return "Q = " + volume + " ÷ " + deltaTime
				+ "\nQ = " + step1 + "m³/s";
		}
	}

	private FlowRate1 setVolume (double volume) {
		this.volume = volume;
		return this;
	}

	public double getVolume () {
		return volume;
	}

	private FlowRate1 setDeltaTime (double deltaTime) {
		this.deltaTime = deltaTime;
		return this;
	}

	public double getDeltaTime () {
		return deltaTime;
	}

	private FlowRate1 setVolumeUnit (int volumeUnit) {
		this.volumeUnit = volumeUnit;
		return this;
	}

	public int getVolumeUnit () {
		return volumeUnit;
	}

	private FlowRate1 setDeltaTimeUnit (int deltaTimeUnit) {
		this.deltaTimeUnit = deltaTimeUnit;
		return this;
	}

	public int getDeltaTimeUnit () {
		return deltaTimeUnit;
	}

	private FlowRate1 setUnitOfResult (int unitOfResult) {
		this.unitOfResult = unitOfResult;
		return this;
	}

	public int getUnitOfResult () {
		return unitOfResult;
	}
	
	@Override
	public String getFormula() {
		return "Q = V / ∆t";
	}
    
    private FlowRate1 setHasCustomUnits (boolean hasCustomUnits) {
        this.hasCustomUnits = hasCustomUnits;
        return this;
	}

    protected static FlowRate1 getInstance (double volume, double time) {
        if (!(instance instanceof FlowRate1))
            instance = new FlowRate1();
		return instance.setVolume(volume)
		    .setDeltaTime(time)
		    .setHasCustomUnits(false)
            .calculate();
    }

	protected static FlowRate1 getInstance (double volume, 
										 int volumeUnit,
										 double time,
										 int deltaTimeUnit,
										 int unitOfResult) {
        if (!(instance instanceof FlowRate1))
            instance = new FlowRate1();
		return instance.setVolume(volume)
		    .setVolumeUnit(volumeUnit)
		    .setDeltaTime(time)
		    .setDeltaTimeUnit(deltaTimeUnit)
		    .setUnitOfResult(unitOfResult)
		    .setHasCustomUnits(true)
            .calculate();
    }
}
