package com.mjrfusion.code.physics.hydrodynamics.fluidflow;

public interface IFluidFlow {
	FlowRate1 flowRate1 (double volume, double time);

	FlowRate1 flowRate1 (double volume, int volumeUnit, double time, int timeUnit, int unitOfResult);
        
	FlowRate1 flowRate1();

	FlowRate2 flowRate2 (double area, double velopcity);

    FlowRate2 flowRate2 (double area, int areaUnit, double velocity, int velocityUnit, int unitOfResult);
        
    FlowRate2 flowRate2();

    FlowRate3 flowRate3 (double ray, double velocity);

    FlowRate3 flowRate3 (double ray, int rayUnit, double velocity, int velocityUnit, int unitOfResult);
        
    FlowRate3 flowRate3();

    Time time (double volume, double flowRate);

	Time time (double volume, int volumeUnit, double flowRate, int flowRateUnit, int unitOfResult);
        
	Time time();

    Volume volume (double time, double flowRate);

    Volume volume (double time, int timeUnit, double flowRate, int flowRateUnit, int unitOfResult);
        
	Volume volume();

    Speed1 speed1 (double flowRate, double area);

    Speed1 speed1 (double flowRate, int flowRateUnit, double area, int areaUnit, int unitOfResult);

    Speed1 speed1();

    Speed2 speed2 (double flowRate, double ray);

    Speed2 speed2 (double fluidFlow, int flowRateUnit, double ray, int rayUnit, int unitOfResult);

    Speed2 speed2();

    Area area (double flowRate, double velocity);

    Area area (double fluidFlow, int flowRateUnit, double velocity, int velocityUnit, int unitOfResult);

    Area area();

    Ray ray (double flowRate, double velocity);

    Ray ray (double flowRate, int flowRateUnit, double velocity, int velocityUnit, int unitOfResult);

    Ray ray();
}
