package com.gabrielMJr.twaire.physic.units;

import java.math.BigDecimal;

import static com.gabrielMJr.twaire.physic.units.Length.KILOMETER;
import static com.gabrielMJr.twaire.physic.units.Length.HECTOMETER;
import static com.gabrielMJr.twaire.physic.units.Length.DECAMETER;
import static com.gabrielMJr.twaire.physic.units.Length.METER;
import static com.gabrielMJr.twaire.physic.units.Length.DECIMETER;
import static com.gabrielMJr.twaire.physic.units.Length.CENTIMETER;
import static com.gabrielMJr.twaire.physic.units.Length.MILLIMETER;

import static com.gabrielMJr.twaire.physic.units.Length.KILOMETER_SYMBOL;
import static com.gabrielMJr.twaire.physic.units.Length.HECTOMETER_SYMBOL;
import static com.gabrielMJr.twaire.physic.units.Length.DECAMETER_SYMBOL;
import static com.gabrielMJr.twaire.physic.units.Length.METER_SYMBOL;
import static com.gabrielMJr.twaire.physic.units.Length.DECIMETER_SYMBOL;
import static com.gabrielMJr.twaire.physic.units.Length.CENTIMETER_SYMBOL;
import static com.gabrielMJr.twaire.physic.units.Length.MILLIMETER_SYMBOL;

public class Area implements AreaIF 
{
	private static Area instance; 

	public static final String SQUARE_KILOMETER = String.valueOf(Math.pow(Double.valueOf(KILOMETER), 2));
	public static final String SQUARE_HECTOMETER = String.valueOf(Math.pow(Double.valueOf(HECTOMETER), 2));
	public static final String SQUARE_DECAMETER = String.valueOf(Math.pow(Double.valueOf(DECAMETER), 2));
	public static final String SQUARE_METER = String.valueOf(Math.pow(Double.valueOf(METER), 2));
	public static final String SQUARE_DECIMETER = String.valueOf(Math.pow(Double.valueOf(DECIMETER), 2));
	public static final String SQUARE_CENTIMETER = String.valueOf(Math.pow(Double.valueOf(CENTIMETER), 2));
	public static final String SQUARE_MILLIMETER = String.valueOf(Math.pow(Double.valueOf(MILLIMETER), 2));

	public static final String SQUARE_KILOMETER_SYMBOL = KILOMETER_SYMBOL + "²";
	public static final String SQUARE_HECTOMETER_SYMBOL = HECTOMETER_SYMBOL + "²";
	public static final String SQUARE_DECAMETER_SYMBOL = DECAMETER_SYMBOL +"²";
	public static final String SQUARE_METER_SYMBOL = METER_SYMBOL + "²";
	public static final String SQUARE_DECIMETER_SYMBOL = DECIMETER_SYMBOL + "²";
	public static final String SQUARE_CENTIMETER_SYMBOL = CENTIMETER_SYMBOL + "²";
	public static final String SQUARE_MILLIMETER_SYMBOL = MILLIMETER_SYMBOL + "²";
	
	@Override
	public BigDecimal toSquareKilometer(double value, String unit)
	{
		BigDecimal bigValue = BigDecimal.valueOf(value);
		BigDecimal bigUnit = new BigDecimal(unit);
		return (bigValue.multiply(BigDecimal.valueOf(Double.valueOf(SQUARE_KILOMETER)))).divide(bigUnit);
	}

	@Override
	public BigDecimal toSquareHectometer(double value, String unit)
	{
		BigDecimal bigValue = BigDecimal.valueOf(value);
		BigDecimal bigUnit = new BigDecimal(unit);
		return (bigValue.multiply(new BigDecimal(SQUARE_HECTOMETER))).divide(bigUnit);
	}

	@Override
	public BigDecimal toSquareDecameter(double value, String unit)
	{
		BigDecimal bigValue = BigDecimal.valueOf(value);
		BigDecimal bigUnit = new BigDecimal(unit);
		return (bigValue.multiply(new BigDecimal(SQUARE_DECAMETER))).divide(bigUnit);
	}

	@Override
	public BigDecimal toSquareMeter(double value, String unit)
	{
		BigDecimal bigValue = BigDecimal.valueOf(value);
		BigDecimal bigUnit = new BigDecimal(unit);
		return (bigValue.multiply(new BigDecimal(SQUARE_METER))).divide(bigUnit);
	}

	@Override
	public BigDecimal toSquareDecimeter(double value, String unit)
	{
		BigDecimal bigValue = BigDecimal.valueOf(value);
		BigDecimal bigUnit = new BigDecimal(unit);
		return (bigValue.multiply(new BigDecimal(SQUARE_DECIMETER))).divide(bigUnit);
	}

	@Override
	public BigDecimal toSquareCentimeter(double value, String unit)
	{
		BigDecimal bigValue = BigDecimal.valueOf(value);
		BigDecimal bigUnit = new BigDecimal(unit);
		return (bigValue.multiply(new BigDecimal(SQUARE_CENTIMETER))).divide(bigUnit);
	}

	@Override
	public BigDecimal toSquareMillimeter(double value, String unit)
	{
		BigDecimal bigValue = BigDecimal.valueOf(value);
		BigDecimal bigUnit = new BigDecimal(unit);
		return (bigValue.multiply(new BigDecimal(SQUARE_MILLIMETER))).divide(bigUnit);
	}
	
    protected static Area getInstance()
    {
		if (!(instance instanceof Area))
			instance = new Area();
		return instance;
    }
}
