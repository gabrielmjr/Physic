package com.mjr.twaire.code.physic.units;

import java.math.BigDecimal;
import com.mjr.twaire.code.physic.PhysicException;

import static com.mjr.twaire.code.physic.Physic.ROUND_SCALE;
import static java.math.RoundingMode.HALF_UP;

public class Length implements ILength { 
    @Deprecated
	private static Length instance;
    private BigDecimal value;
    private int unit;

    public static final int KILOMETER = 0;
    public static final int HECTOMETER = 1;
    public static final int DECAMETER = 2;
    public static final int METER = 3;
    public static final int DECIMETER = 4;
    public static final int CENTIMETER = 5;
    public static final int MILLIMETER = 6;

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
        value = BigDecimal.ZERO;
        unit = METER;
    }

    public Length(double value) {
        this.value = BigDecimal.valueOf(value);
        unit = METER;
    }

    public Length(String value) {
        this.value = new BigDecimal(value);
        unit = METER;
    }

    public Length(long value) {
        this.value = BigDecimal.valueOf(value);
        unit = METER;
    }

    public Length(BigDecimal value) {
        this.value = value;
        unit = METER;
    }

    public Length(double value, int unit) throws PhysicException {
        this.value = BigDecimal.valueOf(value);
        if (unit >= 0 && unit <= 6) {
            this.unit = unit;
            return;
        }
        throw new InvalidUnitException("The unit " + unit + " is not valid as " + getClass().getName() + " unit.");
    }

    public Length(String value, int unit) throws PhysicException {
        this.value = new BigDecimal(value);
        if (unit >= 0 && unit <= 6) {
            this.unit = unit;
            return;
        }
        throw new InvalidUnitException("The unit " + unit + " is not valid as " + getClass().getName() + " unit.");
    }

    public Length(long value, int unit) throws PhysicException {
        this.value = BigDecimal.valueOf(value);
        if (unit >= 0 && unit <= 6) {
            this.unit = unit;
            return;
        }
        throw new InvalidUnitException("The unit " + unit + " is not valid as " + getClass().getName() + " unit.");
    }

    public Length(BigDecimal value, int unit) throws PhysicException {
        this.value = value;
        if (unit >= 0 && unit <= 6) {
            this.unit = unit;
            return;
        }
        throw new InvalidUnitException("The unit " + unit + " is not valid as " + getClass().getName() + " unit");
    }

	public static Length toKilometer (double value, int unit) throws PhysicException {
		if (unit >= 0 && unit <= 6)
            return new Length(BigDecimal.valueOf(value).multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[KILOMETER], ROUND_SCALE, HALF_UP), unit);
        throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Length().getClass().getName() + " unit.");
    }

	public static Length toHectometer (double value, int unit) throws PhysicException {
		if (unit >= 0 && unit <= 6)
            return new Length(BigDecimal.valueOf(value).multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[HECTOMETER], ROUND_SCALE, HALF_UP), unit);
        throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Length().getClass().getName() + " unit.");
    }

	public static Length toDecameter (double value, int unit) throws PhysicException {
		if (unit >= 0 && unit <= 6)
            return new Length(BigDecimal.valueOf(value).multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[DECAMETER], ROUND_SCALE, HALF_UP), unit);
        throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Length().getClass().getName() + " unit.");
    }

	public static Length toMeter (double value, int unit) throws PhysicException {
		if (unit >= 0 && unit <= 6)
            return new Length(BigDecimal.valueOf(value).multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[METER], ROUND_SCALE, HALF_UP), unit);
        throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Length().getClass().getName() + " unit.");
    }

	public static Length toDecimeter (double value, int unit) throws PhysicException {
		if (unit >= 0 && unit <= 6)
            return new Length(BigDecimal.valueOf(value).multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[DECIMETER], ROUND_SCALE, HALF_UP), unit);
        throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Length().getClass().getName() + " unit.");
    }

	public static Length toCentimeter (double value, int unit) throws PhysicException {
		if (unit >= 0 && unit <= 6)
            return new Length(BigDecimal.valueOf(value).multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[CENTIMETER], ROUND_SCALE, HALF_UP), unit);
        throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Length().getClass().getName() + " unit.");
    }

	public static Length toMillimeter (double value, int unit) throws PhysicException {
		if (unit >= 0 && unit <= 6)
            return new Length(BigDecimal.valueOf(value).multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[MILLIMETER], ROUND_SCALE, HALF_UP), unit);
        throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Length().getClass().getName() + " unit.");
	}

    @Override
    public Length toKilometer() {
        return null;
    }

    @Override
    public Length toHectometer() {
        return null;
    }

    @Override
    public Length toDecameter() {
        return null;
    }

    @Override
    public Length toMeter() {
        return null;
    }

    @Override
    public Length toDecimeter() {
        return null;
    }

    @Override
    public Length toCentimeter() {
        return null;
    }

    @Override
    public Length toMillimeter() {
        return null;
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

    public Length setValue(double value) {
        return new Length(value);
    }

    public Length setValue(long value) {
        return new Length(value);
    }

    public Length setValue(String value) {
        return new Length(value);
    }

    public Length setValue(BigDecimal value) {
        return new Length(value);
    }

    public Length getValue() {
        return this;
    }

    public Length setUnit(int unit) throws PhysicException {
        if (unit >= 0 && unit <= 6) {
            this.unit = unit;
            return this;
        }
        throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Length().getClass().getName() + " unit.");
    }

    @Deprecated
    protected static Length getInstance () {
		if (!(instance instanceof Length))
			instance = new Length();
		return instance;
    }
}
