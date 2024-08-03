package com.mjrfusion.code.physics.units;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

public class SquaredTime extends Unit implements ISquaredTime {
    private SquaredTimeUnit unit;

    protected static final BigDecimal[] SQUARED_TIME_SCALES = new BigDecimal[] {
                    Time.TIME_SCALES[Time.TimeUnit.WEEK.ordinal()].pow(2),
                    Time.TIME_SCALES[Time.TimeUnit.DAY.ordinal()].pow(2),
                    Time.TIME_SCALES[Time.TimeUnit.HOUR.ordinal()].pow(2),
                    Time.TIME_SCALES[Time.TimeUnit.MINUTE.ordinal()].pow(2),
                    Time.TIME_SCALES[Time.TimeUnit.SECOND.ordinal()].pow(2)
            };

    public static final String SQUARED_WEEK_SYMBOL = Time.WEEK_IN_YEAR_SYMBOL + "²";
    public static final String SQUARED_DAY_SYMBOL = Time.DAY_SYMBOL + "²";
    public static final String SQUARED_HOUR_SYMBOL = Time.HOUR_SYMBOL + "²";
    public static final String SQUARED_MINUTE_SYMBOL = Time.MINUTE_SYMBOL + "²";
    public static final String SQUARED_SECOND_SYMBOL = Time.SECOND_SYMBOL + "²";

    protected static final String[] SQUAREDD_TIME_SYMBOLS = new String[]{
            SQUARED_WEEK_SYMBOL,
            SQUARED_DAY_SYMBOL,
            SQUARED_HOUR_SYMBOL,
            SQUARED_MINUTE_SYMBOL,
            SQUARED_SECOND_SYMBOL
    };

    public SquaredTime() {
        super();
        unit = SquaredTimeUnit.SQUARED_SECOND;
    }

    public SquaredTime(double value) {
        super(value);
        unit = SquaredTimeUnit.SQUARED_SECOND;
    }

    public SquaredTime(String value) {
        super(value);
        unit = SquaredTimeUnit.SQUARED_SECOND;
    }

    public SquaredTime(long value) {
        super(value);
        unit = SquaredTimeUnit.SQUARED_SECOND;
    }

    public SquaredTime(BigDecimal value) {
        super(value);
        unit = SquaredTimeUnit.SQUARED_SECOND;
    }

    public SquaredTime(double value, SquaredTimeUnit unit) {
        super(value);
        this.unit = unit;
    }

    public SquaredTime(String value, SquaredTimeUnit unit) {
        super(value);
        this.unit = unit;
    }

    public SquaredTime(long value, SquaredTimeUnit unit) {
        super(value);
        this.unit = unit;
    }

    public SquaredTime(BigDecimal value, SquaredTimeUnit unit) {
        super(value);
        this.unit = unit;
    }

    @Contract("_, _ -> new")
    public static @NotNull SquaredTime toSquaredSecond(double value, SquaredTimeUnit unit) {
        return new SquaredTime(divide(multiply(value, SQUARED_TIME_SCALES[SquaredTimeUnit.SQUARED_SECOND.ordinal()]), SQUARED_TIME_SCALES[unit.ordinal()]), SquaredTimeUnit.SQUARED_SECOND);
    }

    @Contract("_, _ -> new")
    public static @NotNull SquaredTime toSquaredMinute(double value, SquaredTimeUnit unit) {
        return new SquaredTime(divide(multiply(value, SQUARED_TIME_SCALES[SquaredTimeUnit.SQUARED_MINUTE.ordinal()]), SQUARED_TIME_SCALES[unit.ordinal()]), SquaredTimeUnit.SQUARED_MINUTE);
    }

    @Contract("_, _ -> new")
    public static @NotNull SquaredTime toSquaredHour(double value, SquaredTimeUnit unit) {
        return new SquaredTime(divide(multiply(value, SQUARED_TIME_SCALES[SquaredTimeUnit.SQUARED_HOUR.ordinal()]), SQUARED_TIME_SCALES[unit.ordinal()]), SquaredTimeUnit.SQUARED_HOUR);
    }

    @Contract("_, _ -> new")
    public static @NotNull SquaredTime toSquaredDay(double value, SquaredTimeUnit unit) {
        return new SquaredTime(divide(multiply(value, SQUARED_TIME_SCALES[SquaredTimeUnit.SQUARED_DAY.ordinal()]), SQUARED_TIME_SCALES[unit.ordinal()]), SquaredTimeUnit.SQUARED_DAY);
    }

    @Contract("_, _ -> new")
    public static @NotNull SquaredTime toSquaredWeek(double value, SquaredTimeUnit unit) {
        return new SquaredTime(divide(multiply(value, SQUARED_TIME_SCALES[SquaredTimeUnit.SQUARED_WEEK.ordinal()]), SQUARED_TIME_SCALES[unit.ordinal()]), SquaredTimeUnit.SQUARED_WEEK);
    }

    @Override
    public SquaredTime toSquaredSecond() {
        unit = SquaredTimeUnit.SQUARED_SECOND;
        value = divide(multiply(value, SQUARED_TIME_SCALES[unit.ordinal()]), SQUARED_TIME_SCALES[SquaredTimeUnit.SQUARED_SECOND.ordinal()]);
        return this;
    }

    @Override
    public SquaredTime toSquaredMinute() {
        unit = SquaredTimeUnit.SQUARED_MINUTE;
        value = divide(multiply(value, SQUARED_TIME_SCALES[unit.ordinal()]), SQUARED_TIME_SCALES[SquaredTimeUnit.SQUARED_MINUTE.ordinal()]);
        return this;
    }

    @Override
    public SquaredTime toSquaredHour() {
        unit = SquaredTimeUnit.SQUARED_HOUR;
        value = divide(multiply(value, SQUARED_TIME_SCALES[unit.ordinal()]), SQUARED_TIME_SCALES[SquaredTimeUnit.SQUARED_HOUR.ordinal()]);
        return this;
    }

    @Override
    public SquaredTime toSquaredDay() {
        unit = SquaredTimeUnit.SQUARED_DAY;
        value = divide(multiply(value, SQUARED_TIME_SCALES[unit.ordinal()]), SQUARED_TIME_SCALES[SquaredTimeUnit.SQUARED_DAY.ordinal()]);
        return this;
    }

    @Override
    public SquaredTime toSquaredWeek() {
        unit = SquaredTimeUnit.SQUARED_WEEK;
        value = divide(multiply(value, SQUARED_TIME_SCALES[unit.ordinal()]), SQUARED_TIME_SCALES[SquaredTimeUnit.SQUARED_WEEK.ordinal()]);
        return this;
    }

    @Override
    public String toString() {
        return value + SQUAREDD_TIME_SYMBOLS[unit.ordinal()];
    }

    @Override
    public boolean equals(Object object) {
        try {
            SquaredTime squaredTime = (SquaredTime) object;
            return squaredTime.toString().equals(toString());
        } catch (ClassCastException e) {
            return false;
        }
    }

    @Override
    public boolean isInInternationalSystem() {
        return unit == SquaredTimeUnit.SQUARED_SECOND;
    }

    @Override
    public String getUnitSymbol() {
        return SQUAREDD_TIME_SYMBOLS[unit.ordinal()];
    }

    public enum SquaredTimeUnit {
        SQUARED_WEEK,
        SQUARED_DAY,
        SQUARED_HOUR,
        SQUARED_MINUTE,
        SQUARED_SECOND
    }
}
