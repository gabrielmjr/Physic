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

public class Area implements IArea {
    @Deprecated
    private static Area instance; 
    private BigDecimal value;
    private int unit;

	public static final int SQUARE_KILOMETER = 7;
	public static final int SQUARE_HECTOMETER = 8;
	public static final int SQUARE_DECAMETER = 9;
	public static final int SQUARE_METER = 10;
	public static final int SQUARE_DECIMETER = 11;
	public static final int SQUARE_CENTIMETER = 12;
	public static final int SQUARE_MILLIMETER = 13;

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
        this.value = BigDecimal.ZERO;
        unit = SQUARE_METER - 7;
    }

    public Area(double value) {
        this.value = BigDecimal.valueOf(value);
        unit = SQUARE_METER - 7;
    }

    public Area(String value) {
        this.value = new BigDecimal(value);
        unit = SQUARE_METER - 7;
    }

    public Area(long value) {
        this.value = BigDecimal.valueOf(value);
        unit = SQUARE_METER - 7;
    }

    public Area(BigDecimal value) {
        this.value = value;
        unit = SQUARE_METER - 7;
    }

    public Area(double value, int unit) throws PhysicException {
        this.value = BigDecimal.valueOf(value);
        if (unit >= 7 || unit <= 13) {
            this.unit = unit - 7;
            return;
        }
        throw new InvalidUnitException("The unit " + unit + " is not valid as " + getClass().getName() + " unit.");
    }

    public Area(String value, int unit) throws PhysicException {
        this.value = new BigDecimal(value);
        if (unit >= 7 || unit <= 13) {
            this.unit = unit - 7;
            return;
        }
        throw new InvalidUnitException("The unit " + unit + " is not valid as " + getClass().getName() + " unit.");
    }

    public Area(long value, int unit) throws PhysicException {
        this.value = BigDecimal.valueOf(value);
        if (unit >= 7 || unit <= 13) {
            this.unit = unit - 7;
            return;
        }
        throw new InvalidUnitException("The unit " + unit + " is not valid as " + getClass().getName() + " unit.");
    }

    public Area(BigDecimal value, int unit) throws PhysicException {
        this.value = value;
        if (unit >= 7 || unit <= 13) {
            this.unit = unit - 7;
            return;
        }
        throw new InvalidUnitException("The unit " + unit + " is not valid as " + getClass().getName() + " unit");
    }
   
	public static Area toSquareKilometer (double value, int unit) throws PhysicException {
		if (unit >= 7 && unit <= 13)
			return new Area(BigDecimal.valueOf(value).multiply(AREA_SCALES[unit - 7]).divide(AREA_SCALES[SQUARE_KILOMETER - 7], ROUND_SCALE, HALF_UP), unit);
	    throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Area().getClass().getName() + " unit.");
	}
    
	public static Area toSquareHectometer (double value, int unit) throws PhysicException {
		if (unit >= 7 && unit <= 13)
			return new Area(BigDecimal.valueOf(value).multiply(AREA_SCALES[unit - 7]).divide(AREA_SCALES[SQUARE_HECTOMETER - 7], ROUND_SCALE, HALF_UP), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Area().getClass().getName() + " unit.");
	}
    
	public static Area toSquareDecameter (double value, int unit) throws PhysicException {
		if (unit >= 7 && unit <= 13)
			return new Area(BigDecimal.valueOf(value).multiply(AREA_SCALES[unit - 7]).divide(AREA_SCALES[SQUARE_DECAMETER - 7], ROUND_SCALE, HALF_UP), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Area().getClass().getName() + " unit.");
	}
    
	public static Area toSquareMeter (double value, int unit) throws PhysicException {
		if (unit >= 7 && unit <= 13)
			return new Area(BigDecimal.valueOf(value).multiply(AREA_SCALES[unit - 7]).divide(AREA_SCALES[SQUARE_METER - 7], ROUND_SCALE, HALF_UP), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Area().getClass().getName() + " unit.");
    }
    
	public static Area toSquareDecimeter (double value, int unit) throws PhysicException {
		if (unit >= 7 && unit <= 13)
			return new Area(BigDecimal.valueOf(value).multiply(AREA_SCALES[unit - 7]).divide(AREA_SCALES[SQUARE_DECIMETER - 7], ROUND_SCALE, HALF_UP), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Area().getClass().getName() + " unit.");
	}

	public static Area toSquareCentimeter (double value, int unit) throws PhysicException {
		if (unit >= 7 && unit <= 13)
			return new Area(BigDecimal.valueOf(value).multiply(AREA_SCALES[unit - 7]).divide(AREA_SCALES[SQUARE_CENTIMETER - 7], ROUND_SCALE, HALF_UP), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Area().getClass().getName() + " unit.");
	}

	public static Area toSquareMillimeter (double value, int unit) throws PhysicException {
		if (unit >= 7 && unit <= 13)
			return new Area(BigDecimal.valueOf(value).multiply(AREA_SCALES[unit - 7]).divide(AREA_SCALES[SQUARE_MILLIMETER - 7], ROUND_SCALE, HALF_UP), unit);
		throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Area().getClass().getName() + " unit.");
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
    
    public Area setValue(double value) {
        this.value = BigDecimal.valueOf(value);
        return this;
    }

    public Area setValue(long value) {
        this.value = BigDecimal.valueOf(value);
        return this;
    }

    public Area setValue(String value) {
        this.value = new BigDecimal(value);
        return this;
    }

    public Area setValue(BigDecimal value) {
        this.value = value;
        return this;
    }

    public BigDecimal getValue() {
        return value;
    }

    public Area setUnit(int unit) throws InvalidUnitException {
        if (unit >= 0 || unit <= 6) {
            this.unit = unit;
            return this;
        }
        throw new InvalidUnitException("The unit " + unit + " is not valid as " + new Area().getClass().getName() + " unit.");
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

    @Deprecated
    protected static Area getInstance () {
		if (!(instance instanceof Area))
			instance = new Area();
		return instance;
    }
}
