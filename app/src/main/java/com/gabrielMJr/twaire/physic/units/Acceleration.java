package com.gabrielMJr.twaire.physic.units;

import java.math.BigDecimal;

import static com.gabrielMJr.twaire.physic.units.Time.SQUARE_SECOND;
import static com.gabrielMJr.twaire.physic.units.Time.SQUARE_MINUTE;
import static com.gabrielMJr.twaire.physic.units.Time.SQUARE_HOUR;

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
	public static final String KILOMETER_PER_SQUARE_SECOND = KILOMETER + "/" + SQUARE_SECOND;
	public static final String HECTOMETER_PER_SQUARE_SECOND = HECTOMETER + "/" + SQUARE_SECOND;
	public static final String DECAMETER_PER_SQUARE_SECOND = DECAMETER + "/" + SQUARE_SECOND;
	public static final String METER_PER_SQUARE_SECOND = METER + "/" + SQUARE_SECOND;
	public static final String DECIMETER_PER_SQUARE_SECOND = DECIMETER + "/" + SQUARE_SECOND;
	public static final String CENTIMETER_PER_SQUARE_SECOND = CENTIMETER + "/" + SQUARE_SECOND;
	public static final String MILLIMETER_PER_SQUARE_SECOND = MILLIMETER + "/" + SQUARE_SECOND;

	public static final String KILOMETER_PER_SQUARE_MINUTE = KILOMETER + "/" + SQUARE_MINUTE;
	public static final String HECTOMETER_PER_SQUARE_MIMUTE = HECTOMETER + "/" + SQUARE_MINUTE;
	public static final String DECAMETER_PER_SQUARE_MINUTE = DECAMETER + "/" + SQUARE_MINUTE;
	public static final String METER_PER_SQUARE_MINUTE = METER + "/" + SQUARE_MINUTE;
	public static final String DECIMETER_PER_SQUARE_MINUTE = DECIMETER + "/" + SQUARE_MINUTE;
	public static final String CENTIMETER_PER_SQUARE_MINUTE = CENTIMETER + "/" + SQUARE_MINUTE;
	public static final String MILLIMETER_PER_SQUARE_MINUTE = MILLIMETER + "/" + SQUARE_MINUTE;

	public static final String KILOMETER_PER_SQUARE_HOUR = KILOMETER + "/" + SQUARE_HOUR;
	public static final String HECTOMETER_PER_SQUARE_HOUR = HECTOMETER + "/" + SQUARE_HOUR;
	public static final String DECAMETER_PER_SQUARE_HOUR = DECAMETER + "/" + SQUARE_HOUR;
    public static final String METER_PER_SQUARE_HOUR = METER + "/" + SQUARE_HOUR;
    public static final String DECIMETER_PER_SQUARE_HOUR = DECIMETER + "/" + SQUARE_HOUR;
    public static final String CENTIMETER_PER_SQUARE_HOUR = CENTIMETER + "/" + SQUARE_HOUR;
    public static final String MILLIMETER_PER_SQUARE_HOUR = MILLIMETER + "/" + SQUARE_HOUR;

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
	public BigDecimal toKilometerSquarePerSecond(double value, String unit)
	{
		return null;
	}

	@Override
	public BigDecimal toHectometerSquarePerSecond(double value, String unit)
	{
		return null;
	}

	@Override
	public BigDecimal toDecameterSquarePerSecond(double value, String unit)
	{
		return null;
	}

	@Override
	public BigDecimal toMeterSquarePerSecond(double value, String unit)
	{
		return null;
	}

	@Override
	public BigDecimal toDecimeterSquarePerSecond(double value, String unit)
	{
		return null;
	}

	@Override
	public BigDecimal toCentimeterSquarePerSecond(double value, String unit)
	{
		return null;
	}

	@Override
	public BigDecimal toMillimeterSquarePerSecond(double value, String unit)
	{
		return null;
	}

}
