package com.gabrielMJr.twaire.physic.units;

<<<<<<< Updated upstream
import static com.gabrielMJr.twaire.physic.units.Time.SECOND_SQUARED;
import static com.gabrielMJr.twaire.physic.units.Time.MINUTE_SQUARED;
import static com.gabrielMJr.twaire.physic.units.Time.HOUR_SQUARED;
=======
import java.math.BigDecimal;

import static com.gabrielMJr.twaire.physic.units.Length.LENGTH_SCALES;
import static com.gabrielMJr.twaire.physic.units.Time.TIME_SCALES;
>>>>>>> Stashed changes

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

import static com.gabrielMJr.twaire.physic.units.Time.SQUARE_SECOND_SYMBOL;
import static com.gabrielMJr.twaire.physic.units.Time.SQUARE_MINUTE_SYMBOL;
import static com.gabrielMJr.twaire.physic.units.Time.SQUARE_HOUR_SYMBOL;


public class Acceleration implements AccelerationIF
{
<<<<<<< Updated upstream
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
=======
	public static final int KILOMETER_PER_SQUARE_SECOND = 52;
	public static final int HECTOMETER_PER_SQUARE_SECOND = 53;
	public static final int DECAMETER_PER_SQUARE_SECOND = 54;
	public static final int METER_PER_SQUARE_SECOND = 55;
	public static final int DECIMETER_PER_SQUARE_SECOND = 56;
	public static final int CENTIMETER_PER_SQUARE_SECOND = 57;
	public static final int MILLIMETER_PER_SQUARE_SECOND = 58;

	public static final int KILOMETER_PER_SQUARE_MINUTE = 59;
	public static final int HECTOMETER_PER_SQUARE_MINUTE = 60;
	public static final int DECAMETER_PER_SQUARE_MINUTE = 61;
	public static final int METER_PER_SQUARE_MINUTE = 62;
	public static final int DECIMETER_PER_SQUARE_MINUTE = 63;
	public static final int CENTIMETER_PER_SQUARE_MINUTE = 64;
	public static final int MILLIMETER_PER_SQUARE_MINUTE = 65;

	public static final int KILOMETER_PER_SQUARE_HOUR = 66;
	public static final int HECTOMETER_PER_SQUARE_HOUR = 67;
	public static final int DECAMETER_PER_SQUARE_HOUR = 68;
	public static final int METER_PER_SQUARE_HOUR = 69;
	public static final int DECIMETER_PER_SQUARE_HOUR = 70;
	public static final int CENTIMETER_PER_SQUARE_HOUR = 71;
	public static final int MILLIMETER_PER_SQUARE_HOUR = 72;
	
	protected final BigDecimal[] ACCELERATION_SCALES = new BigDecimal[]
	{
		LENGTH_SCALES[KILOMETER].divide(TIME_SCALES[SECOND].pow(2)),
		LENGTH_SCALES[HECTOMETER].divide(TIME_SCALES[SECOND].pow(2)),
		LENGTH_SCALES[DECAMETER].divide(TIME_SCALES[SECOND].pow(2)),
		LENGTH_SCALES[METER].divide(TIME_SCALES[SECOND].pow(2)),
		LENGTH_SCALES[DECIMETER].divide(TIME_SCALES[SECOND].pow(2)),
		LENGTH_SCALES[CENTIMETER].divide(TIME_SCALES[SECOND].pow(2)),
		LENGTH_SCALES[MILLIMETER].divide(TIME_SCALES[SECOND].pow(2)),
>>>>>>> Stashed changes

		LENGTH_SCALES[KILOMETER].divide(TIME_SCALES[MINUTE].pow(2)),
		LENGTH_SCALES[HECTOMETER].divide(TIME_SCALES[MINUTE].pow(2)),
		LENGTH_SCALES[DECAMETER].divide(TIME_SCALES[MINUTE].pow(2)),
		LENGTH_SCALES[METER].divide(TIME_SCALES[MINUTE].pow(2)),
		LENGTH_SCALES[DECIMETER].divide(TIME_SCALES[MINUTE].pow(2)),
		LENGTH_SCALES[CENTIMETER].divide(TIME_SCALES[MINUTE].pow(2)),
		LENGTH_SCALES[MILLIMETER].divide(TIME_SCALES[MINUTE].pow(2)),

		LENGTH_SCALES[KILOMETER].divide(TIME_SCALES[HOUR].pow(2)),
		LENGTH_SCALES[HECTOMETER].divide(TIME_SCALES[HOUR].pow(2)),
		LENGTH_SCALES[DECAMETER].divide(TIME_SCALES[HOUR].pow(2)),
		LENGTH_SCALES[METER].divide(TIME_SCALES[HOUR].pow(2)),
		LENGTH_SCALES[DECIMETER].divide(TIME_SCALES[HOUR].pow(2)),
		LENGTH_SCALES[CENTIMETER].divide(TIME_SCALES[HOUR].pow(2)),
		LENGTH_SCALES[MILLIMETER].divide(TIME_SCALES[HOUR].pow(2))
	};
	
	public static final String KILOMETER_PER_SQUARE_SECOND_SYMBOL = KILOMETER_SYMBOL + "/" + SQUARE_SECOND_SYMBOL;
	public static final String HECTOMETER_PER_SQUARE_SECOND_SYMBOL = HECTOMETER_SYMBOL + "/" + SQUARE_SECOND_SYMBOL;
	public static final String DECAMETER_PER_SQUARE_SECOND_SYMBOL = DECAMETER_SYMBOL + "/" + SQUARE_SECOND_SYMBOL;
	public static final String METER_PER_SQUARE_SECOND_SYMBOL = METER_SYMBOL + "/" + SQUARE_SECOND_SYMBOL;
	public static final String DECIMETER_PER_SQUARE_SECOND_SYMBOL = DECIMETER_SYMBOL + "/" + SQUARE_SECOND_SYMBOL;
	public static final String CENTIMETER_PER_SQUARE_SECOND_SYMBOL = CENTIMETER_SYMBOL + "/" + SQUARE_SECOND_SYMBOL;
	public static final String MILLIMETER_PER_SQUARE_SECOND_SYMBOL = MILLIMETER_SYMBOL + "/" + SQUARE_SECOND_SYMBOL;

	public static final String KILOMETER_PER_SQUARE_MINUTE_SYMBOL = KILOMETER_SYMBOL + "/" + SQUARE_MINUTE_SYMBOL;
	public static final String HECTOMETER_PER_SQUARE_MINUTE_SYMBOL = HECTOMETER_SYMBOL + "/" + SQUARE_MINUTE_SYMBOL;
	public static final String DECAMETER_PER_SQUARE_MINUTE_SYMBOL = DECAMETER_SYMBOL + "/" + SQUARE_MINUTE_SYMBOL;
	public static final String METER_PER_SQUARE_MINUTE_SYMBOL = METER_SYMBOL + "/" + SQUARE_MINUTE_SYMBOL;
	public static final String DECIMETER_PER_SQUARE_MINUTE_SYMBOL = DECIMETER_SYMBOL + "/" + SQUARE_MINUTE_SYMBOL;
	public static final String CENTIMETER_PER_SQUARE_MINUTE_SYMBOL = CENTIMETER_SYMBOL + "/" + SQUARE_MINUTE_SYMBOL;
	public static final String MILLIMETER_PER_SQUARE_MINUTE_SYMBOL = MILLIMETER_SYMBOL + "/" + SQUARE_MINUTE_SYMBOL;

	public static final String KILOMETER_PER_SQUARE_HOUR_SYMBOL = KILOMETER_SYMBOL + "/" + SQUARE_HOUR_SYMBOL;
	public static final String HECTOMETER_PER_SQUARE_HOUR_SYMBOL = HECTOMETER_SYMBOL + "/" + SQUARE_HOUR_SYMBOL;
	public static final String DECAMETER_PER_SQUARE_HOUR_SYMBOL = DECAMETER_SYMBOL + "/" + SQUARE_HOUR_SYMBOL;
	public static final String METER_PER_SQUARE_HOUR_SYMBOL = METER_SYMBOL + "/" + SQUARE_HOUR_SYMBOL;
	public static final String DECIMETER_PER_SQUARE_HOUR_SYMBOL = DECIMETER_SYMBOL + "/" + SQUARE_HOUR_SYMBOL;
	public static final String CENTIMETER_PER_SQUARE_HOUR_SYMBOL = CENTIMETER_SYMBOL + "/" + SQUARE_HOUR_SYMBOL;
	public static final String MILLIMETER_PER_SQUARE_HOUR_SYMBOL = MILLIMETER_SYMBOL + "/" + SQUARE_HOUR_SYMBOL;
	

	public Acceleration()
	{}

	@Override
<<<<<<< Updated upstream
	public Double toKilometerSquarePerSecond(double value, String unit)
	{
=======
	public BigDecimal toKilometerPerSquareSecond(double value, int unit) {
	    if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit]).divide(ACCELERATION_SCALES[52]);
>>>>>>> Stashed changes
		return null;
	}

	@Override
<<<<<<< Updated upstream
	public Double toHectometerSquarePerSecond(double value, String unit)
	{
=======
	public BigDecimal toHectometerPerSquareSecond(double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit]).divide(ACCELERATION_SCALES[53]);
>>>>>>> Stashed changes
		return null;
	}

	@Override
<<<<<<< Updated upstream
	public Double toDecameterSquarePerSecond(double value, String unit)
	{
=======
	public BigDecimal toDecameterPerSquareSecond(double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit]).divide(ACCELERATION_SCALES[54]);
>>>>>>> Stashed changes
		return null;
	}

	@Override
<<<<<<< Updated upstream
	public Double toMeterSquarePerSecond(double value, String unit)
	{
=======
	public BigDecimal toMeterPerSquareSecond(double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit]).divide(ACCELERATION_SCALES[55]);
>>>>>>> Stashed changes
		return null;
	}

	@Override
<<<<<<< Updated upstream
	public Double toDecimeterSquarePerSecond(double value, String unit)
	{
=======
	public BigDecimal toDecimeterPerSquareSecond(double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit]).divide(ACCELERATION_SCALES[56]);
>>>>>>> Stashed changes
		return null;
	}

	@Override
<<<<<<< Updated upstream
	public Double toCentimeterSquarePerSecond(double value, String unit)
	{
=======
	public BigDecimal toCentimeterPerSquareSecond(double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit]).divide(ACCELERATION_SCALES[57]);
>>>>>>> Stashed changes
		return null;
	}

	@Override
<<<<<<< Updated upstream
	public Double toMillimeterSquarePerSecond(double value, String unit)
	{
=======
	public BigDecimal toMillimeterPerSquareSecond(double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit]).divide(ACCELERATION_SCALES[58]);
>>>>>>> Stashed changes
		return null;
	}

	@Override
	public BigDecimal toKilometerPerSquareMinute(double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit]).divide(ACCELERATION_SCALES[59]);
		return null;
	}

	@Override
	public BigDecimal toHectometerPerSquareMinute(double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit]).divide(ACCELERATION_SCALES[60]);
		return null;
	}

	@Override
	public BigDecimal toDecameterPerSquareMinute(double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit]).divide(ACCELERATION_SCALES[61]);
		return null;
	}

	@Override
	public BigDecimal toMeterPerSquareMinute(double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit]).divide(ACCELERATION_SCALES[62]);
		return null;
	}

	@Override
	public BigDecimal toDecimeterPerSquareMinute(double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit]).divide(ACCELERATION_SCALES[63]);
		return null;
	}

	@Override
	public BigDecimal toCentimeterPerSquareMinute(double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit]).divide(ACCELERATION_SCALES[64]);
		return null;
	}

	@Override
	public BigDecimal toMillimeterPerSquareMinute(double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit]).divide(ACCELERATION_SCALES[65]);
		return null;
	}

	@Override
	public BigDecimal toKilometerPerSquareHour(double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit]).divide(ACCELERATION_SCALES[66]);
		return null;
	}

	@Override
	public BigDecimal toHectometerPerSquareHour(double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit]).divide(ACCELERATION_SCALES[67]);
		return null;
	}

	@Override
	public BigDecimal toDecameterPerSquareHour(double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit]).divide(ACCELERATION_SCALES[68]);
		return null;
	}

	@Override
	public BigDecimal toMeterPerSquareHour(double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit]).divide(ACCELERATION_SCALES[69]);
		return null;
	}

	@Override
	public BigDecimal toDecimeterPerSquareHour(double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit]).divide(ACCELERATION_SCALES[70]);
		return null;
	}

	@Override
	public BigDecimal toCentimeterPerSquareHour(double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit]).divide(ACCELERATION_SCALES[71]);
		return null;
	}

	@Override
	public BigDecimal toMillimeterPerSquareHour(double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit]).divide(ACCELERATION_SCALES[72]);
		return null;
	}
}
