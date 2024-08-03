package com.mjrfusion.code.physics.units;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

public class Speed extends Unit implements ISpeed {
    @Deprecated
    private static Speed instance;
    private SpeedUnit unit;

    protected static final BigDecimal[] SPEED_SCALES;

    static {
        SPEED_SCALES = new BigDecimal[]
                {
                        divide(Length.LENGTH_SCALES[Length.LengthUnit.KILOMETER.ordinal()], Time.TIME_SCALES[Time.TimeUnit.SECOND.ordinal()]),
                        divide(Length.LENGTH_SCALES[Length.LengthUnit.HECTOMETER.ordinal()], Time.TIME_SCALES[Time.TimeUnit.SECOND.ordinal()]),
                        divide(Length.LENGTH_SCALES[Length.LengthUnit.DECAMETER.ordinal()], Time.TIME_SCALES[Time.TimeUnit.SECOND.ordinal()]),
                        divide(Length.LENGTH_SCALES[Length.LengthUnit.METER.ordinal()], Time.TIME_SCALES[Time.TimeUnit.SECOND.ordinal()]),
                        divide(Length.LENGTH_SCALES[Length.LengthUnit.DECIMETER.ordinal()], Time.TIME_SCALES[Time.TimeUnit.SECOND.ordinal()]),
                        divide(Length.LENGTH_SCALES[Length.LengthUnit.CENTIMETER.ordinal()], Time.TIME_SCALES[Time.TimeUnit.SECOND.ordinal()]),
                        divide(Length.LENGTH_SCALES[Length.LengthUnit.MILLIMETER.ordinal()], Time.TIME_SCALES[Time.TimeUnit.SECOND.ordinal()]),

                        divide(Length.LENGTH_SCALES[Length.LengthUnit.KILOMETER.ordinal()], Time.TIME_SCALES[Time.TimeUnit.MINUTE.ordinal()]),
                        divide(Length.LENGTH_SCALES[Length.LengthUnit.HECTOMETER.ordinal()], Time.TIME_SCALES[Time.TimeUnit.MINUTE.ordinal()]),
                        divide(Length.LENGTH_SCALES[Length.LengthUnit.DECAMETER.ordinal()], Time.TIME_SCALES[Time.TimeUnit.MINUTE.ordinal()]),
                        divide(Length.LENGTH_SCALES[Length.LengthUnit.METER.ordinal()], Time.TIME_SCALES[Time.TimeUnit.MINUTE.ordinal()]),
                        divide(Length.LENGTH_SCALES[Length.LengthUnit.DECIMETER.ordinal()], Time.TIME_SCALES[Time.TimeUnit.MINUTE.ordinal()]),
                        divide(Length.LENGTH_SCALES[Length.LengthUnit.CENTIMETER.ordinal()], Time.TIME_SCALES[Time.TimeUnit.MINUTE.ordinal()]),
                        divide(Length.LENGTH_SCALES[Length.LengthUnit.MILLIMETER.ordinal()], Time.TIME_SCALES[Time.TimeUnit.MINUTE.ordinal()]),

                        divide(Length.LENGTH_SCALES[Length.LengthUnit.KILOMETER.ordinal()], Time.TIME_SCALES[Time.TimeUnit.HOUR.ordinal()]),
                        divide(Length.LENGTH_SCALES[Length.LengthUnit.HECTOMETER.ordinal()], Time.TIME_SCALES[Time.TimeUnit.HOUR.ordinal()]),
                        divide(Length.LENGTH_SCALES[Length.LengthUnit.DECAMETER.ordinal()], Time.TIME_SCALES[Time.TimeUnit.HOUR.ordinal()]),
                        divide(Length.LENGTH_SCALES[Length.LengthUnit.METER.ordinal()], Time.TIME_SCALES[Time.TimeUnit.HOUR.ordinal()]),
                        divide(Length.LENGTH_SCALES[Length.LengthUnit.DECIMETER.ordinal()], Time.TIME_SCALES[Time.TimeUnit.HOUR.ordinal()]),
                        divide(Length.LENGTH_SCALES[Length.LengthUnit.CENTIMETER.ordinal()], Time.TIME_SCALES[Time.TimeUnit.HOUR.ordinal()]),
                        divide(Length.LENGTH_SCALES[Length.LengthUnit.MILLIMETER.ordinal()], Time.TIME_SCALES[Time.TimeUnit.HOUR.ordinal()]),
                };
    }

    public static final String KILOMETER_PER_SECOND_SYMBOL = Length.KILOMETER_SYMBOL + "/" + Time.SECOND_SYMBOL;
    public static final String HECTOMETER_PER_SECOND_SYMBOL = Length.HECTOMETER_SYMBOL + "/" + Time.SECOND_SYMBOL;
    public static final String DECAMETER_PER_SECOND_SYMBOL = Length.DECAMETER_SYMBOL + "/" + Time.SECOND_SYMBOL;
    public static final String METER_PER_SECOND_SYMBOL = Length.METER_SYMBOL + "/" + Time.SECOND_SYMBOL;
    public static final String DECIMETER_PER_SECOND_SYMBOL = Length.DECIMETER_SYMBOL + "/" + Time.SECOND_SYMBOL;
    public static final String CENTIMETER_PER_SECOND_SYMBOL = Length.CENTIMETER_SYMBOL + "/" + Time.SECOND_SYMBOL;
    public static final String MILLIMETER_PER_SECOND_SYMBOL = Length.MILLIMETER_SYMBOL + "/" + Time.SECOND_SYMBOL;

    public static final String KILOMETER_PER_MINUTE_SYMBOL = Length.KILOMETER_SYMBOL + "/" + Time.MINUTE_SYMBOL;
    public static final String HECTOMETER_PER_MINUTE_SYMBOL = Length.HECTOMETER_SYMBOL + "/" + Time.MINUTE_SYMBOL;
    public static final String DECAMETER_PER_MINUTE_SYMBOL = Length.DECAMETER_SYMBOL + "/" + Time.MINUTE_SYMBOL;
    public static final String METER_PER_MINUTE_SYMBOL = Length.METER_SYMBOL + "/" + Time.MINUTE_SYMBOL;
    public static final String DECIMETER_PER_MINUTE_SYMBOL = Length.DECIMETER_SYMBOL + "/" + Time.MINUTE_SYMBOL;
    public static final String CENTIMETER_PER_MINUTE_SYMBOL = Length.CENTIMETER_SYMBOL + "/" + Time.MINUTE_SYMBOL;
    public static final String MILLIMETER_PER_MINUTE_SYMBOL = Length.MILLIMETER_SYMBOL + "/" + Time.MINUTE_SYMBOL;

    public static final String KILOMETER_PER_HOUR_SYMBOL = Length.KILOMETER_SYMBOL + "/" + Time.HOUR_SYMBOL;
    public static final String HECTOMETER_PER_HOUR_SYMBOL = Length.HECTOMETER_SYMBOL + "/" + Time.HOUR_SYMBOL;
    public static final String DECAMETER_PER_HOUR_SYMBOL = Length.DECAMETER_SYMBOL + "/" + Time.HOUR_SYMBOL;
    public static final String METER_PER_HOUR_SYMBOL = Length.METER_SYMBOL + "/" + Time.HOUR_SYMBOL;
    public static final String DECIMETER_PER_HOUR_SYMBOL = Length.DECIMETER_SYMBOL + "/" + Time.HOUR_SYMBOL;
    public static final String CENTIMETER_PER_HOUR_SYMBOL = Length.CENTIMETER_SYMBOL + "/" + Time.HOUR_SYMBOL;
    public static final String MILLIMETER_PER_HOUR_SYMBOL = Length.MILLIMETER_SYMBOL + "/" + Time.HOUR_SYMBOL;

    protected final String[] SPEED_SYMBOLS = new String[]{
            KILOMETER_PER_SECOND_SYMBOL,
            HECTOMETER_PER_SECOND_SYMBOL,
            DECAMETER_PER_SECOND_SYMBOL,
            METER_PER_SECOND_SYMBOL,
            DECIMETER_PER_SECOND_SYMBOL,
            CENTIMETER_PER_SECOND_SYMBOL,
            MILLIMETER_PER_SECOND_SYMBOL,
            KILOMETER_PER_MINUTE_SYMBOL,
            HECTOMETER_PER_MINUTE_SYMBOL,
            DECAMETER_PER_MINUTE_SYMBOL,
            METER_PER_MINUTE_SYMBOL,
            DECIMETER_PER_MINUTE_SYMBOL,
            CENTIMETER_PER_MINUTE_SYMBOL,
            MILLIMETER_PER_MINUTE_SYMBOL,
            KILOMETER_PER_HOUR_SYMBOL,
            HECTOMETER_PER_HOUR_SYMBOL,
            DECAMETER_PER_HOUR_SYMBOL,
            METER_PER_HOUR_SYMBOL,
            DECIMETER_PER_HOUR_SYMBOL,
            CENTIMETER_PER_HOUR_SYMBOL,
            MILLIMETER_PER_HOUR_SYMBOL
    };

    public Speed() {
        super();
        unit = SpeedUnit.METER_PER_SECOND;
    }

    public Speed(double value) {
        super(value);
        unit = SpeedUnit.METER_PER_SECOND;
    }

    public Speed(String value) {
        super(value);
        unit = SpeedUnit.METER_PER_SECOND;
    }

    public Speed(long value) {
        super(value);
        unit = SpeedUnit.METER_PER_SECOND;
    }

    public Speed(BigDecimal value) {
        super(value);
        unit = SpeedUnit.METER_PER_SECOND;
    }

    public Speed(double value, SpeedUnit unit) {
        super(value);
        this.unit = unit;
    }

    public Speed(String value, SpeedUnit unit) {
        super(value);
        this.unit = unit;
    }

    public Speed(long value, SpeedUnit unit) {
        super(value);
        this.unit = unit;
    }

    public Speed(BigDecimal value, SpeedUnit unit) {
        super(value);
        this.unit = unit;
    }

    @Contract("_, _ -> new")
    public static @NotNull Speed toKilometerPerSecond(double value, @NotNull SpeedUnit unit) {
        return new Speed(divide(multiply(value, SPEED_SCALES[SpeedUnit.KILOMETER_PER_SECOND.ordinal()]), SPEED_SCALES[unit.ordinal()]), SpeedUnit.KILOMETER_PER_SECOND);
    }

    @Contract("_, _ -> new")
    public static @NotNull Speed toHectometerPerSecond(double value, @NotNull SpeedUnit unit) {
        return new Speed(divide(multiply(value, SPEED_SCALES[SpeedUnit.HECTOMETER_PER_SECOND.ordinal()]), SPEED_SCALES[unit.ordinal()]), SpeedUnit.HECTOMETER_PER_SECOND);
    }

    @Contract("_, _ -> new")
    public static @NotNull Speed toDecameterPerSecond(double value, @NotNull SpeedUnit unit) {
        return new Speed(divide(multiply(value, SPEED_SCALES[SpeedUnit.DECAMETER_PER_SECOND.ordinal()]), SPEED_SCALES[unit.ordinal()]), SpeedUnit.DECAMETER_PER_SECOND);
    }

    @Contract("_, _ -> new")
    public static @NotNull Speed toMeterPerSecond(double value, @NotNull SpeedUnit unit) {
        return new Speed(divide(multiply(value, SPEED_SCALES[SpeedUnit.METER_PER_SECOND.ordinal()]), SPEED_SCALES[unit.ordinal()]), SpeedUnit.METER_PER_SECOND);
    }

    @Contract("_, _ -> new")
    public static @NotNull Speed toDecimeterPerSecond(double value, @NotNull SpeedUnit unit) {
        return new Speed(divide(multiply(value, SPEED_SCALES[SpeedUnit.DECIMETER_PER_SECOND.ordinal()]), SPEED_SCALES[unit.ordinal()]), SpeedUnit.DECIMETER_PER_SECOND);
    }

    @Contract("_, _ -> new")
    public static @NotNull Speed toCentimeterPerSecond(double value, @NotNull SpeedUnit unit) {
        return new Speed(divide(multiply(value, SPEED_SCALES[SpeedUnit.CENTIMETER_PER_SECOND.ordinal()]), SPEED_SCALES[unit.ordinal()]), SpeedUnit.CENTIMETER_PER_SECOND);
    }

    @Contract("_, _ -> new")
    public static @NotNull Speed toMillimeterPerSecond(double value, @NotNull SpeedUnit unit) {
        return new Speed(divide(multiply(value, SPEED_SCALES[SpeedUnit.MILLIMETER_PER_SECOND.ordinal()]), SPEED_SCALES[unit.ordinal()]), SpeedUnit.MILLIMETER_PER_SECOND);
    }

    @Contract("_, _ -> new")
    public static @NotNull Speed toKilometerPerMinute(double value, @NotNull SpeedUnit unit) {
        return new Speed(divide(multiply(value, SPEED_SCALES[SpeedUnit.KILOMETER_PER_MINUTE.ordinal()]), SPEED_SCALES[unit.ordinal()]), SpeedUnit.KILOMETER_PER_MINUTE);
    }

    @Contract("_, _ -> new")
    public static @NotNull Speed toHectometerPerMinute(double value, @NotNull SpeedUnit unit) {
        return new Speed(divide(multiply(value, SPEED_SCALES[SpeedUnit.HECTOMETER_PER_MINUTE.ordinal()]), SPEED_SCALES[unit.ordinal()]), SpeedUnit.HECTOMETER_PER_MINUTE);
    }

    @Contract("_, _ -> new")
    public static @NotNull Speed toDecameterPerMinute(double value, @NotNull SpeedUnit unit) {
        return new Speed(divide(multiply(value, SPEED_SCALES[SpeedUnit.DECAMETER_PER_MINUTE.ordinal()]), SPEED_SCALES[unit.ordinal()]), SpeedUnit.DECAMETER_PER_MINUTE);
    }

    @Contract("_, _ -> new")
    public static @NotNull Speed toMeterPerMinute(double value, @NotNull SpeedUnit unit) {
        return new Speed(divide(multiply(value, SPEED_SCALES[SpeedUnit.METER_PER_MINUTE.ordinal()]), SPEED_SCALES[unit.ordinal()]), SpeedUnit.METER_PER_MINUTE);
    }

    @Contract("_, _ -> new")
    public static @NotNull Speed toDecimeterPerMinute(double value, @NotNull SpeedUnit unit) {
        return new Speed(divide(multiply(value, SPEED_SCALES[SpeedUnit.DECIMETER_PER_MINUTE.ordinal()]), SPEED_SCALES[unit.ordinal()]), SpeedUnit.DECIMETER_PER_MINUTE);
    }

    @Contract("_, _ -> new")
    public static @NotNull Speed toCentimeterPerMinute(double value, @NotNull SpeedUnit unit) {
        return new Speed(divide(multiply(value, SPEED_SCALES[SpeedUnit.CENTIMETER_PER_MINUTE.ordinal()]), SPEED_SCALES[unit.ordinal()]), SpeedUnit.CENTIMETER_PER_MINUTE);
    }

    @Contract("_, _ -> new")
    public static @NotNull Speed toMillimeterPerMinute(double value, @NotNull SpeedUnit unit) {
        return new Speed(divide(multiply(value, SPEED_SCALES[SpeedUnit.MILLIMETER_PER_MINUTE.ordinal()]), SPEED_SCALES[unit.ordinal()]), SpeedUnit.MILLIMETER_PER_MINUTE);
    }

    @Contract("_, _ -> new")
    public static @NotNull Speed toKilometerPerHour(double value, @NotNull SpeedUnit unit) {
        return new Speed(divide(multiply(value, SPEED_SCALES[SpeedUnit.KILOMETER_PER_HOUR.ordinal()]), SPEED_SCALES[unit.ordinal()]), SpeedUnit.KILOMETER_PER_HOUR);
    }

    @Contract("_, _ -> new")
    public static @NotNull Speed toHectometerPerHour(double value, @NotNull SpeedUnit unit) {
        return new Speed(divide(multiply(value, SPEED_SCALES[SpeedUnit.HECTOMETER_PER_HOUR.ordinal()]), SPEED_SCALES[unit.ordinal()]), SpeedUnit.HECTOMETER_PER_HOUR);
    }

    @Contract("_, _ -> new")
    public static @NotNull Speed toDecameterPerHour(double value, @NotNull SpeedUnit unit) {
        return new Speed(divide(multiply(value, SPEED_SCALES[SpeedUnit.DECAMETER_PER_HOUR.ordinal()]), SPEED_SCALES[unit.ordinal()]), SpeedUnit.DECAMETER_PER_HOUR);
    }

    @Contract("_, _ -> new")
    public static @NotNull Speed toMeterPerHour(double value, @NotNull SpeedUnit unit) {
        return new Speed(divide(multiply(value, SPEED_SCALES[SpeedUnit.METER_PER_HOUR.ordinal()]), SPEED_SCALES[unit.ordinal()]), SpeedUnit.METER_PER_HOUR);
    }

    @Contract("_, _ -> new")
    public static @NotNull Speed toDecimeterPerHour(double value, @NotNull SpeedUnit unit) {
        return new Speed(divide(multiply(value, SPEED_SCALES[SpeedUnit.DECIMETER_PER_HOUR.ordinal()]), SPEED_SCALES[unit.ordinal()]), SpeedUnit.DECIMETER_PER_HOUR);
    }

    @Contract("_, _ -> new")
    public static @NotNull Speed toCentimeterPerHour(double value, @NotNull SpeedUnit unit) {
        return new Speed(divide(multiply(value, SPEED_SCALES[SpeedUnit.CENTIMETER_PER_HOUR.ordinal()]), SPEED_SCALES[unit.ordinal()]), SpeedUnit.CENTIMETER_PER_HOUR);
    }

    @Contract("_, _ -> new")
    public static @NotNull Speed toMillimeterPerHour(double value, @NotNull SpeedUnit unit) {
        return new Speed(divide(multiply(value, SPEED_SCALES[SpeedUnit.MILLIMETER_PER_HOUR.ordinal()]), SPEED_SCALES[unit.ordinal()]), SpeedUnit.MILLIMETER_PER_HOUR);
    }

    @Override
    public Speed toKilometerPerSecond() {
        return null;
    }

    @Override
    public Speed toHectometerPerSecond() {
        return null;
    }

    @Override
    public Speed toDecameterPerSecond() {
        return null;
    }

    @Override
    public Speed toMeterPerSecond() {
        return null;
    }

    @Override
    public Speed toDecimeterPerSecond() {
        return null;
    }

    @Override
    public Speed toCentimeterPerSecond() {
        return null;
    }

    @Override
    public Speed toMillimeterPerSecond() {
        return null;
    }

    @Override
    public Speed toKilometerPerMinute() {
        return null;
    }

    @Override
    public Speed toHectometerPerMinute() {
        return null;
    }

    @Override
    public Speed toDecameterPerMinute() {
        return null;
    }

    @Override
    public Speed toMeterPerMinute() {
        return null;
    }

    @Override
    public Speed toDecimeterPerMinute() {
        return null;
    }

    @Override
    public Speed toCentimeterPerMinute() {
        return null;
    }

    @Override
    public Speed toMillimeterPerMinute() {
        return null;
    }

    @Override
    public Speed toKilometerPerHour() {
        return null;
    }

    @Override
    public Speed toHectometerPerHour() {
        return null;
    }

    @Override
    public Speed toDecameterPerHour() {
        return null;
    }

    @Override
    public Speed toMeterPerHour() {
        return null;
    }

    @Override
    public Speed toDecimeterPerHour() {
        return null;
    }

    @Override
    public Speed toCentimeterPerHour() {
        return null;
    }

    @Override
    public Speed toMillimeterPerHour() {
        return null;
    }

    @Override
    public String toString() {
        return value + SPEED_SYMBOLS[unit.ordinal()];
    }

    @Override
    public boolean equals(Object object) {
        try {
            Speed speed = (Speed) object;
            return speed.toString().equals(toString());
        } catch (ClassCastException e) {
            return false;
        }
    }

    @Override
    public boolean isInInternationalSystem() {
        return unit == SpeedUnit.METER_PER_SECOND;
    }

    @Override
    public String getUnitSymbol() {
        return SPEED_SYMBOLS[unit.ordinal()];
    }

    @Deprecated
    protected static Speed getInstance() {
        if (!(instance instanceof Speed))
            instance = new Speed();
        return instance;
    }

    public enum SpeedUnit {
        KILOMETER_PER_SECOND,
        HECTOMETER_PER_SECOND,
        DECAMETER_PER_SECOND,
        METER_PER_SECOND,
        DECIMETER_PER_SECOND,
        CENTIMETER_PER_SECOND,
        MILLIMETER_PER_SECOND,
        KILOMETER_PER_MINUTE,
        HECTOMETER_PER_MINUTE,
        DECAMETER_PER_MINUTE,
        METER_PER_MINUTE,
        DECIMETER_PER_MINUTE,
        CENTIMETER_PER_MINUTE,
        MILLIMETER_PER_MINUTE,
        KILOMETER_PER_HOUR,
        HECTOMETER_PER_HOUR,
        DECAMETER_PER_HOUR,
        METER_PER_HOUR,
        DECIMETER_PER_HOUR,
        CENTIMETER_PER_HOUR,
        MILLIMETER_PER_HOUR,
    }
}
