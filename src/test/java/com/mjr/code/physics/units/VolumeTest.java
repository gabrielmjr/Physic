package com.mjr.code.physics.units;

import com.mjr.code.physics.NumberRandomizer;
import org.junit.jupiter.api.Test;

import static com.mjr.code.physics.units.Volume.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VolumeTest extends UnitTest {
	@Test 
	public void toCubeKilometerTest() {
		double cubeKilometerValue = NumberRandomizer.getRandomDouble();
		double cubeHectometerValue = NumberRandomizer.getRandomDouble();
		double cubeDecameterValue = NumberRandomizer.getRandomDouble();
		double cubeMeterValue = NumberRandomizer.getRandomDouble();
		double cubeDecimeterValue = NumberRandomizer.getRandomDouble();
		double cubeCentimeterValue = NumberRandomizer.getRandomDouble();
	    double cubeMillimeterValue = NumberRandomizer.getRandomDouble();

        Volume cubeKilometerTestResult = convert(cubeKilometerValue, CUBED_KILOMETER, CUBED_KILOMETER);
        Volume cubeHectometerTestResult = convert(cubeHectometerValue, CUBED_HECTOMETER, CUBED_KILOMETER);
        Volume cubeDecameterTestResult = convert(cubeDecameterValue, CUBED_DECAMETER, CUBED_KILOMETER);
        Volume cubeMeterTestResult = convert(cubeMeterValue, CUBED_METER, CUBED_KILOMETER);
        Volume cubeDecimeterTestResult = convert(cubeDecimeterValue, CUBED_DECIMETER, CUBED_KILOMETER);
        Volume cubeCentimeterTestResult = convert(cubeCentimeterValue, CUBED_CENTIMETER, CUBED_KILOMETER);
        Volume cubeMillimeterTestResult = convert(cubeMillimeterValue, CUBED_MILLIMETER, CUBED_KILOMETER);

        Volume cubeKilometerResult = toCubedKilometer(cubeKilometerValue, CUBED_KILOMETER);
        Volume cubeHectometerResult = toCubedKilometer(cubeHectometerValue, CUBED_HECTOMETER);
        Volume cubeDecameterResult = toCubedKilometer(cubeDecameterValue, CUBED_DECAMETER);
        Volume cubeMeterResult = toCubedKilometer(cubeMeterValue, CUBED_METER);
        Volume cubeDecimeterResult = toCubedKilometer(cubeDecimeterValue, CUBED_DECIMETER);
        Volume cubeCentimeterResult = toCubedKilometer(cubeCentimeterValue, CUBED_CENTIMETER);
        Volume cubeMillimeterResult = toCubedKilometer(cubeMillimeterValue, CUBED_MILLIMETER);

        assertEquals(cubeKilometerTestResult, cubeKilometerResult);
        assertEquals(cubeHectometerTestResult, cubeHectometerResult);
        assertEquals(cubeDecameterTestResult, cubeDecameterResult);
        assertEquals(cubeMeterTestResult, cubeMeterResult);
        assertEquals(cubeDecimeterTestResult, cubeDecimeterResult);
        assertEquals(cubeCentimeterTestResult, cubeCentimeterResult);
        assertEquals(cubeMillimeterTestResult, cubeMillimeterResult);
    }

	@Test 
	public void toCubeHectometerTest() {
		double cubeKilometerValue = NumberRandomizer.getRandomDouble();
		double cubeHectometerValue = NumberRandomizer.getRandomDouble();
		double cubeDecameterValue = NumberRandomizer.getRandomDouble();
		double cubeMeterValue = NumberRandomizer.getRandomDouble();
		double cubeDecimeterValue = NumberRandomizer.getRandomDouble();
		double cubeCentimeterValue = NumberRandomizer.getRandomDouble();
		double cubeMillimeterValue = NumberRandomizer.getRandomDouble();

        Volume cubeKilometerTestResult = convert(cubeKilometerValue, CUBED_KILOMETER, CUBED_HECTOMETER);
        Volume cubeHectometerTestResult = convert(cubeHectometerValue, CUBED_HECTOMETER, CUBED_HECTOMETER);
        Volume cubeDecameterTestResult = convert(cubeDecameterValue, CUBED_DECAMETER, CUBED_HECTOMETER);
        Volume cubeMeterTestResult = convert(cubeMeterValue, CUBED_METER, CUBED_HECTOMETER);
        Volume cubeDecimeterTestResult = convert(cubeDecimeterValue, CUBED_DECIMETER, CUBED_HECTOMETER);
        Volume cubeCentimeterTestResult = convert(cubeCentimeterValue, CUBED_CENTIMETER, CUBED_HECTOMETER);
        Volume cubeMillimeterTestResult = convert(cubeMillimeterValue, CUBED_MILLIMETER, CUBED_HECTOMETER);

        Volume cubeKilometerResult = toCubedHectometer(cubeKilometerValue, CUBED_KILOMETER);
        Volume cubeHectometerResult = toCubedHectometer(cubeHectometerValue, CUBED_HECTOMETER);
        Volume cubeDecameterResult = toCubedHectometer(cubeDecameterValue, CUBED_DECAMETER);
        Volume cubeMeterResult = toCubedHectometer(cubeMeterValue, CUBED_METER);
        Volume cubeDecimeterResult = toCubedHectometer(cubeDecimeterValue, CUBED_DECIMETER);
        Volume cubeCentimeterResult = toCubedHectometer(cubeCentimeterValue, CUBED_CENTIMETER);
        Volume cubeMillimeterResult = toCubedHectometer(cubeMillimeterValue, CUBED_MILLIMETER);

        assertEquals(cubeKilometerTestResult, cubeKilometerResult);
        assertEquals(cubeHectometerTestResult, cubeHectometerResult);
        assertEquals(cubeDecameterTestResult, cubeDecameterResult);
        assertEquals(cubeMeterTestResult, cubeMeterResult);
        assertEquals(cubeDecimeterTestResult, cubeDecimeterResult);
        assertEquals(cubeCentimeterTestResult, cubeCentimeterResult);
        assertEquals(cubeMillimeterTestResult, cubeMillimeterResult);
    }

	@Test 
	public void toCubeDecameterTest() {
		double cubeKilometerValue = NumberRandomizer.getRandomDouble();
		double cubeHectometerValue = NumberRandomizer.getRandomDouble();
		double cubeDecameterValue = NumberRandomizer.getRandomDouble();
		double cubeMeterValue = NumberRandomizer.getRandomDouble();
		double cubeDecimeterValue = NumberRandomizer.getRandomDouble();
		double cubeCentimeterValue = NumberRandomizer.getRandomDouble();
		double cubeMillimeterValue = NumberRandomizer.getRandomDouble();

        Volume cubeKilometerTestResult = convert(cubeKilometerValue, CUBED_KILOMETER, CUBED_DECAMETER);
        Volume cubeHectometerTestResult = convert(cubeHectometerValue, CUBED_HECTOMETER, CUBED_DECAMETER);
        Volume cubeDecameterTestResult = convert(cubeDecameterValue, CUBED_DECAMETER, CUBED_DECAMETER);
        Volume cubeMeterTestResult = convert(cubeMeterValue, CUBED_METER, CUBED_DECAMETER);
        Volume cubeDecimeterTestResult = convert(cubeDecimeterValue, CUBED_DECIMETER, CUBED_DECAMETER);
        Volume cubeCentimeterTestResult = convert(cubeCentimeterValue, CUBED_CENTIMETER, CUBED_DECAMETER);
        Volume cubeMillimeterTestResult = convert(cubeMillimeterValue, CUBED_MILLIMETER, CUBED_DECAMETER);

        Volume cubeKilometerResult = toCubedDecameter(cubeKilometerValue, CUBED_KILOMETER);
        Volume cubeHectometerResult = toCubedDecameter(cubeHectometerValue, CUBED_HECTOMETER);
        Volume cubeDecameterResult = toCubedDecameter(cubeDecameterValue, CUBED_DECAMETER);
        Volume cubeMeterResult = toCubedDecameter(cubeMeterValue, CUBED_METER);
        Volume cubeDecimeterResult = toCubedDecameter(cubeDecimeterValue, CUBED_DECIMETER);
        Volume cubeCentimeterResult = toCubedDecameter(cubeCentimeterValue, CUBED_CENTIMETER);
        Volume cubeMillimeterResult = toCubedDecameter(cubeMillimeterValue, CUBED_MILLIMETER);

        assertEquals(cubeKilometerTestResult, cubeKilometerResult);
        assertEquals(cubeHectometerTestResult, cubeHectometerResult);
        assertEquals(cubeDecameterTestResult, cubeDecameterResult);
        assertEquals(cubeMeterTestResult, cubeMeterResult);
        assertEquals(cubeDecimeterTestResult, cubeDecimeterResult);
        assertEquals(cubeCentimeterTestResult, cubeCentimeterResult);
        assertEquals(cubeMillimeterTestResult, cubeMillimeterResult);
    }

	@Test 
	public void toCubeMeterTest() {
		double cubeKilometerValue = NumberRandomizer.getRandomDouble();
		double cubeHectometerValue = NumberRandomizer.getRandomDouble();
		double cubeDecameterValue = NumberRandomizer.getRandomDouble();
		double cubeMeterValue = NumberRandomizer.getRandomDouble();
		double cubeDecimeterValue = NumberRandomizer.getRandomDouble();
		double cubeCentimeterValue = NumberRandomizer.getRandomDouble();
		double cubeMillimeterValue = NumberRandomizer.getRandomDouble();

        Volume cubeKilometerTestResult = convert(cubeKilometerValue, CUBED_KILOMETER, CUBED_METER);
        Volume cubeHectometerTestResult = convert(cubeHectometerValue, CUBED_HECTOMETER, CUBED_METER);
        Volume cubeDecameterTestResult = convert(cubeDecameterValue, CUBED_DECAMETER, CUBED_METER);
        Volume cubeMeterTestResult = convert(cubeMeterValue, CUBED_METER, CUBED_METER);
        Volume cubeDecimeterTestResult = convert(cubeDecimeterValue, CUBED_DECIMETER, CUBED_METER);
        Volume cubeCentimeterTestResult = convert(cubeCentimeterValue, CUBED_CENTIMETER, CUBED_METER);
        Volume cubeMillimeterTestResult = convert(cubeMillimeterValue, CUBED_MILLIMETER, CUBED_METER);

        Volume cubeKilometerResult = toCubedMeter(cubeKilometerValue, CUBED_KILOMETER);
        Volume cubeHectometerResult = toCubedMeter(cubeHectometerValue, CUBED_HECTOMETER);
        Volume cubeDecameterResult = toCubedMeter(cubeDecameterValue, CUBED_DECAMETER);
        Volume cubeMeterResult = toCubedMeter(cubeMeterValue, CUBED_METER);
        Volume cubeDecimeterResult = toCubedMeter(cubeDecimeterValue, CUBED_DECIMETER);
        Volume cubeCentimeterResult = toCubedMeter(cubeCentimeterValue, CUBED_CENTIMETER);
        Volume cubeMillimeterResult = toCubedMeter(cubeMillimeterValue, CUBED_MILLIMETER);

        assertEquals(cubeKilometerTestResult, cubeKilometerResult);
        assertEquals(cubeHectometerTestResult, cubeHectometerResult);
        assertEquals(cubeDecameterTestResult, cubeDecameterResult);
        assertEquals(cubeMeterTestResult, cubeMeterResult);
        assertEquals(cubeDecimeterTestResult, cubeDecimeterResult);
        assertEquals(cubeCentimeterTestResult, cubeCentimeterResult);
        assertEquals(cubeMillimeterTestResult, cubeMillimeterResult);
    }

	@Test 
	public void toCubeDecimeterTest() {
		double cubeKilometerValue = NumberRandomizer.getRandomDouble();
		double cubeHectometerValue = NumberRandomizer.getRandomDouble();
		double cubeDecameterValue = NumberRandomizer.getRandomDouble();
		double cubeMeterValue = NumberRandomizer.getRandomDouble();
		double cubeDecimeterValue = NumberRandomizer.getRandomDouble();
		double cubeCentimeterValue = NumberRandomizer.getRandomDouble();
		double cubeMillimeterValue = NumberRandomizer.getRandomDouble();

        Volume cubeKilometerTestResult = convert(cubeKilometerValue, CUBED_KILOMETER, CUBED_DECIMETER);
        Volume cubeHectometerTestResult = convert(cubeHectometerValue, CUBED_HECTOMETER, CUBED_DECIMETER);
        Volume cubeDecameterTestResult = convert(cubeDecameterValue, CUBED_DECAMETER, CUBED_DECIMETER);
        Volume cubeMeterTestResult = convert(cubeMeterValue, CUBED_METER, CUBED_DECIMETER);
        Volume cubeDecimeterTestResult = convert(cubeDecimeterValue, CUBED_DECIMETER, CUBED_DECIMETER);
        Volume cubeCentimeterTestResult = convert(cubeCentimeterValue, CUBED_CENTIMETER, CUBED_DECIMETER);
        Volume cubeMillimeterTestResult = convert(cubeMillimeterValue, CUBED_MILLIMETER, CUBED_DECIMETER);

        Volume cubeKilometerResult = toCubedDecimeter(cubeKilometerValue, CUBED_KILOMETER);
        Volume cubeHectometerResult = toCubedDecimeter(cubeHectometerValue, CUBED_HECTOMETER);
        Volume cubeDecameterResult = toCubedDecimeter(cubeDecameterValue, CUBED_DECAMETER);
        Volume cubeMeterResult = toCubedDecimeter(cubeMeterValue, CUBED_METER);
        Volume cubeDecimeterResult = toCubedDecimeter(cubeDecimeterValue, CUBED_DECIMETER);
        Volume cubeCentimeterResult = toCubedDecimeter(cubeCentimeterValue, CUBED_CENTIMETER);
        Volume cubeMillimeterResult = toCubedDecimeter(cubeMillimeterValue, CUBED_MILLIMETER);

        assertEquals(cubeKilometerTestResult, cubeKilometerResult);
        assertEquals(cubeHectometerTestResult, cubeHectometerResult);
        assertEquals(cubeDecameterTestResult, cubeDecameterResult);
        assertEquals(cubeMeterTestResult, cubeMeterResult);
        assertEquals(cubeDecimeterTestResult, cubeDecimeterResult);
        assertEquals(cubeCentimeterTestResult, cubeCentimeterResult);
        assertEquals(cubeMillimeterTestResult, cubeMillimeterResult);
    }

	@Test 
	public void toCubeCentimeterTest() {
		double cubeKilometerValue = NumberRandomizer.getRandomDouble();
		double cubeHectometerValue = NumberRandomizer.getRandomDouble();
		double cubeDecameterValue = NumberRandomizer.getRandomDouble();
		double cubeMeterValue = NumberRandomizer.getRandomDouble();
		double cubeDecimeterValue = NumberRandomizer.getRandomDouble();
		double cubeCentimeterValue = NumberRandomizer.getRandomDouble();
		double cubeMillimeterValue = NumberRandomizer.getRandomDouble();

        Volume cubeKilometerTestResult = convert(cubeKilometerValue, CUBED_KILOMETER, CUBED_CENTIMETER);
        Volume cubeHectometerTestResult = convert(cubeHectometerValue, CUBED_HECTOMETER, CUBED_CENTIMETER);
        Volume cubeDecameterTestResult = convert(cubeDecameterValue, CUBED_DECAMETER, CUBED_CENTIMETER);
        Volume cubeMeterTestResult = convert(cubeMeterValue, CUBED_METER, CUBED_CENTIMETER);
        Volume cubeDecimeterTestResult = convert(cubeDecimeterValue, CUBED_DECIMETER, CUBED_CENTIMETER);
        Volume cubeCentimeterTestResult = convert(cubeCentimeterValue, CUBED_CENTIMETER, CUBED_CENTIMETER);
        Volume cubeMillimeterTestResult = convert(cubeMillimeterValue, CUBED_MILLIMETER, CUBED_CENTIMETER);

        Volume cubeKilometerResult = toCubedCentimeter(cubeKilometerValue, CUBED_KILOMETER);
        Volume cubeHectometerResult = toCubedCentimeter(cubeHectometerValue, CUBED_HECTOMETER);
        Volume cubeDecameterResult = toCubedCentimeter(cubeDecameterValue, CUBED_DECAMETER);
        Volume cubeMeterResult = toCubedCentimeter(cubeMeterValue, CUBED_METER);
        Volume cubeDecimeterResult = toCubedCentimeter(cubeDecimeterValue, CUBED_DECIMETER);
        Volume cubeCentimeterResult = toCubedCentimeter(cubeCentimeterValue, CUBED_CENTIMETER);
        Volume cubeMillimeterResult = toCubedCentimeter(cubeMillimeterValue, CUBED_MILLIMETER);

        assertEquals(cubeKilometerTestResult, cubeKilometerResult);
        assertEquals(cubeHectometerTestResult, cubeHectometerResult);
        assertEquals(cubeDecameterTestResult, cubeDecameterResult);
        assertEquals(cubeMeterTestResult, cubeMeterResult);
        assertEquals(cubeDecimeterTestResult, cubeDecimeterResult);
        assertEquals(cubeCentimeterTestResult, cubeCentimeterResult);
        assertEquals(cubeMillimeterTestResult, cubeMillimeterResult);
    }

	@Test 
	public void toCubeMillimeterTest() {
		double cubeKilometerValue = NumberRandomizer.getRandomDouble();
		double cubeHectometerValue = NumberRandomizer.getRandomDouble();
		double cubeDecameterValue = NumberRandomizer.getRandomDouble();
		double cubeMeterValue = NumberRandomizer.getRandomDouble();
		double cubeDecimeterValue = NumberRandomizer.getRandomDouble();
		double cubeCentimeterValue = NumberRandomizer.getRandomDouble();
		double cubeMillimeterValue = NumberRandomizer.getRandomDouble();

        Volume cubeKilometerTestResult = convert(cubeKilometerValue, CUBED_KILOMETER, CUBED_MILLIMETER);
        Volume cubeHectometerTestResult = convert(cubeHectometerValue, CUBED_HECTOMETER, CUBED_MILLIMETER);
        Volume cubeDecameterTestResult = convert(cubeDecameterValue, CUBED_DECAMETER, CUBED_MILLIMETER);
        Volume cubeMeterTestResult = convert(cubeMeterValue, CUBED_METER, CUBED_MILLIMETER);
        Volume cubeDecimeterTestResult = convert(cubeDecimeterValue, CUBED_DECIMETER, CUBED_MILLIMETER);
        Volume cubeCentimeterTestResult = convert(cubeCentimeterValue, CUBED_CENTIMETER, CUBED_MILLIMETER);
        Volume cubeMillimeterTestResult = convert(cubeMillimeterValue, CUBED_MILLIMETER, CUBED_MILLIMETER);

        Volume cubeKilometerResult = toCubedMillimeter(cubeKilometerValue, CUBED_KILOMETER);
        Volume cubeHectometerResult = toCubedMillimeter(cubeHectometerValue, CUBED_HECTOMETER);
        Volume cubeDecameterResult = toCubedMillimeter(cubeDecameterValue, CUBED_DECAMETER);
        Volume cubeMeterResult = toCubedMillimeter(cubeMeterValue, CUBED_METER);
        Volume cubeDecimeterResult = toCubedMillimeter(cubeDecimeterValue, CUBED_DECIMETER);
        Volume cubeCentimeterResult = toCubedMillimeter(cubeCentimeterValue, CUBED_CENTIMETER);
        Volume cubeMillimeterResult = toCubedMillimeter(cubeMillimeterValue, CUBED_MILLIMETER);

        assertEquals(cubeKilometerTestResult, cubeKilometerResult);
        assertEquals(cubeHectometerTestResult, cubeHectometerResult);
        assertEquals(cubeDecameterTestResult, cubeDecameterResult);
        assertEquals(cubeMeterTestResult, cubeMeterResult);
        assertEquals(cubeDecimeterTestResult, cubeDecimeterResult);
        assertEquals(cubeCentimeterTestResult, cubeCentimeterResult);
        assertEquals(cubeMillimeterTestResult, cubeMillimeterResult);
    }
	
	@Test
	public void toCubeKilometerFixedResultTest() {
		int cubeKilometerValue = 1;
		int cubeHectometerValue = 1;
		int cubeDecameterValue = 1;
		int cubeMeterValue = 1;
		int cubeDecimeterValue = 1;
		int cubeCentimeterValue = 1;
		int cubeMillimeterValue = 1;

        Volume cubeKilometerTestResult = new Volume("1.00000000000000000000", CUBED_KILOMETER);
        Volume cubeHectometerTestResult= new Volume("0.00100000000000000000", CUBED_KILOMETER);
        Volume cubeDecameterTestResult = new Volume("0.00000100000000000000", CUBED_KILOMETER);
        Volume cubeMeterTestResult = new Volume("0.00000000100000000000", CUBED_KILOMETER);
        Volume cubeDecimeterTestResult = new Volume("0.00000000000100000000", CUBED_KILOMETER);
        Volume cubeCentimeterTestResult = new Volume("0.00000000000000100000", CUBED_KILOMETER);
        Volume cubeMillimeterTestResult = new Volume("0.00000000000000000100", CUBED_KILOMETER);

        Volume cubeKilometerResult = toCubedKilometer(cubeKilometerValue, CUBED_KILOMETER);
        Volume cubeHectometerResult = toCubedKilometer(cubeHectometerValue, CUBED_HECTOMETER);
        Volume cubeDecameterResult = toCubedKilometer(cubeDecameterValue, CUBED_DECAMETER);
        Volume cubeMeterResult = toCubedKilometer(cubeMeterValue, CUBED_METER);
        Volume cubeDecimeterResult = toCubedKilometer(cubeDecimeterValue, CUBED_DECIMETER);
        Volume cubeCentimeterResult = toCubedKilometer(cubeCentimeterValue, CUBED_CENTIMETER);
        Volume cubeMillimeterResult = toCubedKilometer(cubeMillimeterValue, CUBED_MILLIMETER);

        assertEquals(cubeKilometerTestResult, cubeKilometerResult);
        assertEquals(cubeHectometerTestResult, cubeHectometerResult);
        assertEquals(cubeDecameterTestResult, cubeDecameterResult);
        assertEquals(cubeMeterTestResult, cubeMeterResult);
        assertEquals(cubeDecimeterTestResult, cubeDecimeterResult);
        assertEquals(cubeCentimeterTestResult, cubeCentimeterResult);
        assertEquals(cubeMillimeterTestResult, cubeMillimeterResult);
    }
	
	@Test
	public void toCubeHectometerFixedResultTest() {
		int cubeKilometerValue = 1;
		int cubeHectometerValue = 1;
		int cubeDecameterValue = 1;
		int cubeMeterValue = 1;
		int cubeDecimeterValue = 1;
		int cubeCentimeterValue = 1;
		int cubeMillimeterValue = 1;

        Volume cubeKilometerTestResult = new Volume("1000.00000000000000000000", CUBED_HECTOMETER);
        Volume cubeHectometerTestResult= new Volume("1.00000000000000000000", CUBED_HECTOMETER);
        Volume cubeDecameterTestResult = new Volume("0.00100000000000000000", CUBED_HECTOMETER);
        Volume cubeMeterTestResult = new Volume("0.00000100000000000000", CUBED_HECTOMETER);
        Volume cubeDecimeterTestResult = new Volume("0.00000000100000000000", CUBED_HECTOMETER);
        Volume cubeCentimeterTestResult = new Volume("0.00000000000100000000", CUBED_HECTOMETER);
        Volume cubeMillimeterTestResult = new Volume("0.00000000000000100000", CUBED_HECTOMETER);

        Volume cubeKilometerResult = toCubedHectometer(cubeKilometerValue, CUBED_KILOMETER);
        Volume cubeHectometerResult = toCubedHectometer(cubeHectometerValue, CUBED_HECTOMETER);
        Volume cubeDecameterResult = toCubedHectometer(cubeDecameterValue, CUBED_DECAMETER);
        Volume cubeMeterResult = toCubedHectometer(cubeMeterValue, CUBED_METER);
        Volume cubeDecimeterResult = toCubedHectometer(cubeDecimeterValue, CUBED_DECIMETER);
        Volume cubeCentimeterResult = toCubedHectometer(cubeCentimeterValue, CUBED_CENTIMETER);
        Volume cubeMillimeterResult = toCubedHectometer(cubeMillimeterValue, CUBED_MILLIMETER);

        assertEquals(cubeKilometerTestResult, cubeKilometerResult);
        assertEquals(cubeHectometerTestResult, cubeHectometerResult);
        assertEquals(cubeDecameterTestResult, cubeDecameterResult);
        assertEquals(cubeMeterTestResult, cubeMeterResult);
        assertEquals(cubeDecimeterTestResult, cubeDecimeterResult);
        assertEquals(cubeCentimeterTestResult, cubeCentimeterResult);
        assertEquals(cubeMillimeterTestResult, cubeMillimeterResult);
    }

	@Test
	public void toCubeDecameterFixedResultTest() {
		int cubeKilometerValue = 1;
		int cubeHectometerValue = 1;
		int cubeDecameterValue = 1;
		int cubeMeterValue = 1;
		int cubeDecimeterValue = 1;
		int cubeCentimeterValue = 1;
		int cubeMillimeterValue = 1;

        Volume cubeKilometerTestResult = new Volume("1000000.00000000000000000000", CUBED_DECAMETER);
        Volume cubeHectometerTestResult= new Volume("1000.00000000000000000000", CUBED_DECAMETER);
        Volume cubeDecameterTestResult = new Volume("1.00000000000000000000", CUBED_DECAMETER);
        Volume cubeMeterTestResult = new Volume("0.00100000000000000000", CUBED_DECAMETER);
        Volume cubeDecimeterTestResult = new Volume("0.00000100000000000000", CUBED_DECAMETER);
        Volume cubeCentimeterTestResult = new Volume("0.00000000100000000000", CUBED_DECAMETER);
        Volume cubeMillimeterTestResult = new Volume("0.00000000000100000000", CUBED_DECAMETER);

        Volume cubeKilometerResult = toCubedDecameter(cubeKilometerValue, CUBED_KILOMETER);
        Volume cubeHectometerResult = toCubedDecameter(cubeHectometerValue, CUBED_HECTOMETER);
        Volume cubeDecameterResult = toCubedDecameter(cubeDecameterValue, CUBED_DECAMETER);
        Volume cubeMeterResult = toCubedDecameter(cubeMeterValue, CUBED_METER);
        Volume cubeDecimeterResult = toCubedDecameter(cubeDecimeterValue, CUBED_DECIMETER);
        Volume cubeCentimeterResult = toCubedDecameter(cubeCentimeterValue, CUBED_CENTIMETER);
        Volume cubeMillimeterResult = toCubedDecameter(cubeMillimeterValue, CUBED_MILLIMETER);

        assertEquals(cubeKilometerTestResult, cubeKilometerResult);
        assertEquals(cubeHectometerTestResult, cubeHectometerResult);
        assertEquals(cubeDecameterTestResult, cubeDecameterResult);
        assertEquals(cubeMeterTestResult, cubeMeterResult);
        assertEquals(cubeDecimeterTestResult, cubeDecimeterResult);
        assertEquals(cubeCentimeterTestResult, cubeCentimeterResult);
        assertEquals(cubeMillimeterTestResult, cubeMillimeterResult);
    }
	
	@Test
	public void toCubeMeterFixedResultTest() {
		int cubeKilometerValue = 1;
		int cubeHectometerValue = 1;
		int cubeDecameterValue = 1;
		int cubeMeterValue = 1;
		int cubeDecimeterValue = 1;
		int cubeCentimeterValue = 1;
		int cubeMillimeterValue = 1;

        Volume cubeKilometerTestResult = new Volume("1000000000.00000000000000000000", CUBED_METER);
        Volume cubeHectometerTestResult= new Volume("1000000.00000000000000000000", CUBED_METER);
        Volume cubeDecameterTestResult = new Volume("1000.00000000000000000000", CUBED_METER);
        Volume cubeMeterTestResult = new Volume("1.00000000000000000000", CUBED_METER);
        Volume cubeDecimeterTestResult = new Volume("0.00100000000000000000", CUBED_METER);
        Volume cubeCentimeterTestResult = new Volume("0.00000100000000000000", CUBED_METER);
        Volume cubeMillimeterTestResult = new Volume("0.00000000100000000000", CUBED_METER);

        Volume cubeKilometerResult = toCubedMeter(cubeKilometerValue, CUBED_KILOMETER);
        Volume cubeHectometerResult = toCubedMeter(cubeHectometerValue, CUBED_HECTOMETER);
        Volume cubeDecameterResult = toCubedMeter(cubeDecameterValue, CUBED_DECAMETER);
        Volume cubeMeterResult = toCubedMeter(cubeMeterValue, CUBED_METER);
        Volume cubeDecimeterResult = toCubedMeter(cubeDecimeterValue, CUBED_DECIMETER);
        Volume cubeCentimeterResult = toCubedMeter(cubeCentimeterValue, CUBED_CENTIMETER);
        Volume cubeMillimeterResult = toCubedMeter(cubeMillimeterValue, CUBED_MILLIMETER);

        assertEquals(cubeKilometerTestResult, cubeKilometerResult);
        assertEquals(cubeHectometerTestResult, cubeHectometerResult);
        assertEquals(cubeDecameterTestResult, cubeDecameterResult);
        assertEquals(cubeMeterTestResult, cubeMeterResult);
        assertEquals(cubeDecimeterTestResult, cubeDecimeterResult);
        assertEquals(cubeCentimeterTestResult, cubeCentimeterResult);
        assertEquals(cubeMillimeterTestResult, cubeMillimeterResult);
    }
	
	@Test
	public void toCubeDecimeterFixedResultTest() {
		int cubeKilometerValue = 1;
		int cubeHectometerValue = 1;
		int cubeDecameterValue = 1;
		int cubeMeterValue = 1;
		int cubeDecimeterValue = 1;
		int cubeCentimeterValue = 1;
		int cubeMillimeterValue = 1;

        Volume cubeKilometerTestResult = new Volume("1000000000000.00000000000000000000", CUBED_DECIMETER);
        Volume cubeHectometerTestResult= new Volume("1000000000.00000000000000000000", CUBED_DECIMETER);
        Volume cubeDecameterTestResult = new Volume("1000000.00000000000000000000", CUBED_DECIMETER);
        Volume cubeMeterTestResult = new Volume("1000.00000000000000000000", CUBED_DECIMETER);
        Volume cubeDecimeterTestResult = new Volume("1.00000000000000000000", CUBED_DECIMETER);
        Volume cubeCentimeterTestResult = new Volume("0.00100000000000000000", CUBED_DECIMETER);
        Volume cubeMillimeterTestResult = new Volume("0.00000100000000000000", CUBED_DECIMETER);

        Volume cubeKilometerResult = toCubedDecimeter(cubeKilometerValue, CUBED_KILOMETER);
        Volume cubeHectometerResult = toCubedDecimeter(cubeHectometerValue, CUBED_HECTOMETER);
        Volume cubeDecameterResult = toCubedDecimeter(cubeDecameterValue, CUBED_DECAMETER);
        Volume cubeMeterResult = toCubedDecimeter(cubeMeterValue, CUBED_METER);
        Volume cubeDecimeterResult = toCubedDecimeter(cubeDecimeterValue, CUBED_DECIMETER);
        Volume cubeCentimeterResult = toCubedDecimeter(cubeCentimeterValue, CUBED_CENTIMETER);
        Volume cubeMillimeterResult = toCubedDecimeter(cubeMillimeterValue, CUBED_MILLIMETER);

        assertEquals(cubeKilometerTestResult, cubeKilometerResult);
        assertEquals(cubeHectometerTestResult, cubeHectometerResult);
        assertEquals(cubeDecameterTestResult, cubeDecameterResult);
        assertEquals(cubeMeterTestResult, cubeMeterResult);
        assertEquals(cubeDecimeterTestResult, cubeDecimeterResult);
        assertEquals(cubeCentimeterTestResult, cubeCentimeterResult);
        assertEquals(cubeMillimeterTestResult, cubeMillimeterResult);
    }
	
	@Test
	public void toCubeCentimeterFixedResultTest() {
		int cubeKilometerValue = 1;
		int cubeHectometerValue = 1;
		int cubeDecameterValue = 1;
		int cubeMeterValue = 1;
		int cubeDecimeterValue = 1;
		int cubeCentimeterValue = 1;
		int cubeMillimeterValue = 1;

        Volume cubeKilometerTestResult = new Volume("1000000000000000.00000000000000000000", CUBED_CENTIMETER);
        Volume cubeHectometerTestResult= new Volume("1000000000000.00000000000000000000", CUBED_CENTIMETER);
        Volume cubeDecameterTestResult = new Volume("1000000000.00000000000000000000", CUBED_CENTIMETER);
        Volume cubeMeterTestResult = new Volume("1000000.00000000000000000000", CUBED_CENTIMETER);
        Volume cubeDecimeterTestResult = new Volume("1000.00000000000000000000", CUBED_CENTIMETER);
        Volume cubeCentimeterTestResult = new Volume("1.00000000000000000000", CUBED_CENTIMETER);
        Volume cubeMillimeterTestResult = new Volume("0.00100000000000000000", CUBED_CENTIMETER);

        Volume cubeKilometerResult = toCubedCentimeter(cubeKilometerValue, CUBED_KILOMETER);
        Volume cubeHectometerResult = toCubedCentimeter(cubeHectometerValue, CUBED_HECTOMETER);
        Volume cubeDecameterResult = toCubedCentimeter(cubeDecameterValue, CUBED_DECAMETER);
        Volume cubeMeterResult = toCubedCentimeter(cubeMeterValue, CUBED_METER);
        Volume cubeDecimeterResult = toCubedCentimeter(cubeDecimeterValue, CUBED_DECIMETER);
        Volume cubeCentimeterResult = toCubedCentimeter(cubeCentimeterValue, CUBED_CENTIMETER);
        Volume cubeMillimeterResult = toCubedCentimeter(cubeMillimeterValue, CUBED_MILLIMETER);

        assertEquals(cubeKilometerTestResult, cubeKilometerResult);
        assertEquals(cubeHectometerTestResult, cubeHectometerResult);
        assertEquals(cubeDecameterTestResult, cubeDecameterResult);
        assertEquals(cubeMeterTestResult, cubeMeterResult);
        assertEquals(cubeDecimeterTestResult, cubeDecimeterResult);
        assertEquals(cubeCentimeterTestResult, cubeCentimeterResult);
        assertEquals(cubeMillimeterTestResult, cubeMillimeterResult);
    }
	
	@Test
	public void toCubeMillimeterFixedResultTest() {
		int cubeKilometerValue = 1;
		int cubeHectometerValue = 1;
		int cubeDecameterValue = 1;
		int cubeMeterValue = 1;
		int cubeDecimeterValue = 1;
		int cubeCentimeterValue = 1;
		int cubeMillimeterValue = 1;

        Volume cubeKilometerTestResult = new Volume("1000000000000000000.00000000000000000000", CUBED_MILLIMETER);
        Volume cubeHectometerTestResult= new Volume("1000000000000000.00000000000000000000", CUBED_MILLIMETER);
        Volume cubeDecameterTestResult = new Volume("1000000000000.00000000000000000000", CUBED_MILLIMETER);
        Volume cubeMeterTestResult = new Volume("1000000000.00000000000000000000", CUBED_MILLIMETER);
        Volume cubeDecimeterTestResult = new Volume("1000000.00000000000000000000", CUBED_MILLIMETER);
        Volume cubeCentimeterTestResult = new Volume("1000.00000000000000000000", CUBED_MILLIMETER);
        Volume cubeMillimeterTestResult = new Volume("1.00000000000000000000", CUBED_MILLIMETER);

        Volume cubeKilometerResult = toCubedMillimeter(cubeKilometerValue, CUBED_KILOMETER);
        Volume cubeHectometerResult = toCubedMillimeter(cubeHectometerValue, CUBED_HECTOMETER);
        Volume cubeDecameterResult = toCubedMillimeter(cubeDecameterValue, CUBED_DECAMETER);
        Volume cubeMeterResult = toCubedMillimeter(cubeMeterValue, CUBED_METER);
        Volume cubeDecimeterResult = toCubedMillimeter(cubeDecimeterValue, CUBED_DECIMETER);
        Volume cubeCentimeterResult = toCubedMillimeter(cubeCentimeterValue, CUBED_CENTIMETER);
        Volume cubeMillimeterResult = toCubedMillimeter(cubeMillimeterValue, CUBED_MILLIMETER);

        assertEquals(cubeKilometerTestResult, cubeKilometerResult);
        assertEquals(cubeHectometerTestResult, cubeHectometerResult);
        assertEquals(cubeDecameterTestResult, cubeDecameterResult);
        assertEquals(cubeMeterTestResult, cubeMeterResult);
        assertEquals(cubeDecimeterTestResult, cubeDecimeterResult);
        assertEquals(cubeCentimeterTestResult, cubeCentimeterResult);
        assertEquals(cubeMillimeterTestResult, cubeMillimeterResult);
    }

    @Override
    public Volume convert(double value, int currentUnit, int targetUnit) {
        return new Volume(divide(multiply(value, VOLUME_SCALES[targetUnit - UNIT_SCALE]), VOLUME_SCALES[currentUnit - UNIT_SCALE]), targetUnit);
    }
}
