package com.gabrielMJr.twaire.physic;

import com.gabrielMJr.twaire.physic.Physic;
import com.gabrielMJr.twaire.physic.DistanceIF;

public class Distance implements DistanceIF{

  Physic physic = new Physic();

  // Those constants were used to tell to the program the unit that must use to calculate something
  // Also used to tell the unit from the variables as parameter
  // The  didtance units String start with 0
  
  public final String KILOMETER = "0.001";
  public final String HECTOMETER = "0.01";
  public final String DECAMETER = "0.1";
  public final String METER = "1";
  public final String DECIMETER = "10";
  public final String CENTIMETER = "100";
  public final String MILIMETER = "1000";
  
  
  // Convert from another units to kilometer
  @Override
  public String toKilometer (
    double value,
    String value_unit)  
    {
      double res = (value * Double.valueOf(KILOMETER)) /
      Double.valueOf (value_unit);
      return  String.valueOf(res);
    }
    
  // Convert from another units to hectometer
  @Override
  public String toHectometer (
    double value,
    String value_unit)
    {
      double res = (value * Double.valueOf (HECTOMETER)) / Double.valueOf (value_unit);
      return String.valueOf (res);
    }
    
      // Convert from another units to decameter
  @Override
  public String toDecameter (
    double value,
    String value_unit)
    {
      double res = (value * Double.valueOf (DECAMETER)) / Double.valueOf (value_unit);
      return String.valueOf (res);
    }
    
      // Convert from another units to meter
  @Override
  public String toMeter (
    double value,
    String value_unit)
    {
      double res = (value * Double.valueOf (METER)) / Double.valueOf (value_unit);
      return String.valueOf (res);
    }
    
      // Convert from another units to decimeter
  @Override
  public String toDecimeter (
    double value,
    String value_unit)
    {
      double res = (value * Double.valueOf (DECIMETER)) / Double.valueOf (value_unit);
      return String.valueOf (res);
    }
    
      // Convert from another units to centimeter
  @Override
  public String toCentimeter (
    double value,
    String value_unit)
    {
      double res = (value * Double.valueOf (CENTIMETER)) / Double.valueOf (value_unit);
      return String.valueOf (res);
    }
    
      // Comvert from another units to hectometer
  @Override
  public String toMilimeter (
    double value,
    String value_unit)
    {
      double res = (value * Double.valueOf (MILIMETER)) / Double.valueOf (value_unit);
      return String.valueOf (res);
    }
}
