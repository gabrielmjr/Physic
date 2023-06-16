package com.mjr.twaire.code.physic.units;

import com.mjr.twaire.code.physic.PhysicException;
import java.math.BigDecimal;

import static com.mjr.twaire.code.physic.Physic.ROUND_SCALE;
import static com.mjr.twaire.code.physic.units.Length.KILOMETER;
import static com.mjr.twaire.code.physic.units.Length.HECTOMETER;
import static com.mjr.twaire.code.physic.units.Length.DECAMETER;
import static com.mjr.twaire.code.physic.units.Length.METER;
import static com.mjr.twaire.code.physic.units.Length.DECIMETER;
import static com.mjr.twaire.code.physic.units.Length.CENTIMETER;
import static com.mjr.twaire.code.physic.units.Length.MILLIMETER;
import static com.mjr.twaire.code.physic.units.Length.LENGTH_SCALES;
import static com.mjr.twaire.code.physic.units.Length.KILOMETER_SYMBOL;
import static com.mjr.twaire.code.physic.units.Length.HECTOMETER_SYMBOL;
import static com.mjr.twaire.code.physic.units.Length.DECAMETER_SYMBOL;
import static com.mjr.twaire.code.physic.units.Length.METER_SYMBOL;
import static com.mjr.twaire.code.physic.units.Length.DECIMETER_SYMBOL;
import static com.mjr.twaire.code.physic.units.Length.CENTIMETER_SYMBOL;
import static com.mjr.twaire.code.physic.units.Length.MILLIMETER_SYMBOL;
import static java.math.RoundingMode.HALF_UP;

public class Volume implements IVolume {
    @Deprecated
    private static Volume instance; 
    private BigDecimal value;
    private int unit;

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
		LENGTH_SCALES[MILLIMETER].pow(3)
	};

	public static final String CUBE_KILOMETER_SYMBOL = KILOMETER_SYMBOL + "³";
	public static final String CUBE_HECTOMETER_SYMBOL = HECTOMETER_SYMBOL + "³";
	public static final String CUBE_DECAMETER_SYMBOL = DECAMETER_SYMBOL + "³";
	public static final String CUBE_METER_SYMBOL = METER_SYMBOL + "³";
	public static final String CUBE_DECIMETER_SYMBOL = DECIMETER_SYMBOL + "³";
	public static final String CUBE_CENTIMETER_SYMBOL = CENTIMETER_SYMBOL + "³";
	public static final String CUBE_MILLIMETER_SYMBOL = MILLIMETER_SYMBOL + "³";
    
    protected final String VOLUME_SYMBOLS[] = new String[] {
        CUBE_KILOMETER_SYMBOL,
        CUBE_HECTOMETER_SYMBOL,
        CUBE_DECAMETER_SYMBOL,
        CUBE_METER_SYMBOL,
        CUBE_DECIMETER_SYMBOL,
        CUBE_CENTIMETER_SYMBOL,
        CUBE_MILLIMETER_SYMBOL
    };
    
    public Volume() {
        this.value = BigDecimal.ZERO;
        unit = CUBE_METER - 14;
    }

    public Volume(double value) {
        this.value = BigDecimal.valueOf(value);
        unit = CUBE_METER - 14;
    }

    public Volume(String value) {
        this.value = new BigDecimal(value);
        unit = CUBE_METER - 14;
    }

    public Volume(long value) {
        this.value = BigDecimal.valueOf(value);
        unit = CUBE_METER - 14;
    }

    public Volume(BigDecimal value) {
        this.value = value;
        unit = CUBE_METER - 14;
    }

    public Volume(double value, int unit) throws PhysicException {
        this.value = BigDecimal.valueOf(value);
        if (unit >= 14 && unit <= 20) {
            this.unit = unit - 14;
            return;
        }
        throw new InvalidUnitException("The unit " + unit + " is not valid as " + getClass().getName() + " unit.");
    }

    public Volume(String value, int unit) throws PhysicException {
        this.value = new BigDecimal(value);
        if (unit >= 14 && unit <= 20) {
            this.unit = unit - 14;
            return;
        }
        throw new InvalidUnitException("The unit " + unit + " is not valid as " + getClass().getName() + " unit.");
    }

    public Volume(long value, int unit) throws PhysicException {
        this.value = BigDecimal.valueOf(value);;
        if (unit >= 14 && unit <= 20) {
            this.unit = unit - 14;
            return;
        }
        throw new InvalidUnitException("The unit " + unit + " is not valid as " + getClass().getName() + " unit.");
    }

    public Volume(BigDecimal value, int unit) throws PhysicException {
        this.value = value;
        if (unit >= 14 && unit <= 20) {
            this.unit = unit - 14;
            return;
        }
        throw new InvalidUnitException("The unit " + unit + " is not valid as " + getClass().getName() + " unit");
    }

	public static Volume toCubeKilometer (double value, int unit) throws PhysicException {
		if (unit >= 14 && unit <= 20)
			return new Volume(BigDecimal.valueOf(value).multiply(VOLUME_SCALES[unit - 14]).divide(VOLUME_SCALES[CUBE_KILOMETER - 14], ROUND_SCALE, HALF_UP), CUBE_KILOMETER);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Volume().getClass().getName() + " unit.");
    }

	public static Volume toCubeHectometer (double value, int unit) throws PhysicException {
		if (unit >= 14 && unit <= 20)
			return new Volume(BigDecimal.valueOf(value).multiply(VOLUME_SCALES[unit - 14]).divide(VOLUME_SCALES[CUBE_HECTOMETER - 14], ROUND_SCALE, HALF_UP), CUBE_HECTOMETER);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Volume().getClass().getName() + " unit.");
    }
    
	public static Volume toCubeDecameter (double value, int unit) throws PhysicException {
		if (unit >= 14 && unit <= 20)
			return new Volume(BigDecimal.valueOf(value).multiply(VOLUME_SCALES[unit - 14]).divide(VOLUME_SCALES[CUBE_DECAMETER - 14], ROUND_SCALE, HALF_UP), CUBE_DECAMETER);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Volume().getClass().getName() + " unit.");
    }
    
	public static Volume toCubeMeter (double value, int unit) throws PhysicException {
		if (unit >= 14 && unit <= 20)
			return new Volume(BigDecimal.valueOf(value).multiply(VOLUME_SCALES[unit - 14]).divide(VOLUME_SCALES[CUBE_METER - 14], ROUND_SCALE, HALF_UP), CUBE_METER);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Volume().getClass().getName() + " unit.");
    }

	public static Volume toCubeDecimeter (double value, int unit) throws PhysicException {
		if (unit >= 14 && unit <= 20)
			return new Volume(BigDecimal.valueOf(value).multiply(VOLUME_SCALES[unit - 14]).divide(VOLUME_SCALES[CUBE_DECIMETER - 14], ROUND_SCALE, HALF_UP), CUBE_DECIMETER);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Volume().getClass().getName() + " unit.");
    }

	public static Volume toCubeCentimeter (double value, int unit) throws PhysicException {
		if (unit >= 14 && unit <= 20)
			return new Volume(BigDecimal.valueOf(value).multiply(VOLUME_SCALES[unit - 14]).divide(VOLUME_SCALES[CUBE_CENTIMETER - 14], ROUND_SCALE, HALF_UP), CUBE_CENTIMETER);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Volume().getClass().getName() + " unit.");
    }

	public static Volume toCubeMillimeter (double value, int unit) throws PhysicException {
		if (unit >= 14 && unit <= 20)
			return new Volume(BigDecimal.valueOf(value).multiply(VOLUME_SCALES[unit - 14]).divide(VOLUME_SCALES[CUBE_MILLIMETER - 14], ROUND_SCALE, HALF_UP), CUBE_MILLIMETER);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Volume().getClass().getName() + " unit.");
    }
    
    @Override
    public Volume toCubeKilometer() {
        return null;
    }

    @Override
    public Volume toCubeHectometer() {
        return null;
    }

    @Override
    public Volume toCubeDecameter() {
        return null;
    }

    @Override
    public Volume toCubeMeter() {
        return null;
    }

    @Override
    public Volume toCubeDecimeter() {
        return null;
    }

    @Override
    public Volume toCubeCentimeter() {
        return null;
    }

    @Override
    public Volume toCubeMillimeter() {
        return null;
    }
    
    @Override
    public String toString() {
        return value + VOLUME_SYMBOLS[unit];
    }
    
    @Override
    public boolean equals(Object object) {
        try {
            Volume volume = (Volume) object;
            return volume.toString().equals(toString());
        } catch (ClassCastException e) {
            return false;
        }
    }
    
    public Volume setValue(double value) {
        return new Volume(value);
    }

    public Volume setValue(long value) {
        return new Volume(value);
    }

    public Volume setValue(String value) {
        return new Volume(value);
    }

    public Volume setValue(BigDecimal value) {
        return new Volume(value);
    }

    public Volume getValue() {
        return this;
    }
    
    public Volume setUnit(int unit) throws InvalidUnitException {
        if (unit >= 14 && unit <= 20) {
            this.unit = unit;
            return this;
        }
        throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Volume().getClass().getName() + " unit.");
    }

    @Deprecated
    protected static Volume getInstance () {
		if (!(instance instanceof Volume))
			instance = new Volume();
		return instance;
    }
}
