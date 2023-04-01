package com.gabrielmjr.twaire.physic.hydrodynamics.fluidflow;

// v = Q / A
final class Speed1 {
    private static Speed1 instance;

	private double flowRate;
	private double area;

	private int flowRateUnit;
	private int areaUnit;
	private int unitOfResult;

	private double step1;
	private boolean hasCustomUnits;

    private Speed1 () {}

	private Speed1 setHasCustomUnits (boolean hasCustomUnits) {
		this.hasCustomUnits = hasCustomUnits;
		if (hasCustomUnits)

			calculateWithCustomUnit();
		else
		    calculateWithoutCustomUnit();
		return this;
	}

	private void calculateWithCustomUnit () {}

	private void calculateWithoutCustomUnit () {
		step1 = flowRate / area;
	}

	public double getResult () {
		return step1;
	}

	public String getSteps () {
		if (hasCustomUnits)
			return null;
		return "v = " + flowRate + "m³/s ÷ " + area + "m²"
			+ "\nv = " + step1 + "m/s";
	}

    private Speed1 setFlowRate (double flowRate) {
		this.flowRate = flowRate;
		return this;
	}

	public double getFlowRate () {
		return flowRate;
	}

	private Speed1 setArea (double area) {
		this.area = area;
		return this;
	}

	public double getArea () {
		return area;
	}

	private Speed1 setFlowRateUnit (int flowRateUnit) {
		this.flowRateUnit = flowRateUnit;
		return this;
	}

	public int getFlowRateUnit () {
		return flowRateUnit;
	}

	private Speed1 setAreaUnit (int areaUnit) {
		this.areaUnit = areaUnit;
		return this;
	}

	public int getAreaUnit () {
		return areaUnit;
	}

	private Speed1 setUnitOfResult (int unitOfResult) {
		this.unitOfResult = unitOfResult;
		return this;
	}

	public int getUnitOfResult () {
		return unitOfResult;
	}

    protected static Speed1 getInstance (double flowRate, double area) {
        if (!(instance instanceof Speed1))
            instance = new Speed1();
		return instance
			.setFlowRate(flowRate)
			.setArea(area)
			.setHasCustomUnits(false);
    }

	protected static Speed1 getInstance (double flowRate, 
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
		    .setHasCustomUnits(true);
    }
}
