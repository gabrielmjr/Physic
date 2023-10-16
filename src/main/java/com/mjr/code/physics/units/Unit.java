package com.mjr.code.physics.units;

import lombok.Getter;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static com.mjr.code.physics.Physic.ROUND_SCALE;

public abstract class Unit {
    @Getter
    protected BigDecimal value;
    @Getter
    protected int unit;
    protected int minUnit = 0;
    protected int maxUnit;
    
    public Unit() { 
        setValue(BigDecimal.ZERO);
    }

    public Unit(double value) {
        setValue(BigDecimal.valueOf(value));
    }

    public Unit(String value) {
        setValue(new BigDecimal(value));
    }

    public Unit(long value) {
        this.value = BigDecimal.valueOf(value);
    }

    public Unit(BigDecimal value) {
        this.value = value;
    }

    @Contract(pure = true)
    protected static @NotNull BigDecimal divide(@NotNull BigDecimal dividend, BigDecimal divider) {
        return dividend.divide(divider, ROUND_SCALE, RoundingMode.HALF_UP);
    }

    protected static @NotNull BigDecimal multiply(double dividend, BigDecimal divider) {
        return BigDecimal.valueOf(dividend).multiply(divider);
    }

    @Contract(pure = true)
    protected static @NotNull BigDecimal multiply(BigDecimal dividend, BigDecimal divider) {
        return dividend.multiply(divider);
    }
    
    protected boolean isUnitInRange(int unit) {
        return (unit >= minUnit && unit <= maxUnit);
    }
    
    public boolean equalUnit(@NotNull Unit unit) {
        return getUnitSymbol().equals(unit.getUnitSymbol()) && getUnit() == unit.getUnit();
    }
    
    public Unit setValue(double value) {
        this.value = BigDecimal.valueOf(value).setScale(ROUND_SCALE, RoundingMode.HALF_UP);
        return this;
    }
    
    public Unit setValue(long value) {
        this.value = BigDecimal.valueOf(value).setScale(ROUND_SCALE, RoundingMode.HALF_UP);
        return this;
    }
    
    public Unit setValue(String value) {
        this.value = new BigDecimal(value).setScale(ROUND_SCALE, RoundingMode.HALF_UP);
        return this;
    }

    public void setValue(@NotNull BigDecimal value) {
        this.value = value.setScale(ROUND_SCALE, RoundingMode.HALF_UP);
    }

    public Unit setUnit(int unit) throws IllegalArgumentException {
        if (isUnitInRange(unit)) {
            this.unit = unit;
            return this;
        }
        throw new IllegalArgumentException("The unit " + unit + " is not valid as " + getClass().getName() + " unit.");
    }

    public abstract boolean isInInternationalSystem();

    public abstract String getUnitSymbol();
    
    protected void setMinUnit(int minUnit) {
        this.minUnit = minUnit;
    }

    protected int getMinUnit() {
        return minUnit;
    }

    protected void setMaxUnit(int maxUnit) {
        this.maxUnit = maxUnit;
    }

    protected int getMaxUnit() {
        return maxUnit;
    }
}
