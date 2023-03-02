package com.gabrielMJr.twaire.physic.units;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;
import org.junit.jupiter.api.Test;

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
	private final NumberFormat formatter;
	private final Random random;

	public AreaTest()
	{
		area = Area.getInstance();
		random = new Random();
		formatter = new DecimalFormat("#00.0000");
	}

	@Test 
	public void toSquareKilometerTest()
	{
		BigDecimal squareKilometerValue = getRandomBigDecimal();
		BigDecimal squareHectometerValue = getRandomBigDecimal();
		BigDecimal squareDecameterValue = getRandomBigDecimal();
		BigDecimal squareMeterValue = getRandomBigDecimal();
		BigDecimal squareDecimeterValue = getRandomBigDecimal();
		BigDecimal squareCentimeterValue = getRandomBigDecimal();
	    BigDecimal squareMillimeterValue = getRandomBigDecimal();

		String[] squareKilometerTestResultAsArray = getTestResultAsArrayFrom(squareKilometerValue, 1);
		String[] squareHectometerTestResultAsArray = getTestResultAsArrayFrom(squareHectometerValue, 1E-2);
		String[] squareDecameterTestResultAsArray = getTestResultAsArrayFrom(squareDecameterValue, 1E-4);
		String[] squareMeterTestResultAsArray = getTestResultAsArrayFrom(squareMeterValue, 1E-6);
		String[] squareDecimeterTestResultAsArray = getTestResultAsArrayFrom(squareDecimeterValue, 1E-8);
		String[] squareCentimeterTestResultAsArray = getTestResultAsArrayFrom(squareCentimeterValue, 1E-10);
		String[] squareMillimeterTestResultAsArray = getTestResultAsArrayFrom(squareMillimeterValue, 1E-12);

		String[] squareKilometerResultAsArray = area.toSquareKilometer(Double.valueOf(formatter.format(squareKilometerValue)), SQUARE_KILOMETER).toString().split("");
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
	public void toSquareHectometerTest()
	{
		BigDecimal squareKilometerValue = getRandomBigDecimal();
		BigDecimal squareHectometerValue = getRandomBigDecimal();
		BigDecimal squareDecameterValue = getRandomBigDecimal();
		BigDecimal squareMeterValue = getRandomBigDecimal();
		BigDecimal squareDecimeterValue = getRandomBigDecimal();
		BigDecimal squareCentimeterValue = getRandomBigDecimal();
		BigDecimal squareMillimeterValue = getRandomBigDecimal();

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
		BigDecimal squareKilometerValue = getRandomBigDecimal();
		BigDecimal squareHectometerValue = getRandomBigDecimal();
		BigDecimal squareDecameterValue = getRandomBigDecimal();
		BigDecimal squareMeterValue = getRandomBigDecimal();
		BigDecimal squareDecimeterValue = getRandomBigDecimal();
		BigDecimal squareCentimeterValue = getRandomBigDecimal();
		BigDecimal squareMillimeterValue = getRandomBigDecimal();

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
		BigDecimal squareKilometerValue = getRandomBigDecimal();
		BigDecimal squareHectometerValue = getRandomBigDecimal();
		BigDecimal squareDecameterValue = getRandomBigDecimal();
		BigDecimal squareMeterValue = getRandomBigDecimal();
		BigDecimal squareDecimeterValue = getRandomBigDecimal();
		BigDecimal squareCentimeterValue = getRandomBigDecimal();
		BigDecimal squareMillimeterValue = getRandomBigDecimal();

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
		BigDecimal squareKilometerValue = getRandomBigDecimal();
		BigDecimal squareHectometerValue = getRandomBigDecimal();
		BigDecimal squareDecameterValue = getRandomBigDecimal();
		BigDecimal squareMeterValue = getRandomBigDecimal();
		BigDecimal squareDecimeterValue = getRandomBigDecimal();
		BigDecimal squareCentimeterValue = getRandomBigDecimal();
		BigDecimal squareMillimeterValue = getRandomBigDecimal();

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
		BigDecimal squareKilometerValue = getRandomBigDecimal();
		BigDecimal squareHectometerValue = getRandomBigDecimal();
		BigDecimal squareDecameterValue = getRandomBigDecimal();
		BigDecimal squareMeterValue = getRandomBigDecimal();
		BigDecimal squareDecimeterValue = getRandomBigDecimal();
		BigDecimal squareCentimeterValue = getRandomBigDecimal();
		BigDecimal squareMillimeterValue = getRandomBigDecimal();

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
		BigDecimal squareKilometerValue = getRandomBigDecimal();
		BigDecimal squareHectometerValue = getRandomBigDecimal();
		BigDecimal squareDecameterValue = getRandomBigDecimal();
		BigDecimal squareMeterValue = getRandomBigDecimal();
		BigDecimal squareDecimeterValue = getRandomBigDecimal();
		BigDecimal squareCentimeterValue = getRandomBigDecimal();
		BigDecimal squareMillimeterValue = getRandomBigDecimal();

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

	private BigDecimal getRandomBigDecimal()
	{
		return BigDecimal.valueOf(random.nextDouble()).multiply(BigDecimal.valueOf(100));
	}

	private BigDecimal getResultFrom(BigDecimal value, double fromUnit)
	{
		return value.divide(BigDecimal.valueOf(fromUnit));
	}

	private String[] getTestResultAsArrayFrom(BigDecimal value, double fromUnit)
	{
	    return value.divide(BigDecimal.valueOf(fromUnit)).toString().split("");
	}

	private String[] getResultAsArrayFrom(BigDecimal value, String unit)
	{
	    return area.toSquareKilometer(Double.valueOf(formatter.format(value)), unit).toString().split("");
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
