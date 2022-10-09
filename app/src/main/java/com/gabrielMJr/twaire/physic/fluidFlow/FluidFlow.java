package com.gabrielMJr.twaire.physic;

import com.gabrielMJr.twaire.physic.FluidFlowIF;
import com.gabrielMJr.twaire.physic.Physic;

public class FluidFlow implements FluidFlowIF{

  private Physic Physic = new Physic();
  public static final int GET_RESULT = 0;
  public static final int GET_STEP = 1;

  // Primeira fórmula de Vazão: Q = V/∆t
  @Override
  public String fFluidFlow(double volume, double time) {
    return Physic.expNormalizer(volume / time);
  }
    
    
    // Segunda fórmila de Vazão: Q = A * v
    @Override
    public String sFluidFlow(double area, double velocidade) {
      return Physic.expNormalizer(area * velocidade);
    }
    
    
    // Terceira fórmula de Vazão: Q = π * r² * v
    @Override
    public String tFluidFlow(
      double raio, 
      double velocidade,
      int resultOrStep) {
    
      double stp1 = Math.pow(raio, 2);
      double stp2 = 3.14 * stp1;
      double stp3 = stp2 * velocidade;
    
    
      // retornar somente resultado
      if (resultOrStep == GET_RESULT) { 
        
        return Physic.expNormalizer(stp3);
        
      // Retornar resultado e passos
      } else if (resultOrStep == GET_STEP) {
       
        String result = "Q = 3.14 × ("
                      + Physic.expNormalizer(raio) 
                      + "m)² × " 
                      + Physic.expNormalizer(velocidade) 
                      + "m/s";
      
        result += "\nQ = " 
               + "3.14 × " 
               + Physic.expNormalizer(stp1) 
               + "m² × " 
               + Physic.expNormalizer(velocidade) 
               + "m/s";
      
        result += "\nQ = " 
               + Physic.expNormalizer(stp2) 
               + "m² × " 
               + Physic.expNormalizer(velocidade) 
               + "m/s";
      
        result += "\nQ = " 
               + Physic.expNormalizer(stp3) 
               + "m³/s";
       
        return result;
        
      // Terceiro parâmetro desconhecido
      } else {
        return "Erro 404: third parameter not found";
      }
    }
    
    
    // Tempo: ∆t = V/Q
    @Override
    public String time(double volume, double fluidFlow) {
      return Physic.expNormalizer(volume / fluidFlow);
    }
    
    
    // Volume: V = ∆t * Q
    @Override
    public String volume(double tempo, double fluidFlow) {
      return Physic.expNormalizer(tempo * fluidFlow);
    }

    
    // Primeira fórmula de velocidade: v = Q / A
    @Override
    public String fSpeed(double fluidFlow, double area) {
      return Physic.expNormalizer(fluidFlow / area);
    }
    
    
    // Segunda fórmula de velocidade: v = Q / (π * r²)]
    @Override
    public String sSpeed(
      double fluidFlow, 
      double raio, 
      int resultOrStep) {
    
      Double stp1 = Math.pow(raio, 2);
      Double stp2 = stp1 * 3.14;
      Double stp3 = fluidFlow / stp2;
    
      // Retornar somente resultado:
      if (resultOrStep == GET_RESULT) {
    
        return Physic.expNormalizer(stp3);
      
      // Retornar passos e resultado
      } else if (resultOrStep == GET_STEP) {
        
         String result = "v = " 
                       + Physic.expNormalizer(fluidFlow) 
                       + "m³/s" +  " ÷ [3.14 × (" 
                       +  Physic.expNormalizer(raio) 
                       + "m)²]"
                       + "\nv = "
                       + Physic.expNormalizer(fluidFlow) 
                       + "m³/s" 
                       + " ÷ (3.14 × " 
                       + stp1 
                       + "m²)"
                       + "\nv = " 
                       + "(" 
                       + Physic.expNormalizer(fluidFlow) 
                       + "m³/s) ÷ " 
                       + "(" 
                       + Physic.expNormalizer(stp2) 
                       + "m²)"
                       + "\nv = " 
                       + Physic.expNormalizer(stp3) 
                       + "m/s";
      
         return result;    
        
      // Terceiro parâmetro não encontrado
      } else {
        return "Erro 404: third parameter not found";
      }
    }
   
   
    // Area: A = Q / v
    @Override
    public String area(double fluidFlow, double velocidade) {
      return Physic.expNormalizer(fluidFlow / velocidade);
    }
    
    
    // Raio: r = √[Q / (π * v)]
    @Override
    public String ray(
      double fluidFlow, 
      double velocidade, 
      int resultOrStep) {
   
      Double stp1 = 3.14 * velocidade;
      Double stp2 = fluidFlow / stp1;
      Double stp3 = Math.sqrt(stp2);
      
      if (resultOrStep == GET_RESULT) {
        
        return Physic.expNormalizer(stp3);
        
      } else if (resultOrStep == GET_STEP) {
    
      String result = "r = √[" 
                    + Physic.expNormalizer(fluidFlow) 
                    + "m³/s ÷ (3.14 × " 
                    + Physic.expNormalizer(velocidade) 
                    + "m/s)]"
                    + "\nr = √[(" 
                    + Physic.expNormalizer(fluidFlow) 
                    + "m³/s) ÷ (" 
                    + Physic.expNormalizer(stp1) 
                    + "m/s)]"
                    + "\nr = √(" 
                    + Physic.expNormalizer(stp2) 
                    + "m²)"
                    + "\nr = " 
                    + Physic.expNormalizer(stp3) 
                    + "m";
      
      return result;
      
      } else {
        
        return "Erro 404: third parameter not found";
        
      }
      
    }

}
