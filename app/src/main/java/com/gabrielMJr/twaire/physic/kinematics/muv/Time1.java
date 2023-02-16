package com.gabrielMJr.twaire.physic.kinematics.muv;

final class Time1 
{
  // This object variable
  private static Time1 instance; 
  
   // Private constructor to avoid new classe's incence
  private Time1(){}
  
  protected String time (
    double deltaSpeed, 
    double acceleration)
    {
      
      return String.valueOf(deltaSpeed / acceleration);
    }
   
    protected String time (
    double deltaSpeed,
    String deltaSpeedUnit, 
    double acceleration,
    String accelerationUnit,
    String unitOfResult)
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
