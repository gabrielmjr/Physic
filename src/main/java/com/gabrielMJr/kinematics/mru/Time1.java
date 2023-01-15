package com.gabrielMJr.physic.kinematics.mru;
 
final class Time1
{
  // This object variable
  private static Time1 instance; 
  
   // Private constructor to avoid new classe's incence
  private Time1(){}
  
  // ∆t = tf - ti
  protected String time(
    double initial_time,
    double final_time)
  {
    return String.valueOf(final_time - initial_time);
  }
  
  protected String time(
    double initial_time,
    String initial_time_unit,
    double final_time,
    String final_time_unit,
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
