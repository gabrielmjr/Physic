package com.gabrielMJr.twaire.physic.units;

import java.math.BigDecimal;

import static com.gabrielMJr.twaire.physic.units.Length.LENGTH_SCALES;
import static com.gabrielMJr.twaire.physic.units.Time.TIME_SCALES;

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

	public static final int KILOMETER_PER_SECOND = 31;
	public static final int HECTOMETER_PER_SECOND = 32;
	public static final int DECAMETER_PER_SECOND = 33;
	public static final int METER_PER_SECOND = 34;
	public static final int DECIMETER_PER_SECOND = 35;
	public static final int CENTIMETER_PER_SECOND = 36;
	public static final int MILLIMETER_PER_SECOND = 37;

	public static final int KILOMETER_PER_MINUTE = 38;
	public static final int HECTOMETER_PER_MINUTE = 39;
	public static final int DECAMETER_PER_MINUTE = 40;
	public static final int METER_PER_MINUTE = 41;
	public static final int DECIMETER_PER_MINUTE = 42;
	public static final int CENTIMETER_PER_MINUTE = 43;
	public static final int MILLIMETER_PER_MINUTE = 44;

	public static final int KILOMETER_PER_HOUR = 45;
	public static final int HECTOMETER_PER_HOUR = 46;
	public static final int DECAMETER_PER_HOUR = 47;
	public static final int METER_PER_HOUR = 48;
	public static final int DECIMETER_PER_HOUR = 39;
	public static final int CENTIMETER_PER_HOUR = 50;
	public static final int MILLIMETER_PER_HOUR = 51;

	protected final BigDecimal[] SPEED_SCALES = new BigDecimal[]
	{
		LENGTH_SCALES[KILOMETER].divide(TIME_SCALES[SECOND]),
		LENGTH_SCALES[HECTOMETER].divide(TIME_SCALES[SECOND]),
		LENGTH_SCALES[DECAMETER].divide(TIME_SCALES[SECOND]),
		LENGTH_SCALES[METER].divide(TIME_SCALES[SECOND]),
		LENGTH_SCALES[DECIMETER].divide(TIME_SCALES[SECOND]),
		LENGTH_SCALES[CENTIMETER].divide(TIME_SCALES[SECOND]),
		LENGTH_SCALES[MILLIMETER].divide(TIME_SCALES[SECOND]),
		
		LENGTH_SCALES[KILOMETER].divide(TIME_SCALES[MINUTE]),
		LENGTH_SCALES[HECTOMETER].divide(TIME_SCALES[MINUTE]),
		LENGTH_SCALES[DECAMETER].divide(TIME_SCALES[MINUTE]),
		LENGTH_SCALES[METER].divide(TIME_SCALES[MINUTE]),
		LENGTH_SCALES[DECIMETER].divide(TIME_SCALES[MINUTE]),
		LENGTH_SCALES[CENTIMETER].divide(TIME_SCALES[MINUTE]),
		LENGTH_SCALES[MILLIMETER].divide(TIME_SCALES[MINUTE]),
		
		LENGTH_SCALES[KILOMETER].divide(TIME_SCALES[HOUR]),
		LENGTH_SCALES[HECTOMETER].divide(TIME_SCALES[HOUR]),
		LENGTH_SCALES[DECAMETER].divide(TIME_SCALES[HOUR]),
		LENGTH_SCALES[METER].divide(TIME_SCALES[HOUR]),
		LENGTH_SCALES[DECIMETER].divide(TIME_SCALES[HOUR]),
		LENGTH_SCALES[CENTIMETER].divide(TIME_SCALES[HOUR]),
		LENGTH_SCALES[MILLIMETER].divide(TIME_SCALES[HOUR])
	};
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
	public BigDecimal toKilometerPerSecond(double value, int unit)
	{
		if (unit >= 31 && unit <= 51)
			return BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit- 31]).divide(SPEED_SCALES[0]);
		return null;
	}

	@Override
	public BigDecimal toHectometerPerSecond(double value, int unit)
	{
	    if (unit >= 31 && unit <= 51)
			return BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit- 31]).divide(SPEED_SCALES[1]);
		return null;
	}

	@Override
	public BigDecimal toDecameterPerSecond(double value, int unit)
	{
		if (unit >= 31 && unit <= 51)
			return BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit- 31]).divide(SPEED_SCALES[2]);
		return null;
	}

	@Override
	public BigDecimal toMeterPerSecond(double value, int unit)
	{
		if (unit >= 31 && unit <= 51)
			return BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit- 31]).divide(SPEED_SCALES[3]);
		return null;
	}

	@Override
	public BigDecimal toDecimeterPerSecond(double value, int unit)
	{
		if (unit >= 31 && unit <= 51)
			return BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit- 31]).divide(SPEED_SCALES[4]);
		return null;
	}

	@Override
	public BigDecimal toCentimeterPerSecond(double value, int unit)
	{
		if (unit >= 31 && unit <= 51)
			return BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit- 31]).divide(SPEED_SCALES[5]);
		return null;
	}

	@Override
	public BigDecimal toMillimeterPerSecond(double value, int unit)
	{
		if (unit >= 31 && unit <= 51)
			return BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit- 31]).divide(SPEED_SCALES[6]);
		return null;
	}

	@Override
	public BigDecimal toKilometerPerMinute(double value, int unit)
	{
		if (unit >= 31 && unit <= 51)
			return BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit- 31]).divide(SPEED_SCALES[7]);
		return null;
	}
	
	@Override
	public BigDecimal toHectometerPerMinute(double value, int unit)
	{
		if (unit >= 31 && unit <= 51)
			return BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit- 31]).divide(SPEED_SCALES[8]);
		return null;
	}

	@Override
	public BigDecimal toDecameterPerMinute(double value, int unit)
	{
		if (unit >= 31 && unit <= 51)
			return BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit- 31]).divide(SPEED_SCALES[9]);
		return null;
	}

	@Override
	public BigDecimal toMeterPerMinute(double value, int unit)
	{
		if (unit >= 31 && unit <= 51)
			return BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit- 31]).divide(SPEED_SCALES[10]);
		return null;
	}

	@Override
	public BigDecimal toDecimeterPerMinute(double value, int unit)
	{
		if (unit >= 31 && unit <= 51)
			return BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit- 31]).divide(SPEED_SCALES[11]);
		return null;
	}

	@Override
	public BigDecimal toCentimeterPerMinute(double value, int unit)
	{
		if (unit >= 31 && unit <= 51)
			return BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit- 31]).divide(SPEED_SCALES[12]);
		return null;
	}

	@Override
	public BigDecimal toMillimeterPerMinute(double value, int unit)
	{
		if (unit >= 31 && unit <= 51)
			return BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit- 31]).divide(SPEED_SCALES[13]);
		return null;
	}
	
	@Override
	public BigDecimal toKilometerPerHour(double value, int unit)
	{
		if (unit >= 31 && unit <= 51)
			return BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit- 31]).divide(SPEED_SCALES[14]);
		return null;
	}
	
	@Override
	public BigDecimal toHectometerPerHour(double value, int unit)
	{
		if (unit >= 31 && unit <= 51)
			return BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit- 31]).divide(SPEED_SCALES[15]);
		return null;
	}
	
	@Override
	public BigDecimal toDecameterPerHour(double value, int unit)
	{
		if (unit >= 31 && unit <= 51)
			return BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit- 31]).divide(SPEED_SCALES[16]);
		return null;
	}

	@Override
	public BigDecimal toMeterPerHour(double value, int unit)
	{
		if (unit >= 31 && unit <= 51)
			return BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit- 31]).divide(SPEED_SCALES[17]);
		return null;
	}

	@Override
	public BigDecimal toDecimeterPerHour(double value, int unit)
	{
		if (unit >= 31 && unit <= 51)
			return BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit- 31]).divide(SPEED_SCALES[18]);
		return null;
	}

	@Override
	public BigDecimal toCentimeterPerHour(double value, int unit)
	{
		if (unit >= 31 && unit <= 51)
			return BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit- 31]).divide(SPEED_SCALES[19]);
		return null;
	}

	@Override
	public BigDecimal toMillimeterPerHour(double value, int unit)
	{
		if (unit >= 31 && unit <= 51)
			return BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit- 31]).divide(SPEED_SCALES[20]);
		return null;
	}

	protected static Speed getInstance()
	{
		if (!(instance instanceof Speed))
		    instance = new Speed();
		return instance;
	}
}
