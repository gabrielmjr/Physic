package com.gabrielMJr.twaire.physic.units;

public interface LengthIF
{
	public abstract Double toKilometer(double value, String unit);
	public abstract Double toHectometer(double value, String unit);
	public abstract Double toDecameter(double value, String unit);
	public abstract Double toMeter(double value, String unit);
	public abstract Double toDecimeter(double value, String unit);
	public abstract Double toCentimeter(double value, String unit);
	public abstract double toMillimeter(double value, String unit);
}
