package com.gabrielMJr.physic.units;

import com.gabrielMJr.physic.units.AreaIF;

public class Area implements AreaIF {

  // Those constants were used to tell to the program the unit that must use to calculate something
  // Also used to tell the unit from the variables as parameter

  public static final String SQUARE_KILOMETER = "0.000001";
  public static final String SQUARE_HECTOMETER = "0.0001";
  public static final String SQUARE_DECAMETER = ".01";
  public static final String SQUARE_METER = "1";
  public static final String SQUARE_DECIMETER = "100";
  public static final String SQUARE_CENTIMETER = "10000";
  public static final String SQUARE_MILIMETER = "100000";

  // Symbols of those constants
  public static final String SQUARE_KILOMETER_SYMBOL = "km²";
  public static final String SQUARE_HECTOMETER_SYMBOL = "hm²";
  public static final String SQUARE_DECAMETER_SYMBOL = "dam²";
  public static final String SQUARE_METER_SYMBOL = "m²";
  public static final String SQUARE_DECIMETER_SYMBOL = "dm²";
  public static final String SQUARE_CENTIMETER_SYMBOL = "cm²";
  public static final String SQUARE_MILIMETER_SYMBOL = "mm²";
  
  
  
  // From another to kilometer
  @Override
  public double toSquareKilometer(double value, String value_unit) {
    return ((value * Double.valueOf(SQUARE_KILOMETER)) / Double.valueOf(value_unit));
  }

  // From another to hectometer
  @Override
  public double toSquareHectometer(double value, String value_unit) {
    return ((value * Double.valueOf(SQUARE_HECTOMETER)) / Double.valueOf(value_unit));
  }

  // From another to decameter
  @Override
  public double toSquareDecameter(double value, String value_unit) {
    return ((value * Double.valueOf(SQUARE_DECAMETER)) / Double.valueOf(value_unit));
  }

  // From another to meter
  @Override
  public double toSquareMeter(double value, String value_unit) {
    return ((value * Double.valueOf(SQUARE_METER)) / Double.valueOf(value_unit));
  }

  // From another to decimeter
  @Override
  public double toSquareDecimeter(double value, String value_unit) {
    return ((value * Double.valueOf(SQUARE_DECIMETER)) / Double.valueOf(value_unit));
  }

  // From another to centimeter
  @Override
  public double toSquareCentimeter(double value, String value_unit) {
    return ((value * Double.valueOf(SQUARE_CENTIMETER)) / Double.valueOf(value_unit));
  }

  // From another to milimeter
  @Override
  public double toSquareMilimeter(double value, String value_unit) {
    return ((value * Double.valueOf(SQUARE_MILIMETER)) / Double.valueOf(value_unit));
  }
}
