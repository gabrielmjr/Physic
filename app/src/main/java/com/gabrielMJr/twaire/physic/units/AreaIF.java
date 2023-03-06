package com.gabrielMJr.twaire.physic.units;

import java.math.BigDecimal;

public interface AreaIF
{
	public abstract BigDecimal toSquareKilometer (double value, int unit);
	public abstract BigDecimal toSquareHectometer (double value, int unit);
	public abstract BigDecimal toSquareDecameter (double value, int unit);
	public abstract BigDecimal toSquareMeter (double value, int unit);
	public abstract BigDecimal toSquareDecimeter (double value, int unit);
	public abstract BigDecimal toSquareCentimeter (double value, int unit);
	public abstract BigDecimal toSquareMillimeter (double value, int unit);
}

