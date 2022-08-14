package com.GabrielMJr.Twaire.Physic;

import com.GabrielMJr.Twaire.Physic.PhysicManager;
import com.GabrielMJr.Twaire.tools.NumberAnalyst;

public class Physic implements PhysicManager{
  
  public static void main(String[] args) {
    return;
  }
  
  // Atalho para normalizar expoente
  protected String expNormalizer(Double value) {
    NumberAnalyst NumberAnalyst = new NumberAnalyst();
    String[] list = NumberAnalyst.expNormalizer(value);
    return NumberAnalyst.normalize(list);
  }
  
  // Imicio de Vazão 
  @Override
  public String ffluidFlow(Double volume, Double time) {
    return null;
  } 
  
  @Override
  public String sfluidFlow(Double area, Double velocidade) {
    return null;
  }
  
  @Override
  public String tfluidFlow(Double raio, Double velocidade) {
    return null;
  }
  
  @Override
  public String tempo(Double volume, Double fluidflow) {
    return null;
  }
  
    @Override
  public String volume(Double tempo, Double fluidflow) {
    return null;
  }
  
  @Override
  public String fvelocidade(Double fluidflow, Double area) {
    return null;
  }
  
  @Override
  public String svelocidade(Double fluidflow, Double raio) {
    return null;
  }

  @Override
  public String area(Double fluidflow, Double velocidade) {
    return null;
  }
  
  @Override
  public String raio(Double fluidflow, Double velocidade) {
    return null;
  }
  
  // Fim de Vazão 
}
