package com.gabrielMJr.twaire.physic.units;

import com.gabrielMJr.twaire.physic.Physic;
import com.gabrielMJr.twaire.physic.units.LengthIF;

public class Length implements LengthIF
{
  // This object variable
  private static Length instance; 
  
  Physic physic = new Physic();

  // Those constants were used to tell to the program the unit that must use to calculate something
  // Also used to tell the unit from the variables as parameter
  
  public static final String KILOMETER = "0.001";
  public static final String HECTOMETER = "0.01";
  public static final String DECAMETER = "0.1";
  public static final String METER = "1";
  public static final String DECIMETER = "10";
  public static final String CENTIMETER = "100";
  public static final String MILLIMETER = "1000";
  
    // Symbols of those constants
  public static final String KILOMETER_SYMBOL = "km";
  public static final String HECTOMETER_SYMBOL = "hm";
  public static final String DECAMETER_SYMBOL = "dam";
  public static final String METER_SYMBOL = "m";
  public static final String DECIMETER_SYMBOL = "dm";
  public static final String CENTIMETER_SYMBOL = "cm";
  public static final String MILLIMETER_SYMBOL= "mm";
  
  
  // Convert from another units to kilometer
  @Override
  public Double toKilometer (
    double value,
    String unit)  
    {
      double res = (value * Double.valueOf(KILOMETER)) /
      Double.valueOf (unit);
      return res;
    }
    
  // Convert from another units to hectometer
  @Override
  public Double toHectometer (
    double value,
    String unit)
    {
      double res = (value * Double.valueOf (HECTOMETER)) / Double.valueOf (unit);
      return res;
    }
    
      // Convert from another units to decameter
  @Override
  public Double toDecameter (
    double value,
    String unit)
    {
      double res = (value * Double.valueOf (DECAMETER)) / Double.valueOf (unit);
      return res;
    }
    
      // Convert from another units to meter
  @Override
  public Double toMeter (
    double value,
    String unit)
    {
      double res = (value * Double.valueOf (METER)) / Double.valueOf (unit);
      return res;
    }
    
      // Convert from another units to decimeter
  @Override
  public Double toDecimeter (
    double value,
    String unit)
    {
      double res = (value * Double.valueOf (DECIMETER)) / Double.valueOf (unit);
      return res;
    }
    
      // Convert from another units to centimeter
  @Override
  public Double toCentimeter (
    double value,
    String unit)
    {
      double res = (value * Double.valueOf (CENTIMETER)) / Double.valueOf (unit);
      return res;
    }
    
      // Convert from another units to hectometer
  @Override
  public Double toMillimeter (
    double value,
    String unit)
    {
      double res = (value * Double.valueOf (MILLIMETER)) / Double.valueOf (unit);
      return res;
    }
    
    
    // Get class instance object
    protected static Length getInstance()
    {
      if(instance == null)
      {
        instance = new Length();
      }
      
      return instance;
    }
}
