package com.gabrielmjr.twaire.physic.units;

import com.gabrielmjr.twaire.physic.PhysicException;
import java.math.BigDecimal;

import static java.math.RoundingMode.HALF_UP;

public class Time extends BigDecimal implements TimeIF {
    private static Time instance;
    private BigDecimal value;
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

    public Time(double value, int unit) throws PhysicException {
        super(value);
        this.value = divide(ONE);
        if (unit >= 21 && unit <= 30) {
            this.unit = unit;
            return;
        }
        throw new InvalidUnitException("The unit " + unit + " is not valid as " + getClass().getName() + " unit.");
    }

    public Time(String value, int unit) throws PhysicException {
        super(value);
        this.value = divide(ONE);
        if (unit >= 21 && unit <= 30) {
            this.unit = unit;
            return;
        }
        throw new InvalidUnitException("The unit " + unit + " is not valid as " + getClass().getName() + " unit.");
    }

    public Time(long value, int unit) throws PhysicException {
        super(value);
        this.value = divide(ONE);
        if (unit >= 21 && unit <= 30) {
            this.unit = unit;
            return;
        }
        throw new InvalidUnitException("The unit " + unit + " is not valid as " + getClass().getName() + " unit.");
    }

    public Time(BigDecimal value, int unit) throws PhysicException {
        super(value.toString());
        if (unit >= 21 && unit <= 30) {
            this.unit = unit;
            return;
        }
        throw new InvalidUnitException("The unit " + unit + " is not valid as " + getClass().getName() + " unit");
    }
    
	public static Time toSecond (double value, int unit) throws PhysicException {
		if (unit >= 21 && unit <= 25)
			return new Time(BigDecimal.valueOf(value).multiply(TIME_SCALES[unit - 21]).divide(TIME_SCALES[SECOND - 21], 10, HALF_UP), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Time().getClass().getName() + " unit.");
	}

	public static Time toMinute (double value, int unit) throws PhysicException {
		if (unit >= 21 && unit <= 25)
			return new Time(BigDecimal.valueOf(value).multiply(TIME_SCALES[unit - 21]).divide(TIME_SCALES[MINUTE - 21], 10, HALF_UP), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Time().getClass().getName() + " unit.");
	}

	public static Time toHour (double value, int unit) throws PhysicException {
		if (unit >= 21 && unit <= 25)
			return new Time(BigDecimal.valueOf(value).multiply(TIME_SCALES[unit - 21]).divide(TIME_SCALES[HOUR - 21], 10, HALF_UP), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Time().getClass().getName() + " unit.");
	}

	public static Time toDay (double value, int unit) throws PhysicException {
		if (unit >= 21 && unit <= 25)
			return new Time(BigDecimal.valueOf(value).multiply(TIME_SCALES[unit - 21]).divide(TIME_SCALES[DAY - 21], 10, HALF_UP), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Time().getClass().getName() + " unit.");
	}

	public static Time toWeek (double value, int unit) throws PhysicException {
		if (unit >= 21 && unit <= 25)
			return new Time(BigDecimal.valueOf(value).multiply(TIME_SCALES[unit - 21]).divide(TIME_SCALES[WEEK - 21], 10, HALF_UP), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Time().getClass().getName() + " unit.");
	}

	public static Time toSquareSecond (double value, int unit) throws PhysicException {
		if (unit >= 26 && unit <= 30)
			return new Time(BigDecimal.valueOf(value).multiply(SQUARE_TIME_SCALES[unit - 26]).divide(SQUARE_TIME_SCALES[SQUARE_SECOND - 26], 10, HALF_UP), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as square " + new Time().getClass().getName() + " unit.");
	}

	public static Time toSquareMinute (double value, int unit) throws PhysicException {
		if (unit >= 26 && unit <= 30)
			return new Time(BigDecimal.valueOf(value).multiply(SQUARE_TIME_SCALES[unit - 26]).divide(SQUARE_TIME_SCALES[SQUARE_MINUTE - 26], 10, HALF_UP), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as square " + new Time().getClass().getName() + " unit.");
	}

	public static Time toSquareHour (double value, int unit) throws PhysicException {
		if (unit >= 26 && unit <= 30)
			return new Time(BigDecimal.valueOf(value).multiply(SQUARE_TIME_SCALES[unit - 26]).divide(SQUARE_TIME_SCALES[SQUARE_HOUR - 26], 10, HALF_UP), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as square " + new Time().getClass().getName() + " unit.");
	}

	public static Time toSquareDay (double value, int unit) throws PhysicException {
		if (unit >= 26 && unit <= 30)
			return new Time(BigDecimal.valueOf(value).multiply(SQUARE_TIME_SCALES[unit - 26]).divide(SQUARE_TIME_SCALES[SQUARE_DAY - 26], 10, HALF_UP), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as square " + new Time().getClass().getName() + " unit.");
	}

	public static Time toSquareWeek (double value, int unit) throws PhysicException {
		if (unit >= 26 && unit <= 30)
			return new Time(BigDecimal.valueOf(value).multiply(SQUARE_TIME_SCALES[unit - 26]).divide(SQUARE_TIME_SCALES[SQUARE_SECOND - 26], 10, HALF_UP), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as square " + new Time().getClass().getName() + " unit.");
	}
    
    @Override
    public Time toSecond() {
        return null;
    }

    @Override
    public Time toMinute() {
        return null;
    }

    @Override
    public Time toHour() {
        return null;
    }

    @Override
    public Time toDay() {
        return null;
    }

    @Override
    public Time toWeek() {
        return null;
    }

    @Override
    public Time toSquareSecond() {
        return null;
    }

    @Override
    public Time toSquareMinute() {
        return null;
    }

    @Override
    public Time toSquareHour() {
        return null;
    }

    @Override
    public Time toSquareDay() {
        return null;
    }

    @Override
    public Time toSquareWeek() {
        return null;
    }

    protected static Time getInstance () {
		if (!(instance instanceof Time))
			instance = new Time();
		return instance;
    }
}
