package com.gabrielMJr.physic.kinematics.mru;
 
final class Time2 
{
  // This object variable
  private static Time2 instance; 
  
   // Private constructor to avoid new classe's incence
  private Time2(){}
  
  // ∆t = ∆S / media speed
  protected  String time(
    double variation_displacement, 
    double speed) 
  {
    return String.valueOf(variation_displacement / speed);
  }
  
  protected  String time(
    double variation_displacement, 
    String variation_displacement_unit,
    double speed,
    String speed_unit,
    String unit_of_result) 
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
