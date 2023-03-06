package com.gabrielMJr.twaire.physic.units;

import java.math.BigDecimal;

public interface TimeIF
{
	public BigDecimal toSecond(double value, int unit);
	public BigDecimal toMinute(double value, int unit);
	public BigDecimal toHour(double value, int unit);
	public BigDecimal toDay(double value, int unit);
	public BigDecimal toWeek(double value, int unit);
	
	public BigDecimal toSquareSecond(double value, int unit);
	public BigDecimal toSquareMinute(double value, int unit);
	public BigDecimal toSquareHour(double value, int unit);
	public BigDecimal toSquareDay(double value, int unit);
	public BigDecimal toSquareWeek(double value, int unit);
}
