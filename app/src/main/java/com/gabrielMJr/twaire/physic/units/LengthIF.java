package com.gabrielMJr.twaire.physic.units;

public interface LengthIF {
  public abstract double toKilometer(double value, String unit);

  public abstract double toHectometer(double value, String unit);
  
  public abstract double toDecameter(double value, String unit);
  
  public abstract double toMeter(double value, String unit);
  
  public abstract double toDecimeter(double value, String unit);
  
  public abstract double toCentimeter(double value, String unit);
  
  public abstract double toMillimeter(double value, String unit);
}
