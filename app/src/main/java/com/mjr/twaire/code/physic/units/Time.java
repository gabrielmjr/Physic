package com.mjr.twaire.code.physic.units;

import java.math.BigDecimal;
import java.math.BigInteger;

import static com.mjr.twaire.code.physic.Physic.ROUND_SCALE;
import static java.math.RoundingMode.HALF_UP;

public class Time extends Unit implements ITime {
    @Deprecated
    private static Time instance;
	private Digital digital;
    
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
		new BigDecimal(1.0),
	    new BigDecimal(7.0),
	    new BigDecimal(168.0),
		new BigDecimal(10080.0),
		new BigDecimal(604800.0)
	};

	protected static final BigDecimal[] SQUARE_TIME_SCALES = new BigDecimal[]
	{
		TIME_SCALES[SQUARE_WEEK - 26].pow(2),
		TIME_SCALES[SQUARE_DAY - 26].pow(2),
		TIME_SCALES[SQUARE_HOUR - 26].pow(2),
		TIME_SCALES[SQUARE_MINUTE - 26].pow(2),
	    TIME_SCALES[SQUARE_SECOND - 26].pow(2)
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

    protected final String TIME_SYMBOLS[] = new String[] {
        WEEK_IN_MONTH_SYMBOL,
        DAY_SYMBOL,
        HOUR_SYMBOL,
        MINUTE_SYMBOL,
        SECOND_SYMBOL,
        SQUARE_DAY_SYMBOL,
        SQUARE_HOUR_SYMBOL,
        SQUARE_MINUTE_SYMBOL,
        SQUARE_SECOND_SYMBOL
    };

    public Time() {
        super();
        unit = SECOND - 21;
    }

    public Time(double value) {
        super(value);
        unit = SECOND - 21;
    }

    public Time(String value) {
        super(value);
        unit = SECOND - 21;
    }

    public Time(long value) {
        super(value);
        unit = SECOND - 21;
    }

    public Time(BigDecimal value) {
        super(value);
        unit = SECOND - 21;
    }

    public Time(double value, int unit) throws IllegalArgumentException {
        super(value);
        if (unit >= 21 && unit <= 30) {
            this.unit = unit - 21;
            return;
        }
        throw new IllegalArgumentException("The unit " + unit + " is not valid as time unit.");
    }

    public Time(String value, int unit) throws IllegalArgumentException {
        super(value);
        if (unit >= 21 && unit <= 30) {
            this.unit = unit - 21;
            return;
        }
        throw new IllegalArgumentException("The unit " + unit + " is not valid as time unit.");
    }

    public Time(long value, int unit) throws IllegalArgumentException {
        super(value);
        if (unit >= 21 && unit <= 30) {
            this.unit = unit - 21;
            return;
        }
        throw new IllegalArgumentException("The unit " + unit + " is not valid as time unit.");
    }

    public Time(BigDecimal value, int unit) throws IllegalArgumentException {
        super(value);
        if (unit >= 21 && unit <= 30) {
            this.unit = unit - 21;
            return;
        }
        throw new IllegalArgumentException("The unit " + unit + " is not valid as time unit");
    }

	public static Time toSecond(double value, int unit) throws IllegalArgumentException {
		if (unit >= 21 && unit <= 25)
			return new Time(BigDecimal.valueOf(value).multiply(TIME_SCALES[SECOND - 21]).divide(TIME_SCALES[unit - 21], ROUND_SCALE, HALF_UP), SECOND);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as time unit.");
	}

	public static Time toMinute(double value, int unit) throws IllegalArgumentException {
		if (unit >= 21 && unit <= 25)
			return new Time(BigDecimal.valueOf(value).multiply(TIME_SCALES[MINUTE - 21]).divide(TIME_SCALES[unit - 21], ROUND_SCALE, HALF_UP), MINUTE);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as time unit.");
	}

	public static Time toHour(double value, int unit) throws IllegalArgumentException {
		if (unit >= 21 && unit <= 25)
			return new Time(BigDecimal.valueOf(value).multiply(TIME_SCALES[HOUR - 21]).divide(TIME_SCALES[unit - 21], ROUND_SCALE, HALF_UP), HOUR);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as time unit.");
	}

	public static Time toDay(double value, int unit) throws IllegalArgumentException {
		if (unit >= 21 && unit <= 25)
			return new Time(BigDecimal.valueOf(value).multiply(TIME_SCALES[DAY - 21]).divide(TIME_SCALES[unit - 21], ROUND_SCALE, HALF_UP), DAY);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as time unit.");
	}

	public static Time toWeek(double value, int unit) throws IllegalArgumentException {
		if (unit >= 21 && unit <= 25)
			return new Time(BigDecimal.valueOf(value).multiply(TIME_SCALES[WEEK - 21]).divide(TIME_SCALES[unit - 21], ROUND_SCALE, HALF_UP), WEEK);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as time unit.");
	}

	public static Time toSquareSecond(double value, int unit) throws IllegalArgumentException {
		if (unit >= 26 && unit <= 30)
			return new Time(BigDecimal.valueOf(value).multiply(SQUARE_TIME_SCALES[SQUARE_SECOND - 26]).divide(SQUARE_TIME_SCALES[unit - 26], ROUND_SCALE, HALF_UP), SQUARE_SECOND);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as square time unit.");
	}

	public static Time toSquareMinute(double value, int unit) throws IllegalArgumentException {
		if (unit >= 26 && unit <= 30)
			return new Time(BigDecimal.valueOf(value).multiply(SQUARE_TIME_SCALES[SQUARE_MINUTE - 26]).divide(SQUARE_TIME_SCALES[unit - 26], ROUND_SCALE, HALF_UP), SQUARE_MINUTE);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as square time unit.");
	}

	public static Time toSquareHour(double value, int unit) throws IllegalArgumentException {
		if (unit >= 26 && unit <= 30)
			return new Time(BigDecimal.valueOf(value).multiply(SQUARE_TIME_SCALES[SQUARE_HOUR - 26]).divide(SQUARE_TIME_SCALES[unit - 26], ROUND_SCALE, HALF_UP), SQUARE_HOUR);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as square time unit.");
	}

	public static Time toSquareDay(double value, int unit) throws IllegalArgumentException {
		if (unit >= 26 && unit <= 30)
			return new Time(BigDecimal.valueOf(value).multiply(SQUARE_TIME_SCALES[SQUARE_DAY - 26]).divide(SQUARE_TIME_SCALES[unit - 26], ROUND_SCALE, HALF_UP), SQUARE_DAY);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as square time unit.");
	}

	public static Time toSquareWeek(double value, int unit) throws IllegalArgumentException {
		if (unit >= 26 && unit <= 30)
			return new Time(BigDecimal.valueOf(value).multiply(SQUARE_TIME_SCALES[SQUARE_WEEK - 26]).divide(SQUARE_TIME_SCALES[unit - 26], ROUND_SCALE, HALF_UP), SQUARE_WEEK);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as square time unit.");
	}

    @Override
    public Time toSecond() throws IllegalArgumentException {
        if (unit >= 26 && unit <= 30) 
            throw new IllegalArgumentException("Cannot convert from square time to time.");
        value = value.multiply(TIME_SCALES[SECOND - 21]).divide(TIME_SCALES[unit - 21], ROUND_SCALE, HALF_UP);
        unit = SECOND - 21;
        return this;
    }

    @Override
    public Time toMinute() throws IllegalArgumentException {
        if (unit >= 26 && unit <= 30)
            throw new IllegalArgumentException("Cannot convert from square time to time.");
        value = value.multiply(TIME_SCALES[MINUTE - 21]).divide(TIME_SCALES[unit - 21], ROUND_SCALE, HALF_UP);
        unit = MINUTE - 21;
        return this;
    }

    @Override
    public Time toHour() throws IllegalArgumentException {
        if (unit >= 26 && unit <= 30)
            throw new IllegalArgumentException("Cannot convert from square time to time.");
        value = value.multiply(TIME_SCALES[HOUR - 21]).divide(TIME_SCALES[unit - 21], ROUND_SCALE, HALF_UP);
        unit = HOUR - 21;
        return this;
    }

    @Override
    public Time toDay() throws IllegalArgumentException {
        if (unit >= 26 && unit <= 30)
            throw new IllegalArgumentException("Cannot convert from square time to time.");
        value = value.multiply(TIME_SCALES[DAY - 21]).divide(TIME_SCALES[unit - 21], ROUND_SCALE, HALF_UP);
        unit = DAY - 21;
        return this;
    }

    @Override
    public Time toWeek() throws IllegalArgumentException {
        if (unit >= 26 && unit <= 30)
            throw new IllegalArgumentException("Cannot convert from square time to time.");
        value = value.multiply(TIME_SCALES[WEEK - 21]).divide(TIME_SCALES[unit - 21], ROUND_SCALE, HALF_UP);
        unit = WEEK - 21;
        return this;
    }

    @Override
    public Time toSquareSecond() throws IllegalArgumentException {
        if (unit >= 21 && unit <= 25)
            throw new IllegalArgumentException("Cannot convert from time to square time.");
        value = value.multiply(TIME_SCALES[SQUARE_SECOND - 26]).divide(TIME_SCALES[unit - 21], ROUND_SCALE, HALF_UP);
        unit = SQUARE_SECOND - 26;
        return this;
    }

    @Override
    public Time toSquareMinute() throws IllegalArgumentException {
        if (unit >= 21 && unit <= 25)
            throw new IllegalArgumentException("Cannot convert from time to square time.");
        value = value.multiply(TIME_SCALES[SQUARE_MINUTE - 26]).divide(TIME_SCALES[unit - 21], ROUND_SCALE, HALF_UP);
        unit = SQUARE_MINUTE - 26;
        return this;
    }

    @Override
    public Time toSquareHour() throws IllegalArgumentException {
        if (unit >= 21 && unit <= 25)
            throw new IllegalArgumentException("Cannot convert from time to square time.");
        value = value.multiply(TIME_SCALES[SQUARE_HOUR - 26]).divide(TIME_SCALES[unit - 21], ROUND_SCALE, HALF_UP);
        unit = SQUARE_HOUR - 26;
        return this;
    }

    @Override
    public Time toSquareDay() throws IllegalArgumentException {
        if (unit >= 21 && unit <= 25)
            throw new IllegalArgumentException("Cannot convert from time to square time.");
        value = value.multiply(TIME_SCALES[SQUARE_DAY - 26]).divide(TIME_SCALES[unit - 21], ROUND_SCALE, HALF_UP);
        unit = SQUARE_DAY - 26;
        return this;
    }

    @Override
    public Time toSquareWeek() throws IllegalArgumentException {
        if (unit >= 21 && unit <= 25)
            throw new IllegalArgumentException("Cannot convert from time to square time.");
        value = value.multiply(TIME_SCALES[SQUARE_WEEK - 26]).divide(TIME_SCALES[unit - 21], ROUND_SCALE, HALF_UP);
        unit = SQUARE_WEEK - 26;
        return this;
	}

    @Override
    public String toString() {
        return value + ((unit <= 4) ? TIME_SYMBOLS[unit] : TIME_SYMBOLS[unit - 4]);
    }

    @Override
    public boolean equals(Object object) {
        try {
            Time time = (Time) object;
            return time.toString().equals(toString());
        } catch (ClassCastException e) {
            return false;
        }
    }

    @Override
    public Unit setUnit(int unit) throws IllegalArgumentException {
        if (unit >= 21 && unit <= 30) {
            super.setUnit(unit);
            return this;
        }
        throw new IllegalArgumentException("The unit " + unit + " is not valid as " + new Time().getClass().getName() + " unit.");
    }
    
	public Digital toDigital() throws IllegalArgumentException {
		try {
			return new Digital();
		} catch (IllegalArgumentException e) {
			throw e;
		}
	}

    @Deprecated
    protected static Time getInstance() {
		if (!(instance instanceof Time))
			instance = new Time();
		return instance;
    }

	public class Digital {
		public static final BigInteger SIXTY = BigInteger.valueOf(60);

		private BigInteger second;
		private BigInteger minute;
		private BigInteger hour;
		private String secondString;
		private String minuteString;
		private String hourString;

		private Digital() throws IllegalArgumentException {
			if (!(unit >= 25 && unit <= 25)) {
				throw new IllegalArgumentException("Cannot use digital time in square time.");
			}
			second = BigInteger.ZERO;
			minute = BigInteger.ZERO;
			hour = BigInteger.ZERO;
		}

		public String getToFormat(String format) {
			normalize();
		    convert();
			return format.replaceFirst("hh", hourString).replaceFirst("mm", minuteString).replaceFirst("ss", secondString);
		}

		private void normalize() {
			try {
				second = toSecond().getValue().toBigIntegerExact();
			} catch (IllegalArgumentException e) {}
		}

		private void convert() {
			if (second.max(SIXTY) == SIXTY) {
				minute.add(BigInteger.ONE);
				second.subtract(SIXTY);
				convert();
			}
			if (minute.max(SIXTY) == SIXTY) {
				hour.add(BigInteger.ONE);
				minute.subtract(SIXTY);
				convert();
			}
			if (second.max(BigInteger.TEN) != BigInteger.TEN) {
				secondString = "0" + second;
			} else {
				secondString = second.toString();
			}
			if (minute.max(BigInteger.TEN) != BigInteger.TEN) {
				minuteString = "0" + minute;
			} else {
				minuteString = minute.toString();
			}
			if (hour.max(BigInteger.TEN) != BigInteger.TEN) {
				hourString = "0" + hour.toString();
			} else {
				hourString = hour.toString();
			}
		}
	}
}
