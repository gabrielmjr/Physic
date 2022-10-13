package com.gabrielMJr.twaire.physic;

public interface DistanceIF {
  public abstract String toKilometer(double value, String value_unit);

  public abstract String toHectometer(double value, String value_unit);
  
  public abstract String toDecameter(double value, String value_unit);
  
  public abstract String toMeter(double value, String value_unit);
  
  public abstract String toDecimeter(double value, String value_unit);
  
  public abstract String toCentimeter(double value, String value_unit);
  
  public abstract String toMilimeter(double value, String value_unit);
}
