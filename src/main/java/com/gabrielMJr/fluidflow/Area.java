package com.gabrielMJr.physic.fluidflow;

final class Area {

  // This class object variable
  private static Area instance;
  
  // Private vonstructor to avoid new instance
  private Area(){}

  protected String area(double flowRate, double velocidade)
  {
    return String.valueOf(flowRate / velocidade);
  }
  
  protected String area(
    double flowRate,
    String flowRate_unit,
    double velocidade,
    String velocidade_unit,
    String unit_of_result)
    {
      return null;
    }
    
    // Get class instance object
    public static Area getInstance()
    {
      if(instance == null)
      {
        instance = new Area();
      }
      
      return instance;
    }
}
