package com.gabrielMJr.physic.units;

import com.gabrielMJr.physic.units.VolumeIF;

public class Volume implements VolumeIF
{
  // This object variable
  private static Volume instance; 
  
  // Those constants were used to tell to the program the unit that must use to calculate something
  // Also used to tell the unit from the variables as parameter
  
  public static final String CUBE_KILOMETER = "0.000000001";
  public static final String CUBE_HECTOMETER = "0.000001";
  public static final String CUBE_DECAMETER = "0.001";
  public static final String CUBE_METER = "1";
  public static final String CUBE_DECIMETER = "1000";
  public static final String CUBE_CENTIMETER = "1000000";
  public static final String CUBE_MILLIMETER = "1000000000";
  
  // 
  @Override
  public Double toCubeKilometer (
    double value,
    String value_unit) {
      return ((value * Double.valueOf (CUBE_KILOMETER)) / Double.valueOf (value_unit));
    }
      
  @Override
  public Double toCubeHectometer (
    double value,
    String value_unit) {
      return ((value * Double.valueOf (CUBE_HECTOMETER)) / Double.valueOf (value_unit));
    }
    
  @Override
  public Double toCubeDecameter (
    double value,
    String value_unit) {
      return ((value * Double.valueOf (CUBE_DECAMETER)) / Double.valueOf (value_unit));
    }
    
  @Override
  public Double toCubeMeter (
    double value,
    String value_unit) {
      return ((value * Double.valueOf (CUBE_METER)) / Double.valueOf (value_unit));
    }
    
  @Override
  public Double toCubeDecimeter (
    double value,
    String value_unit) {
      return ((value * Double.valueOf (CUBE_DECIMETER)) / Double.valueOf (value_unit));
    }
    
  @Override
  public Double toCubeCentimeter (
    double value,
    String value_unit) {
      return ((value * Double.valueOf (CUBE_CENTIMETER)) / Double.valueOf (value_unit));
    }
    
  @Override
  public Double toCubeMillimeter (
    double value,
    String value_unit) {
      return ((value * Double.valueOf (CUBE_MILLIMETER)) / Double.valueOf (value_unit));
    }
    
    
    // Get class instance object
    protected static Volume getInstance()
    {
      if(instance == null)
      {
        instance = new Volume();
      }
      
      return instance;
    }
}