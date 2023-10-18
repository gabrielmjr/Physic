package com.mjr.code.physics.units;

import com.mjr.code.physics.NumberRandomizer;
import org.junit.jupiter.api.Test;

import static com.mjr.code.physics.units.Length.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthTest {
	@Test 
	public void toKilometerTest() {
		double kilometerValue = NumberRandomizer.getRandomDouble();
		double hectometerValue = NumberRandomizer.getRandomDouble();
		double decameterValue = NumberRandomizer.getRandomDouble();
		double meterValue = NumberRandomizer.getRandomDouble();
		double decimeterValue = NumberRandomizer.getRandomDouble();
		double centimeterValue = NumberRandomizer.getRandomDouble();
	    double millimeterValue = NumberRandomizer.getRandomDouble();

        Length kilometerTestResult = new Length(divide(multiply(kilometerValue, LENGTH_SCALES[KILOMETER]), LENGTH_SCALES[KILOMETER]), KILOMETER);
        Length hectometerTestResult = new Length(divide(multiply(hectometerValue, LENGTH_SCALES[KILOMETER]), LENGTH_SCALES[HECTOMETER]), KILOMETER);
        Length decameterTestResult = new Length(divide(multiply(decameterValue, LENGTH_SCALES[KILOMETER]), LENGTH_SCALES[DECAMETER]), KILOMETER);
        Length meterTestResult = new Length(divide(multiply(meterValue, LENGTH_SCALES[KILOMETER]), LENGTH_SCALES[METER]), KILOMETER);
        Length decimeterTestResult = new Length(divide(multiply(decimeterValue, LENGTH_SCALES[KILOMETER]), LENGTH_SCALES[DECIMETER]), KILOMETER);
        Length centimeterTestResult = new Length(divide(multiply(centimeterValue, LENGTH_SCALES[KILOMETER]), LENGTH_SCALES[CENTIMETER]), KILOMETER);
        Length millimeterTestResult = new Length(divide(multiply(millimeterValue, LENGTH_SCALES[KILOMETER]), LENGTH_SCALES[MILLIMETER]), KILOMETER);

        Length kilometerResult = toKilometer(kilometerValue, KILOMETER);
        Length hectometerResult = toKilometer(hectometerValue, HECTOMETER);
        Length decameterResult = toKilometer(decameterValue, DECAMETER);
        Length meterResult = toKilometer(meterValue, METER);
        Length decimeterResult = toKilometer(decimeterValue, DECIMETER);
        Length centimeterResult = toKilometer(centimeterValue, CENTIMETER);
        Length millimeterResult = toKilometer(millimeterValue, MILLIMETER);

        assertEquals(kilometerTestResult, kilometerResult);
        assertEquals(hectometerTestResult, hectometerResult);
        assertEquals(decameterTestResult, decameterResult);
        assertEquals(meterTestResult, meterResult);
        assertEquals(decimeterTestResult, decimeterResult);
        assertEquals(centimeterTestResult, centimeterResult);
        assertEquals(millimeterTestResult, millimeterResult);
	}

	@Test 
	public void toHectometerTest() {
		double kilometerValue = NumberRandomizer.getRandomDouble();
		double hectometerValue = NumberRandomizer.getRandomDouble();
		double decameterValue = NumberRandomizer.getRandomDouble();
		double meterValue = NumberRandomizer.getRandomDouble();
		double decimeterValue = NumberRandomizer.getRandomDouble();
		double centimeterValue = NumberRandomizer.getRandomDouble();
		double millimeterValue = NumberRandomizer.getRandomDouble();

        Length kilometerTestResult = new Length(divide(multiply(kilometerValue, LENGTH_SCALES[HECTOMETER]), LENGTH_SCALES[KILOMETER]), HECTOMETER);
        Length hectometerTestResult = new Length(divide(multiply(hectometerValue, LENGTH_SCALES[HECTOMETER]), LENGTH_SCALES[HECTOMETER]), HECTOMETER);
        Length decameterTestResult = new Length(divide(multiply(decameterValue, LENGTH_SCALES[HECTOMETER]), LENGTH_SCALES[DECAMETER]), HECTOMETER);
        Length meterTestResult = new Length(divide(multiply(meterValue, LENGTH_SCALES[HECTOMETER]), LENGTH_SCALES[METER]), HECTOMETER);
        Length decimeterTestResult = new Length(divide(multiply(decimeterValue, LENGTH_SCALES[HECTOMETER]), LENGTH_SCALES[DECIMETER]), HECTOMETER);
        Length centimeterTestResult = new Length(divide(multiply(centimeterValue, LENGTH_SCALES[HECTOMETER]), LENGTH_SCALES[CENTIMETER]), HECTOMETER);
        Length millimeterTestResult = new Length(divide(multiply(millimeterValue, LENGTH_SCALES[HECTOMETER]), LENGTH_SCALES[MILLIMETER]), HECTOMETER);

        Length kilometerResult = toHectometer(kilometerValue, KILOMETER);
        Length hectometerResult = toHectometer(hectometerValue, HECTOMETER);
        Length decameterResult = toHectometer(decameterValue, DECAMETER);
        Length meterResult = toHectometer(meterValue, METER);
        Length decimeterResult = toHectometer(decimeterValue, DECIMETER);
        Length centimeterResult = toHectometer(centimeterValue, CENTIMETER);
        Length millimeterResult = toHectometer(millimeterValue, MILLIMETER);

        assertEquals(kilometerTestResult, kilometerResult);
        assertEquals(hectometerTestResult, hectometerResult);
        assertEquals(decameterTestResult, decameterResult);
        assertEquals(meterTestResult, meterResult);
        assertEquals(decimeterTestResult, decimeterResult);
        assertEquals(centimeterTestResult, centimeterResult);
        assertEquals(millimeterTestResult, millimeterResult);
	}

	@Test 
	public void toDecameterTest() {
		double kilometerValue = NumberRandomizer.getRandomDouble();
		double hectometerValue = NumberRandomizer.getRandomDouble();
		double decameterValue = NumberRandomizer.getRandomDouble();
		double meterValue = NumberRandomizer.getRandomDouble();
		double decimeterValue = NumberRandomizer.getRandomDouble();
		double centimeterValue = NumberRandomizer.getRandomDouble();
		double millimeterValue = NumberRandomizer.getRandomDouble();

        Length kilometerTestResult = new Length(divide(multiply(kilometerValue, LENGTH_SCALES[DECAMETER]), LENGTH_SCALES[KILOMETER]), DECAMETER);
        Length hectometerTestResult = new Length(divide(multiply(hectometerValue, LENGTH_SCALES[DECAMETER]), LENGTH_SCALES[HECTOMETER]), DECAMETER);
        Length decameterTestResult = new Length(divide(multiply(decameterValue, LENGTH_SCALES[DECAMETER]), LENGTH_SCALES[DECAMETER]), DECAMETER);
        Length meterTestResult = new Length(divide(multiply(meterValue, LENGTH_SCALES[DECAMETER]), LENGTH_SCALES[METER]), DECAMETER);
        Length decimeterTestResult = new Length(divide(multiply(decimeterValue, LENGTH_SCALES[DECAMETER]), LENGTH_SCALES[DECIMETER]), DECAMETER);
        Length centimeterTestResult = new Length(divide(multiply(centimeterValue, LENGTH_SCALES[DECAMETER]), LENGTH_SCALES[CENTIMETER]), DECAMETER);
        Length millimeterTestResult = new Length(divide(multiply(millimeterValue, LENGTH_SCALES[DECAMETER]), LENGTH_SCALES[MILLIMETER]), DECAMETER);

        Length kilometerResult = toDecameter(kilometerValue, KILOMETER);
        Length hectometerResult = toDecameter(hectometerValue, HECTOMETER);
        Length decameterResult = toDecameter(decameterValue, DECAMETER);
        Length meterResult = toDecameter(meterValue, METER);
        Length decimeterResult = toDecameter(decimeterValue, DECIMETER);
        Length centimeterResult = toDecameter(centimeterValue, CENTIMETER);
        Length millimeterResult = toDecameter(millimeterValue, MILLIMETER);

        assertEquals(kilometerTestResult, kilometerResult);
        assertEquals(hectometerTestResult, hectometerResult);
        assertEquals(decameterTestResult, decameterResult);
        assertEquals(meterTestResult, meterResult);
        assertEquals(decimeterTestResult, decimeterResult);
        assertEquals(centimeterTestResult, centimeterResult);
        assertEquals(millimeterTestResult, millimeterResult);
	}

	@Test 
	public void toMeterTest() {
		double kilometerValue = NumberRandomizer.getRandomDouble();
		double hectometerValue = NumberRandomizer.getRandomDouble();
		double decameterValue = NumberRandomizer.getRandomDouble();
		double meterValue = NumberRandomizer.getRandomDouble();
		double decimeterValue = NumberRandomizer.getRandomDouble();
		double centimeterValue = NumberRandomizer.getRandomDouble();
		double millimeterValue = NumberRandomizer.getRandomDouble();

        Length kilometerTestResult = new Length(divide(multiply(kilometerValue, LENGTH_SCALES[METER]), LENGTH_SCALES[KILOMETER]), METER);
        Length hectometerTestResult = new Length(divide(multiply(hectometerValue, LENGTH_SCALES[METER]), LENGTH_SCALES[HECTOMETER]), METER);
        Length decameterTestResult = new Length(divide(multiply(decameterValue, LENGTH_SCALES[METER]), LENGTH_SCALES[DECAMETER]), METER);
        Length meterTestResult = new Length(divide(multiply(meterValue, LENGTH_SCALES[METER]), LENGTH_SCALES[METER]), METER);
        Length decimeterTestResult = new Length(divide(multiply(decimeterValue, LENGTH_SCALES[METER]), LENGTH_SCALES[DECIMETER]), METER);
        Length centimeterTestResult = new Length(divide(multiply(centimeterValue, LENGTH_SCALES[METER]), LENGTH_SCALES[CENTIMETER]), METER);
        Length millimeterTestResult = new Length(divide(multiply(millimeterValue, LENGTH_SCALES[METER]), LENGTH_SCALES[MILLIMETER]), METER);

        Length kilometerResult = toMeter(kilometerValue, KILOMETER);
        Length hectometerResult = toMeter(hectometerValue, HECTOMETER);
        Length decameterResult = toMeter(decameterValue, DECAMETER);
        Length meterResult = toMeter(meterValue, METER);
        Length decimeterResult = toMeter(decimeterValue, DECIMETER);
        Length centimeterResult = toMeter(centimeterValue, CENTIMETER);
        Length millimeterResult = toMeter(millimeterValue, MILLIMETER);

        assertEquals(kilometerTestResult, kilometerResult);
        assertEquals(hectometerTestResult, hectometerResult);
        assertEquals(decameterTestResult, decameterResult);
        assertEquals(meterTestResult, meterResult);
        assertEquals(decimeterTestResult, decimeterResult);
        assertEquals(centimeterTestResult, centimeterResult);
        assertEquals(millimeterTestResult, millimeterResult);
	}

	@Test 
	public void toDecimeterTest() {
		double kilometerValue = NumberRandomizer.getRandomDouble();
		double hectometerValue = NumberRandomizer.getRandomDouble();
		double decameterValue = NumberRandomizer.getRandomDouble();
		double meterValue = NumberRandomizer.getRandomDouble();
		double decimeterValue = NumberRandomizer.getRandomDouble();
		double centimeterValue = NumberRandomizer.getRandomDouble();
		double millimeterValue = NumberRandomizer.getRandomDouble();

        Length kilometerTestResult = new Length(divide(multiply(kilometerValue, LENGTH_SCALES[DECIMETER]), LENGTH_SCALES[KILOMETER]), DECIMETER);
        Length hectometerTestResult = new Length(divide(multiply(hectometerValue, LENGTH_SCALES[DECIMETER]), LENGTH_SCALES[HECTOMETER]), DECIMETER);
        Length decameterTestResult = new Length(divide(multiply(decameterValue, LENGTH_SCALES[DECIMETER]), LENGTH_SCALES[DECAMETER]), DECIMETER);
        Length meterTestResult = new Length(divide(multiply(meterValue, LENGTH_SCALES[DECIMETER]), LENGTH_SCALES[METER]), DECIMETER);
        Length decimeterTestResult = new Length(divide(multiply(decimeterValue, LENGTH_SCALES[DECIMETER]), LENGTH_SCALES[DECIMETER]), DECIMETER);
        Length centimeterTestResult = new Length(divide(multiply(centimeterValue, LENGTH_SCALES[DECIMETER]), LENGTH_SCALES[CENTIMETER]), DECIMETER);
        Length millimeterTestResult = new Length(divide(multiply(millimeterValue, LENGTH_SCALES[DECIMETER]), LENGTH_SCALES[MILLIMETER]), DECIMETER);

        Length kilometerResult = toDecimeter(kilometerValue, KILOMETER);
        Length hectometerResult = toDecimeter(hectometerValue, HECTOMETER);
        Length decameterResult = toDecimeter(decameterValue, DECAMETER);
        Length meterResult = toDecimeter(meterValue, METER);
        Length decimeterResult = toDecimeter(decimeterValue, DECIMETER);
        Length centimeterResult = toDecimeter(centimeterValue, CENTIMETER);
        Length millimeterResult = toDecimeter(millimeterValue, MILLIMETER);

        assertEquals(kilometerTestResult, kilometerResult);
        assertEquals(hectometerTestResult, hectometerResult);
        assertEquals(decameterTestResult, decameterResult);
        assertEquals(meterTestResult, meterResult);
        assertEquals(decimeterTestResult, decimeterResult);
        assertEquals(centimeterTestResult, centimeterResult);
        assertEquals(millimeterTestResult, millimeterResult);
	}

	@Test 
	public void toCentimeterTest() {
		double kilometerValue = NumberRandomizer.getRandomDouble();
		double hectometerValue = NumberRandomizer.getRandomDouble();
		double decameterValue = NumberRandomizer.getRandomDouble();
		double meterValue = NumberRandomizer.getRandomDouble();
		double decimeterValue = NumberRandomizer.getRandomDouble();
		double centimeterValue = NumberRandomizer.getRandomDouble();
		double millimeterValue = NumberRandomizer.getRandomDouble();

        Length kilometerTestResult = new Length(divide(multiply(kilometerValue, LENGTH_SCALES[CENTIMETER]), LENGTH_SCALES[KILOMETER]), CENTIMETER);
        Length hectometerTestResult = new Length(divide(multiply(hectometerValue, LENGTH_SCALES[CENTIMETER]), LENGTH_SCALES[HECTOMETER]), CENTIMETER);
        Length decameterTestResult = new Length(divide(multiply(decameterValue, LENGTH_SCALES[CENTIMETER]), LENGTH_SCALES[DECAMETER]), CENTIMETER);
        Length meterTestResult = new Length(divide(multiply(meterValue, LENGTH_SCALES[CENTIMETER]), LENGTH_SCALES[METER]), CENTIMETER);
        Length decimeterTestResult = new Length(divide(multiply(decimeterValue, LENGTH_SCALES[CENTIMETER]), LENGTH_SCALES[DECIMETER]), CENTIMETER);
        Length centimeterTestResult = new Length(divide(multiply(centimeterValue, LENGTH_SCALES[CENTIMETER]), LENGTH_SCALES[CENTIMETER]), CENTIMETER);
        Length millimeterTestResult = new Length(divide(multiply(millimeterValue, LENGTH_SCALES[CENTIMETER]), LENGTH_SCALES[MILLIMETER]), CENTIMETER);

        Length kilometerResult = toCentimeter(kilometerValue, KILOMETER);
        Length hectometerResult = toCentimeter(hectometerValue, HECTOMETER);
        Length decameterResult = toCentimeter(decameterValue, DECAMETER);
        Length meterResult = toCentimeter(meterValue, METER);
        Length decimeterResult = toCentimeter(decimeterValue, DECIMETER);
        Length centimeterResult = toCentimeter(centimeterValue, CENTIMETER);
        Length millimeterResult = toCentimeter(millimeterValue, MILLIMETER);

        assertEquals(kilometerTestResult, kilometerResult);
        assertEquals(hectometerTestResult, hectometerResult);
        assertEquals(decameterTestResult, decameterResult);
        assertEquals(meterTestResult, meterResult);
        assertEquals(decimeterTestResult, decimeterResult);
        assertEquals(centimeterTestResult, centimeterResult);
        assertEquals(millimeterTestResult, millimeterResult);
	}

	@Test 
	public void toMillimeterTest() {
		double kilometerValue = NumberRandomizer.getRandomDouble();
		double hectometerValue = NumberRandomizer.getRandomDouble();
		double decameterValue = NumberRandomizer.getRandomDouble();
		double meterValue = NumberRandomizer.getRandomDouble();
		double decimeterValue = NumberRandomizer.getRandomDouble();
		double centimeterValue = NumberRandomizer.getRandomDouble();
		double millimeterValue = NumberRandomizer.getRandomDouble();

        Length kilometerTestResult = new Length(divide(multiply(kilometerValue, LENGTH_SCALES[MILLIMETER]), LENGTH_SCALES[KILOMETER]), MILLIMETER);
        Length hectometerTestResult = new Length(divide(multiply(hectometerValue, LENGTH_SCALES[MILLIMETER]), LENGTH_SCALES[HECTOMETER]), MILLIMETER);
        Length decameterTestResult = new Length(divide(multiply(decameterValue, LENGTH_SCALES[MILLIMETER]), LENGTH_SCALES[DECAMETER]), MILLIMETER);
        Length meterTestResult = new Length(divide(multiply(meterValue, LENGTH_SCALES[MILLIMETER]), LENGTH_SCALES[METER]), MILLIMETER);
        Length decimeterTestResult = new Length(divide(multiply(decimeterValue, LENGTH_SCALES[MILLIMETER]), LENGTH_SCALES[DECIMETER]), MILLIMETER);
        Length centimeterTestResult = new Length(divide(multiply(centimeterValue, LENGTH_SCALES[MILLIMETER]), LENGTH_SCALES[CENTIMETER]), MILLIMETER);
        Length millimeterTestResult = new Length(divide(multiply(millimeterValue, LENGTH_SCALES[MILLIMETER]), LENGTH_SCALES[MILLIMETER]), MILLIMETER);

        Length kilometerResult = toMillimeter(kilometerValue, KILOMETER);
        Length hectometerResult = toMillimeter(hectometerValue, HECTOMETER);
        Length decameterResult = toMillimeter(decameterValue, DECAMETER);
        Length meterResult = toMillimeter(meterValue, METER);
        Length decimeterResult = toMillimeter(decimeterValue, DECIMETER);
        Length centimeterResult = toMillimeter(centimeterValue, CENTIMETER);
        Length millimeterResult = toMillimeter(millimeterValue, MILLIMETER);

        assertEquals(kilometerTestResult, kilometerResult);
        assertEquals(hectometerTestResult, hectometerResult);
        assertEquals(decameterTestResult, decameterResult);
        assertEquals(meterTestResult, meterResult);
        assertEquals(decimeterTestResult, decimeterResult);
        assertEquals(centimeterTestResult, centimeterResult);
        assertEquals(millimeterTestResult, millimeterResult);
	}


	@Test
	public void toKilometerFixedResultTest() {
		int kilometerValue = 1;
		int hectometerValue = 1;
		int decameterValue = 1;
		int meterValue = 1;
		int decimeterValue = 1;
		int centimeterValue = 1;
		int millimeterValue = 1;

        Length kilometerTestResult = new Length("1.00000000000000000000", KILOMETER);
        Length hectometerTestResult= new Length("0.10000000000000000000", KILOMETER);
        Length decameterTestResult = new Length("0.01000000000000000000", KILOMETER);
        Length meterTestResult = new Length("0.00100000000000000000", KILOMETER);
        Length decimeterTestResult = new Length("0.00010000000000000000", KILOMETER);
        Length centimeterTestResult = new Length("0.00001000000000000000", KILOMETER);
        Length millimeterTestResult = new Length("0.00000100000000000000", KILOMETER);

        Length kilometerResult = toKilometer(kilometerValue, KILOMETER);
        Length hectometerResult = toKilometer(hectometerValue, HECTOMETER);
        Length decameterResult = toKilometer(decameterValue, DECAMETER);
        Length meterResult = toKilometer(meterValue, METER);
        Length decimeterResult = toKilometer(decimeterValue, DECIMETER);
        Length centimeterResult = toKilometer(centimeterValue, CENTIMETER);
        Length millimeterResult = toKilometer(millimeterValue, MILLIMETER);

        assertEquals(kilometerTestResult, kilometerResult);
        assertEquals(hectometerTestResult, hectometerResult);
        assertEquals(decameterTestResult, decameterResult);
        assertEquals(meterTestResult, meterResult);
        assertEquals(decimeterTestResult, decimeterResult);
        assertEquals(centimeterTestResult, centimeterResult);
        assertEquals(millimeterTestResult, millimeterResult);
	}

	@Test
	public void toHectometerFixedResultTest() {
		int kilometerValue = 1;
		int hectometerValue = 1;
		int decameterValue = 1;
		int meterValue = 1;
		int decimeterValue = 1;
		int centimeterValue = 1;
		int millimeterValue = 1;

        Length kilometerTestResult = new Length("10.00000000000000000000", HECTOMETER);
        Length hectometerTestResult= new Length("1.00000000000000000000", HECTOMETER);
        Length decameterTestResult = new Length("0.10000000000000000000", HECTOMETER);
        Length meterTestResult = new Length("0.01000000000000000000", HECTOMETER);
        Length decimeterTestResult = new Length("0.00100000000000000000", HECTOMETER);
        Length centimeterTestResult = new Length("0.00010000000000000000", HECTOMETER);
        Length millimeterTestResult = new Length("0.00001000000000000000", HECTOMETER);

        Length kilometerResult = toHectometer(kilometerValue, KILOMETER);
        Length hectometerResult = toHectometer(hectometerValue, HECTOMETER);
        Length decameterResult = toHectometer(decameterValue, DECAMETER);
        Length meterResult = toHectometer(meterValue, METER);
        Length decimeterResult = toHectometer(decimeterValue, DECIMETER);
        Length centimeterResult = toHectometer(centimeterValue, CENTIMETER);
        Length millimeterResult = toHectometer(millimeterValue, MILLIMETER);

        assertEquals(kilometerTestResult, kilometerResult);
        assertEquals(hectometerTestResult, hectometerResult);
        assertEquals(decameterTestResult, decameterResult);
        assertEquals(meterTestResult, meterResult);
        assertEquals(decimeterTestResult, decimeterResult);
        assertEquals(centimeterTestResult, centimeterResult);
        assertEquals(millimeterTestResult, millimeterResult);
	}

	@Test
	public void toDecameterFixedResultTest() {
		int kilometerValue = 1;
		int hectometerValue = 1;
		int decameterValue = 1;
		int meterValue = 1;
		int decimeterValue = 1;
		int centimeterValue = 1;
		int millimeterValue = 1;

        Length kilometerTestResult = new Length("100.00000000000000000000", DECAMETER);
        Length hectometerTestResult= new Length("10.00000000000000000000", DECAMETER);
        Length decameterTestResult = new Length("1.00000000000000000000", DECAMETER);
        Length meterTestResult = new Length("0.10000000000000000000", DECAMETER);
        Length decimeterTestResult = new Length("0.01000000000000000000", DECAMETER);
        Length centimeterTestResult = new Length("0.00100000000000000000", DECAMETER);
        Length millimeterTestResult = new Length("0.00010000000000000000", DECAMETER);

        Length kilometerResult = toDecameter(kilometerValue, KILOMETER);
        Length hectometerResult = toDecameter(hectometerValue, HECTOMETER);
        Length decameterResult = toDecameter(decameterValue, DECAMETER);
        Length meterResult = toDecameter(meterValue, METER);
        Length decimeterResult = toDecameter(decimeterValue, DECIMETER);
        Length centimeterResult = toDecameter(centimeterValue, CENTIMETER);
        Length millimeterResult = toDecameter(millimeterValue, MILLIMETER);

        assertEquals(kilometerTestResult, kilometerResult);
        assertEquals(hectometerTestResult, hectometerResult);
        assertEquals(decameterTestResult, decameterResult);
        assertEquals(meterTestResult, meterResult);
        assertEquals(decimeterTestResult, decimeterResult);
        assertEquals(centimeterTestResult, centimeterResult);
        assertEquals(millimeterTestResult, millimeterResult);
	}

	@Test
	public void toMeterFixedResultTest() {
		int kilometerValue = 1;
		int hectometerValue = 1;
		int decameterValue = 1;
		int meterValue = 1;
		int decimeterValue = 1;
		int centimeterValue = 1;
		int millimeterValue = 1;

        Length kilometerTestResult = new Length("1000.00000000000000000000", METER);
        Length hectometerTestResult= new Length("100.00000000000000000000", METER);
        Length decameterTestResult = new Length("10.00000000000000000000", METER);
        Length meterTestResult = new Length("1.00000000000000000000", METER);
        Length decimeterTestResult = new Length("0.10000000000000000000", METER);
        Length centimeterTestResult = new Length("0.01000000000000000000", METER);
        Length millimeterTestResult = new Length("0.00100000000000000000", METER);

        Length kilometerResult = toMeter(kilometerValue, KILOMETER);
        Length hectometerResult = toMeter(hectometerValue, HECTOMETER);
        Length decameterResult = toMeter(decameterValue, DECAMETER);
        Length meterResult = toMeter(meterValue, METER);
        Length decimeterResult = toMeter(decimeterValue, DECIMETER);
        Length centimeterResult = toMeter(centimeterValue, CENTIMETER);
        Length millimeterResult = toMeter(millimeterValue, MILLIMETER);

        assertEquals(kilometerTestResult, kilometerResult);
        assertEquals(hectometerTestResult, hectometerResult);
        assertEquals(decameterTestResult, decameterResult);
        assertEquals(meterTestResult, meterResult);
        assertEquals(decimeterTestResult, decimeterResult);
        assertEquals(centimeterTestResult, centimeterResult);
        assertEquals(millimeterTestResult, millimeterResult);
	}

	@Test
	public void toDecimeterFixedResultTest() {
		int kilometerValue = 1;
		int hectometerValue = 1;
		int decameterValue = 1;
		int meterValue = 1;
		int decimeterValue = 1;
		int centimeterValue = 1;
		int millimeterValue = 1;

        Length kilometerTestResult = new Length("10000.00000000000000000000", DECIMETER);
        Length hectometerTestResult= new Length("1000.00000000000000000000", DECIMETER);
        Length decameterTestResult = new Length("100.00000000000000000000", DECIMETER);
        Length meterTestResult = new Length("10.00000000000000000000", DECIMETER);
        Length decimeterTestResult = new Length("1.00000000000000000000", DECIMETER);
        Length centimeterTestResult = new Length("0.10000000000000000000", DECIMETER);
        Length millimeterTestResult = new Length("0.01000000000000000000", DECIMETER);

        Length kilometerResult = toDecimeter(kilometerValue, KILOMETER);
        Length hectometerResult = toDecimeter(hectometerValue, HECTOMETER);
        Length decameterResult = toDecimeter(decameterValue, DECAMETER);
        Length meterResult = toDecimeter(meterValue, METER);
        Length decimeterResult = toDecimeter(decimeterValue, DECIMETER);
        Length centimeterResult = toDecimeter(centimeterValue, CENTIMETER);
        Length millimeterResult = toDecimeter(millimeterValue, MILLIMETER);

        assertEquals(kilometerTestResult, kilometerResult);
        assertEquals(hectometerTestResult, hectometerResult);
        assertEquals(decameterTestResult, decameterResult);
        assertEquals(meterTestResult, meterResult);
        assertEquals(decimeterTestResult, decimeterResult);
        assertEquals(centimeterTestResult, centimeterResult);
        assertEquals(millimeterTestResult, millimeterResult);
	}

	@Test
	public void toCentimeterFixedResultTest() {
		int kilometerValue = 1;
		int hectometerValue = 1;
		int decameterValue = 1;
		int meterValue = 1;
		int decimeterValue = 1;
		int centimeterValue = 1;
		int millimeterValue = 1;

        Length kilometerTestResult = new Length("100000.00000000000000000000", CENTIMETER);
        Length hectometerTestResult= new Length("10000.00000000000000000000", CENTIMETER);
        Length decameterTestResult = new Length("1000.00000000000000000000", CENTIMETER);
        Length meterTestResult = new Length("100.00000000000000000000", CENTIMETER);
        Length decimeterTestResult = new Length("10.00000000000000000000", CENTIMETER);
        Length centimeterTestResult = new Length("1.00000000000000000000", CENTIMETER);
        Length millimeterTestResult = new Length("0.10000000000000000000", CENTIMETER);

        Length kilometerResult = toCentimeter(kilometerValue, KILOMETER);
        Length hectometerResult = toCentimeter(hectometerValue, HECTOMETER);
        Length decameterResult = toCentimeter(decameterValue, DECAMETER);
        Length meterResult = toCentimeter(meterValue, METER);
        Length decimeterResult = toCentimeter(decimeterValue, DECIMETER);
        Length centimeterResult = toCentimeter(centimeterValue, CENTIMETER);
        Length millimeterResult = toCentimeter(millimeterValue, MILLIMETER);

        assertEquals(kilometerTestResult, kilometerResult);
        assertEquals(hectometerTestResult, hectometerResult);
        assertEquals(decameterTestResult, decameterResult);
        assertEquals(meterTestResult, meterResult);
        assertEquals(decimeterTestResult, decimeterResult);
        assertEquals(centimeterTestResult, centimeterResult);
        assertEquals(millimeterTestResult, millimeterResult);
	}

	@Test
	public void toMillimeterFixedResultTest() {
		int kilometerValue = 1;
		int hectometerValue = 1;
		int decameterValue = 1;
		int meterValue = 1;
		int decimeterValue = 1;
		int centimeterValue = 1;
		int millimeterValue = 1;

        Length kilometerTestResult = new Length("1000000.00000000000000000000", MILLIMETER);
        Length hectometerTestResult= new Length("100000.00000000000000000000", MILLIMETER);
        Length decameterTestResult = new Length("10000.00000000000000000000", MILLIMETER);
        Length meterTestResult = new Length("1000.00000000000000000000", MILLIMETER);
        Length decimeterTestResult = new Length("100.00000000000000000000", MILLIMETER);
        Length centimeterTestResult = new Length("10.00000000000000000000", MILLIMETER);
        Length millimeterTestResult = new Length("1.00000000000000000000", MILLIMETER);

        Length kilometerResult = toMillimeter(kilometerValue, KILOMETER);
        Length hectometerResult = toMillimeter(hectometerValue, HECTOMETER);
        Length decameterResult = toMillimeter(decameterValue, DECAMETER);
        Length meterResult = toMillimeter(meterValue, METER);
        Length decimeterResult = toMillimeter(decimeterValue, DECIMETER);
        Length centimeterResult = toMillimeter(centimeterValue, CENTIMETER);
        Length millimeterResult = toMillimeter(millimeterValue, MILLIMETER);

        assertEquals(kilometerTestResult, kilometerResult);
        assertEquals(hectometerTestResult, hectometerResult);
        assertEquals(decameterTestResult, decameterResult);
        assertEquals(meterTestResult, meterResult);
        assertEquals(decimeterTestResult, decimeterResult);
        assertEquals(centimeterTestResult, centimeterResult);
        assertEquals(millimeterTestResult, millimeterResult);
	}
}
