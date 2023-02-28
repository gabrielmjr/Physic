package com.gabrielMJr.twaire.physic.units;

import java.math.BigDecimal;

public interface AreaIF
{
	public abstract BigDecimal toSquareKilometer(double value, String unit);
	public abstract BigDecimal toSquareHectometer(double value, String unit);
	public abstract BigDecimal toSquareDecameter(double value, String unit);
	public abstract BigDecimal toSquareMeter(double value, String unit);
	public abstract BigDecimal toSquareDecimeter(double value, String unit);
	public abstract BigDecimal toSquareCentimeter(double value, String unit);
	public abstract BigDecimal toSquareMillimeter(double value, String unit);
}

