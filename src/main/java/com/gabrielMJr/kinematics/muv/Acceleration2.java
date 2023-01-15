package com.gabrielMJr.physic.kinematics.muv;

import com.gabrielMJr.physic.Physic;

final class Acceleration2 
{
  // This object variable
  private static Acceleration2 instance; 
  
   // Private constructor to avoid new classe's incence
  private Acceleration2(){}

  protected String acceleration(
       double deltaSpeed,
       double initialTime,
       double finalTime,
       int stepOrResult) {
       
    double step1 = finalTime - initialTime;
    double step2 = deltaSpeed / step1;
    String res = "a = (";

    if (stepOrResult == Physic.GET_STEP) {
    
      res += deltaSpeed
           + "m/s) ÷ ("
           + finalTime
           + " s - "
           + initialTime
           + "s)"
           + "\na = ("
           + deltaSpeed
           + "m/s) ÷ ("
           + step1
           + "s)"
           + "\n"
           + "a = "
           + step2
           + "m/s²";
           
       return res;
       
    } else if (stepOrResult == Physic.GET_RESULT) {
      return String.valueOf((deltaSpeed) / (finalTime - initialTime));
      
    } else {
      return "Error 404: fourth parameter not found.";
    }
  }
  
  
  // Get class instance object
    public static Acceleration2 getInstance()
    {
      if(instance == null)
      {
        instance = new Acceleration2();
      }
      
      return instance;
    }
}
