package com.gabrielMJr.twaire.physic.kinematics.muv;

import com.gabrielMJr.twaire.physic.Physic;

final class Time2
{
  // This object variable
  private static Time2 instance; 
  
   // Private constructor to avoid new classe's incence
  private Time2(){}

  protected String time(
      double initial_speed, 
      double final_speed, 
      double acceleration, 
      int stepOrResult) 
      {
        
          double step1 = final_speed - initial_speed;
          double step2 = step1 / acceleration;
          String res;
          
          if (stepOrResult == Physic.GET_STEP) {
            res = "∆t = ("
                + final_speed
                + "m/s - "
                + initial_speed
                + "m/s) ÷ "
                + acceleration
                + "m/s²"
                + "\n∆t = "
                + step1
                + "m/s ÷ "
                + acceleration
                + "m/s²"
                + "\n∆t = "
                + step2
                + "s";
                
            return res;
            
          } else if (stepOrResult == Physic.GET_RESULT) {
            return String.valueOf(step2);
            
          } else {
            return "Error 404: fourth parameter not found.";
          }
      }

  protected String time(
      double initial_speed,
      String initial_speed_unit,
      double final_speed,
      String final_speed_unit,
      double acceleration,
      String acceleration_unit,
      String unit_of_result,
      int stepOrResult) {

    return null;
  }
  
  
  // Get class instance object
    public static Time2 getInstance()
    {
      if(instance == null)
      {
        instance = new Time2();
      }
      
      return instance;
    }
}