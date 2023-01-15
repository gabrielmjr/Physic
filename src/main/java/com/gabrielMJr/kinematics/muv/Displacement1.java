package com.gabrielMJr.physic.kinematics.muv;

import com.gabrielMJr.physic.Physic;

final class Displacement1 
{
  // This object variable
  private static Displacement1 instance; 
  
   // Private constructor to avoid new classe's incence
  private Displacement1(){}
  
  protected  String displacement (
    double initial_displacement, 
    double initial_speed, 
    double delta_time, 
    double acceleration, 
    int stepOrResult)
    {
      
      double step1 = initial_speed * delta_time;
      double step11 = Math.pow(delta_time, 2);
      double step2 = initial_displacement + step1;
      double step22 = acceleration * step11;
      double step3 = step22 / 2;
      double step4 = step2 + step3;
      String res;
              
      if (stepOrResult == Physic.GET_STEP) {             
        res = "S = "
            + initial_displacement
            + "m + "
            + initial_speed
            + "m/s × "
            + delta_time
            + "s + ["
            + acceleration
            + "m/s² × ("
            + delta_time
            + "s)²] ÷ 2"
            + "\nS = "
            + initial_displacement
            + "m + "
            + step1
            + "m + ("
            + acceleration
            + "m/s² × "
            + step11
            + "s²) ÷ 2"
            + "\nS = "
            + step2
            + "m + ("
            + step22
            + " ÷ 2) (m×s²)/s²"
            + "\nS = "
            + step2
            + "m + "
            + step3
            + "m"
            + "\nS = "
            + step4
            + "m";
                
      return res;
                
    } 
    else if 
    (stepOrResult == Physic.GET_RESULT)
    {            
      return String.valueOf(step4);
                
    } 
    else 
    {
      return "Error 404: fifth parameter not found.";
     }
   }
    
  protected String displacement (
    double initial_displacement,
    String initial_displacement_unit,
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
    
    
    // Get class instance object
    public static Displacement1 getInstance()
    {
      if(instance == null)
      {
        instance = new Displacement1();
      }
      
      return instance;
    }
}
