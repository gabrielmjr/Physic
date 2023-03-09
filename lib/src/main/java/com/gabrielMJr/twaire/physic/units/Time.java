package com.gabrielMJr.twaire.physic.units;

import java.math.BigDecimal;

public class Time implements TimeIF {
	private static Time instance;

	public static final int WEEK = 21;
	public static final int DAY = 22;
	public static final int HOUR = 23;
	public static final int MINUTE = 24;
	public static final int SECOND = 25;

	public static final int SQUARE_WEEK = 26;
	public static final int SQUARE_DAY = 27;
	public static final int SQUARE_HOUR = 28;
	public static final int SQUARE_MINUTE = 29;
	public static final int SQUARE_SECOND = 30;

	protected static final BigDecimal[] TIME_SCALES = new BigDecimal[]
	{
		BigDecimal.valueOf(604800.0),
		BigDecimal.valueOf(86400.0),
		BigDecimal.valueOf(3600.0),
		BigDecimal.valueOf(60.0),
		BigDecimal.valueOf(1.0)
	};

	protected static final BigDecimal[] SQUARE_TIME_SCALES = new BigDecimal[]
	{
		TIME_SCALES[WEEK - 21].pow(2),
		TIME_SCALES[DAY - 21].pow(2),
		TIME_SCALES[HOUR - 21].pow(2),
		TIME_SCALES[MINUTE - 21].pow(2),
	    TIME_SCALES[SECOND - 21].pow(2)
	};

	public static final String WEEK_IN_YEAR_SYMBOL = "w";
	public static final String WEEK_IN_MONTH_SYMBOL = "w";
	public static final String DAY_SYMBOL = "d";
	public static final String HOUR_SYMBOL = "h";
	public static final String MINUTE_SYMBOL = "min";
	public static final String SECOND_SYMBOL = "s";

	public static final String SQUARE_DAY_SYMBOL = DAY_SYMBOL + "²";
	public static final String SQUARE_HOUR_SYMBOL = HOUR_SYMBOL + "²";
	public static final String SQUARE_MINUTE_SYMBOL = MINUTE_SYMBOL + "²";
	public static final String SQUARE_SECOND_SYMBOL = SECOND_SYMBOL + "²";

	@Override
	public BigDecimal toSecond (double value, int unit) {
		if (unit >= 21 && unit <= 25)
			return BigDecimal.valueOf(value * TIME_SCALES[unit - 21].doubleValue() / TIME_SCALES[SECOND - 21].doubleValue());
		return null;
	}

	@Override
	public BigDecimal toMinute (double value, int unit) {
		if (unit >= 21 && unit <= 25)
			return BigDecimal.valueOf(value * TIME_SCALES[unit - 21].doubleValue() / TIME_SCALES[MINUTE - 21].doubleValue());
		return null;
	}

	@Override
	public BigDecimal toHour (double value, int unit) {
		if (unit >= 21 && unit <= 25)
			return BigDecimal.valueOf(value * TIME_SCALES[unit - 21].doubleValue() / TIME_SCALES[HOUR - 21].doubleValue());
		return null;
	}

	@Override
	public BigDecimal toDay (double value, int unit) {
		if (unit >= 21 && unit <= 25)
			return BigDecimal.valueOf(value * TIME_SCALES[unit - 21].doubleValue() / TIME_SCALES[DAY - 21].doubleValue());
		return null;
	}

	@Override
	public BigDecimal toWeek (double value, int unit) {
		if (unit >= 21 && unit <= 25)
			return BigDecimal.valueOf(value * TIME_SCALES[unit - 21].doubleValue() / TIME_SCALES[WEEK - 21].doubleValue());
		return null;
	}

	@Override
	public BigDecimal toSquareSecond (double value, int unit) {
		if (unit >= 26 && unit <= 30)
			return BigDecimal.valueOf(value * SQUARE_TIME_SCALES[unit - 26].doubleValue() / SQUARE_TIME_SCALES[SQUARE_SECOND - 26].doubleValue());
		return null;
	}

	@Override
	public BigDecimal toSquareMinute (double value, int unit) {
		if (unit >= 26 && unit <= 30)
			return BigDecimal.valueOf(value * SQUARE_TIME_SCALES[unit - 26].doubleValue() / SQUARE_TIME_SCALES[SQUARE_MINUTE - 26].doubleValue());
		return null;
	}

	@Override
	public BigDecimal toSquareHour (double value, int unit) {
		if (unit >= 26 && unit <= 30)
			return BigDecimal.valueOf(value * SQUARE_TIME_SCALES[unit - 26].doubleValue() / SQUARE_TIME_SCALES[SQUARE_HOUR - 26].doubleValue());
		return null;
	}

	@Override
	public BigDecimal toSquareDay (double value, int unit) {
		if (unit >= 26 && unit <= 30)
			return BigDecimal.valueOf(value * SQUARE_TIME_SCALES[unit - 26].doubleValue() / SQUARE_TIME_SCALES[SQUARE_DAY - 26].doubleValue());
		return null;
	}

	@Override
	public BigDecimal toSquareWeek (double value, int unit) {
		if (unit >= 26 && unit <= 30)
			return BigDecimal.valueOf(value * SQUARE_TIME_SCALES[unit - 26].doubleValue() / SQUARE_TIME_SCALES[SQUARE_SECOND - 26].doubleValue());
		return null;
	}

    protected static Time getInstance () {
		if (!(instance instanceof Time))
			instance = new Time();
		return instance;
    }
}
