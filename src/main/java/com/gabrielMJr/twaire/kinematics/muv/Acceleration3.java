package com.gabrielMJr.twaire.physic.kinematics.muv;

import com.gabrielMJr.twaire.physic.Physic;

final class Acceleration3
{
  // This object variable
  private static Acceleration3 instance; 
  
   // Private constructor to avoid new classe's incence
  private Acceleration3(){}
  
  protected String acceleration (
      double initial_speed,
      double final_speed, 
      double variation_time,
      int stepOrResult)
      {
    
    // Attributes 
    double step1 = final_speed - initial_speed;
    double step2 = step1 / variation_time;
    String res; 
    
    // If the user want the steps, return the steps
    if (stepOrResult == Physic.GET_STEP) {
      res = "a = ("
               + final_speed
               + "m/s - "
               + initial_speed
               + "m/s) ÷ ("
               + variation_time
               + "s)"
               + "\na = ("
               + step1
               + "m/s) ÷ "
               + variation_time
               + "s"
               + "\na = "
               + step2
               +"m/s²";
      
      return res;
      
    // Else if equals to get result, return result
    } else if (stepOrResult == Physic.GET_RESULT) {
      return String.valueOf (step2);
      
    } else {
      return "Error 404: fourth parameter not found.";
    }
  }
  
  public String acceleration (
  double initial_speed, 
  String initial_speed_unit, 
  double final_speed, 
  String final_speed_unit, 
  double variation_time, 
  String variation_time_unit, 
  String unit_of_result, 
  int stepOrResult)
  {
  
    return null;
  }
  
  
  // Get class instance object
    public static Acceleration3 getInstance()
    {
      if(instance == null)
      {
        instance = new Acceleration3();
      }
      
      return instance;
    }
}
