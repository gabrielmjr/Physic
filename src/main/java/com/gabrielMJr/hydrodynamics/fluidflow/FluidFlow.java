package com.gabrielMJr.physic.hydrodynamics.fluidflow;

import com.gabrielMJr.physic.FluidFlowIF;

import com.gabrielMJr.physic.fluidflow.Area;
import com.gabrielMJr.physic.fluidflow.FlowRate1;
import com.gabrielMJr.physic.fluidflow.FlowRate2;
import com.gabrielMJr.physic.fluidflow.FlowRate3;
import com.gabrielMJr.physic.fluidflow.Ray;
import com.gabrielMJr.physic.fluidflow.Speed1;
import com.gabrielMJr.physic.fluidflow.Speed2;
import com.gabrielMJr.physic.fluidflow.Time;
import com.gabrielMJr.physic.fluidflow.Volume;


public class FluidFlow implements FluidFlowIF
{
  // This class object variable
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
  
  // Private constructor to avoid mew class's instance
  private FluidFlow()
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
  

  // Primeira fórmula de Vazão: Q = V/∆t
  @Override
  public String flowRate1(double volume, double time) {
    return flowRate1.flowRate(volume, time);
  }
  
  @Override
  public String flowRate1(
  double volume, 
  String volume_unit, 
  double time, 
  String time_unit, 
  String unit_of_result) {
  
    return flowRate1.flowRate(
    volume, 
    volume_unit, 
    time, 
    time_unit, 
    unit_of_result);
  }
    
    
    // Segunda fórmula de Vazão: Q = A * v
    @Override
    public String flowRate2(
    double area, 
    double velocidade)
    {
    
      return flowRate2.flowRate(area, velocidade);
    }
    
    @Override
    public String flowRate2(
    double area, 
    String area_unit, 
    double velocidade, 
    String velocidade_unit, 
    String unit_of_result)
    {
    
      return flowRate2.flowRate(
      area, 
      area_unit, 
      velocidade, 
      velocidade_unit, 
      unit_of_result);
    }
    
    // Terceira fórmula de Vazão: Q = π * r² * v
    @Override
    public String flowRate3(
      double raio, 
      double velocidade,
      int resultOrStep) 
      {
      
        return flowRate3.flowRate(
        raio, 
        velocidade, 
        resultOrStep);
    }
    
    @Override
    public String flowRate3(
      double raio, 
      String raio_unit,
      double velocidade,
      String velocidade_unit,
      String unit_of_result,
      int resultOrStep)
      {
      
        return flowRate3.flowRate(
        raio,
        raio_unit,
        velocidade,
        velocidade_unit,
        unit_of_result,
        resultOrStep);
    }
    
    
    // Tempo: ∆t = V/ Q
    @Override
    public String time(
    double volume, 
    double flowRate) {
    
      return time.time(
      volume, 
      flowRate);
    }
    
    @Override
    public String time(double volume, String volume_unit, double flowRate, String flowRate_unit, String unit_of_result) {
      return time.time(
      volume,
      volume_unit,
      flowRate,
      flowRate_unit,
      unit_of_result);
    }
    
    
    // Volume: V = ∆t * Q
    @Override
    public String volume(
    double tempo, 
    double flowRate) 
    {
    
      return volume.volume(
      tempo, 
      flowRate);
    }
    
    @Override
    public String volume(
    double tempo, 
    String tempo_unit, 
    double flowRate, 
    String flowRate_unit, 
    String unit_of_result)
    {
    
      return volume.volume(
      tempo,
      tempo_unit,
      flowRate,
      flowRate_unit,
      unit_of_result);
    }

    
    // Primeira fórmula de velocidade: v = Q / A
    @Override
    public String speed1(
    double flowRate,
    double area) 
    {
    
      return speed1.speed(
      flowRate, 
      area);
    }
    
    @Override
    public String speed1(
    double flowRate, 
    String flowRate_unit,
    double area, 
    String area_unit, 
    String unit_of_result) {
    
      return speed1.speed(
      flowRate,
      flowRate_unit,
      area,
      area_unit,
      unit_of_result);
    }
    
    
    // Segunda fórmula de velocidade: v = Q / (π * r²)]
    @Override
    public String speed2(
      double flowRate, 
      double raio, 
      int resultOrStep) {
      
        return speed2.speed(
        flowRate, 
        raio, 
        resultOrStep);
    }
 
    @Override
    public String speed2(
      double flowRate,
      String flowRate_unit, 
      double raio, 
      String raio_unit,
      String unit_of_result,
      int resultOrStep) {
      
        return speed2.speed(
        flowRate,
        flowRate_unit,
        raio,
        raio_unit,
        unit_of_result,
        resultOrStep);
    }
   
   
    // Area: A = Q / v
    @Override
    public String area(
    double flowRate, 
    double velocidade) 
    {
    
      return area.area(flowRate, 
      velocidade);
    }
    
    @Override
    public String area(
    double flowRate, 
    String flowRate_unit, 
    double velocidade, 
    String velocidade_unit,
    String unit_of_result)
    {
    
      return area.area(
        flowRate,
        flowRate_unit, 
        velocidade,
        velocidade_unit,
        unit_of_result);
    }
    
    
    // Raio: r = √[Q / (π * v)]
    @Override
    public String ray(
      double flowRate, 
      double velocidade, 
      int resultOrStep) {
      
        return ray.ray(
        flowRate, 
        velocidade,
        resultOrStep);
    }
    
    @Override
    public String ray(
      double flowRate,
      String flowRate_unit, 
      double velocidade, 
      String velocidade_unit,
      String unit_of_result,
      int resultOrStep) {
      
        return ray.ray(
        flowRate, 
        velocidade,
        resultOrStep);
    }
    
// Get class instance object
    public static FluidFlow getInstance()
    {
      if(instance == null)
      {
        instance = new FluidFlow();
      }
      
      return instance;
    }
}
