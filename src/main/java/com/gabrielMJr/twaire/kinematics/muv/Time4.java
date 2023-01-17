package com.gabrielMJr.twaire.physic.kinematics.muv;

import com.gabrielMJr.twaire.physic.Physic;

final class Time4 
{
  
  // This object variable
  private static Time4 instance; 
  
   // Private constructor to avoid new classe's incence
  private Time4(){}
  
  protected String time (
    double initial_time, 
    double delta_speed, 
    double acceleration, 
    int stepOrResult)
    {
      
      double step1 = delta_speed / acceleration;
            double step2 = step1 + initial_time;
            String res;
            
            if (stepOrResult == Physic.GET_STEP) {
              
              res = "tf = "
                  + initial_time
                  + "s + ("
                  + delta_speed
                  + "m/s ÷ "
                  + acceleration
                  + "m/s²)"
                  + "\ntf = "
                  + initial_time
                  + "s + "
                  + step1
                  + "s"
                  +"\ntf = "
                  + step2
                  + "s";
                  
              return res;
              
            } else if (stepOrResult == Physic.GET_RESULT) {
              
              return String.valueOf(step2);
               
            } else {
              return "Error 404: fourth parameter not found.";
            }
    }
    
  
  protected  String time (
    double initial_time, 
    String initial_time_unit,
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
    public static Time4 getInstance()
    {
      if(instance == null)
      {
        instance = new Time4();
      }
      
      return instance;
    }
}
