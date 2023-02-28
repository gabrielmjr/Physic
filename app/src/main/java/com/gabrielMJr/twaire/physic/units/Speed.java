package com.gabrielMJr.twaire.physic.units;

import java.math.BigDecimal;

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
	public BigDecimal toKilometerPerSecond(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		BigDecimal newLength = length.toKilometer(value, units[0]);
		BigDecimal newTime = time.toSecond(1.0, units[1]);
		return newLength.divide(newTime);
	}

	@Override
	public BigDecimal toHectometerPerSecond(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		BigDecimal newLength = length.toHectometer(value, units[0]);
		BigDecimal newTime = time.toSecond(1.0, units[1]);
		return newLength.divide(newTime);
	}

	@Override
	public BigDecimal toDecameterPerSecond(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		BigDecimal newLenght = length.toDecameter(value, units[0]);
		BigDecimal newTime = time.toSecond(1.0, units[1]);
		return newLenght.divide(newTime);
	}

	@Override
	public BigDecimal toMeterPerSecond(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		BigDecimal newLength = length.toMeter(value, units[0]);
		BigDecimal newTime = time.toSecond(1.0, units[1]);
		return newLength.divide(newTime);
	}

	@Override
	public BigDecimal toDecimeterPerSecond(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		BigDecimal newLength = length.toDecimeter(value, units[0]);
		BigDecimal newTime = time.toSecond(1.0, units[1]);
		return newLength.divide(newTime);
	}

	@Override
	public BigDecimal toCentimeterPerSecond(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		BigDecimal newLength = length.toCentimeter(value, units[0]);
		BigDecimal newTime = time.toSecond(1.0, units[1]);
		return newLength.divide(newTime);
	}

	@Override
	public BigDecimal toMillimeterPerSecond(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		BigDecimal newLength = length.toMillimeter(value, units[0]);
		BigDecimal newTime = time.toSecond(1.0, units[1]);
		return newLength.divide(newTime);
	}

	@Override
	public BigDecimal toKilometerPerMinute(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		BigDecimal newLength = length.toKilometer(value, units[0]);
		BigDecimal newTime = time.toMinute(1.0, units[1]);
		return newLength.divide(newTime);
	}
	
	@Override
	public BigDecimal toHectometerPerMinute(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		BigDecimal newLength = length.toHectometer(value, units[0]);
		BigDecimal newTime = time.toMinute(1.0, units[1]);
		return newLength.divide(newTime);
	}

	@Override
	public BigDecimal toDecameterPerMinute(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		BigDecimal newLength = length.toDecameter(value, units[0]);
		BigDecimal newTime = time.toMinute(1.0, units[1]);
		return newLength.divide(newTime);
	}

	@Override
	public BigDecimal toMeterPerMinute(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		BigDecimal newLength = length.toMeter(value, units[0]);
		BigDecimal newTime = time.toMinute(1.0, units[1]);
		return newLength.divide(newTime);
	}

	@Override
	public BigDecimal toDecimeterPerMinute(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		BigDecimal newLength = length.toDecimeter(value, units[0]);
		BigDecimal newTime = time.toMinute(1.0, units[1]);
		return newLength.divide(newTime);
	}

	@Override
	public BigDecimal toCentimeterPerMinute(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		BigDecimal newLength = length.toCentimeter(value, units[0]);
		BigDecimal newTime = time.toMinute(1.0, units[1]);
		return newLength.divide(newTime);
	}

	@Override
	public BigDecimal toMillimeterPerMinute(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		BigDecimal newLength = length.toMillimeter(value, units[0]);
		BigDecimal newTime = time.toMinute(1.0, units[1]);
		return newLength.divide(newTime);
	}
	
	@Override
	public BigDecimal toKilometerPerHour(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		BigDecimal newLength = length.toKilometer(value, units[0]);
		BigDecimal newTime = time.toHour(1.0, units[1]);
		return newLength.divide(newTime);
	}
	
	@Override
	public BigDecimal toHectometerPerHour(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		BigDecimal newLength = length.toHectometer(value, units[0]);
		BigDecimal newTime = time.toHour(1.0, units[1]);
		return newLength.divide(newTime);
	}
	
	@Override
	public BigDecimal toDecameterPerHour(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		BigDecimal newLength = length.toDecameter(value, units[0]);
		BigDecimal newTime = time.toHour(1.0, units[1]);
		return newLength.divide(newTime);
	}

	@Override
	public BigDecimal toMeterPerHour(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		BigDecimal newLength = length.toMeter(value, units[0]);
		BigDecimal newTime = time.toHour(1.0, units[1]);
		return newLength.divide(newTime);
	}

	@Override
	public BigDecimal toDecimeterPerHour(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		BigDecimal newLength = length.toDecimeter(value, units[0]);
		BigDecimal newTime = time.toHour(1.0, units[1]);
		return newLength.divide(newTime);
	}

	@Override
	public BigDecimal toCentimeterPerHour(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		BigDecimal newLength = length.toCentimeter(value, units[0]);
		BigDecimal newTime = time.toHour(1.0, units[1]);
		return newLength.divide(newTime);
	}

	@Override
	public BigDecimal toMillimeterPerHour(double value, String unit)
	{
		/*
		 * [0] = length
		 * [1] = time
		 */
		String[] units = unit.split("/");
		BigDecimal newLength = length.toMillimeter(value, units[0]);
		BigDecimal newTime = time.toHour(1.0, units[1]);
		return newLength.divide(newTime);
	}

	protected static Speed getInstance()
	{
		if (!(instance instanceof Speed))
		    instance = new Speed();
		return instance;
	}
}
