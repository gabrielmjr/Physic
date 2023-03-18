package com.gabrielMJr.twaire.physic.hydrodynamics.fluidflow;

public class FluidFlow implements FluidFlowIF {
    private static FluidFlow instance;
    private static Area area;
    private static Ray ray;
    private static Speed1 speed1;
    private static Speed2 speed2;
    private static Volume volume;

    public FluidFlow () {
        area = Area.getInstance();
        ray = Ray.getInstance();
        speed1 = Speed1.getInstance();
        speed2 = Speed2.getInstance();
        volume = Volume.getInstance();
    }

    // Q = V/∆t
    @Override
    public FlowRate1 flowRate1 (double volume, double time) {
        return FlowRate1.getInstance(volume, time);
    }

    @Override
    public FlowRate1 flowRate1 (double volume, 
								int volumeUnit, 
								double time, 
								int timeUnit, 
								int unitOfResult) {
        return FlowRate1.getInstance(
			volume, 
			volumeUnit, 
			time, 
			timeUnit, 
			unitOfResult);
    }

    // Q = A * v
    @Override
    public FlowRate2 flowRate2 (double area, double velocity) {
        return FlowRate2.getInstance(area, velocity);
    }

    @Override
    public FlowRate2 flowRate2 (
		double area, 
		int areaUnit, 
		double velocity, 
		int velocityUnit, 
		int unitOfResult) {
		return FlowRate2.getInstance(area, 
									 areaUnit, 
									 velocity, 
									 velocityUnit, 
									 unitOfResult);
    }

    // Q = π * r² * v
    @Override
    public FlowRate3 flowRate3 (
		double ray, 
		double velocity) {
        return FlowRate3.getInstance(
			ray, 
			velocity);
    }

    @Override
    public FlowRate3 flowRate3 (
		double ray, 
		int rayUnit,
		double velocity,
		int velocityUnit,
		int unitOfResult) {
        return FlowRate3.getInstance(
			ray,
			rayUnit,
			velocity,
			velocityUnit,
			unitOfResult);
    }

    // ∆t = V/ Q
    @Override
    public Time time (double volume, double flowRate) {
        return Time.getInstance(volume, flowRate);
    }

    @Override
    public Time time (
		double volume, 
		int volumeUnit,
		double flowRate,
		int flowRateUnit, 
		int unitOfResult) {
        return Time.getInstance(
			volume,
			volumeUnit,
			flowRate,
			flowRateUnit,
			unitOfResult);
    }

    // V = ∆t * Q
    @Override
    public String volume (double time, double flowRate) {
        return volume.volume(time, flowRate);
    }

    @Override
    public String volume (
		double time, 
		String timeUnit, 
		double flowRate, 
		String flowRateUnit, 
		String unitOfResult) {
        return volume.volume(
			time,
			timeUnit,
			flowRate,
			flowRateUnit,
			unitOfResult);
    }

    // v = Q / A
    @Override
    public String speed1 (double flowRate, double area) {
        return speed1.speed(flowRate, area);
    }

    @Override
    public String speed1 (
		double flowRate, 
		String flowRateUnit,
		double area, 
		String areaUnit, 
		String unitOfResult) {
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
		int resultOrStep) {
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
		int resultOrStep) {
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
    public String area (double flowRate, double velocity) {
		return area.area(flowRate, velocity);
    }

    @Override
    public String area (
		double flowRate, 
		String flowRateUnit, 
		double velocity, 
		String velocityUnit,
		String unitOfResult,
		int resultOrStep) {
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
		int resultOrStep) {
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
		int resultOrStep) {
        return ray.ray(
			flowRate, 
			velocity,
			resultOrStep);
    }

    protected static FluidFlow getInstance () {
        if (!(instance instanceof FluidFlow))
            instance = new FluidFlow();
        return instance;
    }
}
