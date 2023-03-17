package com.gabrielMJr.twaire.physic.hydrodynamics.fluidflow;

public interface FluidFlowIF {
    public abstract FlowRate1 flowRate1 (
	    double volume, 
		double time);

    public abstract FlowRate1 flowRate1 (
		double volume,
		int volumeUnit,
		double time, 
		int timeUnit,
		int unitOfResult);

    public abstract FlowRate2 flowRate2 (
		double area,
		double velocity);

    public abstract FlowRate2 flowRate2 (
		double area,
		int areaUnit,
		double velocity,
		int velocityUnit, 
		int unitOfResult);

    public abstract FlowRate3 flowRate3 (
		double ray,
		double velocity);  

    public abstract FlowRate3 flowRate3 (
		double ray, 
		int rayUnit, 
		double velocity,
		int velocityUnit,
		int unitOfResult);

    public abstract String time (
		double volume,
		double flowRate);

    public abstract String time (
        double volume, String volumeUnit, 
        double flowRate, String flowRateUnit,
        String unitOfResult);

    public abstract String volume (
		double time, 
		double flowRate);

    public abstract String volume (
		double time, String timeUnit,
		double flowRate, String flowRateUnit,
		String unitOfResult);

    public abstract String speed1 (
		double flowRate, 
		double area);

    public abstract String speed1 (
		double flowRate, String flowRateUnit, 
		double area, String areaUnit, 
		String unitOfResult);

    public abstract String speed2 (
		double flowRate,
		double ray,
		int resultOrStep);

    public abstract String speed2 (
		double fluidFlow, String flowRateUnit, 
		double ray, String rayUnit,
		String unitOfResult,
		int resultOrStep);

    public abstract String area (
	    double flowRate, 
		double velocity);

    public abstract String area (
		double fluidFlow, String flowRateUnit, 
		double velocity, String velocityUnit, 
		String unitOfResult,
		int resultOrStep);

    public abstract String ray (
		double flowRate,
		double velocity,
		int resultOrStep);

    public abstract String ray (
		double flowRate, String flowRateUnit, 
		double velocity, String velocityUnit, 
		String unitOfResult,
		int resultOrStep);
}
