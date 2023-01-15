package com.gabrielMJr.physic.muv;

final class Time1 {
  
  protected String time (
    double delta_speed, 
    double acceleration)
    {
      
      return String.valueOf(delta_speed / acceleration);
    }
   
    protected String time (
    double delta_speed,
    String delta_speed_unit, 
    double acceleration,
    String acceleration_unit,
    String unit_of_result)
    {
      
      return null;
    }
}
