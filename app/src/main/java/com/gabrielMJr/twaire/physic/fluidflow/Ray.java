package com.gabrielMJr.twaire.physic.fluidflow;

import com.gabrielMJr.twaire.physic.Physic;

class Ray {

  private static Physic physic;
  
  protected Ray()
  {
    physic = new Physic();
  }
  
  protected String ray(
      double fluidFlow, 
      double velocidade, 
      int resultOrStep)
      {
        Double stp1 = 3.14 * velocidade;
        Double stp2 = fluidFlow / stp1;
        Double stp3 = Math.sqrt(stp2);
       
        if (resultOrStep == physic.GET_RESULT) {
        
          return String.valueOf(stp3);
        
        } else if (resultOrStep == physic.GET_STEP) {
    
        String result = "r = √[" 
                      + fluidFlow
                      + "m³/s ÷ (3.14 × " 
                      + velocidade
                      + "m/s)]"
                      + "\nr = √[(" 
                      + fluidFlow 
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
}
