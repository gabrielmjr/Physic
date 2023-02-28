package com.gabrielMJr.twaire.physic.units;

import java.math.BigDecimal;

public class Length implements LengthIF
{
	private static Length instance;

	public static final String KILOMETER = "0.001";
	public static final String HECTOMETER = "0.01";
	public static final String DECAMETER = "0.1";
	public static final String METER = "1.0";
	public static final String DECIMETER = "10";
	public static final String CENTIMETER = "100";
	public static final String MILLIMETER = "1000";
	
	public static final String KILOMETER_SYMBOL = "km";
	public static final String HECTOMETER_SYMBOL = "hm";
	public static final String DECAMETER_SYMBOL = "dam";
	public static final String METER_SYMBOL = "m";
	public static final String DECIMETER_SYMBOL = "dm";
	public static final String CENTIMETER_SYMBOL = "cm";
	public static final String MILLIMETER_SYMBOL= "mm";
	
	@Override
	public BigDecimal toKilometer(
		double value,
		String unit)  
    {
		BigDecimal bigValue = BigDecimal.valueOf(value);
		BigDecimal bigUnit = new BigDecimal(unit);
		return (bigValue.multiply(BigDecimal.valueOf(Double.valueOf(KILOMETER)))).divide(bigUnit);
    }
	
	@Override
	public BigDecimal toHectometer(
		double value,
		String unit)
    {
		BigDecimal bigValue = BigDecimal.valueOf(value);
		BigDecimal bigUnit = new BigDecimal(unit);
		return (bigValue.multiply(BigDecimal.valueOf(Double.valueOf(HECTOMETER)))).divide(bigUnit);
    }

	@Override
	public BigDecimal toDecameter(
		double value,
		String unit)
    {
		BigDecimal bigValue = BigDecimal.valueOf(value);
		BigDecimal bigUnit = new BigDecimal(unit);
		return (bigValue.multiply(BigDecimal.valueOf(Double.valueOf(DECAMETER)))).divide(bigUnit);
    }

	@Override
	public BigDecimal toMeter(
		double value,
		String unit)
    {
		BigDecimal bigValue = BigDecimal.valueOf(value);
		BigDecimal bigUnit = new BigDecimal(unit);
		return (bigValue.multiply(BigDecimal.valueOf(Double.valueOf(METER)))).divide(bigUnit);
    }

	@Override
	public BigDecimal toDecimeter(
		double value,
		String unit)
    {
		BigDecimal bigValue = BigDecimal.valueOf(value);
		BigDecimal bigUnit = new BigDecimal(unit);
		return (bigValue.multiply(BigDecimal.valueOf(Double.valueOf(DECIMETER)))).divide(bigUnit);
    }
	
	@Override
	public BigDecimal toCentimeter(
		double value,
		String unit)
    {
		BigDecimal bigValue = BigDecimal.valueOf(value);
		BigDecimal bigUnit = new BigDecimal(unit);
		return (bigValue.multiply(BigDecimal.valueOf(Double.valueOf(CENTIMETER)))).divide(bigUnit);
    }

	@Override
	public BigDecimal toMillimeter(
		double value,
		String unit)
    {
		BigDecimal bigValue = BigDecimal.valueOf(value);
		BigDecimal bigUnit = new BigDecimal(unit);
		return (bigValue.multiply(BigDecimal.valueOf(Double.valueOf(MILLIMETER)))).divide(bigUnit);
	}

    protected static Length getInstance()
    {
		if (!(instance instanceof Length))
			instance = new Length();
		return instance;
    }
}
