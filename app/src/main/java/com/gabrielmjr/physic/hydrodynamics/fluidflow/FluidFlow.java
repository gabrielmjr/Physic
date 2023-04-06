package com.gabrielmjr.physic.hydrodynamics.fluidflow;

public class FluidFlow implements FluidFlowIF {
    private static FluidFlow instance;

    public FluidFlow () {}

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
        return FlowRate1.getInstance(volume, 
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
    public FlowRate3 flowRate3 (double ray, 
								int rayUnit,
								double velocity,
								int velocityUnit,
								int unitOfResult) {
        return FlowRate3.getInstance(ray,
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
    public Time time (double volume, 
					  int volumeUnit,
					  double flowRate,
					  int flowRateUnit, 
					  int unitOfResult) {
        return Time.getInstance(volume,
								volumeUnit,
								flowRate,
								flowRateUnit,
								unitOfResult);
    }

    // V = ∆t * Q
    @Override
    public Volume volume (double time, double flowRate) {
        return Volume.getInstance(time, flowRate);
    }

    @Override
    public Volume volume (double time, 
						  int timeUnit, 
						  double flowRate, 
						  int flowRateUnit, 
						  int unitOfResult) {
        return Volume.getInstance(time,
								  timeUnit,
								  flowRate,
								  flowRateUnit,
								  unitOfResult);
    }

    // v = Q / A
    @Override
    public Speed1 speed1 (double flowRate, double area) {
        return Speed1.getInstance(flowRate, area);
    }

    @Override
    public Speed1 speed1 (double flowRate, 
						  int flowRateUnit,
						  double area, 
						  int areaUnit, 
						  int unitOfResult) {
        return Speed1.getInstance(flowRate,
								  flowRateUnit,
								  area,
								  areaUnit,
								  unitOfResult);
    }

    // v = Q / (π * r²)]
    @Override
    public Speed2 speed2 (double flowRate, double ray) {
        return Speed2.getInstance(flowRate, ray);
    }

    @Override
    public Speed2 speed2 (double flowRate,
						  int flowRateUnit, 
						  double ray, 
						  int raioUnit,
						  int unitOfResult) {
        return Speed2.getInstance(flowRate,
								  flowRateUnit,
								  ray,
								  raioUnit,
								  unitOfResult);
    }

    // A = Q / v
    @Override
    public Area area (double flowRate, double velocity) {
		return Area.getInstance(flowRate, velocity);
    }

    @Override
    public Area area (double flowRate, 
					  int flowRateUnit, 
					  double velocity, 
					  int velocityUnit,
					  int unitOfResult) {
        return Area.getInstance(flowRate,
								flowRateUnit, 
								velocity,
								velocityUnit,
								unitOfResult);
    }

    // r = √[Q / (π * v)]
    @Override
    public Ray ray (double flowRate, double velocity) {
        return Ray.getInstance(flowRate, velocity);
    }

    @Override
    public Ray ray (double flowRate,
					int flowRateUnit, 
					double velocity, 
					int velocityUnit,
					int unitOfResult) {
        return Ray.getInstance(flowRate, 
							   flowRateUnit,
							   velocity,
							   velocityUnit,
							   unitOfResult);
    }

    protected static FluidFlow getInstance () {
        if (!(instance instanceof FluidFlow))
            instance = new FluidFlow();
        return instance;
    }
}
