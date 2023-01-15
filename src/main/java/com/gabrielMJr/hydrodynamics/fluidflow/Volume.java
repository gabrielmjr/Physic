package com.gabrielMJr.physic.hydrodynamics.fluidflow;

final class Volume 
{
  // This class object variabe
  private static Volume instance;
  
  // Private constructor to avoid new class's instance
  private Volume(){}

  protected String volume(double tempo, double flowRate)
  {
    return String.valueOf(tempo * flowRate);
  }
  
  protected String volume(double tempo, String tempo_unit, double flowRate, String flowRate_unit, String unit_of_result)
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
