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
	public BigDecimal toCubeKilometer(double value, String unit)
	{
		BigDecimal bigValue = BigDecimal.valueOf(value);
		BigDecimal bigUnit = new BigDecimal(unit);
		return (bigValue.multiply(new BigDecimal(CUBE_KILOMETER))).divide(bigUnit);
    }

	@Override
	public BigDecimal toCubeHectometer(double value, String unit)
	{
		BigDecimal bigValue = BigDecimal.valueOf(value);
		BigDecimal bigUnit = new BigDecimal(unit);
		return (bigValue.multiply(new BigDecimal(CUBE_HECTOMETER))).divide(bigUnit);
    }

	@Override
	public BigDecimal toCubeDecameter(double value, String unit)
	{
		BigDecimal bigValue = BigDecimal.valueOf(value);
		BigDecimal bigUnit = new BigDecimal(unit);
		return (bigValue.multiply(new BigDecimal(CUBE_DECAMETER))).divide(bigUnit);
    }

	@Override
	public BigDecimal toCubeMeter(double value, String unit)
	{
		BigDecimal bigValue = BigDecimal.valueOf(value);
		BigDecimal bigUnit = new BigDecimal(unit);
		return (bigValue.multiply(new BigDecimal(CUBE_METER))).divide(bigUnit);
    }

	@Override
	public BigDecimal toCubeDecimeter(double value, String unit)
	{
		BigDecimal bigValue = BigDecimal.valueOf(value);
		BigDecimal bigUnit = new BigDecimal(unit);
		return (bigValue.multiply(new BigDecimal(CUBE_DECIMETER))).divide(bigUnit);
    }

	@Override
	public BigDecimal toCubeCentimeter(double value, String unit)
	{
		BigDecimal bigValue = BigDecimal.valueOf(value);
		BigDecimal bigUnit = new BigDecimal(unit);
		return (bigValue.multiply(new BigDecimal(CUBE_CENTIMETER))).divide(bigUnit);
    }

	@Override
	public BigDecimal toCubeMillimeter(double value, String unit)
	{
		BigDecimal bigValue = BigDecimal.valueOf(value);
		BigDecimal bigUnit = new BigDecimal(unit);
		return (bigValue.multiply(new BigDecimal(CUBE_MILLIMETER))).divide(bigUnit);
    }

    protected static Volume getInstance()
    {
		if (!(instance instanceof Volume))
			instance = new Volume();
		return instance;
    }
}
