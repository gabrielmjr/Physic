package com.gabrielMJr.physic.kinematics.muv;

import com.gabrielMJr.physic.Physic;

final class Speed3 
{
  // This object variable
  private static Speed3 instance; 
  
   // Private constructor to avoid new classe's incence
  private Speed3(){}

  protected String speed (
      double final_speed,
      double delta_time,
      double acceleration,
      int stepOrResult) 
      {
        
        double step1 = delta_time * acceleration;
        double step2 = final_speed - step1;
        String res;
        
        if (stepOrResult == Physic.GET_STEP) {
          res = "vi = "
              + final_speed
              + "m/s - "
              + delta_time
              + "s × "
              + acceleration
              + "m/s²"
              + "\nvi = "
              + final_speed
              + "m/s - "
              + step1
              + "m/s"
              +"\nvi = "
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
    double final_speed, 
    String final_speed_unit,
    double delta_time, 
    String delta_time_unit,
    double acceleration, 
    String acceleration_unit,
    String unit_of_result,
    int stepOrResult)
  {
      
      return null;
  }
  
  
  // Get class instance object
    public static Speed3 getInstance()
    {
      if(instance == null)
      {
        instance = new Speed3();
      }
      
      return instance;
    }
}
