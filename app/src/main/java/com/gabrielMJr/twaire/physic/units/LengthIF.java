package com.gabrielmjr.twaire.physic.units;

import java.math.BigDecimal;

public interface LengthIF {
	public abstract BigDecimal toKilometer (double value, int unit) throws InvalidUnitException;
	public abstract BigDecimal toHectometer (double value, int unit) throws InvalidUnitException;
	public abstract BigDecimal toDecameter (double value, int unit) throws InvalidUnitException;
	public abstract BigDecimal toMeter (double value, int unit) throws InvalidUnitException;
	public abstract BigDecimal toDecimeter (double value, int unit) throws InvalidUnitException;
	public abstract BigDecimal toCentimeter (double value, int unit) throws InvalidUnitException;
	public abstract BigDecimal toMillimeter (double value, int unit) throws InvalidUnitException;
}
