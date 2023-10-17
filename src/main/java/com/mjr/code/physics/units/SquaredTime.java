package com.mjr.code.physics.units;

import com.mjr.code.physics.Physic;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

import static com.mjr.code.physics.units.Time.*;
import static java.math.RoundingMode.HALF_UP;

public class SquaredTime extends Unit implements ISquaredTime {

    public static final int SQUARE_WEEK = Time.LAST_UNIT_CONS + 1;
    public static final int SQUARE_DAY = Time.LAST_UNIT_CONS + 2;
    public static final int SQUARE_HOUR = Time.LAST_UNIT_CONS + 3;
    public static final int SQUARE_MINUTE = Time.LAST_UNIT_CONS + 4;
    public static final int SQUARE_SECOND = Time.LAST_UNIT_CONS + 5;

    protected static final int UNIT_SCALE = SQUARE_WEEK;
    protected static final int LAST_UNIT_CONS = SQUARE_SECOND;
    private final int MAX_UNIT_SCALE = LAST_UNIT_CONS - UNIT_SCALE;

    protected static final BigDecimal[] SQUARED_TIME_SCALES = new BigDecimal[]
            {
                    TIME_SCALES[SQUARE_WEEK - UNIT_SCALE].pow(2),
                    TIME_SCALES[SQUARE_DAY - UNIT_SCALE].pow(2),
                    TIME_SCALES[SQUARE_HOUR - UNIT_SCALE].pow(2),
                    TIME_SCALES[SQUARE_MINUTE - UNIT_SCALE].pow(2),
                    TIME_SCALES[SQUARE_SECOND - UNIT_SCALE].pow(2)
            };

    public static final String SQUARE_DAY_SYMBOL = DAY_SYMBOL + "²";
    public static final String SQUARE_HOUR_SYMBOL = HOUR_SYMBOL + "²";
    public static final String SQUARE_MINUTE_SYMBOL = MINUTE_SYMBOL + "²";
    public static final String SQUARE_SECOND_SYMBOL = SECOND_SYMBOL + "²";

    protected static final String[] SQUARED_TIME_SYMBOLS = new String[] {
            SQUARE_DAY_SYMBOL,
            SQUARE_HOUR_SYMBOL,
            SQUARE_MINUTE_SYMBOL,
            SQUARE_SECOND_SYMBOL
    };

    public SquaredTime() {
        super();
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(SQUARE_SECOND - UNIT_SCALE);
    }

    public SquaredTime(double value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(SQUARE_SECOND - UNIT_SCALE);
    }

    public SquaredTime(String value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(SQUARE_SECOND - UNIT_SCALE);
    }

    public SquaredTime(long value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(SQUARE_SECOND - UNIT_SCALE);
    }

    public SquaredTime(BigDecimal value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(SQUARE_SECOND - UNIT_SCALE);
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
    public static @NotNull SquaredTime toSquareSecond(double value, int unit) {
        return new SquaredTime(divide(multiply(value, SQUARED_TIME_SCALES[unit - UNIT_SCALE]), SQUARED_TIME_SCALES[SQUARE_SECOND - UNIT_SCALE]));
    }

    @Contract("_, _ -> new")
    public static @NotNull SquaredTime toSquareMinute(double value, int unit) {
        return new SquaredTime(divide(multiply(value, SQUARED_TIME_SCALES[unit - UNIT_SCALE]), SQUARED_TIME_SCALES[SQUARE_MINUTE - UNIT_SCALE]));
    }

    @Contract("_, _ -> new")
    public static @NotNull SquaredTime toSquareHour(double value, int unit) {
        return new SquaredTime(divide(multiply(value, SQUARED_TIME_SCALES[unit - UNIT_SCALE]), SQUARED_TIME_SCALES[SQUARE_HOUR - UNIT_SCALE]));
    }

    @Contract("_, _ -> new")
    public static @NotNull SquaredTime toSquareDay(double value, int unit) {
        return new SquaredTime(BigDecimal.valueOf(value).multiply(SQUARED_TIME_SCALES[SQUARE_DAY - UNIT_SCALE]).divide(SQUARED_TIME_SCALES[unit - UNIT_SCALE], Physic.ROUND_SCALE, HALF_UP), SQUARE_DAY);
    }

    @Contract("_, _ -> new")
    public static @NotNull SquaredTime toSquareWeek(double value, int unit) {
        return new SquaredTime(divide(multiply(value, SQUARED_TIME_SCALES[unit - UNIT_SCALE]), SQUARED_TIME_SCALES[SQUARE_DAY - UNIT_SCALE]));
    }

    @Override
    public SquaredTime toSquareSecond() {
        setUnit(SQUARE_SECOND - UNIT_SCALE);
        value = divide(multiply(value, SQUARED_TIME_SCALES[unit - UNIT_SCALE]), SQUARED_TIME_SCALES[SQUARE_SECOND - UNIT_SCALE]);
        return this;
    }

    @Override
    public SquaredTime toSquareMinute() {
        setUnit(SQUARE_MINUTE - UNIT_SCALE);
        value = divide(multiply(value, SQUARED_TIME_SCALES[unit - UNIT_SCALE]), SQUARED_TIME_SCALES[SQUARE_MINUTE - UNIT_SCALE]);
        return this;
    }

    @Override
    public SquaredTime toSquareHour() {
        setUnit(SQUARE_HOUR - UNIT_SCALE);
        value = divide(multiply(value, SQUARED_TIME_SCALES[unit - UNIT_SCALE]), SQUARED_TIME_SCALES[SQUARE_HOUR - UNIT_SCALE]);
        return this;
    }

    @Override
    public SquaredTime toSquareDay() {
        setUnit(SQUARE_DAY - UNIT_SCALE);
        value = divide(multiply(value, SQUARED_TIME_SCALES[unit - UNIT_SCALE]), SQUARED_TIME_SCALES[SQUARE_DAY - UNIT_SCALE]);
        return this;
    }

    @Override
    public SquaredTime toSquareWeek() {
        setUnit(SQUARE_WEEK - UNIT_SCALE);
        value = divide(multiply(value, SQUARED_TIME_SCALES[unit - UNIT_SCALE]), SQUARED_TIME_SCALES[SQUARE_WEEK - UNIT_SCALE]);
        return this;
    }

    @Override
    public boolean isInInternationalSystem() {
        return unit == SQUARE_SECOND - UNIT_SCALE;
    }

    @Override
    public String getUnitSymbol() {
        return SQUARED_TIME_SYMBOLS[unit];
    }
}
