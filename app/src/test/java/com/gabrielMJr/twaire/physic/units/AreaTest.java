package com.gabrielMJr.twaire.physic.units;

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

public class AreaTest
{
	private final Area area;
	private final NumberFormat formatter;
	private final Random random;

	public AreaTest()
	{
		area = Area.getInstance();
		random = new Random();
		formatter = new DecimalFormat("#0.00");
	}
	
	@Test 
	public void toSquareKilometerTest()
	{
		double squareKilometerValue = Double.valueOf(formatter.format(random.nextDouble() * 10));
		double squareHectometerValue = Double.valueOf(formatter.format(random.nextDouble() * 10));
		double squareDecameterValue = Double.valueOf(formatter.format(random.nextDouble() * 10));
		double squareMeterValue = Double.valueOf(formatter.format(random.nextDouble() * 10));
		double squareDecimeterValue = Double.valueOf(formatter.format(random.nextDouble() * 10));
		double squareCentimeterValue = Double.valueOf(formatter.format(random.nextDouble() * 10));
		double squareMillimeterValue = Double.valueOf(formatter.format(random.nextDouble() * 10));

		double squareKilometerResult = Double.valueOf(formatter.format(squareKilometerValue / 1));
		double squareHectometerResult = Double.valueOf(formatter.format(squareHectometerValue / 1E2));
		double squareDecameterResult = Double.valueOf(formatter.format(squareDecameterValue / 1E4));
		double squareMeterResult = Double.valueOf(formatter.format(squareMeterValue / 1E6));
		double squareDecimeterResult = Double.valueOf(formatter.format(squareDecimeterValue / 1E8));
		double squareCentimeterResult = Double.valueOf(formatter.format(squareCentimeterValue / 1E10));
		double squareMillimeterResult = Double.valueOf(formatter.format(squareMillimeterValue / 1E12));
		
		assertEquals(squareKilometerResult, area.toSquareKilometer(squareKilometerValue, SQUARE_KILOMETER));
		assertEquals(squareHectometerResult, area.toSquareKilometer(squareHectometerValue, SQUARE_HECTOMETER));
		assertEquals(squareDecameterResult, area.toSquareKilometer(squareDecameterValue, SQUARE_DECAMETER));
		assertEquals(squareMeterResult, area.toSquareKilometer(squareMeterValue, SQUARE_METER));
		assertEquals(squareDecimeterResult, area.toSquareKilometer(squareDecimeterValue, SQUARE_DECIMETER));
		assertEquals(squareCentimeterResult, area.toSquareKilometer(squareCentimeterValue, SQUARE_CENTIMETER));
		assertEquals(squareMillimeterResult, area.toSquareKilometer(squareMillimeterValue, SQUARE_MILLIMETER));
	}

	@Test 
	public void toSquareHectometerTest()
	{
		double squareKilometerValue = random.nextDouble() * 100;
		double squareHectometerValue = random.nextDouble() * 100;
		double squareDecameterValue = random.nextDouble() * 100;
		double squareMeterValue = random.nextDouble() * 100;
		double squareDecimeterValue = random.nextDouble() * 100;
		double squareCentimeterValue = random.nextDouble() * 100;
		double squareMillimeterValue = random.nextDouble() * 100;

		double squareKilometerResult = squareKilometerValue / 1E-2;
		double squareHectometerResult = squareHectometerValue / 1;
		double squareDecameterResult = squareDecameterValue / 1E2;
		double squareMeterResult = squareMeterValue / 1E4;
		double squareDecimeterResult = squareDecimeterValue / 1E6;
		double squareCentimeterResult = squareCentimeterValue / 1E8;
		double squareMillimeterResult = squareMillimeterValue / 1E10;

		assertEquals(squareKilometerResult, area.toSquareHectometer(squareKilometerValue, SQUARE_KILOMETER));
		assertEquals(squareHectometerResult, area.toSquareHectometer(squareHectometerValue, SQUARE_HECTOMETER));
		assertEquals(squareDecameterResult, area.toSquareHectometer(squareDecameterValue, SQUARE_DECAMETER));
		assertEquals(squareMeterResult, area.toSquareHectometer(squareMeterValue, SQUARE_METER));
		assertEquals(squareDecimeterResult, area.toSquareHectometer(squareDecimeterValue, SQUARE_DECIMETER));
		assertEquals(squareCentimeterResult, area.toSquareHectometer(squareCentimeterValue, SQUARE_CENTIMETER));
		assertEquals(squareMillimeterResult, area.toSquareHectometer(squareMillimeterValue, SQUARE_MILLIMETER));
	}

	@Test 
	public void toSquareDecameterTest()
	{
		double squareKilometerValue = random.nextDouble() * 100;
		double squareHectometerValue = random.nextDouble() * 100;
		double squareDecameterValue = random.nextDouble() * 100;
		double squareMeterValue = random.nextDouble() * 100;
		double squareDecimeterValue = random.nextDouble() * 100;
		double squareCentimeterValue = random.nextDouble() * 100;
		double squareMillimeterValue = random.nextDouble() * 100;

		double squareKilometerResult = squareKilometerValue / 1E-4;
		double squareHectometerResult = squareHectometerValue / 1E-2;
		double squareDecameterResult = squareDecameterValue / 1;
		double squareMeterResult = squareMeterValue / 1E2;
		double squareDecimeterResult = squareDecimeterValue / 1E4;
		double squareCentimeterResult = squareCentimeterValue / 1E6;
		double squareMillimeterResult = squareMillimeterValue / 1E8;

		assertEquals(squareKilometerResult, area.toSquareDecameter(squareKilometerValue, SQUARE_KILOMETER));
		assertEquals(squareHectometerResult, area.toSquareDecameter(squareHectometerValue, SQUARE_HECTOMETER));
		assertEquals(squareDecameterResult, area.toSquareDecameter(squareDecameterValue, SQUARE_DECAMETER));
		assertEquals(squareMeterResult, area.toSquareDecameter(squareMeterValue, SQUARE_METER));
		assertEquals(squareDecimeterResult, area.toSquareDecameter(squareDecimeterValue, SQUARE_DECIMETER));
		assertEquals(squareCentimeterResult, area.toSquareDecameter(squareCentimeterValue, SQUARE_CENTIMETER));
		assertEquals(squareMillimeterResult, area.toSquareDecameter(squareMillimeterValue, SQUARE_MILLIMETER));
	}

	@Test 
	public void toSquareMeterTest()
	{
		double squareKilometerValue = random.nextDouble() * 100;
		double squareHectometerValue = random.nextDouble() * 100;
		double squareDecameterValue = random.nextDouble() * 100;
		double squareMeterValue = random.nextDouble() * 100;
		double squareDecimeterValue = random.nextDouble() * 100;
		double squareCentimeterValue = random.nextDouble() * 100;
		double squareMillimeterValue = random.nextDouble() * 100;

		double squareKilometerResult = squareKilometerValue / 1E-6;
		double squareHectometerResult = squareHectometerValue / 1E-4;
		double squareDecameterResult = squareDecameterValue / 1E-2;
		double squareMeterResult = squareMeterValue / 1;
		double squareDecimeterResult = squareDecimeterValue / 1E2;
		double squareCentimeterResult = squareCentimeterValue / 1E4;
		double squareMillimeterResult = squareMillimeterValue / 1E6;
		

		assertEquals(squareKilometerResult, area.toSquareMeter(squareKilometerValue, SQUARE_KILOMETER));
		assertEquals(squareHectometerResult, area.toSquareMeter(squareHectometerValue, SQUARE_HECTOMETER));
		assertEquals(squareDecameterResult, area.toSquareMeter(squareDecameterValue, SQUARE_DECAMETER));
		assertEquals(squareMeterResult, area.toSquareMeter(squareMeterValue, SQUARE_METER));
		assertEquals(squareDecimeterResult, area.toSquareMeter(squareDecimeterValue, SQUARE_DECIMETER));
		assertEquals(squareCentimeterResult, area.toSquareMeter(squareCentimeterValue, SQUARE_CENTIMETER));
		assertEquals(squareMillimeterResult, area.toSquareMeter(squareMillimeterValue, SQUARE_MILLIMETER));
	}

	@Test 
	public void toSquareDecimeterTest()
	{
		double squareKilometerValue = random.nextDouble() * 100;
		double squareHectometerValue = random.nextDouble() * 100;
		double squareDecameterValue = random.nextDouble() * 100;
		double squareMeterValue = random.nextDouble() * 100;
		double squareDecimeterValue = random.nextDouble() * 100;
		double squareCentimeterValue = random.nextDouble() * 100;
		double squareMillimeterValue = random.nextDouble() * 100;
		
		double squareKilometerResult = squareKilometerValue / 1E-8;
		double squareHectometerResult = squareHectometerValue / 1E-6;
		double squareDecameterResult = squareDecameterValue / 1E-4;
		double squareMeterResult = squareMeterValue / 1E-2;
		double squareDecimeterResult = squareDecimeterValue / 1;
		double squareCentimeterResult = squareCentimeterValue / 1E2;
		double squareMillimeterResult = squareMillimeterValue / 1E4;
		

		assertEquals(squareKilometerResult, area.toSquareDecimeter(squareKilometerValue, SQUARE_KILOMETER));
		assertEquals(squareHectometerResult, area.toSquareDecimeter(squareHectometerValue, SQUARE_HECTOMETER));
		assertEquals(squareDecameterResult, area.toSquareDecimeter(squareDecameterValue, SQUARE_DECAMETER));
		assertEquals(squareMeterResult, area.toSquareDecimeter(squareMeterValue, SQUARE_METER));
		assertEquals(squareDecimeterResult, area.toSquareDecimeter(squareDecimeterValue, SQUARE_DECIMETER));
		assertEquals(squareCentimeterResult, area.toSquareDecimeter(squareCentimeterValue, SQUARE_CENTIMETER));
		assertEquals(squareMillimeterResult, area.toSquareDecimeter(squareMillimeterValue, SQUARE_MILLIMETER));
	}

	@Test 
	public void toSquareCentimeterTest()
	{
		double squareKilometerValue = random.nextDouble() * 100;
		double squareHectometerValue = random.nextDouble() * 100;
		double squareDecameterValue = random.nextDouble() * 100;
		double squareMeterValue = random.nextDouble() * 100;
		double squareDecimeterValue = random.nextDouble() * 100;
		double squareCentimeterValue = random.nextDouble() * 100;
		double squareMillimeterValue = random.nextDouble() * 100;

		double squareKilometerResult = squareKilometerValue / 0.0000000001;
		double squareHectometerResult = squareHectometerValue / 0.00000001;
		double squareDecameterResult = squareDecameterValue / 0.000001;
		double squareMeterResult = squareMeterValue / 0.0001;
		double squareDecimeterResult = squareDecimeterValue / 0.01;
		double squareCentimeterResult = squareCentimeterValue / 1.0;
		double squareMillimeterResult = squareMillimeterValue / 100.0;
		
		assertEquals(squareKilometerResult, area.toSquareCentimeter(squareKilometerValue, SQUARE_KILOMETER));
		assertEquals(squareHectometerResult, area.toSquareCentimeter(squareHectometerValue, SQUARE_HECTOMETER));
		assertEquals(squareDecameterResult, area.toSquareCentimeter(squareDecameterValue, SQUARE_DECAMETER));
		assertEquals(squareMeterResult, area.toSquareCentimeter(squareMeterValue, SQUARE_METER));
		assertEquals(squareDecimeterResult, area.toSquareCentimeter(squareDecimeterValue, SQUARE_DECIMETER));
		assertEquals(squareCentimeterResult, area.toSquareCentimeter(squareCentimeterValue, SQUARE_CENTIMETER));
		assertEquals(squareMillimeterResult, area.toSquareCentimeter(squareMillimeterValue, SQUARE_MILLIMETER));
	}

	@Test 
	public void toSquareMillimeterTest()
	{
		double squareKilometerValue = random.nextDouble() * 100;
		double squareHectometerValue = random.nextDouble() * 100;
		double squareDecameterValue = random.nextDouble() * 100;
		double squareMeterValue = random.nextDouble() * 100;
		double squareDecimeterValue = random.nextDouble() * 100;
		double squareCentimeterValue = random.nextDouble() * 100;
		double squareMillimeterValue = random.nextDouble() * 100;

		double squareKilometerResult = squareKilometerValue / 1E-12;
		double squareHectometerResult = squareHectometerValue / 1E-10;
		double squareDecameterResult = squareDecameterValue / 1E-8;
		double squareMeterResult = squareMeterValue / 1E-6;
		double squareDecimeterResult = squareDecimeterValue / 1E-4;
		double squareCentimeterResult = squareCentimeterValue / 1E-1;
		double squareMillimeterResult = squareMillimeterValue / 1;

		assertEquals(squareKilometerResult, area.toSquareMillimeter(squareKilometerValue, SQUARE_KILOMETER));
		assertEquals(squareHectometerResult, area.toSquareMillimeter(squareHectometerValue, SQUARE_HECTOMETER));
		assertEquals(squareDecameterResult, area.toSquareMillimeter(squareDecameterValue, SQUARE_DECAMETER));
		assertEquals(squareMeterResult, area.toSquareMillimeter(squareMeterValue, SQUARE_METER));
		assertEquals(squareDecimeterResult, area.toSquareMillimeter(squareDecimeterValue, SQUARE_DECIMETER));
		assertEquals(squareCentimeterResult, area.toSquareMillimeter(squareCentimeterValue, SQUARE_CENTIMETER));
		assertEquals(squareMillimeterResult, area.toSquareMillimeter(squareMillimeterValue, SQUARE_MILLIMETER));
	}
}
