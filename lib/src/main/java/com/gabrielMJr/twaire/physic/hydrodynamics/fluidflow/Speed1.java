package com.gabrielMJr.twaire.physic.hydrodynamics.fluidflow;

final class Speed1 
{
    private static Speed1 instance;
  
    private Speed1(){}
  
    protected String speed(double flowRate, double area)
    {
        return String.valueOf(flowRate / area);
    }
  
    protected String speed(
      double flowRate, String flowRateUnit,
      double area, String areaUnit,
      String unitOfResult)
    {
        return null;
    }
 
    public static Speed1 getInstance()
    {
        if(instance == null)
        {
            instance = new Speed1();
        }
      return instance;
    }
}
