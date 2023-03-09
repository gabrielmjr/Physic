package com.gabrielMJr.twaire.physic.hydrodynamics.fluidflow;

public interface FluidFlowIF {
    public abstract String flowRate1 (
	    double volume, 
		double time);

    public abstract String flowRate1 (
		double volume, String volumeUnit,
		double time, String timeUnit,
		String unitOfResult);

    public abstract String flowRate2 (
		double area,
		double velocity);

    public abstract String flowRate2 (
		double area, String areaUnit,
		double velocity, String velocityUnit, 
		String unitOfResult);

    public abstract String flowRate3 (
		double ray,
		double velocity,
		int resultOrStep);  

    public abstract String flowRate3 (
		double ray, String rayUnit, 
		double velocity, String velocityUnit,
		String unitOfResult,
		int resultOrStep);

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
