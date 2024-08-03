package com.mjrfusion.code.physics.units;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

public class Volume extends Unit implements IVolume {
    @Deprecated
    private static Volume instance;
    private VolumeUnit unit;

    protected static final BigDecimal[] VOLUME_SCALES = new BigDecimal[]
            {
                    Length.LENGTH_SCALES[Length.LengthUnit.KILOMETER.ordinal()].pow(3),
                    Length.LENGTH_SCALES[Length.LengthUnit.HECTOMETER.ordinal()].pow(3),
                    Length.LENGTH_SCALES[Length.LengthUnit.DECAMETER.ordinal()].pow(3),
                    Length.LENGTH_SCALES[Length.LengthUnit.METER.ordinal()].pow(3),
                    Length.LENGTH_SCALES[Length.LengthUnit.DECIMETER.ordinal()].pow(3),
                    Length.LENGTH_SCALES[Length.LengthUnit.CENTIMETER.ordinal()].pow(3),
                    Length.LENGTH_SCALES[Length.LengthUnit.MILLIMETER.ordinal()].pow(3)
            };

    public static final String CUBED_KILOMETER_SYMBOL = Length.KILOMETER_SYMBOL + "³";
    public static final String CUBED_HECTOMETER_SYMBOL = Length.HECTOMETER_SYMBOL + "³";
    public static final String CUBED_DECAMETER_SYMBOL = Length.DECAMETER_SYMBOL + "³";
    public static final String CUBED_METER_SYMBOL = Length.METER_SYMBOL + "³";
    public static final String CUBED_DECIMETER_SYMBOL = Length.DECIMETER_SYMBOL + "³";
    public static final String CUBED_CENTIMETER_SYMBOL = Length.CENTIMETER_SYMBOL + "³";
    public static final String CUBED_MILLIMETER_SYMBOL = Length.MILLIMETER_SYMBOL + "³";

    protected final String[] VOLUME_SYMBOLS = new String[]{
            CUBED_KILOMETER_SYMBOL,
            CUBED_HECTOMETER_SYMBOL,
            CUBED_DECAMETER_SYMBOL,
            CUBED_METER_SYMBOL,
            CUBED_DECIMETER_SYMBOL,
            CUBED_CENTIMETER_SYMBOL,
            CUBED_MILLIMETER_SYMBOL
    };

    public Volume() {
        super();
        unit = VolumeUnit.CUBED_METER;
    }

    public Volume(double value) {
        super(value);
        unit = VolumeUnit.CUBED_METER;
    }

    public Volume(String value) {
        super(value);
        unit = VolumeUnit.CUBED_METER;
    }

    public Volume(long value) {
        super(value);
        unit = VolumeUnit.CUBED_METER;
    }

    public Volume(BigDecimal value) {
        super(value);
        unit = VolumeUnit.CUBED_METER;
    }

    public Volume(double value, VolumeUnit unit) {
        super(value);
        this.unit = unit;
    }

    public Volume(String value, VolumeUnit unit) {
        super(value);
        this.unit = unit;
    }

    public Volume(long value, VolumeUnit unit) {
        super(value);
        this.unit = unit;
    }

    public Volume(BigDecimal value, VolumeUnit unit) {
        super(value);
        this.unit = unit;
    }

    @Contract("_, _ -> new")
    public static @NotNull Volume toCubedKilometer(double value, @NotNull VolumeUnit unit) {
        return new Volume(divide(multiply(value, VOLUME_SCALES[VolumeUnit.CUBED_KILOMETER.ordinal()]), VOLUME_SCALES[unit.ordinal()]), VolumeUnit.CUBED_KILOMETER);
    }

    @Contract("_, _ -> new")
    public static @NotNull Volume toCubedHectometer(double value, @NotNull VolumeUnit unit) {
        return new Volume(divide(multiply(value, VOLUME_SCALES[VolumeUnit.CUBED_HECTOMETER.ordinal()]), VOLUME_SCALES[unit.ordinal()]), VolumeUnit.CUBED_HECTOMETER);
    }

    @Contract("_, _ -> new")
    public static @NotNull Volume toCubedDecameter(double value, @NotNull VolumeUnit unit) {
        return new Volume(divide(multiply(value, VOLUME_SCALES[VolumeUnit.CUBED_DECAMETER.ordinal()]), VOLUME_SCALES[unit.ordinal()]), VolumeUnit.CUBED_DECAMETER);
    }

    @Contract("_, _ -> new")
    public static @NotNull Volume toCubedMeter(double value, @NotNull VolumeUnit unit) {
        return new Volume(divide(multiply(value, VOLUME_SCALES[VolumeUnit.CUBED_METER.ordinal()]), VOLUME_SCALES[unit.ordinal()]), VolumeUnit.CUBED_METER);
    }

    @Contract("_, _ -> new")
    public static @NotNull Volume toCubedDecimeter(double value, @NotNull VolumeUnit unit) {
        return new Volume(divide(multiply(value, VOLUME_SCALES[VolumeUnit.CUBED_DECIMETER.ordinal()]), VOLUME_SCALES[unit.ordinal()]), VolumeUnit.CUBED_DECIMETER);
    }

    @Contract("_, _ -> new")
    public static @NotNull Volume toCubedCentimeter(double value, @NotNull VolumeUnit unit) {
        return new Volume(divide(multiply(value, VOLUME_SCALES[VolumeUnit.CUBED_CENTIMETER.ordinal()]), VOLUME_SCALES[unit.ordinal()]), VolumeUnit.CUBED_CENTIMETER);
    }

    @Contract("_, _ -> new")
    public static @NotNull Volume toCubedMillimeter(double value, @NotNull VolumeUnit unit) {
        return new Volume(divide(multiply(value, VOLUME_SCALES[VolumeUnit.CUBED_MILLIMETER.ordinal()]), VOLUME_SCALES[unit.ordinal()]), VolumeUnit.CUBED_MILLIMETER);
    }

    @Override
    public Volume toCubedKilometer() {
        return null;
    }

    @Override
    public Volume toCubedHectometer() {
        return null;
    }

    @Override
    public Volume toCubedDecameter() {
        return null;
    }

    @Override
    public Volume toCubedMeter() {
        return null;
    }

    @Override
    public Volume toCubedDecimeter() {
        return null;
    }

    @Override
    public Volume toCubedCentimeter() {
        return null;
    }

    @Override
    public Volume toCubedMillimeter() {
        return null;
    }

    @Override
    public String toString() {
        return value + VOLUME_SYMBOLS[unit.ordinal()];
    }

    @Override
    public boolean equals(Object object) {
        try {
            Volume volume = (Volume) object;
            return volume.toString().equals(toString());
        } catch (ClassCastException e) {
            return false;
        }
    }

    @Override
    public boolean isInInternationalSystem() {
        return unit == VolumeUnit.CUBED_METER;
    }

    @Override
    public String getUnitSymbol() {
        return VOLUME_SYMBOLS[unit.ordinal()];
    }

    @Deprecated
    protected static Volume getInstance() {
        if (instance == null)
            instance = new Volume();
        return instance;
    }

    public enum VolumeUnit {
        CUBED_KILOMETER,
        CUBED_HECTOMETER,
        CUBED_DECAMETER,
        CUBED_METER,
        CUBED_DECIMETER,
        CUBED_CENTIMETER,
        CUBED_MILLIMETER
    }
}
