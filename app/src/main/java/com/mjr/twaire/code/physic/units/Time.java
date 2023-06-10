package com.mjr.twaire.code.physic.units;

import com.mjr.twaire.code.physic.PhysicException;
import java.math.BigDecimal;
import java.math.BigInteger;

import static com.mjr.twaire.code.physic.Physic.ROUND_SCALE;
import static java.math.RoundingMode.HALF_UP;

public class Time extends BigDecimal implements ITime {
    private static Time instance;
    private BigDecimal value;
	private Digital digital;
    private int unit;

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
    
    public Time() {
        super(0); 
        value = divide(ONE);
        unit = SECOND;
    }

    public Time(double value) {
        super(value);
        this.value = divide(ONE);
        unit = SECOND;
    }

    public Time(String value) {
        super(value);
        this.value = divide(ONE);
        unit = SECOND;
    }

    public Time(long value) {
        super(value);
        this.value = divide(ONE);
        unit = SECOND;
    }

    public Time(BigDecimal value) {
        super(value.toString());
        this.value = value;
        unit = SECOND;
    }

    public Time(double value, int unit) throws InvalidUnitException {
        super(value);
        this.value = divide(ONE);
        if (unit >= 21 && unit <= 30) {
            this.unit = unit;
            return;
        }
        throw new InvalidUnitException("The unit " + unit + " is not valid as time unit.");
    }

    public Time(String value, int unit) throws InvalidUnitException {
        super(value);
        this.value = divide(ONE);
        if (unit >= 21 && unit <= 30) {
            this.unit = unit;
            return;
        }
        throw new InvalidUnitException("The unit " + unit + " is not valid as time unit.");
    }

    public Time(long value, int unit) throws InvalidUnitException {
        super(value);
        this.value = divide(ONE);
        if (unit >= 21 && unit <= 30) {
            this.unit = unit;
            return;
        }
        throw new InvalidUnitException("The unit " + unit + " is not valid as time unit.");
    }

    public Time(BigDecimal value, int unit) throws InvalidUnitException {
        super(value.toString());
		this.value = divide(ONE);
        if (unit >= 21 && unit <= 30) {
            this.unit = unit;
            return;
        }
        throw new InvalidUnitException("The unit " + unit + " is not valid as time unit");
    }
    
	public static Time toSecond (double value, int unit) throws InvalidUnitException {
		if (unit >= 21 && unit <= 25)
			return new Time(BigDecimal.valueOf(value).multiply(TIME_SCALES[SECOND - 21]).divide(TIME_SCALES[unit - 21], ROUND_SCALE, HALF_UP), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as time unit.");
	}

	public static Time toMinute (double value, int unit) throws InvalidUnitException {
		if (unit >= 21 && unit <= 25)
			return new Time(BigDecimal.valueOf(value).multiply(TIME_SCALES[MINUTE - 21]).divide(TIME_SCALES[unit - 21], ROUND_SCALE, HALF_UP), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as time unit.");
	}

	public static Time toHour (double value, int unit) throws InvalidUnitException {
		if (unit >= 21 && unit <= 25)
			return new Time(BigDecimal.valueOf(value).multiply(TIME_SCALES[HOUR - 21]).divide(TIME_SCALES[unit - 21], ROUND_SCALE, HALF_UP), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as time unit.");
	}

	public static Time toDay (double value, int unit) throws InvalidUnitException {
		if (unit >= 21 && unit <= 25)
			return new Time(BigDecimal.valueOf(value).multiply(TIME_SCALES[DAY - 21]).divide(TIME_SCALES[unit - 21], ROUND_SCALE, HALF_UP), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as time unit.");
	}

	public static Time toWeek (double value, int unit) throws InvalidUnitException {
		if (unit >= 21 && unit <= 25)
			return new Time(BigDecimal.valueOf(value).multiply(TIME_SCALES[WEEK - 21]).divide(TIME_SCALES[unit - 21], ROUND_SCALE, HALF_UP), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as time unit.");
	}

	public static Time toSquareSecond (double value, int unit) throws InvalidUnitException {
		if (unit >= 26 && unit <= 30)
			return new Time(BigDecimal.valueOf(value).multiply(SQUARE_TIME_SCALES[SQUARE_SECOND - 26]).divide(SQUARE_TIME_SCALES[unit - 26], ROUND_SCALE, HALF_UP), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as square time unit.");
	}

	public static Time toSquareMinute (double value, int unit) throws InvalidUnitException {
		if (unit >= 26 && unit <= 30)
			return new Time(BigDecimal.valueOf(value).multiply(SQUARE_TIME_SCALES[SQUARE_MINUTE - 26]).divide(SQUARE_TIME_SCALES[unit - 26], ROUND_SCALE, HALF_UP), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as square time unit.");
	}

	public static Time toSquareHour (double value, int unit) throws InvalidUnitException {
		if (unit >= 26 && unit <= 30)
			return new Time(BigDecimal.valueOf(value).multiply(SQUARE_TIME_SCALES[SQUARE_HOUR - 26]).divide(SQUARE_TIME_SCALES[unit - 26], ROUND_SCALE, HALF_UP), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as square time unit.");
	}

	public static Time toSquareDay (double value, int unit) throws InvalidUnitException {
		if (unit >= 26 && unit <= 30)
			return new Time(BigDecimal.valueOf(value).multiply(SQUARE_TIME_SCALES[SQUARE_DAY - 26]).divide(SQUARE_TIME_SCALES[unit - 26], ROUND_SCALE, HALF_UP), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as square time unit.");
	}

	public static Time toSquareWeek (double value, int unit) throws InvalidUnitException {
		if (unit >= 26 && unit <= 30)
			return new Time(BigDecimal.valueOf(value).multiply(SQUARE_TIME_SCALES[SQUARE_WEEK - 26]).divide(SQUARE_TIME_SCALES[unit - 26], ROUND_SCALE, HALF_UP), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as square time unit.");
	}
    
    @Override
    public Time toSecond() throws InvalidUnitException {
		if (unit >= 21 && unit <= 25) {
			value = value.multiply(TIME_SCALES[SECOND - 21]).divide(TIME_SCALES[unit - 21], ROUND_SCALE, HALF_UP);
			unit = SECOND;
			return this;
		}
		if (unit >= 26 && unit <= 30) {
			throw new InvalidUnitException("Cannot convert from square time to time.");
		} else {
		    throw new InvalidUnitException("The unit " + unit + " is not valid as time unit.");
		}
    }

    @Override
    public Time toMinute() throws InvalidUnitException {
        if (unit >= 21 && unit <= 25) {
			value = value.multiply(TIME_SCALES[MINUTE - 21]).divide(TIME_SCALES[unit - 21], ROUND_SCALE, HALF_UP);
			unit = MINUTE;
			return this;
		}
		if (unit >= 26 && unit <= 30) {
			throw new InvalidUnitException("Cannot convert from square time to time.");
		} else {
		    throw new InvalidUnitException("The unit " + unit + " is not valid as time unit.");
		}
    }

    @Override
    public Time toHour() throws InvalidUnitException {
        if (unit >= 21 && unit <= 25) {
			value = value.multiply(TIME_SCALES[HOUR - 21]).divide(TIME_SCALES[unit - 21], ROUND_SCALE, HALF_UP);
			unit = HOUR;
			return this;
		}
		if (unit >= 26 && unit <= 30) {
			throw new InvalidUnitException("Cannot convert from square time to time.");
		} else {
		    throw new InvalidUnitException("The unit " + unit + " is not valid as time unit.");
		}
    }

    @Override
    public Time toDay() throws InvalidUnitException {
        if (unit >= 21 && unit <= 25) {
			value = value.multiply(TIME_SCALES[DAY - 21]).divide(TIME_SCALES[unit - 21], ROUND_SCALE, HALF_UP);
			unit = DAY;
			return this;
		}
		if (unit >= 26 && unit <= 30) {
			throw new InvalidUnitException("Cannot convert from square time to time.");
		} else {
		    throw new InvalidUnitException("The unit " + unit + " is not valid as time unit.");
		}
    }

    @Override
    public Time toWeek() throws InvalidUnitException {
        if (unit >= 21 && unit <= 25) {
			value = value.multiply(TIME_SCALES[WEEK - 21]).divide(TIME_SCALES[unit - 21], ROUND_SCALE, HALF_UP);
			unit = WEEK;
			return this;
		}
		if (unit >= 26 && unit <= 30) {
			throw new InvalidUnitException("Cannot convert from square time to time.");
		} else {
		    throw new InvalidUnitException("The unit " + unit + " is not valid as time unit.");
		}
    }

    @Override
    public Time toSquareSecond() throws InvalidUnitException {
        if (unit >= 26 && unit <= 30) {
			value = value.multiply(TIME_SCALES[SQUARE_SECOND - 26]).divide(TIME_SCALES[unit - 21], ROUND_SCALE, HALF_UP);
			unit = SQUARE_SECOND;
			return this;
		}
		if (unit >= 21 && unit <= 25) {
			throw new InvalidUnitException("Cannot convert from time to square time.");
		} else {
			throw new InvalidUnitException("The unit " + unit + " is not valid as square time unit.");
		}
    }

    @Override
    public Time toSquareMinute() throws InvalidUnitException {
        if (unit >= 26 && unit <= 30) {
			value = value.multiply(TIME_SCALES[SQUARE_MINUTE - 26]).divide(TIME_SCALES[unit - 21], ROUND_SCALE, HALF_UP);
			unit = SQUARE_MINUTE;
			return this;
		}
		if (unit >= 21 && unit <= 25) {
			throw new InvalidUnitException("Cannot convert from time to square time.");
		} else {
			throw new InvalidUnitException("The unit " + unit + " is not valid as square time unit.");
		}
    }

    @Override
    public Time toSquareHour() throws InvalidUnitException {
        if (unit >= 26 && unit <= 30) {
			value = value.multiply(TIME_SCALES[SQUARE_HOUR - 26]).divide(TIME_SCALES[unit - 21], ROUND_SCALE, HALF_UP);
			unit = SQUARE_HOUR;
			return this;
		}
		if (unit >= 21 && unit <= 25) {
			throw new InvalidUnitException("Cannot convert from time to square time.");
		} else {
			throw new InvalidUnitException("The unit " + unit + " is not valid as square time unit.");
		}
    }

    @Override
    public Time toSquareDay() throws InvalidUnitException {
        if (unit >= 26 && unit <= 30) {
			value = value.multiply(TIME_SCALES[SQUARE_DAY - 26]).divide(TIME_SCALES[unit - 21], ROUND_SCALE, HALF_UP);
			unit = SQUARE_DAY;
			return this;
		}
		if (unit >= 21 && unit <= 25) {
			throw new InvalidUnitException("Cannot convert from time to square time.");
		} else {
			throw new InvalidUnitException("The unit " + unit + " is not valid as square time unit.");
		}
    }

    @Override
    public Time toSquareWeek() throws InvalidUnitException {
        if (unit >= 26 && unit <= 30) {
			value = value.multiply(TIME_SCALES[SQUARE_WEEK - 26]).divide(TIME_SCALES[unit - 21], ROUND_SCALE, HALF_UP);
			unit = SQUARE_WEEK;
			return this;
		}
		if (unit >= 21 && unit <= 25) {
			throw new InvalidUnitException("Cannot convert from time to square time.");
		} else {
			throw new InvalidUnitException("The unit " + unit + " is not valid as square time unit.");
		}
    }
	
	public Digital toDigital() throws InvalidUnitException {
		try {
			return new Digital();
		} catch (InvalidUnitException e) {
			throw e;
		}
	}

    protected static Time getInstance () {
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
		
		private Digital() throws InvalidUnitException {
			if (!(unit >= 25 && unit <= 25)) {
				throw new InvalidUnitException("Cannot use digital time in square time.");
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
				second = toSecond().toBigInteger();
			} catch (InvalidUnitException e) {}
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
