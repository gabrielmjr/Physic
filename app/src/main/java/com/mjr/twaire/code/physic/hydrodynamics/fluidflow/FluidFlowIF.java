package com.mjr.twaire.code.physic.hydrodynamics.fluidflow;

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
        
    public abstract FlowRate1 flowRate1();

    public abstract FlowRate2 flowRate2 (
		double area,
		double velopcity);

    public abstract FlowRate2 flowRate2 (
		double area,
		int areaUnit,
		double velocity,
		int velocityUnit, 
		int unitOfResult);
        
    public abstract FlowRate2 flowRate2();

    public abstract FlowRate3 flowRate3 (
		double ray,
		double velocity);  

    public abstract FlowRate3 flowRate3 (
		double ray, 
		int rayUnit, 
		double velocity,
		int velocityUnit,
		int unitOfResult);
        
    public abstract FlowRate3 flowRate3();

    public abstract Time time (
		double volume,
		double flowRate);

    public abstract Time time (
        double volume, 
		int volumeUnit, 
        double flowRate,
		int flowRateUnit,
        int unitOfResult);
        
    public abstract Time time();

    public abstract Volume volume (
		double time, 
		double flowRate);

    public abstract Volume volume (
		double time, 
		int timeUnit,
		double flowRate,
		int flowRateUnit,
		int unitOfResult);
        
    public abstract Volume volume();

    public abstract Speed1 speed1 (
		double flowRate, 
		double area);

    public abstract Speed1 speed1 (
		double flowRate,
		int flowRateUnit, 
		double area,
		int areaUnit, 
		int unitOfResult);

    public abstract Speed2 speed2 (
		double flowRate,
		double ray);

    public abstract Speed2 speed2 (
		double fluidFlow,
		int flowRateUnit, 
		double ray,
		int rayUnit,
		int unitOfResult);

    public abstract Area area (
	    double flowRate, 
		double velocity);

    public abstract Area area (
		double fluidFlow,
		int flowRateUnit, 
		double velocity,
		int velocityUnit, 
		int unitOfResult);

    public abstract Ray ray (
		double flowRate,
		double velocity);

    public abstract Ray ray (
		double flowRate,
		int flowRateUnit, 
		double velocity,
		int velocityUnit, 
		int unitOfResult);
}
