package com.gabrielMJr.twaire.physic.units;

import java.math.BigDecimal;

public interface TimeIF
{
	public BigDecimal toSecond(double value, String unit);
	public BigDecimal toMinute(double value, String unit);
	public BigDecimal toHour(double value, String unit);
	public BigDecimal toDay(double value, String unit);
	public BigDecimal toWeek(double value, String unit);
	
	public BigDecimal toSquareSecond(double value, String unit);
	public BigDecimal toSquareMinute(double value, String unit);
	public BigDecimal toSquareHour(double value, String unit);
	public BigDecimal toSquareDay(double value, String unit);
	public BigDecimal toSquareWeek(double value, String unit);
}
