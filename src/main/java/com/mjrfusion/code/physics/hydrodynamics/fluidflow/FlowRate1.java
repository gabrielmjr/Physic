package com.mjrfusion.code.physics.hydrodynamics.fluidflow;

import com.mjrfusion.code.physics.Calculation;
import com.mjrfusion.code.physics.units.Unit;

public final class FlowRate1 extends Calculation {
    @Deprecated
    private static FlowRate1 instance;

	private double volume;
	private double deltaTime;

	private int volumeUnit;
	private int deltaTimeUnit;
	private int unitOfResult;

	private double step1;
	private boolean hasCustomUnits;

    protected FlowRate1() {}

    protected FlowRate1(double volume, double deltaTime) {
        this.volume = volume;
        this.deltaTime = deltaTime;
        hasCustomUnits = false;
        calculate();
    }

    protected FlowRate1(double volume,
                        int volumeUnit, 
                        double deltaTime,
                        int deltaTimeUnit,
                        int unitOfResult) {
        this.volume = volume;
        this.deltaTime = deltaTime;
        this.volumeUnit = volumeUnit;
        this.deltaTimeUnit = deltaTimeUnit;
        this.unitOfResult = unitOfResult;
        hasCustomUnits = true;
        calculate();
    }

    @Override
    public FlowRate1 calculate() {
        if (hasCustomUnits)
            calculateWithCustomUnits();
        else
            calculateWithoutCustomUnits();
        return this;
    }

	private void calculateWithCustomUnits() {
    }

	private void calculateWithoutCustomUnits() {
		step1 = volume / deltaTime;
	}

	@Override
	public Unit getResult() {
		return null; //step1;
	}

	@Override
	public String getSteps() {
		if (hasCustomUnits) 
			return null;
		else {
			return "Q = " + volume + " ÷ " + deltaTime
				+ "\nQ = " + step1 + "m³/s";
		}
	}

	public FlowRate1 setVolume(double volume) {
		this.volume = volume;
		return this;
	}

	public double getVolume() {
		return volume;
	}

	public FlowRate1 setDeltaTime(double deltaTime) {
		this.deltaTime = deltaTime;
		return this;
	}

	public double getDeltaTime() {
		return deltaTime;
	}

	public FlowRate1 setVolumeUnit(int volumeUnit) {
		this.volumeUnit = volumeUnit;
		return this;
	}

	public int getVolumeUnit() {
		return volumeUnit;
	}

	public FlowRate1 setDeltaTimeUnit(int deltaTimeUnit) {
		this.deltaTimeUnit = deltaTimeUnit;
		return this;
	}

	public int getDeltaTimeUnit() {
		return deltaTimeUnit;
	}

	public FlowRate1 setUnitOfResult(int unitOfResult) {
		this.unitOfResult = unitOfResult;
		return this;
	}

	public int getUnitOfResult() {
		return unitOfResult;
	}

	@Override
	public String getFormula() {
		return "Q = V / ∆t";
	}

    @Deprecated
    private FlowRate1 setHasCustomUnits(boolean hasCustomUnits) {
        this.hasCustomUnits = hasCustomUnits;
        return this;
	}

    @Deprecated
    protected static FlowRate1 getInstance(double volume, double time) {
        if (!(instance instanceof FlowRate1))
            instance = new FlowRate1();
		return instance.setVolume(volume)
		    .setDeltaTime(time)
		    .setHasCustomUnits(false)
            .calculate();
    }

    @Deprecated
	protected static FlowRate1 getInstance(double volume, 
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
