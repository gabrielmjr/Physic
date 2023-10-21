package com.mjr.code.physics.units;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

import static com.mjr.code.physics.units.Length.*;

public class Area extends Unit implements IArea {
    @Deprecated
    private static Area instance; 

	public static final int SQUARED_KILOMETER = Length.LAST_UNIT_CONS + 1;
	public static final int SQUARED_HECTOMETER = Length.LAST_UNIT_CONS + 2;
	public static final int SQUARED_DECAMETER = Length.LAST_UNIT_CONS + 3;
	public static final int SQUARED_METER = Length.LAST_UNIT_CONS + 4;
	public static final int SQUARED_DECIMETER = Length.LAST_UNIT_CONS + 5;
	public static final int SQUARED_CENTIMETER = Length.LAST_UNIT_CONS + 6;
	public static final int SQUARED_MILLIMETER = Length.LAST_UNIT_CONS + 7;

    protected static final int UNIT_SCALE = SQUARED_KILOMETER;
    protected static final int LAST_UNIT_CONS = SQUARED_MILLIMETER;
    private final int MAX_UNIT_SCALE = LAST_UNIT_CONS - UNIT_SCALE;

	protected static final BigDecimal[] AREA_SCALES = new BigDecimal[] {
		LENGTH_SCALES[KILOMETER].pow(2),
		LENGTH_SCALES[HECTOMETER].pow(2),
		LENGTH_SCALES[DECAMETER].pow(2),
		LENGTH_SCALES[METER].pow(2),
		LENGTH_SCALES[DECIMETER].pow(2),
		LENGTH_SCALES[CENTIMETER].pow(2),
		LENGTH_SCALES[MILLIMETER].pow(2)
	};

	public static final String SQUARED_KILOMETER_SYMBOL = KILOMETER_SYMBOL + "²";
	public static final String SQUARED_HECTOMETER_SYMBOL = HECTOMETER_SYMBOL + "²";
	public static final String SQUARED_DECAMETER_SYMBOL = DECAMETER_SYMBOL + "²";
	public static final String SQUARED_METER_SYMBOL = METER_SYMBOL + "²";
	public static final String SQUARED_DECIMETER_SYMBOL = DECIMETER_SYMBOL + "²";
	public static final String SQUARED_CENTIMETER_SYMBOL = CENTIMETER_SYMBOL + "²";
	public static final String SQUARED_MILLIMETER_SYMBOL = MILLIMETER_SYMBOL + "²";

    protected final String[] AREA_SYMBOLS = new String[] {
            SQUARED_KILOMETER_SYMBOL,
            SQUARED_HECTOMETER_SYMBOL,
            SQUARED_DECAMETER_SYMBOL,
            SQUARED_METER_SYMBOL,
            SQUARED_DECIMETER_SYMBOL,
            SQUARED_CENTIMETER_SYMBOL,
            SQUARED_MILLIMETER_SYMBOL
    };

    public Area() {
        super();
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(SQUARED_METER - UNIT_SCALE);
    }

    public Area(double value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(SQUARED_METER - UNIT_SCALE);
    }

    public Area(String value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(SQUARED_METER - UNIT_SCALE);
    }

    public Area(long value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(SQUARED_METER - UNIT_SCALE);
    }

    public Area(BigDecimal value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(SQUARED_METER - UNIT_SCALE);
    }

    public Area(double value, int unit) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(unit - UNIT_SCALE);
    }

    public Area(String value, int unit) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(unit - UNIT_SCALE);
    }

    public Area(long value, int unit) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(unit - UNIT_SCALE);
    }

    public Area(BigDecimal value, int unit) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(unit - UNIT_SCALE);
    }

	@Contract("_, _ -> new")
    public static @NotNull Area toSquaredKilometer(double value, int unit) {
        return new Area(divide(multiply(value, AREA_SCALES[SQUARED_KILOMETER - UNIT_SCALE]), AREA_SCALES[unit - UNIT_SCALE]), SQUARED_KILOMETER);
    }

	@Contract("_, _ -> new")
    public static @NotNull Area toSquaredHectometer(double value, int unit) {
        return new Area(divide(multiply(value, AREA_SCALES[SQUARED_HECTOMETER - UNIT_SCALE]), AREA_SCALES[unit - UNIT_SCALE]), SQUARED_HECTOMETER);
    }

	@Contract("_, _ -> new")
    public static @NotNull Area toSquaredDecameter(double value, int unit) {
        return new Area(divide(multiply(value, AREA_SCALES[SQUARED_DECAMETER - UNIT_SCALE]), AREA_SCALES[unit - UNIT_SCALE]), SQUARED_DECAMETER);
    }

	@Contract("_, _ -> new")
    public static @NotNull Area toSquaredMeter(double value, int unit) {
        return new Area(divide(multiply(value, AREA_SCALES[SQUARED_METER - UNIT_SCALE]), AREA_SCALES[unit - UNIT_SCALE]), SQUARED_METER);
    }
	@Contract("_, _ -> new")
    public static @NotNull Area toSquaredDecimeter(double value, int unit) {
        return new Area(divide(multiply(value, AREA_SCALES[SQUARED_DECIMETER - UNIT_SCALE]), AREA_SCALES[unit - UNIT_SCALE]), SQUARED_DECIMETER);
    }

	@Contract("_, _ -> new")
    public static @NotNull Area toSquaredCentimeter(double value, int unit) {
        return new Area(divide(multiply(value, AREA_SCALES[SQUARED_CENTIMETER - UNIT_SCALE]), AREA_SCALES[unit - UNIT_SCALE]), SQUARED_CENTIMETER);
    }

	@Contract("_, _ -> new")
    public static @NotNull Area toSquaredMillimeter(double value, int unit) {
        return new Area(divide(multiply(value, AREA_SCALES[SQUARED_MILLIMETER - UNIT_SCALE]), AREA_SCALES[unit - UNIT_SCALE]), SQUARED_MILLIMETER);
    }

    @Override
    public Area toSquaredKilometer() {
        return null;
    }

    @Override
    public Area toSquaredHectometer() {
        return null;
    }

    @Override
    public Area toSquaredDecameter() {
        return null;
    }

    @Override
    public Area toSquaredMeter() {
        return null;
    }

    @Override
    public Area toSquaredDecimeter() {
        return null;
    }

    @Override
    public Area toSquaredCentimeter() {
        return null;
    }

    @Override
    public Area toSquaredMillimeter() {
        return null;
    }

    @Override
    public String toString() {
        return value + AREA_SYMBOLS[unit];
    }

    @Override
    public boolean equals(Object object) {
        try {
            Area area = (Area) object;
            return (area.toString().equals(toString()));
        } catch (ClassCastException e) {
            return false;
        }
    }

    @Override
    public boolean isInInternationalSystem() {
        return unit == (SQUARED_METER - UNIT_SCALE);
    }

    @Override
    public String getUnitSymbol() {
        return AREA_SYMBOLS[unit];
    }

    @Deprecated
    protected static Area getInstance() {
		if (instance == null)
			instance = new Area();
		return instance;
    }
}
