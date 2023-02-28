package com.gabrielMJr.twaire.physic.units;

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
	public Double toKilometer(double value, String unit)  
    {
		double res = (value * Double.valueOf(KILOMETER)) /
			Double.valueOf(unit);
		return res;
    }

	@Override
	public Double toHectometer(double value, String unit)
    {
		double res = (value * Double.valueOf(HECTOMETER)) / Double.valueOf(unit);
		return res;
    }

	@Override
	public Double toDecameter(double value, String unit)
    {
		double res = (value * Double.valueOf(DECAMETER)) / Double.valueOf(unit);
		return res;
    }

	@Override
	public Double toMeter(double value, String unit)
    {
		double res = (value * Double.valueOf(METER)) / Double.valueOf(unit);
		return res;
    }

	@Override
	public Double toDecimeter(double value, String unit)
    {
		double res = (value * Double.valueOf(DECIMETER)) / Double.valueOf(unit);
		return res;
    }

	@Override
	public Double toCentimeter(double value, String unit)
    {
		double res = (value * Double.valueOf(CENTIMETER)) / Double.valueOf(unit);
		return res;
    }

	@Override
	public Double toMillimeter(double value, String unit)
    {
		double res = (value * Double.valueOf(MILLIMETER)) / Double.valueOf(unit);
		return res;
    }

    protected static Length getInstance()
    {
		if (!(instance instanceof Length))
			instance = new Length();
		return instance;
    }
}
