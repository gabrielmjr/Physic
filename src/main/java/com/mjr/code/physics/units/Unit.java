package com.mjr.code.physics.units;

import java.math.BigDecimal;

public abstract class Unit {
    protected BigDecimal value;
    protected int unit;
    protected int minUnit = 0;
    protected int maxUnit;
    
    public Unit() { 
        value = BigDecimal.ZERO;
    }

    public Unit(double value) {
        this.value = BigDecimal.valueOf(value);
    }

    public Unit(String value) {
        this.value = new BigDecimal(value);
    }

    public Unit(long value) {
        this.value = BigDecimal.valueOf(value);
    }

    public Unit(BigDecimal value) {
        this.value = value;
    }
    
    protected final boolean isUnitInRange(int unit) {
        return (unit >= minUnit && unit <= maxUnit);
    }
    
    protected final boolean isUnitInRange() {
        return (unit >= minUnit && unit <= maxUnit);
    }
    
    public boolean equalUnts(Unit unit) {
        return getUnitSymbol().equals(unit.getUnitSymbol()) && getUnit() == unit.getUnit();
    }
    
    public Unit setValue(double value) {
        this.value = BigDecimal.valueOf(value);
        return this;
    }
    
    public Unit setValue(long value) {
        this.value = BigDecimal.valueOf(value);
        return this;
    }
    
    public Unit setValue(String value) {
        this.value = new BigDecimal(value);
        return this;
    }

    public Unit setValue(BigDecimal value) {
        this.value = value;
        return this;
    }

    public BigDecimal getValue() {
        return value;
    }

    public Unit setUnit(int unit) throws IllegalArgumentException {
        if (isUnitInRange(unit)) {
            this.unit = unit;
            return this;
        }
        throw new IllegalArgumentException("The unit " + unit + " is not valid as " + getClass().getName() + " unit.");
    }

    public int getUnit() {
        return unit;
    }
    
    
    
    public abstract String getUnitSymbol();
    
    protected Unit setMinUnit(int minUnit) {
        this.minUnit = minUnit;
        return this;
    }

    protected int getMinUnit() {
        return minUnit;
    }

    protected Unit setMaxUnit(int maxUnit) {
        this.maxUnit = maxUnit;
        return this;
    }

    protected int getMaxUnit() {
        return maxUnit;
    }
}
