package com.gabrielMjr.physic.units;

import com.gabrielMJr.physic.units.VolumeIF;

public class Volume implements VolumeIF{
  
    // Those constants were used to tell to the program the unit that must use to calculate something
  // Also used to tell the unit from the variables as parameter
  
  public final String CUBE_KILOMETER = "0.000000001";
  public final String CUBE_HECTOMETER = "0.000001";
  public final String CUBE_DECAMETER = "0.001";
  public final String CUBE_METER = "1";
  public final String CUBE_DECIMETER = "1000";
  public final String CUBE_CENTIMETER = "1000000";
  public final String CUBE_MILIMETER = "1000000000";
  
  // 
  @Override
  public double toCubeKilometer (
    double value,
    String value_unit) {
      return ((value * Double.valueOf (CUBE_KILOMETER)) / Double.valueOf (value_unit));
    }
      
      @Override
  public double toCubeHectometer (
    double value,
    String value_unit) {
      return ((value * Double.valueOf (CUBE_HECTOMETER)) / Double.valueOf (value_unit));
    }
    
      @Override
  public double toCubeDecameter (
    double value,
    String value_unit) {
      return ((value * Double.valueOf (CUBE_DECAMETER)) / Double.valueOf (value_unit));
    }
    
      @Override
  public double toCubeMeter (
    double value,
    String value_unit) {
      return ((value * Double.valueOf (CUBE_METER)) / Double.valueOf (value_unit));
    }
    
      @Override
  public double toCubeDecimeter (
    double value,
    String value_unit) {
      return ((value * Double.valueOf (CUBE_DECIMETER)) / Double.valueOf (value_unit));
    }
    
      @Override
  public double toCubeCentimeter (
    double value,
    String value_unit) {
      return ((value * Double.valueOf (CUBE_CENTIMETER)) / Double.valueOf (value_unit));
    }
    
      @Override
  public double toCubeMilimeter (
    double value,
    String value_unit) {
      return ((value * Double.valueOf (CUBE_MILIMETER)) / Double.valueOf (value_unit));
    }
}