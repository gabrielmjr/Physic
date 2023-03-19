package com.gabrielMJr.twaire.physic.units;

import java.math.BigDecimal;

import static com.gabrielMJr.twaire.physic.units.Length.LENGTH_SCALES;
import static com.gabrielMJr.twaire.physic.units.Time.SQUARE_TIME_SCALES;

import static com.gabrielMJr.twaire.physic.units.Length.KILOMETER;
import static com.gabrielMJr.twaire.physic.units.Length.HECTOMETER;
import static com.gabrielMJr.twaire.physic.units.Length.DECAMETER;
import static com.gabrielMJr.twaire.physic.units.Length.METER;
import static com.gabrielMJr.twaire.physic.units.Length.DECIMETER;
import static com.gabrielMJr.twaire.physic.units.Length.CENTIMETER;
import static com.gabrielMJr.twaire.physic.units.Length.MILLIMETER;

import static com.gabrielMJr.twaire.physic.units.Time.SQUARE_SECOND;
import static com.gabrielMJr.twaire.physic.units.Time.SQUARE_MINUTE;
import static com.gabrielMJr.twaire.physic.units.Time.SQUARE_HOUR;

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

public class Acceleration implements AccelerationIF {
	private static Acceleration instance;
	
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
		LENGTH_SCALES[KILOMETER].divide(SQUARE_TIME_SCALES[SQUARE_SECOND]),
		LENGTH_SCALES[HECTOMETER].divide(SQUARE_TIME_SCALES[SQUARE_SECOND]),
		LENGTH_SCALES[DECAMETER].divide(SQUARE_TIME_SCALES[SQUARE_SECOND]),
		LENGTH_SCALES[METER].divide(SQUARE_TIME_SCALES[SQUARE_SECOND]),
		LENGTH_SCALES[DECIMETER].divide(SQUARE_TIME_SCALES[SQUARE_SECOND]),
		LENGTH_SCALES[CENTIMETER].divide(SQUARE_TIME_SCALES[SQUARE_SECOND]),
		LENGTH_SCALES[MILLIMETER].divide(SQUARE_TIME_SCALES[SQUARE_SECOND]),

		LENGTH_SCALES[KILOMETER].divide(SQUARE_TIME_SCALES[SQUARE_MINUTE]),
		LENGTH_SCALES[HECTOMETER].divide(SQUARE_TIME_SCALES[SQUARE_MINUTE]),
		LENGTH_SCALES[DECAMETER].divide(SQUARE_TIME_SCALES[SQUARE_MINUTE]),
		LENGTH_SCALES[METER].divide(SQUARE_TIME_SCALES[SQUARE_MINUTE]),
		LENGTH_SCALES[DECIMETER].divide(SQUARE_TIME_SCALES[SQUARE_MINUTE]),
		LENGTH_SCALES[CENTIMETER].divide(SQUARE_TIME_SCALES[SQUARE_MINUTE]),
		LENGTH_SCALES[MILLIMETER].divide(SQUARE_TIME_SCALES[SQUARE_MINUTE]),

		LENGTH_SCALES[KILOMETER].divide(SQUARE_TIME_SCALES[SQUARE_HOUR]),
		LENGTH_SCALES[HECTOMETER].divide(SQUARE_TIME_SCALES[SQUARE_HOUR]),
		LENGTH_SCALES[DECAMETER].divide(SQUARE_TIME_SCALES[SQUARE_HOUR]),
		LENGTH_SCALES[METER].divide(SQUARE_TIME_SCALES[SQUARE_HOUR]),
		LENGTH_SCALES[DECIMETER].divide(SQUARE_TIME_SCALES[SQUARE_HOUR]),
		LENGTH_SCALES[CENTIMETER].divide(SQUARE_TIME_SCALES[SQUARE_HOUR]),
		LENGTH_SCALES[MILLIMETER].divide(SQUARE_TIME_SCALES[SQUARE_HOUR])
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

	public Acceleration () {}

	@Override
	public BigDecimal toKilometerPerSquareSecond (double value, int unit) {
	    if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[KILOMETER_PER_SQUARE_SECOND - 52]);
		return null;
	}

	@Override
	public BigDecimal toHectometerPerSquareSecond (double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[HECTOMETER_PER_SQUARE_SECOND - 52]);
		return null;
	}

	@Override
	public BigDecimal toDecameterPerSquareSecond (double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[DECAMETER_PER_SQUARE_SECOND - 52]);
		return null;
	}

	@Override
	public BigDecimal toMeterPerSquareSecond (double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[METER_PER_SQUARE_SECOND - 52]);
		return null;
	}

	@Override
	public BigDecimal toDecimeterPerSquareSecond (double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[DECIMETER_PER_SQUARE_SECOND - 52]);
		return null;
	}

	@Override
	public BigDecimal toCentimeterPerSquareSecond (double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[CENTIMETER_PER_SQUARE_SECOND - 52]);
		return null;
	}

	@Override
	public BigDecimal toMillimeterPerSquareSecond (double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[MILLIMETER_PER_SQUARE_SECOND - 52]);
		return null;
	}

	@Override
	public BigDecimal toKilometerPerSquareMinute (double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[KILOMETER_PER_SQUARE_MINUTE - 52]);
		return null;
	}

	@Override
	public BigDecimal toHectometerPerSquareMinute (double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[HECTOMETER_PER_SQUARE_MINUTE - 52]);
		return null;
	}

	@Override
	public BigDecimal toDecameterPerSquareMinute (double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[DECAMETER_PER_SQUARE_MINUTE - 52]);
		return null;
	}

	@Override
	public BigDecimal toMeterPerSquareMinute (double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[METER_PER_SQUARE_MINUTE - 52]);
		return null;
	}

	@Override
	public BigDecimal toDecimeterPerSquareMinute (double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[DECIMETER_PER_SQUARE_MINUTE - 52]);
		return null;
	}

	@Override
	public BigDecimal toCentimeterPerSquareMinute (double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[CENTIMETER_PER_SQUARE_MINUTE - 52]);
		return null;
	}

	@Override
	public BigDecimal toMillimeterPerSquareMinute (double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[MILLIMETER_PER_SQUARE_MINUTE - 52]);
		return null;
	}

	@Override
	public BigDecimal toKilometerPerSquareHour (double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[KILOMETER_PER_SQUARE_HOUR - 52]);
		return null;
	}

	@Override
	public BigDecimal toHectometerPerSquareHour (double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[HECTOMETER_PER_SQUARE_HOUR - 52]);
		return null;
	}

	@Override
	public BigDecimal toDecameterPerSquareHour (double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[DECAMETER_PER_SQUARE_HOUR - 52]);
		return null;
	}

	@Override
	public BigDecimal toMeterPerSquareHour (double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[METER_PER_SQUARE_HOUR - 52]);
		return null;
	}

	@Override
	public BigDecimal toDecimeterPerSquareHour (double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[DECIMETER_PER_SQUARE_HOUR - 52]);
		return null;
	}

	@Override
	public BigDecimal toCentimeterPerSquareHour (double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[CENTIMETER_PER_SQUARE_HOUR - 52]);
		return null;
	}

	@Override
	public BigDecimal toMillimeterPerSquareHour (double value, int unit) {
		if (unit >= 52 && unit <= 72)
			return BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[MILLIMETER_PER_SQUARE_HOUR - 52]);
		return null;
	}
	
	protected Acceleration getInstance() {
		if (!(instance instanceof Acceleration))
			instance = new Acceleration();
		return instance;
	}
}
