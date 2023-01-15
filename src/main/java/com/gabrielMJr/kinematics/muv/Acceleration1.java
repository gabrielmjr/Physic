package com.gabrielMJr.physic.kinematics.muv;
 
final class Acceleration1
{
  // This object variable
  private static Acceleration1 instance; 
  
   // Private constructor to avoid new classe's incence
  private Acceleration1(){}
  
  protected String acceleration(
  double deltaSpeed, 
  double deltaTime)
  {
  
    return String.valueOf(deltaSpeed / deltaTime);
  }
  
  protected String acceleration(
  double deltaSpeed, 
  String deltaSpeed_unit,
  double deltaTime,
  String deltaTime_unit,
  String unit_of_result)
  {
  
    return null;
  }
  
  
  // Get class instance object
    public static Acceleration1 getInstance()
    {
      if(instance == null)
      {
        instance = new Acceleration1();
      }
      
      return instance;
    }
}
