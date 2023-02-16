package com.gabrielMJr.twaire.physic.kinematics.mru;
 
final class Displacement5
{
  // This object variable
  private static Displacement5 instance; 
  
   // Private constructor to avoid new classe's incence
  private Displacement5(){}
  
  // Final displacement: Sf = Si + ∆S
  protected String displacement(
    double initial_displacement, 
    double variation_displacement)
  {
    return String.valueOf(initial_displacement + variation_displacement);
  }

  protected String displacement(
    double initial_displacement,
    String initial_displacement_unit, 
    double variation_displacement,
    String variation_displacement_unit,
    String unit_of_result)
  {
    return null;
  }
  
  
  // Get class instance object
    public static Displacement5 getInstance()
    {
      if(instance == null)
      {
        instance = new Displacement5();
      }
      
      return instance;
    }
}
