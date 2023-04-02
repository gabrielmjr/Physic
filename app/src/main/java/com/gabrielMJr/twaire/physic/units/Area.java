package com.gabrielmjr.twaire.physic.units;

import java.math.BigDecimal;

import static com.gabrielmjr.twaire.physic.units.Length.KILOMETER;
import static com.gabrielmjr.twaire.physic.units.Length.HECTOMETER;
import static com.gabrielmjr.twaire.physic.units.Length.DECAMETER;
import static com.gabrielmjr.twaire.physic.units.Length.METER;
import static com.gabrielmjr.twaire.physic.units.Length.DECIMETER;
import static com.gabrielmjr.twaire.physic.units.Length.CENTIMETER;
import static com.gabrielmjr.twaire.physic.units.Length.MILLIMETER;

import static com.gabrielmjr.twaire.physic.units.Length.LENGTH_SCALES;

import static com.gabrielmjr.twaire.physic.units.Length.KILOMETER_SYMBOL;
import static com.gabrielmjr.twaire.physic.units.Length.HECTOMETER_SYMBOL;
import static com.gabrielmjr.twaire.physic.units.Length.DECAMETER_SYMBOL;
import static com.gabrielmjr.twaire.physic.units.Length.METER_SYMBOL;
import static com.gabrielmjr.twaire.physic.units.Length.DECIMETER_SYMBOL;
import static com.gabrielmjr.twaire.physic.units.Length.CENTIMETER_SYMBOL;
import static com.gabrielmjr.twaire.physic.units.Length.MILLIMETER_SYMBOL;

public class Area implements AreaIF {
	private static Area instance; 

	public static final int SQUARE_KILOMETER = 7;
	public static final int SQUARE_HECTOMETER = 8;
	public static final int SQUARE_DECAMETER = 9;
	public static final int SQUARE_METER = 10;
	public static final int SQUARE_DECIMETER = 11;
	public static final int SQUARE_CENTIMETER = 12;
	public static final int SQUARE_MILLIMETER = 13;

	protected static final BigDecimal[] AREA_SCALES = new BigDecimal[]
	{
		LENGTH_SCALES[KILOMETER].pow(2),
		LENGTH_SCALES[HECTOMETER].pow(2),
		LENGTH_SCALES[DECAMETER].pow(2),
		LENGTH_SCALES[METER].pow(2),
		LENGTH_SCALES[DECIMETER].pow(2),
		LENGTH_SCALES[CENTIMETER].pow(2),
		LENGTH_SCALES[MILLIMETER].pow(2)
	};

	public static final String SQUARE_KILOMETER_SYMBOL = KILOMETER_SYMBOL + "²";
	public static final String SQUARE_HECTOMETER_SYMBOL = HECTOMETER_SYMBOL + "²";
	public static final String SQUARE_DECAMETER_SYMBOL = DECAMETER_SYMBOL + "²";
	public static final String SQUARE_METER_SYMBOL = METER_SYMBOL + "²";
	public static final String SQUARE_DECIMETER_SYMBOL = DECIMETER_SYMBOL + "²";
	public static final String SQUARE_CENTIMETER_SYMBOL = CENTIMETER_SYMBOL + "²";
	public static final String SQUARE_MILLIMETER_SYMBOL = MILLIMETER_SYMBOL + "²";

	@Override
	public BigDecimal toSquareKilometer (double value, int unit) throws InvalidUnitException {
		if (unit >= 7 && unit <= 13)
			return BigDecimal.valueOf(value).multiply(AREA_SCALES[unit - 7]).divide(AREA_SCALES[SQUARE_KILOMETER - 7]);
	    throw new InvalidUnitException("The unit " + unit + " is not valid as area unit.");
	}

	@Override
	public BigDecimal toSquareHectometer (double value, int unit) throws InvalidUnitException {
		if (unit >= 7 && unit <= 13)
			return BigDecimal.valueOf(value).multiply(AREA_SCALES[unit - 7]).divide(AREA_SCALES[SQUARE_HECTOMETER - 7]);
		throw new InvalidUnitException("The unit " + unit + " is not valid as area unit.");
	}

	@Override
	public BigDecimal toSquareDecameter (double value, int unit) throws InvalidUnitException {
		if (unit >= 7 && unit <= 13)
			return BigDecimal.valueOf(value).multiply(AREA_SCALES[unit - 7]).divide(AREA_SCALES[SQUARE_DECAMETER - 7]);
		throw new InvalidUnitException("The unit " + unit + " is not valid as area unit.");
	}

	@Override
	public BigDecimal toSquareMeter (double value, int unit) throws InvalidUnitException {
		if (unit >= 7 && unit <= 13)
			return BigDecimal.valueOf(value).multiply(AREA_SCALES[unit - 7]).divide(AREA_SCALES[SQUARE_METER - 7]);
		throw new InvalidUnitException("The unit " + unit + " is not valid as area unit.");
	}

	@Override
	public BigDecimal toSquareDecimeter (double value, int unit) throws InvalidUnitException {
		if (unit >= 7 && unit <= 13)
			return BigDecimal.valueOf(value).multiply(AREA_SCALES[unit - 7]).divide(AREA_SCALES[SQUARE_DECIMETER - 7]);
		throw new InvalidUnitException("The unit " + unit + " is not valid as area unit.");
	}

	@Override
	public BigDecimal toSquareCentimeter (double value, int unit) throws InvalidUnitException {
		if (unit >= 7 && unit <= 13)
			return BigDecimal.valueOf(value).multiply(AREA_SCALES[unit - 7]).divide(AREA_SCALES[SQUARE_CENTIMETER - 7]);
		throw new InvalidUnitException("The unit " + unit + " is not valid as area unit.");
	}

	@Override
	public BigDecimal toSquareMillimeter (double value, int unit) throws InvalidUnitException {
		if (unit >= 7 && unit <= 13)
			return BigDecimal.valueOf(value).multiply(AREA_SCALES[unit - 7]).divide(AREA_SCALES[SQUARE_MILLIMETER - 7]);
		throw new InvalidUnitException("The unit " + unit + " is not valid as area unit.");
	}

    protected static Area getInstance () {
		if (!(instance instanceof Area))
			instance = new Area();
		return instance;
    }
}
