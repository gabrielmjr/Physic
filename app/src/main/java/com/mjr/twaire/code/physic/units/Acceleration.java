package com.mjr.twaire.code.physic.units;

import com.mjr.twaire.code.physic.PhysicException;
import java.math.BigDecimal;

import static com.mjr.twaire.code.physic.units.Length.LENGTH_SCALES;
import static com.mjr.twaire.code.physic.units.Time.SQUARE_TIME_SCALES;

import static com.mjr.twaire.code.physic.units.Length.KILOMETER;
import static com.mjr.twaire.code.physic.units.Length.HECTOMETER;
import static com.mjr.twaire.code.physic.units.Length.DECAMETER;
import static com.mjr.twaire.code.physic.units.Length.METER;
import static com.mjr.twaire.code.physic.units.Length.DECIMETER;
import static com.mjr.twaire.code.physic.units.Length.CENTIMETER;
import static com.mjr.twaire.code.physic.units.Length.MILLIMETER;

import static com.mjr.twaire.code.physic.units.Time.SQUARE_SECOND;
import static com.mjr.twaire.code.physic.units.Time.SQUARE_MINUTE;
import static com.mjr.twaire.code.physic.units.Time.SQUARE_HOUR;

import static com.mjr.twaire.code.physic.units.Length.KILOMETER_SYMBOL;
import static com.mjr.twaire.code.physic.units.Length.HECTOMETER_SYMBOL;
import static com.mjr.twaire.code.physic.units.Length.DECAMETER_SYMBOL;
import static com.mjr.twaire.code.physic.units.Length.METER_SYMBOL;
import static com.mjr.twaire.code.physic.units.Length.DECIMETER_SYMBOL;
import static com.mjr.twaire.code.physic.units.Length.CENTIMETER_SYMBOL;
import static com.mjr.twaire.code.physic.units.Length.MILLIMETER_SYMBOL;

import static com.mjr.twaire.code.physic.units.Time.SQUARE_SECOND_SYMBOL;
import static com.mjr.twaire.code.physic.units.Time.SQUARE_MINUTE_SYMBOL;
import static com.mjr.twaire.code.physic.units.Time.SQUARE_HOUR_SYMBOL;

public class Acceleration implements IAcceleration {
    @Deprecated
    private static Acceleration instance;
    private BigDecimal value;
    private int unit;

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

	protected static final BigDecimal[] ACCELERATION_SCALES = new BigDecimal[]
	{
		LENGTH_SCALES[KILOMETER].divide(SQUARE_TIME_SCALES[SQUARE_SECOND - 21]),
		LENGTH_SCALES[HECTOMETER].divide(SQUARE_TIME_SCALES[SQUARE_SECOND - 21]),
		LENGTH_SCALES[DECAMETER].divide(SQUARE_TIME_SCALES[SQUARE_SECOND - 21]),
		LENGTH_SCALES[METER].divide(SQUARE_TIME_SCALES[SQUARE_SECOND - 21]),
		LENGTH_SCALES[DECIMETER].divide(SQUARE_TIME_SCALES[SQUARE_SECOND - 21]),
		LENGTH_SCALES[CENTIMETER].divide(SQUARE_TIME_SCALES[SQUARE_SECOND - 21]),
		LENGTH_SCALES[MILLIMETER].divide(SQUARE_TIME_SCALES[SQUARE_SECOND - 21]),

		LENGTH_SCALES[KILOMETER].divide(SQUARE_TIME_SCALES[SQUARE_MINUTE - 21]),
		LENGTH_SCALES[HECTOMETER].divide(SQUARE_TIME_SCALES[SQUARE_MINUTE - 21]),
		LENGTH_SCALES[DECAMETER].divide(SQUARE_TIME_SCALES[SQUARE_MINUTE - 21]),
		LENGTH_SCALES[METER].divide(SQUARE_TIME_SCALES[SQUARE_MINUTE - 21]),
		LENGTH_SCALES[DECIMETER].divide(SQUARE_TIME_SCALES[SQUARE_MINUTE - 21]),
		LENGTH_SCALES[CENTIMETER].divide(SQUARE_TIME_SCALES[SQUARE_MINUTE - 21]),
		LENGTH_SCALES[MILLIMETER].divide(SQUARE_TIME_SCALES[SQUARE_MINUTE - 21]),

		LENGTH_SCALES[KILOMETER].divide(SQUARE_TIME_SCALES[SQUARE_HOUR - 21]),
		LENGTH_SCALES[HECTOMETER].divide(SQUARE_TIME_SCALES[SQUARE_HOUR - 21]),
		LENGTH_SCALES[DECAMETER].divide(SQUARE_TIME_SCALES[SQUARE_HOUR - 21]),
		LENGTH_SCALES[METER].divide(SQUARE_TIME_SCALES[SQUARE_HOUR - 21]),
		LENGTH_SCALES[DECIMETER].divide(SQUARE_TIME_SCALES[SQUARE_HOUR - 21]),
		LENGTH_SCALES[CENTIMETER].divide(SQUARE_TIME_SCALES[SQUARE_HOUR - 21]),
		LENGTH_SCALES[MILLIMETER].divide(SQUARE_TIME_SCALES[SQUARE_HOUR - 21])
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

	public Acceleration() {
        value = BigDecimal.ZERO;
        unit = METER;
    }

    public Acceleration(double value) {
        this.value = BigDecimal.valueOf(value);
        unit = METER;
    }

    public Acceleration(String value) {
        this.value = new BigDecimal(value);
        unit = METER;
    }

    public Acceleration(long value) {
        this.value = BigDecimal.valueOf(value);
        unit = METER;
    }

    public Acceleration(BigDecimal value) {
        this.value = value;
        unit = METER;
    }

    public Acceleration(double value, int unit) throws PhysicException {
        this.value = BigDecimal.valueOf(value);
        if (unit >= 52 && unit <= 72) {
            this.unit = unit;
            return;
        }
        throw new InvalidUnitException("The unit " + unit + " is not valid as " + getClass().getName() + " unit.");
    }

    public Acceleration(String value, int unit) throws PhysicException {
        this.value = new BigDecimal(value);
        if (unit >= 52 && unit <= 72) {
            this.unit = unit;
            return;
        }
        throw new InvalidUnitException("The unit " + unit + " is not valid as " + getClass().getName() + " unit.");
    }

    public Acceleration(long value, int unit) throws PhysicException {
        this.value = BigDecimal.valueOf(value);
        if (unit >= 52 && unit <= 72) {
            this.unit = unit;
            return;
        }
        throw new InvalidUnitException("The unit " + unit + " is not valid as " + getClass().getName() + " unit.");
    }

    public Acceleration(BigDecimal value, int unit) throws PhysicException {
        this.value = value;
        if (unit >= 52 && unit <= 72) {
            this.unit = unit;
            return;
        }
        throw new InvalidUnitException("The unit " + unit + " is not valid as " + getClass().getName() + " unit");
    }

	public static Acceleration toKilometerPerSquareSecond(double value, int unit) throws PhysicException {
	    if (unit >= 52 && unit <= 72)
			return new Acceleration(BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[KILOMETER_PER_SQUARE_SECOND - 52]), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Acceleration().getClass().getName() + " unit");
	}

	public static Acceleration toHectometerPerSquareSecond(double value, int unit) throws PhysicException {
		if (unit >= 52 && unit <= 72)
			return new Acceleration(BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[HECTOMETER_PER_SQUARE_SECOND - 52]), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Acceleration().getClass().getName() + " unit");
	}

	public static Acceleration toDecameterPerSquareSecond(double value, int unit) throws PhysicException {
		if (unit >= 52 && unit <= 72)
			return new Acceleration(BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[DECAMETER_PER_SQUARE_SECOND - 52]), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Acceleration().getClass().getName() + " unit");
    }

	public static Acceleration toMeterPerSquareSecond(double value, int unit) throws PhysicException {
		if (unit >= 52 && unit <= 72)
			return new Acceleration(BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[METER_PER_SQUARE_SECOND - 52]), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Acceleration().getClass().getName() + " unit");
	}

	public static Acceleration toDecimeterPerSquareSecond(double value, int unit) throws PhysicException {
		if (unit >= 52 && unit <= 72)
			return new Acceleration(BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[DECIMETER_PER_SQUARE_SECOND - 52]), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Acceleration().getClass().getName() + " unit");
	}

	public static Acceleration toCentimeterPerSquareSecond(double value, int unit) throws PhysicException {
		if (unit >= 52 && unit <= 72)
			return new Acceleration(BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[CENTIMETER_PER_SQUARE_SECOND - 52]), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Acceleration().getClass().getName() + " unit");
    }

	public static Acceleration toMillimeterPerSquareSecond(double value, int unit) throws PhysicException {
		if (unit >= 52 && unit <= 72)
			return new Acceleration(BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[MILLIMETER_PER_SQUARE_SECOND - 52]), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Acceleration().getClass().getName() + " unit");
	}

	public static Acceleration toKilometerPerSquareMinute(double value, int unit) throws PhysicException {
		if (unit >= 52 && unit <= 72)
			return new Acceleration(BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[KILOMETER_PER_SQUARE_MINUTE - 52]), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Acceleration().getClass().getName() + " unit");
    }

	public static Acceleration toHectometerPerSquareMinute(double value, int unit) throws PhysicException {
		if (unit >= 52 && unit <= 72)
			return new Acceleration(BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[HECTOMETER_PER_SQUARE_MINUTE - 52]), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Acceleration().getClass().getName() + " unit");
	}

	public static Acceleration toDecameterPerSquareMinute(double value, int unit) throws PhysicException {
		if (unit >= 52 && unit <= 72)
			return new Acceleration(BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[DECAMETER_PER_SQUARE_MINUTE - 52]), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Acceleration().getClass().getName() + " unit");
	}

	public static Acceleration toMeterPerSquareMinute(double value, int unit) throws PhysicException {
		if (unit >= 52 && unit <= 72)
			return new Acceleration(BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[METER_PER_SQUARE_MINUTE - 52]), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Acceleration().getClass().getName() + " unit");
	}

	public static Acceleration toDecimeterPerSquareMinute(double value, int unit) throws PhysicException {
		if (unit >= 52 && unit <= 72)
			return new Acceleration(BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[DECIMETER_PER_SQUARE_MINUTE - 52]), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Acceleration().getClass().getName() + " unit");
	}

	public static Acceleration toCentimeterPerSquareMinute(double value, int unit) throws PhysicException {
		if (unit >= 52 && unit <= 72)
			return new Acceleration(BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[CENTIMETER_PER_SQUARE_MINUTE - 52]), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Acceleration().getClass().getName() + " unit");
	}

	public static Acceleration toMillimeterPerSquareMinute(double value, int unit) throws PhysicException {
		if (unit >= 52 && unit <= 72)
			return new Acceleration(BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[MILLIMETER_PER_SQUARE_MINUTE - 52]), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Acceleration().getClass().getName() + " unit");
	}

	public static Acceleration toKilometerPerSquareHour(double value, int unit) throws PhysicException {
		if (unit >= 52 && unit <= 72)
			return new Acceleration(BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[KILOMETER_PER_SQUARE_HOUR - 52]), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Acceleration().getClass().getName() + " unit");
	}

	public static Acceleration toHectometerPerSquareHour(double value, int unit) throws PhysicException {
		if (unit >= 52 && unit <= 72)
			return new Acceleration(BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[HECTOMETER_PER_SQUARE_HOUR - 52]), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Acceleration().getClass().getName() + " unit");
	}

	public static Acceleration toDecameterPerSquareHour(double value, int unit) throws PhysicException {
		if (unit >= 52 && unit <= 72)
			return new Acceleration(BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[DECAMETER_PER_SQUARE_HOUR - 52]), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Acceleration().getClass().getName() + " unit");
	}

	public static Acceleration toMeterPerSquareHour(double value, int unit) throws PhysicException {
		if (unit >= 52 && unit <= 72)
			return new Acceleration(BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[METER_PER_SQUARE_HOUR - 52]), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Acceleration().getClass().getName() + " unit");
	}

	public static Acceleration toDecimeterPerSquareHour(double value, int unit) throws PhysicException {
		if (unit >= 52 && unit <= 72)
			return new Acceleration(BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[DECIMETER_PER_SQUARE_HOUR - 52]), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Acceleration().getClass().getName() + " unit");
	}

	public static Acceleration toCentimeterPerSquareHour(double value, int unit) throws PhysicException {
		if (unit >= 52 && unit <= 72)
			return new Acceleration(BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[CENTIMETER_PER_SQUARE_HOUR - 52]), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Acceleration().getClass().getName() + " unit");
	}

	public static Acceleration toMillimeterPerSquareHour(double value, int unit) throws PhysicException {
		if (unit >= 52 && unit <= 72)
			return new Acceleration(BigDecimal.valueOf(value).multiply(ACCELERATION_SCALES[unit - 52]).divide(ACCELERATION_SCALES[MILLIMETER_PER_SQUARE_HOUR - 52]), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Acceleration().getClass().getName() + " unit");
	}

    @Override
    public Acceleration toKilometerPerSquareSecond() {
        return null;
    }

    @Override
    public Acceleration toHectometerPerSquareSecond() {
        return null;
    }

    @Override
    public Acceleration toDecameterPerSquareSecond() {
        return null;
    }

    @Override
    public Acceleration toMeterPerSquareSecond() {
        return null;
    }

    @Override
    public Acceleration toDecimeterPerSquareSecond() {
        return null;
    }

    @Override
    public Acceleration toCentimeterPerSquareSecond() {
        return null;
    }

    @Override
    public Acceleration toMillimeterPerSquareSecond() {
        return null;
    }

    @Override
    public Acceleration toKilometerPerSquareMinute() {
        return null;
    }

    @Override
    public Acceleration toHectometerPerSquareMinute() {
        return null;
    }

    @Override
    public Acceleration toDecameterPerSquareMinute() {
        return null;
    }

    @Override
    public Acceleration toMeterPerSquareMinute() {
        return null;
    }

    @Override
    public Acceleration toDecimeterPerSquareMinute() {
        return null;
    }

    @Override
    public Acceleration toCentimeterPerSquareMinute() {
        return null;
    }

    @Override
    public Acceleration toMillimeterPerSquareMinute() {
        return null;
    }

    @Override
    public Acceleration toKilometerPerSquareHour() {
        return null;
    }

    @Override
    public Acceleration toHectometerPerSquareHour() {
        return null;
    }

    @Override
    public Acceleration toDecameterPerSquareHour() {
        return null;
    }

    @Override
    public Acceleration toMeterPerSquareHour() {
        return null;
    }

    @Override
    public Acceleration toDecimeterPerSquareHour() {
        return null;
    }

    @Override
    public Acceleration toCentimeterPerSquareHour() {
        return null;
    }

    @Override
    public Acceleration toMillimeterPerSquareHour() {
        return null;
    }

    @Deprecated
	protected Acceleration getInstance() {
		if (!(instance instanceof Acceleration))
			instance = new Acceleration();
		return instance;
	}
}
