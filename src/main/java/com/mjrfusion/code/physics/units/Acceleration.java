package com.mjrfusion.code.physics.units;

import com.mjrfusion.code.physics.Physic;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static com.mjrfusion.code.physics.units.SquaredTime.*;

public class Acceleration extends Unit implements IAcceleration {
    @Deprecated
    private static Acceleration instance;
    
	public static final int KILOMETER_PER_SQUARED_SECOND = Speed.LAST_UNIT_CONS + 1;
	public static final int HECTOMETER_PER_SQUARED_SECOND = Speed.LAST_UNIT_CONS + 2;
	public static final int DECAMETER_PER_SQUARED_SECOND = Speed.LAST_UNIT_CONS + 3;
	public static final int METER_PER_SQUARED_SECOND = Speed.LAST_UNIT_CONS + 4;
	public static final int DECIMETER_PER_SQUARED_SECOND = Speed.LAST_UNIT_CONS + 5;
	public static final int CENTIMETER_PER_SQUARED_SECOND = Speed.LAST_UNIT_CONS + 6;
	public static final int MILLIMETER_PER_SQUARED_SECOND = Speed.LAST_UNIT_CONS + 7;

	public static final int KILOMETER_PER_SQUARED_MINUTE = Speed.LAST_UNIT_CONS + 8;
	public static final int HECTOMETER_PER_SQUARED_MINUTE = Speed.LAST_UNIT_CONS + 9;
	public static final int DECAMETER_PER_SQUARED_MINUTE = Speed.LAST_UNIT_CONS + 10;
	public static final int METER_PER_SQUARED_MINUTE = Speed.LAST_UNIT_CONS + 11;
	public static final int DECIMETER_PER_SQUARED_MINUTE = Speed.LAST_UNIT_CONS + 12;
	public static final int CENTIMETER_PER_SQUARED_MINUTE = Speed.LAST_UNIT_CONS + 13;
	public static final int MILLIMETER_PER_SQUARED_MINUTE = Speed.LAST_UNIT_CONS + 14;

	public static final int KILOMETER_PER_SQUARED_HOUR = Speed.LAST_UNIT_CONS + 15;
	public static final int HECTOMETER_PER_SQUARED_HOUR = Speed.LAST_UNIT_CONS + 16;
	public static final int DECAMETER_PER_SQUARED_HOUR = Speed.LAST_UNIT_CONS + 17;
	public static final int METER_PER_SQUARED_HOUR = Speed.LAST_UNIT_CONS + 18;
	public static final int DECIMETER_PER_SQUARED_HOUR = Speed.LAST_UNIT_CONS + 19;
	public static final int CENTIMETER_PER_SQUARED_HOUR = Speed.LAST_UNIT_CONS + 20;
	public static final int MILLIMETER_PER_SQUARED_HOUR = Speed.LAST_UNIT_CONS + 21;

	protected static final int UNIT_SCALE = KILOMETER_PER_SQUARED_SECOND;
	protected static final int LAST_UNIT_CONS = MILLIMETER_PER_SQUARED_HOUR;
	private final int MAX_UNIT_SCALE = LAST_UNIT_CONS - UNIT_SCALE;

	protected static final BigDecimal[] ACCELERATION_SCALES = new BigDecimal[]
	{
		divide(Length.LENGTH_SCALES[Length.KILOMETER], SQUARED_TIME_SCALES[SQUARED_SECOND - 21]),
		divide(Length.LENGTH_SCALES[Length.HECTOMETER], SQUARED_TIME_SCALES[SQUARED_SECOND - 21]),
		divide(Length.LENGTH_SCALES[Length.DECAMETER], SQUARED_TIME_SCALES[SQUARED_SECOND - 21]),
		divide(Length.LENGTH_SCALES[Length.METER], SQUARED_TIME_SCALES[SQUARED_SECOND - 21]),
		divide(Length.LENGTH_SCALES[Length.DECIMETER], SQUARED_TIME_SCALES[SQUARED_SECOND - 21]),
		divide(Length.LENGTH_SCALES[Length.CENTIMETER], SQUARED_TIME_SCALES[SQUARED_SECOND - 21]),
		divide(Length.LENGTH_SCALES[Length.MILLIMETER], SQUARED_TIME_SCALES[SQUARED_SECOND - 21]),

		divide(Length.LENGTH_SCALES[Length.KILOMETER], SQUARED_TIME_SCALES[SQUARED_MINUTE - 21]),
		divide(Length.LENGTH_SCALES[Length.HECTOMETER], SQUARED_TIME_SCALES[SQUARED_MINUTE - 21]),
		divide(Length.LENGTH_SCALES[Length.DECAMETER], SQUARED_TIME_SCALES[SQUARED_MINUTE - 21]),
		divide(Length.LENGTH_SCALES[Length.METER], SQUARED_TIME_SCALES[SQUARED_MINUTE - 21]),
		divide(Length.LENGTH_SCALES[Length.DECIMETER], SQUARED_TIME_SCALES[SQUARED_MINUTE - 21]),
		divide(Length.LENGTH_SCALES[Length.CENTIMETER], SQUARED_TIME_SCALES[SQUARED_MINUTE - 21]),
		divide(Length.LENGTH_SCALES[Length.MILLIMETER], SQUARED_TIME_SCALES[SQUARED_MINUTE - 21]),

		divide(Length.LENGTH_SCALES[Length.KILOMETER], SQUARED_TIME_SCALES[SQUARED_HOUR - 21]),
		divide(Length.LENGTH_SCALES[Length.HECTOMETER], SQUARED_TIME_SCALES[SQUARED_HOUR - 21]),
		divide(Length.LENGTH_SCALES[Length.DECAMETER], SQUARED_TIME_SCALES[SQUARED_HOUR - 21]),
		divide(Length.LENGTH_SCALES[Length.METER], SQUARED_TIME_SCALES[SQUARED_HOUR - 21]),
		divide(Length.LENGTH_SCALES[Length.DECIMETER], SQUARED_TIME_SCALES[SQUARED_HOUR - 21]),
		divide(Length.LENGTH_SCALES[Length.CENTIMETER], SQUARED_TIME_SCALES[SQUARED_HOUR - 21]),
		divide(Length.LENGTH_SCALES[Length.MILLIMETER], SQUARED_TIME_SCALES[SQUARED_HOUR - 21])
	};

	public static final String KILOMETER_PER_SQUARED_SECOND_SYMBOL = Length.KILOMETER_SYMBOL + "/" + SQUARED_SECOND_SYMBOL;
	public static final String HECTOMETER_PER_SQUARED_SECOND_SYMBOL = Length.HECTOMETER_SYMBOL + "/" + SQUARED_SECOND_SYMBOL;
	public static final String DECAMETER_PER_SQUARED_SECOND_SYMBOL = Length.DECAMETER_SYMBOL + "/" + SQUARED_SECOND_SYMBOL;
	public static final String METER_PER_SQUARED_SECOND_SYMBOL = Length.METER_SYMBOL + "/" + SQUARED_SECOND_SYMBOL;
	public static final String DECIMETER_PER_SQUARED_SECOND_SYMBOL = Length.DECIMETER_SYMBOL + "/" + SQUARED_SECOND_SYMBOL;
	public static final String CENTIMETER_PER_SQUARED_SECOND_SYMBOL = Length.CENTIMETER_SYMBOL + "/" + SQUARED_SECOND_SYMBOL;
	public static final String MILLIMETER_PER_SQUARED_SECOND_SYMBOL = Length.MILLIMETER_SYMBOL + "/" + SQUARED_SECOND_SYMBOL;

	public static final String KILOMETER_PER_SQUARED_MINUTE_SYMBOL = Length.KILOMETER_SYMBOL + "/" + SQUARED_MINUTE_SYMBOL;
	public static final String HECTOMETER_PER_SQUARED_MINUTE_SYMBOL = Length.HECTOMETER_SYMBOL + "/" + SQUARED_MINUTE_SYMBOL;
	public static final String DECAMETER_PER_SQUARED_MINUTE_SYMBOL = Length.DECAMETER_SYMBOL + "/" + SQUARED_MINUTE_SYMBOL;
	public static final String METER_PER_SQUARED_MINUTE_SYMBOL = Length.METER_SYMBOL + "/" + SQUARED_MINUTE_SYMBOL;
	public static final String DECIMETER_PER_SQUARED_MINUTE_SYMBOL = Length.DECIMETER_SYMBOL + "/" + SQUARED_MINUTE_SYMBOL;
	public static final String CENTIMETER_PER_SQUARED_MINUTE_SYMBOL = Length.CENTIMETER_SYMBOL + "/" + SQUARED_MINUTE_SYMBOL;
	public static final String MILLIMETER_PER_SQUARED_MINUTE_SYMBOL = Length.MILLIMETER_SYMBOL + "/" + SQUARED_MINUTE_SYMBOL;

	public static final String KILOMETER_PER_SQUARED_HOUR_SYMBOL = Length.KILOMETER_SYMBOL + "/" + SQUARED_HOUR_SYMBOL;
	public static final String HECTOMETER_PER_SQUARED_HOUR_SYMBOL = Length.HECTOMETER_SYMBOL + "/" + SQUARED_HOUR_SYMBOL;
	public static final String DECAMETER_PER_SQUARED_HOUR_SYMBOL = Length.DECAMETER_SYMBOL + "/" + SQUARED_HOUR_SYMBOL;
	public static final String METER_PER_SQUARED_HOUR_SYMBOL = Length.METER_SYMBOL + "/" + SQUARED_HOUR_SYMBOL;
	public static final String DECIMETER_PER_SQUARED_HOUR_SYMBOL = Length.DECIMETER_SYMBOL + "/" + SQUARED_HOUR_SYMBOL;
	public static final String CENTIMETER_PER_SQUARED_HOUR_SYMBOL = Length.CENTIMETER_SYMBOL + "/" + SQUARED_HOUR_SYMBOL;
	public static final String MILLIMETER_PER_SQUARED_HOUR_SYMBOL = Length.MILLIMETER_SYMBOL + "/" + SQUARED_HOUR_SYMBOL;

    private final String[] ACCELERATION_SYMBOLS = new String[]{
        KILOMETER_PER_SQUARED_SECOND_SYMBOL,
        HECTOMETER_PER_SQUARED_SECOND_SYMBOL,
        DECAMETER_PER_SQUARED_SECOND_SYMBOL,
        METER_PER_SQUARED_SECOND_SYMBOL,
        DECIMETER_PER_SQUARED_SECOND_SYMBOL,
        CENTIMETER_PER_SQUARED_SECOND_SYMBOL,
        MILLIMETER_PER_SQUARED_SECOND_SYMBOL,
        
        KILOMETER_PER_SQUARED_MINUTE_SYMBOL,
        HECTOMETER_PER_SQUARED_MINUTE_SYMBOL,
        DECAMETER_PER_SQUARED_MINUTE_SYMBOL,
        METER_PER_SQUARED_MINUTE_SYMBOL,
        DECIMETER_PER_SQUARED_MINUTE_SYMBOL,
        CENTIMETER_PER_SQUARED_MINUTE_SYMBOL,
        MILLIMETER_PER_SQUARED_MINUTE_SYMBOL,
        
        KILOMETER_PER_SQUARED_HOUR_SYMBOL,
        HECTOMETER_PER_SQUARED_HOUR_SYMBOL,
        DECAMETER_PER_SQUARED_HOUR_SYMBOL,
        METER_PER_SQUARED_HOUR_SYMBOL,
        DECIMETER_PER_SQUARED_HOUR_SYMBOL,
        CENTIMETER_PER_SQUARED_HOUR_SYMBOL,
        MILLIMETER_PER_SQUARED_HOUR_SYMBOL
    };
    
	public Acceleration() {
        super();
		setMaxUnit(MAX_UNIT_SCALE);
		setUnit(METER_PER_SQUARED_SECOND);
		value = value.setScale(Physic.ROUND_SCALE, RoundingMode.HALF_UP);
    }

    public Acceleration(double value) {
        super(value);
		setMaxUnit(MAX_UNIT_SCALE);
		setUnit(METER_PER_SQUARED_SECOND);
		this.value = this.value.setScale(Physic.ROUND_SCALE, RoundingMode.HALF_UP);
    }

    public Acceleration(String value) {
        super(value);
		setMaxUnit(MAX_UNIT_SCALE);
		setUnit(METER_PER_SQUARED_SECOND);
		this.value = this.value.setScale(Physic.ROUND_SCALE, RoundingMode.HALF_UP);
    }

    public Acceleration(long value) {
        super(value);
		setMaxUnit(MAX_UNIT_SCALE);
		setUnit(METER_PER_SQUARED_SECOND);
		this.value = this.value.setScale(Physic.ROUND_SCALE, RoundingMode.HALF_UP);
    }

    public Acceleration(BigDecimal value) {
        super(value);
		setMaxUnit(MAX_UNIT_SCALE);
		setUnit(METER_PER_SQUARED_SECOND);
		this.value = this.value.setScale(Physic.ROUND_SCALE, RoundingMode.HALF_UP);
    }

    public Acceleration(double value, int unit) {
        super(value);
		setMaxUnit(MAX_UNIT_SCALE);
		setUnit(unit - UNIT_SCALE);
		this.value = this.value.setScale(Physic.ROUND_SCALE, RoundingMode.HALF_UP);
    }

    public Acceleration(String value, int unit) {
        super(value);
		setMaxUnit(MAX_UNIT_SCALE);
		setUnit(unit - UNIT_SCALE);
		this.value = this.value.setScale(Physic.ROUND_SCALE, RoundingMode.HALF_UP);
    }

    public Acceleration(long value, int unit) throws IllegalArgumentException {
        super(value);
		setMaxUnit(MAX_UNIT_SCALE);
		setUnit(unit - UNIT_SCALE);
		this.value = this.value.setScale(Physic.ROUND_SCALE, RoundingMode.HALF_UP);
    }

    public Acceleration(BigDecimal value, int unit) throws IllegalArgumentException {
        super(value);
		setMaxUnit(MAX_UNIT_SCALE);
		setUnit(unit - UNIT_SCALE);
		this.value = this.value.setScale(Physic.ROUND_SCALE, RoundingMode.HALF_UP);
    }

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toKilometerPerSquaredSecond(double value, int unit) {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[KILOMETER_PER_SQUARED_SECOND - UNIT_SCALE]));
	}

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toHectometerPerSquaredSecond(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[HECTOMETER_PER_SQUARED_SECOND- UNIT_SCALE]));
	}

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toDecameterPerSquaredSecond(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[DECAMETER_PER_SQUARED_SECOND - UNIT_SCALE]));
    }

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toMeterPerSquaredSecond(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[METER_PER_SQUARED_SECOND - UNIT_SCALE]));
	}

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toDecimeterPerSquaredSecond(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[DECIMETER_PER_SQUARED_SECOND - UNIT_SCALE]));
	}

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toCentimeterPerSquaredSecond(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[CENTIMETER_PER_SQUARED_SECOND - UNIT_SCALE]));
    }

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toMillimeterPerSquaredSecond(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[MILLIMETER_PER_SQUARED_SECOND- UNIT_SCALE]));
	}

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toKilometerPerSquaredMinute(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[KILOMETER_PER_SQUARED_MINUTE - UNIT_SCALE]));
    }

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toHectometerPerSquaredMinute(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[HECTOMETER_PER_SQUARED_MINUTE - UNIT_SCALE]));
	}

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toDecameterPerSquaredMinute(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[DECAMETER_PER_SQUARED_MINUTE - UNIT_SCALE]));
	}

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toMeterPerSquaredMinute(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[METER_PER_SQUARED_MINUTE - UNIT_SCALE]));
	}

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toDecimeterPerSquaredMinute(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[DECIMETER_PER_SQUARED_MINUTE - UNIT_SCALE]));
	}

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toCentimeterPerSquaredMinute(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[CENTIMETER_PER_SQUARED_MINUTE - UNIT_SCALE]));
	}

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toMillimeterPerSquaredMinute(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[MILLIMETER_PER_SQUARED_MINUTE - UNIT_SCALE]));
	}

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toKilometerPerSquaredHour(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[KILOMETER_PER_SQUARED_HOUR - UNIT_SCALE]));
	}

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toHectometerPerSquaredHour(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[HECTOMETER_PER_SQUARED_HOUR - UNIT_SCALE]));
	}

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toDecameterPerSquaredHour(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[DECAMETER_PER_SQUARED_HOUR - UNIT_SCALE]));
	}

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toMeterPerSquaredHour(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[METER_PER_SQUARED_HOUR - UNIT_SCALE]));
	}

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toDecimeterPerSquaredHour(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[DECIMETER_PER_SQUARED_HOUR - UNIT_SCALE]));
	}

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toCentimeterPerSquaredHour(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[CENTIMETER_PER_SQUARED_HOUR - UNIT_SCALE]));
	}

	@Contract("_, _ -> new")
	public static @NotNull Acceleration toMillimeterPerSquaredHour(double value, int unit) throws IllegalArgumentException {
		return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[unit - UNIT_SCALE]), ACCELERATION_SCALES[MILLIMETER_PER_SQUARED_HOUR - UNIT_SCALE]));
	}

    @Override
    public Acceleration toKilometerPerSquaredSecond() {
        return null;
    }

    @Override
    public Acceleration toHectometerPerSquaredSecond() {
        return null;
    }

    @Override
    public Acceleration toDecameterPerSquaredSecond() {
        return null;
    }

    @Override
    public Acceleration toMeterPerSquaredSecond() {
        return null;
    }

    @Override
    public Acceleration toDecimeterPerSquaredSecond() {
        return null;
    }

    @Override
    public Acceleration toCentimeterPerSquaredSecond() {
        return null;
    }

    @Override
    public Acceleration toMillimeterPerSquaredSecond() {
        return null;
    }

    @Override
    public Acceleration toKilometerPerSquaredMinute() {
        return null;
    }

    @Override
    public Acceleration toHectometerPerSquaredMinute() {
        return null;
    }

    @Override
    public Acceleration toDecameterPerSquaredMinute() {
        return null;
    }

    @Override
    public Acceleration toMeterPerSquaredMinute() {
        return null;
    }

    @Override
    public Acceleration toDecimeterPerSquaredMinute() {
        return null;
    }

    @Override
    public Acceleration toCentimeterPerSquaredMinute() {
        return null;
    }

    @Override
    public Acceleration toMillimeterPerSquaredMinute() {
        return null;
    }

    @Override
    public Acceleration toKilometerPerSquaredHour() {
        return null;
    }

    @Override
    public Acceleration toHectometerPerSquaredHour() {
        return null;
    }

    @Override
    public Acceleration toDecameterPerSquaredHour() {
        return null;
    }

    @Override
    public Acceleration toMeterPerSquaredHour() {
        return null;
    }

    @Override
    public Acceleration toDecimeterPerSquaredHour() {
        return null;
    }

    @Override
    public Acceleration toCentimeterPerSquaredHour() {
        return null;
    }

    @Override
    public Acceleration toMillimeterPerSquaredHour() {
        return null;
    }

    @Override
    public String toString() {
        return value + ACCELERATION_SYMBOLS[unit];
    }

	@Override
	public boolean isInInternationalSystem() {
		return unit == (METER_PER_SQUARED_SECOND - UNIT_SCALE);
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
