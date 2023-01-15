package com.gabrielMJr .physic.kinematics.mru;
 
final class Time5 
{
  // This object variable
  private static Time5 instance; 
  
   // Private constructor to avoid new classe's incence
  private Time5(){}
  
  // tf = ti + ∆t
  protected String time(
    double initial_time, 
    double variation_time) 
  {
    return String.valueOf(initial_time + variation_time);
  }
  
  protected String time(
    double initial_time, 
    String initial_time_unit,
    double variation_time,
    String variation_time_unit,
    String unit_of_result)
  {
    return null;
  }
  
  
  // Get class instance object
    public static Time5 getInstance()
    {
      if(instance == null)
      {
        instance = new Time5();
      }
      
      return instance;
    }
}
