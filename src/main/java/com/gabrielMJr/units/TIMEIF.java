package com.gabrielMJr.physic.units;

public interface TimeIF {
  public Double toSecond(double value, String unit);
  
  public Double toMinute(double value, String unit);
  
  public Double toHour(double value, String unit);
  
  public Double toDay(double value, String unit);
  
  public Double toWeek(double value, String unit);
}
