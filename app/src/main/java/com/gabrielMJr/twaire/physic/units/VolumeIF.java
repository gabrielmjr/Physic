package com.gabrielmjr.twaire.physic.units;

import java.math.BigDecimal;

public interface VolumeIF {
	public abstract BigDecimal toCubeKilometer (double value, int unit);
	public abstract BigDecimal toCubeHectometer (double value, int unit);
	public abstract BigDecimal toCubeDecameter (double value, int unit);
	public abstract BigDecimal toCubeMeter (double value, int unit);
	public abstract BigDecimal toCubeDecimeter (double value, int unit);
	public abstract BigDecimal toCubeCentimeter (double value, int unit);
	public abstract BigDecimal toCubeMillimeter (double value, int unit);
}
