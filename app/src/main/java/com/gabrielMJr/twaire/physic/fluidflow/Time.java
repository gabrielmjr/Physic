package com.gabrielMJr.twaire.physic.fluidflow;

final class Time {

  protected String time(double volume, double flowRate)
  {
    return String.valueOf(volume / flowRate);
  }
  
  protected String time (double volume, String volume_unit, double flowRate, String flowRate_unit, String unit_of_result)
  {
    return null;
  }
}
