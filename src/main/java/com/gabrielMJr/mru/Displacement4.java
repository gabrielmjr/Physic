package com.gabrielMJr.physic.mru;

final class Displacement4 {

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
}
