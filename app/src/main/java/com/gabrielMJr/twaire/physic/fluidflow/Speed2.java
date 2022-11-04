package com.gabrielMJr.twaire.physic.fluidflow;

import com.gabrielMJr.twaire.physic.Physic;

final class Speed2 {

  protected String speed(
      double flowRate, 
      double raio, 
      int resultOrStep)
      {
      Double stp1 = Math.pow(raio, 2);
      Double stp2 = stp1 * 3.14;
      Double stp3 = flowRate / stp2;
    
      // Retornar somente resultado:
      if (resultOrStep == Physic.GET_RESULT) {
    
        return String.valueOf(stp3);
      
      // Retornar passos e resultado
      } else if (resultOrStep == Physic.GET_STEP) {
        
         String result = "v = " 
                       + flowRate
                       + "m³/s" +  " ÷ [3.14 × (" 
                       + raio
                       + "m)²]"
                       + "\nv = "
                       + flowRate
                       + "m³/s" 
                       + " ÷ (3.14 × " 
                       + stp1 
                       + "m²)"
                       + "\nv = " 
                       + "(" 
                       + flowRate
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
    
    protected String speed(
      double flowRate, 
      String flowRate_unit,
      double raio, 
      String raio_unit,
      String unit_of_result,
      int resultOrStep)
      {
        
        return null;
      }
}
