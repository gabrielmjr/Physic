package com.gabrielMJr.twaire.physic.units;

import java.math.BigDecimal;

public interface LengthIF
{
	public abstract BigDecimal toKilometer(double value, String unit);
	public abstract BigDecimal toHectometer(double value, String unit);
	public abstract BigDecimal toDecameter(double value, String unit);
	public abstract BigDecimal toMeter(double value, String unit);
	public abstract BigDecimal toDecimeter(double value, String unit);
	public abstract BigDecimal toCentimeter(double value, String unit);
	public abstract BigDecimal toMillimeter(double value, String unit);
}
