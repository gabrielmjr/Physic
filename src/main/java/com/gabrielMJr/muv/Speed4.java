package com.gabrielMJr.physic.muv;

import com.gabrielMJr.physic.Physic;

final class Speed4 {

  protected String speed(
      double initial_speed, 
      double delta_time, 
      double acceleration, 
      int stepOrResult) {
        
        double step1 = delta_time * acceleration;
         double step2 = step1 + initial_speed;
         String res;
         
         if (stepOrResult == Physic.GET_STEP) {
           res = "vf = "
               + delta_time
               + "s × "
               + acceleration
               + "m/s² + "
               + initial_speed
               + "m/s"
               + "\nvf = "
               + step1
               + "m/s + "
               + initial_speed
               + "m/s"
               + "\nvf = "
               + step2
               + "m/s";
               
           return res;             
           
         } else if (stepOrResult == Physic.GET_RESULT) {
           return String.valueOf(step2);
           
         } else {
           return "Error 404: fourth parameter not found.";
         }
      }
      
    protected String speed (
    double initial_speed, 
    String initial_speed_unit,
    double delta_time, 
    String delta_time_unit,
    double acceleration, 
    String acceleration_unit,
    String unit_of_result,
    int stepOrResult)
    {
      
      return null;
    }
}
