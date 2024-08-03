package com.mjrfusion.code.physics.units;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

public class Area extends Unit implements IArea {
    @Deprecated
    private static Area instance;
    private AreaUnit unit;

    protected static final BigDecimal[] AREA_SCALES = new BigDecimal[]{
            Length.LENGTH_SCALES[Length.LengthUnit.KILOMETER.ordinal()].pow(2),
            Length.LENGTH_SCALES[Length.LengthUnit.HECTOMETER.ordinal()].pow(2),
            Length.LENGTH_SCALES[Length.LengthUnit.DECAMETER.ordinal()].pow(2),
            Length.LENGTH_SCALES[Length.LengthUnit.METER.ordinal()].pow(2),
            Length.LENGTH_SCALES[Length.LengthUnit.DECIMETER.ordinal()].pow(2),
            Length.LENGTH_SCALES[Length.LengthUnit.CENTIMETER.ordinal()].pow(2),
            Length.LENGTH_SCALES[Length.LengthUnit.MILLIMETER.ordinal()].pow(2)
    };

    public static final String SQUARED_KILOMETER_SYMBOL = Length.KILOMETER_SYMBOL + "²";
    public static final String SQUARED_HECTOMETER_SYMBOL = Length.HECTOMETER_SYMBOL + "²";
    public static final String SQUARED_DECAMETER_SYMBOL = Length.DECAMETER_SYMBOL + "²";
    public static final String SQUARED_METER_SYMBOL = Length.METER_SYMBOL + "²";
    public static final String SQUARED_DECIMETER_SYMBOL = Length.DECIMETER_SYMBOL + "²";
    public static final String SQUARED_CENTIMETER_SYMBOL = Length.CENTIMETER_SYMBOL + "²";
    public static final String SQUARED_MILLIMETER_SYMBOL = Length.MILLIMETER_SYMBOL + "²";

    protected final String[] AREA_SYMBOLS = new String[]{
            SQUARED_KILOMETER_SYMBOL,
            SQUARED_HECTOMETER_SYMBOL,
            SQUARED_DECAMETER_SYMBOL,
            SQUARED_METER_SYMBOL,
            SQUARED_DECIMETER_SYMBOL,
            SQUARED_CENTIMETER_SYMBOL,
            SQUARED_MILLIMETER_SYMBOL
    };

    public Area() {
        super();
        unit = AreaUnit.SQUARED_METER;
    }

    public Area(double value) {
        super(value);
        unit = AreaUnit.SQUARED_METER;
    }

    public Area(String value) {
        super(value);
        unit = AreaUnit.SQUARED_METER;
    }

    public Area(long value) {
        super(value);
        unit = AreaUnit.SQUARED_METER;
    }

    public Area(BigDecimal value) {
        super(value);
        unit = AreaUnit.SQUARED_METER;
    }

    public Area(double value, AreaUnit unit) {
        super(value);
        this.unit = unit;
    }

    public Area(String value, AreaUnit unit) {
        super(value);
        this.unit = unit;
    }

    public Area(long value, AreaUnit unit) {
        super(value);
        this.unit = unit;
    }

    public Area(BigDecimal value, AreaUnit unit) {
        super(value);
        this.unit = unit;
    }

    @Contract("_, _ -> new")
    public static @NotNull Area toSquaredKilometer(double value, @NotNull AreaUnit unit) {
        return new Area(divide(multiply(value, AREA_SCALES[AreaUnit.SQUARED_KILOMETER.ordinal()]), AREA_SCALES[unit.ordinal()]), AreaUnit.SQUARED_KILOMETER);
    }

    @Contract("_, _ -> new")
    public static @NotNull Area toSquaredHectometer(double value, @NotNull AreaUnit unit) {
        return new Area(divide(multiply(value, AREA_SCALES[AreaUnit.SQUARED_HECTOMETER.ordinal()]), AREA_SCALES[unit.ordinal()]), AreaUnit.SQUARED_HECTOMETER);
    }

    @Contract("_, _ -> new")
    public static @NotNull Area toSquaredDecameter(double value, @NotNull AreaUnit unit) {
        return new Area(divide(multiply(value, AREA_SCALES[AreaUnit.SQUARED_DECAMETER.ordinal()]), AREA_SCALES[unit.ordinal()]), AreaUnit.SQUARED_DECAMETER);
    }

    @Contract("_, _ -> new")
    public static @NotNull Area toSquaredMeter(double value, @NotNull AreaUnit unit) {
        return new Area(divide(multiply(value, AREA_SCALES[AreaUnit.SQUARED_METER.ordinal()]), AREA_SCALES[unit.ordinal()]), AreaUnit.SQUARED_METER);
    }

    @Contract("_, _ -> new")
    public static @NotNull Area toSquaredDecimeter(double value, @NotNull AreaUnit unit) {
        return new Area(divide(multiply(value, AREA_SCALES[AreaUnit.SQUARED_DECIMETER.ordinal()]), AREA_SCALES[unit.ordinal()]), AreaUnit.SQUARED_DECIMETER);
    }

    @Contract("_, _ -> new")
    public static @NotNull Area toSquaredCentimeter(double value, @NotNull AreaUnit unit) {
        return new Area(divide(multiply(value, AREA_SCALES[AreaUnit.SQUARED_CENTIMETER.ordinal()]), AREA_SCALES[unit.ordinal()]), AreaUnit.SQUARED_CENTIMETER);
    }

    @Contract("_, _ -> new")
    public static @NotNull Area toSquaredMillimeter(double value, @NotNull AreaUnit unit) {
        return new Area(divide(multiply(value, AREA_SCALES[AreaUnit.SQUARED_MILLIMETER.ordinal()]), AREA_SCALES[unit.ordinal()]), AreaUnit.SQUARED_MILLIMETER);
    }

    @Override
    public Area toSquaredKilometer() {
        return null;
    }

    @Override
    public Area toSquaredHectometer() {
        return null;
    }

    @Override
    public Area toSquaredDecameter() {
        return null;
    }

    @Override
    public Area toSquaredMeter() {
        return null;
    }

    @Override
    public Area toSquaredDecimeter() {
        return null;
    }

    @Override
    public Area toSquaredCentimeter() {
        return null;
    }

    @Override
    public Area toSquaredMillimeter() {
        return null;
    }

    @Override
    public String toString() {
        return value + AREA_SYMBOLS[unit.ordinal()];
    }

    @Override
    public boolean equals(Object object) {
        try {
            Area area = (Area) object;
            return (area.toString().equals(toString()));
        } catch (ClassCastException e) {
            return false;
        }
    }

    @Override
    public boolean isInInternationalSystem() {
        return unit == AreaUnit.SQUARED_METER;
    }

    @Override
    public String getUnitSymbol() {
        return AREA_SYMBOLS[unit.ordinal()];
    }

    @Deprecated
    protected static Area getInstance() {
        if (instance == null)
            instance = new Area();
        return instance;
    }

    public enum AreaUnit {
        SQUARED_KILOMETER,
        SQUARED_HECTOMETER,
        SQUARED_DECAMETER,
        SQUARED_METER,
        SQUARED_DECIMETER,
        SQUARED_CENTIMETER,
        SQUARED_MILLIMETER
    }
}
