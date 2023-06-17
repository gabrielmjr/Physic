package com.mjr.twaire.code.physic.hydrodynamics.fluidflow;

import com.mjr.twaire.code.physic.Calculation;
import java.math.BigDecimal;

public final class FlowRate2 extends Calculation {
    @Deprecated
    private static FlowRate2 instance;

	private double area;
	private double velocity;

	private int areaUnit;
	private int velocityUnit;
	private int unitOfResult;

	private double step1;
	private boolean hasCustomUnits;

    protected FlowRate2() {}

    protected FlowRate2(double area, double velocity) {
        this.area = area;
        this.velocity = velocity;
        hasCustomUnits = false;
        calculate();
    }

    protected FlowRate2(double area,
                        int areaUnit,
                        double velocity,
                        int velocityUnit, 
                        int unitOfResult) {
        this.area = area;
        this.velocity = velocity;
        this.areaUnit = areaUnit;
        this.velocityUnit = velocityUnit;
        this.unitOfResult = unitOfResult;
        hasCustomUnits = true;
        calculate();
    }

    @Override
    public FlowRate2 calculate() {
        if (hasCustomUnits)
            calculateWithCustomUnits();
        else
            calculateWithoutCustomUnits();
        return this;
    }

	private void calculateWithCustomUnits() {}

	private void calculateWithoutCustomUnits() {
		step1 = area * velocity;
	}

	@Override
	public BigDecimal getResult() {
		return null; //step1;
	}

	@Override
	public String getSteps() {
		if (hasCustomUnits)
			return null;
	    else {
			return "Q = " + area + " × " + velocity
			    + "\nQ = " + step1 + "m³/s";
		}
	}

	public FlowRate2 setArea(double area) {
		this.area = area;
		return this;
	}

	public double getArea() {
		return area;
	}

	public FlowRate2 setVelocity(double velocity) {
		this.velocity = velocity;
		return this;
	}

	public double getVelocity() {
		return velocity;
	}

	public FlowRate2 setAreaUnit(int areaUnit) {
		this.areaUnit = areaUnit;
		return this;
	}

	public int getAreaUnit() {
		return areaUnit;
	}

	public FlowRate2 setVelocityUnit(int velocityUnit) {
		this.velocityUnit = velocityUnit;
		return this;
	}

	public int getVelocityUnit() {
		return velocityUnit;
	}

	public FlowRate2 setUnitOfResult(int unitOfResult) {
		this.unitOfResult = unitOfResult;
		return this;
	}

	public int getUnitOfResult() {
		return unitOfResult;
	}

	@Override
	public String getFormula() {
		return "Q = A * v";
	}

    @Deprecated
    private FlowRate2 setHasCustomUnits(boolean hasCustomUnits) {
        this.hasCustomUnits = hasCustomUnits;
        return this;
	}

    @Deprecated
    protected static FlowRate2 getInstance(double area, double velocity) {
        if (!(instance instanceof FlowRate2))
            instance = new FlowRate2();
        return instance.setArea(area)
		    .setVelocity(velocity)
		    .setHasCustomUnits(false)
            .calculate();
    }

    @Deprecated
	protected static FlowRate2 getInstance(double area,
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
		    .setHasCustomUnits(true)
            .calculate();
    }
}
