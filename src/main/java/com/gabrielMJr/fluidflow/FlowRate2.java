package com.gabrielMJr.physic.fluidflow;

final class FlowRate2 {
  
  // This class variable
  private static FlowRate2 instance;
  
  // Private constructor to avoid problems
  private FlowRate2(){}
  
  protected String flowRate(double area, double velocidade) {
      return String.valueOf(area * velocidade);
  }
  
  protected String flowRate(
    double area,
    String area_unit,
    double velocidade,
    String velocidade_unit, 
    String unit_of_result)
    {
      return null;
    }
    
    // Get class instance object
    public static FlowRate2 getInstance()
    {
      if(instance == null)
      {
        instance = new FlowRate2();
      }
      
      return instance;
    }
}
