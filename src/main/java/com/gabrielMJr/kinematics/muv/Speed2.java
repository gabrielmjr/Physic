package com.gabrielMJr.physic.kinematics.muv;

import com.gabrielMJr.physic.Physic;

final class Speed2
{
  // This object variable
  private static Speed2 instance; 
  
   // Private constructor to avoid new classe's incence
  private Speed2(){}
  
  protected String speed (
      double initial_time,
      double final_time, 
      double acceleration,
      int stepOrResult)
      {
        double step1 = final_time - initial_time;
        double step2 = step1 * acceleration;
        String res;
        
        if (stepOrResult == Physic.GET_STEP) {
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
          
        } else if (stepOrResult == Physic.GET_RESULT) {
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
  
  
  // Get class instance object
    public static Speed2 getInstance()
    {
      if(instance == null)
      {
        instance = new Speed2();
      }
      
      return instance;
    }
}
