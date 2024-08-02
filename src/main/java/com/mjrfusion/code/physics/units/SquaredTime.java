package com.mjrfusion.code.physics.units;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

public class SquaredTime extends Unit implements ISquaredTime {

    public static final int SQUARED_WEEK = Time.LAST_UNIT_CONS + 1;
    public static final int SQUARED_DAY = Time.LAST_UNIT_CONS + 2;
    public static final int SQUARED_HOUR = Time.LAST_UNIT_CONS + 3;
    public static final int SQUARED_MINUTE = Time.LAST_UNIT_CONS + 4;
    public static final int SQUARED_SECOND = Time.LAST_UNIT_CONS + 5;

    protected static final int UNIT_SCALE = SQUARED_WEEK;
    protected static final int LAST_UNIT_CONS = SQUARED_SECOND;
    private final int MAX_UNIT_SCALE = LAST_UNIT_CONS - UNIT_SCALE;

    protected static final BigDecimal[] SQUARED_TIME_SCALES = new BigDecimal[]
            {
                    Time.TIME_SCALES[SQUARED_WEEK - UNIT_SCALE].pow(2),
                    Time.TIME_SCALES[SQUARED_DAY - UNIT_SCALE].pow(2),
                    Time.TIME_SCALES[SQUARED_HOUR - UNIT_SCALE].pow(2),
                    Time.TIME_SCALES[SQUARED_MINUTE - UNIT_SCALE].pow(2),
                    Time.TIME_SCALES[SQUARED_SECOND - UNIT_SCALE].pow(2)
            };

    public static final String SQUARED_WEEK_SYMBOL = Time.WEEK_IN_YEAR_SYMBOL + "²";
    public static final String SQUARED_DAY_SYMBOL = Time.DAY_SYMBOL + "²";
    public static final String SQUARED_HOUR_SYMBOL = Time.HOUR_SYMBOL + "²";
    public static final String SQUARED_MINUTE_SYMBOL = Time.MINUTE_SYMBOL + "²";
    public static final String SQUARED_SECOND_SYMBOL = Time.SECOND_SYMBOL + "²";

    protected static final String[] SQUAREDD_TIME_SYMBOLS = new String[] {
            SQUARED_WEEK_SYMBOL,
            SQUARED_DAY_SYMBOL,
            SQUARED_HOUR_SYMBOL,
            SQUARED_MINUTE_SYMBOL,
            SQUARED_SECOND_SYMBOL
    };

    public SquaredTime() {
        super();
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(SQUARED_SECOND - UNIT_SCALE);
    }

    public SquaredTime(double value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(SQUARED_SECOND - UNIT_SCALE);
    }

    public SquaredTime(String value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(SQUARED_SECOND - UNIT_SCALE);
    }

    public SquaredTime(long value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(SQUARED_SECOND - UNIT_SCALE);
    }

    public SquaredTime(BigDecimal value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(SQUARED_SECOND - UNIT_SCALE);
    }

    public SquaredTime(double value, int unit) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(unit - UNIT_SCALE);
    }

    public SquaredTime(String value, int unit) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(unit - UNIT_SCALE);
    }

    public SquaredTime(long value, int unit) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(unit - UNIT_SCALE);
    }

    public SquaredTime(BigDecimal value, int unit) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(unit - UNIT_SCALE);
    }

    @Contract("_, _ -> new")
    public static @NotNull SquaredTime toSquaredSecond(double value, int unit) {
        return new SquaredTime(divide(multiply(value, SQUARED_TIME_SCALES[SQUARED_SECOND - UNIT_SCALE]), SQUARED_TIME_SCALES[unit - UNIT_SCALE]), SQUARED_SECOND);
    }

    @Contract("_, _ -> new")
    public static @NotNull SquaredTime toSquaredMinute(double value, int unit) {
        return new SquaredTime(divide(multiply(value, SQUARED_TIME_SCALES[SQUARED_MINUTE - UNIT_SCALE]), SQUARED_TIME_SCALES[unit - UNIT_SCALE]), SQUARED_MINUTE);
    }

    @Contract("_, _ -> new")
    public static @NotNull SquaredTime toSquaredHour(double value, int unit) {
        return new SquaredTime(divide(multiply(value, SQUARED_TIME_SCALES[SQUARED_HOUR - UNIT_SCALE]), SQUARED_TIME_SCALES[unit - UNIT_SCALE]), SQUARED_HOUR);
    }

    @Contract("_, _ -> new")
    public static @NotNull SquaredTime toSquaredDay(double value, int unit) {
        return new SquaredTime(divide(multiply(value, SQUARED_TIME_SCALES[SQUARED_DAY - UNIT_SCALE]), SQUARED_TIME_SCALES[unit - UNIT_SCALE]), SQUARED_DAY);
    }

    @Contract("_, _ -> new")
    public static @NotNull SquaredTime toSquaredWeek(double value, int unit) {
        return new SquaredTime(divide(multiply(value, SQUARED_TIME_SCALES[SQUARED_WEEK - UNIT_SCALE]), SQUARED_TIME_SCALES[unit - UNIT_SCALE]), SQUARED_WEEK);
    }

    @Override
    public SquaredTime toSquaredSecond() {
        setUnit(SQUARED_SECOND - UNIT_SCALE);
        value = divide(multiply(value, SQUARED_TIME_SCALES[unit - UNIT_SCALE]), SQUARED_TIME_SCALES[SQUARED_SECOND - UNIT_SCALE]);
        return this;
    }

    @Override
    public SquaredTime toSquaredMinute() {
        setUnit(SQUARED_MINUTE - UNIT_SCALE);
        value = divide(multiply(value, SQUARED_TIME_SCALES[unit - UNIT_SCALE]), SQUARED_TIME_SCALES[SQUARED_MINUTE - UNIT_SCALE]);
        return this;
    }

    @Override
    public SquaredTime toSquaredHour() {
        setUnit(SQUARED_HOUR - UNIT_SCALE);
        value = divide(multiply(value, SQUARED_TIME_SCALES[unit - UNIT_SCALE]), SQUARED_TIME_SCALES[SQUARED_HOUR - UNIT_SCALE]);
        return this;
    }

    @Override
    public SquaredTime toSquaredDay() {
        setUnit(SQUARED_DAY - UNIT_SCALE);
        value = divide(multiply(value, SQUARED_TIME_SCALES[unit - UNIT_SCALE]), SQUARED_TIME_SCALES[SQUARED_DAY - UNIT_SCALE]);
        return this;
    }

    @Override
    public SquaredTime toSquaredWeek() {
        setUnit(SQUARED_WEEK - UNIT_SCALE);
        value = divide(multiply(value, SQUARED_TIME_SCALES[unit - UNIT_SCALE]), SQUARED_TIME_SCALES[SQUARED_WEEK - UNIT_SCALE]);
        return this;
    }

    @Override
    public String toString() {
        return value + SQUAREDD_TIME_SYMBOLS[unit];
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
        return unit == SQUARED_SECOND - UNIT_SCALE;
    }

    @Override
    public String getUnitSymbol() {
        return SQUAREDD_TIME_SYMBOLS[unit];
    }
}
