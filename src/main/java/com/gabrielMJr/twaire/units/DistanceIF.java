package com.gabrielMJr.twaire.physic.units;

public interface DistanceIF {
  public abstract double toKilometer(double value, String value_unit);

  public abstract double toHectometer(double value, String value_unit);
  
  public abstract double toDecameter(double value, String value_unit);
  
  public abstract double toMeter(double value, String value_unit);
  
  public abstract double toDecimeter(double value, String value_unit);
  
  public abstract double toCentimeter(double value, String value_unit);
  
  public abstract double toMillimeter(double value, String value_unit);
}
