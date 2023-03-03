package com.gabrielMJr.twaire.physic.units;

import java.math.BigDecimal;
import java.util.Random;
import org.junit.jupiter.api.Test;

import static com.gabrielMJr.twaire.physic.units.Area.AREA_SCALES;

import static com.gabrielMJr.twaire.physic.units.Area.SQUARE_KILOMETER;
import static com.gabrielMJr.twaire.physic.units.Area.SQUARE_HECTOMETER;
import static com.gabrielMJr.twaire.physic.units.Area.SQUARE_DECAMETER;
import static com.gabrielMJr.twaire.physic.units.Area.SQUARE_METER;
import static com.gabrielMJr.twaire.physic.units.Area.SQUARE_DECIMETER;
import static com.gabrielMJr.twaire.physic.units.Area.SQUARE_CENTIMETER;
import static com.gabrielMJr.twaire.physic.units.Area.SQUARE_MILLIMETER;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AreaTest
{
	private final Area area;
	private final Random random;

	public AreaTest()
	{
		area = Area.getInstance();
		random = new Random();
	}

	@Test 
	public void toSquareKilometerTest()
	{
		double squareKilometerValue = getRandomDouble();
		double squareHectometerValue = getRandomDouble();
		double squareDecameterValue = getRandomDouble();
		double squareMeterValue = getRandomDouble();
		double squareDecimeterValue = getRandomDouble();
		double squareCentimeterValue = getRandomDouble();
	    double squareMillimeterValue = getRandomDouble();

		String[] squareKilometerTestResultAsArray = getSquareKilometerTestResultAsArray(squareKilometerValue, 1);
		String[] squareHectometerTestResultAsArray = getSquareHectometerTestResultAsArray(squareHectometerValue, 1E-2);
		String[] squareDecameterTestResultAsArray = getSquareDecameterTestResultAsArray(squareDecameterValue, 1E-4);
		String[] squareMeterTestResultAsArray = getSquareMeterTestResultAsArray(squareMeterValue, 1E-6);
		String[] squareDecimeterTestResultAsArray = getSquareDecimeterTestResultAsArray(squareDecimeterValue, 1E-8);
		String[] squareCentimeterTestResultAsArray = getSquareCentimeterTestResultAsArray(squareCentimeterValue, 1E-10);
		String[] squareMillimeterTestResultAsArray = getSquareMillimeterTestResultAsArray(squareMillimeterValue, 1E-12);

		String[] squareKilometerResultAsArray = area.toSquareKilometer(squareKilometerValue, SQUARE_KILOMETER).toString().split("");
		String[] squareHectometerResultAsArray = area.toSquareKilometer(squareKilometerValue, SQUARE_HECTOMETER).toString().split("");
		String[] squareDecameterResultAsArray = area.toSquareKilometer(squareKilometerValue, SQUARE_DECAMETER).toString().split("");
		String[] squareMeterResultAsArray = area.toSquareKilometer(squareKilometerValue, SQUARE_METER).toString().split("");
		String[] squareDecimeterResultAsArray = area.toSquareKilometer(squareKilometerValue, SQUARE_DECIMETER).toString().split("");
		String[] squareCentimeterResultAsArray = area.toSquareKilometer(squareKilometerValue, SQUARE_CENTIMETER).toString().split("");
		String[] squareMillimeterResultAsArray = area.toSquareKilometer(squareKilometerValue, SQUARE_MILLIMETER).toString().split("");

		assertTrue(wasTestSucceeded(getSuccessPercent(squareKilometerTestResultAsArray, squareKilometerResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareHectometerTestResultAsArray, squareHectometerResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareDecameterTestResultAsArray, squareDecameterResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareMeterTestResultAsArray, squareMeterResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareDecimeterTestResultAsArray, squareDecimeterResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareCentimeterTestResultAsArray, squareCentimeterResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareMillimeterTestResultAsArray, squareMillimeterResultAsArray)));
	}

	/*@Test 
	public void toSquareHectometerTest()
	{
		BigDecimal squareKilometerValue = getRandomDouble();
		BigDecimal squareHectometerValue = getRandomDouble();
		BigDecimal squareDecameterValue = getRandomDouble();
		BigDecimal squareMeterValue = getRandomDouble();
		BigDecimal squareDecimeterValue = getRandomDouble();
		BigDecimal squareCentimeterValue = getRandomDouble();
		BigDecimal squareMillimeterValue = getRandomDouble();

		String[] squareKilometerTestResultAsArray = getTestResultAsArrayFrom(squareKilometerValue, 1E2);
		String[] squareHectometerTestResultAsArray = getTestResultAsArrayFrom(squareHectometerValue, 1);
		String[] squareDecameterTestResultAsArray = getTestResultAsArrayFrom(squareDecameterValue, 1E-2);
		String[] squareMeterTestResultAsArray = getTestResultAsArrayFrom(squareMeterValue, 1E-4);
		String[] squareDecimeterTestResultAsArray = getTestResultAsArrayFrom(squareDecimeterValue, 1E-6);
		String[] squareCentimeterTestResultAsArray = getTestResultAsArrayFrom(squareCentimeterValue, 1E-8);
		String[] squareMillimeterTestResultAsArray = getTestResultAsArrayFrom(squareMillimeterValue, 1E-10);

		String[] squareKilometerResultAsArray = getResultAsArrayFrom(squareKilometerValue, SQUARE_KILOMETER);
		String[] squareHectometerResultAsArray = getResultAsArrayFrom(squareHectometerValue, SQUARE_HECTOMETER);
		String[] squareDecameterResultAsArray = getResultAsArrayFrom(squareDecameterValue, SQUARE_DECAMETER);
		String[] squareMeterResultAsArray = getResultAsArrayFrom(squareMeterValue, SQUARE_METER);
		String[] squareDecimeterResultAsArray = getResultAsArrayFrom(squareDecimeterValue, SQUARE_DECIMETER);
		String[] squareCentimeterResultAsArray = getResultAsArrayFrom(squareCentimeterValue, SQUARE_CENTIMETER);
		String[] squareMillimeterResultAsArray = getResultAsArrayFrom(squareMillimeterValue, SQUARE_MILLIMETER);

		assertTrue(wasTestSucceeded(getSuccessPercent(squareKilometerTestResultAsArray, squareKilometerResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareHectometerTestResultAsArray, squareHectometerResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareDecameterTestResultAsArray, squareDecameterResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareMeterTestResultAsArray, squareMeterResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareDecimeterTestResultAsArray, squareDecimeterResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareCentimeterTestResultAsArray, squareCentimeterResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareMillimeterTestResultAsArray, squareMillimeterResultAsArray)));
	}

	@Test 
	public void toSquareDecameterTest()
	{
		BigDecimal squareKilometerValue = getRandomDouble();
		BigDecimal squareHectometerValue = getRandomDouble();
		BigDecimal squareDecameterValue = getRandomDouble();
		BigDecimal squareMeterValue = getRandomDouble();
		BigDecimal squareDecimeterValue = getRandomDouble();
		BigDecimal squareCentimeterValue = getRandomDouble();
		BigDecimal squareMillimeterValue = getRandomDouble();

		String[] squareKilometerTestResultAsArray = getTestResultAsArrayFrom(squareKilometerValue, 1E4);
		String[] squareHectometerTestResultAsArray = getTestResultAsArrayFrom(squareHectometerValue, 1E2);
		String[] squareDecameterTestResultAsArray = getTestResultAsArrayFrom(squareDecameterValue, 1);
		String[] squareMeterTestResultAsArray = getTestResultAsArrayFrom(squareMeterValue, 1E-2);
		String[] squareDecimeterTestResultAsArray = getTestResultAsArrayFrom(squareDecimeterValue, 1E-4);
		String[] squareCentimeterTestResultAsArray = getTestResultAsArrayFrom(squareCentimeterValue, 1E-6);
		String[] squareMillimeterTestResultAsArray = getTestResultAsArrayFrom(squareMillimeterValue, 1E-8);

		String[] squareKilometerResultAsArray = getResultAsArrayFrom(squareKilometerValue, SQUARE_KILOMETER);
		String[] squareHectometerResultAsArray = getResultAsArrayFrom(squareHectometerValue, SQUARE_HECTOMETER);
		String[] squareDecameterResultAsArray = getResultAsArrayFrom(squareDecameterValue, SQUARE_DECAMETER);
		String[] squareMeterResultAsArray = getResultAsArrayFrom(squareMeterValue, SQUARE_METER);
		String[] squareDecimeterResultAsArray = getResultAsArrayFrom(squareDecimeterValue, SQUARE_DECIMETER);
		String[] squareCentimeterResultAsArray = getResultAsArrayFrom(squareCentimeterValue, SQUARE_CENTIMETER);
		String[] squareMillimeterResultAsArray = getResultAsArrayFrom(squareMillimeterValue, SQUARE_MILLIMETER);

		assertTrue(wasTestSucceeded(getSuccessPercent(squareKilometerTestResultAsArray, squareKilometerResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareHectometerTestResultAsArray, squareHectometerResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareDecameterTestResultAsArray, squareDecameterResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareMeterTestResultAsArray, squareMeterResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareDecimeterTestResultAsArray, squareDecimeterResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareCentimeterTestResultAsArray, squareCentimeterResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareMillimeterTestResultAsArray, squareMillimeterResultAsArray)));
	}

	@Test 
	public void toSquareMeterTest()
	{
		BigDecimal squareKilometerValue = getRandomDouble();
		BigDecimal squareHectometerValue = getRandomDouble();
		BigDecimal squareDecameterValue = getRandomDouble();
		BigDecimal squareMeterValue = getRandomDouble();
		BigDecimal squareDecimeterValue = getRandomDouble();
		BigDecimal squareCentimeterValue = getRandomDouble();
		BigDecimal squareMillimeterValue = getRandomDouble();

		String[] squareKilometerTestResultAsArray = getTestResultAsArrayFrom(squareKilometerValue, 1E6);
		String[] squareHectometerTestResultAsArray = getTestResultAsArrayFrom(squareHectometerValue, 1E4);
		String[] squareDecameterTestResultAsArray = getTestResultAsArrayFrom(squareDecameterValue, 1E2);
		String[] squareMeterTestResultAsArray = getTestResultAsArrayFrom(squareMeterValue, 1);
		String[] squareDecimeterTestResultAsArray = getTestResultAsArrayFrom(squareDecimeterValue, 1E-2);
		String[] squareCentimeterTestResultAsArray = getTestResultAsArrayFrom(squareCentimeterValue, 1E-4);
		String[] squareMillimeterTestResultAsArray = getTestResultAsArrayFrom(squareMillimeterValue, 1E-6);

		String[] squareKilometerResultAsArray = getResultAsArrayFrom(squareKilometerValue, SQUARE_KILOMETER);
		String[] squareHectometerResultAsArray = getResultAsArrayFrom(squareHectometerValue, SQUARE_HECTOMETER);
		String[] squareDecameterResultAsArray = getResultAsArrayFrom(squareDecameterValue, SQUARE_DECAMETER);
		String[] squareMeterResultAsArray = getResultAsArrayFrom(squareMeterValue, SQUARE_METER);
		String[] squareDecimeterResultAsArray = getResultAsArrayFrom(squareDecimeterValue, SQUARE_DECIMETER);
		String[] squareCentimeterResultAsArray = getResultAsArrayFrom(squareCentimeterValue, SQUARE_CENTIMETER);
		String[] squareMillimeterResultAsArray = getResultAsArrayFrom(squareMillimeterValue, SQUARE_MILLIMETER);

		assertTrue(wasTestSucceeded(getSuccessPercent(squareKilometerTestResultAsArray, squareKilometerResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareHectometerTestResultAsArray, squareHectometerResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareDecameterTestResultAsArray, squareDecameterResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareMeterTestResultAsArray, squareMeterResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareDecimeterTestResultAsArray, squareDecimeterResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareCentimeterTestResultAsArray, squareCentimeterResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareMillimeterTestResultAsArray, squareMillimeterResultAsArray)));
	}

	@Test 
	public void toSquareDecimeterTest()
	{
		BigDecimal squareKilometerValue = getRandomDouble();
		BigDecimal squareHectometerValue = getRandomDouble();
		BigDecimal squareDecameterValue = getRandomDouble();
		BigDecimal squareMeterValue = getRandomDouble();
		BigDecimal squareDecimeterValue = getRandomDouble();
		BigDecimal squareCentimeterValue = getRandomDouble();
		BigDecimal squareMillimeterValue = getRandomDouble();

		String[] squareKilometerTestResultAsArray = getTestResultAsArrayFrom(squareKilometerValue, 1E8);
		String[] squareHectometerTestResultAsArray = getTestResultAsArrayFrom(squareHectometerValue, 1E6);
		String[] squareDecameterTestResultAsArray = getTestResultAsArrayFrom(squareDecameterValue, 1E4);
		String[] squareMeterTestResultAsArray = getTestResultAsArrayFrom(squareMeterValue, 1E2);
		String[] squareDecimeterTestResultAsArray = getTestResultAsArrayFrom(squareDecimeterValue, 1);
		String[] squareCentimeterTestResultAsArray = getTestResultAsArrayFrom(squareCentimeterValue, 1E-2);
		String[] squareMillimeterTestResultAsArray = getTestResultAsArrayFrom(squareMillimeterValue, 1E-4);

		String[] squareKilometerResultAsArray = getResultAsArrayFrom(squareKilometerValue, SQUARE_KILOMETER);
		String[] squareHectometerResultAsArray = getResultAsArrayFrom(squareHectometerValue, SQUARE_HECTOMETER);
		String[] squareDecameterResultAsArray = getResultAsArrayFrom(squareDecameterValue, SQUARE_DECAMETER);
		String[] squareMeterResultAsArray = getResultAsArrayFrom(squareMeterValue, SQUARE_METER);
		String[] squareDecimeterResultAsArray = getResultAsArrayFrom(squareDecimeterValue, SQUARE_DECIMETER);
		String[] squareCentimeterResultAsArray = getResultAsArrayFrom(squareCentimeterValue, SQUARE_CENTIMETER);
		String[] squareMillimeterResultAsArray = getResultAsArrayFrom(squareMillimeterValue, SQUARE_MILLIMETER);

		assertTrue(wasTestSucceeded(getSuccessPercent(squareKilometerTestResultAsArray, squareKilometerResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareHectometerTestResultAsArray, squareHectometerResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareDecameterTestResultAsArray, squareDecameterResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareMeterTestResultAsArray, squareMeterResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareDecimeterTestResultAsArray, squareDecimeterResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareCentimeterTestResultAsArray, squareCentimeterResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareMillimeterTestResultAsArray, squareMillimeterResultAsArray)));
	}

	@Test 
	public void toSquareCentimeterTest()
	{
		BigDecimal squareKilometerValue = getRandomDouble();
		BigDecimal squareHectometerValue = getRandomDouble();
		BigDecimal squareDecameterValue = getRandomDouble();
		BigDecimal squareMeterValue = getRandomDouble();
		BigDecimal squareDecimeterValue = getRandomDouble();
		BigDecimal squareCentimeterValue = getRandomDouble();
		BigDecimal squareMillimeterValue = getRandomDouble();

		String[] squareKilometerTestResultAsArray = getTestResultAsArrayFrom(squareKilometerValue, 1E10);
		String[] squareHectometerTestResultAsArray = getTestResultAsArrayFrom(squareHectometerValue, 1E8);
		String[] squareDecameterTestResultAsArray = getTestResultAsArrayFrom(squareDecameterValue, 1E6);
		String[] squareMeterTestResultAsArray = getTestResultAsArrayFrom(squareMeterValue, 1E4);
		String[] squareDecimeterTestResultAsArray = getTestResultAsArrayFrom(squareDecimeterValue, 1E2);
		String[] squareCentimeterTestResultAsArray = getTestResultAsArrayFrom(squareCentimeterValue, 1);
		String[] squareMillimeterTestResultAsArray = getTestResultAsArrayFrom(squareMillimeterValue, 1E-2);

		String[] squareKilometerResultAsArray = getResultAsArrayFrom(squareKilometerValue, SQUARE_KILOMETER);
		String[] squareHectometerResultAsArray = getResultAsArrayFrom(squareHectometerValue, SQUARE_HECTOMETER);
		String[] squareDecameterResultAsArray = getResultAsArrayFrom(squareDecameterValue, SQUARE_DECAMETER);
		String[] squareMeterResultAsArray = getResultAsArrayFrom(squareMeterValue, SQUARE_METER);
		String[] squareDecimeterResultAsArray = getResultAsArrayFrom(squareDecimeterValue, SQUARE_DECIMETER);
		String[] squareCentimeterResultAsArray = getResultAsArrayFrom(squareCentimeterValue, SQUARE_CENTIMETER);
		String[] squareMillimeterResultAsArray = getResultAsArrayFrom(squareMillimeterValue, SQUARE_MILLIMETER);

		assertTrue(wasTestSucceeded(getSuccessPercent(squareKilometerTestResultAsArray, squareKilometerResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareHectometerTestResultAsArray, squareHectometerResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareDecameterTestResultAsArray, squareDecameterResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareMeterTestResultAsArray, squareMeterResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareDecimeterTestResultAsArray, squareDecimeterResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareCentimeterTestResultAsArray, squareCentimeterResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareMillimeterTestResultAsArray, squareMillimeterResultAsArray)));
	}

	@Test 
	public void toSquareMillimeterTest()
	{
		BigDecimal squareKilometerValue = getRandomDouble();
		BigDecimal squareHectometerValue = getRandomDouble();
		BigDecimal squareDecameterValue = getRandomDouble();
		BigDecimal squareMeterValue = getRandomDouble();
		BigDecimal squareDecimeterValue = getRandomDouble();
		BigDecimal squareCentimeterValue = getRandomDouble();
		BigDecimal squareMillimeterValue = getRandomDouble();

		String[] squareKilometerTestResultAsArray = getTestResultAsArrayFrom(squareKilometerValue, 1E12);
		String[] squareHectometerTestResultAsArray = getTestResultAsArrayFrom(squareHectometerValue, 1E10);
		String[] squareDecameterTestResultAsArray = getTestResultAsArrayFrom(squareDecameterValue, 1E8);
		String[] squareMeterTestResultAsArray = getTestResultAsArrayFrom(squareMeterValue, 1E6);
		String[] squareDecimeterTestResultAsArray = getTestResultAsArrayFrom(squareDecimeterValue, 1E4);
		String[] squareCentimeterTestResultAsArray = getTestResultAsArrayFrom(squareCentimeterValue, 1E2);
		String[] squareMillimeterTestResultAsArray = getTestResultAsArrayFrom(squareMillimeterValue, 1);

		String[] squareKilometerResultAsArray = getResultAsArrayFrom(squareKilometerValue, SQUARE_KILOMETER);
		String[] squareHectometerResultAsArray = getResultAsArrayFrom(squareHectometerValue, SQUARE_HECTOMETER);
		String[] squareDecameterResultAsArray = getResultAsArrayFrom(squareDecameterValue, SQUARE_DECAMETER);
		String[] squareMeterResultAsArray = getResultAsArrayFrom(squareMeterValue, SQUARE_METER);
		String[] squareDecimeterResultAsArray = getResultAsArrayFrom(squareDecimeterValue, SQUARE_DECIMETER);
		String[] squareCentimeterResultAsArray = getResultAsArrayFrom(squareCentimeterValue, SQUARE_CENTIMETER);
		String[] squareMillimeterResultAsArray = getResultAsArrayFrom(squareMillimeterValue, SQUARE_MILLIMETER);

		assertTrue(wasTestSucceeded(getSuccessPercent(squareKilometerTestResultAsArray, squareKilometerResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareHectometerTestResultAsArray, squareHectometerResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareDecameterTestResultAsArray, squareDecameterResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareMeterTestResultAsArray, squareMeterResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareDecimeterTestResultAsArray, squareDecimeterResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareCentimeterTestResultAsArray, squareCentimeterResultAsArray)));
		assertTrue(wasTestSucceeded(getSuccessPercent(squareMillimeterTestResultAsArray, squareMillimeterResultAsArray)));
	}
*/
	private double getRandomDouble()
	{
		return random.nextDouble() * 100;
	}

	private String[] getSquareKilometerTestResultAsArray(double value, double unit)
	{
		return BigDecimal.valueOf(value).multiply(BigDecimal.valueOf(unit)).divide(AREA_SCALES[SQUARE_KILOMETER - 7]).toString().split("");
	}
	
	private String[] getSquareHectometerTestResultAsArray(double value, double unit)
	{
		return BigDecimal.valueOf(value).multiply(BigDecimal.valueOf(unit)).divide(AREA_SCALES[SQUARE_HECTOMETER - 7]).toString().split("");
	}
	
	private String[] getSquareDecameterTestResultAsArray(double value, double unit)
	{
		return BigDecimal.valueOf(value).multiply(BigDecimal.valueOf(unit)).divide(AREA_SCALES[SQUARE_DECAMETER - 7]).toString().split("");
	}
	
	private String[] getSquareMeterTestResultAsArray(double value, double unit)
	{
		return BigDecimal.valueOf(value).multiply(BigDecimal.valueOf(unit)).divide(AREA_SCALES[SQUARE_METER - 7]).toString().split("");
	}
	
	private String[] getSquareDecimeterTestResultAsArray(double value, double unit)
	{
		return BigDecimal.valueOf(value).multiply(BigDecimal.valueOf(unit)).divide(AREA_SCALES[SQUARE_DECIMETER - 7]).toString().split("");
	}
	
	private String[] getSquareCentimeterTestResultAsArray(double value, double unit)
	{
		return BigDecimal.valueOf(value).multiply(BigDecimal.valueOf(unit)).divide(AREA_SCALES[SQUARE_CENTIMETER - 7]).toString().split("");
	}
	
	private String[] getSquareMillimeterTestResultAsArray(double value, double unit)
	{
		return BigDecimal.valueOf(value).multiply(BigDecimal.valueOf(unit)).divide(AREA_SCALES[SQUARE_MILLIMETER - 7]).toString().split("");
	}

	private double getSuccessPercent(
	    String[] testResultAsArray,
		String[] resultAsArray)
	{
		int possibleCases = testResultAsArray.length;
		int favorableCases = 0;
		try
		{
			for (int i = 0; i < possibleCases; i++)
			{
				if (testResultAsArray[i].equals(resultAsArray[i]))
				    favorableCases++;
			}
		}
		catch (IndexOutOfBoundsException e)
		{}
		catch (ArithmeticException e)
		{
			return getSuccessPercent(testResultAsArray, resultAsArray);
		}
		finally
		{
		    return (100 * possibleCases) / favorableCases;
		}
	}
	
	private Boolean wasTestSucceeded(double successPercent)
	{
		return successPercent >= 80 ? true : false;
	}
}
