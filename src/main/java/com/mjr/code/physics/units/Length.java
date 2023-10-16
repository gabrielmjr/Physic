package com.mjr.code.physics.units;

import com.mjr.code.physics.Physic;

import java.math.BigDecimal;

import static java.math.RoundingMode.HALF_UP;

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

    protected final String LENGTH_SYMBOLS[] = new String[] {
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
        setMinUnit(KILOMETER);
        setMaxUnit(MILLIMETER);
        setUnit(unit);
    }

    public Length(long value, int unit) {
        super(value);
        setMinUnit(KILOMETER);
        setMaxUnit(MILLIMETER);
        setUnit(unit);
    }

    public Length(BigDecimal value, int unit) {
        super(value);
        setMinUnit(KILOMETER);
        setMaxUnit(MILLIMETER);
        setUnit(unit);
    }

	public static Length toKilometer(double value, int unit) {
        return new Length(BigDecimal.valueOf(value).multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[KILOMETER], Physic.ROUND_SCALE, HALF_UP), KILOMETER);
    }

	public static Length toHectometer(double value, int unit) {
        return new Length(BigDecimal.valueOf(value).multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[HECTOMETER], Physic.ROUND_SCALE, HALF_UP), HECTOMETER);
    }

	public static Length toDecameter(double value, int unit) throws IllegalArgumentException {
        return new Length(BigDecimal.valueOf(value).multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[DECAMETER], Physic.ROUND_SCALE, HALF_UP), DECAMETER);
    }

	public static Length toMeter(double value, int unit) throws IllegalArgumentException {
        return new Length(BigDecimal.valueOf(value).multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[METER], Physic.ROUND_SCALE, HALF_UP), METER);
    }

	public static Length toDecimeter(double value, int unit) throws IllegalArgumentException {
        return new Length(BigDecimal.valueOf(value).multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[DECIMETER], Physic.ROUND_SCALE, HALF_UP), DECIMETER);
    }

	public static Length toCentimeter(double value, int unit) throws IllegalArgumentException {
        return new Length(BigDecimal.valueOf(value).multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[CENTIMETER], Physic.ROUND_SCALE, HALF_UP), CENTIMETER);
    }

	public static Length toMillimeter(double value, int unit) throws IllegalArgumentException {
        return new Length(BigDecimal.valueOf(value).multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[MILLIMETER], Physic.ROUND_SCALE, HALF_UP), MILLIMETER);
    }

    @Override
    public Length toKilometer() {
        value = value.multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[KILOMETER], Physic.ROUND_SCALE, HALF_UP);
        unit = KILOMETER;
        return this;
    }

    @Override
    public Length toHectometer() {
        value = value.multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[HECTOMETER], Physic.ROUND_SCALE, HALF_UP);
        unit = HECTOMETER;
        return this;
    }

    @Override
    public Length toDecameter() {
        value = value.multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[DECAMETER], Physic.ROUND_SCALE, HALF_UP);
        unit = DECAMETER;
        return this;
    }

    @Override
    public Length toMeter() {
        value = value.multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[METER], Physic.ROUND_SCALE, HALF_UP);
        unit = METER;
        return this;
    }

    @Override
    public Length toDecimeter() {
        value = value.multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[DECIMETER], Physic.ROUND_SCALE, HALF_UP);
        unit = DECIMETER;
        return this;
    }

    @Override
    public Length toCentimeter() {
        value = value.multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[CENTIMETER], Physic.ROUND_SCALE, HALF_UP);
        unit = CENTIMETER;
        return this;
    }

    @Override
    public Length toMillimeter() {
        value = value.multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[MILLIMETER], Physic.ROUND_SCALE, HALF_UP);
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
    public String getUnitSymbol() {
        return LENGTH_SYMBOLS[unit];
    }

    @Deprecated
    protected static Length getInstance() {
		if (!(instance instanceof Length))
			instance = new Length();
		return instance;
    }
}
