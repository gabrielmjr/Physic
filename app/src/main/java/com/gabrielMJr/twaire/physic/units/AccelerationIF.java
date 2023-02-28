package com.gabrielMJr.twaire.physic.units;

import java.math.BigDecimal;

public interface AccelerationIF 
{
    public abstract BigDecimal toKilometerSquarePerSecond(double value, String unit);
	public abstract BigDecimal toHectometerSquarePerSecond(double value, String unit);
	public abstract BigDecimal toDecameterSquarePerSecond(double value, String unit);
	public abstract BigDecimal toMeterSquarePerSecond(double value, String unit);
	public abstract BigDecimal toDecimeterSquarePerSecond(double value, String unit);
	public abstract BigDecimal toCentimeterSquarePerSecond(double value, String unit);
	public abstract BigDecimal toMillimeterSquarePerSecond(double value, String unit);
}
