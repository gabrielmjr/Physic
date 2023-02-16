package com.gabrielMJr.twaire.physic.kinematics.mru;
 
final class Time4 
{
  // This object variable
  private static Time4 instance;
  
   // Private constructor to avoid new classe's incence
  private Time4(){}
  
  // ti = tf + ∆t
  protected String time(
    double deltaTime, 
    double finalTime) 
  {
    return String.valueOf(finalTime - deltaTime);
  }
  
  protected String time(
    double deltaTime, 
    String deltaTimeUnit,
    double finalTime,
    String finalTimeUnit,
    String unitOfResult) 
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
