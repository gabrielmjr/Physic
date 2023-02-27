package com.gabrielMJr.twaire.physic.units;

public interface AccelerationIF
{
    public abstract Double toKilometerSquarePerSecond(double value, String unit);
	public abstract Double toHectometerSquarePerSecond(double value, String unit);
	public abstract Double toDecameterSquarePerSecond(double value, String unit);
	public abstract Double toMeterSquarePerSecond(double value, String unit);
	public abstract Double toDecimeterSquarePerSecond(double value, String unit);
	public abstract Double toCentimeterSquarePerSecond(double value, String unit);
	public abstract Double toMillimeterSquarePerSecond(double value, String unit);
}
