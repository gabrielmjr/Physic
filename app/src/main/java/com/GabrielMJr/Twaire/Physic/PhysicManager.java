package com.GabrielMJr.Twaire.Physic;

public interface PhysicManager {
  public abstract String ffluidFlow(Double volume, Double tempo);

  public abstract String sfluidFlow(Double area, Double velocidade);

  public abstract String tfluidFlow(Double raio, Double velocidade);

  public abstract String tempo(Double volume, Double fluidflow);
  
  public abstract String volume(Double tempo, Double fluidflow);

  public abstract String fvelocidade(Double fluidflow, Double area);
  
  public abstract String svelocidade(Double fluidflow, Double raio);
  
  public abstract String area(Double fluidflow, Double velocidade);
  
  public abstract String raio(Double fluidflow, Double velocidade);
}
