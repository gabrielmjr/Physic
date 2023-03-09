package com.gabrielMJr.twaire.physic.hydrodynamics.fluidflow;

final class FlowRate2 {
    private static FlowRate2 instance;

    private FlowRate2 () {}

    protected String flowRate (double area, double velocity) {
        return String.valueOf(area * velocity);
    }

    protected String flowRate (
		double area,
		String area_unit,
		double velocity,
		String velocityUnit, 
		String unitOfResult) {
        return null;
    }

    public static FlowRate2 getInstance () {
        if (!(instance instanceof FlowRate2))
            instance = new FlowRate2();
        return instance;
    }
}
