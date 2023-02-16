package com.gabrielMJr.twaire.physic.kinematics.mru;
 
final class Time2 
{
  // This object variable
  private static Time2 instance; 
  
   // Private constructor to avoid new classe's incence
  private Time2(){}
  
  // ∆t = ∆S / media velocity
  protected  String time(
    double deltaDisplacement, 
    double velocity) 
  {
    return String.valueOf(deltaDisplacement / velocity);
  }
  
  protected  String time(
    double deltaDisplacement, 
    String deltaDisplacementUnit,
    double velocity,
    String velocityUnit,
    String unitOfResult) 
  {
    return null;
  }
  
  
  // Get class instance object
    public static Time2 getInstance()
    {
      if(instance == null)
      {
        instance = new Time2();
      }
      
      return instance;
    }
}
