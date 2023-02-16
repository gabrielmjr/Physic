package com.gabrielMJr.twaire.physic.kinematics.mru;
 
final class Displacement2
{
  // This object variable
  private static Displacement2 instance; 
  
   // Private constructor to avoid new classe's incence
  private Displacement2(){}
  
  // Displacementv ∆S = ∆t × media_speed
  protected String displacement (
    double variation_time, 
    double media_speed) 
  {
      return String.valueOf(variation_time * media_speed);
  }
  
  protected String displacement (
    double variation_time, 
    String variation_time_unit,
    double media_speed,
    String media_speed_unit,
    String unit_of_result) 
  {
    return null;
  }
  
  
  // Get class instance object
    public static Displacement2 getInstance()
    {
      if(instance == null)
      {
        instance = new Displacement2();
      }
      
      return instance;
    }
}
