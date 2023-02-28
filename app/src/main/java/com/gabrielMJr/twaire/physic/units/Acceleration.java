package com.gabrielMJr.twaire.physic.units;

import static com.gabrielMJr.twaire.physic.units.Time.SECOND_SQUARED;
import static com.gabrielMJr.twaire.physic.units.Time.MINUTE_SQUARED;
import static com.gabrielMJr.twaire.physic.units.Time.HOUR_SQUARED;

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


public class Acceleration implements AccelerationIF
{
	public static final String KILOMETER_PER_SQUARE_SECOND = KILOMETER + "/" + SECOND_SQUARED;
	public static final String HECTOMETER_PER_SQUARE_SECOND = HECTOMETER + "/" + SECOND_SQUARED;
	public static final String DECAMETER_PER_SQUARE_SECOND = DECAMETER + "/" + SECOND_SQUARED;
	public static final String METER_PER_SQUARE_SECOND = METER + "/" + SECOND_SQUARED;
	public static final String DECIMETER_PER_SQUARE_SECOND = DECIMETER + "/" + SECOND_SQUARED;
	public static final String CENTIMETER_PER_SQUARE_SECOND = CENTIMETER + "/" + SECOND_SQUARED;
	public static final String MILLIMETER_PER_SQUARE_SECOND = MILLIMETER + "/" + SECOND_SQUARED;

	public static final String KILOMETER_PER_SQUARE_MINUTE = KILOMETER + "/" + MINUTE_SQUARED;
	public static final String HECTOMETER_PER_SQUARE_MIMUTE = HECTOMETER + "/" + MINUTE_SQUARED;
	public static final String DECAMETER_PER_SQUARE_MINUTE = DECAMETER + "/" + MINUTE_SQUARED;
	public static final String METER_PER_SQUARE_MINUTE = METER + "/" + MINUTE_SQUARED;
	public static final String DECIMETER_PER_SQUARE_MINUTE = DECIMETER + "/" + MINUTE_SQUARED;
	public static final String CENTIMETER_PER_SQUARE_MINUTE = CENTIMETER + "/" + MINUTE_SQUARED;
	public static final String MILLIMETER_PER_SQUARE_MINUTE = MILLIMETER + "/" + MINUTE_SQUARED;

	public static final String KILOMETER_PER_SQUARE_HOUR = KILOMETER + "/" + HOUR_SQUARED;
	public static final String HECTOMETER_PER_SQUARE_HOUR = HECTOMETER + "/" + HOUR_SQUARED;
	public static final String DECAMETER_PER_SQUARE_HOUR = DECAMETER + "/" + HOUR_SQUARED;
    public static final String METER_PER_SQUARE_HOUR = METER + "/" + HOUR_SQUARED;
    public static final String DECIMETER_PER_SQUARE_HOUR = DECIMETER + "/" + HOUR_SQUARED;
    public static final String CENTIMETER_PER_SQUARE_HOUR = CENTIMETER + "/" + HOUR_SQUARED;
    public static final String MILLIMETER_PER_SQUARE_HOUR = MILLIMETER + "/" + HOUR_SQUARED;

    public static final String KILOMETER_PER_SQUARE_SECOND_SYMBOL = KILOMETER_SYMBOL + "/s²";
    public static final String HECTOMETER_PER_SQUARE_SECOND_SYMBOL = HECTOMETER_SYMBOL + "/s²";
    public static final String DECAMETER_PER_SQUARE_SECOND_SYMBOL = DECAMETER_SYMBOL + "/s²";
    public static final String METER_PER_SQUARE_SECOND_SYMBOL = METER_SYMBOL + "/s²";
    public static final String DECIMETER_PER_SQUARE_SECOND_SYMBOL = DECIMETER_SYMBOL + "/s²";
    public static final String CENTIMETER_PER_SQUARE_SECOND_SYMBOL = CENTIMETER_SYMBOL + "cm/s²";
    public static final String MILLIMETER_PER_SQUARE_SECOND_SYMBOL = MILLIMETER_SYMBOL + "/s²";

    public static final String KILOMETER_PER_SQUARE_MINUTE_SYMBOL = KILOMETER_SYMBOL + "/min²";
    public static final String HECTOMETER_PER_SQUARE_MIMUTE_SYMBOL = HECTOMETER_SYMBOL + "/min²";
    public static final String DECAMETER_PER_SQUARE_MINUTE_SYMBOL = DECAMETER_SYMBOL + "/min²";
    public static final String METER_PER_SQUARE_MINUTE_SYMBOL = METER_SYMBOL + "/min²";
    public static final String DECIMETER_PER_SQUARE_MINUTE_SYMBOL = DECIMETER_SYMBOL + "/min²";
    public static final String CENTIMETER_PER_SQUARE_MINUTE_SYMBOL = CENTIMETER_SYMBOL + "/min²";
    public static final String MILLIMETER_PER_SQUARE_MINUTE_SYMBOL = MILLIMETER_SYMBOL + "/min²";

    public static final String KILOMETER_PER_SQUARE_HOUR_SYMBOL = KILOMETER_SYMBOL + "/h²";
    public static final String HECTOMETER_PER_SQUARE_HOUR_SYMBOL = HECTOMETER_SYMBOL + "/h²";
    public static final String DECAMETER_PER_SQUARE_HOUR_SYMBOL = DECAMETER_SYMBOL + "/h²";
    public static final String METER_PER_SQUARE_HOUR_SYMBOL = METER_SYMBOL + "/h²";
    public static final String DECIMETER_PER_SQUARE_HOUR_SYMBOL = DECIMETER_SYMBOL + "/h²";
    public static final String CENTIMETER_PER_SQUARE_HOUR_SYMBOL = CENTIMETER_SYMBOL + "/h²";
    public static final String MILLIMETER_PER_SQUARE_HOUR_SYMBOL = MILLIMETER_SYMBOL + "/h²";

	private Length length;
	private Time time;


	public Acceleration()
	{
		length = Length.getInstance();
		time = Time.getInstance();
	}


	@Override
	public Double toKilometerSquarePerSecond(double value, String unit)
	{
		return null;
	}

	@Override
	public Double toHectometerSquarePerSecond(double value, String unit)
	{
		return null;
	}

	@Override
	public Double toDecameterSquarePerSecond(double value, String unit)
	{
		return null;
	}

	@Override
	public Double toMeterSquarePerSecond(double value, String unit)
	{
		return null;
	}

	@Override
	public Double toDecimeterSquarePerSecond(double value, String unit)
	{
		return null;
	}

	@Override
	public Double toCentimeterSquarePerSecond(double value, String unit)
	{
		return null;
	}

	@Override
	public Double toMillimeterSquarePerSecond(double value, String unit)
	{
		return null;
	}

}
