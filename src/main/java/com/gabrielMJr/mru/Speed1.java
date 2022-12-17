package com.gabrielMJr.physic.mru;

final class Speed1 {
  
  // Speed_law:v = ∆S / ∆T
  protected String speed1(
    double variation_displacement,
    double variation_time)
  {
    return String.valueOf(variation_displacement / variation_time);
  }
  
  protected String speed1(
    double variation_displacement,
    String variation_displacement_unit,
    double variation_time,
    String variation_time_unit,
    String unit_of_result)
  {
    return null;
  }
}
