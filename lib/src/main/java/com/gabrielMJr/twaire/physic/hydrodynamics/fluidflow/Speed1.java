package com.gabrielMJr.twaire.physic.hydrodynamics.fluidflow;

final class Speed1 
{
    // This class object variable
    private static Speed1 instance;
  
    // Private constructor to avoid new class's instnce
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
  
  // Get class instance object
    public static Speed1 getInstance()
    {
        if(instance == null)
        {
            instance = new Speed1();
        }
      return instance;
    }
}
