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

public class Volume implements VolumeIF
{
	private static Volume instance; 

	public static final String CUBE_KILOMETER = String.valueOf(Math.pow(Double.valueOf(KILOMETER), 3));
	public static final String CUBE_HECTOMETER = String.valueOf(Math.pow(Double.valueOf(HECTOMETER), 3));
	public static final String CUBE_DECAMETER = String.valueOf(Math.pow(Double.valueOf(DECIMETER), 3));
	public static final String CUBE_METER = String.valueOf(Math.pow(Double.valueOf(METER), 3));
	public static final String CUBE_DECIMETER = String.valueOf(Math.pow(Double.valueOf(DECIMETER), 3));
	public static final String CUBE_CENTIMETER = String.valueOf(Math.pow(Double.valueOf(CENTIMETER), 3));
	public static final String CUBE_MILLIMETER = String.valueOf(Math.pow(Double.valueOf(MILLIMETER), 3));

	@Override
	public Double toCubeKilometer(double value, String unit)
	{
		return ((value * Double.valueOf(CUBE_KILOMETER)) / Double.valueOf(unit));
    }

	@Override
	public Double toCubeHectometer(double value, String unit)
	{
		return ((value * Double.valueOf(CUBE_HECTOMETER)) / Double.valueOf(unit));
    }

	@Override
	public Double toCubeDecameter(double value, String unit)
	{
		return ((value * Double.valueOf(CUBE_DECAMETER)) / Double.valueOf(unit));
    }

	@Override
	public Double toCubeMeter(double value, String unit)
	{
		return ((value * Double.valueOf(CUBE_METER)) / Double.valueOf(unit));
    }

	@Override
	public Double toCubeDecimeter(double value, String unit)
	{
		return ((value * Double.valueOf(CUBE_DECIMETER)) / Double.valueOf(unit));
    }

	@Override
	public Double toCubeCentimeter(double value, String unit)
	{
		return ((value * Double.valueOf(CUBE_CENTIMETER)) / Double.valueOf(unit));
    }

	@Override
	public Double toCubeMillimeter(double value, String unit)
	{
		return ((value * Double.valueOf(CUBE_MILLIMETER)) / Double.valueOf(unit));
    }

    protected static Volume getInstance()
    {
		if (!(instance instanceof Volume))
			instance = new Volume();
		return instance;
    }
}
