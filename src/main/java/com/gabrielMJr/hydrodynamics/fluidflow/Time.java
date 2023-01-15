<<<<<<< HEAD
package com.gabrielMJr.physic.hydrodynamics.fluidflow;
=======
package com.gabrielMJr.physic.fluidflow;
>>>>>>> 5666430d7121ccd775d4ee7ec7195ad6932b9e9b

final class Time 
{
  // This class object variable
  private static Time instance;
  
  // Private constructor to avoid new class's instance
  private Time(){}

  protected String time(double volume, double flowRate)
  {
    return String.valueOf(volume / flowRate);
  }
  
  protected String time (double volume, String volume_unit, double flowRate, String flowRate_unit, String unit_of_result)
  {
    return null;
  }
  
  // Get class instance object
    public static Time getInstance()
    {
      if(instance == null)
      {
        instance = new Time();
      }
      
      return instance;
    }
}
