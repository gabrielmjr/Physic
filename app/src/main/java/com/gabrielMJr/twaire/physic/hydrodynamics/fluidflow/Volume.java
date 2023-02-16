package com.gabrielMJr.twaire.physic.hydrodynamics.fluidflow;

final class Volume 
{
  // This class object variabe
  private static Volume instance;
  
  // Private constructor to avoid new class's instance
  private Volume(){}

  protected String volume(double time, double flowRate)
  {
    return String.valueOf(time * flowRate);
  }
  
  protected String volume(double time, String timeUnit, double flowRate, String flowRateUnit, String unitOfResult)
  {
    return null;
  }
  
  // Get class instance object
    public static Volume getInstance()
    {
      if(instance == null)
      {
        instance = new Volume();
      }
      
      return instance;
    }
}
