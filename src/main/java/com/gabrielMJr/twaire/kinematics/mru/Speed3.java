package com.gabrielMJr.twaire.physic.kinematics.mru;
 
import com.gabrielMJr.twaire.physic.Physic;

final class Speed3
{
  // This object variable
  private static Speed3 instance; 
  
   // Private constructor to avoid new classe's incence
  private Speed3(){}
  
  // v = (Sf - Si) ÷ ∆t
  protected  String speed(
    double initial_displacement,
    double final_displacement,
    double delta_time,
    int resultOrStep)
  {
    double step1 = final_displacement - initial_displacement;
    double step2 = step1 / delta_time;
    String res = "";

    String signal1;
    String signal2;
    
    if (resultOrStep == Physic.GET_RESULT) 
    {
      return String.valueOf (step2);
       
    }
    else if (resultOrStep == Physic.GET_STEP) 
    {

      if (initial_displacement < 0) 
      {
        signal1 = " ";
      } else {
        signal1 = " - ";
      }

      if (delta_time < 0)
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
          + "m) ÷ "
          + delta_time
          + "s"
          + "\n"
          + "v = "
          + step1 
          + "m ÷ " 
          + delta_time
          + "s"
          + "\n"
          + "v = " 
          + step2
          + "m/s";

    return res;
    
    }
     else 
    {
      return "Erro 404: fourth parameter not found";
    }
  }
  
  protected  String speed(
    double initial_displacement,
    String initial_displacement_unit,
    double final_displacement,
    String final_displacement_unit,
    double delta_time,
    String delta_time_unit,
    String unit_of_result,
    int resultOrStep)
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
