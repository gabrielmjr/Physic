package com.gabrielMJr.twaire.physic.units;

import java.math.BigDecimal;

public class Time implements TimeIF
{
	private static Time instance;

	public static final String SECOND = "1.0";
	public static final String MINUTE = "0.016666666666666666";
	public static final String HOUR = "0.0002777777777777778";
	public static final String DAY = "1.1574074074074073E-05";
	public static final String WEEK = "1.6534391534391535E-06";
	
	public static final String SQUARE_SECOND = String.valueOf(Math.pow(Double.valueOf(SECOND), 2));
	public static final String SQUARE_MINUTE = String.valueOf(Math.pow(Double.valueOf(MINUTE), 2));
	public static final String SQUARE_HOUR = String.valueOf(Math.pow(Double.valueOf(HOUR), 2));
	public static final String SQUARE_DAY = String.valueOf(Math.pow(Double.valueOf(DAY), 2));
	public static final String SQUARE_WEEK = String.valueOf(Math.pow(Double.valueOf(WEEK), 2));

	public static final String SECOND_SYMBOL = "s";
	public static final String MINUTE_SYMBOL = "min";
	public static final String HOUR_SYMBOL = "h";
	public static final String DAY_SYMBOL = "d";
	public static final String WEEK_IN_MONTH_SYMBOL = "W";
	public static final String WEEK_IN_YEAR_SYMBOL = "w";
	
	public static final String SQUARE_SECOND_SYMBOL = SECOND_SYMBOL + "²";
	public static final String SQUARE_MINUTE_SYMBOL = MINUTE_SYMBOL + "2";
	public static final String SQUARE_HOUR_SYMBOL = HOUR_SYMBOL + "²";
	public static final String SQUARE_DAY_SYMBOL = DAY_SYMBOL + "²";
	
	@Override
	public BigDecimal toSecond(double value, String unit)
	{
		BigDecimal bigValue = BigDecimal.valueOf(value);
		BigDecimal bigUnit = new BigDecimal(unit);
		return (bigValue.multiply(new BigDecimal(SECOND))).divide(bigUnit);
	}

	@Override
	public BigDecimal toMinute(double value, String unit)
	{
		BigDecimal bigValue = BigDecimal.valueOf(value);
		BigDecimal bigUnit = new BigDecimal(unit);
		return (bigValue.multiply(new BigDecimal(MINUTE))).divide(bigUnit);
	}

	@Override
	public BigDecimal toHour(double value, String unit)
	{
		BigDecimal bigValue = BigDecimal.valueOf(value);
		BigDecimal bigUnit = new BigDecimal(unit);
		return (bigValue.multiply(new BigDecimal(HOUR))).divide(bigUnit);
	}

	@Override
	public BigDecimal toDay(double value, String unit)
	{
		BigDecimal bigValue = BigDecimal.valueOf(value);
		BigDecimal bigUnit = new BigDecimal(unit);
		return (bigValue.multiply(new BigDecimal(DAY))).divide(bigUnit);
	}

	@Override
	public BigDecimal toWeek(double value, String unit)
	{
		BigDecimal bigValue = BigDecimal.valueOf(value);
		BigDecimal bigUnit = new BigDecimal(unit);
		return (bigValue.multiply(new BigDecimal(WEEK))).divide(bigUnit);
	}
	
	@Override
	public BigDecimal toSquareSecond(double value, String unit)
	{
		BigDecimal bigValue = BigDecimal.valueOf(value);
		BigDecimal bigUnit = new BigDecimal(unit);
		return (bigValue.multiply(new BigDecimal(SQUARE_SECOND))).divide(bigUnit);
	}

	@Override
	public BigDecimal toSquareMinute(double value, String unit)
	{
		BigDecimal bigValue = BigDecimal.valueOf(value);
		BigDecimal bigUnit = new BigDecimal(unit);
		return (bigValue.multiply(new BigDecimal(SQUARE_MINUTE))).divide(bigUnit);
	}

	@Override
	public BigDecimal toSquareHour(double value, String unit)
	{
		BigDecimal bigValue = BigDecimal.valueOf(value);
		BigDecimal bigUnit = new BigDecimal(unit);
		return (bigValue.multiply(new BigDecimal(SQUARE_HOUR))).divide(bigUnit);
	}

	@Override
	public BigDecimal toSquareDay(double value, String unit)
	{
		BigDecimal bigValue = BigDecimal.valueOf(value);
		BigDecimal bigUnit = new BigDecimal(unit);
		return (bigValue.multiply(new BigDecimal(SQUARE_DAY))).divide(bigUnit);
	}

	@Override
	public BigDecimal toSquareWeek(double value, String unit)
	{
		BigDecimal bigValue = BigDecimal.valueOf(value);
		BigDecimal bigUnit = new BigDecimal(unit);
		return (bigValue.multiply(new BigDecimal(SQUARE_WEEK))).divide(bigUnit);
	}

    protected static Time getInstance()
    {
      if(!(instance instanceof Time))
        instance = new Time();
      return instance;
    }
}
