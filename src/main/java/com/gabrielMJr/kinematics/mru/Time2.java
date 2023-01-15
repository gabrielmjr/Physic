package com.gabrielMJr.physic.kinematics.mru;
 
final class Time2 {
  
  // ∆t = ∆S / media speed
  protected  String time(
    double variation_displacement, 
    double speed) 
  {
    return String.valueOf(variation_displacement / speed);
  }
  
  protected  String time(
    double variation_displacement, 
    String variation_displacement_unit,
    double speed,
    String speed_unit,
    String unit_of_result) 
  {
    return null;
  }
}
