package com.gabrielMJr.physic.mru;

import com.gabrielMJr.physic.Physic;

final class Time3 {

  // ∆t = (Sf - Si) / v
  protected String time(
    double initial_displacement,
    double final_displacement,
    double speed,
    int resultOrStep)
  {
    double step1 = final_displacement - initial_displacement;
    double step2 = step1 / speed;
    String res = "";
    String signal;
    
    if (resultOrStep == Physic.GET_RESULT) 
    {
      return String.valueOf (step2);
       
    }
    else if (resultOrStep == Physic.GET_STEP) 
    {
    
      if (initial_displacement < 0) 
      {
        signal = " ";
      } 
      else 
      {
        signal = " - ";
      }

      res =
          "∆t = ("
            + String.valueOf(final_displacement)
            + "m"
            + signal
            + String.valueOf(initial_displacement)
            + "m) ÷ ("
            + String.valueOf(speed)
            + "m/s)"
            + "\n"
            + "∆t = "
            + String.valueOf(step1) 
            + "m ÷ (" 
            + String.valueOf(speed) 
            + "m/s)"
            + "\n"
            + "∆t = " 
            + String.valueOf(step2) 
            + "s";
 
      return res;
      
    } 
    else 
    {
      return "Erro 404: fourth parameter not found";
    }
   }
  
  protected String time(
    double initial_displacement,
    String initial_displacement_unit,
    double final_displacement,
    String final_displacement_unit,
    double speed,
    String speed_unit,
    String unit_of_result,
    int resultOrStep)
  {
    return null;
  }
}
