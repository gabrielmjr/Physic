package com.gabrielmjr.twaire.physic.units;

import java.math.BigDecimal;

public class Length implements LengthIF {
	private static Length instance;
    private BigDecimal value;
    private int unit;
    
    public Length() {
        value = BigDecimal.valueOf(0.0);
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
    
	public static final int KILOMETER = 0;
	public static final int HECTOMETER = 1;
	public static final int DECAMETER = 2;
	public static final int METER = 3;
	public static final int DECIMETER = 4;
	public static final int CENTIMETER = 5;
	public static final int MILLIMETER = 6;

	protected static final BigDecimal[] LENGTH_SCALES = new BigDecimal[]
	{
		BigDecimal.valueOf(0.001),
		BigDecimal.valueOf(0.01),
		BigDecimal.valueOf(0.1),
		BigDecimal.valueOf(1.0),
		BigDecimal.valueOf(10),
		BigDecimal.valueOf(100),
		BigDecimal.valueOf(1000)
	};

	public static final String KILOMETER_SYMBOL = "km";
	public static final String HECTOMETER_SYMBOL = "hm";
	public static final String DECAMETER_SYMBOL = "dam";
	public static final String METER_SYMBOL = "m";
	public static final String DECIMETER_SYMBOL = "dm";
	public static final String CENTIMETER_SYMBOL = "cm";
	public static final String MILLIMETER_SYMBOL= "mm";

	@Override
	public BigDecimal toKilometer (double value, int unit) throws InvalidUnitException {
		if (unit >= 0 && unit <= 6)
			return BigDecimal.valueOf(value).multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[KILOMETER]);
        throw new InvalidUnitException("error");
    }

	@Override
	public BigDecimal toHectometer (double value, int unit) throws InvalidUnitException {
		if (unit >= 0 && unit <= 6)
			return BigDecimal.valueOf(value).multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[HECTOMETER]);
	    throw new InvalidUnitException("");
    }

	@Override
	public BigDecimal toDecameter (double value, int unit) throws InvalidUnitException {
		if (unit >= 0 && unit <= 6)
			return BigDecimal.valueOf(value).multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[DECAMETER]);
		throw new InvalidUnitException("");
    }

	@Override
	public BigDecimal toMeter (double value, int unit) throws InvalidUnitException {
		if (unit >= 0 && unit <= 6)
			return BigDecimal.valueOf(value).multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[METER]);
		throw new InvalidUnitException("");
    }

	@Override
	public BigDecimal toDecimeter (double value, int unit) throws InvalidUnitException {
		if (unit >= 0 && unit <= 6)
			return BigDecimal.valueOf(value).multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[DECIMETER]);
		throw new InvalidUnitException("");
    }

	@Override
	public BigDecimal toCentimeter (double value, int unit) throws InvalidUnitException {
		if (unit >= 0 && unit <= 6)
			return BigDecimal.valueOf(value).multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[CENTIMETER]);
		throw new InvalidUnitException("");
    }

	@Override
	public BigDecimal toMillimeter (double value, int unit) throws InvalidUnitException {
		if (unit >= 0 && unit <= 6)
			return BigDecimal.valueOf(value).multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[MILLIMETER]);
		throw new InvalidUnitException("");
	}

    protected static Length getInstance () {
		if (!(instance instanceof Length))
			instance = new Length();
		return instance;
    }
}
