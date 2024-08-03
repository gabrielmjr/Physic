package com.mjrfusion.code.physics.units;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

public class Length extends Unit implements ILength {
    @Deprecated
    private static Length instance;
    private LengthUnit unit;

    protected static final BigDecimal[] LENGTH_SCALES = new BigDecimal[]{
            BigDecimal.valueOf(1.0),
            BigDecimal.valueOf(10.0),
            BigDecimal.valueOf(100.0),
            BigDecimal.valueOf(1000.0),
            BigDecimal.valueOf(10000.0),
            BigDecimal.valueOf(100000.0),
            BigDecimal.valueOf(1000000.0)
    };

    public static final String KILOMETER_SYMBOL = "km";
    public static final String HECTOMETER_SYMBOL = "hm";
    public static final String DECAMETER_SYMBOL = "dam";
    public static final String METER_SYMBOL = "m";
    public static final String DECIMETER_SYMBOL = "dm";
    public static final String CENTIMETER_SYMBOL = "cm";
    public static final String MILLIMETER_SYMBOL = "mm";

    protected final String[] LENGTH_SYMBOLS = new String[]{KILOMETER_SYMBOL, HECTOMETER_SYMBOL, DECAMETER_SYMBOL, METER_SYMBOL, DECIMETER_SYMBOL, CENTIMETER_SYMBOL, MILLIMETER_SYMBOL};

    public Length() {
        super();
        unit = LengthUnit.METER;
    }

    public Length(double value) {
        super(value);
        unit = LengthUnit.METER;
    }

    public Length(String value) {
        super(value);
        unit = LengthUnit.METER;
    }

    public Length(long value) {
        super(value);
        unit = LengthUnit.METER;
    }

    public Length(BigDecimal value) {
        super(value);
        unit = LengthUnit.METER;
    }

    public Length(double value, LengthUnit unit) {
        super(value);
        this.unit = unit;
    }

    public Length(String value, LengthUnit unit) {
        super(value);
        this.unit = unit;
    }

    public Length(long value, LengthUnit unit) {
        super(value);
        this.unit = unit;
    }

    public Length(BigDecimal value, LengthUnit unit) {
        super(value);
        this.unit = unit;
    }

    @Contract("_, _ -> new")
    public static @NotNull Length toKilometer(double value, @NotNull LengthUnit unit) {
        return new Length(divide(multiply(value, LENGTH_SCALES[LengthUnit.KILOMETER.ordinal()]), LENGTH_SCALES[unit.ordinal()]), LengthUnit.KILOMETER);
    }

    @Contract("_, _ -> new")
    public static @NotNull Length toHectometer(double value, @NotNull LengthUnit unit) {
        return new Length(divide(multiply(value, LENGTH_SCALES[LengthUnit.HECTOMETER.ordinal()]), LENGTH_SCALES[unit.ordinal()]), LengthUnit.HECTOMETER);
    }

    @Contract("_, _ -> new")
    public static @NotNull Length toDecameter(double value, @NotNull LengthUnit unit) {
        return new Length(divide(multiply(value, LENGTH_SCALES[LengthUnit.DECAMETER.ordinal()]), LENGTH_SCALES[unit.ordinal()]), LengthUnit.DECAMETER);
    }

    @Contract("_, _ -> new")
    public static @NotNull Length toMeter(double value, @NotNull LengthUnit unit) {
        return new Length(divide(multiply(value, LENGTH_SCALES[LengthUnit.METER.ordinal()]), LENGTH_SCALES[unit.ordinal()]), LengthUnit.METER);
    }

    @Contract("_, _ -> new")
    public static @NotNull Length toDecimeter(double value, @NotNull LengthUnit unit) {
        return new Length(divide(multiply(value, LENGTH_SCALES[LengthUnit.DECIMETER.ordinal()]), LENGTH_SCALES[unit.ordinal()]), LengthUnit.DECIMETER);
    }

    @Contract("_, _ -> new")
    public static @NotNull Length toCentimeter(double value, @NotNull LengthUnit unit) {
        return new Length(divide(multiply(value, LENGTH_SCALES[LengthUnit.CENTIMETER.ordinal()]), LENGTH_SCALES[unit.ordinal()]), LengthUnit.CENTIMETER);
    }

    @Contract("_, _ -> new")
    public static @NotNull Length toMillimeter(double value, @NotNull LengthUnit unit) {
        return new Length(divide(multiply(value, LENGTH_SCALES[LengthUnit.MILLIMETER.ordinal()]), LENGTH_SCALES[unit.ordinal()]), LengthUnit.MILLIMETER);
    }

    @Override
    public Length toKilometer() {
        value = divide(multiply(value, LENGTH_SCALES[LengthUnit.KILOMETER.ordinal()]), LENGTH_SCALES[unit.ordinal()]);
        unit = LengthUnit.KILOMETER;
        return this;
    }

    @Override
    public Length toHectometer() {
        value = divide(multiply(value, LENGTH_SCALES[LengthUnit.HECTOMETER.ordinal()]), LENGTH_SCALES[unit.ordinal()]);
        unit = LengthUnit.HECTOMETER;
        return this;
    }

    @Override
    public Length toDecameter() {
        value = divide(multiply(value, LENGTH_SCALES[LengthUnit.DECAMETER.ordinal()]), LENGTH_SCALES[unit.ordinal()]);
        unit = LengthUnit.DECAMETER;
        return this;
    }

    @Override
    public Length toMeter() {
        value = divide(multiply(value, LENGTH_SCALES[LengthUnit.METER.ordinal()]), LENGTH_SCALES[unit.ordinal()]);
        unit = LengthUnit.METER;
        return this;
    }

    @Override
    public Length toDecimeter() {
        value = divide(multiply(value, LENGTH_SCALES[LengthUnit.DECIMETER.ordinal()]), LENGTH_SCALES[unit.ordinal()]);
        unit = LengthUnit.DECIMETER;
        return this;
    }

    @Override
    public Length toCentimeter() {
        value = divide(multiply(value, LENGTH_SCALES[LengthUnit.CENTIMETER.ordinal()]), LENGTH_SCALES[unit.ordinal()]);
        unit = LengthUnit.CENTIMETER;
        return this;
    }

    @Override
    public Length toMillimeter() {
        value = divide(multiply(value, LENGTH_SCALES[LengthUnit.MILLIMETER.ordinal()]), LENGTH_SCALES[unit.ordinal()]);
        unit = LengthUnit.MILLIMETER;
        return this;
    }

    @Override
    public String toString() {
        return value + LENGTH_SYMBOLS[unit.ordinal()];
    }

    @Override
    public boolean equals(Object object) {
        try {
            Length length = (Length) object;
            return length.toString().equals(toString());
        } catch (ClassCastException e) {
            return false;
        }
    }

    @Override
    public boolean isInInternationalSystem() {
        return unit == LengthUnit.METER;
    }

    @Override
    public String getUnitSymbol() {
        return LENGTH_SYMBOLS[unit.ordinal()];
    }

    @Deprecated
    protected static Length getInstance() {
        if (instance == null) instance = new Length();
        return instance;
    }

    public enum LengthUnit {
        KILOMETER,
        HECTOMETER,
        DECAMETER,
        METER,
        DECIMETER,
        CENTIMETER,
        MILLIMETER
    }
}
