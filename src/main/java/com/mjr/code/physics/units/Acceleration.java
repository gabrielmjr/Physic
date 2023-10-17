package com.mjr.code.physics.units;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static com.mjr.code.physics.Physic.ROUND_SCALE;
import static com.mjr.code.physics.units.Length.LENGTH_SCALES;

import static com.mjr.code.physics.units.Length.KILOMETER;
import static com.mjr.code.physics.units.Length.HECTOMETER;
import static com.mjr.code.physics.units.Length.DECAMETER;
import static com.mjr.code.physics.units.Length.METER;
import static com.mjr.code.physics.units.Length.DECIMETER;
import static com.mjr.code.physics.units.Length.CENTIMETER;
import static com.mjr.code.physics.units.Length.MILLIMETER;

import static com.mjr.code.physics.units.Length.KILOMETER_SYMBOL;
import static com.mjr.code.physics.units.Length.HECTOMETER_SYMBOL;
import static com.mjr.code.physics.units.Length.DECAMETER_SYMBOL;
import static com.mjr.code.physics.units.Length.METER_SYMBOL;
import static com.mjr.code.physics.units.Length.DECIMETER_SYMBOL;
import static com.mjr.code.physics.units.Length.CENTIMETER_SYMBOL;
import static com.mjr.code.physics.units.Length.MILLIMETER_SYMBOL;
import static com.mjr.code.physics.units.SquaredTime.*;

public class Acceleration extends Unit implements IAcceleration {
    @Deprecated
    private static Acceleration instance;
    
	public static final int KILOMETER_PER_SQUARE_SECOND = Speed.LAST_UNIT_CONS + 1;
	public static final int HECTOMETER_PER_SQUARE_SECOND = Speed.LAST_UNIT_CONS + 2;
	public static final int DECAMETER_PER_SQUARE_SECOND = Speed.LAST_UNIT_CONS + 3;
	public static final int METER_PER_SQUARE_SECOND = Speed.LAST_UNIT_CONS + 4;
	public static final int DECIMETER_PER_SQUARE_SECOND = Speed.LAST_UNIT_CONS + 5;
	public static final int CENTIMETER_PER_SQUARE_SECOND = Speed.LAST_UNIT_CONS + 6;
	public static final int MILLIMETER_PER_SQUARE_SECOND = Speed.LAST_UNIT_CONS + 7;

	public static final int KILOMETER_PER_SQUARE_MINUTE = Speed.LAST_UNIT_CONS + 8;
	public static final int HECTOMETER_PER_SQUARE_MINUTE = Speed.LAST_UNIT_CONS + 9;
	public static final int DECAMETER_PER_SQUARE_MINUTE = Speed.LAST_UNIT_CONS + 10;
	public static final int METER_PER_SQUARE_MINUTE = Speed.LAST_UNIT_CONS + 11;
	public static final int DECIMETER_PER_SQUARE_MINUTE = Speed.LAST_UNIT_CONS + 12;
	public static final int CENTIMETER_PER_SQUARE_MINUTE = Speed.LAST_UNIT_CONS + 13;
	public static final int MILLIMETER_PER_SQUARE_MINUTE = Speed.LAST_UNIT_CONS + 14;

	public static final int KILOMETER_PER_SQUARE_HOUR = Speed.LAST_UNIT_CONS + 15;
	public static final int HECTOMETER_PER_SQUARE_HOUR = Speed.LAST_UNIT_CONS + 16;
	public static final int DECAMETER_PER_SQUARE_HOUR = Speed.LAST_UNIT_CONS + 17;
	public static final int METER_PER_SQUARE_HOUR = Speed.LAST_UNIT_CONS + 18;
	public static final int DECIMETER_PER_SQUARE_HOUR = Speed.LAST_UNIT_CONS + 19;
	public static final int CENTIMETER_PER_SQUARE_HOUR = Speed.LAST_UNIT_CONS + 20;
	public static final int MILLIMETER_PER_SQUARE_HOUR = Speed.LAST_UNIT_CONS + 21;

	private static final int UNIT_SCALE = KILOMETER_PER_SQUARE_SECOND;
	protected static final int LAST_UNIT_CONS = MILLIMETER_PER_SQUARE_HOUR;
	private final int MAX_UNIT_SCALE = LAST_UNIT_CONS - UNIT_SCALE;

	protected static final BigDecimal[] ACCELERATION_SCALES = new BigDecimal[]
	{
		divide(LENGTH_SCALES[KILOMETER], SQUARED_TIME_SCALES[SQUARE_SECOND - 21]),
		divide(LENGTH_SCALES[HECTOMETER], SQUARED_TIME_SCALES[SQUARE_SECOND - 21]),
		divide(LENGTH_SCALES[DECAMETER], SQUARED_TIME_SCALES[SQUARE_SECOND - 21]),
		divide(LENGTH_SCALES[METER], SQUARED_TIME_SCALES[SQUARE_SECOND - 21]),
		divide(LENGTH_SCALES[DECIMETER], SQUARED_TIME_SCALES[SQUARE_SECOND - 21]),
		divide(LENGTH_SCALES[CENTIMETER], SQUARED_TIME_SCALES[SQUARE_SECOND - 21]),
		divide(LENGTH_SCALES[MILLIMETER], SQUARED_TIME_SCALES[SQUARE_SECOND - 21]),

		divide(LENGTH_SCALES[KILOMETER], SQUARED_TIME_SCALES[SQUARE_MINUTE - 21]),
		divide(LENGTH_SCALES[HECTOMETER], SQUARED_TIME_SCALES[SQUARE_MINUTE - 21]),
		divide(LENGTH_SCALES[DECAMETER], SQUARED_TIME_SCALES[SQUARE_MINUTE - 21]),
		divide(LENGTH_SCALES[METER], SQUARED_TIME_SCALES[SQUARE_MINUTE - 21]),
		divide(LENGTH_SCALES[DECIMETER], SQUARED_TIME_SCALES[SQUARE_MINUTE - 21]),
		divide(LENGTH_SCALES[CENTIMETER], SQUARED_TIME_SCALES[SQUARE_MINUTE - 21]),
		divide(LENGTH_SCALES[MILLIMETER], SQUARED_TIME_SCALES[SQUARE_MINUTE - 21]),

		divide(LENGTH_SCALES[KILOMETER], SQUARED_TIME_SCALES[SQUARE_HOUR - 21]),
		divide(LENGTH_SCALES[HECTOMETER], SQUARED_TIME_SCALES[SQUARE_HOUR - 21]),
		divide(LENGTH_SCALES[DECAMETER], SQUARED_TIME_SCALES[SQUARE_HOUR - 21]),
		divide(LENGTH_SCALES[METER], SQUARED_TIME_SCALES[SQUARE_HOUR - 21]),
		divide(LENGTH_SCALES[DECIMETER], SQUARED_TIME_SCALES[SQUARE_HOUR - 21]),
		divide(LENGTH_SCALES[CENTIMETER], SQUARED_TIME_SCALES[SQUARE_HOUR - 21]),
		divide(LENGTH_SCALES[MILLIMETER], SQUARED_TIME_SCALES[SQUARE_HOUR - 21])
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

    private final String[] ACCELERATION_SYMBOLS = new String[]{
        KILOMETER_PER_SQUARE_SECOND_SYMBOL,
        HECTOMETER_PER_SQUARE_SECOND_SYMBOL,
        DECAMETER_PER_SQUARE_SECOND_SYMBOL,
        METER_PER_SQUARE_SECOND_SYMBOL,
        DECIMETER_PER_SQUARE_SECOND_SYMBOL,
        CENTIMETER_PER_SQUARE_SECOND_SYMBOL,
        MILLIMETER_PER_SQUARE_SECOND_SYMBOL,
        
        KILOMETER_PER_SQUARE_MINUTE_SYMBOL,
        HECTOMETER_PER_SQUARE_MINUTE_SYMBOL,
        DECAMETER_PER_SQUARE_MINUTE_SYMBOL,
        METER_PER_SQUARE_MINUTE_SYMBOL,
        DECIMETER_PER_SQUARE_MINUTE_SYMBOL,
        CENTIMETER_PER_SQUARE_MINUTE_SYMBOL,
        MILLIMETER_PER_SQUARE_MINUTE_SYMBOL,
        
        KILOMETER_PER_SQUARE_HOUR_SYMBOL,
        HECTOMETER_PER_SQUARE_HOUR_SYMBOL,
        DECAMETER_PER_SQUARE_HOUR_SYMBOL,
        METER_PER_SQUARE_HOUR_SYMBOL,
        DECIMETER_PER_SQUARE_HOUR_SYMBOL,
        CENTIMETER_PER_SQUARE_HOUR_SYMBOL,
        MILLIMETER_PER_SQUARE_HOUR_SYMBOL
    };
    
	public Acceleration() {
        super();
		setMaxUnit(MAX_UNIT_SCALE);
		setUnit(METER_PER_SQUARE_SECOND);
		value = value.setScale(ROUND_SCALE, RoundingMode.HALF_UP);
    }

    public Acceleration(double value) {
        super(value);
		setMaxUnit(MAX_UNIT_SCALE);
		setUnit(METER_PER_SQUARE_SECOND);
		this.value = this.value.setScale(ROUND_SCALE, RoundingMode.HALF_UP);
    }

    public Acceleration(String value) {
        super(value);
		setMaxUnit(MAX_UNIT_SCALE);
		setUnit(METER_PER_SQUARE_SECOND);
		this.value = this.value.setScale(ROUND_SCALE, RoundingMode.HALF_UP);
    }

    public Acceleration(long value) {
        super(value);
		setMaxUnit(MAX_UNIT_SCALE);
		setUnit(METER_PER_SQUARE_SECOND);
		this.value = this.value.setScale(ROUND_SCALE, RoundingMode.HALF_UP);
    }

    public Acceleration(BigDecimal value) {
        super(value);
		setMaxUnit(MAX_UNIT_SCALE);
		setUnit(METER_PER_SQUARE_SECOND);
		this.value = this.value.setScale(ROUND_SCALE, RoundingMode.HALF_UP);
    }

    public Acceleration(double value, int unit) {
        super(value);
		setMaxUnit(MAX_UNIT_SCALE);
		setUnit(unit - UNIT_SCALE);
		this.value = this.value.setScale(ROUND_SCALE, RoundingMode.HALF_UP);
    }

    public Acceleration(String value, int unit) {
        super(value);
		setMaxUnit(MAX_UNIT_SCALE);
		setUnit(unit - UNIT_SCALE);
		this.value = this.value.setScale(ROUND_SCALE, RoundingMode.HALF_UP);
    }

    public Acceleration(long value, int unit) throws IllegalArgumentException {
        super(value);
		setMaxUnit(MAX_UNIT_SCALE);
		setUnit(unit - UNIT_SCALE);
		this.value = this.value.setScale(ROUND_SCALE, RoundingMode.HALF_UP);
    }

    public Acceleration(BigDecimal value, int unit) throws IllegalArgumentException {
        super(value);
		setMaxUnit(MAX_UNIT_SCALE);
		setUnit(unit - UNIT_SCALE);
		this.value = this.value.setScale(ROUND_SCALE, RoundingMode.HALF_UP);
    }

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toKilometerPerSquareSecond(double value, int unit) {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[KILOMETER_PER_SQUARE_SECOND - UNIT_SCALE]));
	}

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toHectometerPerSquareSecond(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[HECTOMETER_PER_SQUARE_SECOND- UNIT_SCALE]));
	}

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toDecameterPerSquareSecond(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[DECAMETER_PER_SQUARE_SECOND - UNIT_SCALE]));
    }

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toMeterPerSquareSecond(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[METER_PER_SQUARE_SECOND - UNIT_SCALE]));
	}

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toDecimeterPerSquareSecond(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[DECIMETER_PER_SQUARE_SECOND - UNIT_SCALE]));
	}

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toCentimeterPerSquareSecond(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[CENTIMETER_PER_SQUARE_SECOND - UNIT_SCALE]));
    }

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toMillimeterPerSquareSecond(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[MILLIMETER_PER_SQUARE_SECOND- UNIT_SCALE]));
	}

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toKilometerPerSquareMinute(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[KILOMETER_PER_SQUARE_MINUTE - UNIT_SCALE]));
    }

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toHectometerPerSquareMinute(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[HECTOMETER_PER_SQUARE_MINUTE - UNIT_SCALE]));
	}

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toDecameterPerSquareMinute(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[DECAMETER_PER_SQUARE_MINUTE - UNIT_SCALE]));
	}

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toMeterPerSquareMinute(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[METER_PER_SQUARE_MINUTE - UNIT_SCALE]));
	}

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toDecimeterPerSquareMinute(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[DECIMETER_PER_SQUARE_MINUTE - UNIT_SCALE]));
	}

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toCentimeterPerSquareMinute(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[CENTIMETER_PER_SQUARE_MINUTE - UNIT_SCALE]));
	}

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toMillimeterPerSquareMinute(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[MILLIMETER_PER_SQUARE_MINUTE - UNIT_SCALE]));
	}

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toKilometerPerSquareHour(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[KILOMETER_PER_SQUARE_HOUR - UNIT_SCALE]));
	}

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toHectometerPerSquareHour(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[HECTOMETER_PER_SQUARE_HOUR - UNIT_SCALE]));
	}

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toDecameterPerSquareHour(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[DECAMETER_PER_SQUARE_HOUR - UNIT_SCALE]));
	}

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toMeterPerSquareHour(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[METER_PER_SQUARE_HOUR - UNIT_SCALE]));
	}

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toDecimeterPerSquareHour(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[DECIMETER_PER_SQUARE_HOUR - UNIT_SCALE]));
	}

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toCentimeterPerSquareHour(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[CENTIMETER_PER_SQUARE_HOUR - UNIT_SCALE]));
	}

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toMillimeterPerSquareHour(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[MILLIMETER_PER_SQUARE_HOUR - UNIT_SCALE]));
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

    @Override
    public String toString() {
        return value + ACCELERATION_SYMBOLS[unit];
    }

	@Override
	public boolean isInInternationalSystem() {
		return unit == (METER_PER_SQUARE_SECOND - UNIT_SCALE);
	}

    @Override
    public String getUnitSymbol() {
        return ACCELERATION_SYMBOLS[unit];
    }
    
    @Deprecated
	protected Acceleration getInstance() {
		if (instance == null)
			instance = new Acceleration();
		return instance;
	}
}
