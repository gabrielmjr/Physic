package com.gabrielMJr.twaire.physic.fluidflow;

final class Volume {

  protected String volume(double tempo, double flowRate)
  {
    return String.valueOf(tempo * flowRate);
  }
  
  protected String volume(double tempo, String tempo_unit, double flowRate, String flowRate_unit, String unit_of_result)
  {
    return null;
  }
}
