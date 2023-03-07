package com.gabrielMJr.twaire.physic.hydrodynamics.fluidflow;

final class Time 
{
    private static Time instance;
  
    private Time(){}

    protected String time(double volume, double flowRate)
  {
      return String.valueOf(volume / flowRate);
  }
  
    protected String time (double volume, String volumeUnit, double flowRate, String flowRateUnit, 
      String unitOfResult)
    {
        return null;
    }
  
    public static Time getInstance()
    {
        if(instance == null)
        {
          instance = new Time();
        }
        return instance;
    }
}
