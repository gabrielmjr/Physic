package com.gabrielMJr.twaire.physic;

import com.gabrielMJr.twaire.physic.AreaIF;

public class Area implements AreaIF{
  
    // Those constants were used to tell to the program the unit that must use to calculate something
  // Also used to tell the unit from the variables as parameter
  
  public final String SQUARE_KILOMETER = "0.000001";
  public final String SQUARE_HECTOMETER = "0.0001";
  public final String SQUARE_DECAMETER = ".01";
  public final String SQUARE_METER = "1";
  public final String SQUARE_DECIMETER = "100";
  public final String SQUARE_CENTIMETER = "10000";
  public final String SQUARE_MILIMETER = "100000";
  
  // 
  @Override
  public double toSquareKilometer (
    double value,
    String value_unit) {
      return ((value * Double.valueOf (SQUARE_KILOMETER)) / Double.valueOf (value_unit));
    }
      
      @Override
  public double toSquareHectometer (
    double value,
    String value_unit) {
      return ((value * Double.valueOf (SQUARE_HECTOMETER)) / Double.valueOf (value_unit));
    }
    
      @Override
  public double toSquareDecameter (
    double value,
    String value_unit) {
      return ((value * Double.valueOf (SQUARE_DECAMETER)) / Double.valueOf (value_unit));
    }
    
      @Override
  public double toSquareMeter (
    double value,
    String value_unit) {
      return ((value * Double.valueOf (SQUARE_METER)) / Double.valueOf (value_unit));
    }
    
      @Override
  public double toSquareDecimeter (
    double value,
    String value_unit) {
      return ((value * Double.valueOf (SQUARE_DECIMETER)) / Double.valueOf (value_unit));
    }
    
      @Override
  public double toSquareCentimeter (
    double value,
    String value_unit) {
      return ((value * Double.valueOf (SQUARE_CENTIMETER)) / Double.valueOf (value_unit));
    }
    
      @Override
  public double toSquareMilimeter (
    double value,
    String value_unit) {
      return ((value * Double.valueOf (SQUARE_MILIMETER)) / Double.valueOf (value_unit));
    }
}
