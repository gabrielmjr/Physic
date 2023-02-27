package com.gabrielMJr.twaire.physic.units;

import static com.gabrielMJr.twaire.physic.units.Length.KILOMETER;
import static com.gabrielMJr.twaire.physic.units.Length.HECTOMETER;
import static com.gabrielMJr.twaire.physic.units.Length.DECAMETER;
import static com.gabrielMJr.twaire.physic.units.Length.METER;
import static com.gabrielMJr.twaire.physic.units.Length.DECIMETER;
import static com.gabrielMJr.twaire.physic.units.Length.CENTIMETER;
import static com.gabrielMJr.twaire.physic.units.Length.MILLIMETER;

import static com.gabrielMJr.twaire.physic.units.Time.SECOND;
import static com.gabrielMJr.twaire.physic.units.Time.MINUTE;
import static com.gabrielMJr.twaire.physic.units.Time.HOUR;

import static com.gabrielMJr.twaire.physic.units.Length.KILOMETER_SYMBOL;
import static com.gabrielMJr.twaire.physic.units.Length.HECTOMETER_SYMBOL;
import static com.gabrielMJr.twaire.physic.units.Length.DECAMETER_SYMBOL;
import static com.gabrielMJr.twaire.physic.units.Length.METER_SYMBOL;
import static com.gabrielMJr.twaire.physic.units.Length.DECIMETER_SYMBOL;
import static com.gabrielMJr.twaire.physic.units.Length.CENTIMETER_SYMBOL;
import static com.gabrielMJr.twaire.physic.units.Length.MILLIMETER_SYMBOL;

import static com.gabrielMJr.twaire.physic.units.Time.SECOND_SYMBOL;
import static com.gabrielMJr.twaire.physic.units.Time.MINUTE_SYMBOL;
import static com.gabrielMJr.twaire.physic.units.Time.HOUR_SYMBOL;

public class Speed implements SpeedIF
{
	private static Speed instance; 

	private final Length length;
	private final Time time;

	public static final String KILOMETER_PER_SECOND = KILOMETER + "/" + SECOND;
	public static final String HECTOMETER_PER_SECOND = HECTOMETER + "/" + SECOND;
	public static final String DECAMETER_PER_SECOND = DECAMETER + "/" + SECOND;
	public static final String METER_PER_SECOND = METER + "/" + SECOND;
	public static final String DECIMETER_PER_SECOND = DECIMETER + "/" + SECOND;
	public static final String CENTIMETER_PER_SECOND = CENTIMETER + "/" + SECOND;
	public static final String MILLIMETER_PER_SECOND = MILLIMETER + "/" + SECOND;

	public static final String KILOMETER_PER_MINUTE = KILOMETER + "/" + MINUTE;
	public static final String HECTOMETER_PER_MINUTE = HECTOMETER + "/" + MINUTE;
	public static final String DECAMETER_PER_MINUTE = DECAMETER + "/" + MINUTE;
	public static final String METER_PER_MINUTE = METER + "/" + MINUTE;
	public static final String DECIMETER_PER_MINUTE = DECIMETER + "/" + MINUTE;
	public static final String CENTIMETER_PER_MINUTE = CENTIMETER + "/" + MINUTE;
	public static final String MILLIMETER_PER_MINUTE = MILLIMETER + "/" + MINUTE;

	public static final String KILOMETER_PER_HOUR = KILOMETER + "/" + HOUR;
	public static final String HECTOMETER_PER_HOUR = HECTOMETER + "/" + HOUR;
	public static final String DECAMETER_PER_HOUR = DECAMETER + "/" + HOUR;
	public static final String METER_PER_HOUR = METER + "/" + HOUR;
	public static final String DECIMETER_PER_HOUR = DECIMETER + "/" + HOUR;
	public static final String CENTIMETER_PER_HOUR = CENTIMETER + "/" + HOUR;
	public static final String MILLIMETER_PER_HOUR = MILLIMETER + "/" + HOUR;

	public static final String KILOMETER_PER_SECOND_SYMBOL = KILOMETER_SYMBOL + "/" + SECOND_SYMBOL;
	public static final String HECTOMETER_PER_SECOND_SYMBOL = HECTOMETER_SYMBOL + "/" + SECOND_SYMBOL;
	public static final String DECAMETER_PER_SECOND_SYMBOL = DECAMETER_SYMBOL + "/" + SECOND_SYMBOL;
	public static final String METER_PER_SECOND_SYMBOL = METER_SYMBOL + "/" + SECOND_SYMBOL;
	public static final String DECIMETER_PER_SECOND_SYMBOL = DECIMETER_SYMBOL + "/" + SECOND_SYMBOL;
	public static final String CENTIMETER_PER_SECOND_SYMBOL = CENTIMETER_SYMBOL + "/" + SECOND_SYMBOL;
	public static final String MILLIMETER_PER_SECOND_SYMBOL = MILLIMETER_SYMBOL + "/" + SECOND_SYMBOL;

	public static final String KILOMETER_PER_MINUTE_SYMBOL = KILOMETER_SYMBOL + "/" + MINUTE_SYMBOL;
	public static final String HECTOMETER_PER_MINUTE_SYMBOL = HECTOMETER_SYMBOL + "/" + MINUTE_SYMBOL;
	public static final String DECAMETER_PER_MINUTE_SYMBOL = DECAMETER_SYMBOL + "/" + MINUTE_SYMBOL;
	public static final String METER_PER_MINUTE_SYMBOL = METER_SYMBOL + "/" + MINUTE_SYMBOL;
	public static final String DECIMETER_PER_MINUTE_SYMBOL = DECIMETER_SYMBOL + "/" + MINUTE_SYMBOL;
	public static final String CENTIMETER_PER_MINUTE_SYMBOL = CENTIMETER_SYMBOL + "/" + MINUTE_SYMBOL;
	public static final String MILLIMETER_PER_MINUTE_SYMBOL = MILLIMETER_SYMBOL + "/" + MINUTE_SYMBOL;

	public static final String KILOMETER_PER_HOUR_SYMBOL = KILOMETER_SYMBOL + "/" + HOUR_SYMBOL;
	public static final String HECTOMETER_PER_HOUR_SYMBOL = HECTOMETER_SYMBOL + "/" + HOUR_SYMBOL;
	public static final String DECAMETER_PER_HOUR_SYMBOL = DECAMETER_SYMBOL + "/" + HOUR_SYMBOL;
	public static final String METER_PER_HOUR_SYMBOL = METER_SYMBOL + "/" + HOUR_SYMBOL;
	public static final String DECIMETER_PER_HOUR_SYMBOL = DECIMETER_SYMBOL + "/" + HOUR_SYMBOL;
	public static final String CENTIMETER_PER_HOUR_SYMBOL = CENTIMETER_SYMBOL + "/" + HOUR_SYMBOL;
	public static final String MILLIMETER_PER_HOUR_SYMBOL = MILLIMETER_SYMBOL + "/" + HOUR_SYMBOL;

	public Speed()
	{
		length = Length.getInstance();
		time = Time.getInstance();
	}
	
	@Override
	public Double toKilometerPerSecond(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		Double newLength = length.toKilometer(value, units[0]);
		Double newTime = time.toSecond(1.0, units[1]);
		return newLength / newTime;
	}

	@Override
	public Double toHectometerPerSecond(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		Double newLength = length.toHectometer(value, units[0]);
		Double newTime = time.toSecond(1.0, units[1]);
		return newLength / newTime;
	}

	@Override
	public Double toDecameterPerSecond(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		Double newLenght = length.toDecameter(value, units[0]);
		Double newTime = time.toSecond(1.0, units[1]);
		return newLenght / newTime;
	}

	@Override
	public Double toMeterPerSecond(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		Double newLength = length.toMeter(value, units[0]);
		Double newTime = time.toSecond(1.0, units[1]);
		return newLength / newTime;
	}

	@Override
	public Double toDecimeterPerSecond(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		Double newLength = length.toDecimeter(value, units[0]);
		Double newTime = time.toSecond(1.0, units[1]);
		return newLength / newTime;
	}

	@Override
	public Double toCentimeterPerSecond(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		Double newLength = length.toCentimeter(value, units[0]);
		Double newTime = time.toSecond(1.0, units[1]);
		return newLength / newTime;
	}

	@Override
	public Double toMillimeterPerSecond(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		Double newLength = length.toMillimeter(value, units[0]);
		Double newTime = time.toSecond(1.0, units[1]);
		return newLength / newTime;
	}

	@Override
	public Double toKilometerPerMinute(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		Double newLength = length.toKilometer(value, units[0]);
		Double newTime = time.toMinute(1.0, units[1]);
		return newLength / newTime;
	}
	
	@Override
	public Double toHectometerPerMinute(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		Double newLength = length.toHectometer(value, units[0]);
		Double newTime = time.toMinute(1.0, units[1]);
		return newLength / newTime;
	}

	@Override
	public Double toDecameterPerMinute(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		Double newLength = length.toDecameter(value, units[0]);
		Double newTime = time.toMinute(1.0, units[1]);
		return newLength / newTime;
	}

	@Override
	public Double toMeterPerMinute(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		Double newLength = length.toMeter(value, units[0]);
		Double newTime = time.toMinute(1.0, units[1]);
		return newLength / newTime;
	}

	@Override
	public Double toDecimeterPerMinute(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		Double newLength = length.toDecimeter(value, units[0]);
		Double newTime = time.toMinute(1.0, units[1]);
		return newLength / newTime;
	}

	@Override
	public Double toCentimeterPerMinute(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		Double newLength = length.toCentimeter(value, units[0]);
		Double newTime = time.toMinute(1.0, units[1]);
		return newLength / newTime;
	}

	@Override
	public Double toMillimeterPerMinute(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		Double newLength = length.toMillimeter(value, units[0]);
		Double newTime = time.toMinute(1.0, units[1]);
		return newLength / newTime;
	}
	
	@Override
	public Double toKilometerPerHour(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		Double newLength = length.toKilometer(value, units[0]);
		Double newTime = time.toHour(1.0, units[1]);
		return newLength / newTime;
	}
	
	@Override
	public Double toHectometerPerHour(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		Double newLength = length.toHectometer(value, units[0]);
		Double newTime = time.toHour(1.0, units[1]);
		return newLength / newTime;
	}
	
	@Override
	public Double toDecameterPerHour(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		Double newLength = length.toDecameter(value, units[0]);
		Double newTime = time.toHour(1.0, units[1]);
		return newLength / newTime;
	}

	@Override
	public Double toMeterPerHour(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		Double newLength = length.toMeter(value, units[0]);
		Double newTime = time.toHour(1.0, units[1]);
		return newLength / newTime;
	}

	@Override
	public Double toDecimeterPerHour(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		Double newLength = length.toDecimeter(value, units[0]);
		Double newTime = time.toHour(1.0, units[1]);
		return newLength / newTime;
	}

	@Override
	public Double toCentimeterPerHour(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		Double newLength = length.toCentimeter(value, units[0]);
		Double newTime = time.toHour(1.0, units[1]);
		return newLength / newTime;
	}

	@Override
	public Double toMillimeterPerHour(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		Double newLength = length.toMillimeter(value, units[0]);
		Double newTime = time.toHour(1.0, units[1]);
		return newLength / newTime;
	}

	protected static Speed getInstance()
	{
		if (!(instance instanceof Speed))
		    instance = new Speed();
		return instance;
	}
}
