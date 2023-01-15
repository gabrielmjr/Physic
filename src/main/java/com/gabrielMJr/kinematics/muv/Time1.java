package com.gabrielMJr.physic.kinematics.muv;

final class Time1 
{
  // This object variable
  private static Time1 instance; 
  
   // Private constructor to avoid new classe's incence
  private Time1(){}
  
  protected String time (
    double delta_speed, 
    double acceleration)
    {
      
      return String.valueOf(delta_speed / acceleration);
    }
   
    protected String time (
    double delta_speed,
    String delta_speed_unit, 
    double acceleration,
    String acceleration_unit,
    String unit_of_result)
    {
      
      return null;
    }
    
    
    // Get class instance object
    public static Time1 getInstance()
    {
      if(instance == null)
      {
        instance = new Time1();
      }
      
      return instance;
    }
}
