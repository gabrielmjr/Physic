package com.gabrielMJr.twaire.physic;

import com.gabrielMJr.twaire.physic.FluidFlowIF;

public class FluidFlow implements FluidFlowIF{

  private static Physic physic = new Physic();

  // Primeira fórmula de Vazão: Q = V/∆t
  @Override
  public String fFluidFlow(double volume, double time) {
    return String.valueOf(volume / time);
  }
    
    
    // Segunda fórmila de Vazão: Q = A * v
    public String sFluidFlow(double area, double velocidade) {
      return String.valueOf(area * velocidade);
    }
    
    
    // Terceira fórmula de Vazão: Q = π * r² * v
    public String tFluidFlow(
      double raio, 
      double velocidade,
      int resultOrStep) {
    
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
    
    
    // Tempo: ∆t = V/Q
    public String time(double volume, double fluidFlow) {
      return String.valueOf(volume / fluidFlow);
    }
    
    
    // Volume: V = ∆t * Q
    public String volume(double tempo, double fluidFlow) {
      return String.valueOf(tempo * fluidFlow);
    }

    
    // Primeira fórmula de velocidade: v = Q / A
    public String fSpeed(double fluidFlow, double area) {
      return String.valueOf(fluidFlow / area);
    }
    
    
    // Segunda fórmula de velocidade: v = Q / (π * r²)]
    public String sSpeed(
      double fluidFlow, 
      double raio, 
      int resultOrStep) {
    
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
   
   
    // Area: A = Q / v
    public String area(double fluidFlow, double velocidade) {
      return String.valueOf(fluidFlow / velocidade);
    }
    
    
    // Raio: r = √[Q / (π * v)]
    public String ray(
      double fluidFlow, 
      double velocidade, 
      int resultOrStep) {
   
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
