package com.gabrielmjr.twaire.physic.units;

import java.math.BigDecimal;
import java.util.Random;
import org.junit.jupiter.api.Test;

import static com.gabrielmjr.twaire.physic.units.toKilometer;
import static com.gabrielmjr.twaire.physic.units.toHectometer;
import static com.gabrielmjr.twaire.physic.units.toDecameter;
import static com.gabrielmjr.twaire.physic.units.toMeter;
import static com.gabrielmjr.twaire.physic.units.toDecimeter;
import static com.gabrielmjr.twaire.physic.units.toCentimeter;
import static com.gabrielmjr.twaire.physic.units.Length.LENGTH_SCALES;
import static com.gabrielmjr.twaire.physic.units.Length.KILOMETER;
import static com.gabrielmjr.twaire.physic.units.Length.HECTOMETER;
import static com.gabrielmjr.twaire.physic.units.Length.DECAMETER;
import static com.gabrielmjr.twaire.physic.units.Length.METER;
import static com.gabrielmjr.twaire.physic.units.Length.DECIMETER;
import static com.gabrielmjr.twaire.physic.units.Length.CENTIMETER;
import static com.gabrielmjr.twaire.physic.units.Length.MILLIMETER;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LengthTest {
	private final Random random;

	public LengthTest() {
		random = new Random();
	}

	@Test 
	public void toKilometerTest() {
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

        try {
            BigDecimal squareKilometerResult = toKilometer(kilometerValue, KILOMETER);
            BigDecimal squareHectometerResult = toKilometer(hectometerValue, HECTOMETER);
            BigDecimal squareDecameterResult = toKilometer(decameterValue, DECAMETER);
            BigDecimal squareMeterResult = toKilometer(meterValue, METER);
            BigDecimal squareDecimeterResult = toKilometer(decimeterValue, DECIMETER);
            BigDecimal squareCentimeterResult = toKilometer(centimeterValue, CENTIMETER);
            BigDecimal squareMillimeterResult = toKilometer(millimeterValue, MILLIMETER);

            assertEquals(kilometerTestResult, squareKilometerResult);
            assertEquals(hectometerTestResult, squareHectometerResult);
            assertEquals(decameterTestResult, squareDecameterResult);
            assertEquals(meterTestResult, squareMeterResult);
            assertEquals(decimeterTestResult, squareDecimeterResult);
            assertEquals(centimeterTestResult, squareCentimeterResult);
            assertEquals(millimeterTestResult, squareMillimeterResult);
        } catch (InvalidUnitException e) {
            System.err.println(e.getMessage());
        }
	}

	@Test 
	public void toHectometerTest() {
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

        try {
            BigDecimal squareKilometerResult = toHectometer(kilometerValue, KILOMETER);
            BigDecimal squareHectometerResult = toHectometer(hectometerValue, HECTOMETER);
            BigDecimal squareDecameterResult = toHectometer(decameterValue, DECAMETER);
            BigDecimal squareMeterResult = toHectometer(meterValue, METER);
            BigDecimal squareDecimeterResult = toHectometer(decimeterValue, DECIMETER);
            BigDecimal squareCentimeterResult = toHectometer(centimeterValue, CENTIMETER);
            BigDecimal squareMillimeterResult = toHectometer(millimeterValue, MILLIMETER);

            assertEquals(kilometerTestResult, squareKilometerResult);
            assertEquals(hectometerTestResult, squareHectometerResult);
            assertEquals(decameterTestResult, squareDecameterResult);
            assertEquals(meterTestResult, squareMeterResult);
            assertEquals(decimeterTestResult, squareDecimeterResult);
            assertEquals(centimeterTestResult, squareCentimeterResult);
            assertEquals(millimeterTestResult, squareMillimeterResult);
        } catch (InvalidUnitException e) {
            System.err.println(e.getMessage());
        }
	}

	@Test 
	public void toDecameterTest() {
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

        try {
            BigDecimal squareKilometerResult = toDecameter(kilometerValue, KILOMETER);
            BigDecimal squareHectometerResult = toDecameter(hectometerValue, HECTOMETER);
            BigDecimal squareDecameterResult = toDecameter(decameterValue, DECAMETER);
            BigDecimal squareMeterResult = toDecameter(meterValue, METER);
            BigDecimal squareDecimeterResult = toDecameter(decimeterValue, DECIMETER);
            BigDecimal squareCentimeterResult = toDecameter(centimeterValue, CENTIMETER);
            BigDecimal squareMillimeterResult = toDecameter(millimeterValue, MILLIMETER);

            assertEquals(kilometerTestResult, squareKilometerResult);
            assertEquals(hectometerTestResult, squareHectometerResult);
            assertEquals(decameterTestResult, squareDecameterResult);
            assertEquals(meterTestResult, squareMeterResult);
            assertEquals(decimeterTestResult, squareDecimeterResult);
            assertEquals(centimeterTestResult, squareCentimeterResult);
            assertEquals(millimeterTestResult, squareMillimeterResult);
        } catch (InvalidUnitException e) {
            System.err.println(e.getMessage());
        }
	}

	@Test 
	public void toMeterTest() {
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

        try {
            BigDecimal squareKilometerResult = toMeter(kilometerValue, KILOMETER);
            BigDecimal squareHectometerResult = toMeter(hectometerValue, HECTOMETER);
            BigDecimal squareDecameterResult = toMeter(decameterValue, DECAMETER);
            BigDecimal squareMeterResult = toMeter(meterValue, METER);
            BigDecimal squareDecimeterResult = toMeter(decimeterValue, DECIMETER);
            BigDecimal squareCentimeterResult = toMeter(centimeterValue, CENTIMETER);
            BigDecimal squareMillimeterResult = toMeter(millimeterValue, MILLIMETER);

            assertEquals(kilometerTestResult, squareKilometerResult);
            assertEquals(hectometerTestResult, squareHectometerResult);
            assertEquals(decameterTestResult, squareDecameterResult);
            assertEquals(meterTestResult, squareMeterResult);
            assertEquals(decimeterTestResult, squareDecimeterResult);
            assertEquals(centimeterTestResult, squareCentimeterResult);
            assertEquals(millimeterTestResult, squareMillimeterResult);
        } catch (InvalidUnitException e) {
            System.err.println(e.getMessage());
        }
	}

	@Test 
	public void toDecimeterTest() {
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
        try {
            BigDecimal squareKilometerResult = toDecimeter(kilometerValue, KILOMETER);
            BigDecimal squareHectometerResult = toDecimeter(hectometerValue, HECTOMETER);
            BigDecimal squareDecameterResult = toDecimeter(decameterValue, DECAMETER);
            BigDecimal squareMeterResult = toDecimeter(meterValue, METER);
            BigDecimal squareDecimeterResult = toDecimeter(decimeterValue, DECIMETER);
            BigDecimal squareCentimeterResult = toDecimeter(centimeterValue, CENTIMETER);
            BigDecimal squareMillimeterResult = toDecimeter(millimeterValue, MILLIMETER);

            assertEquals(kilometerTestResult, squareKilometerResult);
            assertEquals(hectometerTestResult, squareHectometerResult);
            assertEquals(decameterTestResult, squareDecameterResult);
            assertEquals(meterTestResult, squareMeterResult);
            assertEquals(decimeterTestResult, squareDecimeterResult);
            assertEquals(centimeterTestResult, squareCentimeterResult);
            assertEquals(millimeterTestResult, squareMillimeterResult);
        } catch (InvalidUnitException e) {
            System.err.println(e.getMessage());
        }
	}

	@Test 
	public void toCentimeterTest() {
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

        try {
            BigDecimal squareKilometerResult = toCentimeter(kilometerValue, KILOMETER);
            BigDecimal squareHectometerResult = toCentimeter(hectometerValue, HECTOMETER);
            BigDecimal squareDecameterResult = toCentimeter(decameterValue, DECAMETER);
            BigDecimal squareMeterResult = toCentimeter(meterValue, METER);
            BigDecimal squareDecimeterResult = toCentimeter(decimeterValue, DECIMETER);
            BigDecimal squareCentimeterResult = toCentimeter(centimeterValue, CENTIMETER);
            BigDecimal squareMillimeterResult = toCentimeter(millimeterValue, MILLIMETER);

            assertEquals(kilometerTestResult, squareKilometerResult);
            assertEquals(hectometerTestResult, squareHectometerResult);
            assertEquals(decameterTestResult, squareDecameterResult);
            assertEquals(meterTestResult, squareMeterResult);
            assertEquals(decimeterTestResult, squareDecimeterResult);
            assertEquals(centimeterTestResult, squareCentimeterResult);
            assertEquals(millimeterTestResult, squareMillimeterResult);
        } catch (InvalidUnitException e) {
            System.err.println(e.getMessage());
        }
	}

	@Test 
	public void toMillimeterTest() {
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

        try {
            BigDecimal squareKilometerResult = toMillimeter(kilometerValue, KILOMETER);
            BigDecimal squareHectometerResult = toMillimeter(hectometerValue, HECTOMETER);
            BigDecimal squareDecameterResult = toMillimeter(decameterValue, DECAMETER);
            BigDecimal squareMeterResult = toMillimeter(meterValue, METER);
            BigDecimal squareDecimeterResult = toMillimeter(decimeterValue, DECIMETER);
            BigDecimal squareCentimeterResult = toMillimeter(centimeterValue, CENTIMETER);
            BigDecimal squareMillimeterResult = toMillimeter(millimeterValue, MILLIMETER);

            assertEquals(kilometerTestResult, squareKilometerResult);
            assertEquals(hectometerTestResult, squareHectometerResult);
            assertEquals(decameterTestResult, squareDecameterResult);
            assertEquals(meterTestResult, squareMeterResult);
            assertEquals(decimeterTestResult, squareDecimeterResult);
            assertEquals(centimeterTestResult, squareCentimeterResult);
            assertEquals(millimeterTestResult, squareMillimeterResult);
        } catch (InvalidUnitException e) {
            System.err.println(e.getMessage());
        }
	}

	private double getRandomDouble() {
		return random.nextDouble() * 100;
	}
}
