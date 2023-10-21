package com.mjr.code.physics.units;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

import static com.mjr.code.physics.units.Length.*;

public class Volume extends Unit implements IVolume {
    @Deprecated
    private static Volume instance; 

	public static final int CUBED_KILOMETER = Area.LAST_UNIT_CONS + 1;
	public static final int CUBED_HECTOMETER = Area.LAST_UNIT_CONS + 2;
	public static final int CUBED_DECAMETER = Area.LAST_UNIT_CONS + 3;
	public static final int CUBED_METER = Area.LAST_UNIT_CONS + 4;
	public static final int CUBED_DECIMETER = Area.LAST_UNIT_CONS + 5;
	public static final int CUBED_CENTIMETER = Area.LAST_UNIT_CONS + 6;
	public static final int CUBED_MILLIMETER = Area.LAST_UNIT_CONS + 7;

    protected static final int UNIT_SCALE = CUBED_KILOMETER;
    protected static final int LAST_UNIT_CONS = CUBED_MILLIMETER;
    private final int MAX_UNIT_SCALE = LAST_UNIT_CONS - UNIT_SCALE;

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

	public static final String CUBED_KILOMETER_SYMBOL = KILOMETER_SYMBOL + "³";
	public static final String CUBED_HECTOMETER_SYMBOL = HECTOMETER_SYMBOL + "³";
	public static final String CUBED_DECAMETER_SYMBOL = DECAMETER_SYMBOL + "³";
	public static final String CUBED_METER_SYMBOL = METER_SYMBOL + "³";
	public static final String CUBED_DECIMETER_SYMBOL = DECIMETER_SYMBOL + "³";
	public static final String CUBED_CENTIMETER_SYMBOL = CENTIMETER_SYMBOL + "³";
	public static final String CUBED_MILLIMETER_SYMBOL = MILLIMETER_SYMBOL + "³";

    protected final String[] VOLUME_SYMBOLS = new String[] {
            CUBED_KILOMETER_SYMBOL,
            CUBED_HECTOMETER_SYMBOL,
            CUBED_DECAMETER_SYMBOL,
            CUBED_METER_SYMBOL,
            CUBED_DECIMETER_SYMBOL,
            CUBED_CENTIMETER_SYMBOL,
            CUBED_MILLIMETER_SYMBOL
    };

    public Volume() {
        super();
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(CUBED_METER - UNIT_SCALE);
    }

    public Volume(double value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(CUBED_METER - UNIT_SCALE);
    }

    public Volume(String value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(CUBED_METER - UNIT_SCALE);
    }

    public Volume(long value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(CUBED_METER - UNIT_SCALE);
    }

    public Volume(BigDecimal value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(CUBED_METER - UNIT_SCALE);
    }

    public Volume(double value, int unit) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(unit - UNIT_SCALE);
    }

    public Volume(String value, int unit) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(unit - UNIT_SCALE);
    }

    public Volume(long value, int unit) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(unit - UNIT_SCALE);
    }

    public Volume(BigDecimal value, int unit) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(unit - UNIT_SCALE);
    }

	@Contract("_, _ -> new")
    public static @NotNull Volume toCubedKilometer(double value, int unit) {
		return new Volume(divide(multiply(value, VOLUME_SCALES[CUBED_KILOMETER - UNIT_SCALE]), VOLUME_SCALES[unit - UNIT_SCALE]), CUBED_KILOMETER);
    }

	@Contract("_, _ -> new")
    public static @NotNull Volume toCubedHectometer(double value, int unit) {
        return new Volume(divide(multiply(value, VOLUME_SCALES[CUBED_HECTOMETER - UNIT_SCALE]), VOLUME_SCALES[unit - UNIT_SCALE]), CUBED_HECTOMETER);
    }

	@Contract("_, _ -> new")
    public static @NotNull Volume toCubedDecameter(double value, int unit) {
        return new Volume(divide(multiply(value, VOLUME_SCALES[CUBED_DECAMETER - UNIT_SCALE]), VOLUME_SCALES[unit - UNIT_SCALE]), CUBED_DECAMETER);
    }

	@Contract("_, _ -> new")
    public static @NotNull Volume toCubedMeter(double value, int unit) {
        return new Volume(divide(multiply(value, VOLUME_SCALES[CUBED_METER - UNIT_SCALE]), VOLUME_SCALES[unit - UNIT_SCALE]), CUBED_METER);
    }

	@Contract("_, _ -> new")
    public static @NotNull Volume toCubedDecimeter(double value, int unit) {
        return new Volume(divide(multiply(value, VOLUME_SCALES[CUBED_DECIMETER - UNIT_SCALE]), VOLUME_SCALES[unit - UNIT_SCALE]), CUBED_DECIMETER);
    }

	@Contract("_, _ -> new")
    public static @NotNull Volume toCubedCentimeter(double value, int unit) {
        return new Volume(divide(multiply(value, VOLUME_SCALES[CUBED_CENTIMETER - UNIT_SCALE]), VOLUME_SCALES[unit - UNIT_SCALE]), CUBED_CENTIMETER);
    }

	@Contract("_, _ -> new")
    public static @NotNull Volume toCubedMillimeter(double value, int unit) {
        return new Volume(divide(multiply(value, VOLUME_SCALES[CUBED_MILLIMETER - UNIT_SCALE]), VOLUME_SCALES[unit - UNIT_SCALE]), CUBED_MILLIMETER);
    }
    
    @Override
    public Volume toCubedKilometer() {
        return null;
    }

    @Override
    public Volume toCubedHectometer() {
        return null;
    }

    @Override
    public Volume toCubedDecameter() {
        return null;
    }

    @Override
    public Volume toCubedMeter() {
        return null;
    }

    @Override
    public Volume toCubedDecimeter() {
        return null;
    }

    @Override
    public Volume toCubedCentimeter() {
        return null;
    }

    @Override
    public Volume toCubedMillimeter() {
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

    @Override
    public boolean isInInternationalSystem() {
        return unit == (CUBED_METER - UNIT_SCALE);
    }

    @Override
    public String getUnitSymbol() {
        return VOLUME_SYMBOLS[unit];
    }

    @Deprecated
    protected static Volume getInstance() {
		if (instance == null)
			instance = new Volume();
		return instance;
    }
}
