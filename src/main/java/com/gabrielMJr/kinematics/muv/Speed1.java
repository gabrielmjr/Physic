package com.gabrielMJr.physic.kinematics
.muv;

final class Speed1
{
  // This object variable
  private static Speed1 instance; 
  
   // Private constructor to avoid new classe's incence
  private Speed1(){}

    protected String speed (
    double delta_time, 
    double acceleration)
    {
    
      return String.valueOf(delta_time * acceleration);
    }

    public String speed (
    double delta_time,
    String delta_time_unit,
    double acceleration,
    String acceleration_unit,
    String unit_of_result) 
    {
    
      return null;
    }
    
    
    // Get class instance object
    public static Speed1 getInstance()
    {
      if(instance == null)
      {
        instance = new Speed1();
      }
      
      return instance;
    }
}
