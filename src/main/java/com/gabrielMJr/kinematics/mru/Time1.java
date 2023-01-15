package com.gabrielMJr.physic.kinematics.mru;
 
final class Time1 {

  // ∆t = tf - ti
  protected String time(
    double initial_time,
    double final_time)
  {
    return String.valueOf(final_time - initial_time);
  }
  
  protected String time(
    double initial_time,
    String initial_time_unit,
    double final_time,
    String final_time_unit,
    String unit_of_result)
  {
    return null;
  }
}
