package com.gabrielMJr.twaire.physic.hydrodynamics.fluidflow;

public class FluidFlow implements FluidFlowIF
{
    private static FluidFlow instance;
    private static Area area;
    private static FlowRate1 flowRate1;
    private static FlowRate2 flowRate2;
    private static FlowRate3 flowRate3;
    private static Ray ray;
    private static Speed1 speed1;
    private static Speed2 speed2;
    private static Time time;
    private static Volume volume;

    public FluidFlow ()
	{
        area = Area.getInstance();
        flowRate1 = FlowRate1.getInstance();
        flowRate2 = FlowRate2.getInstance();
        flowRate3 = FlowRate3.getInstance();
        ray = Ray.getInstance();
        speed1 = Speed1.getInstance();
        speed2 = Speed2.getInstance();
        time = Time.getInstance();
        volume = Volume.getInstance();
    }


    // Q = V/∆t
    @Override
    public String flowRate1 (double volume, double time)
	{
        return flowRate1.flowRate(volume, time);
    }

    @Override
    public String flowRate1 (
		double volume, 
		String volumeUnit, 
		double time, 
		String timeUnit, 
		String unitOfResult)
	{
        return flowRate1.flowRate(
			volume, 
			volumeUnit, 
			time, 
			timeUnit, 
			unitOfResult);
    }


    // Q = A * v
    @Override
    public String flowRate2 (double area, double velocity)
	{
        return flowRate2.flowRate(area, velocity);
    }


    @Override
    public String flowRate2 (
		double area, 
		String areaUnit, 
		double velocity, 
		String velocityUnit, 
		String unitOfResult)
	{
		return flowRate2.flowRate(
			area, 
			areaUnit, 
			velocity, 
			velocityUnit, 
			unitOfResult);
    }

    // Q = π * r² * v
    @Override
    public String flowRate3 (
		double ray, 
		double velocity,
		int resultOrStep)
	{
        return flowRate3.flowRate(
			ray, 
			velocity, 
			resultOrStep);
    }

    @Override
    public String flowRate3 (
		double ray, 
		String rayUnit,
		double velocity,
		String velocityUnit,
		String unitOfResult,
		int resultOrStep)
	{
        return flowRate3.flowRate(
			ray,
			rayUnit,
			velocity,
			velocityUnit,
			unitOfResult,
			resultOrStep);
    }


    // ∆t = V/ Q
    @Override
    public String time (double volume, double flowRate)
	{
        return time.time(volume, flowRate);
    }

    @Override
    public String time (
		double volume, 
		String volumeUnit,
		double flowRate,
		String flowRateUnit, 
		String unitOfResult)
	{
        return time.time(
			volume,
			volumeUnit,
			flowRate,
			flowRateUnit,
			unitOfResult);
    }


    // V = ∆t * Q
    @Override
    public String volume (double time, double flowRate)
	{
        return volume.volume(time, flowRate);
    }

    @Override
    public String volume (
		double time, 
		String timeUnit, 
		double flowRate, 
		String flowRateUnit, 
		String unitOfResult)
	{
        return volume.volume(
			time,
			timeUnit,
			flowRate,
			flowRateUnit,
			unitOfResult);
    }


    // v = Q / A
    @Override
    public String speed1 (double flowRate, double area)
	{
        return speed1.speed(flowRate, area);
    }

    @Override
    public String speed1 (
		double flowRate, 
		String flowRateUnit,
		double area, 
		String areaUnit, 
		String unitOfResult)
	{
        return speed1.speed(
			flowRate,
			flowRateUnit,
			area,
			areaUnit,
			unitOfResult);
    }


    // v = Q / (π * r²)]
    @Override
    public String speed2 (
		double flowRate, 
		double ray, 
		int resultOrStep)
	{
        return speed2.speed(
			flowRate, 
			ray, 
			resultOrStep);
    }

    @Override
    public String speed2 (
		double flowRate,
		String flowRateUnit, 
		double ray, 
		String raioUnit,
		String unitOfResult,
		int resultOrStep)
	{
        return speed2.speed(
			flowRate,
			flowRateUnit,
			ray,
			raioUnit,
			unitOfResult,
			resultOrStep);
    }


    // A = Q / v
    @Override
    public String area (double flowRate, double velocity)
	{
		return area.area(flowRate, velocity);
    }

    @Override
    public String area (
		double flowRate, 
		String flowRateUnit, 
		double velocity, 
		String velocityUnit,
		String unitOfResult,
		int resultOrStep)
	{
        return area.area(
			flowRate,
			flowRateUnit, 
			velocity,
			velocityUnit,
			unitOfResult,
			resultOrStep);
    }


    // r = √[Q / (π * v)]
    @Override
    public String ray (
		double flowRate, 
		double velocity, 
		int resultOrStep)
	{
        return ray.ray(
			flowRate, 
			velocity,
			resultOrStep);
    }

    @Override
    public String ray (
		double flowRate,
		String flowRateUnit, 
		double velocity, 
		String velocityUnit,
		String unitOfResult,
		int resultOrStep)
	{
        return ray.ray(
			flowRate, 
			velocity,
			resultOrStep);
    }

    protected static FluidFlow getInstance ()
	{
        if (instance == null)
		{
            instance = new FluidFlow();
        }
        return instance;
    }
}
