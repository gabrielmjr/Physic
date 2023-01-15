package com.gabrielMJr.physic.kinematics.mru;
 
final class Time4 {

  // ti = tf + ∆t
  protected String time(
    double variation_time, 
    double final_time) 
  {
    return String.valueOf(final_time - variation_time);
  }
  
  protected String time(
    double variation_time, 
    String variation_time_unit,
    double final_time,
    String final_time_unit,
    String unit_of_result) 
  {
    return null;
  }
}
