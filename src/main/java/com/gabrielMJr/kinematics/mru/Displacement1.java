package com.gabrielMJr.physic.kinematics.mru;

final class Displacement1 
{
  // This object variable
  private static Displacement1 instance; 
  
  // Private constructor to avoid new classe's incence
  private Displacement1(){}
  
  // Displacement: ∆S = sf - si
  protected String displacement (
    double initial_displacement, 
    double final_displacement)
  {
      return String.valueOf(
        final_displacement - initial_displacement);
  }
  
  protected String displacement(
    double initial_displacement,
    String initial_displacement_unit,
    double final_displacement,
    String final_displacement_unit,
    String unit_of_result)
  {
    return null;
  }
  
  // Get class instance object
    public static Displacement1 getInstance()
    {
      if(instance == null)
      {
        instance = new Displacement1();
      }
      
      return instance;
    }
}
