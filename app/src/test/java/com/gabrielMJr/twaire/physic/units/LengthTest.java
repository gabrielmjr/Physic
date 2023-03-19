package com.gabrielMJr.twaire.physic.units;

import java.math.BigDecimal;
import java.util.Random;
import org.junit.jupiter.api.Test;

import static com.gabrielMJr.twaire.physic.units.Length.LENGTH_SCALES;

import static com.gabrielMJr.twaire.physic.units.Length.KILOMETER;
import static com.gabrielMJr.twaire.physic.units.Length.HECTOMETER;
import static com.gabrielMJr.twaire.physic.units.Length.DECAMETER;
import static com.gabrielMJr.twaire.physic.units.Length.METER;
import static com.gabrielMJr.twaire.physic.units.Length.DECIMETER;
import static com.gabrielMJr.twaire.physic.units.Length.CENTIMETER;
import static com.gabrielMJr.twaire.physic.units.Length.MILLIMETER;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LengthTest
{
	private final Length length;
	private final Random random;

	public LengthTest ()
	{
		length = Length.getInstance();
		random = new Random();
	}

	@Test 
	public void toKilometerTest ()
	{
		double kilometerValue = getRandomDouble();
		double hectometerValue = getRandomDouble();
		double decameterValue = getRandomDouble();
		double meterValue = getRandomDouble();
		double decimeterValue = getRandomDouble();
		double centimeterValue = getRandomDouble();
	    double millimeterValue = getRandomDouble();

		BigDecimal kilometerTestResult = BigDecimal.valueOf(kilometerValue).multiply(LENGTH_SCALES[KILOMETER]).divide(LENGTH_SCALES[KILOMETER]);
		BigDecimal hectometerTestResult = BigDecimal.valueOf(hectometerValue).multiply(LENGTH_SCALES[HECTOMETER]).divide(LENGTH_SCALES[KILOMETER]);
		BigDecimal decameterTestResult = BigDecimal.valueOf(decameterValue).multiply(LENGTH_SCALES[DECAMETER]).divide(LENGTH_SCALES[KILOMETER]);
		BigDecimal meterTestResult = BigDecimal.valueOf(meterValue).multiply(LENGTH_SCALES[METER]).divide(LENGTH_SCALES[KILOMETER]);
		BigDecimal decimeterTestResult = BigDecimal.valueOf(decimeterValue).multiply(LENGTH_SCALES[DECIMETER]).divide(LENGTH_SCALES[KILOMETER]);
        BigDecimal centimeterTestResult = BigDecimal.valueOf(centimeterValue).multiply(LENGTH_SCALES[CENTIMETER]).divide(LENGTH_SCALES[KILOMETER]);
		BigDecimal millimeterTestResult = BigDecimal.valueOf(millimeterValue).multiply(LENGTH_SCALES[MILLIMETER]).divide(LENGTH_SCALES[KILOMETER]);

		BigDecimal squareKilometerResult = length.toKilometer(kilometerValue, KILOMETER);
		BigDecimal squareHectometerResult = length.toKilometer(hectometerValue, HECTOMETER);
		BigDecimal squareDecameterResult = length.toKilometer(decameterValue, DECAMETER);
		BigDecimal squareMeterResult = length.toKilometer(meterValue, METER);
	    BigDecimal squareDecimeterResult = length.toKilometer(decimeterValue, DECIMETER);
		BigDecimal squareCentimeterResult = length.toKilometer(centimeterValue, CENTIMETER);
		BigDecimal squareMillimeterResult = length.toKilometer(millimeterValue, MILLIMETER);

		assertEquals(kilometerTestResult, squareKilometerResult);
		assertEquals(hectometerTestResult, squareHectometerResult);
		assertEquals(decameterTestResult, squareDecameterResult);
		assertEquals(meterTestResult, squareMeterResult);
		assertEquals(decimeterTestResult, squareDecimeterResult);
		assertEquals(centimeterTestResult, squareCentimeterResult);
		assertEquals(millimeterTestResult, squareMillimeterResult);
	}

	@Test 
	public void toHectometerTest ()
	{
		double kilometerValue = getRandomDouble();
		double hectometerValue = getRandomDouble();
		double decameterValue = getRandomDouble();
		double meterValue = getRandomDouble();
		double decimeterValue = getRandomDouble();
		double centimeterValue = getRandomDouble();
		double millimeterValue = getRandomDouble();

		BigDecimal kilometerTestResult = BigDecimal.valueOf(kilometerValue).multiply(LENGTH_SCALES[KILOMETER]).divide(LENGTH_SCALES[HECTOMETER]);
		BigDecimal hectometerTestResult = BigDecimal.valueOf(hectometerValue).multiply(LENGTH_SCALES[HECTOMETER]).divide(LENGTH_SCALES[HECTOMETER]);
		BigDecimal decameterTestResult = BigDecimal.valueOf(decameterValue).multiply(LENGTH_SCALES[DECAMETER]).divide(LENGTH_SCALES[HECTOMETER]);
		BigDecimal meterTestResult = BigDecimal.valueOf(meterValue).multiply(LENGTH_SCALES[METER]).divide(LENGTH_SCALES[HECTOMETER]);
		BigDecimal decimeterTestResult = BigDecimal.valueOf(decimeterValue).multiply(LENGTH_SCALES[DECIMETER]).divide(LENGTH_SCALES[HECTOMETER]);
        BigDecimal centimeterTestResult = BigDecimal.valueOf(centimeterValue).multiply(LENGTH_SCALES[CENTIMETER]).divide(LENGTH_SCALES[HECTOMETER]);
		BigDecimal millimeterTestResult = BigDecimal.valueOf(millimeterValue).multiply(LENGTH_SCALES[MILLIMETER]).divide(LENGTH_SCALES[HECTOMETER]);

		BigDecimal squareKilometerResult = length.toHectometer(kilometerValue, KILOMETER);
		BigDecimal squareHectometerResult = length.toHectometer(hectometerValue, HECTOMETER);
		BigDecimal squareDecameterResult = length.toHectometer(decameterValue, DECAMETER);
		BigDecimal squareMeterResult = length.toHectometer(meterValue, METER);
	    BigDecimal squareDecimeterResult = length.toHectometer(decimeterValue, DECIMETER);
		BigDecimal squareCentimeterResult = length.toHectometer(centimeterValue, CENTIMETER);
		BigDecimal squareMillimeterResult = length.toHectometer(millimeterValue, MILLIMETER);

		assertEquals(kilometerTestResult, squareKilometerResult);
		assertEquals(hectometerTestResult, squareHectometerResult);
		assertEquals(decameterTestResult, squareDecameterResult);
		assertEquals(meterTestResult, squareMeterResult);
		assertEquals(decimeterTestResult, squareDecimeterResult);
		assertEquals(centimeterTestResult, squareCentimeterResult);
		assertEquals(millimeterTestResult, squareMillimeterResult);
	}

	@Test 
	public void toDecameterTest ()
	{
		double kilometerValue = getRandomDouble();
		double hectometerValue = getRandomDouble();
		double decameterValue = getRandomDouble();
		double meterValue = getRandomDouble();
		double decimeterValue = getRandomDouble();
		double centimeterValue = getRandomDouble();
		double millimeterValue = getRandomDouble();

		BigDecimal kilometerTestResult = BigDecimal.valueOf(kilometerValue).multiply(LENGTH_SCALES[KILOMETER]).divide(LENGTH_SCALES[DECAMETER]);
		BigDecimal hectometerTestResult = BigDecimal.valueOf(hectometerValue).multiply(LENGTH_SCALES[HECTOMETER]).divide(LENGTH_SCALES[DECAMETER]);
		BigDecimal decameterTestResult = BigDecimal.valueOf(decameterValue).multiply(LENGTH_SCALES[DECAMETER]).divide(LENGTH_SCALES[DECAMETER]);
		BigDecimal meterTestResult = BigDecimal.valueOf(meterValue).multiply(LENGTH_SCALES[METER]).divide(LENGTH_SCALES[DECAMETER]);
		BigDecimal decimeterTestResult = BigDecimal.valueOf(decimeterValue).multiply(LENGTH_SCALES[DECIMETER]).divide(LENGTH_SCALES[DECAMETER]);
        BigDecimal centimeterTestResult = BigDecimal.valueOf(centimeterValue).multiply(LENGTH_SCALES[CENTIMETER]).divide(LENGTH_SCALES[DECAMETER]);
		BigDecimal millimeterTestResult = BigDecimal.valueOf(millimeterValue).multiply(LENGTH_SCALES[MILLIMETER]).divide(LENGTH_SCALES[DECAMETER]);

		BigDecimal squareKilometerResult = length.toDecameter(kilometerValue, KILOMETER);
		BigDecimal squareHectometerResult = length.toDecameter(hectometerValue, HECTOMETER);
		BigDecimal squareDecameterResult = length.toDecameter(decameterValue, DECAMETER);
		BigDecimal squareMeterResult = length.toDecameter(meterValue, METER);
	    BigDecimal squareDecimeterResult = length.toDecameter(decimeterValue, DECIMETER);
		BigDecimal squareCentimeterResult = length.toDecameter(centimeterValue, CENTIMETER);
		BigDecimal squareMillimeterResult = length.toDecameter(millimeterValue, MILLIMETER);

		assertEquals(kilometerTestResult, squareKilometerResult);
		assertEquals(hectometerTestResult, squareHectometerResult);
		assertEquals(decameterTestResult, squareDecameterResult);
		assertEquals(meterTestResult, squareMeterResult);
		assertEquals(decimeterTestResult, squareDecimeterResult);
		assertEquals(centimeterTestResult, squareCentimeterResult);
		assertEquals(millimeterTestResult, squareMillimeterResult);
	}

	@Test 
	public void toMeterTest ()
	{
		double kilometerValue = getRandomDouble();
		double hectometerValue = getRandomDouble();
		double decameterValue = getRandomDouble();
		double meterValue = getRandomDouble();
		double decimeterValue = getRandomDouble();
		double centimeterValue = getRandomDouble();
		double millimeterValue = getRandomDouble();

		BigDecimal kilometerTestResult = BigDecimal.valueOf(kilometerValue).multiply(LENGTH_SCALES[KILOMETER]).divide(LENGTH_SCALES[METER]);
		BigDecimal hectometerTestResult = BigDecimal.valueOf(hectometerValue).multiply(LENGTH_SCALES[HECTOMETER]).divide(LENGTH_SCALES[METER]);
		BigDecimal decameterTestResult = BigDecimal.valueOf(decameterValue).multiply(LENGTH_SCALES[DECAMETER]).divide(LENGTH_SCALES[METER]);
		BigDecimal meterTestResult = BigDecimal.valueOf(meterValue).multiply(LENGTH_SCALES[METER]).divide(LENGTH_SCALES[METER]);
		BigDecimal decimeterTestResult = BigDecimal.valueOf(decimeterValue).multiply(LENGTH_SCALES[DECIMETER]).divide(LENGTH_SCALES[METER]);
        BigDecimal centimeterTestResult = BigDecimal.valueOf(centimeterValue).multiply(LENGTH_SCALES[CENTIMETER]).divide(LENGTH_SCALES[METER]);
		BigDecimal millimeterTestResult = BigDecimal.valueOf(millimeterValue).multiply(LENGTH_SCALES[MILLIMETER]).divide(LENGTH_SCALES[METER]);

		BigDecimal squareKilometerResult = length.toMeter(kilometerValue, KILOMETER);
		BigDecimal squareHectometerResult = length.toMeter(hectometerValue, HECTOMETER);
		BigDecimal squareDecameterResult = length.toMeter(decameterValue, DECAMETER);
		BigDecimal squareMeterResult = length.toMeter(meterValue, METER);
	    BigDecimal squareDecimeterResult = length.toMeter(decimeterValue, DECIMETER);
		BigDecimal squareCentimeterResult = length.toMeter(centimeterValue, CENTIMETER);
		BigDecimal squareMillimeterResult = length.toMeter(millimeterValue, MILLIMETER);

		assertEquals(kilometerTestResult, squareKilometerResult);
		assertEquals(hectometerTestResult, squareHectometerResult);
		assertEquals(decameterTestResult, squareDecameterResult);
		assertEquals(meterTestResult, squareMeterResult);
		assertEquals(decimeterTestResult, squareDecimeterResult);
		assertEquals(centimeterTestResult, squareCentimeterResult);
		assertEquals(millimeterTestResult, squareMillimeterResult);
	}

	@Test 
	public void toDecimeterTest ()
	{
		double kilometerValue = getRandomDouble();
		double hectometerValue = getRandomDouble();
		double decameterValue = getRandomDouble();
		double meterValue = getRandomDouble();
		double decimeterValue = getRandomDouble();
		double centimeterValue = getRandomDouble();
		double millimeterValue = getRandomDouble();

		BigDecimal kilometerTestResult = BigDecimal.valueOf(kilometerValue).multiply(LENGTH_SCALES[KILOMETER]).divide(LENGTH_SCALES[DECIMETER]);
		BigDecimal hectometerTestResult = BigDecimal.valueOf(hectometerValue).multiply(LENGTH_SCALES[HECTOMETER]).divide(LENGTH_SCALES[DECIMETER]);
		BigDecimal decameterTestResult = BigDecimal.valueOf(decameterValue).multiply(LENGTH_SCALES[DECAMETER]).divide(LENGTH_SCALES[DECIMETER]);
		BigDecimal meterTestResult = BigDecimal.valueOf(meterValue).multiply(LENGTH_SCALES[METER]).divide(LENGTH_SCALES[DECIMETER]);
		BigDecimal decimeterTestResult = BigDecimal.valueOf(decimeterValue).multiply(LENGTH_SCALES[DECIMETER]).divide(LENGTH_SCALES[DECIMETER]);
        BigDecimal centimeterTestResult = BigDecimal.valueOf(centimeterValue).multiply(LENGTH_SCALES[CENTIMETER]).divide(LENGTH_SCALES[DECIMETER]);
		BigDecimal millimeterTestResult = BigDecimal.valueOf(millimeterValue).multiply(LENGTH_SCALES[MILLIMETER]).divide(LENGTH_SCALES[DECIMETER]);

		BigDecimal squareKilometerResult = length.toDecimeter(kilometerValue, KILOMETER);
		BigDecimal squareHectometerResult = length.toDecimeter(hectometerValue, HECTOMETER);
		BigDecimal squareDecameterResult = length.toDecimeter(decameterValue, DECAMETER);
		BigDecimal squareMeterResult = length.toDecimeter(meterValue, METER);
	    BigDecimal squareDecimeterResult = length.toDecimeter(decimeterValue, DECIMETER);
		BigDecimal squareCentimeterResult = length.toDecimeter(centimeterValue, CENTIMETER);
		BigDecimal squareMillimeterResult = length.toDecimeter(millimeterValue, MILLIMETER);

		assertEquals(kilometerTestResult, squareKilometerResult);
		assertEquals(hectometerTestResult, squareHectometerResult);
		assertEquals(decameterTestResult, squareDecameterResult);
		assertEquals(meterTestResult, squareMeterResult);
		assertEquals(decimeterTestResult, squareDecimeterResult);
		assertEquals(centimeterTestResult, squareCentimeterResult);
		assertEquals(millimeterTestResult, squareMillimeterResult);
	}

	@Test 
	public void toCentimeterTest ()
	{
		double kilometerValue = getRandomDouble();
		double hectometerValue = getRandomDouble();
		double decameterValue = getRandomDouble();
		double meterValue = getRandomDouble();
		double decimeterValue = getRandomDouble();
		double centimeterValue = getRandomDouble();
		double millimeterValue = getRandomDouble();

		BigDecimal kilometerTestResult = BigDecimal.valueOf(kilometerValue).multiply(LENGTH_SCALES[KILOMETER]).divide(LENGTH_SCALES[CENTIMETER]);
		BigDecimal hectometerTestResult = BigDecimal.valueOf(hectometerValue).multiply(LENGTH_SCALES[HECTOMETER]).divide(LENGTH_SCALES[CENTIMETER]);
		BigDecimal decameterTestResult = BigDecimal.valueOf(decameterValue).multiply(LENGTH_SCALES[DECAMETER]).divide(LENGTH_SCALES[CENTIMETER]);
		BigDecimal meterTestResult = BigDecimal.valueOf(meterValue).multiply(LENGTH_SCALES[METER]).divide(LENGTH_SCALES[CENTIMETER]);
		BigDecimal decimeterTestResult = BigDecimal.valueOf(decimeterValue).multiply(LENGTH_SCALES[DECIMETER]).divide(LENGTH_SCALES[CENTIMETER]);
        BigDecimal centimeterTestResult = BigDecimal.valueOf(centimeterValue).multiply(LENGTH_SCALES[CENTIMETER]).divide(LENGTH_SCALES[CENTIMETER]);
		BigDecimal millimeterTestResult = BigDecimal.valueOf(millimeterValue).multiply(LENGTH_SCALES[MILLIMETER]).divide(LENGTH_SCALES[CENTIMETER]);

		BigDecimal squareKilometerResult = length.toCentimeter(kilometerValue, KILOMETER);
		BigDecimal squareHectometerResult = length.toCentimeter(hectometerValue, HECTOMETER);
		BigDecimal squareDecameterResult = length.toCentimeter(decameterValue, DECAMETER);
		BigDecimal squareMeterResult = length.toCentimeter(meterValue, METER);
	    BigDecimal squareDecimeterResult = length.toCentimeter(decimeterValue, DECIMETER);
		BigDecimal squareCentimeterResult = length.toCentimeter(centimeterValue, CENTIMETER);
		BigDecimal squareMillimeterResult = length.toCentimeter(millimeterValue, MILLIMETER);

		assertEquals(kilometerTestResult, squareKilometerResult);
		assertEquals(hectometerTestResult, squareHectometerResult);
		assertEquals(decameterTestResult, squareDecameterResult);
		assertEquals(meterTestResult, squareMeterResult);
		assertEquals(decimeterTestResult, squareDecimeterResult);
		assertEquals(centimeterTestResult, squareCentimeterResult);
		assertEquals(millimeterTestResult, squareMillimeterResult);
	}

	@Test 
	public void toMillimeterTest ()
	{
		double kilometerValue = getRandomDouble();
		double hectometerValue = getRandomDouble();
		double decameterValue = getRandomDouble();
		double meterValue = getRandomDouble();
		double decimeterValue = getRandomDouble();
		double centimeterValue = getRandomDouble();
		double millimeterValue = getRandomDouble();

		BigDecimal kilometerTestResult = BigDecimal.valueOf(kilometerValue).multiply(LENGTH_SCALES[KILOMETER]).divide(LENGTH_SCALES[MILLIMETER]);
		BigDecimal hectometerTestResult = BigDecimal.valueOf(hectometerValue).multiply(LENGTH_SCALES[HECTOMETER]).divide(LENGTH_SCALES[MILLIMETER]);
		BigDecimal decameterTestResult = BigDecimal.valueOf(decameterValue).multiply(LENGTH_SCALES[DECAMETER]).divide(LENGTH_SCALES[MILLIMETER]);
		BigDecimal meterTestResult = BigDecimal.valueOf(meterValue).multiply(LENGTH_SCALES[METER]).divide(LENGTH_SCALES[MILLIMETER]);
		BigDecimal decimeterTestResult = BigDecimal.valueOf(decimeterValue).multiply(LENGTH_SCALES[DECIMETER]).divide(LENGTH_SCALES[MILLIMETER]);
        BigDecimal centimeterTestResult = BigDecimal.valueOf(centimeterValue).multiply(LENGTH_SCALES[CENTIMETER]).divide(LENGTH_SCALES[MILLIMETER]);
		BigDecimal millimeterTestResult = BigDecimal.valueOf(millimeterValue).multiply(LENGTH_SCALES[MILLIMETER]).divide(LENGTH_SCALES[MILLIMETER]);

		BigDecimal squareKilometerResult = length.toMillimeter(kilometerValue, KILOMETER);
		BigDecimal squareHectometerResult = length.toMillimeter(hectometerValue, HECTOMETER);
		BigDecimal squareDecameterResult = length.toMillimeter(decameterValue, DECAMETER);
		BigDecimal squareMeterResult = length.toMillimeter(meterValue, METER);
	    BigDecimal squareDecimeterResult = length.toMillimeter(decimeterValue, DECIMETER);
		BigDecimal squareCentimeterResult = length.toMillimeter(centimeterValue, CENTIMETER);
		BigDecimal squareMillimeterResult = length.toMillimeter(millimeterValue, MILLIMETER);

		assertEquals(kilometerTestResult, squareKilometerResult);
		assertEquals(hectometerTestResult, squareHectometerResult);
		assertEquals(decameterTestResult, squareDecameterResult);
		assertEquals(meterTestResult, squareMeterResult);
		assertEquals(decimeterTestResult, squareDecimeterResult);
		assertEquals(centimeterTestResult, squareCentimeterResult);
		assertEquals(millimeterTestResult, squareMillimeterResult);
	}

	private double getRandomDouble ()
	{
		return random.nextDouble() * 100;
	}
}
