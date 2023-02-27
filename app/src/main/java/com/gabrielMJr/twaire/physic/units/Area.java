package com.gabrielMJr.twaire.physic.units;

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
	public Double toSquareKilometer(double value, String unit)
	{
		return ((value * Double.valueOf(SQUARE_KILOMETER)) / Double.valueOf(unit));
	}

	@Override
	public Double toSquareHectometer(double value, String unit)
	{
		return ((value * Double.valueOf(SQUARE_HECTOMETER)) / Double.valueOf(unit));
	}

	@Override
	public Double toSquareDecameter(double value, String unit)
	{
		return ((value * Double.valueOf(SQUARE_DECAMETER)) / Double.valueOf(unit));
	}

	@Override
	public Double toSquareMeter(double value, String unit)
	{
		return ((value * Double.valueOf(SQUARE_METER)) / Double.valueOf(unit));
	}

	@Override
	public Double toSquareDecimeter(double value, String unit)
	{
		return ((value * Double.valueOf(SQUARE_DECIMETER)) / Double.valueOf(unit));
	}

	@Override
	public Double toSquareCentimeter(double value, String unit)
	{
		return ((value * Double.valueOf(SQUARE_CENTIMETER)) / Double.valueOf(unit));
	}

	@Override
	public Double toSquareMillimeter(double value, String unit)
	{
		return ((value * Double.valueOf(SQUARE_MILLIMETER)) / Double.valueOf(unit));
	}
	
    protected static Area getInstance()
    {
		if (!(instance instanceof Area))
			instance = new Area();
		return instance;
    }
}
