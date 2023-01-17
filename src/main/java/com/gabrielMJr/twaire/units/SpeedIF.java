package com.gabrielMJr.twaire.physic.units;

public interface SpeedIF {
  // For distance's unit per second
  public abstract Double toKilometerPerSecond(double value, String unit);
  public abstract Double toHectometerPerSecond(double value, String unit);
  public abstract Double toDecameterPerSecond(double value, String unit);
  public abstract Double toMeterPerSecond(double value, String unit);
  public abstract Double toDecimeterPerSecond(double value, String unit);
  public abstract Double toCentimeterPerSecond(double value, String unit);
  public abstract Double toMillimeterPerSecond(double value, String unit);
  
  
  // For distance's unit per minute
  public abstract Double toKilometerPerMinute(double value, String unit);
  public abstract Double toHectometerPerMinute(double value, String unit);
  public abstract Double toDecameterPerMinute(double value, String unit);
  public abstract Double toMeterPerMinute(double value, String unit);
  public abstract Double toDecimeterPerMinute(double value, String unit);
  public abstract Double toCentimeterPerMinute(double value, String unit);
  public abstract Double toMillimeterPerMinute(double value, String unit);
  
  
  // For distance's unit per hour
  public abstract Double toKilometerPerHour(double value, String unit);
  public abstract Double toHectometerPerHour(double value, String unit);
  public abstract Double toDecameterPerHour(double value, String unit);
  public abstract Double toMeterPerHour(double value, String unit);
  public abstract Double toDecimeterPerHour(double value, String unit);
  public abstract Double toCentimeterPerHour(double value, String unit);
  public abstract Double toMillimeterPerHour(double value, String unit);
}
