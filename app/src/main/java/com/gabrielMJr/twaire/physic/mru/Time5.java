package com.gabrielMJr.twaire.physic.mru;

final class Time5 {

  // tf = ti + ∆t
  protected String time(
    double initial_time, 
    double variation_time) 
  {
    return String.valueOf(initial_time + variation_time);
  }
  
  protected String time(
    double initial_time, 
    String initial_time_unit,
    double variation_time,
    String variation_time_unit,
    String unit_of_result)
  {
    return null;
  }
}
