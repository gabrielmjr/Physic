package com.gabrielMJr.physic.kinematics.mru;
 
import com.gabrielMJr.physic.Physic;

final class Speed2 {
  // v = (Sf - Si) ÷ (tf - ti)
  protected  String speed(
    double initial_displacement,
    double final_displacement,
    double initial_time,
    double final_time,
    int resultOrStep)
  {
    double step1 = final_displacement - initial_displacement;
    double step2 = final_time - initial_time;
    double step3 = step1 / step2;
    String res = "";

    String signal1;
    String signal2;
    
    if (resultOrStep == Physic.GET_RESULT) 
    {
      return String.valueOf (step3);
       
    }
    else if (resultOrStep == Physic.GET_STEP) 
    {

      if (initial_displacement < 0) 
      {
        signal1 = " ";
      } else {
        signal1 = " - ";
      }

      if (initial_time < 0)
      {
        signal2 = " ";
      } else {
        signal2 = " - ";
      }
  
      res = "v = ("
          + final_displacement
          + "m"
          + signal1
          + initial_displacement
          + "m) ÷ ("
          + final_time
          + "s"
          + signal2
          + initial_time
          + "s)"
          + "\n"
          + "v = "
          + step1 
          + "m ÷ " 
          + step2
          + "s"
          + "\n"
          + "v = " 
          + step3
          + "m/s";

    return res;
    
    }
     else 
    {
      return "Erro 404: fifth parameter not found";
    }
  }
  
  protected  String speed(
    double initial_displacement,
    String initial_displacement_unit,
    double final_displacement,
    String final_displacement_unit,
    double initial_time,
    String initial_time_unit,
    double final_time,
    String final_time_unit,
    String unit_of_result,
    int resultOrStep)
  {
    return null;
  }
}
