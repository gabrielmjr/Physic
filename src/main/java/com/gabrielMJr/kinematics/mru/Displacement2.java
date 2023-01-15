package com.gabrielMJr.physic.kinematics.mru;
 
final class Displacement2 {
  // Displacementv ∆S = ∆t × media_speed
  protected String displacement (
    double variation_time, 
    double media_speed) 
  {
      return String.valueOf(variation_time * media_speed);
  }
  
  protected String displacement (
    double variation_time, 
    String variation_time_unit,
    double media_speed,
    String media_speed_unit,
    String unit_of_result) 
  {
    return null;
  }
}
