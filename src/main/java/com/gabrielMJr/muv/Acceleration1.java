package com.gabrielMJr.physic.muv;

final class Acceleration1 {
  protected String acceleration(
  double deltaSpeed, 
  double deltaTime)
  {
  
    return String.valueOf(deltaSpeed / deltaTime);
  }
  
  protected String acceleration(
  double deltaSpeed, 
  String deltaSpeed_unit,
  double deltaTime,
  String deltaTime_unit,
  String unit_of_result)
  {
  
    return null;
  }
}
