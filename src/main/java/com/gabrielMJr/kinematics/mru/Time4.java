package com.gabrielMJr.physic.kinematics.mru;
 
final class Time4 
{
  // This object variable
  private static Time4 instance;
  
   // Private constructor to avoid new classe's incence
  private Time4(){}
  
  // ti = tf + ∆t
  protected String time(
    double variation_time, 
    double final_time) 
  {
    return String.valueOf(final_time - variation_time);
  }
  
  protected String time(
    double variation_time, 
    String variation_time_unit,
    double final_time,
    String final_time_unit,
    String unit_of_result) 
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
