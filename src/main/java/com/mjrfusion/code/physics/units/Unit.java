package com.mjrfusion.code.physics.units;

import lombok.Getter;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static com.mjrfusion.code.physics.Physic.ROUND_SCALE;

@Getter
public abstract class Unit {
    protected BigDecimal value;
    
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

    public boolean equalUnit(@NotNull Unit unit) {
        return true;
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

    public abstract boolean isInInternationalSystem();

    public abstract String getUnitSymbol();
}
