package com.gabrielMJr.physic.kinematics.muv;

import com.gabrielMJr.physic.Physic;

final class Acceleration4 
{
  // This object variable
  private static Acceleration4 instance; 
  
   // Private constructor to avoid new classe's incence
  private Acceleration4(){}
  
  protected String acceleration (
    double initial_speed,
    double final_speed,
    double initial_time,
    double final_time,
    int stepOrResult)
    {
      
      // Attributes 
      double step1 = final_speed - initial_speed;
      double step2 = final_time - initial_time;
      double step3 = step1 / step2;
      String res;
      
      // if stepOrResult.equals (getStep)
      if (stepOrResult == Physic.GET_STEP) {
        res = "a = ("
            + final_speed
            + "m/s - "
            + initial_speed
            + "m/s) ÷ ("
            + final_time
            + "s - "
            + initial_time
            + "s)"
            + "\na = ("
            + step1
            + "m/s) ÷ "
            + step2
            + "s"
            + "\na = "
            + step3
            + "m/s²";
            
        return res;
        
      } else if (stepOrResult == Physic.GET_RESULT) {
        return String.valueOf(step3);
        
      } else {
        return "Error 404: fifth parameter not found.";
      }
    }
    
    protected String acceleration (
    double initial_speed, 
    String initial_speed_unit, 
    double final_speed, 
    String final_speed_unit, 
    double initial_time, 
    String initial_time_unit, 
    double final_time, 
    String final_time_unit,
    String unit_of_result, 
    int stepOrResult)
    {
    
      return null;
    }
    
    
    // Get class instance object
    public static Acceleration4 getInstance()
    {
      if(instance == null)
      {
        instance = new Acceleration4();
      }
      
      return instance;
    }
}
