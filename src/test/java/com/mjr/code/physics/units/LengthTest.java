package com.mjr.code.physics.physics.units;

import com.mjr.code.physics.physics.NumberRandomizer;
import com.mjr.code.physics.units.Length;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static com.mjr.code.physics.physics.NumberRandomizer.getRandomDouble;
import static com.mjr.code.physics.Physic.ROUND_SCALE;
import static com.mjr.code.physics.units.Length.*;
import static java.math.RoundingMode.HALF_UP;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthTest {
	@Test 
	public void toKilometerTest() throws IllegalArgumentException {
		double kilometerValue = NumberRandomizer.getRandomDouble();
		double hectometerValue = NumberRandomizer.getRandomDouble();
		double decameterValue = NumberRandomizer.getRandomDouble();
		double meterValue = NumberRandomizer.getRandomDouble();
		double decimeterValue = NumberRandomizer.getRandomDouble();
		double centimeterValue = NumberRandomizer.getRandomDouble();
	    double millimeterValue = NumberRandomizer.getRandomDouble();

        Length kilometerTestResult = new Length(BigDecimal.valueOf(kilometerValue).multiply(LENGTH_SCALES[KILOMETER]).divide(LENGTH_SCALES[KILOMETER], ROUND_SCALE, HALF_UP), KILOMETER);
        Length hectometerTestResult = new Length(BigDecimal.valueOf(hectometerValue).multiply(LENGTH_SCALES[HECTOMETER]).divide(LENGTH_SCALES[KILOMETER], ROUND_SCALE, HALF_UP), KILOMETER);
        Length decameterTestResult = new Length(BigDecimal.valueOf(decameterValue).multiply(LENGTH_SCALES[DECAMETER]).divide(LENGTH_SCALES[KILOMETER], ROUND_SCALE, HALF_UP), KILOMETER);
        Length meterTestResult = new Length(BigDecimal.valueOf(meterValue).multiply(LENGTH_SCALES[METER]).divide(LENGTH_SCALES[KILOMETER], ROUND_SCALE, HALF_UP), KILOMETER);
        Length decimeterTestResult = new Length(BigDecimal.valueOf(decimeterValue).multiply(LENGTH_SCALES[DECIMETER]).divide(LENGTH_SCALES[KILOMETER], ROUND_SCALE, HALF_UP), KILOMETER);
        Length centimeterTestResult = new Length(BigDecimal.valueOf(centimeterValue).multiply(LENGTH_SCALES[CENTIMETER]).divide(LENGTH_SCALES[KILOMETER], ROUND_SCALE, HALF_UP), KILOMETER);
        Length millimeterTestResult = new Length(BigDecimal.valueOf(millimeterValue).multiply(LENGTH_SCALES[MILLIMETER]).divide(LENGTH_SCALES[KILOMETER], ROUND_SCALE, HALF_UP), KILOMETER);

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
	public void toHectometerTest() throws IllegalArgumentException {
		double kilometerValue = NumberRandomizer.getRandomDouble();
		double hectometerValue = NumberRandomizer.getRandomDouble();
		double decameterValue = NumberRandomizer.getRandomDouble();
		double meterValue = NumberRandomizer.getRandomDouble();
		double decimeterValue = NumberRandomizer.getRandomDouble();
		double centimeterValue = NumberRandomizer.getRandomDouble();
		double millimeterValue = NumberRandomizer.getRandomDouble();

        Length kilometerTestResult = new Length(BigDecimal.valueOf(kilometerValue).multiply(LENGTH_SCALES[KILOMETER]).divide(LENGTH_SCALES[HECTOMETER], ROUND_SCALE, HALF_UP), HECTOMETER);
        Length hectometerTestResult = new Length(BigDecimal.valueOf(hectometerValue).multiply(LENGTH_SCALES[HECTOMETER]).divide(LENGTH_SCALES[HECTOMETER], ROUND_SCALE, HALF_UP), HECTOMETER);
        Length decameterTestResult = new Length(BigDecimal.valueOf(decameterValue).multiply(LENGTH_SCALES[DECAMETER]).divide(LENGTH_SCALES[HECTOMETER], ROUND_SCALE, HALF_UP), HECTOMETER);
        Length meterTestResult = new Length(BigDecimal.valueOf(meterValue).multiply(LENGTH_SCALES[METER]).divide(LENGTH_SCALES[HECTOMETER], ROUND_SCALE, HALF_UP), HECTOMETER);
        Length decimeterTestResult = new Length(BigDecimal.valueOf(decimeterValue).multiply(LENGTH_SCALES[DECIMETER]).divide(LENGTH_SCALES[HECTOMETER], ROUND_SCALE, HALF_UP), HECTOMETER);
        Length centimeterTestResult = new Length(BigDecimal.valueOf(centimeterValue).multiply(LENGTH_SCALES[CENTIMETER]).divide(LENGTH_SCALES[HECTOMETER], ROUND_SCALE, HALF_UP), HECTOMETER);
        Length millimeterTestResult = new Length(BigDecimal.valueOf(millimeterValue).multiply(LENGTH_SCALES[MILLIMETER]).divide(LENGTH_SCALES[HECTOMETER], ROUND_SCALE, HALF_UP), HECTOMETER);

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
	public void toDecameterTest() throws IllegalArgumentException {
		double kilometerValue = NumberRandomizer.getRandomDouble();
		double hectometerValue = NumberRandomizer.getRandomDouble();
		double decameterValue = NumberRandomizer.getRandomDouble();
		double meterValue = NumberRandomizer.getRandomDouble();
		double decimeterValue = NumberRandomizer.getRandomDouble();
		double centimeterValue = NumberRandomizer.getRandomDouble();
		double millimeterValue = NumberRandomizer.getRandomDouble();

        Length kilometerTestResult = new Length(BigDecimal.valueOf(kilometerValue).multiply(LENGTH_SCALES[KILOMETER]).divide(LENGTH_SCALES[DECAMETER], ROUND_SCALE, HALF_UP), DECAMETER);
        Length hectometerTestResult = new Length(BigDecimal.valueOf(hectometerValue).multiply(LENGTH_SCALES[HECTOMETER]).divide(LENGTH_SCALES[DECAMETER], ROUND_SCALE, HALF_UP), DECAMETER);
        Length decameterTestResult = new Length(BigDecimal.valueOf(decameterValue).multiply(LENGTH_SCALES[DECAMETER]).divide(LENGTH_SCALES[DECAMETER], ROUND_SCALE, HALF_UP), DECAMETER);
        Length meterTestResult = new Length(BigDecimal.valueOf(meterValue).multiply(LENGTH_SCALES[METER]).divide(LENGTH_SCALES[DECAMETER], ROUND_SCALE, HALF_UP), DECAMETER);
        Length decimeterTestResult = new Length(BigDecimal.valueOf(decimeterValue).multiply(LENGTH_SCALES[DECIMETER]).divide(LENGTH_SCALES[DECAMETER], ROUND_SCALE, HALF_UP), DECAMETER);
        Length centimeterTestResult = new Length(BigDecimal.valueOf(centimeterValue).multiply(LENGTH_SCALES[CENTIMETER]).divide(LENGTH_SCALES[DECAMETER], ROUND_SCALE, HALF_UP), DECAMETER);
        Length millimeterTestResult = new Length(BigDecimal.valueOf(millimeterValue).multiply(LENGTH_SCALES[MILLIMETER]).divide(LENGTH_SCALES[DECAMETER], ROUND_SCALE, HALF_UP), DECAMETER);

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
	public void toMeterTest() throws IllegalArgumentException {
		double kilometerValue = NumberRandomizer.getRandomDouble();
		double hectometerValue = NumberRandomizer.getRandomDouble();
		double decameterValue = NumberRandomizer.getRandomDouble();
		double meterValue = NumberRandomizer.getRandomDouble();
		double decimeterValue = NumberRandomizer.getRandomDouble();
		double centimeterValue = NumberRandomizer.getRandomDouble();
		double millimeterValue = NumberRandomizer.getRandomDouble();

        Length kilometerTestResult = new Length(BigDecimal.valueOf(kilometerValue).multiply(LENGTH_SCALES[KILOMETER]).divide(LENGTH_SCALES[METER], ROUND_SCALE, HALF_UP), METER);
        Length hectometerTestResult = new Length(BigDecimal.valueOf(hectometerValue).multiply(LENGTH_SCALES[HECTOMETER]).divide(LENGTH_SCALES[METER], ROUND_SCALE, HALF_UP), METER);
        Length decameterTestResult = new Length(BigDecimal.valueOf(decameterValue).multiply(LENGTH_SCALES[DECAMETER]).divide(LENGTH_SCALES[METER], ROUND_SCALE, HALF_UP), METER);
        Length meterTestResult = new Length(BigDecimal.valueOf(meterValue).multiply(LENGTH_SCALES[METER]).divide(LENGTH_SCALES[METER], ROUND_SCALE, HALF_UP), METER);
        Length decimeterTestResult = new Length(BigDecimal.valueOf(decimeterValue).multiply(LENGTH_SCALES[DECIMETER]).divide(LENGTH_SCALES[METER], ROUND_SCALE, HALF_UP), METER);
        Length centimeterTestResult = new Length(BigDecimal.valueOf(centimeterValue).multiply(LENGTH_SCALES[CENTIMETER]).divide(LENGTH_SCALES[METER], ROUND_SCALE, HALF_UP), METER);
        Length millimeterTestResult = new Length(BigDecimal.valueOf(millimeterValue).multiply(LENGTH_SCALES[MILLIMETER]).divide(LENGTH_SCALES[METER], ROUND_SCALE, HALF_UP), METER);

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
	public void toDecimeterTest() throws IllegalArgumentException {
		double kilometerValue = NumberRandomizer.getRandomDouble();
		double hectometerValue = NumberRandomizer.getRandomDouble();
		double decameterValue = NumberRandomizer.getRandomDouble();
		double meterValue = NumberRandomizer.getRandomDouble();
		double decimeterValue = NumberRandomizer.getRandomDouble();
		double centimeterValue = NumberRandomizer.getRandomDouble();
		double millimeterValue = NumberRandomizer.getRandomDouble();

        Length kilometerTestResult = new Length(BigDecimal.valueOf(kilometerValue).multiply(LENGTH_SCALES[KILOMETER]).divide(LENGTH_SCALES[DECIMETER], ROUND_SCALE, HALF_UP), DECIMETER);
        Length hectometerTestResult = new Length(BigDecimal.valueOf(hectometerValue).multiply(LENGTH_SCALES[HECTOMETER]).divide(LENGTH_SCALES[DECIMETER], ROUND_SCALE, HALF_UP), DECIMETER);
        Length decameterTestResult = new Length(BigDecimal.valueOf(decameterValue).multiply(LENGTH_SCALES[DECAMETER]).divide(LENGTH_SCALES[DECIMETER], ROUND_SCALE, HALF_UP), DECIMETER);
        Length meterTestResult = new Length(BigDecimal.valueOf(meterValue).multiply(LENGTH_SCALES[METER]).divide(LENGTH_SCALES[DECIMETER], ROUND_SCALE, HALF_UP), DECIMETER);
        Length decimeterTestResult = new Length(BigDecimal.valueOf(decimeterValue).multiply(LENGTH_SCALES[DECIMETER]).divide(LENGTH_SCALES[DECIMETER], ROUND_SCALE, HALF_UP), DECIMETER);
        Length centimeterTestResult = new Length(BigDecimal.valueOf(centimeterValue).multiply(LENGTH_SCALES[CENTIMETER]).divide(LENGTH_SCALES[DECIMETER], ROUND_SCALE, HALF_UP), DECIMETER);
        Length millimeterTestResult = new Length(BigDecimal.valueOf(millimeterValue).multiply(LENGTH_SCALES[MILLIMETER]).divide(LENGTH_SCALES[DECIMETER], ROUND_SCALE, HALF_UP), DECIMETER);

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
	public void toCentimeterTest() throws IllegalArgumentException {
		double kilometerValue = NumberRandomizer.getRandomDouble();
		double hectometerValue = NumberRandomizer.getRandomDouble();
		double decameterValue = NumberRandomizer.getRandomDouble();
		double meterValue = NumberRandomizer.getRandomDouble();
		double decimeterValue = NumberRandomizer.getRandomDouble();
		double centimeterValue = NumberRandomizer.getRandomDouble();
		double millimeterValue = NumberRandomizer.getRandomDouble();

        Length kilometerTestResult = new Length(BigDecimal.valueOf(kilometerValue).multiply(LENGTH_SCALES[KILOMETER]).divide(LENGTH_SCALES[CENTIMETER], ROUND_SCALE, HALF_UP), CENTIMETER);
        Length hectometerTestResult = new Length(BigDecimal.valueOf(hectometerValue).multiply(LENGTH_SCALES[HECTOMETER]).divide(LENGTH_SCALES[CENTIMETER], ROUND_SCALE, HALF_UP), CENTIMETER);
        Length decameterTestResult = new Length(BigDecimal.valueOf(decameterValue).multiply(LENGTH_SCALES[DECAMETER]).divide(LENGTH_SCALES[CENTIMETER], ROUND_SCALE, HALF_UP), CENTIMETER);
        Length meterTestResult = new Length(BigDecimal.valueOf(meterValue).multiply(LENGTH_SCALES[METER]).divide(LENGTH_SCALES[CENTIMETER], ROUND_SCALE, HALF_UP), CENTIMETER);
        Length decimeterTestResult = new Length(BigDecimal.valueOf(decimeterValue).multiply(LENGTH_SCALES[DECIMETER]).divide(LENGTH_SCALES[CENTIMETER], ROUND_SCALE, HALF_UP), CENTIMETER);
        Length centimeterTestResult = new Length(BigDecimal.valueOf(centimeterValue).multiply(LENGTH_SCALES[CENTIMETER]).divide(LENGTH_SCALES[CENTIMETER], ROUND_SCALE, HALF_UP), CENTIMETER);
        Length millimeterTestResult = new Length(BigDecimal.valueOf(millimeterValue).multiply(LENGTH_SCALES[MILLIMETER]).divide(LENGTH_SCALES[CENTIMETER], ROUND_SCALE, HALF_UP), CENTIMETER);

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
	public void toMillimeterTest() throws IllegalArgumentException {
		double kilometerValue = NumberRandomizer.getRandomDouble();
		double hectometerValue = NumberRandomizer.getRandomDouble();
		double decameterValue = NumberRandomizer.getRandomDouble();
		double meterValue = NumberRandomizer.getRandomDouble();
		double decimeterValue = NumberRandomizer.getRandomDouble();
		double centimeterValue = NumberRandomizer.getRandomDouble();
		double millimeterValue = NumberRandomizer.getRandomDouble();

        Length kilometerTestResult = new Length(BigDecimal.valueOf(kilometerValue).multiply(LENGTH_SCALES[KILOMETER]).divide(LENGTH_SCALES[MILLIMETER], ROUND_SCALE, HALF_UP), MILLIMETER);
        Length hectometerTestResult = new Length(BigDecimal.valueOf(hectometerValue).multiply(LENGTH_SCALES[HECTOMETER]).divide(LENGTH_SCALES[MILLIMETER], ROUND_SCALE, HALF_UP), MILLIMETER);
        Length decameterTestResult = new Length(BigDecimal.valueOf(decameterValue).multiply(LENGTH_SCALES[DECAMETER]).divide(LENGTH_SCALES[MILLIMETER], ROUND_SCALE, HALF_UP), MILLIMETER);
        Length meterTestResult = new Length(BigDecimal.valueOf(meterValue).multiply(LENGTH_SCALES[METER]).divide(LENGTH_SCALES[MILLIMETER], ROUND_SCALE, HALF_UP), MILLIMETER);
        Length decimeterTestResult = new Length(BigDecimal.valueOf(decimeterValue).multiply(LENGTH_SCALES[DECIMETER]).divide(LENGTH_SCALES[MILLIMETER], ROUND_SCALE, HALF_UP), MILLIMETER);
        Length centimeterTestResult = new Length(BigDecimal.valueOf(centimeterValue).multiply(LENGTH_SCALES[CENTIMETER]).divide(LENGTH_SCALES[MILLIMETER], ROUND_SCALE, HALF_UP), MILLIMETER);
        Length millimeterTestResult = new Length(BigDecimal.valueOf(millimeterValue).multiply(LENGTH_SCALES[MILLIMETER]).divide(LENGTH_SCALES[MILLIMETER], ROUND_SCALE, HALF_UP), MILLIMETER);

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
	public void toKilometerFixedResultTest() throws IllegalArgumentException {
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
	public void toHectometerFixedResultTest() throws IllegalArgumentException {
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
	public void toDecameterFixedResultTest() throws IllegalArgumentException {
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
	public void toMeterFixedResultTest() throws IllegalArgumentException {
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
	public void toDecimeterFixedResultTest() throws IllegalArgumentException {
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
	public void toCentimeterFixedResultTest() throws IllegalArgumentException {
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
	public void toMillimeterFixedResultTest() throws IllegalArgumentException {
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
