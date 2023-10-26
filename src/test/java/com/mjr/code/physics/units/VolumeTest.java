package com.mjr.code.physics.units;

import org.junit.jupiter.api.Test;

import static com.mjr.code.physics.units.Volume.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VolumeTest extends UnitTest {

    private double cubeKilometerValue;
    private double cubeHectometerValue;
    private double cubeDecameterValue;
    private double cubeMeterValue;
    private double cubeDecimeterValue;
    private double cubeCentimeterValue;
    private double cubeMillimeterValue;

    private Volume cubeKilometerTestResult;
    private Volume cubeHectometerTestResult;
    private Volume cubeDecameterTestResult;
    private Volume cubeMeterTestResult;
    private Volume cubeDecimeterTestResult;
    private Volume cubeCentimeterTestResult;
    private Volume cubeMillimeterTestResult;

    private Volume cubeKilometerResult;
    private Volume cubeHectometerResult;
    private Volume cubeDecameterResult;
    private Volume cubeMeterResult;
    private Volume cubeDecimeterResult;
    private Volume cubeCentimeterResult;
    private Volume cubeMillimeterResult;

	@Test 
	public void toCubeKilometerTest() {
		cubeKilometerTestResult = convert(cubeKilometerValue, CUBED_KILOMETER, CUBED_KILOMETER);
        cubeHectometerTestResult = convert(cubeHectometerValue, CUBED_HECTOMETER, CUBED_KILOMETER);
        cubeDecameterTestResult = convert(cubeDecameterValue, CUBED_DECAMETER, CUBED_KILOMETER);
        cubeMeterTestResult = convert(cubeMeterValue, CUBED_METER, CUBED_KILOMETER);
        cubeDecimeterTestResult = convert(cubeDecimeterValue, CUBED_DECIMETER, CUBED_KILOMETER);
        cubeCentimeterTestResult = convert(cubeCentimeterValue, CUBED_CENTIMETER, CUBED_KILOMETER);
        cubeMillimeterTestResult = convert(cubeMillimeterValue, CUBED_MILLIMETER, CUBED_KILOMETER);

        cubeKilometerResult = toCubedKilometer(cubeKilometerValue, CUBED_KILOMETER);
        cubeHectometerResult = toCubedKilometer(cubeHectometerValue, CUBED_HECTOMETER);
        cubeDecameterResult = toCubedKilometer(cubeDecameterValue, CUBED_DECAMETER);
        cubeMeterResult = toCubedKilometer(cubeMeterValue, CUBED_METER);
        cubeDecimeterResult = toCubedKilometer(cubeDecimeterValue, CUBED_DECIMETER);
        cubeCentimeterResult = toCubedKilometer(cubeCentimeterValue, CUBED_CENTIMETER);
        cubeMillimeterResult = toCubedKilometer(cubeMillimeterValue, CUBED_MILLIMETER);

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
		cubeKilometerTestResult = convert(cubeKilometerValue, CUBED_KILOMETER, CUBED_HECTOMETER);
        cubeHectometerTestResult = convert(cubeHectometerValue, CUBED_HECTOMETER, CUBED_HECTOMETER);
        cubeDecameterTestResult = convert(cubeDecameterValue, CUBED_DECAMETER, CUBED_HECTOMETER);
        cubeMeterTestResult = convert(cubeMeterValue, CUBED_METER, CUBED_HECTOMETER);
        cubeDecimeterTestResult = convert(cubeDecimeterValue, CUBED_DECIMETER, CUBED_HECTOMETER);
        cubeCentimeterTestResult = convert(cubeCentimeterValue, CUBED_CENTIMETER, CUBED_HECTOMETER);
        cubeMillimeterTestResult = convert(cubeMillimeterValue, CUBED_MILLIMETER, CUBED_HECTOMETER);

        cubeKilometerResult = toCubedHectometer(cubeKilometerValue, CUBED_KILOMETER);
        cubeHectometerResult = toCubedHectometer(cubeHectometerValue, CUBED_HECTOMETER);
        cubeDecameterResult = toCubedHectometer(cubeDecameterValue, CUBED_DECAMETER);
        cubeMeterResult = toCubedHectometer(cubeMeterValue, CUBED_METER);
        cubeDecimeterResult = toCubedHectometer(cubeDecimeterValue, CUBED_DECIMETER);
        cubeCentimeterResult = toCubedHectometer(cubeCentimeterValue, CUBED_CENTIMETER);
        cubeMillimeterResult = toCubedHectometer(cubeMillimeterValue, CUBED_MILLIMETER);

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
		cubeKilometerTestResult = convert(cubeKilometerValue, CUBED_KILOMETER, CUBED_DECAMETER);
        cubeHectometerTestResult = convert(cubeHectometerValue, CUBED_HECTOMETER, CUBED_DECAMETER);
        cubeDecameterTestResult = convert(cubeDecameterValue, CUBED_DECAMETER, CUBED_DECAMETER);
        cubeMeterTestResult = convert(cubeMeterValue, CUBED_METER, CUBED_DECAMETER);
        cubeDecimeterTestResult = convert(cubeDecimeterValue, CUBED_DECIMETER, CUBED_DECAMETER);
        cubeCentimeterTestResult = convert(cubeCentimeterValue, CUBED_CENTIMETER, CUBED_DECAMETER);
        cubeMillimeterTestResult = convert(cubeMillimeterValue, CUBED_MILLIMETER, CUBED_DECAMETER);

        cubeKilometerResult = toCubedDecameter(cubeKilometerValue, CUBED_KILOMETER);
        cubeHectometerResult = toCubedDecameter(cubeHectometerValue, CUBED_HECTOMETER);
        cubeDecameterResult = toCubedDecameter(cubeDecameterValue, CUBED_DECAMETER);
        cubeMeterResult = toCubedDecameter(cubeMeterValue, CUBED_METER);
        cubeDecimeterResult = toCubedDecameter(cubeDecimeterValue, CUBED_DECIMETER);
        cubeCentimeterResult = toCubedDecameter(cubeCentimeterValue, CUBED_CENTIMETER);
        cubeMillimeterResult = toCubedDecameter(cubeMillimeterValue, CUBED_MILLIMETER);

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
		cubeKilometerTestResult = convert(cubeKilometerValue, CUBED_KILOMETER, CUBED_METER);
        cubeHectometerTestResult = convert(cubeHectometerValue, CUBED_HECTOMETER, CUBED_METER);
        cubeDecameterTestResult = convert(cubeDecameterValue, CUBED_DECAMETER, CUBED_METER);
        cubeMeterTestResult = convert(cubeMeterValue, CUBED_METER, CUBED_METER);
        cubeDecimeterTestResult = convert(cubeDecimeterValue, CUBED_DECIMETER, CUBED_METER);
        cubeCentimeterTestResult = convert(cubeCentimeterValue, CUBED_CENTIMETER, CUBED_METER);
        cubeMillimeterTestResult = convert(cubeMillimeterValue, CUBED_MILLIMETER, CUBED_METER);

        cubeKilometerResult = toCubedMeter(cubeKilometerValue, CUBED_KILOMETER);
        cubeHectometerResult = toCubedMeter(cubeHectometerValue, CUBED_HECTOMETER);
        cubeDecameterResult = toCubedMeter(cubeDecameterValue, CUBED_DECAMETER);
        cubeMeterResult = toCubedMeter(cubeMeterValue, CUBED_METER);
        cubeDecimeterResult = toCubedMeter(cubeDecimeterValue, CUBED_DECIMETER);
        cubeCentimeterResult = toCubedMeter(cubeCentimeterValue, CUBED_CENTIMETER);
        cubeMillimeterResult = toCubedMeter(cubeMillimeterValue, CUBED_MILLIMETER);

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
        cubeKilometerTestResult = convert(cubeKilometerValue, CUBED_KILOMETER, CUBED_DECIMETER);
        cubeHectometerTestResult = convert(cubeHectometerValue, CUBED_HECTOMETER, CUBED_DECIMETER);
        cubeDecameterTestResult = convert(cubeDecameterValue, CUBED_DECAMETER, CUBED_DECIMETER);
        cubeMeterTestResult = convert(cubeMeterValue, CUBED_METER, CUBED_DECIMETER);
        cubeDecimeterTestResult = convert(cubeDecimeterValue, CUBED_DECIMETER, CUBED_DECIMETER);
        cubeCentimeterTestResult = convert(cubeCentimeterValue, CUBED_CENTIMETER, CUBED_DECIMETER);
        cubeMillimeterTestResult = convert(cubeMillimeterValue, CUBED_MILLIMETER, CUBED_DECIMETER);

        cubeKilometerResult = toCubedDecimeter(cubeKilometerValue, CUBED_KILOMETER);
        cubeHectometerResult = toCubedDecimeter(cubeHectometerValue, CUBED_HECTOMETER);
        cubeDecameterResult = toCubedDecimeter(cubeDecameterValue, CUBED_DECAMETER);
        cubeMeterResult = toCubedDecimeter(cubeMeterValue, CUBED_METER);
        cubeDecimeterResult = toCubedDecimeter(cubeDecimeterValue, CUBED_DECIMETER);
        cubeCentimeterResult = toCubedDecimeter(cubeCentimeterValue, CUBED_CENTIMETER);
        cubeMillimeterResult = toCubedDecimeter(cubeMillimeterValue, CUBED_MILLIMETER);

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
        cubeKilometerTestResult = convert(cubeKilometerValue, CUBED_KILOMETER, CUBED_CENTIMETER);
        cubeHectometerTestResult = convert(cubeHectometerValue, CUBED_HECTOMETER, CUBED_CENTIMETER);
        cubeDecameterTestResult = convert(cubeDecameterValue, CUBED_DECAMETER, CUBED_CENTIMETER);
        cubeMeterTestResult = convert(cubeMeterValue, CUBED_METER, CUBED_CENTIMETER);
        cubeDecimeterTestResult = convert(cubeDecimeterValue, CUBED_DECIMETER, CUBED_CENTIMETER);
        cubeCentimeterTestResult = convert(cubeCentimeterValue, CUBED_CENTIMETER, CUBED_CENTIMETER);
        cubeMillimeterTestResult = convert(cubeMillimeterValue, CUBED_MILLIMETER, CUBED_CENTIMETER);

        cubeKilometerResult = toCubedCentimeter(cubeKilometerValue, CUBED_KILOMETER);
        cubeHectometerResult = toCubedCentimeter(cubeHectometerValue, CUBED_HECTOMETER);
        cubeDecameterResult = toCubedCentimeter(cubeDecameterValue, CUBED_DECAMETER);
        cubeMeterResult = toCubedCentimeter(cubeMeterValue, CUBED_METER);
        cubeDecimeterResult = toCubedCentimeter(cubeDecimeterValue, CUBED_DECIMETER);
        cubeCentimeterResult = toCubedCentimeter(cubeCentimeterValue, CUBED_CENTIMETER);
        cubeMillimeterResult = toCubedCentimeter(cubeMillimeterValue, CUBED_MILLIMETER);

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
        cubeKilometerTestResult = convert(cubeKilometerValue, CUBED_KILOMETER, CUBED_MILLIMETER);
        cubeHectometerTestResult = convert(cubeHectometerValue, CUBED_HECTOMETER, CUBED_MILLIMETER);
        cubeDecameterTestResult = convert(cubeDecameterValue, CUBED_DECAMETER, CUBED_MILLIMETER);
        cubeMeterTestResult = convert(cubeMeterValue, CUBED_METER, CUBED_MILLIMETER);
        cubeDecimeterTestResult = convert(cubeDecimeterValue, CUBED_DECIMETER, CUBED_MILLIMETER);
        cubeCentimeterTestResult = convert(cubeCentimeterValue, CUBED_CENTIMETER, CUBED_MILLIMETER);
        cubeMillimeterTestResult = convert(cubeMillimeterValue, CUBED_MILLIMETER, CUBED_MILLIMETER);

        cubeKilometerResult = toCubedMillimeter(cubeKilometerValue, CUBED_KILOMETER);
        cubeHectometerResult = toCubedMillimeter(cubeHectometerValue, CUBED_HECTOMETER);
        cubeDecameterResult = toCubedMillimeter(cubeDecameterValue, CUBED_DECAMETER);
        cubeMeterResult = toCubedMillimeter(cubeMeterValue, CUBED_METER);
        cubeDecimeterResult = toCubedMillimeter(cubeDecimeterValue, CUBED_DECIMETER);
        cubeCentimeterResult = toCubedMillimeter(cubeCentimeterValue, CUBED_CENTIMETER);
        cubeMillimeterResult = toCubedMillimeter(cubeMillimeterValue, CUBED_MILLIMETER);

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
		cubeKilometerValue = 1;
		cubeHectometerValue = 1;
		cubeDecameterValue = 1;
		cubeMeterValue = 1;
		cubeDecimeterValue = 1;
		cubeCentimeterValue = 1;
		cubeMillimeterValue = 1;

        cubeKilometerTestResult = new Volume("1.00000000000000000000", CUBED_KILOMETER);
        cubeHectometerTestResult= new Volume("0.00100000000000000000", CUBED_KILOMETER);
        cubeDecameterTestResult = new Volume("0.00000100000000000000", CUBED_KILOMETER);
        cubeMeterTestResult = new Volume("0.00000000100000000000", CUBED_KILOMETER);
        cubeDecimeterTestResult = new Volume("0.00000000000100000000", CUBED_KILOMETER);
        cubeCentimeterTestResult = new Volume("0.00000000000000100000", CUBED_KILOMETER);
        cubeMillimeterTestResult = new Volume("0.00000000000000000100", CUBED_KILOMETER);

        cubeKilometerResult = toCubedKilometer(cubeKilometerValue, CUBED_KILOMETER);
        cubeHectometerResult = toCubedKilometer(cubeHectometerValue, CUBED_HECTOMETER);
        cubeDecameterResult = toCubedKilometer(cubeDecameterValue, CUBED_DECAMETER);
        cubeMeterResult = toCubedKilometer(cubeMeterValue, CUBED_METER);
        cubeDecimeterResult = toCubedKilometer(cubeDecimeterValue, CUBED_DECIMETER);
        cubeCentimeterResult = toCubedKilometer(cubeCentimeterValue, CUBED_CENTIMETER);
        cubeMillimeterResult = toCubedKilometer(cubeMillimeterValue, CUBED_MILLIMETER);

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
		cubeKilometerValue = 1;
		cubeHectometerValue = 1;
		cubeDecameterValue = 1;
		cubeMeterValue = 1;
		cubeDecimeterValue = 1;
		cubeCentimeterValue = 1;
		cubeMillimeterValue = 1;

        cubeKilometerTestResult = new Volume("1000.00000000000000000000", CUBED_HECTOMETER);
        cubeHectometerTestResult= new Volume("1.00000000000000000000", CUBED_HECTOMETER);
        cubeDecameterTestResult = new Volume("0.00100000000000000000", CUBED_HECTOMETER);
        cubeMeterTestResult = new Volume("0.00000100000000000000", CUBED_HECTOMETER);
        cubeDecimeterTestResult = new Volume("0.00000000100000000000", CUBED_HECTOMETER);
        cubeCentimeterTestResult = new Volume("0.00000000000100000000", CUBED_HECTOMETER);
        cubeMillimeterTestResult = new Volume("0.00000000000000100000", CUBED_HECTOMETER);

        cubeKilometerResult = toCubedHectometer(cubeKilometerValue, CUBED_KILOMETER);
        cubeHectometerResult = toCubedHectometer(cubeHectometerValue, CUBED_HECTOMETER);
        cubeDecameterResult = toCubedHectometer(cubeDecameterValue, CUBED_DECAMETER);
        cubeMeterResult = toCubedHectometer(cubeMeterValue, CUBED_METER);
        cubeDecimeterResult = toCubedHectometer(cubeDecimeterValue, CUBED_DECIMETER);
        cubeCentimeterResult = toCubedHectometer(cubeCentimeterValue, CUBED_CENTIMETER);
        cubeMillimeterResult = toCubedHectometer(cubeMillimeterValue, CUBED_MILLIMETER);

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
		cubeKilometerValue = 1;
		cubeHectometerValue = 1;
		cubeDecameterValue = 1;
		cubeMeterValue = 1;
		cubeDecimeterValue = 1;
		cubeCentimeterValue = 1;
		cubeMillimeterValue = 1;

        cubeKilometerTestResult = new Volume("1000000.00000000000000000000", CUBED_DECAMETER);
        cubeHectometerTestResult= new Volume("1000.00000000000000000000", CUBED_DECAMETER);
        cubeDecameterTestResult = new Volume("1.00000000000000000000", CUBED_DECAMETER);
        cubeMeterTestResult = new Volume("0.00100000000000000000", CUBED_DECAMETER);
        cubeDecimeterTestResult = new Volume("0.00000100000000000000", CUBED_DECAMETER);
        cubeCentimeterTestResult = new Volume("0.00000000100000000000", CUBED_DECAMETER);
        cubeMillimeterTestResult = new Volume("0.00000000000100000000", CUBED_DECAMETER);

        cubeKilometerResult = toCubedDecameter(cubeKilometerValue, CUBED_KILOMETER);
        cubeHectometerResult = toCubedDecameter(cubeHectometerValue, CUBED_HECTOMETER);
        cubeDecameterResult = toCubedDecameter(cubeDecameterValue, CUBED_DECAMETER);
        cubeMeterResult = toCubedDecameter(cubeMeterValue, CUBED_METER);
        cubeDecimeterResult = toCubedDecameter(cubeDecimeterValue, CUBED_DECIMETER);
        cubeCentimeterResult = toCubedDecameter(cubeCentimeterValue, CUBED_CENTIMETER);
        cubeMillimeterResult = toCubedDecameter(cubeMillimeterValue, CUBED_MILLIMETER);

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
		cubeKilometerValue = 1;
		cubeHectometerValue = 1;
		cubeDecameterValue = 1;
		cubeMeterValue = 1;
		cubeDecimeterValue = 1;
		cubeCentimeterValue = 1;
		cubeMillimeterValue = 1;

        cubeKilometerTestResult = new Volume("1000000000.00000000000000000000", CUBED_METER);
        cubeHectometerTestResult= new Volume("1000000.00000000000000000000", CUBED_METER);
        cubeDecameterTestResult = new Volume("1000.00000000000000000000", CUBED_METER);
        cubeMeterTestResult = new Volume("1.00000000000000000000", CUBED_METER);
        cubeDecimeterTestResult = new Volume("0.00100000000000000000", CUBED_METER);
        cubeCentimeterTestResult = new Volume("0.00000100000000000000", CUBED_METER);
        cubeMillimeterTestResult = new Volume("0.00000000100000000000", CUBED_METER);

        cubeKilometerResult = toCubedMeter(cubeKilometerValue, CUBED_KILOMETER);
        cubeHectometerResult = toCubedMeter(cubeHectometerValue, CUBED_HECTOMETER);
        cubeDecameterResult = toCubedMeter(cubeDecameterValue, CUBED_DECAMETER);
        cubeMeterResult = toCubedMeter(cubeMeterValue, CUBED_METER);
        cubeDecimeterResult = toCubedMeter(cubeDecimeterValue, CUBED_DECIMETER);
        cubeCentimeterResult = toCubedMeter(cubeCentimeterValue, CUBED_CENTIMETER);
        cubeMillimeterResult = toCubedMeter(cubeMillimeterValue, CUBED_MILLIMETER);

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
		cubeKilometerValue = 1;
		cubeHectometerValue = 1;
		cubeDecameterValue = 1;
		cubeMeterValue = 1;
		cubeDecimeterValue = 1;
		cubeCentimeterValue = 1;
		cubeMillimeterValue = 1;

        cubeKilometerTestResult = new Volume("1000000000000.00000000000000000000", CUBED_DECIMETER);
        cubeHectometerTestResult= new Volume("1000000000.00000000000000000000", CUBED_DECIMETER);
        cubeDecameterTestResult = new Volume("1000000.00000000000000000000", CUBED_DECIMETER);
        cubeMeterTestResult = new Volume("1000.00000000000000000000", CUBED_DECIMETER);
        cubeDecimeterTestResult = new Volume("1.00000000000000000000", CUBED_DECIMETER);
        cubeCentimeterTestResult = new Volume("0.00100000000000000000", CUBED_DECIMETER);
        cubeMillimeterTestResult = new Volume("0.00000100000000000000", CUBED_DECIMETER);

        cubeKilometerResult = toCubedDecimeter(cubeKilometerValue, CUBED_KILOMETER);
        cubeHectometerResult = toCubedDecimeter(cubeHectometerValue, CUBED_HECTOMETER);
        cubeDecameterResult = toCubedDecimeter(cubeDecameterValue, CUBED_DECAMETER);
        cubeMeterResult = toCubedDecimeter(cubeMeterValue, CUBED_METER);
        cubeDecimeterResult = toCubedDecimeter(cubeDecimeterValue, CUBED_DECIMETER);
        cubeCentimeterResult = toCubedDecimeter(cubeCentimeterValue, CUBED_CENTIMETER);
        cubeMillimeterResult = toCubedDecimeter(cubeMillimeterValue, CUBED_MILLIMETER);

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
		cubeKilometerValue = 1;
		cubeHectometerValue = 1;
		cubeDecameterValue = 1;
		cubeMeterValue = 1;
		cubeDecimeterValue = 1;
		cubeCentimeterValue = 1;
		cubeMillimeterValue = 1;

        cubeKilometerTestResult = new Volume("1000000000000000.00000000000000000000", CUBED_CENTIMETER);
        cubeHectometerTestResult= new Volume("1000000000000.00000000000000000000", CUBED_CENTIMETER);
        cubeDecameterTestResult = new Volume("1000000000.00000000000000000000", CUBED_CENTIMETER);
        cubeMeterTestResult = new Volume("1000000.00000000000000000000", CUBED_CENTIMETER);
        cubeDecimeterTestResult = new Volume("1000.00000000000000000000", CUBED_CENTIMETER);
        cubeCentimeterTestResult = new Volume("1.00000000000000000000", CUBED_CENTIMETER);
        cubeMillimeterTestResult = new Volume("0.00100000000000000000", CUBED_CENTIMETER);

        cubeKilometerResult = toCubedCentimeter(cubeKilometerValue, CUBED_KILOMETER);
        cubeHectometerResult = toCubedCentimeter(cubeHectometerValue, CUBED_HECTOMETER);
        cubeDecameterResult = toCubedCentimeter(cubeDecameterValue, CUBED_DECAMETER);
        cubeMeterResult = toCubedCentimeter(cubeMeterValue, CUBED_METER);
        cubeDecimeterResult = toCubedCentimeter(cubeDecimeterValue, CUBED_DECIMETER);
        cubeCentimeterResult = toCubedCentimeter(cubeCentimeterValue, CUBED_CENTIMETER);
        cubeMillimeterResult = toCubedCentimeter(cubeMillimeterValue, CUBED_MILLIMETER);

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
		cubeKilometerValue = 1;
		cubeHectometerValue = 1;
		cubeDecameterValue = 1;
		cubeMeterValue = 1;
		cubeDecimeterValue = 1;
		cubeCentimeterValue = 1;
		cubeMillimeterValue = 1;

        cubeKilometerTestResult = new Volume("1000000000000000000.00000000000000000000", CUBED_MILLIMETER);
        cubeHectometerTestResult= new Volume("1000000000000000.00000000000000000000", CUBED_MILLIMETER);
        cubeDecameterTestResult = new Volume("1000000000000.00000000000000000000", CUBED_MILLIMETER);
        cubeMeterTestResult = new Volume("1000000000.00000000000000000000", CUBED_MILLIMETER);
        cubeDecimeterTestResult = new Volume("1000000.00000000000000000000", CUBED_MILLIMETER);
        cubeCentimeterTestResult = new Volume("1000.00000000000000000000", CUBED_MILLIMETER);
        cubeMillimeterTestResult = new Volume("1.00000000000000000000", CUBED_MILLIMETER);

        cubeKilometerResult = toCubedMillimeter(cubeKilometerValue, CUBED_KILOMETER);
        cubeHectometerResult = toCubedMillimeter(cubeHectometerValue, CUBED_HECTOMETER);
        cubeDecameterResult = toCubedMillimeter(cubeDecameterValue, CUBED_DECAMETER);
        cubeMeterResult = toCubedMillimeter(cubeMeterValue, CUBED_METER);
        cubeDecimeterResult = toCubedMillimeter(cubeDecimeterValue, CUBED_DECIMETER);
        cubeCentimeterResult = toCubedMillimeter(cubeCentimeterValue, CUBED_CENTIMETER);
        cubeMillimeterResult = toCubedMillimeter(cubeMillimeterValue, CUBED_MILLIMETER);

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
