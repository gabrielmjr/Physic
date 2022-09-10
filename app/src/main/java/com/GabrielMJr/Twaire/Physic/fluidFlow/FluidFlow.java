package com.gabrielMJr.twaire.physic;

import com.gabrielMJr.twaire.physic.FluidFlowIF;
import com.gabrielMJr.twaire.physic.Physic;

public class FluidFlow implements FluidFlowIF{

private Physic Physic = new Physic();

  // Primeira fórmula de Vazão: Q = V/∆t
  @Override
  public String fFluidFlow(double volume, double time) {
    return Physic.expNormalizer(this.adb(volume, time));
  }
    
    
    // Segunda fórmila de Vazão: Q = A * v
    @Override
    public String sFluidFlow(double area, double velocidade) {
      return Physic.expNormalizer(this.axb(area, velocidade));
    }
    
    
    // Terceira fórmula de Vazão: Q = π * r² * v
    @Override
    public String tFluidFlow(double raio, double velocidade) {
      double stp1 = Math.pow(raio, 2);
      double stp2 = 3.14 * stp1;
      double stp3 = stp2 * velocidade;
  
      String result = "Q = 3.14 × (" + Physic.expNormalizer(raio) + "m)² × " + Physic.expNormalizer(velocidade) + "m/s";
      
      result += "\nQ = " + "3.14 × " + Physic.expNormalizer(stp1) + "m² × " + Physic.expNormalizer(velocidade) + "m/s";
      
      result += "\nQ = " + Physic.expNormalizer(stp2) + "m² × " + Physic.expNormalizer(velocidade) + "m/s";
      
      result += "\nQ = " + Physic.expNormalizer(stp3) + "m³/s";
     return result;
    }

    
    // Tempo: ∆t = V/Q
    @Override
    public String time(double volume, double fluidFlow) {
      return Physic.expNormalizer(this.adb(volume, fluidFlow));
    }
    
    
    // Volume: V = ∆t * Q
    @Override
    public String volume(double tempo, double fluidFlow) {
      return Physic.expNormalizer(this.axb(tempo, fluidFlow));
    }

    
    // Primeira fórmula de velocidade: v = Q / A
    @Override
    public String fSpeed(double fluidFlow, double area) {
      return Physic.expNormalizer(this.adb(fluidFlow, area));
    }
    
    
    // Segunda fórmula de velocidade: v = Q / (π * r²)
    @Override
    public String sSpeed(double fluidFlow, double raio) {
      Double stp1 = Math.pow(raio, 2);
      Double stp2 = stp1 * 3.14;
      Double stp3 = fluidFlow / stp2;
      
      String result = "v = " + Physic.expNormalizer(fluidFlow) + "m³/s" +  " / [3.14 × (" +  Physic.expNormalizer(raio) + "m)²]";
      
      result += "\nv = " + Physic.expNormalizer(fluidFlow) + "m³/s" + " / (3.14 × " + stp1 + "m²)";
      
      result += "\nv = " + "(" + Physic.expNormalizer(fluidFlow) + "m³/s) / " + "(" + Physic.expNormalizer(stp2) + "m²)";
      
      result += "\nv = " + Physic.expNormalizer(stp3) + "m/s";
      
      return result;
    }
   
   
    // Area: A = Q / v
    @Override
    public String area(double fluidFlow, double velocidade) {
      return Physic.expNormalizer(this.adb(fluidFlow, velocidade));
    }
    
    
    @Override
    public String ray(double fluidFlow, double velocidade) {
    Double stp1 = 3.14 * velocidade;
    Double stp2 = fluidFlow / stp1;
    Double stp3 = Math.sqrt(stp2);
    
      String result = "r = √[" + Physic.expNormalizer(fluidFlow) + "m³/s /   (3.14 × " + Physic.expNormalizer(velocidade) + "m/s)]";
      
      result += "\nr = √[(" + Physic.expNormalizer(fluidFlow) + "m³/s) / (" + Physic.expNormalizer(stp1) + "m/s)]";
      
      result += "\nr = √(" + Physic.expNormalizer(stp2) + "m²)";
      
      result += "\nr = " + Physic.expNormalizer(stp3) + "m";
      
      return result;
    }

  private Double axb(Double a, Double b) {
    return a * b;
  }
  
  private Double adb(Double a, Double b) {
    return a / b;
  }

}
