package com.mjr.code.physics.units;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

import static com.mjr.code.physics.units.Length.*;

public class Area extends Unit implements IArea {
    @Deprecated
    private static Area instance; 

	public static final int SQUARE_KILOMETER = Length.LAST_UNIT_CONS + 1;
	public static final int SQUARE_HECTOMETER = Length.LAST_UNIT_CONS + 2;
	public static final int SQUARE_DECAMETER = Length.LAST_UNIT_CONS + 3;
	public static final int SQUARE_METER = Length.LAST_UNIT_CONS + 4;
	public static final int SQUARE_DECIMETER = Length.LAST_UNIT_CONS + 5;
	public static final int SQUARE_CENTIMETER = Length.LAST_UNIT_CONS + 6;
	public static final int SQUARE_MILLIMETER = Length.LAST_UNIT_CONS + 7;

    private static final int UNIT_SCALE = SQUARE_KILOMETER;
    protected static final int LAST_UNIT_CONS = SQUARE_MILLIMETER;
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

	public static final String SQUARE_KILOMETER_SYMBOL = KILOMETER_SYMBOL + "²";
	public static final String SQUARE_HECTOMETER_SYMBOL = HECTOMETER_SYMBOL + "²";
	public static final String SQUARE_DECAMETER_SYMBOL = DECAMETER_SYMBOL + "²";
	public static final String SQUARE_METER_SYMBOL = METER_SYMBOL + "²";
	public static final String SQUARE_DECIMETER_SYMBOL = DECIMETER_SYMBOL + "²";
	public static final String SQUARE_CENTIMETER_SYMBOL = CENTIMETER_SYMBOL + "²";
	public static final String SQUARE_MILLIMETER_SYMBOL = MILLIMETER_SYMBOL + "²";

    protected final String[] AREA_SYMBOLS = new String[] {
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

	@Contract("_, _ -> new")
    public static @NotNull Area toSquareKilometer(double value, int unit) {
        return new Area(divide(multiply(value, AREA_SCALES[unit - 7]), AREA_SCALES[SQUARE_KILOMETER - UNIT_SCALE]));
    }

	@Contract("_, _ -> new")
    public static @NotNull Area toSquareHectometer(double value, int unit) {
        return new Area(divide(multiply(value, AREA_SCALES[unit - 7]), AREA_SCALES[SQUARE_HECTOMETER - UNIT_SCALE]));
    }

	@Contract("_, _ -> new")
    public static @NotNull Area toSquareDecameter(double value, int unit) {
        return new Area(divide(multiply(value, AREA_SCALES[unit - 7]), AREA_SCALES[SQUARE_DECAMETER - UNIT_SCALE]));
    }

	@Contract("_, _ -> new")
    public static @NotNull Area toSquareMeter(double value, int unit) {
        return new Area(divide(multiply(value, AREA_SCALES[unit - 7]), AREA_SCALES[SQUARE_METER - UNIT_SCALE]));
    }
	@Contract("_, _ -> new")
    public static @NotNull Area toSquareDecimeter(double value, int unit) {
        return new Area(divide(multiply(value, AREA_SCALES[unit - 7]), AREA_SCALES[SQUARE_DECIMETER - UNIT_SCALE]));
    }

	@Contract("_, _ -> new")
    public static @NotNull Area toSquareCentimeter(double value, int unit) {
        return new Area(divide(multiply(value, AREA_SCALES[unit - 7]), AREA_SCALES[SQUARE_CENTIMETER - UNIT_SCALE]));
    }

	@Contract("_, _ -> new")
    public static @NotNull Area toSquareMillimeter(double value, int unit) {
        return new Area(divide(multiply(value, AREA_SCALES[unit - 7]), AREA_SCALES[SQUARE_MILLIMETER - UNIT_SCALE]));
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
    public boolean isInInternationalSystem() {
        return unit == (SQUARE_METER - UNIT_SCALE);
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
