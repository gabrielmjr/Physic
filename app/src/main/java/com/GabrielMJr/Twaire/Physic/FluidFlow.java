package com.GabrielMJr.Twaire.Physic;

import com.GabrielMJr.Twaire.Physic.Physic;

public class FluidFlow extends Physic{

private Physic Physic = new Physic();


  // Primeira fórmula de Vazão: Q = V/∆t
  @Override
  public String ffluidFlow(Double volume, Double time) {
    return Physic.expNormalizer(this.adb(volume, time));
    }
    
    
    // Segunda fórmila de Vazão: Q = A * v
    @Override
    public String sfluidFlow(Double area, Double velocidade) {
    return Physic.expNormalizer(this.axb(area, velocidade));
    }
    
    
    // Terceira fórmula de Vazão: Q = π * r² * v
    @Override
    public String tfluidFlow(Double raio, Double velocidade) {
      Double stp1 = Math.pow(raio, 2);
      Double stp2 = 3.14 * stp1;
      Double stp3 = stp2 * velocidade;
  
      String result = "Q = 3.14 × (" + Physic.expNormalizer(raio) + "m)² × " + Physic.expNormalizer(velocidade) + "m/s";
      
      result += "\nQ = " + "3.14 × " + Physic.expNormalizer(stp1) + "m² × " + Physic.expNormalizer(velocidade) + "m/s";
      
      result += "\nQ = " + Physic.expNormalizer(stp2) + "m² × " + Physic.expNormalizer(velocidade) + "m/s";
      
      result += "\nQ = " + Physic.expNormalizer(stp3) + "m³/s";
     return result;
    }

    
    // Tempo: ∆t = V/Q
    @Override
    public String tempo(Double volume, Double fluidflow) {
      return Physic.expNormalizer(this.adb(volume, fluidflow));
    }
    
    
    // Volume: V = ∆t * Q
    @Override
    public String volume(Double tempo, Double fluidflow) {
      return Physic.expNormalizer(this.axb(tempo, fluidflow));
    }

    
    // Primeira fórmula de velocidade: v = Q / A
    @Override
    public String fvelocidade(Double fluidflow, Double area) {
      return Physic.expNormalizer(this.adb(fluidflow, area));
    }
    
    
    // Segunda fórmula de velocidade: v = Q / (π * r²)
    @Override
    public String svelocidade(Double fluidflow, Double raio) {
      Double stp1 = Math.pow(raio, 2);
      Double stp2 = stp1 * 3.14;
      Double stp3 = fluidflow / stp2;
      
      String result = "v = " + Physic.expNormalizer(fluidflow) + "m³/s" +  " / [3.14 × (" +  Physic.expNormalizer(raio) + "m)²]";
      
      result += "\nv = " + Physic.expNormalizer(fluidflow) + "m³/s" + " / (3.14 × " + stp1 + "m²)";
      
      result += "\nv = " + "(" + Physic.expNormalizer(fluidflow) + "m³/s) / " + "(" + Physic.expNormalizer(stp2) + "m²)";
      
      result += "\nv = " + Physic.expNormalizer(stp3) + "m/s";
      
      return result;
    }
   
   
    // Area: A = Q / v
    @Override
    public String area(Double fluidflow, Double velocidade) {
      return Physic.expNormalizer(this.adb(fluidflow, velocidade));
    }
    
    
    @Override
    public String raio(Double fluidflow, Double velocidade) {
    Double stp1 = 3.14 * velocidade;
    Double stp2 = fluidflow / stp1;
    Double stp3 = Math.sqrt(stp2);
    
      String result = "r = √[" + Physic.expNormalizer(fluidflow) + "m³/s /   (3.14 × " + Physic.expNormalizer(velocidade) + "m/s)]";
      
      result += "\nr = √[(" + Physic.expNormalizer(fluidflow) + "m³/s) / (" + Physic.expNormalizer(stp1) + "m/s)]";
      
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
