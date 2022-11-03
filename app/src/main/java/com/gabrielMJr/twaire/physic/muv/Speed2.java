package com.gabrielMJr.twaire.physic.muv;

import com.gabrielMJr.twaire.physic.Physic;

final class Speed2 {

  private static Physic physic;

  protected Speed2()
  {
    physic = new Physic();
  }
  
  protected String speed (
      double initial_time,
      double final_time, 
      double acceleration,
      int stepOrResult)
      {
        double step1 = final_time - initial_time;
        double step2 = step1 * acceleration;
        String res;
        
        if (stepOrResult == physic.GET_STEP) {
          res = "∆v = ("
              + final_time
              + "s - "
              + initial_time
              + "s) × ("
              + acceleration
              + "m/s²)"
              + "\n∆v = "
              + step1
              + "s × ("
              + acceleration
              + "m/s²)"
              + "\n∆v = "
              + step2
              + "m/s";
              
              
          return res;
          
        } else if (stepOrResult == physic.GET_RESULT) {
          return String.valueOf(step2);
          
        } else {
          return "Error 404: fourth parameter not found.";
        }
      }
      
  protected String speed (
      double initial_time,
      String initial_time_unit,
      double final_time, 
      String final_time_unit,
      double acceleration,
      String acceleration_unit,
      String unit_of_result,
      int stepOrResult)    
      {
        
        return null;
      }

}
