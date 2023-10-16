package com.mjr.code.physics.units;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

public class Length extends Unit implements ILength { 
    @Deprecated
	private static Length instance;

    public static final int KILOMETER = 0;
    public static final int HECTOMETER = 1;
    public static final int DECAMETER = 2;
    public static final int METER = 3;
    public static final int DECIMETER = 4;
    public static final int CENTIMETER = 5;
    public static final int MILLIMETER = 6;

    private final int MAX_UNIT_SCALE = 6;
    protected static final int LAST_UNIT_CONS = MILLIMETER;

    protected static final BigDecimal[] LENGTH_SCALES = new BigDecimal[]
    {
        BigDecimal.valueOf(1.0),
        BigDecimal.valueOf(0.1),
        BigDecimal.valueOf(0.01),
        BigDecimal.valueOf(0.001),
        BigDecimal.valueOf(0.0001),
        BigDecimal.valueOf(0.00001),
        BigDecimal.valueOf(0.000001)
    };

    public static final String KILOMETER_SYMBOL = "km";
    public static final String HECTOMETER_SYMBOL = "hm";
    public static final String DECAMETER_SYMBOL = "dam";
    public static final String METER_SYMBOL = "m";
    public static final String DECIMETER_SYMBOL = "dm";
    public static final String CENTIMETER_SYMBOL = "cm";
    public static final String MILLIMETER_SYMBOL= "mm";

    protected final String[] LENGTH_SYMBOLS = new String[] {
        KILOMETER_SYMBOL,
        HECTOMETER_SYMBOL,
        DECAMETER_SYMBOL,
        METER_SYMBOL,
        DECIMETER_SYMBOL,
        CENTIMETER_SYMBOL,
        MILLIMETER_SYMBOL
    };

    public Length() {
        super();
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(METER);
    }

    public Length(double value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(METER);
    }

    public Length(String value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(METER);
    }

    public Length(long value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(METER);
    }

    public Length(BigDecimal value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(METER);
    }

    public Length(double value, int unit) {
        super(value);
        setMaxUnit(MILLIMETER);
        setUnit(unit);
    }

    public Length(String value, int unit) {
        super(value);
        setMaxUnit(MILLIMETER);
        setUnit(unit);
    }

    public Length(long value, int unit) {
        super(value);
        setMaxUnit(MILLIMETER);
        setUnit(unit);
    }

    public Length(BigDecimal value, int unit) {
        super(value);
        setMaxUnit(MILLIMETER);
        setUnit(unit);
    }

	@Contract("_, _ -> new")
    public static @NotNull Length toKilometer(double value, int unit) {
        return new Length(divide(multiply(value, LENGTH_SCALES[unit]), LENGTH_SCALES[KILOMETER]));
    }

	@Contract("_, _ -> new")
    public static @NotNull Length toHectometer(double value, int unit) {
        return new Length(divide(multiply(value, LENGTH_SCALES[unit]), LENGTH_SCALES[HECTOMETER]));
    }

	@Contract("_, _ -> new")
    public static @NotNull Length toDecameter(double value, int unit) throws IllegalArgumentException {
        return new Length(divide(multiply(value, LENGTH_SCALES[unit]), LENGTH_SCALES[DECAMETER]));
    }

	@Contract("_, _ -> new")
    public static @NotNull Length toMeter(double value, int unit) throws IllegalArgumentException {
        return new Length(divide(multiply(value, LENGTH_SCALES[unit]), LENGTH_SCALES[METER]));
    }

	@Contract("_, _ -> new")
    public static @NotNull Length toDecimeter(double value, int unit) throws IllegalArgumentException {
        return new Length(divide(multiply(value, LENGTH_SCALES[unit]), LENGTH_SCALES[DECIMETER]));
    }

	@Contract("_, _ -> new")
    public static @NotNull Length toCentimeter(double value, int unit) throws IllegalArgumentException {
        return new Length(divide(multiply(value, LENGTH_SCALES[unit]), LENGTH_SCALES[CENTIMETER]));
    }

	@Contract("_, _ -> new")
    public static @NotNull Length toMillimeter(double value, int unit) throws IllegalArgumentException {
        return new Length(divide(multiply(value, LENGTH_SCALES[unit]), LENGTH_SCALES[MILLIMETER]));
    }

    @Override
    public Length toKilometer() {
        value = divide(multiply(value, LENGTH_SCALES[unit]), LENGTH_SCALES[KILOMETER]);
        unit = KILOMETER;
        return this;
    }

    @Override
    public Length toHectometer() {
        value = divide(multiply(value, LENGTH_SCALES[unit]), LENGTH_SCALES[HECTOMETER]);
        unit = HECTOMETER;
        return this;
    }

    @Override
    public Length toDecameter() {
        value = divide(multiply(value, LENGTH_SCALES[unit]), LENGTH_SCALES[DECAMETER]);
        unit = DECAMETER;
        return this;
    }

    @Override
    public Length toMeter() {
        value = divide(multiply(value, LENGTH_SCALES[unit]), LENGTH_SCALES[METER]);
        unit = METER;
        return this;
    }

    @Override
    public Length toDecimeter() {
        value = divide(multiply(value, LENGTH_SCALES[unit]), LENGTH_SCALES[DECIMETER]);
        unit = DECIMETER;
        return this;
    }

    @Override
    public Length toCentimeter() {
        value = divide(multiply(value, LENGTH_SCALES[unit]), LENGTH_SCALES[CENTIMETER]);
        unit = CENTIMETER;
        return this;
    }

    @Override
    public Length toMillimeter() {
        value = divide(multiply(value, LENGTH_SCALES[unit]), LENGTH_SCALES[MILLIMETER]);
        unit = MILLIMETER;
        return this;
    }

    @Override
    public String toString() {
        return value + LENGTH_SYMBOLS[unit];
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
        return unit == METER;
    }

    @Override
    public String getUnitSymbol() {
        return LENGTH_SYMBOLS[unit];
    }

    @Deprecated
    protected static Length getInstance() {
		if (instance == null)
			instance = new Length();
		return instance;
    }
}
