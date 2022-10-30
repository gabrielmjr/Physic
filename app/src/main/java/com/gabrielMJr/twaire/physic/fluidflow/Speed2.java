package com.gabrielMJr.twaire.physic.fluidflow;

import com.gabrielMJr.twaire.physic.Physic;


class Speed2 {

  private static Physic physic;
  
  protected Speed2()
  {
    physic = new Physic();
  }
  
  protected String sSpeed(
      double fluidFlow, 
      double raio, 
      int resultOrStep)
      {
        Double stp1 = Math.pow(raio, 2);
      Double stp2 = stp1 * 3.14;
      Double stp3 = fluidFlow / stp2;
    
      // Retornar somente resultado:
      if (resultOrStep == physic.GET_RESULT) {
    
        return String.valueOf(stp3);
      
      // Retornar passos e resultado
      } else if (resultOrStep == physic.GET_STEP) {
        
         String result = "v = " 
                       + String.valueOf(fluidFlow) 
                       + "m³/s" +  " ÷ [3.14 × (" 
                       + String.valueOf(raio) 
                       + "m)²]"
                       + "\nv = "
                       + String.valueOf(fluidFlow) 
                       + "m³/s" 
                       + " ÷ (3.14 × " 
                       + stp1 
                       + "m²)"
                       + "\nv = " 
                       + "(" 
                       + fluidFlow
                       + "m³/s) ÷ "
                       + "(" 
                       + stp2
                       + "m²)"
                       + "\nv = " 
                       + stp3
                       + "m/s";
      
         return result;    
        
      // Terceiro parâmetro não encontrado
      } else {
        return "Erro 404: third parameter not found";
      }
    }
}
