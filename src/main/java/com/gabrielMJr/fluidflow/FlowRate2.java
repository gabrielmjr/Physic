package com.gabrielMJr.physic.fluidflow;

final class FlowRate2 {
  
  protected String flowRate(double area, double velocidade) {
      return String.valueOf(area * velocidade);
  }
  
  protected String flowRate(
    double area,
    String area_unit,
    double velocidade,
    String velocidade_unit, 
    String unit_of_result)
    {
      return null;
    }
}
