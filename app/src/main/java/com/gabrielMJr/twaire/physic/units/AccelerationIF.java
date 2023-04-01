package com.gabrielmjr.twaire.physic.units;

import java.math.BigDecimal;

public interface AccelerationIF {
    public abstract BigDecimal toKilometerPerSquareSecond (double value, int unit);
	public abstract BigDecimal toHectometerPerSquareSecond (double value, int unit);
	public abstract BigDecimal toDecameterPerSquareSecond (double value, int unit);
	public abstract BigDecimal toMeterPerSquareSecond (double value, int unit);
	public abstract BigDecimal toDecimeterPerSquareSecond (double value, int unit);
	public abstract BigDecimal toCentimeterPerSquareSecond (double value, int unit);
	public abstract BigDecimal toMillimeterPerSquareSecond (double value, int unit);

	public abstract BigDecimal toKilometerPerSquareMinute (double value, int unit);
	public abstract BigDecimal toHectometerPerSquareMinute (double value, int unit);
	public abstract BigDecimal toDecameterPerSquareMinute (double value, int unit);
	public abstract BigDecimal toMeterPerSquareMinute (double value, int unit);
	public abstract BigDecimal toDecimeterPerSquareMinute (double value, int unit);
	public abstract BigDecimal toCentimeterPerSquareMinute (double value, int unit);
	public abstract BigDecimal toMillimeterPerSquareMinute (double value, int unit);

	public abstract BigDecimal toKilometerPerSquareHour (double value, int unit);
	public abstract BigDecimal toHectometerPerSquareHour (double value, int unit);
	public abstract BigDecimal toDecameterPerSquareHour (double value, int unit);
	public abstract BigDecimal toMeterPerSquareHour (double value, int unit);
	public abstract BigDecimal toDecimeterPerSquareHour (double value, int unit);
	public abstract BigDecimal toCentimeterPerSquareHour (double value, int unit);
	public abstract BigDecimal toMillimeterPerSquareHour (double value, int unit);
}
