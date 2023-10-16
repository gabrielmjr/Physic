package com.mjr.code.physics.units;

import java.math.BigDecimal;

import static com.mjr.code.physics.Physic.ROUND_SCALE;
import static com.mjr.code.physics.units.Length.KILOMETER;
import static com.mjr.code.physics.units.Length.HECTOMETER;
import static com.mjr.code.physics.units.Length.DECAMETER;
import static com.mjr.code.physics.units.Length.METER;
import static com.mjr.code.physics.units.Length.DECIMETER;
import static com.mjr.code.physics.units.Length.CENTIMETER;
import static com.mjr.code.physics.units.Length.MILLIMETER;
import static com.mjr.code.physics.units.Length.LENGTH_SCALES;
import static com.mjr.code.physics.units.Length.KILOMETER_SYMBOL;
import static com.mjr.code.physics.units.Length.HECTOMETER_SYMBOL;
import static com.mjr.code.physics.units.Length.DECAMETER_SYMBOL;
import static com.mjr.code.physics.units.Length.METER_SYMBOL;
import static com.mjr.code.physics.units.Length.DECIMETER_SYMBOL;
import static com.mjr.code.physics.units.Length.CENTIMETER_SYMBOL;
import static com.mjr.code.physics.units.Length.MILLIMETER_SYMBOL;
import static java.math.RoundingMode.HALF_UP;

public class Area extends Unit implements IArea {
    @Deprecated
    private static Area instance; 

	public static final int SQUARE_KILOMETER = 7;
	public static final int SQUARE_HECTOMETER = 8;
	public static final int SQUARE_DECAMETER = 9;
	public static final int SQUARE_METER = 10;
	public static final int SQUARE_DECIMETER = 11;
	public static final int SQUARE_CENTIMETER = 12;
	public static final int SQUARE_MILLIMETER = 13;

    private final int UNIT_SCALE = SQUARE_KILOMETER;
    private final int MAX_UNIT_SCALE = SQUARE_MILLIMETER - UNIT_SCALE;

	protected static final BigDecimal[] AREA_SCALES = new BigDecimal[] {
		LENGTH_SCALES[KILOMETER].pow(2),
		LENGTH_SCALES[HECTOMETER].pow(2),
		LENGTH_SCALES[DECAMETER].pow(2),
		LENGTH_SCALES[METER].pow(2),
		LENGTH_SCALES[DECIMETER].pow(2),
		LENGTH_SCALES[CENTIMETER].pow(2),
		LENGTH_SCALES[MILLIMETER].pow(2)
	};

	public static final String SQUARE_KILOMETER_SYMBOL = KILOMETER_SYMBOL + "²";
	public static final String SQUARE_HECTOMETER_SYMBOL = HECTOMETER_SYMBOL + "²";
	public static final String SQUARE_DECAMETER_SYMBOL = DECAMETER_SYMBOL + "²";
	public static final String SQUARE_METER_SYMBOL = METER_SYMBOL + "²";
	public static final String SQUARE_DECIMETER_SYMBOL = DECIMETER_SYMBOL + "²";
	public static final String SQUARE_CENTIMETER_SYMBOL = CENTIMETER_SYMBOL + "²";
	public static final String SQUARE_MILLIMETER_SYMBOL = MILLIMETER_SYMBOL + "²";

    protected final String AREA_SYMBOLS[] = new String[] {
        SQUARE_KILOMETER_SYMBOL,
        SQUARE_HECTOMETER_SYMBOL,
        SQUARE_DECAMETER_SYMBOL,
        SQUARE_METER_SYMBOL,
        SQUARE_DECIMETER_SYMBOL,
        SQUARE_CENTIMETER_SYMBOL,
        SQUARE_MILLIMETER_SYMBOL
    };

    public Area() {
        super();
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(SQUARE_METER - UNIT_SCALE);
    }

    public Area(double value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(SQUARE_METER - UNIT_SCALE);
    }

    public Area(String value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(SQUARE_METER - UNIT_SCALE);
    }

    public Area(long value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(SQUARE_METER - UNIT_SCALE);
    }

    public Area(BigDecimal value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        setUnit(SQUARE_METER - UNIT_SCALE);
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

	public static Area toSquareKilometer(double value, int unit) {
        return new Area(BigDecimal.valueOf(value).multiply(AREA_SCALES[unit - 7]).divide(AREA_SCALES[SQUARE_KILOMETER - 7], ROUND_SCALE, HALF_UP), SQUARE_KILOMETER);
    }

	public static Area toSquareHectometer(double value, int unit) {
		return new Area(BigDecimal.valueOf(value).multiply(AREA_SCALES[unit - 7]).divide(AREA_SCALES[SQUARE_HECTOMETER - 7], ROUND_SCALE, HALF_UP), SQUARE_HECTOMETER);
    }

	public static Area toSquareDecameter(double value, int unit) {
		return new Area(BigDecimal.valueOf(value).multiply(AREA_SCALES[unit - 7]).divide(AREA_SCALES[SQUARE_DECAMETER - 7], ROUND_SCALE, HALF_UP), SQUARE_DECAMETER);
    }

	public static Area toSquareMeter(double value, int unit) {
		return new Area(BigDecimal.valueOf(value).multiply(AREA_SCALES[unit - 7]).divide(AREA_SCALES[SQUARE_METER - 7], ROUND_SCALE, HALF_UP), SQUARE_METER);
    }
	public static Area toSquareDecimeter(double value, int unit) {
		return new Area(BigDecimal.valueOf(value).multiply(AREA_SCALES[unit - 7]).divide(AREA_SCALES[SQUARE_DECIMETER - 7], ROUND_SCALE, HALF_UP), SQUARE_DECIMETER);
    }

	public static Area toSquareCentimeter(double value, int unit) {
		return new Area(BigDecimal.valueOf(value).multiply(AREA_SCALES[unit - 7]).divide(AREA_SCALES[SQUARE_CENTIMETER - 7], ROUND_SCALE, HALF_UP), SQUARE_CENTIMETER);
    }

	public static Area toSquareMillimeter(double value, int unit) {
		return new Area(BigDecimal.valueOf(value).multiply(AREA_SCALES[unit - 7]).divide(AREA_SCALES[SQUARE_MILLIMETER - 7], ROUND_SCALE, HALF_UP), SQUARE_MILLIMETER);
    }

    @Override
    public Area toSquareKilometer() {
        return null;
    }

    @Override
    public Area toSquareHectometer() {
        return null;
    }

    @Override
    public Area toSquareDecameter() {
        return null;
    }

    @Override
    public Area toSquareMeter() {
        return null;
    }

    @Override
    public Area toSquareDecimeter() {
        return null;
    }

    @Override
    public Area toSquareCentimeter() {
        return null;
    }

    @Override
    public Area toSquareMillimeter() {
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
    public String getUnitSymbol() {
        return AREA_SYMBOLS[unit];
    }

    @Deprecated
    protected static Area getInstance() {
		if (!(instance instanceof Area))
			instance = new Area();
		return instance;
    }
}
