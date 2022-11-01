package com.gabrielMJr.twaire.physic;

public interface FluidFlowIF {
    public abstract String flowRate1(double volume, double time);
    public abstract String flowRate1(double volume, String volume_unit, double time, String time_unit, String unit_of_result);
    
    public abstract String flowRate2(double area, double velocidade);
    public abstract String flowRate2(double area, String area_unit, double velocidade, String velocidade_unit, String unit_of_result);
    
    public abstract String flowRate3(double raio, double velocidade, int resultOrStep);  
    public abstract String flowRate3(double raio, String raio_unit, double velocidade, String velocidade_unit, String unit_of_result, int resultOrStep);
    
    public abstract String time(double volume, double flowRate);
    public abstract String time(double volume, String volume_unit, double flowRate, String flowRate_unit, String unit_of_result);
    
    public abstract String volume(double tempo, double flowRate);
    public abstract String volume(double tempo, String tempo_unit, double flowRate, String flowRate_unit, String unit_of_result);
    
    public abstract String speed1(double flowRate, double area);
    public abstract String speed1(double flowRate, String flowRate_unit, double area, String area_unit, String unit_of_result);
    
    public abstract String speed2(double flowRate, double raio, int resultOrStep);
    public abstract String speed2(double fluidFlow, String flowRate_unit, double raio, String raio_unit, String unit_of_result, int resultOrStep);
    
    public abstract String area(double flowRate, double velocidade);
    public abstract String area(double fluidFlow, String flowRate_unit, double velocidade, String velocidade_unit, String unit_of_result);
    
    public abstract String ray(double flowRate, double velocidade, int resultOrStep);
    public abstract String ray(double flowRate, String flowRate_unit, double velocidade, String velocidade_unit, String unit_of_result, int resultOrStep);
}
