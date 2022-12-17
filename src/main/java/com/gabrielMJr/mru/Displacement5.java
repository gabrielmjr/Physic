package com.gabrielMJr.physic.mru;

final class Displacement5 {
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
}
