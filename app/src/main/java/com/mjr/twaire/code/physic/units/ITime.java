package com.mjr.twaire.code.physic.units;

public interface ITime {
	public Time toSecond () throws InvalidUnitException;
	public Time toMinute () throws InvalidUnitException;
	public Time toHour () throws InvalidUnitException;
	public Time toDay () throws InvalidUnitException;
	public Time toWeek () throws InvalidUnitException;

	public Time toSquareSecond () throws InvalidUnitException;
	public Time toSquareMinute () throws InvalidUnitException;
	public Time toSquareHour () throws InvalidUnitException;
	public Time toSquareDay () throws InvalidUnitException;
	public Time toSquareWeek () throws InvalidUnitException;
}
