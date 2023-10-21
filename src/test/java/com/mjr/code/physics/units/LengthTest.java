package com.mjr.code.physics.units;

import com.mjr.code.physics.NumberRandomizer;
import org.junit.jupiter.api.Test;

import static com.mjr.code.physics.units.Length.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthTest extends UnitTest{
	@Test 
	public void toKilometerTest() {
		double kilometerValue = NumberRandomizer.getRandomDouble();
		double hectometerValue = NumberRandomizer.getRandomDouble();
		double decameterValue = NumberRandomizer.getRandomDouble();
		double meterValue = NumberRandomizer.getRandomDouble();
		double decimeterValue = NumberRandomizer.getRandomDouble();
		double centimeterValue = NumberRandomizer.getRandomDouble();
	    double millimeterValue = NumberRandomizer.getRandomDouble();

        Length kilometerTestResult = convert(kilometerValue, KILOMETER, KILOMETER);
        Length hectometerTestResult = convert(hectometerValue, HECTOMETER, KILOMETER);
        Length decameterTestResult = convert(decameterValue, DECAMETER, KILOMETER);
        Length meterTestResult = convert(meterValue, METER, KILOMETER);
        Length decimeterTestResult = convert(decimeterValue, DECIMETER, KILOMETER);
        Length centimeterTestResult = convert(centimeterValue, CENTIMETER, KILOMETER);
        Length millimeterTestResult = convert(millimeterValue, MILLIMETER, KILOMETER);

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

        Length kilometerTestResult = convert(kilometerValue, KILOMETER, HECTOMETER);
        Length hectometerTestResult = convert(hectometerValue, HECTOMETER, HECTOMETER);
        Length decameterTestResult = convert(decameterValue, DECAMETER, HECTOMETER);
        Length meterTestResult = convert(meterValue, METER, HECTOMETER);
        Length decimeterTestResult = convert(decimeterValue, DECIMETER, HECTOMETER);
        Length centimeterTestResult = convert(centimeterValue, CENTIMETER, HECTOMETER);
        Length millimeterTestResult = convert(millimeterValue, MILLIMETER, HECTOMETER);

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

        Length kilometerTestResult = convert(kilometerValue, KILOMETER, DECAMETER);
        Length hectometerTestResult = convert(hectometerValue, HECTOMETER, DECAMETER);
        Length decameterTestResult = convert(decameterValue, DECAMETER, DECAMETER);
        Length meterTestResult = convert(meterValue, METER, DECAMETER);
        Length decimeterTestResult = convert(decimeterValue, DECIMETER, DECAMETER);
        Length centimeterTestResult = convert(centimeterValue, CENTIMETER, DECAMETER);
        Length millimeterTestResult = convert(millimeterValue, MILLIMETER, DECAMETER);

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

        Length kilometerTestResult = convert(kilometerValue, KILOMETER, METER);
        Length hectometerTestResult = convert(hectometerValue, HECTOMETER, METER);
        Length decameterTestResult = convert(decameterValue, DECAMETER, METER);
        Length meterTestResult = convert(meterValue, METER, METER);
        Length decimeterTestResult = convert(decimeterValue, DECIMETER, METER);
        Length centimeterTestResult = convert(centimeterValue, CENTIMETER, METER);
        Length millimeterTestResult = convert(millimeterValue, MILLIMETER, METER);

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

        Length kilometerTestResult = convert(kilometerValue, KILOMETER, DECIMETER);
        Length hectometerTestResult = convert(hectometerValue, HECTOMETER, DECIMETER);
        Length decameterTestResult = convert(decameterValue, DECAMETER, DECIMETER);
        Length meterTestResult = convert(meterValue, METER, DECIMETER);
        Length decimeterTestResult = convert(decimeterValue, DECIMETER, DECIMETER);
        Length centimeterTestResult = convert(centimeterValue, CENTIMETER, DECIMETER);
        Length millimeterTestResult = convert(millimeterValue, MILLIMETER, DECIMETER);

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

        Length kilometerTestResult = convert(kilometerValue, KILOMETER, CENTIMETER);
        Length hectometerTestResult = convert(hectometerValue, HECTOMETER, CENTIMETER);
        Length decameterTestResult = convert(decameterValue, DECAMETER, CENTIMETER);
        Length meterTestResult = convert(meterValue, METER, CENTIMETER);
        Length decimeterTestResult = convert(decimeterValue, DECIMETER, CENTIMETER);
        Length centimeterTestResult = convert(centimeterValue, CENTIMETER, CENTIMETER);
        Length millimeterTestResult = convert(millimeterValue, MILLIMETER, CENTIMETER);

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

        Length kilometerTestResult = convert(kilometerValue, KILOMETER, MILLIMETER);
        Length hectometerTestResult = convert(hectometerValue, HECTOMETER, MILLIMETER);
        Length decameterTestResult = convert(decameterValue, DECAMETER, MILLIMETER);
        Length meterTestResult = convert(meterValue, METER, MILLIMETER);
        Length decimeterTestResult = convert(decimeterValue, DECIMETER, MILLIMETER);
        Length centimeterTestResult = convert(centimeterValue, CENTIMETER, MILLIMETER);
        Length millimeterTestResult = convert(millimeterValue, MILLIMETER, MILLIMETER);

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

    @Override
    public Length convert(double value, int currentUnit, int targetUnit) {
        return new Length(divide(multiply(value, LENGTH_SCALES[targetUnit]), LENGTH_SCALES[currentUnit]), targetUnit);
    }
}