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

	public AreaTest ()
	{
		area = Area.getInstance();
		random = new Random();
	}

	@Test 
	public void toSquareKilometerTest ()
	{
		double squareKilometerValue = getRandomDouble();
		double squareHectometerValue = getRandomDouble();
		double squareDecameterValue = getRandomDouble();
		double squareMeterValue = getRandomDouble();
		double squareDecimeterValue = getRandomDouble();
		double squareCentimeterValue = getRandomDouble();
	    double squareMillimeterValue = getRandomDouble();

		BigDecimal squareKilometerTestResult = BigDecimal.valueOf(squareKilometerValue).multiply(AREA_SCALES[SQUARE_KILOMETER - 7]).divide(AREA_SCALES[SQUARE_KILOMETER - 7]);
		BigDecimal squareHectometerTestResult = BigDecimal.valueOf(squareHectometerValue).multiply(AREA_SCALES[SQUARE_HECTOMETER - 7]).divide(AREA_SCALES[SQUARE_KILOMETER - 7]);
		BigDecimal squareDecameterTestResult = BigDecimal.valueOf(squareDecameterValue).multiply(AREA_SCALES[SQUARE_DECAMETER - 7]).divide(AREA_SCALES[SQUARE_KILOMETER - 7]);
		BigDecimal squareMeterTestResult = BigDecimal.valueOf(squareMeterValue).multiply(AREA_SCALES[SQUARE_METER - 7]).divide(AREA_SCALES[SQUARE_KILOMETER - 7]);
		BigDecimal squareDecimeterTestResult = BigDecimal.valueOf(squareDecimeterValue).multiply(AREA_SCALES[SQUARE_DECIMETER - 7]).divide(AREA_SCALES[SQUARE_KILOMETER - 7]);
        BigDecimal squareCentimeterTestResult = BigDecimal.valueOf(squareCentimeterValue).multiply(AREA_SCALES[SQUARE_CENTIMETER - 7]).divide(AREA_SCALES[SQUARE_KILOMETER - 7]);
		BigDecimal squareMillimeterTestResult = BigDecimal.valueOf(squareMillimeterValue).multiply(AREA_SCALES[SQUARE_MILLIMETER - 7]).divide(AREA_SCALES[SQUARE_KILOMETER - 7]);

		BigDecimal squareKilometerResult = area.toSquareKilometer(squareKilometerValue, SQUARE_KILOMETER);
		BigDecimal squareHectometerResult = area.toSquareKilometer(squareHectometerValue, SQUARE_HECTOMETER);
		BigDecimal squareDecameterResult = area.toSquareKilometer(squareDecameterValue, SQUARE_DECAMETER);
		BigDecimal squareMeterResult = area.toSquareKilometer(squareMeterValue, SQUARE_METER);
	    BigDecimal squareDecimeterResult = area.toSquareKilometer(squareDecimeterValue, SQUARE_DECIMETER);
		BigDecimal squareCentimeterResult = area.toSquareKilometer(squareCentimeterValue, SQUARE_CENTIMETER);
		BigDecimal squareMillimeterResult = area.toSquareKilometer(squareMillimeterValue, SQUARE_MILLIMETER);

		assertEquals(squareKilometerTestResult, squareKilometerResult);
		assertEquals(squareHectometerTestResult, squareHectometerResult);
		assertEquals(squareDecameterTestResult, squareDecameterResult);
		assertEquals(squareMeterTestResult, squareMeterResult);
		assertEquals(squareDecimeterTestResult, squareDecimeterResult);
		assertEquals(squareCentimeterTestResult, squareCentimeterResult);
		assertEquals(squareMillimeterTestResult, squareMillimeterResult);
	}

	@Test 
	public void toSquareHectometerTest ()
	{
		double squareKilometerValue = getRandomDouble();
		double squareHectometerValue = getRandomDouble();
		double squareDecameterValue = getRandomDouble();
		double squareMeterValue = getRandomDouble();
		double squareDecimeterValue = getRandomDouble();
		double squareCentimeterValue = getRandomDouble();
		double squareMillimeterValue = getRandomDouble();

		BigDecimal squareKilometerTestResult = BigDecimal.valueOf(squareKilometerValue).multiply(AREA_SCALES[SQUARE_KILOMETER - 7]).divide(AREA_SCALES[SQUARE_HECTOMETER - 7]);
		BigDecimal squareHectometerTestResult = BigDecimal.valueOf(squareHectometerValue).multiply(AREA_SCALES[SQUARE_HECTOMETER - 7]).divide(AREA_SCALES[SQUARE_HECTOMETER - 7]);
		BigDecimal squareDecameterTestResult = BigDecimal.valueOf(squareDecameterValue).multiply(AREA_SCALES[SQUARE_DECAMETER - 7]).divide(AREA_SCALES[SQUARE_HECTOMETER - 7]);
		BigDecimal squareMeterTestResult = BigDecimal.valueOf(squareMeterValue).multiply(AREA_SCALES[SQUARE_METER - 7]).divide(AREA_SCALES[SQUARE_HECTOMETER - 7]);
		BigDecimal squareDecimeterTestResult = BigDecimal.valueOf(squareDecimeterValue).multiply(AREA_SCALES[SQUARE_DECIMETER - 7]).divide(AREA_SCALES[SQUARE_HECTOMETER - 7]);
        BigDecimal squareCentimeterTestResult = BigDecimal.valueOf(squareCentimeterValue).multiply(AREA_SCALES[SQUARE_CENTIMETER - 7]).divide(AREA_SCALES[SQUARE_HECTOMETER - 7]);
		BigDecimal squareMillimeterTestResult = BigDecimal.valueOf(squareMillimeterValue).multiply(AREA_SCALES[SQUARE_MILLIMETER - 7]).divide(AREA_SCALES[SQUARE_HECTOMETER - 7]);

		BigDecimal squareKilometerResult = area.toSquareHectometer(squareKilometerValue, SQUARE_KILOMETER);
		BigDecimal squareHectometerResult = area.toSquareHectometer(squareHectometerValue, SQUARE_HECTOMETER);
		BigDecimal squareDecameterResult = area.toSquareHectometer(squareDecameterValue, SQUARE_DECAMETER);
		BigDecimal squareMeterResult = area.toSquareHectometer(squareMeterValue, SQUARE_METER);
	    BigDecimal squareDecimeterResult = area.toSquareHectometer(squareDecimeterValue, SQUARE_DECIMETER);
		BigDecimal squareCentimeterResult = area.toSquareHectometer(squareCentimeterValue, SQUARE_CENTIMETER);
		BigDecimal squareMillimeterResult = area.toSquareHectometer(squareMillimeterValue, SQUARE_MILLIMETER);
		
		assertEquals(squareKilometerTestResult, squareKilometerResult);
		assertEquals(squareHectometerTestResult, squareHectometerResult);
		assertEquals(squareDecameterTestResult, squareDecameterResult);
		assertEquals(squareMeterTestResult, squareMeterResult);
		assertEquals(squareDecimeterTestResult, squareDecimeterResult);
		assertEquals(squareCentimeterTestResult, squareCentimeterResult);
		assertEquals(squareMillimeterTestResult, squareMillimeterResult);
	}

	@Test 
	public void toSquareDecameterTest ()
	{
		double squareKilometerValue = getRandomDouble();
		double squareHectometerValue = getRandomDouble();
		double squareDecameterValue = getRandomDouble();
		double squareMeterValue = getRandomDouble();
		double squareDecimeterValue = getRandomDouble();
		double squareCentimeterValue = getRandomDouble();
		double squareMillimeterValue = getRandomDouble();

		BigDecimal squareKilometerTestResult = BigDecimal.valueOf(squareKilometerValue).multiply(AREA_SCALES[SQUARE_KILOMETER - 7]).divide(AREA_SCALES[SQUARE_DECAMETER - 7]);
		BigDecimal squareHectometerTestResult = BigDecimal.valueOf(squareHectometerValue).multiply(AREA_SCALES[SQUARE_HECTOMETER - 7]).divide(AREA_SCALES[SQUARE_DECAMETER - 7]);
		BigDecimal squareDecameterTestResult = BigDecimal.valueOf(squareDecameterValue).multiply(AREA_SCALES[SQUARE_DECAMETER - 7]).divide(AREA_SCALES[SQUARE_DECAMETER - 7]);
		BigDecimal squareMeterTestResult = BigDecimal.valueOf(squareMeterValue).multiply(AREA_SCALES[SQUARE_METER - 7]).divide(AREA_SCALES[SQUARE_DECAMETER - 7]);
		BigDecimal squareDecimeterTestResult = BigDecimal.valueOf(squareDecimeterValue).multiply(AREA_SCALES[SQUARE_DECIMETER - 7]).divide(AREA_SCALES[SQUARE_DECAMETER - 7]);
        BigDecimal squareCentimeterTestResult = BigDecimal.valueOf(squareCentimeterValue).multiply(AREA_SCALES[SQUARE_CENTIMETER - 7]).divide(AREA_SCALES[SQUARE_DECAMETER - 7]);
		BigDecimal squareMillimeterTestResult = BigDecimal.valueOf(squareMillimeterValue).multiply(AREA_SCALES[SQUARE_MILLIMETER - 7]).divide(AREA_SCALES[SQUARE_DECAMETER - 7]);

		BigDecimal squareKilometerResult = area.toSquareDecameter(squareKilometerValue, SQUARE_KILOMETER);
		BigDecimal squareHectometerResult = area.toSquareDecameter(squareHectometerValue, SQUARE_HECTOMETER);
		BigDecimal squareDecameterResult = area.toSquareDecameter(squareDecameterValue, SQUARE_DECAMETER);
		BigDecimal squareMeterResult = area.toSquareDecameter(squareMeterValue, SQUARE_METER);
	    BigDecimal squareDecimeterResult = area.toSquareDecameter(squareDecimeterValue, SQUARE_DECIMETER);
		BigDecimal squareCentimeterResult = area.toSquareDecameter(squareCentimeterValue, SQUARE_CENTIMETER);
		BigDecimal squareMillimeterResult = area.toSquareDecameter(squareMillimeterValue, SQUARE_MILLIMETER);
		
		assertEquals(squareKilometerTestResult, squareKilometerResult);
		assertEquals(squareHectometerTestResult, squareHectometerResult);
		assertEquals(squareDecameterTestResult, squareDecameterResult);
		assertEquals(squareMeterTestResult, squareMeterResult);
		assertEquals(squareDecimeterTestResult, squareDecimeterResult);
		assertEquals(squareCentimeterTestResult, squareCentimeterResult);
		assertEquals(squareMillimeterTestResult, squareMillimeterResult);
	}

	@Test 
	public void toSquareMeterTest ()
	{
		double squareKilometerValue = getRandomDouble();
		double squareHectometerValue = getRandomDouble();
		double squareDecameterValue = getRandomDouble();
		double squareMeterValue = getRandomDouble();
		double squareDecimeterValue = getRandomDouble();
		double squareCentimeterValue = getRandomDouble();
		double squareMillimeterValue = getRandomDouble();

		BigDecimal squareKilometerTestResult = BigDecimal.valueOf(squareKilometerValue).multiply(AREA_SCALES[SQUARE_KILOMETER - 7]).divide(AREA_SCALES[SQUARE_METER - 7]);
		BigDecimal squareHectometerTestResult = BigDecimal.valueOf(squareHectometerValue).multiply(AREA_SCALES[SQUARE_HECTOMETER - 7]).divide(AREA_SCALES[SQUARE_METER - 7]);
		BigDecimal squareDecameterTestResult = BigDecimal.valueOf(squareDecameterValue).multiply(AREA_SCALES[SQUARE_DECAMETER - 7]).divide(AREA_SCALES[SQUARE_METER - 7]);
		BigDecimal squareMeterTestResult = BigDecimal.valueOf(squareMeterValue).multiply(AREA_SCALES[SQUARE_METER - 7]).divide(AREA_SCALES[SQUARE_METER - 7]);
		BigDecimal squareDecimeterTestResult = BigDecimal.valueOf(squareDecimeterValue).multiply(AREA_SCALES[SQUARE_DECIMETER - 7]).divide(AREA_SCALES[SQUARE_METER - 7]);
        BigDecimal squareCentimeterTestResult = BigDecimal.valueOf(squareCentimeterValue).multiply(AREA_SCALES[SQUARE_CENTIMETER - 7]).divide(AREA_SCALES[SQUARE_METER - 7]);
		BigDecimal squareMillimeterTestResult = BigDecimal.valueOf(squareMillimeterValue).multiply(AREA_SCALES[SQUARE_MILLIMETER - 7]).divide(AREA_SCALES[SQUARE_METER - 7]);

		BigDecimal squareKilometerResult = area.toSquareMeter(squareKilometerValue, SQUARE_KILOMETER);
		BigDecimal squareHectometerResult = area.toSquareMeter(squareHectometerValue, SQUARE_HECTOMETER);
		BigDecimal squareDecameterResult = area.toSquareMeter(squareDecameterValue, SQUARE_DECAMETER);
		BigDecimal squareMeterResult = area.toSquareMeter(squareMeterValue, SQUARE_METER);
	    BigDecimal squareDecimeterResult = area.toSquareMeter(squareDecimeterValue, SQUARE_DECIMETER);
		BigDecimal squareCentimeterResult = area.toSquareMeter(squareCentimeterValue, SQUARE_CENTIMETER);
		BigDecimal squareMillimeterResult = area.toSquareMeter(squareMillimeterValue, SQUARE_MILLIMETER);
		
		assertEquals(squareKilometerTestResult, squareKilometerResult);
		assertEquals(squareHectometerTestResult, squareHectometerResult);
		assertEquals(squareDecameterTestResult, squareDecameterResult);
		assertEquals(squareMeterTestResult, squareMeterResult);
		assertEquals(squareDecimeterTestResult, squareDecimeterResult);
		assertEquals(squareCentimeterTestResult, squareCentimeterResult);
		assertEquals(squareMillimeterTestResult, squareMillimeterResult);
	}

	@Test 
	public void toSquareDecimeterTest ()
	{
		double squareKilometerValue = getRandomDouble();
		double squareHectometerValue = getRandomDouble();
		double squareDecameterValue = getRandomDouble();
		double squareMeterValue = getRandomDouble();
		double squareDecimeterValue = getRandomDouble();
		double squareCentimeterValue = getRandomDouble();
		double squareMillimeterValue = getRandomDouble();

		BigDecimal squareKilometerTestResult = BigDecimal.valueOf(squareKilometerValue).multiply(AREA_SCALES[SQUARE_KILOMETER - 7]).divide(AREA_SCALES[SQUARE_DECIMETER - 7]);
		BigDecimal squareHectometerTestResult = BigDecimal.valueOf(squareHectometerValue).multiply(AREA_SCALES[SQUARE_HECTOMETER - 7]).divide(AREA_SCALES[SQUARE_DECIMETER - 7]);
		BigDecimal squareDecameterTestResult = BigDecimal.valueOf(squareDecameterValue).multiply(AREA_SCALES[SQUARE_DECAMETER - 7]).divide(AREA_SCALES[SQUARE_DECIMETER - 7]);
		BigDecimal squareMeterTestResult = BigDecimal.valueOf(squareMeterValue).multiply(AREA_SCALES[SQUARE_METER - 7]).divide(AREA_SCALES[SQUARE_DECIMETER - 7]);
		BigDecimal squareDecimeterTestResult = BigDecimal.valueOf(squareDecimeterValue).multiply(AREA_SCALES[SQUARE_DECIMETER - 7]).divide(AREA_SCALES[SQUARE_DECIMETER - 7]);
        BigDecimal squareCentimeterTestResult = BigDecimal.valueOf(squareCentimeterValue).multiply(AREA_SCALES[SQUARE_CENTIMETER - 7]).divide(AREA_SCALES[SQUARE_DECIMETER - 7]);
		BigDecimal squareMillimeterTestResult = BigDecimal.valueOf(squareMillimeterValue).multiply(AREA_SCALES[SQUARE_MILLIMETER - 7]).divide(AREA_SCALES[SQUARE_DECIMETER - 7]);

		BigDecimal squareKilometerResult = area.toSquareDecimeter(squareKilometerValue, SQUARE_KILOMETER);
		BigDecimal squareHectometerResult = area.toSquareDecimeter(squareHectometerValue, SQUARE_HECTOMETER);
		BigDecimal squareDecameterResult = area.toSquareDecimeter(squareDecameterValue, SQUARE_DECAMETER);
		BigDecimal squareMeterResult = area.toSquareDecimeter(squareMeterValue, SQUARE_METER);
	    BigDecimal squareDecimeterResult = area.toSquareDecimeter(squareDecimeterValue, SQUARE_DECIMETER);
		BigDecimal squareCentimeterResult = area.toSquareDecimeter(squareCentimeterValue, SQUARE_CENTIMETER);
		BigDecimal squareMillimeterResult = area.toSquareDecimeter(squareMillimeterValue, SQUARE_MILLIMETER);
		
		assertEquals(squareKilometerTestResult, squareKilometerResult);
		assertEquals(squareHectometerTestResult, squareHectometerResult);
		assertEquals(squareDecameterTestResult, squareDecameterResult);
		assertEquals(squareMeterTestResult, squareMeterResult);
		assertEquals(squareDecimeterTestResult, squareDecimeterResult);
		assertEquals(squareCentimeterTestResult, squareCentimeterResult);
		assertEquals(squareMillimeterTestResult, squareMillimeterResult);
	}

	@Test 
	public void toSquareCentimeterTest ()
	{
		double squareKilometerValue = getRandomDouble();
		double squareHectometerValue = getRandomDouble();
		double squareDecameterValue = getRandomDouble();
		double squareMeterValue = getRandomDouble();
		double squareDecimeterValue = getRandomDouble();
		double squareCentimeterValue = getRandomDouble();
		double squareMillimeterValue = getRandomDouble();

		BigDecimal squareKilometerTestResult = BigDecimal.valueOf(squareKilometerValue).multiply(AREA_SCALES[SQUARE_KILOMETER - 7]).divide(AREA_SCALES[SQUARE_CENTIMETER - 7]);
		BigDecimal squareHectometerTestResult = BigDecimal.valueOf(squareHectometerValue).multiply(AREA_SCALES[SQUARE_HECTOMETER - 7]).divide(AREA_SCALES[SQUARE_CENTIMETER - 7]);
		BigDecimal squareDecameterTestResult = BigDecimal.valueOf(squareDecameterValue).multiply(AREA_SCALES[SQUARE_DECAMETER - 7]).divide(AREA_SCALES[SQUARE_CENTIMETER - 7]);
		BigDecimal squareMeterTestResult = BigDecimal.valueOf(squareMeterValue).multiply(AREA_SCALES[SQUARE_METER - 7]).divide(AREA_SCALES[SQUARE_CENTIMETER - 7]);
		BigDecimal squareDecimeterTestResult = BigDecimal.valueOf(squareDecimeterValue).multiply(AREA_SCALES[SQUARE_DECIMETER - 7]).divide(AREA_SCALES[SQUARE_CENTIMETER - 7]);
        BigDecimal squareCentimeterTestResult = BigDecimal.valueOf(squareCentimeterValue).multiply(AREA_SCALES[SQUARE_CENTIMETER - 7]).divide(AREA_SCALES[SQUARE_CENTIMETER - 7]);
		BigDecimal squareMillimeterTestResult = BigDecimal.valueOf(squareMillimeterValue).multiply(AREA_SCALES[SQUARE_MILLIMETER - 7]).divide(AREA_SCALES[SQUARE_CENTIMETER - 7]);

		BigDecimal squareKilometerResult = area.toSquareCentimeter(squareKilometerValue, SQUARE_KILOMETER);
		BigDecimal squareHectometerResult = area.toSquareCentimeter(squareHectometerValue, SQUARE_HECTOMETER);
		BigDecimal squareDecameterResult = area.toSquareCentimeter(squareDecameterValue, SQUARE_DECAMETER);
		BigDecimal squareMeterResult = area.toSquareCentimeter(squareMeterValue, SQUARE_METER);
	    BigDecimal squareDecimeterResult = area.toSquareCentimeter(squareDecimeterValue, SQUARE_DECIMETER);
		BigDecimal squareCentimeterResult = area.toSquareCentimeter(squareCentimeterValue, SQUARE_CENTIMETER);
		BigDecimal squareMillimeterResult = area.toSquareCentimeter(squareMillimeterValue, SQUARE_MILLIMETER);
		
		assertEquals(squareKilometerTestResult, squareKilometerResult);
		assertEquals(squareHectometerTestResult, squareHectometerResult);
		assertEquals(squareDecameterTestResult, squareDecameterResult);
		assertEquals(squareMeterTestResult, squareMeterResult);
		assertEquals(squareDecimeterTestResult, squareDecimeterResult);
		assertEquals(squareCentimeterTestResult, squareCentimeterResult);
		assertEquals(squareMillimeterTestResult, squareMillimeterResult);
	}

	@Test 
	public void toSquareMillimeterTest ()
	{
		double squareKilometerValue = getRandomDouble();
		double squareHectometerValue = getRandomDouble();
		double squareDecameterValue = getRandomDouble();
		double squareMeterValue = getRandomDouble();
		double squareDecimeterValue = getRandomDouble();
		double squareCentimeterValue = getRandomDouble();
		double squareMillimeterValue = getRandomDouble();

		BigDecimal squareKilometerTestResult = BigDecimal.valueOf(squareKilometerValue).multiply(AREA_SCALES[SQUARE_KILOMETER - 7]).divide(AREA_SCALES[SQUARE_MILLIMETER - 7]);
		BigDecimal squareHectometerTestResult = BigDecimal.valueOf(squareHectometerValue).multiply(AREA_SCALES[SQUARE_HECTOMETER - 7]).divide(AREA_SCALES[SQUARE_MILLIMETER - 7]);
		BigDecimal squareDecameterTestResult = BigDecimal.valueOf(squareDecameterValue).multiply(AREA_SCALES[SQUARE_DECAMETER - 7]).divide(AREA_SCALES[SQUARE_MILLIMETER - 7]);
		BigDecimal squareMeterTestResult = BigDecimal.valueOf(squareMeterValue).multiply(AREA_SCALES[SQUARE_METER - 7]).divide(AREA_SCALES[SQUARE_MILLIMETER - 7]);
		BigDecimal squareDecimeterTestResult = BigDecimal.valueOf(squareDecimeterValue).multiply(AREA_SCALES[SQUARE_DECIMETER - 7]).divide(AREA_SCALES[SQUARE_MILLIMETER - 7]);
        BigDecimal squareCentimeterTestResult = BigDecimal.valueOf(squareCentimeterValue).multiply(AREA_SCALES[SQUARE_CENTIMETER - 7]).divide(AREA_SCALES[SQUARE_MILLIMETER - 7]);
		BigDecimal squareMillimeterTestResult = BigDecimal.valueOf(squareMillimeterValue).multiply(AREA_SCALES[SQUARE_MILLIMETER - 7]).divide(AREA_SCALES[SQUARE_MILLIMETER - 7]);

		BigDecimal squareKilometerResult = area.toSquareMillimeter(squareKilometerValue, SQUARE_KILOMETER);
		BigDecimal squareHectometerResult = area.toSquareMillimeter(squareHectometerValue, SQUARE_HECTOMETER);
		BigDecimal squareDecameterResult = area.toSquareMillimeter(squareDecameterValue, SQUARE_DECAMETER);
		BigDecimal squareMeterResult = area.toSquareMillimeter(squareMeterValue, SQUARE_METER);
	    BigDecimal squareDecimeterResult = area.toSquareMillimeter(squareDecimeterValue, SQUARE_DECIMETER);
		BigDecimal squareCentimeterResult = area.toSquareMillimeter(squareCentimeterValue, SQUARE_CENTIMETER);
		BigDecimal squareMillimeterResult = area.toSquareMillimeter(squareMillimeterValue, SQUARE_MILLIMETER);
		
		assertEquals(squareKilometerTestResult, squareKilometerResult);
		assertEquals(squareHectometerTestResult, squareHectometerResult);
		assertEquals(squareDecameterTestResult, squareDecameterResult);
		assertEquals(squareMeterTestResult, squareMeterResult);
		assertEquals(squareDecimeterTestResult, squareDecimeterResult);
		assertEquals(squareCentimeterTestResult, squareCentimeterResult);
		assertEquals(squareMillimeterTestResult, squareMillimeterResult);
	}

	private double getRandomDouble ()
	{
		return random.nextDouble() * 100;
	}
}
