package com.gabrielMJr.twaire.physic.units;

public interface TimeIF
{
	public Double toSecond(double value, String unit);
	public Double toMinute(double value, String unit);
	public Double toHour(double value, String unit);
	public Double toDay(double value, String unit);
	public Double toWeek(double value, String unit);
	
	public Double toSecondSquared(double value, String unit);
	public Double toMinuteSquared(double value, String unit);
	public Double toHourSquared(double value, String unit);
	public Double toDaySquared(double value, String unit);
	public Double toWeekSquared(double value, String unit);
}
