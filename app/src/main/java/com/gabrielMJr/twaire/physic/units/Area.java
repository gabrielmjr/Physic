package com.gabrielMJr.twaire.physic.units;

import com.gabrielMJr.twaire.physic.units.AreaIF;

public class Area implements AreaIF 
{
  // This object variable
  private static Area instance; 

  // Those constants were used to tell to the program the unit that must use to calculate something
  // Also used to tell the unit from the variables as parameter

  public static final String SQUARE_KILOMETER = "0.000001";
  public static final String SQUARE_HECTOMETER = "0.0001";
  public static final String SQUARE_DECAMETER = ".01";
  public static final String SQUARE_METER = "1";
  public static final String SQUARE_DECIMETER = "100";
  public static final String SQUARE_CENTIMETER = "10000";
  public static final String SQUARE_MILLIMETER = "1000000";

  // Symbols of those constants
  public static final String SQUARE_KILOMETER_SYMBOL = "km²";
  public static final String SQUARE_HECTOMETER_SYMBOL = "hm²";
  public static final String SQUARE_DECAMETER_SYMBOL = "dam²";
  public static final String SQUARE_METER_SYMBOL = "m²";
  public static final String SQUARE_DECIMETER_SYMBOL = "dm²";
  public static final String SQUARE_CENTIMETER_SYMBOL = "cm²";
  public static final String SQUARE_MILLIMETER_SYMBOL = "mm²";
  
  
  
  // From another to kilometer
  @Override
  public Double toSquareKilometer(double value, String unit) {
    return ((value * Double.valueOf(SQUARE_KILOMETER)) / Double.valueOf(unit));
  }

  // From another to hectometer
  @Override
  public Double toSquareHectometer(double value, String unit) {
    return ((value * Double.valueOf(SQUARE_HECTOMETER)) / Double.valueOf(unit));
  }

  // From another to decameter
  @Override
  public Double toSquareDecameter(double value, String unit) {
    return ((value * Double.valueOf(SQUARE_DECAMETER)) / Double.valueOf(unit));
  }

  // From another to meter
  @Override
  public Double toSquareMeter(double value, String unit) {
    return ((value * Double.valueOf(SQUARE_METER)) / Double.valueOf(unit));
  }

  // From another to decimeter
  @Override
  public Double toSquareDecimeter(double value, String unit) {
    return ((value * Double.valueOf(SQUARE_DECIMETER)) / Double.valueOf(unit));
  }

  // From another to centimeter
  @Override
  public Double toSquareCentimeter(double value, String unit) {
    return ((value * Double.valueOf(SQUARE_CENTIMETER)) / Double.valueOf(unit));
  }

  // From another to millimeter
  @Override
  public Double toSquareMillimeter(double value, String unit) {
    return ((value * Double.valueOf(SQUARE_MILLIMETER)) / Double.valueOf(unit));
  }
  
  
  // Get class instance object
    protected static Area getInstance()
    {
      if(instance == null)
      {
        instance = new Area();
      }
      
      return instance;
    }
}
