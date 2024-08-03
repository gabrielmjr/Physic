package com.mjrfusion.code.physics.units;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

public class Time extends Unit implements ITime {
    @Deprecated
    private static Time instance;
    private TimeUnit unit;

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

    protected final String[] TIME_SYMBOLS = new String[]{
            WEEK_IN_MONTH_SYMBOL,
            DAY_SYMBOL,
            HOUR_SYMBOL,
            MINUTE_SYMBOL,
            SECOND_SYMBOL
    };

    public Time() {
        super();
        unit = TimeUnit.SECOND;
    }

    public Time(double value) {
        super(value);
        unit = TimeUnit.SECOND;
    }

    public Time(String value) {
        super(value);
        unit = TimeUnit.SECOND;
    }

    public Time(long value) {
        super(value);
        unit = TimeUnit.SECOND;
    }

    public Time(BigDecimal value) {
        super(value);
        unit = TimeUnit.SECOND;
    }

    public Time(double value, TimeUnit unit) {
        super(value);
        this.unit = unit;
    }

    public Time(String value, TimeUnit unit) {
        super(value);
        this.unit = unit;
    }

    public Time(long value, TimeUnit unit) {
        super(value);
        this.unit = unit;
    }

    public Time(BigDecimal value, TimeUnit unit) {
        super(value);
        this.unit = unit;
    }

    @Contract("_, _ -> new")
    public static @NotNull Time toSecond(double value, @NotNull TimeUnit unit) {
        return new Time(divide(multiply(value, TIME_SCALES[TimeUnit.SECOND.ordinal()]), TIME_SCALES[unit.ordinal()]), TimeUnit.SECOND);
    }

    @Contract("_, _ -> new")
    public static @NotNull Time

    toMinute(double value, @NotNull TimeUnit unit) {
        return new Time(divide(multiply(value, TIME_SCALES[TimeUnit.MINUTE.ordinal()]), TIME_SCALES[unit.ordinal()]), TimeUnit.MINUTE);
    }

    @Contract("_, _ -> new")
    public static @NotNull Time toHour(double value, @NotNull TimeUnit unit) {
        return new Time(divide(multiply(value, TIME_SCALES[TimeUnit.HOUR.ordinal()]), TIME_SCALES[unit.ordinal()]), TimeUnit.HOUR);
    }

    @Contract("_, _ -> new")
    public static @NotNull Time toDay(double value, @NotNull TimeUnit unit) {
        return new Time(divide(multiply(value, TIME_SCALES[TimeUnit.DAY.ordinal()]), TIME_SCALES[unit.ordinal()]), TimeUnit.DAY);
    }

    @Contract("_, _ -> new")
    public static @NotNull Time toWeek(double value, @NotNull TimeUnit unit) {
        return new Time(divide(multiply(value, TIME_SCALES[TimeUnit.WEEK.ordinal()]), TIME_SCALES[unit.ordinal()]), TimeUnit.WEEK);
    }

    @Override
    public Time toSecond() {
        value = divide(multiply(value, TIME_SCALES[TimeUnit.SECOND.ordinal()]), TIME_SCALES[unit.ordinal()]);
        unit = TimeUnit.SECOND;
        return this;
    }

    @Override
    public Time toMinute() {
        value = divide(multiply(value, TIME_SCALES[TimeUnit.MINUTE.ordinal()]), TIME_SCALES[unit.ordinal()]);
        unit = TimeUnit.MINUTE;
        return this;
    }

    @Override
    public Time toHour() {
        value = divide(multiply(value, TIME_SCALES[TimeUnit.HOUR.ordinal()]), TIME_SCALES[unit.ordinal()]);
        unit = TimeUnit.HOUR;
        return this;
    }

    @Override
    public Time toDay() {
        value = divide(multiply(value, TIME_SCALES[TimeUnit.DAY.ordinal()]), TIME_SCALES[unit.ordinal()]);
        unit = TimeUnit.DAY;
        return this;
    }

    @Override
    public Time toWeek() {
        value = divide(multiply(value, TIME_SCALES[TimeUnit.WEEK.ordinal()]), TIME_SCALES[unit.ordinal()]);
        unit = TimeUnit.WEEK;
        return this;
    }

    @Override
    public String toString() {
        return value + TIME_SYMBOLS[unit.ordinal()];
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
        return unit == TimeUnit.SECOND;
    }

    @Override
    public String getUnitSymbol() {
        return TIME_SYMBOLS[unit.ordinal()];
    }

    @Deprecated
    protected static Time getInstance() {
        if (instance == null)
            instance = new Time();
        return instance;
    }

    public enum TimeUnit {
        WEEK,
        DAY,
        HOUR,
        MINUTE,
        SECOND
    }
}
