package com.gabrielMJr.twaire.physic.kinematics.mru;
 
final class Displacement4
{
  // This object variable
  private static Displacement4 instance; 
  
   // Private constructor to avoid new classe's incence
  private Displacement4(){}
  
  // Initial displacement: Si = Sf - ∆S
  protected String displacement(
    double variation_displacement,
    double final_displacement) 
  {
    return String.valueOf(final_displacement - variation_displacement);
  }
  
  protected String displacement(
    double variation_displacement,
    String variation_displacement_unit,
    double final_displacement,
    String final_displacement_unit,
    String unit_of_result) 
  {
    return null;
  }
  
  
  // Get class instance object
    public static Displacement4 getInstance()
    {
      if(instance == null)
      {
        instance = new Displacement4();
      }
      
      return instance;
    }
}
