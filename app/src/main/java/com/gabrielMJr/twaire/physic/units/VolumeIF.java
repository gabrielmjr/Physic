package com.gabrielMJr.twaire.physic.units;

import java.math.BigDecimal;

public interface VolumeIF
{
	public abstract BigDecimal toCubeKilometer(double value, String unit);
	public abstract BigDecimal toCubeHectometer(double value, String unit);
	public abstract BigDecimal toCubeDecameter(double value, String unit);
	public abstract BigDecimal toCubeMeter(double value, String unit);
	public abstract BigDecimal toCubeDecimeter(double value, String unit);
	public abstract BigDecimal toCubeCentimeter(double value, String unit);
	public abstract BigDecimal toCubeMillimeter(double value, String unit);
}
