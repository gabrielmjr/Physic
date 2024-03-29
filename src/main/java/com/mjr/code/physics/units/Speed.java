package com.mjr.code.physics.units;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

import static com.mjr.code.physics.units.Length.*;
import static com.mjr.code.physics.units.Time.*;

public class Speed extends Unit implements ISpeed { 
    @Deprecated
	private static Speed instance; 

	public static final int KILOMETER_PER_SECOND = Time.LAST_UNIT_CONS + 1;
	public static final int HECTOMETER_PER_SECOND = Time.LAST_UNIT_CONS + 2;
	public static final int DECAMETER_PER_SECOND = Time.LAST_UNIT_CONS + 3;
	public static final int METER_PER_SECOND = Time.LAST_UNIT_CONS + 4;
	public static final int DECIMETER_PER_SECOND = Time.LAST_UNIT_CONS + 5;
	public static final int CENTIMETER_PER_SECOND = Time.LAST_UNIT_CONS + 6;
	public static final int MILLIMETER_PER_SECOND = Time.LAST_UNIT_CONS + 7;

	public static final int KILOMETER_PER_MINUTE = Time.LAST_UNIT_CONS + 8;
	public static final int HECTOMETER_PER_MINUTE = Time.LAST_UNIT_CONS + 9;
	public static final int DECAMETER_PER_MINUTE = Time.LAST_UNIT_CONS + 10;
	public static final int METER_PER_MINUTE = Time.LAST_UNIT_CONS + 11;
	public static final int DECIMETER_PER_MINUTE = Time.LAST_UNIT_CONS + 12;
	public static final int CENTIMETER_PER_MINUTE = Time.LAST_UNIT_CONS + 13;
	public static final int MILLIMETER_PER_MINUTE = Time.LAST_UNIT_CONS + 14;

	public static final int KILOMETER_PER_HOUR = Time.LAST_UNIT_CONS + 15;
	public static final int HECTOMETER_PER_HOUR = Time.LAST_UNIT_CONS + 16;
	public static final int DECAMETER_PER_HOUR = Time.LAST_UNIT_CONS + 17;
	public static final int METER_PER_HOUR = Time.LAST_UNIT_CONS + 18;
	public static final int DECIMETER_PER_HOUR = Time.LAST_UNIT_CONS + 19;
	public static final int CENTIMETER_PER_HOUR = Time.LAST_UNIT_CONS + 20;
	public static final int MILLIMETER_PER_HOUR = Time.LAST_UNIT_CONS + 21;

    protected static final int UNIT_SCALE = KILOMETER_PER_SECOND;
    protected static final int LAST_UNIT_CONS = MILLIMETER_PER_HOUR;
    private final int MAX_UNIT_SCALE = LAST_UNIT_CONS - UNIT_SCALE;

	protected static final BigDecimal[] SPEED_SCALES = new BigDecimal[]
	{
		divide(LENGTH_SCALES[KILOMETER], TIME_SCALES[SECOND - Time.UNIT_SCALE]),
		divide(LENGTH_SCALES[HECTOMETER], TIME_SCALES[SECOND - Time.UNIT_SCALE]),
		divide(LENGTH_SCALES[DECAMETER], TIME_SCALES[SECOND - Time.UNIT_SCALE]),
		divide(LENGTH_SCALES[METER], TIME_SCALES[SECOND - Time.UNIT_SCALE]),
		divide(LENGTH_SCALES[DECIMETER], TIME_SCALES[SECOND - Time.UNIT_SCALE]),
		divide(LENGTH_SCALES[CENTIMETER], TIME_SCALES[SECOND - Time.UNIT_SCALE]),
		divide(LENGTH_SCALES[MILLIMETER], TIME_SCALES[SECOND - Time.UNIT_SCALE]),

		divide(LENGTH_SCALES[KILOMETER], TIME_SCALES[MINUTE - Time.UNIT_SCALE]),
		divide(LENGTH_SCALES[HECTOMETER], TIME_SCALES[MINUTE - Time.UNIT_SCALE]),
		divide(LENGTH_SCALES[DECAMETER], TIME_SCALES[MINUTE - Time.UNIT_SCALE]),
		divide(LENGTH_SCALES[METER], TIME_SCALES[MINUTE - Time.UNIT_SCALE]),
		divide(LENGTH_SCALES[DECIMETER], TIME_SCALES[MINUTE - Time.UNIT_SCALE]),
		divide(LENGTH_SCALES[CENTIMETER], TIME_SCALES[MINUTE - Time.UNIT_SCALE]),
		divide(LENGTH_SCALES[MILLIMETER], TIME_SCALES[MINUTE - Time.UNIT_SCALE]),

		divide(LENGTH_SCALES[KILOMETER], TIME_SCALES[HOUR - Time.UNIT_SCALE]),
		divide(LENGTH_SCALES[HECTOMETER], TIME_SCALES[HOUR - Time.UNIT_SCALE]),
		divide(LENGTH_SCALES[DECAMETER], TIME_SCALES[HOUR - Time.UNIT_SCALE]),
		divide(LENGTH_SCALES[METER], TIME_SCALES[HOUR - Time.UNIT_SCALE]),
		divide(LENGTH_SCALES[DECIMETER], TIME_SCALES[HOUR - Time.UNIT_SCALE]),
		divide(LENGTH_SCALES[CENTIMETER], TIME_SCALES[HOUR - Time.UNIT_SCALE]),
		divide(LENGTH_SCALES[MILLIMETER], TIME_SCALES[HOUR - Time.UNIT_SCALE]),
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

    protected final String[] SPEED_SYMBOLS = new String[] {
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
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(METER_PER_SECOND - UNIT_SCALE);
    }

    public Speed(double value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(METER_PER_SECOND - UNIT_SCALE);
    }

    public Speed(String value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(METER_PER_SECOND - UNIT_SCALE);
    }

    public Speed(long value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(METER_PER_SECOND - UNIT_SCALE);
    }

    public Speed(BigDecimal value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(METER_PER_SECOND - UNIT_SCALE);
    }

    public Speed(double value, int unit) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(unit - UNIT_SCALE);
    }

    public Speed(String value, int unit) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(unit - UNIT_SCALE);
    }

    public Speed(long value, int unit) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(unit - UNIT_SCALE);
    }

    public Speed(BigDecimal value, int unit) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(unit - UNIT_SCALE);
    }

	@Contract("_, _ -> new")
    public static @NotNull Speed toKilometerPerSecond(double value, int unit) {
        return new Speed(divide(multiply(value, SPEED_SCALES[KILOMETER_PER_SECOND - UNIT_SCALE]), SPEED_SCALES[unit - UNIT_SCALE]), KILOMETER_PER_SECOND);
    }

	@Contract("_, _ -> new")
    public static @NotNull Speed toHectometerPerSecond(double value, int unit) {
	    return new Speed(divide(multiply(value, SPEED_SCALES[HECTOMETER_PER_SECOND - UNIT_SCALE]), SPEED_SCALES[unit - UNIT_SCALE]), HECTOMETER_PER_SECOND);
    }

	@Contract("_, _ -> new")
    public static @NotNull Speed toDecameterPerSecond(double value, int unit) {
		return new Speed(divide(multiply(value, SPEED_SCALES[DECAMETER_PER_SECOND - UNIT_SCALE]), SPEED_SCALES[unit - UNIT_SCALE]), DECAMETER_PER_SECOND);
    }

	@Contract("_, _ -> new")
    public static @NotNull Speed toMeterPerSecond(double value, int unit) {
		return new Speed(divide(multiply(value, SPEED_SCALES[METER_PER_SECOND - UNIT_SCALE]), SPEED_SCALES[unit - UNIT_SCALE]), METER_PER_SECOND);
    }

	@Contract("_, _ -> new")
    public static @NotNull Speed toDecimeterPerSecond(double value, int unit) {
		return new Speed(divide(multiply(value, SPEED_SCALES[DECIMETER_PER_SECOND - UNIT_SCALE]), SPEED_SCALES[unit - UNIT_SCALE]), DECIMETER_PER_SECOND);
    }

	@Contract("_, _ -> new")
    public static @NotNull Speed toCentimeterPerSecond(double value, int unit) {
		return new Speed(divide(multiply(value, SPEED_SCALES[CENTIMETER_PER_SECOND - UNIT_SCALE]), SPEED_SCALES[unit - UNIT_SCALE]), CENTIMETER_PER_SECOND);
    }

	@Contract("_, _ -> new")
    public static @NotNull Speed toMillimeterPerSecond(double value, int unit) {
		return new Speed(divide(multiply(value, SPEED_SCALES[MILLIMETER_PER_SECOND - UNIT_SCALE]), SPEED_SCALES[unit - UNIT_SCALE]), MILLIMETER_PER_SECOND);
    }

	@Contract("_, _ -> new")
    public static @NotNull Speed toKilometerPerMinute(double value, int unit) {
		return new Speed(divide(multiply(value, SPEED_SCALES[KILOMETER_PER_MINUTE - UNIT_SCALE]), SPEED_SCALES[unit - UNIT_SCALE]), KILOMETER_PER_MINUTE);
    }

	@Contract("_, _ -> new")
    public static @NotNull Speed toHectometerPerMinute(double value, int unit) {
		return new Speed(divide(multiply(value, SPEED_SCALES[HECTOMETER_PER_MINUTE - UNIT_SCALE]), SPEED_SCALES[unit - UNIT_SCALE]), HECTOMETER_PER_MINUTE);
    }

	@Contract("_, _ -> new")
    public static @NotNull Speed toDecameterPerMinute(double value, int unit) {
		return new Speed(divide(multiply(value, SPEED_SCALES[DECAMETER_PER_MINUTE - UNIT_SCALE]), SPEED_SCALES[unit - UNIT_SCALE]), DECAMETER_PER_MINUTE);
    }

	@Contract("_, _ -> new")
    public static @NotNull Speed toMeterPerMinute(double value, int unit) {
		return new Speed(divide(multiply(value, SPEED_SCALES[METER_PER_MINUTE - UNIT_SCALE]), SPEED_SCALES[unit - UNIT_SCALE]), METER_PER_MINUTE);
    }

	@Contract("_, _ -> new")
    public static @NotNull Speed toDecimeterPerMinute(double value, int unit) {
		return new Speed(divide(multiply(value, SPEED_SCALES[DECIMETER_PER_MINUTE - UNIT_SCALE]), SPEED_SCALES[unit - UNIT_SCALE]), DECIMETER_PER_MINUTE);
    }

	@Contract("_, _ -> new")
    public static @NotNull Speed toCentimeterPerMinute(double value, int unit) {
		return new Speed(divide(multiply(value, SPEED_SCALES[CENTIMETER_PER_MINUTE - UNIT_SCALE]), SPEED_SCALES[unit - UNIT_SCALE]), CENTIMETER_PER_MINUTE);
    }

	@Contract("_, _ -> new")
    public static @NotNull Speed toMillimeterPerMinute(double value, int unit) {
		return new Speed(divide(multiply(value, SPEED_SCALES[MILLIMETER_PER_MINUTE - UNIT_SCALE]), SPEED_SCALES[unit - UNIT_SCALE]), MILLIMETER_PER_MINUTE);
    }

	@Contract("_, _ -> new")
    public static @NotNull Speed toKilometerPerHour(double value, int unit) {
		return new Speed(divide(multiply(value, SPEED_SCALES[KILOMETER_PER_HOUR - UNIT_SCALE]), SPEED_SCALES[unit - UNIT_SCALE]), KILOMETER_PER_HOUR);
    }

	@Contract("_, _ -> new")
    public static @NotNull Speed toHectometerPerHour(double value, int unit) {
		return new Speed(divide(multiply(value, SPEED_SCALES[HECTOMETER_PER_HOUR - UNIT_SCALE]), SPEED_SCALES[unit - UNIT_SCALE]), HECTOMETER_PER_HOUR);
    }

	@Contract("_, _ -> new")
    public static @NotNull Speed toDecameterPerHour(double value, int unit) {
		return new Speed(divide(multiply(value, SPEED_SCALES[DECAMETER_PER_HOUR - UNIT_SCALE]), SPEED_SCALES[unit - UNIT_SCALE]), DECAMETER_PER_HOUR);
    }

	@Contract("_, _ -> new")
    public static @NotNull Speed toMeterPerHour(double value, int unit) {
		return new Speed(divide(multiply(value, SPEED_SCALES[METER_PER_HOUR - UNIT_SCALE]), SPEED_SCALES[unit - UNIT_SCALE]), METER_PER_HOUR);
    }

	@Contract("_, _ -> new")
    public static @NotNull Speed toDecimeterPerHour(double value, int unit) {
		return new Speed(divide(multiply(value, SPEED_SCALES[DECIMETER_PER_HOUR - UNIT_SCALE]), SPEED_SCALES[unit - UNIT_SCALE]), DECIMETER_PER_HOUR);
    }

	@Contract("_, _ -> new")
    public static @NotNull Speed toCentimeterPerHour(double value, int unit) {
		return new Speed(divide(multiply(value, SPEED_SCALES[CENTIMETER_PER_HOUR - UNIT_SCALE]), SPEED_SCALES[unit - UNIT_SCALE]), CENTIMETER_PER_HOUR);
    }

	@Contract("_, _ -> new")
    public static @NotNull Speed toMillimeterPerHour(double value, int unit) {
		return new Speed(divide(multiply(value, SPEED_SCALES[MILLIMETER_PER_HOUR - UNIT_SCALE]), SPEED_SCALES[unit - UNIT_SCALE]), MILLIMETER_PER_HOUR);
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
    public boolean isInInternationalSystem() {
        return unit == (METER_PER_SECOND - UNIT_SCALE);
    }

    @Override
    public String getUnitSymbol() {
        return SPEED_SYMBOLS[unit];
    }

    @Deprecated
	protected static Speed getInstance() {
		if (!(instance instanceof Speed))
		    instance = new Speed();
		return instance;
	}
}
