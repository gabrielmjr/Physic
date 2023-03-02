package com.gabrielMJr.twaire.physic.units;

import java.math.BigDecimal;

public class Time implements TimeIF
{
	private static Time instance;

	public static final int SECOND = 21;
	public static final int MINUTE = 22;
	public static final int HOUR = 23;
	public static final int DAY = 24;
	public static final int WEEK = 25;
	
	public static final int SQUARE_SECOND = 26;
	public static final int SQUARE_MINUTE = 27;
	public static final int SQUARE_HOUR = 28;
	public static final int SQUARE_DAY = 29;
	public static final int SQUARE_WEEK = 30;
	
	protected static final BigDecimal[] TIME_SCALES = new BigDecimal[]
	{
		BigDecimal.valueOf(1.0),
		BigDecimal.valueOf(0.016666666666666666),
		BigDecimal.valueOf(0.0002777777777777778),
		BigDecimal.valueOf(1.1574074074074073E-05),
		BigDecimal.valueOf(1.6534391534391535E-06)
	};
	
	protected static final BigDecimal[] SQUARE_TIME_SCALES = new BigDecimal[]
	{
		TIME_SCALES[SECOND].pow(2),
		TIME_SCALES[MINUTE].pow(2),
		TIME_SCALES[HOUR].pow(2),
		TIME_SCALES[DAY].pow(2),
	    TIME_SCALES[WEEK].pow(2)
	};
	
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
	public BigDecimal toSecond(double value, int unit)
	{
		if (unit >= 21 && unit <= 25)
			return BigDecimal.valueOf(value).multiply(TIME_SCALES[0]).divide(TIME_SCALES[unit - 21]);
		return null;
	}

	@Override
	public BigDecimal toMinute(double value, int unit)
	{
		if (unit >= 21 && unit <= 25)
			return BigDecimal.valueOf(value).multiply(TIME_SCALES[0]).divide(TIME_SCALES[unit - 21]);
		return null;
	}

	@Override
	public BigDecimal toHour(double value, int unit)
	{
		if (unit >= 21 && unit <= 25)
			return BigDecimal.valueOf(value).multiply(TIME_SCALES[0]).divide(TIME_SCALES[unit - 21]);
		return null;
	}

	@Override
	public BigDecimal toDay(double value, int unit)
	{
		if (unit >= 21 && unit <= 25)
			return BigDecimal.valueOf(value).multiply(TIME_SCALES[0]).divide(TIME_SCALES[unit - 21]);
		return null;
	}

	@Override
	public BigDecimal toWeek(double value, int unit)
	{
		if (unit >= 21 && unit <= 25)
			return BigDecimal.valueOf(value).multiply(TIME_SCALES[0]).divide(TIME_SCALES[unit - 21]);
		return null;
	}
	
	@Override
	public BigDecimal toSquareSecond(double value, int unit)
	{
		if (unit >= 26 && unit <= 30)
			return BigDecimal.valueOf(value).multiply(TIME_SCALES[0]).divide(TIME_SCALES[unit - 26]);
		return null;
	}

	@Override
	public BigDecimal toSquareMinute(double value, int unit)
	{
		if (unit >= 26 && unit <= 30)
			return BigDecimal.valueOf(value).multiply(TIME_SCALES[0]).divide(TIME_SCALES[unit - 26]);
		return null;
	}

	@Override
	public BigDecimal toSquareHour(double value, int unit)
	{
		if (unit >= 26 && unit <= 30)
			return BigDecimal.valueOf(value).multiply(TIME_SCALES[0]).divide(TIME_SCALES[unit - 26]);
		return null;
	}

	@Override
	public BigDecimal toSquareDay(double value, int unit)
	{
		if (unit >= 26 && unit <= 30)
			return BigDecimal.valueOf(value).multiply(TIME_SCALES[0]).divide(TIME_SCALES[unit - 26]);
		return null;
	}

	@Override
	public BigDecimal toSquareWeek(double value, int unit)
	{
		if (unit >= 26 && unit <= 30)
			return BigDecimal.valueOf(value).multiply(TIME_SCALES[0]).divide(TIME_SCALES[unit - 26]);
		return null;
	}

    protected static Time getInstance()
    {
      if(!(instance instanceof Time))
        instance = new Time();
      return instance;
    }
}
