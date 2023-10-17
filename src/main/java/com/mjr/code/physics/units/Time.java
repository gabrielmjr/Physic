package com.mjr.code.physics.units;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

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
        setUnit(SECOND - UNIT_SCALE);
    }

    public Time(double value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(SECOND - UNIT_SCALE);
    }

    public Time(String value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(SECOND - UNIT_SCALE);
    }

    public Time(long value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(SECOND - UNIT_SCALE);
    }

    public Time(BigDecimal value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(SECOND - UNIT_SCALE);
    }

    public Time(double value, int unit) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(unit - UNIT_SCALE);
    }

    public Time(String value, int unit) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(unit - UNIT_SCALE);
    }

    public Time(long value, int unit) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(unit - UNIT_SCALE);
    }

    public Time(BigDecimal value, int unit) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(unit - UNIT_SCALE);
    }

	@Contract("_, _ -> new")
    public static @NotNull Time toSecond(double value, int unit) {
        return new Time(divide(multiply(value, TIME_SCALES[SECOND - UNIT_SCALE]), TIME_SCALES[unit - UNIT_SCALE]), SECOND);
	}

	@Contract("_, _ -> new")
    public static @NotNull Time

    toMinute(double value, int unit) {
        return new Time(divide(multiply(value, TIME_SCALES[MINUTE - UNIT_SCALE]), TIME_SCALES[unit - UNIT_SCALE]), MINUTE);
	}

	@Contract("_, _ -> new")
    public static @NotNull Time toHour(double value, int unit) {
        return new Time(divide(multiply(value, TIME_SCALES[HOUR - UNIT_SCALE]), TIME_SCALES[unit - UNIT_SCALE]), HOUR);
	}

	@Contract("_, _ -> new")
    public static @NotNull Time toDay(double value, int unit) {
        return new Time(divide(multiply(value, TIME_SCALES[DAY - UNIT_SCALE]), TIME_SCALES[unit - UNIT_SCALE]), DAY);
	}

	@Contract("_, _ -> new")
    public static @NotNull Time toWeek(double value, int unit) {
        return new Time(divide(multiply(value, TIME_SCALES[WEEK - UNIT_SCALE]), TIME_SCALES[unit - UNIT_SCALE]), WEEK);
	}

    @Override
    public Time toSecond() {
        value = divide(multiply(value, TIME_SCALES[SECOND - UNIT_SCALE]), TIME_SCALES[unit - UNIT_SCALE]);
        unit = SECOND - UNIT_SCALE;
        return this;
    }

    @Override
    public Time toMinute() {
        value = divide(multiply(value, TIME_SCALES[MINUTE - UNIT_SCALE]), TIME_SCALES[unit - UNIT_SCALE]);
        unit = MINUTE - UNIT_SCALE;
        return this;
    }

    @Override
    public Time toHour() {
        value = divide(multiply(value, TIME_SCALES[HOUR - UNIT_SCALE]), TIME_SCALES[unit - UNIT_SCALE]);
        unit = HOUR - UNIT_SCALE;
        return this;
    }

    @Override
    public Time toDay() {
        value = divide(multiply(value, TIME_SCALES[DAY - UNIT_SCALE]), TIME_SCALES[unit - UNIT_SCALE]);
        unit = DAY - UNIT_SCALE;
        return this;
    }

    @Override
    public Time toWeek() {
        value = divide(multiply(value, TIME_SCALES[WEEK - UNIT_SCALE]), TIME_SCALES[unit - UNIT_SCALE]);
        unit = WEEK - UNIT_SCALE;
        return this;
    }

    @Override
    public String toString() {
        return value + TIME_SYMBOLS[unit];
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
