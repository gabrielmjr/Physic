package com.gabrielMJr.twaire.physic.kinematics.mru;

import com.gabrielMJr.twaire.physic.Physic;


final class Speed4
{
   // This object variable
  private static Speed4 instance; 
  
   // Private constructor to avoid new classe's incence
   private Speed4(){}
   
   // v = ∆S ÷ (tf - ti)
   protected String speed
     (double delta_displacement,
     double initial_time,
     double final_time,
     int stepOrResult)
     {
     double step1 = final_time - initial_time;
     double step2 = delta_displacement / step1;
     String res = "";
       
     String signal_1;
       
     if (stepOrResult == Physic.GET_RESULT)
       {
         return String.valueOf(step2);
       }
     else if (stepOrResult == Physic.GET_STEP)
     {
       if (initial_time < 0)
       {
         signal_1 = " ";
       }
       else
       {
         signal_1 = " - ";
       }
         
       res = "v = ("
           + delta_displacement
           + "m) ÷ ("
           + final_time 
           + "m "
           + signal_1
           + initial_time
           + "m)"
           + "\n"
           + "v = "
           + delta_displacement
           + "m ÷ "
           + step1
           + "s"
           + "\n"
           + "v = "
           + step2 
           + "m/s";
             
       return res;
     }
     else 
     {
       return "Erro 404: third parameter not found";
     }
   }
   
   
   protected String speed(
     double delta_displacement,
     String delta_displacement_unit,
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
    public static Speed4 getInstance()
    {
      if(instance == null)
      {
        instance = new Speed4();
      }
      
      return instance;
    }
}