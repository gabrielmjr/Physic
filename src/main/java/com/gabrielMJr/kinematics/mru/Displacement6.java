package com.gabrielMJr.physic.mru;

import com.gabrielMJr.physic.Physic;

final class Displacement6 {
  // Displacement law: 
  protected String displacement(
    double initial_displacement,
    double speed,
    double variation_time,
    int stepOrResult) 
  {
    double step1 = speed * variation_time;
    double step2 = step1 + initial_displacement;
    String res = "";
    
    if  (stepOrResult == Physic.GET_RESULT) {
      return String.valueOf(step2);
         
    } 
    else if (stepOrResult == Physic.GET_STEP) 
    {
      res = "S = "
          + initial_displacement
          + "m + "
          + speed
          + "m/s x "
          + variation_time
          + "s"
          + "\n"
          + "S = "
          + initial_displacement
          + "m + "
          + step1
          + "m"
          + "\n"
          + "S = " 
          + step2
          + "m";

     return res;
        
    } 
    else 
    {
      return "Erro 404: fourth parameter not found";
    }
  }
  
  protected String displacement(
    double initial_displacement,
    String initial_displacement_unit,
    double speed,
    String speed_unit,
    double variation_time,
    String variation_time_unit,
    String unit_of_result,
    int stepOrResult) 
  {
    return null;
  }
}
