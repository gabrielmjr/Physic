package com.mjr.twaire.code.physic.units;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static com.mjr.twaire.code.physic.Physic.ROUND_SCALE;
import static com.mjr.twaire.code.physic.units.Length.LENGTH_SCALES;
import static com.mjr.twaire.code.physic.units.Time.TIME_SCALES;
import static com.mjr.twaire.code.physic.units.Length.KILOMETER;
import static com.mjr.twaire.code.physic.units.Length.HECTOMETER;
import static com.mjr.twaire.code.physic.units.Length.DECAMETER;
import static com.mjr.twaire.code.physic.units.Length.METER;
import static com.mjr.twaire.code.physic.units.Length.DECIMETER;
import static com.mjr.twaire.code.physic.units.Length.CENTIMETER;
import static com.mjr.twaire.code.physic.units.Length.MILLIMETER;
import static com.mjr.twaire.code.physic.units.Time.SECOND;
import static com.mjr.twaire.code.physic.units.Time.MINUTE;
import static com.mjr.twaire.code.physic.units.Time.HOUR;
import static com.mjr.twaire.code.physic.units.Length.KILOMETER_SYMBOL;
import static com.mjr.twaire.code.physic.units.Length.HECTOMETER_SYMBOL;
import static com.mjr.twaire.code.physic.units.Length.DECAMETER_SYMBOL;
import static com.mjr.twaire.code.physic.units.Length.METER_SYMBOL;
import static com.mjr.twaire.code.physic.units.Length.DECIMETER_SYMBOL;
import static com.mjr.twaire.code.physic.units.Length.CENTIMETER_SYMBOL;
import static com.mjr.twaire.code.physic.units.Length.MILLIMETER_SYMBOL;
import static com.mjr.twaire.code.physic.units.Time.SECOND_SYMBOL;
import static com.mjr.twaire.code.physic.units.Time.MINUTE_SYMBOL;
import static com.mjr.twaire.code.physic.units.Time.HOUR_SYMBOL;

public class Speed extends Unit implements ISpeed { 
    @Deprecated
	private static Speed instance; 

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

	protected static final BigDecimal[] SPEED_SCALES = new BigDecimal[]
	{
		LENGTH_SCALES[KILOMETER].divide(TIME_SCALES[SECOND - 21], ROUND_SCALE, RoundingMode.HALF_UP),
		LENGTH_SCALES[HECTOMETER].divide(TIME_SCALES[SECOND - 21], ROUND_SCALE, RoundingMode.HALF_UP),
		LENGTH_SCALES[DECAMETER].divide(TIME_SCALES[SECOND - 21], ROUND_SCALE, RoundingMode.HALF_UP),
		LENGTH_SCALES[METER].divide(TIME_SCALES[SECOND - 21], ROUND_SCALE, RoundingMode.HALF_UP),
		LENGTH_SCALES[DECIMETER].divide(TIME_SCALES[SECOND - 21], ROUND_SCALE, RoundingMode.HALF_UP),
		LENGTH_SCALES[CENTIMETER].divide(TIME_SCALES[SECOND - 21], ROUND_SCALE, RoundingMode.HALF_UP),
		LENGTH_SCALES[MILLIMETER].divide(TIME_SCALES[SECOND - 21], ROUND_SCALE, RoundingMode.HALF_UP),

		LENGTH_SCALES[KILOMETER].divide(TIME_SCALES[MINUTE - 21], ROUND_SCALE, RoundingMode.HALF_UP),
		LENGTH_SCALES[HECTOMETER].divide(TIME_SCALES[MINUTE - 21], ROUND_SCALE, RoundingMode.HALF_UP),
		LENGTH_SCALES[DECAMETER].divide(TIME_SCALES[MINUTE - 21], ROUND_SCALE, RoundingMode.HALF_UP),
		LENGTH_SCALES[METER].divide(TIME_SCALES[MINUTE - 21], ROUND_SCALE, RoundingMode.HALF_UP),
		LENGTH_SCALES[DECIMETER].divide(TIME_SCALES[MINUTE - 21], ROUND_SCALE, RoundingMode.HALF_UP),
		LENGTH_SCALES[CENTIMETER].divide(TIME_SCALES[MINUTE - 21], ROUND_SCALE, RoundingMode.HALF_UP),
		LENGTH_SCALES[MILLIMETER].divide(TIME_SCALES[MINUTE - 21], ROUND_SCALE, RoundingMode.HALF_UP),

		LENGTH_SCALES[KILOMETER].divide(TIME_SCALES[HOUR - 21], ROUND_SCALE, RoundingMode.HALF_UP),
		LENGTH_SCALES[HECTOMETER].divide(TIME_SCALES[HOUR - 21], ROUND_SCALE, RoundingMode.HALF_UP),
		LENGTH_SCALES[DECAMETER].divide(TIME_SCALES[HOUR - 21], ROUND_SCALE, RoundingMode.HALF_UP),
		LENGTH_SCALES[METER].divide(TIME_SCALES[HOUR - 21], ROUND_SCALE, RoundingMode.HALF_UP),
		LENGTH_SCALES[DECIMETER].divide(TIME_SCALES[HOUR - 21], ROUND_SCALE, RoundingMode.HALF_UP),
		LENGTH_SCALES[CENTIMETER].divide(TIME_SCALES[HOUR - 21], ROUND_SCALE, RoundingMode.HALF_UP),
		LENGTH_SCALES[MILLIMETER].divide(TIME_SCALES[HOUR - 21], ROUND_SCALE, RoundingMode.HALF_UP)
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

    protected final String SPEED_SYMBOLS[] = new String[] {
        KILOMETER_PER_SECOND_SYMBOL,
        HECTOMETER_PER_SECOND_SYMBOL,
        DECAMETER_PER_SECOND_SYMBOL,
        METER_PER_SECOND_SYMBOL,
        DECIMETER_PER_SECOND_SYMBOL,
        CENTIMETER_PER_SECOND_SYMBOL,
        MILLIMETER_PER_SECOND_SYMBOL,
        KILOMETER_PER_MINUTE_SYMBOL,
        HECTOMETER_PER_MINUTE_SYMBOL,
        DECAMETER_PER_MINUTE_SYMBOL,
        METER_PER_MINUTE_SYMBOL,
        DECIMETER_PER_MINUTE_SYMBOL,
        CENTIMETER_PER_MINUTE_SYMBOL,
        MILLIMETER_PER_MINUTE_SYMBOL,
        KILOMETER_PER_HOUR_SYMBOL,
        HECTOMETER_PER_HOUR_SYMBOL,
        DECAMETER_PER_HOUR_SYMBOL,
        METER_PER_HOUR_SYMBOL,
        DECIMETER_PER_HOUR_SYMBOL,
        CENTIMETER_PER_HOUR_SYMBOL,
        MILLIMETER_PER_HOUR_SYMBOL
    };
    
	public Speed() {
        super();
        unit = METER - 31;
		value.setScale(20);
    }

    public Speed(double value) {
        super(value);
        unit = METER - 31;
		this.value.setScale(20);
    }

    public Speed(String value) {
        super(value);
        unit = METER - 31;
		this.value.setScale(20);
    }

    public Speed(long value) {
        super(value);
        unit = METER - 31;
		this.value.setScale(20);
    }

    public Speed(BigDecimal value) {
        super(value);
        unit = METER - 31;
		this.value.setScale(20);
    }

    public Speed(double value, int unit) throws IllegalArgumentException {
        super(value);
        if (unit >= 31 && unit <= 51) {
            this.unit = unit - 31;
			this.value.setScale(20);
            return;
        }
        throw new IllegalArgumentException("The unit " + unit + " is not valid as " + getClass().getName() + " unit.");
    }

    public Speed(String value, int unit) throws IllegalArgumentException {
        super(value);
        if (unit >= 31 && unit <= 51) {
            this.unit = unit - 31;
			this.value.setScale(20);
            return;
        }
        throw new IllegalArgumentException("The unit " + unit + " is not valid as " + getClass().getName() + " unit.");
    }

    public Speed(long value, int unit) throws IllegalArgumentException {
        super(value);
        if (unit >= 31 && unit <= 51) {
            this.unit = unit - 31;
			this.value.setScale(20);
            return;
        }
        throw new IllegalArgumentException("The unit " + unit + " is not valid as " + getClass().getName() + " unit.");
    }

    public Speed(BigDecimal value, int unit) throws IllegalArgumentException {
        super(value);
        if (unit >= 31 && unit <= 51) {
            this.unit = unit - 31;
			this.value.setScale(20);
            return;
        }
        throw new IllegalArgumentException("The unit " + unit + " is not valid as " + getClass().getName() + " unit");
    }
    
	public static Speed toKilometerPerSecond (double value, int unit) throws IllegalArgumentException {
		if (unit >= 31 && unit <= 51)
			return new Speed(BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_SECOND);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as " + new Speed().getClass().getName() + " unit.");
	}

	public static Speed toHectometerPerSecond (double value, int unit) throws IllegalArgumentException {
	    if (unit >= 31 && unit <= 51)
			return new Speed(BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit - 31]).divide(SPEED_SCALES[HECTOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_SECOND);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as " + new Speed().getClass().getName() + " unit.");
	}

	public static Speed toDecameterPerSecond (double value, int unit) throws IllegalArgumentException {
		if (unit >= 31 && unit <= 51)
			return new Speed(BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit - 31]).divide(SPEED_SCALES[DECAMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_SECOND);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as " + new Speed().getClass().getName() + " unit.");
	}
    
	public static Speed toMeterPerSecond (double value, int unit) throws IllegalArgumentException {
		if (unit >= 31 && unit <= 51)
			return new Speed(BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit - 31]).divide(SPEED_SCALES[METER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_SECOND);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as " + new Speed().getClass().getName() + " unit.");
	}

	public static Speed toDecimeterPerSecond (double value, int unit) throws IllegalArgumentException {
		if (unit >= 31 && unit <= 51)
			return new Speed(BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit - 31]).divide(SPEED_SCALES[DECIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_SECOND);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as " + new Speed().getClass().getName() + " unit.");
	}

	public static Speed toCentimeterPerSecond (double value, int unit) throws IllegalArgumentException {
		if (unit >= 31 && unit <= 51)
			return new Speed(BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit - 31]).divide(SPEED_SCALES[CENTIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_SECOND);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as " + new Speed().getClass().getName() + " unit.");
	}

	public static Speed toMillimeterPerSecond (double value, int unit) throws IllegalArgumentException {
		if (unit >= 31 && unit <= 51)
			return new Speed(BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit - 31]).divide(SPEED_SCALES[MILLIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_SECOND);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as " + new Speed().getClass().getName() + " unit.");
	}

	public static Speed toKilometerPerMinute (double value, int unit) throws IllegalArgumentException {
		if (unit >= 31 && unit <= 51)
			return new Speed(BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit - 31]).divide(SPEED_SCALES[KILOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_MINUTE);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as " + new Speed().getClass().getName() + " unit.");
	}
    
	public static Speed toHectometerPerMinute (double value, int unit) throws IllegalArgumentException {
		if (unit >= 31 && unit <= 51)
			return new Speed(BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit - 31]).divide(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_MINUTE);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as " + new Speed().getClass().getName() + " unit.");
	}
    
	public static Speed toDecameterPerMinute (double value, int unit) throws IllegalArgumentException {
		if (unit >= 31 && unit <= 51)
			return new Speed(BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit - 31]).divide(SPEED_SCALES[DECAMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_MINUTE);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as " + new Speed().getClass().getName() + " unit.");
	}

	public static Speed toMeterPerMinute (double value, int unit) throws IllegalArgumentException {
		if (unit >= 31 && unit <= 51)
			return new Speed(BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit - 31]).divide(SPEED_SCALES[METER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_MINUTE);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as " + new Speed().getClass().getName() + " unit.");
	}

	public static Speed toDecimeterPerMinute (double value, int unit) throws IllegalArgumentException {
		if (unit >= 31 && unit <= 51)
			return new Speed(BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit - 31]).divide(SPEED_SCALES[DECIMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_MINUTE);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as " + new Speed().getClass().getName() + " unit.");
	}
    
	public static Speed toCentimeterPerMinute (double value, int unit) throws IllegalArgumentException {
		if (unit >= 31 && unit <= 51)
			return new Speed(BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit - 31]).divide(SPEED_SCALES[CENTIMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_MINUTE);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as " + new Speed().getClass().getName() + " unit.");
	}
    
	public static Speed toMillimeterPerMinute (double value, int unit) throws IllegalArgumentException {
		if (unit >= 31 && unit <= 51)
			return new Speed(BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit - 31]).divide(SPEED_SCALES[MILLIMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_MINUTE);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as " + new Speed().getClass().getName() + " unit.");
	}
    
	public static Speed toKilometerPerHour (double value, int unit) throws IllegalArgumentException {
		if (unit >= 31 && unit <= 51)
			return new Speed(BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit - 31]).divide(SPEED_SCALES[KILOMETER_PER_HOUR - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_HOUR);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as " + new Speed().getClass().getName() + " unit.");
	}
    
	public static Speed toHectometerPerHour (double value, int unit) throws IllegalArgumentException {
		if (unit >= 31 && unit <= 51)
			return new Speed(BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit - 31]).divide(SPEED_SCALES[HECTOMETER_PER_HOUR - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_HOUR);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as " + new Speed().getClass().getName() + " unit.");
	}

	public static Speed toDecameterPerHour (double value, int unit) throws IllegalArgumentException {
		if (unit >= 31 && unit <= 51)
			return new Speed(BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit - 31]).divide(SPEED_SCALES[DECAMETER_PER_HOUR - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_HOUR);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as " + new Speed().getClass().getName() + " unit.");
	}

	public static Speed toMeterPerHour (double value, int unit) throws IllegalArgumentException {
		if (unit >= 31 && unit <= 51)
			return new Speed(BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit - 31]).divide(SPEED_SCALES[METER_PER_HOUR - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_HOUR);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as " + new Speed().getClass().getName() + " unit.");
	}

	public static Speed toDecimeterPerHour (double value, int unit) throws IllegalArgumentException {
		if (unit >= 31 && unit <= 51)
			return new Speed(BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit - 31]).divide(SPEED_SCALES[DECIMETER_PER_HOUR - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_HOUR);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as " + new Speed().getClass().getName() + " unit.");
	}
   
	public static Speed toCentimeterPerHour (double value, int unit) throws IllegalArgumentException {
		if (unit >= 31 && unit <= 51)
			return new Speed(BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit - 31]).divide(SPEED_SCALES[CENTIMETER_PER_HOUR - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_HOUR);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as " + new Speed().getClass().getName() + " unit.");
	}

	public static Speed toMillimeterPerHour (double value, int unit) throws IllegalArgumentException {
		if (unit >= 31 && unit <= 51)
			return new Speed(BigDecimal.valueOf(value).multiply(SPEED_SCALES[unit - 31]).divide(SPEED_SCALES[MILLIMETER_PER_HOUR - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_HOUR);
		throw new IllegalArgumentException("The unit " + unit + " is not valid as " + new Speed().getClass().getName() + " unit.");
	}
    
    @Override
    public Speed toKilometerPerSecond() {
        return null;
    }

    @Override
    public Speed toHectometerPerSecond() {
        return null;
    }

    @Override
    public Speed toDecameterPerSecond() {
        return null;
    }

    @Override
    public Speed toMeterPerSecond() {
        return null;
    }

    @Override
    public Speed toDecimeterPerSecond() {
        return null;
    }

    @Override
    public Speed toCentimeterPerSecond() {
        return null;
    }

    @Override
    public Speed toMillimeterPerSecond() {
        return null;
    }

    @Override
    public Speed toKilometerPerMinute() {
        return null;
    }

    @Override
    public Speed toHectometerPerMinute() {
        return null;
    }

    @Override
    public Speed toDecameterPerMinute() {
        return null;
    }

    @Override
    public Speed toMeterPerMinute() {
        return null;
    }

    @Override
    public Speed toDecimeterPerMinute() {
        return null;
    }

    @Override
    public Speed toCentimeterPerMinute() {
        return null;
    }

    @Override
    public Speed toMillimeterPerMinute() {
        return null;
    }

    @Override
    public Speed toKilometerPerHour() {
        return null;
    }

    @Override
    public Speed toHectometerPerHour() {
        return null;
    }

    @Override
    public Speed toDecameterPerHour() {
        return null;
    }

    @Override
    public Speed toMeterPerHour() {
        return null;
    }

    @Override
    public Speed toDecimeterPerHour() {
        return null;
    }

    @Override
    public Speed toCentimeterPerHour() {
        return null;
    }

    @Override
    public Speed toMillimeterPerHour() {
        return null;
    }
    
    @Override
    public String toString() {
        return value + SPEED_SYMBOLS[unit];
    }
    
    @Override
    public boolean equals(Object object) {
        try {
            Speed speed = (Speed) object;
            return speed.toString().equals(toString());
        } catch (ClassCastException e) {
            return false;
        }
    }
    
    @Override
    public Speed setUnit(int unit) throws IllegalArgumentException { 
        if (unit >= 31 && unit <= 51) {
            this.unit = unit;
            return this;
        }   
        throw new IllegalArgumentException("The unit " + unit + " is not valid as " + new Speed().getClass().getName() + " unit.");
    }

    @Override
    public String getUnitSymbol() {
        return SPEED_SYMBOLS[unit];
    }

    @Deprecated
	protected static Speed getInstance () {
		if (!(instance instanceof Speed))
		    instance = new Speed();
		return instance;
	}
}
