package com.mjrfusion.code.physics.units;

import com.mjrfusion.code.physics.Physic;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static com.mjrfusion.code.physics.units.SquaredTime.*;

public class Acceleration extends Unit implements IAcceleration {
    @Deprecated
    private static Acceleration instance;
    private AccelerationUnit unit;

    protected static final BigDecimal[] ACCELERATION_SCALES = new BigDecimal[]
            {
                    divide(Length.LENGTH_SCALES[Length.LengthUnit.KILOMETER.ordinal()], SQUARED_TIME_SCALES[SquaredTime.SquaredTimeUnit.SQUARED_SECOND.ordinal()]),
                    divide(Length.LENGTH_SCALES[Length.LengthUnit.HECTOMETER.ordinal()], SQUARED_TIME_SCALES[SquaredTime.SquaredTimeUnit.SQUARED_SECOND.ordinal()]),
                    divide(Length.LENGTH_SCALES[Length.LengthUnit.DECAMETER.ordinal()], SQUARED_TIME_SCALES[SquaredTime.SquaredTimeUnit.SQUARED_SECOND.ordinal()]),
                    divide(Length.LENGTH_SCALES[Length.LengthUnit.METER.ordinal()], SQUARED_TIME_SCALES[SquaredTime.SquaredTimeUnit.SQUARED_SECOND.ordinal()]),
                    divide(Length.LENGTH_SCALES[Length.LengthUnit.DECIMETER.ordinal()], SQUARED_TIME_SCALES[SquaredTime.SquaredTimeUnit.SQUARED_SECOND.ordinal()]),
                    divide(Length.LENGTH_SCALES[Length.LengthUnit.CENTIMETER.ordinal()], SQUARED_TIME_SCALES[SquaredTime.SquaredTimeUnit.SQUARED_SECOND.ordinal()]),
                    divide(Length.LENGTH_SCALES[Length.LengthUnit.MILLIMETER.ordinal()], SQUARED_TIME_SCALES[SquaredTime.SquaredTimeUnit.SQUARED_SECOND.ordinal()]),

                    divide(Length.LENGTH_SCALES[Length.LengthUnit.KILOMETER.ordinal()], SQUARED_TIME_SCALES[SquaredTime.SquaredTimeUnit.SQUARED_MINUTE.ordinal()]),
                    divide(Length.LENGTH_SCALES[Length.LengthUnit.HECTOMETER.ordinal()], SQUARED_TIME_SCALES[SquaredTime.SquaredTimeUnit.SQUARED_MINUTE.ordinal()]),
                    divide(Length.LENGTH_SCALES[Length.LengthUnit.DECAMETER.ordinal()], SQUARED_TIME_SCALES[SquaredTime.SquaredTimeUnit.SQUARED_MINUTE.ordinal()]),
                    divide(Length.LENGTH_SCALES[Length.LengthUnit.METER.ordinal()], SQUARED_TIME_SCALES[SquaredTime.SquaredTimeUnit.SQUARED_MINUTE.ordinal()]),
                    divide(Length.LENGTH_SCALES[Length.LengthUnit.DECIMETER.ordinal()], SQUARED_TIME_SCALES[SquaredTime.SquaredTimeUnit.SQUARED_MINUTE.ordinal()]),
                    divide(Length.LENGTH_SCALES[Length.LengthUnit.CENTIMETER.ordinal()], SQUARED_TIME_SCALES[SquaredTime.SquaredTimeUnit.SQUARED_MINUTE.ordinal()]),
                    divide(Length.LENGTH_SCALES[Length.LengthUnit.MILLIMETER.ordinal()], SQUARED_TIME_SCALES[SquaredTime.SquaredTimeUnit.SQUARED_MINUTE.ordinal()]),

                    divide(Length.LENGTH_SCALES[Length.LengthUnit.KILOMETER.ordinal()], SQUARED_TIME_SCALES[SquaredTime.SquaredTimeUnit.SQUARED_HOUR.ordinal()]),
                    divide(Length.LENGTH_SCALES[Length.LengthUnit.HECTOMETER.ordinal()], SQUARED_TIME_SCALES[SquaredTime.SquaredTimeUnit.SQUARED_HOUR.ordinal()]),
                    divide(Length.LENGTH_SCALES[Length.LengthUnit.DECAMETER.ordinal()], SQUARED_TIME_SCALES[SquaredTime.SquaredTimeUnit.SQUARED_HOUR.ordinal()]),
                    divide(Length.LENGTH_SCALES[Length.LengthUnit.METER.ordinal()], SQUARED_TIME_SCALES[SquaredTime.SquaredTimeUnit.SQUARED_HOUR.ordinal()]),
                    divide(Length.LENGTH_SCALES[Length.LengthUnit.DECIMETER.ordinal()], SQUARED_TIME_SCALES[SquaredTime.SquaredTimeUnit.SQUARED_HOUR.ordinal()]),
                    divide(Length.LENGTH_SCALES[Length.LengthUnit.CENTIMETER.ordinal()], SQUARED_TIME_SCALES[SquaredTime.SquaredTimeUnit.SQUARED_HOUR.ordinal()]),
                    divide(Length.LENGTH_SCALES[Length.LengthUnit.MILLIMETER.ordinal()], SQUARED_TIME_SCALES[SquaredTime.SquaredTimeUnit.SQUARED_HOUR.ordinal()])
            };

    public static final String KILOMETER_PER_SQUARED_SECOND_SYMBOL = Length.KILOMETER_SYMBOL + "/" + SQUARED_SECOND_SYMBOL;
    public static final String HECTOMETER_PER_SQUARED_SECOND_SYMBOL = Length.HECTOMETER_SYMBOL + "/" + SQUARED_SECOND_SYMBOL;
    public static final String DECAMETER_PER_SQUARED_SECOND_SYMBOL = Length.DECAMETER_SYMBOL + "/" + SQUARED_SECOND_SYMBOL;
    public static final String METER_PER_SQUARED_SECOND_SYMBOL = Length.METER_SYMBOL + "/" + SQUARED_SECOND_SYMBOL;
    public static final String DECIMETER_PER_SQUARED_SECOND_SYMBOL = Length.DECIMETER_SYMBOL + "/" + SQUARED_SECOND_SYMBOL;
    public static final String CENTIMETER_PER_SQUARED_SECOND_SYMBOL = Length.CENTIMETER_SYMBOL + "/" + SQUARED_SECOND_SYMBOL;
    public static final String MILLIMETER_PER_SQUARED_SECOND_SYMBOL = Length.MILLIMETER_SYMBOL + "/" + SQUARED_SECOND_SYMBOL;

    public static final String KILOMETER_PER_SQUARED_MINUTE_SYMBOL = Length.KILOMETER_SYMBOL + "/" + SQUARED_MINUTE_SYMBOL;
    public static final String HECTOMETER_PER_SQUARED_MINUTE_SYMBOL = Length.HECTOMETER_SYMBOL + "/" + SQUARED_MINUTE_SYMBOL;
    public static final String DECAMETER_PER_SQUARED_MINUTE_SYMBOL = Length.DECAMETER_SYMBOL + "/" + SQUARED_MINUTE_SYMBOL;
    public static final String METER_PER_SQUARED_MINUTE_SYMBOL = Length.METER_SYMBOL + "/" + SQUARED_MINUTE_SYMBOL;
    public static final String DECIMETER_PER_SQUARED_MINUTE_SYMBOL = Length.DECIMETER_SYMBOL + "/" + SQUARED_MINUTE_SYMBOL;
    public static final String CENTIMETER_PER_SQUARED_MINUTE_SYMBOL = Length.CENTIMETER_SYMBOL + "/" + SQUARED_MINUTE_SYMBOL;
    public static final String MILLIMETER_PER_SQUARED_MINUTE_SYMBOL = Length.MILLIMETER_SYMBOL + "/" + SQUARED_MINUTE_SYMBOL;

    public static final String KILOMETER_PER_SQUARED_HOUR_SYMBOL = Length.KILOMETER_SYMBOL + "/" + SQUARED_HOUR_SYMBOL;
    public static final String HECTOMETER_PER_SQUARED_HOUR_SYMBOL = Length.HECTOMETER_SYMBOL + "/" + SQUARED_HOUR_SYMBOL;
    public static final String DECAMETER_PER_SQUARED_HOUR_SYMBOL = Length.DECAMETER_SYMBOL + "/" + SQUARED_HOUR_SYMBOL;
    public static final String METER_PER_SQUARED_HOUR_SYMBOL = Length.METER_SYMBOL + "/" + SQUARED_HOUR_SYMBOL;
    public static final String DECIMETER_PER_SQUARED_HOUR_SYMBOL = Length.DECIMETER_SYMBOL + "/" + SQUARED_HOUR_SYMBOL;
    public static final String CENTIMETER_PER_SQUARED_HOUR_SYMBOL = Length.CENTIMETER_SYMBOL + "/" + SQUARED_HOUR_SYMBOL;
    public static final String MILLIMETER_PER_SQUARED_HOUR_SYMBOL = Length.MILLIMETER_SYMBOL + "/" + SQUARED_HOUR_SYMBOL;

    private final String[] ACCELERATION_SYMBOLS = new String[]{
            KILOMETER_PER_SQUARED_SECOND_SYMBOL,
            HECTOMETER_PER_SQUARED_SECOND_SYMBOL,
            DECAMETER_PER_SQUARED_SECOND_SYMBOL,
            METER_PER_SQUARED_SECOND_SYMBOL,
            DECIMETER_PER_SQUARED_SECOND_SYMBOL,
            CENTIMETER_PER_SQUARED_SECOND_SYMBOL,
            MILLIMETER_PER_SQUARED_SECOND_SYMBOL,

            KILOMETER_PER_SQUARED_MINUTE_SYMBOL,
            HECTOMETER_PER_SQUARED_MINUTE_SYMBOL,
            DECAMETER_PER_SQUARED_MINUTE_SYMBOL,
            METER_PER_SQUARED_MINUTE_SYMBOL,
            DECIMETER_PER_SQUARED_MINUTE_SYMBOL,
            CENTIMETER_PER_SQUARED_MINUTE_SYMBOL,
            MILLIMETER_PER_SQUARED_MINUTE_SYMBOL,

            KILOMETER_PER_SQUARED_HOUR_SYMBOL,
            HECTOMETER_PER_SQUARED_HOUR_SYMBOL,
            DECAMETER_PER_SQUARED_HOUR_SYMBOL,
            METER_PER_SQUARED_HOUR_SYMBOL,
            DECIMETER_PER_SQUARED_HOUR_SYMBOL,
            CENTIMETER_PER_SQUARED_HOUR_SYMBOL,
            MILLIMETER_PER_SQUARED_HOUR_SYMBOL
    };

    public Acceleration() {
        super();
       unit = AccelerationUnit.METER_PER_SQUARED_SECOND;
        value = value.setScale(Physic.ROUND_SCALE, RoundingMode.HALF_UP);
    }

    public Acceleration(double value) {
        super(value);
       unit = AccelerationUnit.METER_PER_SQUARED_SECOND;
        this.value = this.value.setScale(Physic.ROUND_SCALE, RoundingMode.HALF_UP);
    }

    public Acceleration(String value) {
        super(value);
       unit = AccelerationUnit.METER_PER_SQUARED_SECOND;
        this.value = this.value.setScale(Physic.ROUND_SCALE, RoundingMode.HALF_UP);
    }

    public Acceleration(long value) {
        super(value);
       unit = AccelerationUnit.METER_PER_SQUARED_SECOND;
        this.value = this.value.setScale(Physic.ROUND_SCALE, RoundingMode.HALF_UP);
    }

    public Acceleration(BigDecimal value) {
        super(value);
       unit = AccelerationUnit.METER_PER_SQUARED_SECOND;
        this.value = this.value.setScale(Physic.ROUND_SCALE, RoundingMode.HALF_UP);
    }

    public Acceleration(double value, AccelerationUnit unit) {
        super(value);
        this.unit = unit;
        this.value = this.value.setScale(Physic.ROUND_SCALE, RoundingMode.HALF_UP);
    }

    public Acceleration(String value, AccelerationUnit unit) {
        super(value);
        this.unit = unit;
        this.value = this.value.setScale(Physic.ROUND_SCALE, RoundingMode.HALF_UP);
    }

    public Acceleration(long value, AccelerationUnit unit) throws IllegalArgumentException {
        super(value);
        this.unit = unit;
        this.value = this.value.setScale(Physic.ROUND_SCALE, RoundingMode.HALF_UP);
    }

    public Acceleration(BigDecimal value, AccelerationUnit unit) throws IllegalArgumentException {
        super(value);
        this.unit = unit;
        this.value = this.value.setScale(Physic.ROUND_SCALE, RoundingMode.HALF_UP);
    }

    @Contract("_, _ -> new")
    public static @NotNull Acceleration toKilometerPerSquaredSecond(double value, @NotNull AccelerationUnit unit) {
        return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit.ordinal()]), ACCELERATION_SCALES[AccelerationUnit.KILOMETER_PER_SQUARED_SECOND.ordinal()]));
    }

    @Contract("_, _ -> new")
    public static @NotNull Acceleration toHectometerPerSquaredSecond(double value, @NotNull AccelerationUnit unit) throws IllegalArgumentException {
        return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit.ordinal()]), ACCELERATION_SCALES[AccelerationUnit.HECTOMETER_PER_SQUARED_SECOND.ordinal()]));
    }

    @Contract("_, _ -> new")
    public static @NotNull Acceleration toDecameterPerSquaredSecond(double value, @NotNull AccelerationUnit unit) throws IllegalArgumentException {
        return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit.ordinal()]), ACCELERATION_SCALES[AccelerationUnit.DECAMETER_PER_SQUARED_SECOND.ordinal()]));
    }

    @Contract("_, _ -> new")
    public static @NotNull Acceleration toMeterPerSquaredSecond(double value, @NotNull AccelerationUnit unit) throws IllegalArgumentException {
        return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit.ordinal()]), ACCELERATION_SCALES[AccelerationUnit.METER_PER_SQUARED_SECOND.ordinal()]));
    }

    @Contract("_, _ -> new")
    public static @NotNull Acceleration toDecimeterPerSquaredSecond(double value, @NotNull AccelerationUnit unit) throws IllegalArgumentException {
        return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit.ordinal()]), ACCELERATION_SCALES[AccelerationUnit.DECIMETER_PER_SQUARED_SECOND.ordinal()]));
    }

    @Contract("_, _ -> new")
    public static @NotNull Acceleration toCentimeterPerSquaredSecond(double value, @NotNull AccelerationUnit unit) throws IllegalArgumentException {
        return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit.ordinal()]), ACCELERATION_SCALES[AccelerationUnit.CENTIMETER_PER_SQUARED_SECOND.ordinal()]));
    }

    @Contract("_, _ -> new")
    public static @NotNull Acceleration toMillimeterPerSquaredSecond(double value, @NotNull AccelerationUnit unit) throws IllegalArgumentException {
        return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit.ordinal()]), ACCELERATION_SCALES[AccelerationUnit.MILLIMETER_PER_SQUARED_SECOND.ordinal()]));
    }

    @Contract("_, _ -> new")
    public static @NotNull Acceleration toKilometerPerSquaredMinute(double value, @NotNull AccelerationUnit unit) throws IllegalArgumentException {
        return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit.ordinal()]), ACCELERATION_SCALES[AccelerationUnit.KILOMETER_PER_SQUARED_MINUTE.ordinal()]));
    }

    @Contract("_, _ -> new")
    public static @NotNull Acceleration toHectometerPerSquaredMinute(double value, @NotNull AccelerationUnit unit) throws IllegalArgumentException {
        return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit.ordinal()]), ACCELERATION_SCALES[AccelerationUnit.HECTOMETER_PER_SQUARED_MINUTE.ordinal()]));
    }

    @Contract("_, _ -> new")
    public static @NotNull Acceleration toDecameterPerSquaredMinute(double value, @NotNull AccelerationUnit unit) throws IllegalArgumentException {
        return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit.ordinal()]), ACCELERATION_SCALES[AccelerationUnit.DECAMETER_PER_SQUARED_MINUTE.ordinal()]));
    }

    @Contract("_, _ -> new")
    public static @NotNull Acceleration toMeterPerSquaredMinute(double value, @NotNull AccelerationUnit unit) throws IllegalArgumentException {
        return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit.ordinal()]), ACCELERATION_SCALES[AccelerationUnit.METER_PER_SQUARED_MINUTE.ordinal()]));
    }

    @Contract("_, _ -> new")
    public static @NotNull Acceleration toDecimeterPerSquaredMinute(double value, @NotNull AccelerationUnit unit) throws IllegalArgumentException {
        return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit.ordinal()]), ACCELERATION_SCALES[AccelerationUnit.DECIMETER_PER_SQUARED_MINUTE.ordinal()]));
    }

    @Contract("_, _ -> new")
    public static @NotNull Acceleration toCentimeterPerSquaredMinute(double value, @NotNull AccelerationUnit unit) throws IllegalArgumentException {
        return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit.ordinal()]), ACCELERATION_SCALES[AccelerationUnit.CENTIMETER_PER_SQUARED_MINUTE.ordinal()]));
    }

    @Contract("_, _ -> new")
    public static @NotNull Acceleration toMillimeterPerSquaredMinute(double value, @NotNull AccelerationUnit unit) throws IllegalArgumentException {
        return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit.ordinal()]), ACCELERATION_SCALES[AccelerationUnit.MILLIMETER_PER_SQUARED_MINUTE.ordinal()]));
    }

    @Contract("_, _ -> new")
    public static @NotNull Acceleration toKilometerPerSquaredHour(double value, @NotNull AccelerationUnit unit) throws IllegalArgumentException {
        return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit.ordinal()]), ACCELERATION_SCALES[AccelerationUnit.KILOMETER_PER_SQUARED_HOUR.ordinal()]));
    }

    @Contract("_, _ -> new")
    public static @NotNull Acceleration toHectometerPerSquaredHour(double value, @NotNull AccelerationUnit unit) throws IllegalArgumentException {
        return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit.ordinal()]), ACCELERATION_SCALES[AccelerationUnit.HECTOMETER_PER_SQUARED_HOUR.ordinal()]));
    }

    @Contract("_, _ -> new")
    public static @NotNull Acceleration toDecameterPerSquaredHour(double value, @NotNull AccelerationUnit unit) throws IllegalArgumentException {
        return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit.ordinal()]), ACCELERATION_SCALES[AccelerationUnit.DECAMETER_PER_SQUARED_HOUR.ordinal()]));
    }

    @Contract("_, _ -> new")
    public static @NotNull Acceleration toMeterPerSquaredHour(double value, @NotNull AccelerationUnit unit) throws IllegalArgumentException {
        return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit.ordinal()]), ACCELERATION_SCALES[AccelerationUnit.METER_PER_SQUARED_HOUR.ordinal()]));
    }

    @Contract("_, _ -> new")
    public static @NotNull Acceleration toDecimeterPerSquaredHour(double value, @NotNull AccelerationUnit unit) throws IllegalArgumentException {
        return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit.ordinal()]), ACCELERATION_SCALES[AccelerationUnit.DECIMETER_PER_SQUARED_HOUR.ordinal()]));
    }

    @Contract("_, _ -> new")
    public static @NotNull Acceleration toCentimeterPerSquaredHour(double value, @NotNull AccelerationUnit unit) throws IllegalArgumentException {
        return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit.ordinal()]), ACCELERATION_SCALES[AccelerationUnit.CENTIMETER_PER_SQUARED_HOUR.ordinal()]));
    }

    @Contract("_, _ -> new")
    public static @NotNull Acceleration toMillimeterPerSquaredHour(double value, @NotNull AccelerationUnit unit) throws IllegalArgumentException {
        return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit.ordinal()]), ACCELERATION_SCALES[AccelerationUnit.MILLIMETER_PER_SQUARED_HOUR.ordinal()]));
    }

    @Override
    public Acceleration toKilometerPerSquaredSecond() {
        return null;
    }

    @Override
    public Acceleration toHectometerPerSquaredSecond() {
        return null;
    }

    @Override
    public Acceleration toDecameterPerSquaredSecond() {
        return null;
    }

    @Override
    public Acceleration toMeterPerSquaredSecond() {
        return null;
    }

    @Override
    public Acceleration toDecimeterPerSquaredSecond() {
        return null;
    }

    @Override
    public Acceleration toCentimeterPerSquaredSecond() {
        return null;
    }

    @Override
    public Acceleration toMillimeterPerSquaredSecond() {
        return null;
    }

    @Override
    public Acceleration toKilometerPerSquaredMinute() {
        return null;
    }

    @Override
    public Acceleration toHectometerPerSquaredMinute() {
        return null;
    }

    @Override
    public Acceleration toDecameterPerSquaredMinute() {
        return null;
    }

    @Override
    public Acceleration toMeterPerSquaredMinute() {
        return null;
    }

    @Override
    public Acceleration toDecimeterPerSquaredMinute() {
        return null;
    }

    @Override
    public Acceleration toCentimeterPerSquaredMinute() {
        return null;
    }

    @Override
    public Acceleration toMillimeterPerSquaredMinute() {
        return null;
    }

    @Override
    public Acceleration toKilometerPerSquaredHour() {
        return null;
    }

    @Override
    public Acceleration toHectometerPerSquaredHour() {
        return null;
    }

    @Override
    public Acceleration toDecameterPerSquaredHour() {
        return null;
    }

    @Override
    public Acceleration toMeterPerSquaredHour() {
        return null;
    }

    @Override
    public Acceleration toDecimeterPerSquaredHour() {
        return null;
    }

    @Override
    public Acceleration toCentimeterPerSquaredHour() {
        return null;
    }

    @Override
    public Acceleration toMillimeterPerSquaredHour() {
        return null;
    }

    @Override
    public String toString() {
        return value + ACCELERATION_SYMBOLS[unit.ordinal()];
    }

    @Override
    public boolean isInInternationalSystem() {
        return unit == AccelerationUnit.METER_PER_SQUARED_SECOND;
    }

    @Override
    public String getUnitSymbol() {
        return ACCELERATION_SYMBOLS[unit.ordinal()];
    }

    @Deprecated
    protected Acceleration getInstance() {
        if (instance == null)
            instance = new Acceleration();
        return instance;
    }

    public enum AccelerationUnit {
        KILOMETER_PER_SQUARED_SECOND,
        HECTOMETER_PER_SQUARED_SECOND,
        DECAMETER_PER_SQUARED_SECOND,
        METER_PER_SQUARED_SECOND,
        DECIMETER_PER_SQUARED_SECOND,
        CENTIMETER_PER_SQUARED_SECOND,
        MILLIMETER_PER_SQUARED_SECOND,
        KILOMETER_PER_SQUARED_MINUTE,
        HECTOMETER_PER_SQUARED_MINUTE,
        DECAMETER_PER_SQUARED_MINUTE,
        METER_PER_SQUARED_MINUTE,
        DECIMETER_PER_SQUARED_MINUTE,
        CENTIMETER_PER_SQUARED_MINUTE,
        MILLIMETER_PER_SQUARED_MINUTE,
        KILOMETER_PER_SQUARED_HOUR,
        HECTOMETER_PER_SQUARED_HOUR,
        DECAMETER_PER_SQUARED_HOUR,
        METER_PER_SQUARED_HOUR,
        DECIMETER_PER_SQUARED_HOUR,
        CENTIMETER_PER_SQUARED_HOUR,
        MILLIMETER_PER_SQUARED_HOUR,
    }
}
