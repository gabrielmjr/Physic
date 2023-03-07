package com.gabrielMJr.twaire.physic.hydrodynamics.fluidflow;

import com.gabrielMJr.twaire.physic.Physic;

final class Ray 
{
    private static Ray instance;
  
    private Ray(){}

    protected String ray(
      double flowRate, 
      double velocity, 
      int resultOrStep)
    {
        Double step1 = 3.14 * velocity;
        Double step2 = flowRate / step1;
        Double step3 = Math.sqrt(step2);
       
        if (resultOrStep == Physic.GET_RESULT)
        {
            return String.valueOf(step3);
        }
        else if (resultOrStep == Physic.GET_STEP) 
        {
            String result = "r = √[" 
                          + flowRate
                          + "m³/s ÷ (3.14 × " 
                          + velocity
                          + "m/s)]"
                          + "\nr = √[(" 
                          + flowRate 
                          + "m³/s) ÷ (" 
                          + step1 
                          + "m/s)]"
                          + "\nr = √(" 
                          + step2 
                          + "m²)"
                          + "\nr = " 
                          + step3 
                          + "m";
      
              return result;
          }
          else
          {
              return "Erro 404: third parameter not found";
          }
    }
      
    public static Ray getInstance()
    {
        if(instance == null)
        {
          instance = new Ray();
        }
            return instance;
    }
}
