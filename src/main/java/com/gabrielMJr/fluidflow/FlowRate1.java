package com.gabrielMJr.physic.fluidflow;

final class FlowRate1 {
  
  protected String flowRate(double volume, double time) {
    return String.valueOf(volume / time);
  }
  
  protected String flowRate(double volume, String volume_unit, double time, String time_unit, String unit_of_result) {
    return null;
  }
}
