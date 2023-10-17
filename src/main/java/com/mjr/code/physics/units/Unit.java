package com.mjr.code.physics.units;

import lombok.Getter;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static com.mjr.code.physics.Physic.ROUND_SCALE;

public abstract class Unit {
    protected final int MIN_UNIT = 0;
    @Getter
    protected BigDecimal value;
    @Getter
    protected int unit;
    @Deprecated(forRemoval = true)
    protected int minUnit = 0;
    protected int maxUnit;
    
    public Unit() { 
        setValue(BigDecimal.ZERO);
    }

    public Unit(double value) {
        setValue(value);
    }

    public Unit(String value) {
        setValue(value);
    }

    public Unit(long value) {
        setValue(value);
    }

    public Unit(BigDecimal value) {
        setValue(value);
    }

    @Contract(pure = true)
    protected static @NotNull BigDecimal divide(@NotNull BigDecimal dividend, BigDecimal divider) {
        return dividend.divide(divider, ROUND_SCALE, RoundingMode.HALF_UP);
    }

    protected static @NotNull BigDecimal multiply(double dividend, BigDecimal divider) {
        return BigDecimal.valueOf(dividend).multiply(divider);
    }

    @Contract(pure = true)
    protected static @NotNull BigDecimal multiply(@NotNull BigDecimal dividend, BigDecimal divider) {
        return dividend.multiply(divider);
    }
    
    protected boolean isUnitInRange(int unit) {
        return (unit >= MIN_UNIT && unit <= maxUnit);
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

    @Deprecated(forRemoval = true)
    protected void setMinUnit(int minUnit) {
        this.minUnit = minUnit;
    }

    @Deprecated(forRemoval = true)
    protected int getMinUnit() {
        return minUnit;
    }

    protected void setMaxUnit(int maxUnit) {
        this.maxUnit = maxUnit;
    }

    @Deprecated(forRemoval = true)
    protected int getMaxUnit() {
        return maxUnit;
    }
}
