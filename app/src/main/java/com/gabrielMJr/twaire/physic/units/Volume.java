package com.gabrielMJr.twaire.physic.units;

import java.math.BigDecimal;

import static com.gabrielMJr.twaire.physic.units.Length.KILOMETER;
import static com.gabrielMJr.twaire.physic.units.Length.HECTOMETER;
import static com.gabrielMJr.twaire.physic.units.Length.DECAMETER;
import static com.gabrielMJr.twaire.physic.units.Length.METER;
import static com.gabrielMJr.twaire.physic.units.Length.DECIMETER;
import static com.gabrielMJr.twaire.physic.units.Length.CENTIMETER;
import static com.gabrielMJr.twaire.physic.units.Length.MILLIMETER;

import static com.gabrielMJr.twaire.physic.units.Length.LENGTH_SCALES;

import static com.gabrielMJr.twaire.physic.units.Length.KILOMETER_SYMBOL;
import static com.gabrielMJr.twaire.physic.units.Length.HECTOMETER_SYMBOL;
import static com.gabrielMJr.twaire.physic.units.Length.DECAMETER_SYMBOL;
import static com.gabrielMJr.twaire.physic.units.Length.METER_SYMBOL;
import static com.gabrielMJr.twaire.physic.units.Length.DECIMETER_SYMBOL;
import static com.gabrielMJr.twaire.physic.units.Length.CENTIMETER_SYMBOL;
import static com.gabrielMJr.twaire.physic.units.Length.MILLIMETER_SYMBOL;

public class Volume implements VolumeIF {
	private static Volume instance; 

	public static final int CUBE_KILOMETER = 14;
	public static final int CUBE_HECTOMETER = 15;
	public static final int CUBE_DECAMETER = 16;
	public static final int CUBE_METER = 17;
	public static final int CUBE_DECIMETER = 18;
	public static final int CUBE_CENTIMETER =19;
	public static final int CUBE_MILLIMETER = 20;

    protected static final BigDecimal[] VOLUME_SCALES = new BigDecimal[]
	{
		LENGTH_SCALES[KILOMETER].pow(3),
		LENGTH_SCALES[HECTOMETER].pow(3),
		LENGTH_SCALES[DECAMETER].pow(3),
		LENGTH_SCALES[METER].pow(3),
		LENGTH_SCALES[DECIMETER].pow(3),
		LENGTH_SCALES[CENTIMETER].pow(3),
		LENGTH_SCALES[CENTIMETER].pow(3)
	};

	public static final String CUBE_KILOMETER_SYMBOL = KILOMETER_SYMBOL + "³";
	public static final String CUBE_HECTOMETER_SYMBOL = HECTOMETER_SYMBOL + "³";
	public static final String CUBE_DECAMETER_SYMBOL = DECAMETER_SYMBOL + "³";
	public static final String CUBE_METER_SYMBOL = METER_SYMBOL + "³";
	public static final String CUBE_DECIMETER_SYMBOL = DECIMETER_SYMBOL + "³";
	public static final String CUBE_CENTIMETER_SYMBOL = CENTIMETER_SYMBOL + "³";
	public static final String CUBE_MILLIMETER_SYMBOL = MILLIMETER_SYMBOL + "³";

	@Override
	public BigDecimal toCubeKilometer (double value, int unit) {
		if (unit >= 14 && unit <= 20)
			return BigDecimal.valueOf(value).multiply(VOLUME_SCALES[unit - 14]).divide(VOLUME_SCALES[CUBE_KILOMETER - 14]);
		return null;
    }

	@Override
	public BigDecimal toCubeHectometer (double value, int unit) {
		if (unit >= 14 && unit <= 20)
			return BigDecimal.valueOf(value).multiply(VOLUME_SCALES[unit - 14]).divide(VOLUME_SCALES[CUBE_HECTOMETER - 14]);
		return null;
    }

	@Override
	public BigDecimal toCubeDecameter (double value, int unit) {
		if (unit >= 14 && unit <= 20)
			return BigDecimal.valueOf(value).multiply(VOLUME_SCALES[unit - 14]).divide(VOLUME_SCALES[CUBE_DECAMETER - 14]);
		return null;
    }

	@Override
	public BigDecimal toCubeMeter (double value, int unit) {
		if (unit >= 14 && unit <= 20)
			return BigDecimal.valueOf(value).multiply(VOLUME_SCALES[unit - 14]).divide(VOLUME_SCALES[CUBE_METER - 14]);
		return null;
    }

	@Override
	public BigDecimal toCubeDecimeter (double value, int unit) {
		if (unit >= 14 && unit <= 20)
			return BigDecimal.valueOf(value).multiply(VOLUME_SCALES[unit - 14]).divide(VOLUME_SCALES[CUBE_DECIMETER - 14]);
		return null;
    }

	@Override
	public BigDecimal toCubeCentimeter (double value, int unit) {
		if (unit >= 14 && unit <= 20)
			return BigDecimal.valueOf(value).multiply(VOLUME_SCALES[unit - 14]).divide(VOLUME_SCALES[CUBE_CENTIMETER - 14]);
		return null;
    }

	@Override
	public BigDecimal toCubeMillimeter (double value, int unit) {
		if (unit >= 14 && unit <= 20)
			return BigDecimal.valueOf(value).multiply(VOLUME_SCALES[unit - 14]).divide(VOLUME_SCALES[CUBE_MILLIMETER - 14]);
		return null;
    }

    protected static Volume getInstance () {
		if (!(instance instanceof Volume))
			instance = new Volume();
		return instance;
    }
}
