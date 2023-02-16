package com.gabrielMJr.twaire.physic.units;

public class Time implements TimeIF
{
  // This object variable
  private static Time instance;
  
  // Those constants were used to tell to the program the unit that must use to calculate something
  // Also used to tell the unit from the variables as parameter
  public static final String SECOND = "1.0";
  public static final String MINUTE = "0.016666666666666666";
  public static final String HOUR = "0.0002777777777777778";
  public static final String DAY = "1.1574074074074073E-05";
  public static final String WEEK = "1.6534391534391535E-06";
  
  public static final String SECOND_SYMBOL = "s";
  public static final String MINUTE_SYMBOL = "min";
  public static final String HOUR_SYMBOL = "h";
  public static final String DAY_SYMBOL = "d";
  public static final String WEEK_IN_MONTH_SYMBOL = "W";
  public static final String WEEK_IN_YEAR_SYMBOL = "w";
  
  
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
  
  
  // Get class instance object
    protected static Time getInstance()
    {
      if(instance == null)
      {
        instance = new Time();
      }
      
      return instance;
    }
}