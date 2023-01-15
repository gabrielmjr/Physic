package com.gabrielMJr.physic.hydrodynamics.fluidflow;

import com.gabrielMJr.physic.Physic;

final class Ray {
  // this class object variable
  private static Ray instance;
  
  // Private constructor to avoid new class instance
  private Ray(){}

  protected String ray(
      double flowRate, 
      double velocidade, 
      int resultOrStep)
      {
        Double stp1 = 3.14 * velocidade;
        Double stp2 = flowRate / stp1;
        Double stp3 = Math.sqrt(stp2);
       
        if (resultOrStep == Physic.GET_RESULT) {
        
          return String.valueOf(stp3);
        
        } else if (resultOrStep == Physic.GET_STEP) {
    
        String result = "r = √[" 
                      + flowRate
                      + "m³/s ÷ (3.14 × " 
                      + velocidade
                      + "m/s)]"
                      + "\nr = √[(" 
                      + flowRate 
                      + "m³/s) ÷ (" 
                      + stp1 
                      + "m/s)]"
                      + "\nr = √(" 
                      + stp2 
                      + "m²)"
                      + "\nr = " 
                      + stp3 
                      + "m";
      
        return result;
      
        } else {
        
          return "Erro 404: third parameter not found";
        
        }
      }
      
      // Get class instance object
    public static Ray getInstance()
    {
      if(instance == null)
      {
        instance = new Ray();
      }
      
      return instance;
    }
}
