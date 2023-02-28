package com.gabrielMJr.twaire.physic.units;

import java.math.BigDecimal;

public interface SpeedIF 
{
	public abstract BigDecimal toKilometerPerSecond(double value, String unit);
	public abstract BigDecimal toHectometerPerSecond(double value, String unit);
	public abstract BigDecimal toDecameterPerSecond(double value, String unit);
	public abstract BigDecimal toMeterPerSecond(double value, String unit);
	public abstract BigDecimal toDecimeterPerSecond(double value, String unit);
	public abstract BigDecimal toCentimeterPerSecond(double value, String unit);
	public abstract BigDecimal toMillimeterPerSecond(double value, String unit);

	public abstract BigDecimal toKilometerPerMinute(double value, String unit);
	public abstract BigDecimal toHectometerPerMinute(double value, String unit);
	public abstract BigDecimal toDecameterPerMinute(double value, String unit);
	public abstract BigDecimal toMeterPerMinute(double value, String unit);
	public abstract BigDecimal toDecimeterPerMinute(double value, String unit);
	public abstract BigDecimal toCentimeterPerMinute(double value, String unit);
	public abstract BigDecimal toMillimeterPerMinute(double value, String unit);
	
	public abstract BigDecimal toKilometerPerHour(double value, String unit);
	public abstract BigDecimal toHectometerPerHour(double value, String unit);
	public abstract BigDecimal toDecameterPerHour(double value, String unit);
	public abstract BigDecimal toMeterPerHour(double value, String unit);
	public abstract BigDecimal toDecimeterPerHour(double value, String unit);
	public abstract BigDecimal toCentimeterPerHour(double value, String unit);
	public abstract BigDecimal toMillimeterPerHour(double value, String unit);
}
