package com.gabrielMJr.physic.fluidflow;

final class Speed1 {
  
  protected String speed(double flowRate, double area)
  {
    return String.valueOf(flowRate / area);
  }
  
  protected String speed(
  double flowRate,
  String flowRate_unit,
  double area,
  String area_unit,
  String unit_of_result)
  {
    return null;
  }
}
