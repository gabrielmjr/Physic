package com.mjr.twaire.code.physic.units;

import java.math.BigDecimal;

public abstract class Unit {
    protected BigDecimal value;
    protected int unit;
    
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

    public Unit setUnit(int unit) {
        this.unit = unit;
        return this;
    }

    public int getUnit() {
        return unit;
    }
}
