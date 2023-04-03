package com.gabrielmjr.twaire.physic.units;

import java.math.BigDecimal;
import java.util.Random;
import org.junit.jupiter.api.Test;

import static com.gabrielmjr.twaire.physic.units.Length.toKilometer;
import static com.gabrielmjr.twaire.physic.units.Length.toHectometer;
import static com.gabrielmjr.twaire.physic.units.Length.toDecameter;
import static com.gabrielmjr.twaire.physic.units.Length.toMeter;
import static com.gabrielmjr.twaire.physic.units.Length.toDecimeter;
import static com.gabrielmjr.twaire.physic.units.Length.toCentimeter;
import static com.gabrielmjr.twaire.physic.units.Length.toMillimeter;
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

        try {
            Length kilometerTestResult = new Length(BigDecimal.valueOf(kilometerValue).multiply(LENGTH_SCALES[KILOMETER]).divide(LENGTH_SCALES[KILOMETER]));
            Length hectometerTestResult = new Length(BigDecimal.valueOf(hectometerValue).multiply(LENGTH_SCALES[HECTOMETER]).divide(LENGTH_SCALES[KILOMETER]));
            Length decameterTestResult = new Length(BigDecimal.valueOf(decameterValue).multiply(LENGTH_SCALES[DECAMETER]).divide(LENGTH_SCALES[KILOMETER]));
            Length meterTestResult = new Length(BigDecimal.valueOf(meterValue).multiply(LENGTH_SCALES[METER]).divide(LENGTH_SCALES[KILOMETER]));
            Length decimeterTestResult = new Length(BigDecimal.valueOf(decimeterValue).multiply(LENGTH_SCALES[DECIMETER]).divide(LENGTH_SCALES[KILOMETER]));
            Length centimeterTestResult = new Length(BigDecimal.valueOf(centimeterValue).multiply(LENGTH_SCALES[CENTIMETER]).divide(LENGTH_SCALES[KILOMETER]));
            Length millimeterTestResult = new Length(BigDecimal.valueOf(millimeterValue).multiply(LENGTH_SCALES[MILLIMETER]).divide(LENGTH_SCALES[KILOMETER]));

            Length squareKilometerResult = toKilometer(kilometerValue, KILOMETER);
            Length squareHectometerResult = toKilometer(hectometerValue, HECTOMETER);
            Length squareDecameterResult = toKilometer(decameterValue, DECAMETER);
            Length squareMeterResult = toKilometer(meterValue, METER);
            Length squareDecimeterResult = toKilometer(decimeterValue, DECIMETER);
            Length squareCentimeterResult = toKilometer(centimeterValue, CENTIMETER);
            Length squareMillimeterResult = toKilometer(millimeterValue, MILLIMETER);

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
	public void toHectometerTest() throws PhysicExcelrion {
		double kilometerValue = getRandomDouble();
		double hectometerValue = getRandomDouble();
		double decameterValue = getRandomDouble();
		double meterValue = getRandomDouble();
		double decimeterValue = getRandomDouble();
		double centimeterValue = getRandomDouble();
		double millimeterValue = getRandomDouble();

        try {
	        Length kilometerTestResult = new Length(BigDecimal.valueOf(kilometerValue).multiply(LENGTH_SCALES[KILOMETER]).divide(LENGTH_SCALES[HECTOMETER]));
		    Length hectometerTestResult = new Length(BigDecimal.valueOf(hectometerValue).multiply(LENGTH_SCALES[HECTOMETER]).divide(LENGTH_SCALES[HECTOMETER]));
	    	Length decameterTestResult = new Length(BigDecimal.valueOf(decameterValue).multiply(LENGTH_SCALES[DECAMETER]).divide(LENGTH_SCALES[HECTOMETER]));
		    Length meterTestResult = new Length(BigDecimal.valueOf(meterValue).multiply(LENGTH_SCALES[METER]).divide(LENGTH_SCALES[HECTOMETER]));
		    Length decimeterTestResult = new Length(BigDecimal.valueOf(decimeterValue).multiply(LENGTH_SCALES[DECIMETER]).divide(LENGTH_SCALES[HECTOMETER]));
            Length centimeterTestResult = new Length(BigDecimal.valueOf(centimeterValue).multiply(LENGTH_SCALES[CENTIMETER]).divide(LENGTH_SCALES[HECTOMETER]));
		    Length millimeterTestResult = new Length(BigDecimal.valueOf(millimeterValue).multiply(LENGTH_SCALES[MILLIMETER]).divide(LENGTH_SCALES[HECTOMETER]));

            Length squareKilometerResult = toHectometer(kilometerValue, KILOMETER);
            Length squareHectometerResult = toHectometer(hectometerValue, HECTOMETER);
            Length squareDecameterResult = toHectometer(decameterValue, DECAMETER);
            Length squareMeterResult = toHectometer(meterValue, METER);
            Length squareDecimeterResult = toHectometer(decimeterValue, DECIMETER);
            Length squareCentimeterResult = toHectometer(centimeterValue, CENTIMETER);
            Length squareMillimeterResult = toHectometer(millimeterValue, MILLIMETER);

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

		Length kilometerTestResult = new Length(BigDecimal.valueOf(kilometerValue).multiply(LENGTH_SCALES[KILOMETER]).divide(LENGTH_SCALES[DECAMETER]));
		Length hectometerTestResult = new Length(BigDecimal.valueOf(hectometerValue).multiply(LENGTH_SCALES[HECTOMETER]).divide(LENGTH_SCALES[DECAMETER]));
		Length decameterTestResult = new Length(BigDecimal.valueOf(decameterValue).multiply(LENGTH_SCALES[DECAMETER]).divide(LENGTH_SCALES[DECAMETER]));
		Length meterTestResult = new Length(BigDecimal.valueOf(meterValue).multiply(LENGTH_SCALES[METER]).divide(LENGTH_SCALES[DECAMETER]));
		Length decimeterTestResult = new Length(BigDecimal.valueOf(decimeterValue).multiply(LENGTH_SCALES[DECIMETER]).divide(LENGTH_SCALES[DECAMETER]));
        Length centimeterTestResult = new Length(BigDecimal.valueOf(centimeterValue).multiply(LENGTH_SCALES[CENTIMETER]).divide(LENGTH_SCALES[DECAMETER]));
		Length millimeterTestResult = new Length(BigDecimal.valueOf(millimeterValue).multiply(LENGTH_SCALES[MILLIMETER]).divide(LENGTH_SCALES[DECAMETER]));

        try {
            Length squareKilometerResult = toDecameter(kilometerValue, KILOMETER);
            Length squareHectometerResult = toDecameter(hectometerValue, HECTOMETER);
            Length squareDecameterResult = toDecameter(decameterValue, DECAMETER);
            Length squareMeterResult = toDecameter(meterValue, METER);
            Length squareDecimeterResult = toDecameter(decimeterValue, DECIMETER);
            Length squareCentimeterResult = toDecameter(centimeterValue, CENTIMETER);
            Length squareMillimeterResult = toDecameter(millimeterValue, MILLIMETER);

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

		Length kilometerTestResult = new Length(BigDecimal.valueOf(kilometerValue).multiply(LENGTH_SCALES[KILOMETER]).divide(LENGTH_SCALES[METER]));
		Length hectometerTestResult = new Length(BigDecimal.valueOf(hectometerValue).multiply(LENGTH_SCALES[HECTOMETER]).divide(LENGTH_SCALES[METER]));
		Length decameterTestResult = new Length(BigDecimal.valueOf(decameterValue).multiply(LENGTH_SCALES[DECAMETER]).divide(LENGTH_SCALES[METER]));
		Length meterTestResult = new Length(BigDecimal.valueOf(meterValue).multiply(LENGTH_SCALES[METER]).divide(LENGTH_SCALES[METER]));
		Length decimeterTestResult = new Length(BigDecimal.valueOf(decimeterValue).multiply(LENGTH_SCALES[DECIMETER]).divide(LENGTH_SCALES[METER]));
        Length centimeterTestResult = new Length(BigDecimal.valueOf(centimeterValue).multiply(LENGTH_SCALES[CENTIMETER]).divide(LENGTH_SCALES[METER]));
		Length millimeterTestResult = new Length(BigDecimal.valueOf(millimeterValue).multiply(LENGTH_SCALES[MILLIMETER]).divide(LENGTH_SCALES[METER]));

        try {
            Length squareKilometerResult = toMeter(kilometerValue, KILOMETER);
            Length squareHectometerResult = toMeter(hectometerValue, HECTOMETER);
            Length squareDecameterResult = toMeter(decameterValue, DECAMETER);
            Length squareMeterResult = toMeter(meterValue, METER);
            Length squareDecimeterResult = toMeter(decimeterValue, DECIMETER);
            Length squareCentimeterResult = toMeter(centimeterValue, CENTIMETER);
            Length squareMillimeterResult = toMeter(millimeterValue, MILLIMETER);

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

		Length kilometerTestResult = new Length(BigDecimal.valueOf(kilometerValue).multiply(LENGTH_SCALES[KILOMETER]).divide(LENGTH_SCALES[DECIMETER]));
		Length hectometerTestResult = new Length(BigDecimal.valueOf(hectometerValue).multiply(LENGTH_SCALES[HECTOMETER]).divide(LENGTH_SCALES[DECIMETER]));
		Length decameterTestResult = new Length(BigDecimal.valueOf(decameterValue).multiply(LENGTH_SCALES[DECAMETER]).divide(LENGTH_SCALES[DECIMETER]));
		Length meterTestResult = new Length(BigDecimal.valueOf(meterValue).multiply(LENGTH_SCALES[METER]).divide(LENGTH_SCALES[DECIMETER]));
		Length decimeterTestResult = new Length(BigDecimal.valueOf(decimeterValue).multiply(LENGTH_SCALES[DECIMETER]).divide(LENGTH_SCALES[DECIMETER]));
        Length centimeterTestResult = new Length(BigDecimal.valueOf(centimeterValue).multiply(LENGTH_SCALES[CENTIMETER]).divide(LENGTH_SCALES[DECIMETER]));
		Length millimeterTestResult = new Length(BigDecimal.valueOf(millimeterValue).multiply(LENGTH_SCALES[MILLIMETER]).divide(LENGTH_SCALES[DECIMETER]));
        try {
            Length squareKilometerResult = toDecimeter(kilometerValue, KILOMETER);
            Length squareHectometerResult = toDecimeter(hectometerValue, HECTOMETER);
            Length squareDecameterResult = toDecimeter(decameterValue, DECAMETER);
            Length squareMeterResult = toDecimeter(meterValue, METER);
            Length squareDecimeterResult = toDecimeter(decimeterValue, DECIMETER);
            Length squareCentimeterResult = toDecimeter(centimeterValue, CENTIMETER);
            Length squareMillimeterResult = toDecimeter(millimeterValue, MILLIMETER);

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

		Length kilometerTestResult = new Length(BigDecimal.valueOf(kilometerValue).multiply(LENGTH_SCALES[KILOMETER]).divide(LENGTH_SCALES[CENTIMETER]));
		Length hectometerTestResult = new Length(BigDecimal.valueOf(hectometerValue).multiply(LENGTH_SCALES[HECTOMETER]).divide(LENGTH_SCALES[CENTIMETER]));
		Length decameterTestResult = new Length(BigDecimal.valueOf(decameterValue).multiply(LENGTH_SCALES[DECAMETER]).divide(LENGTH_SCALES[CENTIMETER]));
		Length meterTestResult = new Length(BigDecimal.valueOf(meterValue).multiply(LENGTH_SCALES[METER]).divide(LENGTH_SCALES[CENTIMETER]));
		Length decimeterTestResult = new Length(BigDecimal.valueOf(decimeterValue).multiply(LENGTH_SCALES[DECIMETER]).divide(LENGTH_SCALES[CENTIMETER]));
        Length centimeterTestResult = new Length(BigDecimal.valueOf(centimeterValue).multiply(LENGTH_SCALES[CENTIMETER]).divide(LENGTH_SCALES[CENTIMETER]));
		Length millimeterTestResult = new Length(BigDecimal.valueOf(millimeterValue).multiply(LENGTH_SCALES[MILLIMETER]).divide(LENGTH_SCALES[CENTIMETER]));

        try {
            Length squareKilometerResult = toCentimeter(kilometerValue, KILOMETER);
            Length squareHectometerResult = toCentimeter(hectometerValue, HECTOMETER);
            Length squareDecameterResult = toCentimeter(decameterValue, DECAMETER);
            Length squareMeterResult = toCentimeter(meterValue, METER);
            Length squareDecimeterResult = toCentimeter(decimeterValue, DECIMETER);
            Length squareCentimeterResult = toCentimeter(centimeterValue, CENTIMETER);
            Length squareMillimeterResult = toCentimeter(millimeterValue, MILLIMETER);

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

		Length kilometerTestResult = new Length(BigDecimal.valueOf(kilometerValue).multiply(LENGTH_SCALES[KILOMETER]).divide(LENGTH_SCALES[MILLIMETER]));
		Length hectometerTestResult = new Length(BigDecimal.valueOf(hectometerValue).multiply(LENGTH_SCALES[HECTOMETER]).divide(LENGTH_SCALES[MILLIMETER]));
		Length decameterTestResult = new Length(BigDecimal.valueOf(decameterValue).multiply(LENGTH_SCALES[DECAMETER]).divide(LENGTH_SCALES[MILLIMETER]));
		Length meterTestResult = new Length(BigDecimal.valueOf(meterValue).multiply(LENGTH_SCALES[METER]).divide(LENGTH_SCALES[MILLIMETER]));
		Length decimeterTestResult = new Length(BigDecimal.valueOf(decimeterValue).multiply(LENGTH_SCALES[DECIMETER]).divide(LENGTH_SCALES[MILLIMETER]));
        Length centimeterTestResult = new Length(BigDecimal.valueOf(centimeterValue).multiply(LENGTH_SCALES[CENTIMETER]).divide(LENGTH_SCALES[MILLIMETER]));
		Length millimeterTestResult = new Length(BigDecimal.valueOf(millimeterValue).multiply(LENGTH_SCALES[MILLIMETER]).divide(LENGTH_SCALES[MILLIMETER]));

        try {
            Length squareKilometerResult = toMillimeter(kilometerValue, KILOMETER);
            Length squareHectometerResult = toMillimeter(hectometerValue, HECTOMETER);
            Length squareDecameterResult = toMillimeter(decameterValue, DECAMETER);
            Length squareMeterResult = toMillimeter(meterValue, METER);
            Length squareDecimeterResult = toMillimeter(decimeterValue, DECIMETER);
            Length squareCentimeterResult = toMillimeter(centimeterValue, CENTIMETER);
            Length squareMillimeterResult = toMillimeter(millimeterValue, MILLIMETER);

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
