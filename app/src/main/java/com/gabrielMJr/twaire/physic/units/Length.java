package com.gabrielmjr.twaire.physic.units;

import java.math.BigDecimal;

public class Length implements LengthIF {
	private static Length instance;

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
	public BigDecimal toKilometer (double value, int unit) {
		if (unit >= 0 && unit <= 6)
			return BigDecimal.valueOf(value).multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[KILOMETER]);
		return null;
    }

	@Override
	public BigDecimal toHectometer (double value, int unit) {
		if (unit >= 0 && unit <= 6)
			return BigDecimal.valueOf(value).multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[HECTOMETER]);
		return null;
    }

	@Override
	public BigDecimal toDecameter (double value, int unit) {
		if (unit >= 0 && unit <= 6)
			return BigDecimal.valueOf(value).multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[DECAMETER]);
		return null;
    }

	@Override
	public BigDecimal toMeter (double value, int unit) {
		if (unit >= 0 && unit <= 6)
			return BigDecimal.valueOf(value).multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[METER]);
		return null;
    }

	@Override
	public BigDecimal toDecimeter (double value, int unit) {
		if (unit >= 0 && unit <= 6)
			return BigDecimal.valueOf(value).multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[DECIMETER]);
		return null;
    }

	@Override
	public BigDecimal toCentimeter (double value, int unit) {
		if (unit >= 0 && unit <= 6)
			return BigDecimal.valueOf(value).multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[CENTIMETER]);
		return null;
    }

	@Override
	public BigDecimal toMillimeter (double value, int unit) {
		if (unit >= 0 && unit <= 6)
			return BigDecimal.valueOf(value).multiply(LENGTH_SCALES[unit]).divide(LENGTH_SCALES[MILLIMETER]);
		return null;
	}

    protected static Length getInstance () {
		if (!(instance instanceof Length))
			instance = new Length();
		return instance;
    }
}
