package com.gabrielMJr.twaire.physic.hydrodynamics.fluidflow;

final class FlowRate2 {
  
  // This class variable
  private static FlowRate2 instance;
  
  // Private constructor to avoid problems
  private FlowRate2(){}
  
  protected String flowRate(double area, double velocity) {
      return String.valueOf(area * velocity);
  }
  
  protected String flowRate(
    double area,
    String area_unit,
    double velocity,
    String velocityUnit, 
    String unitOfResult)
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
