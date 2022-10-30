package com.gabrielMJr.twaire.physic.fluidflow;

import com.gabrielMJr.twaire.physic.FluidFlowIF;
import com.gabrielMJr.twaire.physic.Physic;

import com.gabrielMJr.twaire.physic.fluidflow.Area;
import com.gabrielMJr.twaire.physic.fluidflow.FlowRate1;
import com.gabrielMJr.twaire.physic.fluidflow.FlowRate2;
import com.gabrielMJr.twaire.physic.fluidflow.FlowRate3;
import com.gabrielMJr.twaire.physic.fluidflow.Ray;
import com.gabrielMJr.twaire.physic.fluidflow.Speed1;
import com.gabrielMJr.twaire.physic.fluidflow.Speed2;
import com.gabrielMJr.twaire.physic.fluidflow.Time;
import com.gabrielMJr.twaire.physic.fluidflow.Volume;


public class FluidFlow implements FluidFlowIF{

  private static Physic physic;
  
  private static Area area;
  private static FlowRate1 flowRate1;
  private static FlowRate2 flowRate2;
  private static FlowRate3 flowRate3;
  private static Ray ray;
  private static Speed1 speed1;
  private static Speed2 speed2;
  private static Time time;
  private static Volume volume;
  
  public FluidFlow()
  {
    physic = new Physic();
    area = new Area();
    flowRate1 = new FlowRate1();
    flowRate2 = new FlowRate2();
    flowRate3 = new FlowRate3();
    ray = new Ray();
    speed1 = new Speed1();
    speed2 = new Speed2();
    time = new Time();
    volume = new Volume();
  }
  

  // Primeira fórmula de Vazão: Q = V/∆t
  @Override
  public String fFluidFlow(double volume, double time) {
    return flowRate1.fFluidFlow(volume, time);
  }
  
  @Override
  public String fFluidFlow(double volume, String volume_unit, double time, String time_unit, String unit_of_result) {
    return null;
  }
    
    
    // Segunda fórmila de Vazão: Q = A * v
    @Override
    public String sFluidFlow(double area, double velocidade) {
      return flowRate2.sFluidFlow(area, velocidade);
    }
    
    @Override
    public String sFluidFlow(double area, String area_unit, double velocidade, String velocidade_unit, String unit_of_result)
    {
      return null;
    }
    
    // Terceira fórmula de Vazão: Q = π * r² * v
    @Override
    public String tFluidFlow(
      double raio, 
      double velocidade,
      int resultOrStep) {
        return flowRate3.tFluidFlow(raio, velocidade, resultOrStep);
    }
    
    @Override
    public String tFluidFlow(
      double raio, 
      String raio_unit,
      double velocidade,
      String velocidade_unit,
      String unit_of_result,
      int resultOrStep) {
        return null;
    }
    
    
    // Tempo: ∆t = V/ Q
    @Override
    public String time(double volume, double fluidFlow) {
      return time.time(volume, fluidFlow);
    }
    
    @Override
    public String time(double volume, String volume_unit, double fluidFlow, String fluidflow_unit, String unit_of_result) {
      return null;
    }
    
    
    // Volume: V = ∆t * Q
    @Override
    public String volume(double tempo, double fluidFlow) {
      return volume.volume(tempo, fluidFlow);
    }
    
    @Override
    public String volume(double tempo, String tempo_unit, double fluidFlow, String fluidFlow_unit, String unit_of_result) {
      return null;
    }

    
    // Primeira fórmula de velocidade: v = Q / A
    @Override
    public String fSpeed(double fluidFlow, double area) {
      return speed1.fSpeed(fluidFlow, area);
    }
    
    @Override
    public String fSpeed(double fluidFlow, String fluidFlow_unit, double area, String area_unit, String unit_of_result) {
      return null;
    }
    
    
    // Segunda fórmula de velocidade: v = Q / (π * r²)]
     @Override
    public String sSpeed(
      double fluidFlow, 
      double raio, 
      int resultOrStep) {
        return speed2.sSpeed(fluidFlow, raio, resultOrStep);
    }
    
    @Override
    public String sSpeed(
      double fluidFlow,
      String fluidFlow_unit,
      double raio, 
      String raio_unit,
      String unit_of_result,
      int resultOrStep) {
        return null;
    }
   
   
    // Area: A = Q / v
    @Override
    public String area(double fluidFlow, double velocidade) {
      return area.area(fluidFlow, velocidade);
    }
    
    @Override
    public String area(double fluidFlow, String fluidFlow_unit, double velocidade, String velocidade_unit, String unit_of_result) {
      return null;
    }
    
    
    
    // Raio: r = √[Q / (π * v)]
    @Override
    public String ray(
      double fluidFlow, 
      double velocidade, 
      int resultOrStep) {
        return ray.ray(fluidFlow, velocidade, resultOrStep);
    }
    
    @Override
    public String ray(
      double fluidFlow,
      String fluidFlow_unit,
      double velocidade, 
      String velocidade_unit,
      String unit_of_result,
      int resultOrStep) {
        return null;
    }

}
