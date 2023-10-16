package com.mjr.code.physics.hydrodynamics.fluidflow;

public class FluidFlow implements IFluidFlow {
    @Deprecated
    private static FluidFlow instance;

    public FluidFlow() {}

    // Q = V/∆t
    @Override
    public FlowRate1 flowRate1() {
        return new FlowRate1();
    }
    
    @Override
    public FlowRate1 flowRate1(double volume, double time) {
        return new FlowRate1(volume, time);
    }

    @Override
    public FlowRate1 flowRate1(double volume, 
                               int volumeUnit, 
                               double time, 
                               int timeUnit, 
                               int unitOfResult) {
        return new  FlowRate1(volume, 
                              volumeUnit, 
                              time, 
                              timeUnit, 
                              unitOfResult);
    }

    // Q = A * v
    @Override
    public FlowRate2 flowRate2() {
        return new FlowRate2();
    }
    
    @Override
    public FlowRate2 flowRate2(double area, double velocity) {
        return new FlowRate2(area, velocity);
    }

    @Override
    public FlowRate2 flowRate2(double area, 
                               int areaUnit, 
                               double velocity, 
                               int velocityUnit, 
                               int unitOfResult) {
		return new FlowRate2(area, 
                             areaUnit,
                             velocity, 
                             velocityUnit, 
                             unitOfResult);
    }

    // Q = π * r² * v
    @Override
    public FlowRate3 flowRate3(double ray, double velocity) {
        return new FlowRate3(ray, velocity);
    }
    
    @Override
    public FlowRate3 flowRate3() {
        return new FlowRate3();
    }

    @Override
    public FlowRate3 flowRate3(double ray, 
                               int rayUnit,
                               double velocity,
                               int velocityUnit,
                               int unitOfResult) {
        return new FlowRate3(ray,
                             rayUnit,
                             velocity,
                             velocityUnit,
                             unitOfResult);
    }
    
    @Override
    public Time time() {
        return new Time();
    }

    // ∆t = V/ Q
    @Override
    public Time time(double volume, double flowRate) {
        return new Time(volume, flowRate);
    }

    @Override
    public Time time(double volume, 
                     int volumeUnit,
                     double flowRate,
                     int flowRateUnit, 
                     int unitOfResult) {
        return new Time(volume,
                        volumeUnit,
                        flowRate,
                        flowRateUnit,
                        unitOfResult);
    }

    // V = ∆t * Q
    @Override
    public Volume volume() {
        return new Volume();
    }
    
    @Override
    public Volume volume(double time, double flowRate) {
        return new Volume(time, flowRate);
    }

    @Override
    public Volume volume(double time, 
                         int timeUnit, 
                         double flowRate, 
                         int flowRateUnit, 
                         int unitOfResult) {
        return new Volume(time,
                          timeUnit,
                          flowRate,
                          flowRateUnit,
                          unitOfResult);
    }

    // v = Q / A
    @Override
    public Speed1 speed1() {
        return new Speed1();
    }
    
    @Override
    public Speed1 speed1(double flowRate, double area) {
        return new Speed1(flowRate, area);
    }

    @Override
    public Speed1 speed1(double flowRate, 
                         int flowRateUnit,
                         double area, 
                         int areaUnit, 
                         int unitOfResult) {
        return new Speed1(flowRate,
                          flowRateUnit,
                          area,
                          areaUnit,
                          unitOfResult);
    }

    // v = Q / (π * r²)]
    @Override
    public Speed2 speed2() {
        return new Speed2();
    }
    
    @Override
    public Speed2 speed2(double flowRate, double ray) {
        return new Speed2(flowRate, ray);
    }

    @Override
    public Speed2 speed2(double flowRate,
                         int flowRateUnit, 
                         double ray, 
                         int raioUnit,
                         int unitOfResult) {
        return new Speed2(flowRate,
                          flowRateUnit,
                          ray,
                          raioUnit,
                          unitOfResult);
    }

    // A = Q / v
    @Override
    public Area area() {
        return new Area();
    }
    
    @Override
    public Area area(double flowRate, double velocity) {
		return new Area(flowRate, velocity);
    }

    @Override
    public Area area(double flowRate, 
                     int flowRateUnit, 
                     double velocity, 
                     int velocityUnit,
                     int unitOfResult) {
        return new Area(flowRate,
                        flowRateUnit, 
                        velocity,
                        velocityUnit,
                        unitOfResult);
    }

    // r = √[Q / (π * v)]
    @Override
    public Ray ray() {
        return new Ray();
    }
    
    @Override
    public Ray ray(double flowRate, double velocity) {
        return new Ray(flowRate, velocity);
    }

    @Override
    public Ray ray(double flowRate,
                   int flowRateUnit, 
                   double velocity, 
                   int velocityUnit,
                   int unitOfResult) {
        return new Ray(flowRate, 
                       flowRateUnit,
                       velocity,
                       velocityUnit,
                       unitOfResult);
    }

    @Deprecated
    protected static FluidFlow getInstance() {
        if (!(instance instanceof FluidFlow))
            instance = new FluidFlow();
        return instance;
    }
}
