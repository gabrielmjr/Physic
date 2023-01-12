package com.gabrielMJr.physic.units;

public class Time implements TimeIF
{
  // Those constants were used to tell to the program the unit that must use to calculate something
  // Also used to tell the unit from the variables as parameter
  public static final String SECOND = "60";
  public static final String MINUTE = "1";
  public static final String HOUR = "0.016666666666666666";
  public static final String DAY = "0.0006944444444444445";
  public static final String WEEK = "9.92063492063492E-05";
  
  // From another to kilometer
  @Override
  public Double toSecond(double value, String unit)
  {
    return ((value * Double.valueOf(SECOND)) / Double.valueOf(unit));
  }
  
  @Override
  public Double toMinute(double value, String unit)
  {
    return ((value * Double.valueOf(MINUTE)) / Double.valueOf(unit));
  }
  
  @Override
  public Double toHour(double value, String unit)
  {
    return ((value * Double.valueOf(HOUR)) / Double.valueOf(unit));
  }
  
  @Override
  public Double toDay(double value, String unit)
  {
    return ((value * Double.valueOf(DAY)) / Double.valueOf(unit));
  }
  
  @Override
  public Double toWeek(double value, String unit)
  {
    return ((value * Double.valueOf(WEEK)) / Double.valueOf(unit));
  }
}
