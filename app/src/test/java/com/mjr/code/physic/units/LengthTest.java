package com.mjr.code.physic.units;

import com.mjr.code.physic.PhysicException;
import java.math.BigDecimal;
import java.util.Random;
import org.junit.jupiter.api.Test;

import static com.mjr.code.physic.units.Length.toKilometer;
import static com.mjr.code.physic.units.Length.toHectometer;
import static com.mjr.code.physic.units.Length.toDecameter;
import static com.mjr.code.physic.units.Length.toMeter;
import static com.mjr.code.physic.units.Length.toDecimeter;
import static com.mjr.code.physic.units.Length.toCentimeter;
import static com.mjr.code.physic.units.Length.toMillimeter;
import static com.mjr.code.physic.units.Length.LENGTH_SCALES;
import static com.mjr.code.physic.units.Length.KILOMETER;
import static com.mjr.code.physic.units.Length.HECTOMETER;
import static com.mjr.code.physic.units.Length.DECAMETER;
import static com.mjr.code.physic.units.Length.METER;
import static com.mjr.code.physic.units.Length.DECIMETER;
import static com.mjr.code.physic.units.Length.CENTIMETER;
import static com.mjr.code.physic.units.Length.MILLIMETER;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthTest {
	private final Random random;

	public LengthTest() {
		random = new Random();
	}

	@Test 
	public void toKilometerTest() throws PhysicException {
		double kilometerValue = getRandomDouble();
		double hectometerValue = getRandomDouble();
		double decameterValue = getRandomDouble();
		double meterValue = getRandomDouble();
		double decimeterValue = getRandomDouble();
		double centimeterValue = getRandomDouble();
	    double millimeterValue = getRandomDouble();

        try {
            Length kilometerTestResult = new Length(BigDecimal.valueOf(kilometerValue).multiply(LENGTH_SCALES[KILOMETER]).divide(LENGTH_SCALES[KILOMETER]), KILOMETER);
            Length hectometerTestResult = new Length(BigDecimal.valueOf(hectometerValue).multiply(LENGTH_SCALES[HECTOMETER]).divide(LENGTH_SCALES[KILOMETER]), HECTOMETER);
            Length decameterTestResult = new Length(BigDecimal.valueOf(decameterValue).multiply(LENGTH_SCALES[DECAMETER]).divide(LENGTH_SCALES[KILOMETER]), DECAMETER);
            Length meterTestResult = new Length(BigDecimal.valueOf(meterValue).multiply(LENGTH_SCALES[METER]).divide(LENGTH_SCALES[KILOMETER]), METER);
            Length decimeterTestResult = new Length(BigDecimal.valueOf(decimeterValue).multiply(LENGTH_SCALES[DECIMETER]).divide(LENGTH_SCALES[KILOMETER]), DECIMETER);
            Length centimeterTestResult = new Length(BigDecimal.valueOf(centimeterValue).multiply(LENGTH_SCALES[CENTIMETER]).divide(LENGTH_SCALES[KILOMETER]), CENTIMETER);
            Length millimeterTestResult = new Length(BigDecimal.valueOf(millimeterValue).multiply(LENGTH_SCALES[MILLIMETER]).divide(LENGTH_SCALES[KILOMETER]), MILLIMETER);

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
        } catch (PhysicException e) {
            throw e;
        }
	}

	@Test 
	public void toHectometerTest() throws PhysicException {
		double kilometerValue = getRandomDouble();
		double hectometerValue = getRandomDouble();
		double decameterValue = getRandomDouble();
		double meterValue = getRandomDouble();
		double decimeterValue = getRandomDouble();
		double centimeterValue = getRandomDouble();
		double millimeterValue = getRandomDouble();

        try {
	        Length kilometerTestResult = new Length(BigDecimal.valueOf(kilometerValue).multiply(LENGTH_SCALES[KILOMETER]).divide(LENGTH_SCALES[HECTOMETER]), KILOMETER);
		    Length hectometerTestResult = new Length(BigDecimal.valueOf(hectometerValue).multiply(LENGTH_SCALES[HECTOMETER]).divide(LENGTH_SCALES[HECTOMETER]), HECTOMETER);
	    	Length decameterTestResult = new Length(BigDecimal.valueOf(decameterValue).multiply(LENGTH_SCALES[DECAMETER]).divide(LENGTH_SCALES[HECTOMETER]), DECAMETER);
		    Length meterTestResult = new Length(BigDecimal.valueOf(meterValue).multiply(LENGTH_SCALES[METER]).divide(LENGTH_SCALES[HECTOMETER]), METER);
		    Length decimeterTestResult = new Length(BigDecimal.valueOf(decimeterValue).multiply(LENGTH_SCALES[DECIMETER]).divide(LENGTH_SCALES[HECTOMETER]), DECIMETER);
            Length centimeterTestResult = new Length(BigDecimal.valueOf(centimeterValue).multiply(LENGTH_SCALES[CENTIMETER]).divide(LENGTH_SCALES[HECTOMETER]), CENTIMETER);
		    Length millimeterTestResult = new Length(BigDecimal.valueOf(millimeterValue).multiply(LENGTH_SCALES[MILLIMETER]).divide(LENGTH_SCALES[HECTOMETER]), MILLIMETER);

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
        } catch (PhysicException e) {
            throw e;
        }
	}

	@Test 
	public void toDecameterTest() throws PhysicException {
		double kilometerValue = getRandomDouble();
		double hectometerValue = getRandomDouble();
		double decameterValue = getRandomDouble();
		double meterValue = getRandomDouble();
		double decimeterValue = getRandomDouble();
		double centimeterValue = getRandomDouble();
		double millimeterValue = getRandomDouble();

        try {
            Length kilometerTestResult = new Length(BigDecimal.valueOf(kilometerValue).multiply(LENGTH_SCALES[KILOMETER]).divide(LENGTH_SCALES[DECAMETER]), KILOMETER);
            Length hectometerTestResult = new Length(BigDecimal.valueOf(hectometerValue).multiply(LENGTH_SCALES[HECTOMETER]).divide(LENGTH_SCALES[DECAMETER]), HECTOMETER);
            Length decameterTestResult = new Length(BigDecimal.valueOf(decameterValue).multiply(LENGTH_SCALES[DECAMETER]).divide(LENGTH_SCALES[DECAMETER]), DECAMETER);
            Length meterTestResult = new Length(BigDecimal.valueOf(meterValue).multiply(LENGTH_SCALES[METER]).divide(LENGTH_SCALES[DECAMETER]), METER);
            Length decimeterTestResult = new Length(BigDecimal.valueOf(decimeterValue).multiply(LENGTH_SCALES[DECIMETER]).divide(LENGTH_SCALES[DECAMETER]), DECIMETER);
            Length centimeterTestResult = new Length(BigDecimal.valueOf(centimeterValue).multiply(LENGTH_SCALES[CENTIMETER]).divide(LENGTH_SCALES[DECAMETER]), CENTIMETER);
            Length millimeterTestResult = new Length(BigDecimal.valueOf(millimeterValue).multiply(LENGTH_SCALES[MILLIMETER]).divide(LENGTH_SCALES[DECAMETER]), MILLIMETER);

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
        } catch (PhysicException e) {
            throw e;
        }
	}

	@Test 
	public void toMeterTest() throws PhysicException {
		double kilometerValue = getRandomDouble();
		double hectometerValue = getRandomDouble();
		double decameterValue = getRandomDouble();
		double meterValue = getRandomDouble();
		double decimeterValue = getRandomDouble();
		double centimeterValue = getRandomDouble();
		double millimeterValue = getRandomDouble();

        try {
            Length kilometerTestResult = new Length(BigDecimal.valueOf(kilometerValue).multiply(LENGTH_SCALES[KILOMETER]).divide(LENGTH_SCALES[METER]), KILOMETER);
            Length hectometerTestResult = new Length(BigDecimal.valueOf(hectometerValue).multiply(LENGTH_SCALES[HECTOMETER]).divide(LENGTH_SCALES[METER]), HECTOMETER);
            Length decameterTestResult = new Length(BigDecimal.valueOf(decameterValue).multiply(LENGTH_SCALES[DECAMETER]).divide(LENGTH_SCALES[METER]), DECAMETER);
            Length meterTestResult = new Length(BigDecimal.valueOf(meterValue).multiply(LENGTH_SCALES[METER]).divide(LENGTH_SCALES[METER]), METER);
            Length decimeterTestResult = new Length(BigDecimal.valueOf(decimeterValue).multiply(LENGTH_SCALES[DECIMETER]).divide(LENGTH_SCALES[METER]), DECIMETER);
            Length centimeterTestResult = new Length(BigDecimal.valueOf(centimeterValue).multiply(LENGTH_SCALES[CENTIMETER]).divide(LENGTH_SCALES[METER]), CENTIMETER);
            Length millimeterTestResult = new Length(BigDecimal.valueOf(millimeterValue).multiply(LENGTH_SCALES[MILLIMETER]).divide(LENGTH_SCALES[METER]), MILLIMETER);

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
        } catch (PhysicException e) {
            throw e;
        }
	}

	@Test 
	public void toDecimeterTest() throws PhysicException {
		double kilometerValue = getRandomDouble();
		double hectometerValue = getRandomDouble();
		double decameterValue = getRandomDouble();
		double meterValue = getRandomDouble();
		double decimeterValue = getRandomDouble();
		double centimeterValue = getRandomDouble();
		double millimeterValue = getRandomDouble();

        try {
            Length kilometerTestResult = new Length(BigDecimal.valueOf(kilometerValue).multiply(LENGTH_SCALES[KILOMETER]).divide(LENGTH_SCALES[DECIMETER]), KILOMETER);
            Length hectometerTestResult = new Length(BigDecimal.valueOf(hectometerValue).multiply(LENGTH_SCALES[HECTOMETER]).divide(LENGTH_SCALES[DECIMETER]), HECTOMETER);
            Length decameterTestResult = new Length(BigDecimal.valueOf(decameterValue).multiply(LENGTH_SCALES[DECAMETER]).divide(LENGTH_SCALES[DECIMETER]), DECAMETER);
            Length meterTestResult = new Length(BigDecimal.valueOf(meterValue).multiply(LENGTH_SCALES[METER]).divide(LENGTH_SCALES[DECIMETER]), METER);
            Length decimeterTestResult = new Length(BigDecimal.valueOf(decimeterValue).multiply(LENGTH_SCALES[DECIMETER]).divide(LENGTH_SCALES[DECIMETER]), DECIMETER);
            Length centimeterTestResult = new Length(BigDecimal.valueOf(centimeterValue).multiply(LENGTH_SCALES[CENTIMETER]).divide(LENGTH_SCALES[DECIMETER]), CENTIMETER);
            Length millimeterTestResult = new Length(BigDecimal.valueOf(millimeterValue).multiply(LENGTH_SCALES[MILLIMETER]).divide(LENGTH_SCALES[DECIMETER]), MILLIMETER);

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
        } catch (PhysicException e) {
            throw e;
        }
	}

	@Test 
	public void toCentimeterTest() throws PhysicException {
		double kilometerValue = getRandomDouble();
		double hectometerValue = getRandomDouble();
		double decameterValue = getRandomDouble();
		double meterValue = getRandomDouble();
		double decimeterValue = getRandomDouble();
		double centimeterValue = getRandomDouble();
		double millimeterValue = getRandomDouble();

        try {
            Length kilometerTestResult = new Length(BigDecimal.valueOf(kilometerValue).multiply(LENGTH_SCALES[KILOMETER]).divide(LENGTH_SCALES[CENTIMETER]), KILOMETER);
            Length hectometerTestResult = new Length(BigDecimal.valueOf(hectometerValue).multiply(LENGTH_SCALES[HECTOMETER]).divide(LENGTH_SCALES[CENTIMETER]), HECTOMETER);
            Length decameterTestResult = new Length(BigDecimal.valueOf(decameterValue).multiply(LENGTH_SCALES[DECAMETER]).divide(LENGTH_SCALES[CENTIMETER]), DECAMETER);
            Length meterTestResult = new Length(BigDecimal.valueOf(meterValue).multiply(LENGTH_SCALES[METER]).divide(LENGTH_SCALES[CENTIMETER]), METER);
            Length decimeterTestResult = new Length(BigDecimal.valueOf(decimeterValue).multiply(LENGTH_SCALES[DECIMETER]).divide(LENGTH_SCALES[CENTIMETER]), DECIMETER);
            Length centimeterTestResult = new Length(BigDecimal.valueOf(centimeterValue).multiply(LENGTH_SCALES[CENTIMETER]).divide(LENGTH_SCALES[CENTIMETER]), CENTIMETER);
            Length millimeterTestResult = new Length(BigDecimal.valueOf(millimeterValue).multiply(LENGTH_SCALES[MILLIMETER]).divide(LENGTH_SCALES[CENTIMETER]), MILLIMETER);

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
        } catch (PhysicException e) {
            throw e;
        }
	}

	@Test 
	public void toMillimeterTest() throws PhysicException {
		double kilometerValue = getRandomDouble();
		double hectometerValue = getRandomDouble();
		double decameterValue = getRandomDouble();
		double meterValue = getRandomDouble();
		double decimeterValue = getRandomDouble();
		double centimeterValue = getRandomDouble();
		double millimeterValue = getRandomDouble();

        try {
            Length kilometerTestResult = new Length(BigDecimal.valueOf(kilometerValue).multiply(LENGTH_SCALES[KILOMETER]).divide(LENGTH_SCALES[MILLIMETER]), KILOMETER);
            Length hectometerTestResult = new Length(BigDecimal.valueOf(hectometerValue).multiply(LENGTH_SCALES[HECTOMETER]).divide(LENGTH_SCALES[MILLIMETER]), HECTOMETER);
            Length decameterTestResult = new Length(BigDecimal.valueOf(decameterValue).multiply(LENGTH_SCALES[DECAMETER]).divide(LENGTH_SCALES[MILLIMETER]), DECAMETER);
            Length meterTestResult = new Length(BigDecimal.valueOf(meterValue).multiply(LENGTH_SCALES[METER]).divide(LENGTH_SCALES[MILLIMETER]), METER);
            Length decimeterTestResult = new Length(BigDecimal.valueOf(decimeterValue).multiply(LENGTH_SCALES[DECIMETER]).divide(LENGTH_SCALES[MILLIMETER]), DECIMETER);
            Length centimeterTestResult = new Length(BigDecimal.valueOf(centimeterValue).multiply(LENGTH_SCALES[CENTIMETER]).divide(LENGTH_SCALES[MILLIMETER]), CENTIMETER);
            Length millimeterTestResult = new Length(BigDecimal.valueOf(millimeterValue).multiply(LENGTH_SCALES[MILLIMETER]).divide(LENGTH_SCALES[MILLIMETER]), MILLIMETER);

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
        } catch (PhysicException e) {
            throw e;
        }
	}

	private double getRandomDouble() {
		return random.nextDouble() * 100;
	}
}
