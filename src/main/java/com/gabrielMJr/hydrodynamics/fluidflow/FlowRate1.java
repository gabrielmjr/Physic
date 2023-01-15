package com.gabrielMJr.physic.hydrodynamics.fluidflow;

final class FlowRate1
{
  // This class variable
  private static FlowRate1 instance;
  
  /// Private constructor to avoid new instance
  private FlowRate1 (){}
  
  protected String flowRate(double volume, double time) {
    return String.valueOf(volume / time);
  }
  
  protected String flowRate(double volume, String volume_unit, double time, String time_unit, String unit_of_result) {
    return null;
  }
  
  // Get class instance object
    public static FlowRate1 getInstance()
    {
      if(instance == null)
      {
        instance = new FlowRate1();
      }
      
      return instance;
    }
}
