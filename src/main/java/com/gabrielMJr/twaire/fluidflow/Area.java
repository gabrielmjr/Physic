package com.gabrielMJr.twaire.physic.fluidflow;

final class Area {

  protected String area(double flowRate, double velocidade)
  {
    return String.valueOf(flowRate / velocidade);
  }
  
  protected String area(
    double flowRate,
    String flowRate_unit,
    double velocidade,
    String velocidade_unit,
    String unit_of_result)
    {
      return null;
    }
}
