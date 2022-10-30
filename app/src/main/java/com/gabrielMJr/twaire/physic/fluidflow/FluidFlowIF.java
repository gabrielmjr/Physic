package com.gabrielMJr.twaire.physic;

public interface FluidFlowIF {
    public abstract String fFluidFlow(double volume, double time);
    public abstract String fFluidFlow(double volume, String volume_unit, double time, String time_unit, String unit_of_result);
    
    public abstract String sFluidFlow(double area, double velocidade);
    public abstract String sFluidFlow(double area, String area_unit, double velocidade, String velocidade_unit, String unit_of_result);
    
    public abstract String tFluidFlow(double raio, double velocidade, int resultOrStep);  
    public abstract String tFluidFlow(double raio, String raio_unit, double velocidade, String velocidade_unit, String unit_of_result, int resultOrStep);
    
    public abstract String time(double volume, double fluidFlow);
    public abstract String time(double volume, String volume_unit, double fluidFlow, String fluidFlow_unit, String unit_of_result);
    
    public abstract String volume(double tempo, double fluidFlow);
    public abstract String volume(double tempo, String tempo_unit, double fluidFlow, String fluidFlow_unit, String unit_of_result);
    
    public abstract String fSpeed(double fluidFlow, double area);
    public abstract String fSpeed(double fluidFlow, String fluidFlow_unit, double area, String area_unit, String unit_of_result);
    
    public abstract String sSpeed(double fluidFlow, double raio, int resultOrStep);
    public abstract String sSpeed(double fluidFlow, String fluidFlow_unit, double raio, String raio_unit, String unit_of_result, int resultOrStep);
    
    public abstract String area(double fluidFlow, double velocidade);
    public abstract String area(double fluidFlow, String fluidFlow_unit, double velocidade, String velocidade_unit, String unit_of_result);
    
    public abstract String ray(double fluidFlow, double velocidade, int resultOrStep);
    public abstract String ray(double fluidFlow, String fluidFlow_unit, double velocidade, String velocidade_unit, String unit_of_result, int resultOrStep);
}
