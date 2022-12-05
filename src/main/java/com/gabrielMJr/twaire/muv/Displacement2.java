package com.gabrielMJr.twaire.physic.muv;

import com.gabrielMJr.twaire.physic.Physic;

final class Displacement2 {

  protected String displacement (
    double initial_speed, 
    double delta_time, 
    double acceleration, 
    double displacement, 
    int stepOrResult)
    {
      double step1 = initial_speed * delta_time;
      double step11 = Math.pow (delta_time, 2);
      double step2 = acceleration * step11;
      double step3 = step2 / 2;
      double step4 = step1 + step3;
      double step5 = displacement - step4;
      String res;
                
      if (stepOrResult == Physic.GET_STEP) {
                
        res = "Si = "
            + displacement
            + "m - [("
            + initial_speed 
            + "m/s × "
            + delta_time
            + "s) + ["
            + acceleration 
            + "m/s² × ("
            + delta_time
            + "s)²] ÷ 2]"
            + "\nSi = "
            + displacement 
            + "m - ["
            + step1
            + "m + ("
            + acceleration
            + "m/s² × "
            + step11
            + "s²) ÷ 2]"
            + "\nSi = "
            + displacement
            + "m - ["
            + step1
            + "m + ("
            + step2
            + " ÷ 2)m]"
            + "\nSi = "
            + displacement 
            + "m - ("
            + step1
            + "m + "
            + step3
            + "m)"
            + "\nSi = "
            + displacement 
            + "m - "
            + step4
            + "m \nSi = "
            + step5
            + "m";
                      
            return res;
                  
      } 
      else if (stepOrResult == Physic.GET_RESULT) 
      {
                  
        return String.valueOf(step5);   
      } 
      else 
      {              
        return "Error 404: fifth parameter not found.";
      }
                
  }
  
  protected String displacement (
    double initial_speed, 
    String initial_speed_unit,
    double delta_time, 
    String delta_time_unit,
    double acceleration, 
    String acceleration_unit,
    double displacement, 
    String displacement_unit,
    String unit_of_result,
    int stepOrResult)
    {
      return null;
    }
}
