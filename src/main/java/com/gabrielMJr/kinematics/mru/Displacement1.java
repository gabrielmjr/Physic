package com.gabrielMJr.physic.kinematics.mru;

final class Displacement1 {
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
  
}
