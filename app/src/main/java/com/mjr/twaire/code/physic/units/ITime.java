package com.mjr.twaire.code.physic.units;

public interface ITime {
	public Time toSecond () throws IllegalArgumentException;
	public Time toMinute () throws IllegalArgumentException;
	public Time toHour () throws IllegalArgumentException;
	public Time toDay () throws IllegalArgumentException;
	public Time toWeek () throws IllegalArgumentException;

	public Time toSquareSecond () throws IllegalArgumentException;
	public Time toSquareMinute () throws IllegalArgumentException;
	public Time toSquareHour () throws IllegalArgumentException;
	public Time toSquareDay () throws IllegalArgumentException;
	public Time toSquareWeek () throws IllegalArgumentException;
}
