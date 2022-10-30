package com.gabrielMJr.twaire.physic.fluidflow;

import com.gabrielMJr.twaire.physic.Physic;


class FlowRate3 {

  private static Physic physic;
  
  protected FlowRate3()
  {
    physic = new Physic();
  }

  protected String tFluidFlow(
      double raio, 
      double velocidade,
      int resultOrStep)
      {
        double stp1 = Math.pow(raio, 2);
        double stp2 = 3.14 * stp1;
        double stp3 = stp2 * velocidade;
    
    
        // retornar somente resultado
        if (resultOrStep == physic.GET_RESULT) { 
        
          return String.valueOf(stp3);
        
      // Retornar resultado e passos
      } else if (resultOrStep == physic.GET_STEP) {
       
        String result = "Q = 3.14 × ("
                      + raio
                      + "m)² × " 
                      + velocidade
                      + "m/s";
      
        result += "\nQ = " 
               + "3.14 × " 
               + stp1
               + "m² × " 
               + velocidade 
               + "m/s";
      
        result += "\nQ = " 
               + stp2
               + "m² × " 
               + velocidade 
               + "m/s";
      
        result += "\nQ = " 
               + stp3
               + "m³/s";
       
        return result;
        
      // Terceiro parâmetro desconhecido
      } else {
        return "Erro 404: third parameter not found";
      }
    }
}
