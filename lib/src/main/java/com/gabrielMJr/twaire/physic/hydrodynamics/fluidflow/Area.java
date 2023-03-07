package com.gabrielMJr.twaire.physic.hydrodynamics.fluidflow;

final class Area
{
    private static Area instance;
  
    private Area(){}

    protected String area(double flowRate, double velocity)
    {
        return String.valueOf(flowRate / velocity);
    }
  
    protected String area(
      double flowRate,
      String flowRateUnit,
      double velocity,
      String velocityUnit,
      String unitOfResult,
      int resultOrStep)
    {
        return null;
    }
    
    public static Area getInstance()
    {
        if(instance == null)
        {
            instance = new Area();
        }
        return instance;
    }
}
