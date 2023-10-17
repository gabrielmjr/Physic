package com.mjr.code.physics.units;

import com.mjr.code.physics.Physic;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

import static java.math.RoundingMode.HALF_UP;

public class Time extends Unit implements ITime {
    @Deprecated
    private static Time instance;
    
	public static final int WEEK = Volume.LAST_UNIT_CONS + 1;
	public static final int DAY = Volume.LAST_UNIT_CONS + 2;
	public static final int HOUR = Volume.LAST_UNIT_CONS + 3;
	public static final int MINUTE = Volume.LAST_UNIT_CONS + 4;
	public static final int SECOND = Volume.LAST_UNIT_CONS + 5;

    protected static final int UNIT_SCALE = WEEK;

    protected static final int LAST_UNIT_CONS = SECOND;
    private final int MAX_UNIT_SCALE = LAST_UNIT_CONS - UNIT_SCALE;

	protected static final BigDecimal[] TIME_SCALES = new BigDecimal[]
	{
		new BigDecimal("1.0"),
	    new BigDecimal("7.0"),
	    new BigDecimal("168.0"),
		new BigDecimal("10080.0"),
		new BigDecimal("604800.0")
	};

	public static final String WEEK_IN_YEAR_SYMBOL = "w";
	public static final String WEEK_IN_MONTH_SYMBOL = "w";
	public static final String DAY_SYMBOL = "d";
	public static final String HOUR_SYMBOL = "h";
	public static final String MINUTE_SYMBOL = "min";
	public static final String SECOND_SYMBOL = "s";

    protected final String[] TIME_SYMBOLS = new String[] {
        WEEK_IN_MONTH_SYMBOL,
        DAY_SYMBOL,
        HOUR_SYMBOL,
        MINUTE_SYMBOL,
        SECOND_SYMBOL
    };

    public Time() {
        super();
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(SECOND - 21);
    }

    public Time(double value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(SECOND - 21);
    }

    public Time(String value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(SECOND - 21);
    }

    public Time(long value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(SECOND - 21);
    }

    public Time(BigDecimal value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(SECOND - 21);
    }

    public Time(double value, int unit) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(unit - 21);
    }

    public Time(String value, int unit) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(unit - 21);
    }

    public Time(long value, int unit) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(unit - 21);
    }

    public Time(BigDecimal value, int unit) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(unit - 21);
    }

	@Contract("_, _ -> new")
    public static @NotNull Time toSecond(double value, int unit) {
		if (unit >= 21 && unit <= 25)
			return new Time(BigDecimal.valueOf(value).multiply(TIME_SCALES[SECOND - 21]).divide(TIME_SCALES[unit - 21], Physic.ROUND_SCALE, HALF_UP), SECOND);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as time unit.");
	}

	@Contract("_, _ -> new")
    public static @NotNull Time toMinute(double value, int unit) {
		if (unit >= 21 && unit <= 25)
			return new Time(BigDecimal.valueOf(value).multiply(TIME_SCALES[MINUTE - 21]).divide(TIME_SCALES[unit - 21], Physic.ROUND_SCALE, HALF_UP), MINUTE);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as time unit.");
	}

	@Contract("_, _ -> new")
    public static @NotNull Time toHour(double value, int unit) {
		if (unit >= 21 && unit <= 25)
			return new Time(BigDecimal.valueOf(value).multiply(TIME_SCALES[HOUR - 21]).divide(TIME_SCALES[unit - 21], Physic.ROUND_SCALE, HALF_UP), HOUR);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as time unit.");
	}

	@Contract("_, _ -> new")
    public static @NotNull Time toDay(double value, int unit) {
		if (unit >= 21 && unit <= 25)
			return new Time(BigDecimal.valueOf(value).multiply(TIME_SCALES[DAY - 21]).divide(TIME_SCALES[unit - 21], Physic.ROUND_SCALE, HALF_UP), DAY);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as time unit.");
	}

	@Contract("_, _ -> new")
    public static @NotNull Time toWeek(double value, int unit) {
		if (unit >= 21 && unit <= 25)
			return new Time(BigDecimal.valueOf(value).multiply(TIME_SCALES[WEEK - 21]).divide(TIME_SCALES[unit - 21], Physic.ROUND_SCALE, HALF_UP), WEEK);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as time unit.");
	}

    @Override
    public Time toSecond() {
        if (unit >= 26 && unit <= 30) 
            throw new IllegalArgumentException("Cannot convert from square time to time.");
        value = value.multiply(TIME_SCALES[SECOND - 21]).divide(TIME_SCALES[unit - 21], Physic.ROUND_SCALE, HALF_UP);
        unit = SECOND - 21;
        return this;
    }

    @Override
    public Time toMinute() {
        if (unit >= 26 && unit <= 30)
            throw new IllegalArgumentException("Cannot convert from square time to time.");
        value = value.multiply(TIME_SCALES[MINUTE - 21]).divide(TIME_SCALES[unit - 21], Physic.ROUND_SCALE, HALF_UP);
        unit = MINUTE - 21;
        return this;
    }

    @Override
    public Time toHour() {
        if (unit >= 26 && unit <= 30)
            throw new IllegalArgumentException("Cannot convert from square time to time.");
        value = value.multiply(TIME_SCALES[HOUR - 21]).divide(TIME_SCALES[unit - 21], Physic.ROUND_SCALE, HALF_UP);
        unit = HOUR - 21;
        return this;
    }

    @Override
    public Time toDay() {
        if (unit >= 26 && unit <= 30)
            throw new IllegalArgumentException("Cannot convert from square time to time.");
        value = value.multiply(TIME_SCALES[DAY - 21]).divide(TIME_SCALES[unit - 21], Physic.ROUND_SCALE, HALF_UP);
        unit = DAY - 21;
        return this;
    }

    @Override
    public Time toWeek() {
        if (unit >= 26 && unit <= 30)
            throw new IllegalArgumentException("Cannot convert from square time to time.");
        value = value.multiply(TIME_SCALES[WEEK - 21]).divide(TIME_SCALES[unit - 21], Physic.ROUND_SCALE, HALF_UP);
        unit = WEEK - 21;
        return this;
    }

    @Override
    public String toString() {
        return value + ((unit <= 4) ? TIME_SYMBOLS[unit] : TIME_SYMBOLS[unit - 4]);
    }
    
   /* private boolean isInUnitRange(int expoentMode) {
        if (expoentMode == EXPOENT_MODE_SINGLE) {
            
        }
        else if (expoentMode == EXPOENT_MODE_SQUARE) {

        } else {
            return super.isUnitInRange();
        }
    }
*/

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
    public boolean isInInternationalSystem() {
        return unit == (SECOND - UNIT_SCALE);
    }
    
    @Override
    public String getUnitSymbol() {
        return TIME_SYMBOLS[unit];
    }

    @Deprecated
    protected static Time getInstance() {
		if (instance == null)
			instance = new Time();
		return instance;
	}
}
