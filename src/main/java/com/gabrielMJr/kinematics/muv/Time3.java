package com.gabrielMJr.physic.kinematics.muv;

import com.gabrielMJr.physic.Physic;

final class Time3
{
  // This object variable
  private static Time3 instance; 
  
   // Private constructor to avoid new classe's incence
  private Time3(){}
  
  protected String time (
          double final_time,
          double delta_speed,
          double acceleration,
          int stepOrResult)
          {
            double step1 = delta_speed / acceleration;
            double step2 = final_time - step1;
            String res;
            
            if (stepOrResult == Physic.GET_STEP) {
              res = "ti = "
                  + final_time
                  + "s - "
                  + delta_speed
                  + "m/s ÷ "
                  + acceleration
                  + "m/s²"
                  + "\nti = "
                  + final_time
                  + "s - "
                  + step1
                  + "s"
                  + "\nti = "
                  + step2
                  + "s";
                  
              return res;
               
            } else if (stepOrResult == Physic.GET_RESULT) {
              return String.valueOf(step2);
              
            } else {
              return "Error 404: fourth parameter not found.";
            }
          }

    public String time (
    double final_time,
    String final_time_unit,
    double delta_speed, 
    String delta_speed_unit,
    double acceleration, 
    String acceleration_unit,
    String unit_of_result,
    int stepOrResult)
    
    {
      return null;
    }
    
    
    // Get class instance object
    public static Time3 getInstance()
    {
      if(instance == null)
      {
        instance = new Time3();
      }
      
      return instance;
    }
}
