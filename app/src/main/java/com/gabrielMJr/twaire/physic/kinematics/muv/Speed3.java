package com.gabrielMJr.twaire.physic.kinematics.muv;

import com.gabrielMJr.twaire.physic.Physic;

final class Speed3 
{
  // This object variable
  private static Speed3 instance; 
  
   // Private constructor to avoid new classe's incence
  private Speed3(){}

  protected String speed (
      double finalVelocity,
      double deltaTime,
      double acceleration,
      int stepOrResult) 
      {
        
        double step1 = deltaTime * acceleration;
        double step2 = finalVelocity - step1;
        String res;
        
        if (stepOrResult == Physic.GET_STEP) {
          res = "vi = "
              + finalVelocity
              + "m/s - "
              + deltaTime
              + "s × "
              + acceleration
              + "m/s²"
              + "\nvi = "
              + finalVelocity
              + "m/s - "
              + step1
              + "m/s"
              +"\nvi = "
              + step2
              + "m/s";
              
          return res;
          
        } else if (stepOrResult == Physic.GET_RESULT) {
          return String.valueOf(step2);
          
        } else {
          return "Error 404: fourth parameter not found.";
        }
      }
      
  protected String speed (
    double finalVelocity, 
    String finalSpeedUnit,
    double deltaTime, 
    String deltaTimeUnit,
    double acceleration, 
    String accelerationUnit,
    String unit_of_result,
    int stepOrResult)
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
