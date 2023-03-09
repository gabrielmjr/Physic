package com.gabrielMJr.twaire.physic.units;

import java.math.BigDecimal;

public interface SpeedIF {
	public abstract BigDecimal toKilometerPerSecond (double value, int unit);
	public abstract BigDecimal toHectometerPerSecond (double value, int unit);
	public abstract BigDecimal toDecameterPerSecond (double value, int unit);
	public abstract BigDecimal toMeterPerSecond (double value, int unit);
	public abstract BigDecimal toDecimeterPerSecond (double value, int unit);
	public abstract BigDecimal toCentimeterPerSecond (double value, int unit);
	public abstract BigDecimal toMillimeterPerSecond (double value, int unit);

	public abstract BigDecimal toKilometerPerMinute (double value, int unit);
	public abstract BigDecimal toHectometerPerMinute (double value, int unit);
	public abstract BigDecimal toDecameterPerMinute (double value, int unit);
	public abstract BigDecimal toMeterPerMinute (double value, int unit);
	public abstract BigDecimal toDecimeterPerMinute (double value, int unit);
	public abstract BigDecimal toCentimeterPerMinute (double value, int unit);
	public abstract BigDecimal toMillimeterPerMinute (double value, int unit);

	public abstract BigDecimal toKilometerPerHour (double value, int unit);
	public abstract BigDecimal toHectometerPerHour (double value, int unit);
	public abstract BigDecimal toDecameterPerHour (double value, int unit);
	public abstract BigDecimal toMeterPerHour (double value, int unit);
	public abstract BigDecimal toDecimeterPerHour (double value, int unit);
	public abstract BigDecimal toCentimeterPerHour (double value, int unit);
	public abstract BigDecimal toMillimeterPerHour (double value, int unit);
}
