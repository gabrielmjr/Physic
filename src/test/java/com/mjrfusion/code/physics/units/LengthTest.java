package com.mjrfusion.code.physics.units;

import com.mjrfusion.code.physics.NumberRandomizer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.mjrfusion.code.physics.units.Length.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthTest extends UnitTest {

    private double kilometerValue;
    private double hectometerValue;
    private double decameterValue;
    private double meterValue;
    private double decimeterValue;
    private double centimeterValue;
    private double millimeterValue;

    private Length kilometerTestResult;
    private Length hectometerTestResult;
    private Length decameterTestResult;
    private Length meterTestResult;
    private Length decimeterTestResult;
    private Length centimeterTestResult;
    private Length millimeterTestResult;

    private Length kilometerResult;
    private Length hectometerResult;
    private Length decameterResult;
    private Length meterResult;
    private Length decimeterResult;
    private Length centimeterResult;
    private Length millimeterResult;

    @BeforeEach
    void run () {
        kilometerValue = NumberRandomizer.getRandomDouble();
        hectometerValue = NumberRandomizer.getRandomDouble();
        decameterValue = NumberRandomizer.getRandomDouble();
        meterValue = NumberRandomizer.getRandomDouble();
        decimeterValue = NumberRandomizer.getRandomDouble();
        centimeterValue = NumberRandomizer.getRandomDouble();
        millimeterValue = NumberRandomizer.getRandomDouble();
    }

	@Test 
	public void toKilometerTest() {
        kilometerTestResult = convert(kilometerValue, KILOMETER, KILOMETER);
        hectometerTestResult = convert(hectometerValue, HECTOMETER, KILOMETER);
        decameterTestResult = convert(decameterValue, DECAMETER, KILOMETER);
        meterTestResult = convert(meterValue, METER, KILOMETER);
        decimeterTestResult = convert(decimeterValue, DECIMETER, KILOMETER);
        centimeterTestResult = convert(centimeterValue, CENTIMETER, KILOMETER);
        millimeterTestResult = convert(millimeterValue, MILLIMETER, KILOMETER);

        kilometerResult = toKilometer(kilometerValue, KILOMETER);
        hectometerResult = toKilometer(hectometerValue, HECTOMETER);
        decameterResult = toKilometer(decameterValue, DECAMETER);
        meterResult = toKilometer(meterValue, METER);
        decimeterResult = toKilometer(decimeterValue, DECIMETER);
        centimeterResult = toKilometer(centimeterValue, CENTIMETER);
        millimeterResult = toKilometer(millimeterValue, MILLIMETER);

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
        kilometerTestResult = convert(kilometerValue, KILOMETER, HECTOMETER);
        hectometerTestResult = convert(hectometerValue, HECTOMETER, HECTOMETER);
        decameterTestResult = convert(decameterValue, DECAMETER, HECTOMETER);
        meterTestResult = convert(meterValue, METER, HECTOMETER);
        decimeterTestResult = convert(decimeterValue, DECIMETER, HECTOMETER);
        centimeterTestResult = convert(centimeterValue, CENTIMETER, HECTOMETER);
        millimeterTestResult = convert(millimeterValue, MILLIMETER, HECTOMETER);

        kilometerResult = toHectometer(kilometerValue, KILOMETER);
        hectometerResult = toHectometer(hectometerValue, HECTOMETER);
        decameterResult = toHectometer(decameterValue, DECAMETER);
        meterResult = toHectometer(meterValue, METER);
        decimeterResult = toHectometer(decimeterValue, DECIMETER);
        centimeterResult = toHectometer(centimeterValue, CENTIMETER);
        millimeterResult = toHectometer(millimeterValue, MILLIMETER);

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
        kilometerTestResult = convert(kilometerValue, KILOMETER, DECAMETER);
        hectometerTestResult = convert(hectometerValue, HECTOMETER, DECAMETER);
        decameterTestResult = convert(decameterValue, DECAMETER, DECAMETER);
        meterTestResult = convert(meterValue, METER, DECAMETER);
        decimeterTestResult = convert(decimeterValue, DECIMETER, DECAMETER);
        centimeterTestResult = convert(centimeterValue, CENTIMETER, DECAMETER);
        millimeterTestResult = convert(millimeterValue, MILLIMETER, DECAMETER);

        kilometerResult = toDecameter(kilometerValue, KILOMETER);
        hectometerResult = toDecameter(hectometerValue, HECTOMETER);
        decameterResult = toDecameter(decameterValue, DECAMETER);
        meterResult = toDecameter(meterValue, METER);
        decimeterResult = toDecameter(decimeterValue, DECIMETER);
        centimeterResult = toDecameter(centimeterValue, CENTIMETER);
        millimeterResult = toDecameter(millimeterValue, MILLIMETER);

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
        kilometerTestResult = convert(kilometerValue, KILOMETER, METER);
        hectometerTestResult = convert(hectometerValue, HECTOMETER, METER);
        decameterTestResult = convert(decameterValue, DECAMETER, METER);
        meterTestResult = convert(meterValue, METER, METER);
        decimeterTestResult = convert(decimeterValue, DECIMETER, METER);
        centimeterTestResult = convert(centimeterValue, CENTIMETER, METER);
        millimeterTestResult = convert(millimeterValue, MILLIMETER, METER);

        kilometerResult = toMeter(kilometerValue, KILOMETER);
        hectometerResult = toMeter(hectometerValue, HECTOMETER);
        decameterResult = toMeter(decameterValue, DECAMETER);
        meterResult = toMeter(meterValue, METER);
        decimeterResult = toMeter(decimeterValue, DECIMETER);
        centimeterResult = toMeter(centimeterValue, CENTIMETER);
        millimeterResult = toMeter(millimeterValue, MILLIMETER);

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
        kilometerTestResult = convert(kilometerValue, KILOMETER, DECIMETER);
        hectometerTestResult = convert(hectometerValue, HECTOMETER, DECIMETER);
        decameterTestResult = convert(decameterValue, DECAMETER, DECIMETER);
        meterTestResult = convert(meterValue, METER, DECIMETER);
        decimeterTestResult = convert(decimeterValue, DECIMETER, DECIMETER);
        centimeterTestResult = convert(centimeterValue, CENTIMETER, DECIMETER);
        millimeterTestResult = convert(millimeterValue, MILLIMETER, DECIMETER);

        kilometerResult = toDecimeter(kilometerValue, KILOMETER);
        hectometerResult = toDecimeter(hectometerValue, HECTOMETER);
        decameterResult = toDecimeter(decameterValue, DECAMETER);
        meterResult = toDecimeter(meterValue, METER);
        decimeterResult = toDecimeter(decimeterValue, DECIMETER);
        centimeterResult = toDecimeter(centimeterValue, CENTIMETER);
        millimeterResult = toDecimeter(millimeterValue, MILLIMETER);

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
        kilometerTestResult = convert(kilometerValue, KILOMETER, CENTIMETER);
        hectometerTestResult = convert(hectometerValue, HECTOMETER, CENTIMETER);
        decameterTestResult = convert(decameterValue, DECAMETER, CENTIMETER);
        meterTestResult = convert(meterValue, METER, CENTIMETER);
        decimeterTestResult = convert(decimeterValue, DECIMETER, CENTIMETER);
        centimeterTestResult = convert(centimeterValue, CENTIMETER, CENTIMETER);
        millimeterTestResult = convert(millimeterValue, MILLIMETER, CENTIMETER);

        kilometerResult = toCentimeter(kilometerValue, KILOMETER);
        hectometerResult = toCentimeter(hectometerValue, HECTOMETER);
        decameterResult = toCentimeter(decameterValue, DECAMETER);
        meterResult = toCentimeter(meterValue, METER);
        decimeterResult = toCentimeter(decimeterValue, DECIMETER);
        centimeterResult = toCentimeter(centimeterValue, CENTIMETER);
        millimeterResult = toCentimeter(millimeterValue, MILLIMETER);

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
        kilometerTestResult = convert(kilometerValue, KILOMETER, MILLIMETER);
        hectometerTestResult = convert(hectometerValue, HECTOMETER, MILLIMETER);
        decameterTestResult = convert(decameterValue, DECAMETER, MILLIMETER);
        meterTestResult = convert(meterValue, METER, MILLIMETER);
        decimeterTestResult = convert(decimeterValue, DECIMETER, MILLIMETER);
        centimeterTestResult = convert(centimeterValue, CENTIMETER, MILLIMETER);
        millimeterTestResult = convert(millimeterValue, MILLIMETER, MILLIMETER);

        kilometerResult = toMillimeter(kilometerValue, KILOMETER);
        hectometerResult = toMillimeter(hectometerValue, HECTOMETER);
        decameterResult = toMillimeter(decameterValue, DECAMETER);
        meterResult = toMillimeter(meterValue, METER);
        decimeterResult = toMillimeter(decimeterValue, DECIMETER);
        centimeterResult = toMillimeter(centimeterValue, CENTIMETER);
        millimeterResult = toMillimeter(millimeterValue, MILLIMETER);

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
		kilometerValue = 1;
		hectometerValue = 1;
		decameterValue = 1;
		meterValue = 1;
		decimeterValue = 1;
		centimeterValue = 1;
		millimeterValue = 1;

        kilometerTestResult = new Length("1.00000000000000000000", KILOMETER);
        hectometerTestResult= new Length("0.10000000000000000000", KILOMETER);
        decameterTestResult = new Length("0.01000000000000000000", KILOMETER);
        meterTestResult = new Length("0.00100000000000000000", KILOMETER);
        decimeterTestResult = new Length("0.00010000000000000000", KILOMETER);
        centimeterTestResult = new Length("0.00001000000000000000", KILOMETER);
        millimeterTestResult = new Length("0.00000100000000000000", KILOMETER);

        kilometerResult = toKilometer(kilometerValue, KILOMETER);
        hectometerResult = toKilometer(hectometerValue, HECTOMETER);
        decameterResult = toKilometer(decameterValue, DECAMETER);
        meterResult = toKilometer(meterValue, METER);
        decimeterResult = toKilometer(decimeterValue, DECIMETER);
        centimeterResult = toKilometer(centimeterValue, CENTIMETER);
        millimeterResult = toKilometer(millimeterValue, MILLIMETER);

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
		kilometerValue = 1;
		hectometerValue = 1;
		decameterValue = 1;
		meterValue = 1;
		decimeterValue = 1;
		centimeterValue = 1;
		millimeterValue = 1;

        kilometerTestResult = new Length("10.00000000000000000000", HECTOMETER);
        hectometerTestResult= new Length("1.00000000000000000000", HECTOMETER);
        decameterTestResult = new Length("0.10000000000000000000", HECTOMETER);
        meterTestResult = new Length("0.01000000000000000000", HECTOMETER);
        decimeterTestResult = new Length("0.00100000000000000000", HECTOMETER);
        centimeterTestResult = new Length("0.00010000000000000000", HECTOMETER);
        millimeterTestResult = new Length("0.00001000000000000000", HECTOMETER);

        kilometerResult = toHectometer(kilometerValue, KILOMETER);
        hectometerResult = toHectometer(hectometerValue, HECTOMETER);
        decameterResult = toHectometer(decameterValue, DECAMETER);
        meterResult = toHectometer(meterValue, METER);
        decimeterResult = toHectometer(decimeterValue, DECIMETER);
        centimeterResult = toHectometer(centimeterValue, CENTIMETER);
        millimeterResult = toHectometer(millimeterValue, MILLIMETER);

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
        kilometerValue = 1;
        hectometerValue = 1;
        decameterValue = 1;
        meterValue = 1;
        decimeterValue = 1;
        centimeterValue = 1;
        millimeterValue = 1;

        kilometerTestResult = new Length("100.00000000000000000000", DECAMETER);
        hectometerTestResult= new Length("10.00000000000000000000", DECAMETER);
        decameterTestResult = new Length("1.00000000000000000000", DECAMETER);
        meterTestResult = new Length("0.10000000000000000000", DECAMETER);
        decimeterTestResult = new Length("0.01000000000000000000", DECAMETER);
        centimeterTestResult = new Length("0.00100000000000000000", DECAMETER);
        millimeterTestResult = new Length("0.00010000000000000000", DECAMETER);

        kilometerResult = toDecameter(kilometerValue, KILOMETER);
        hectometerResult = toDecameter(hectometerValue, HECTOMETER);
        decameterResult = toDecameter(decameterValue, DECAMETER);
        meterResult = toDecameter(meterValue, METER);
        decimeterResult = toDecameter(decimeterValue, DECIMETER);
        centimeterResult = toDecameter(centimeterValue, CENTIMETER);
        millimeterResult = toDecameter(millimeterValue, MILLIMETER);

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
		kilometerValue = 1;
		hectometerValue = 1;
		decameterValue = 1;
		meterValue = 1;
		decimeterValue = 1;
		centimeterValue = 1;
		millimeterValue = 1;

        kilometerTestResult = new Length("1000.00000000000000000000", METER);
        hectometerTestResult= new Length("100.00000000000000000000", METER);
        decameterTestResult = new Length("10.00000000000000000000", METER);
        meterTestResult = new Length("1.00000000000000000000", METER);
        decimeterTestResult = new Length("0.10000000000000000000", METER);
        centimeterTestResult = new Length("0.01000000000000000000", METER);
        millimeterTestResult = new Length("0.00100000000000000000", METER);

        kilometerResult = toMeter(kilometerValue, KILOMETER);
        hectometerResult = toMeter(hectometerValue, HECTOMETER);
        decameterResult = toMeter(decameterValue, DECAMETER);
        meterResult = toMeter(meterValue, METER);
        decimeterResult = toMeter(decimeterValue, DECIMETER);
        centimeterResult = toMeter(centimeterValue, CENTIMETER);
        millimeterResult = toMeter(millimeterValue, MILLIMETER);

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
		kilometerValue = 1;
		hectometerValue = 1;
		decameterValue = 1;
		meterValue = 1;
		decimeterValue = 1;
		centimeterValue = 1;
		millimeterValue = 1;

        kilometerTestResult = new Length("10000.00000000000000000000", DECIMETER);
        hectometerTestResult= new Length("1000.00000000000000000000", DECIMETER);
        decameterTestResult = new Length("100.00000000000000000000", DECIMETER);
        meterTestResult = new Length("10.00000000000000000000", DECIMETER);
        decimeterTestResult = new Length("1.00000000000000000000", DECIMETER);
        centimeterTestResult = new Length("0.10000000000000000000", DECIMETER);
        millimeterTestResult = new Length("0.01000000000000000000", DECIMETER);

        kilometerResult = toDecimeter(kilometerValue, KILOMETER);
        hectometerResult = toDecimeter(hectometerValue, HECTOMETER);
        decameterResult = toDecimeter(decameterValue, DECAMETER);
        meterResult = toDecimeter(meterValue, METER);
        decimeterResult = toDecimeter(decimeterValue, DECIMETER);
        centimeterResult = toDecimeter(centimeterValue, CENTIMETER);
        millimeterResult = toDecimeter(millimeterValue, MILLIMETER);

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
		kilometerValue = 1;
		hectometerValue = 1;
		decameterValue = 1;
		meterValue = 1;
		decimeterValue = 1;
		centimeterValue = 1;
		millimeterValue = 1;

        kilometerTestResult = new Length("100000.00000000000000000000", CENTIMETER);
        hectometerTestResult= new Length("10000.00000000000000000000", CENTIMETER);
        decameterTestResult = new Length("1000.00000000000000000000", CENTIMETER);
        meterTestResult = new Length("100.00000000000000000000", CENTIMETER);
        decimeterTestResult = new Length("10.00000000000000000000", CENTIMETER);
        centimeterTestResult = new Length("1.00000000000000000000", CENTIMETER);
        millimeterTestResult = new Length("0.10000000000000000000", CENTIMETER);

        kilometerResult = toCentimeter(kilometerValue, KILOMETER);
        hectometerResult = toCentimeter(hectometerValue, HECTOMETER);
        decameterResult = toCentimeter(decameterValue, DECAMETER);
        meterResult = toCentimeter(meterValue, METER);
        decimeterResult = toCentimeter(decimeterValue, DECIMETER);
        centimeterResult = toCentimeter(centimeterValue, CENTIMETER);
        millimeterResult = toCentimeter(millimeterValue, MILLIMETER);

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
		kilometerValue = 1;
		hectometerValue = 1;
		decameterValue = 1;
		meterValue = 1;
		decimeterValue = 1;
		centimeterValue = 1;
		millimeterValue = 1;

        kilometerTestResult = new Length("1000000.00000000000000000000", MILLIMETER);
        hectometerTestResult= new Length("100000.00000000000000000000", MILLIMETER);
        decameterTestResult = new Length("10000.00000000000000000000", MILLIMETER);
        meterTestResult = new Length("1000.00000000000000000000", MILLIMETER);
        decimeterTestResult = new Length("100.00000000000000000000", MILLIMETER);
        centimeterTestResult = new Length("10.00000000000000000000", MILLIMETER);
        millimeterTestResult = new Length("1.00000000000000000000", MILLIMETER);

        kilometerResult = toMillimeter(kilometerValue, KILOMETER);
        hectometerResult = toMillimeter(hectometerValue, HECTOMETER);
        decameterResult = toMillimeter(decameterValue, DECAMETER);
        meterResult = toMillimeter(meterValue, METER);
        decimeterResult = toMillimeter(decimeterValue, DECIMETER);
        centimeterResult = toMillimeter(centimeterValue, CENTIMETER);
        millimeterResult = toMillimeter(millimeterValue, MILLIMETER);

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