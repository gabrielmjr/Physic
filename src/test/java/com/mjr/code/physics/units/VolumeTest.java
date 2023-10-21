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

        Volume cubeKilometerTestResult = convert(cubeKilometerValue, CUBE_KILOMETER, CUBE_KILOMETER);
        Volume cubeHectometerTestResult = convert(cubeHectometerValue, CUBE_HECTOMETER, CUBE_KILOMETER);
        Volume cubeDecameterTestResult = convert(cubeDecameterValue, CUBE_DECAMETER, CUBE_KILOMETER);
        Volume cubeMeterTestResult = convert(cubeMeterValue, CUBE_METER, CUBE_KILOMETER);
        Volume cubeDecimeterTestResult = convert(cubeDecimeterValue, CUBE_DECIMETER, CUBE_KILOMETER);
        Volume cubeCentimeterTestResult = convert(cubeCentimeterValue, CUBE_CENTIMETER, CUBE_KILOMETER);
        Volume cubeMillimeterTestResult = convert(cubeMillimeterValue, CUBE_MILLIMETER, CUBE_KILOMETER);

        Volume cubeKilometerResult = toCubeKilometer(cubeKilometerValue, CUBE_KILOMETER);
        Volume cubeHectometerResult = toCubeKilometer(cubeHectometerValue, CUBE_HECTOMETER);
        Volume cubeDecameterResult = toCubeKilometer(cubeDecameterValue, CUBE_DECAMETER);
        Volume cubeMeterResult = toCubeKilometer(cubeMeterValue, CUBE_METER);
        Volume cubeDecimeterResult = toCubeKilometer(cubeDecimeterValue, CUBE_DECIMETER);
        Volume cubeCentimeterResult = toCubeKilometer(cubeCentimeterValue, CUBE_CENTIMETER);
        Volume cubeMillimeterResult = toCubeKilometer(cubeMillimeterValue, CUBE_MILLIMETER);

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

        Volume cubeKilometerTestResult = convert(cubeKilometerValue, CUBE_KILOMETER, CUBE_HECTOMETER);
        Volume cubeHectometerTestResult = convert(cubeHectometerValue, CUBE_HECTOMETER, CUBE_HECTOMETER);
        Volume cubeDecameterTestResult = convert(cubeDecameterValue, CUBE_DECAMETER, CUBE_HECTOMETER);
        Volume cubeMeterTestResult = convert(cubeMeterValue, CUBE_METER, CUBE_HECTOMETER);
        Volume cubeDecimeterTestResult = convert(cubeDecimeterValue, CUBE_DECIMETER, CUBE_HECTOMETER);
        Volume cubeCentimeterTestResult = convert(cubeCentimeterValue, CUBE_CENTIMETER, CUBE_HECTOMETER);
        Volume cubeMillimeterTestResult = convert(cubeMillimeterValue, CUBE_MILLIMETER, CUBE_HECTOMETER);

        Volume cubeKilometerResult = toCubeHectometer(cubeKilometerValue, CUBE_KILOMETER);
        Volume cubeHectometerResult = toCubeHectometer(cubeHectometerValue, CUBE_HECTOMETER);
        Volume cubeDecameterResult = toCubeHectometer(cubeDecameterValue, CUBE_DECAMETER);
        Volume cubeMeterResult = toCubeHectometer(cubeMeterValue, CUBE_METER);
        Volume cubeDecimeterResult = toCubeHectometer(cubeDecimeterValue, CUBE_DECIMETER);
        Volume cubeCentimeterResult = toCubeHectometer(cubeCentimeterValue, CUBE_CENTIMETER);
        Volume cubeMillimeterResult = toCubeHectometer(cubeMillimeterValue, CUBE_MILLIMETER);

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

        Volume cubeKilometerTestResult = convert(cubeKilometerValue, CUBE_KILOMETER, CUBE_DECAMETER);
        Volume cubeHectometerTestResult = convert(cubeHectometerValue, CUBE_HECTOMETER, CUBE_DECAMETER);
        Volume cubeDecameterTestResult = convert(cubeDecameterValue, CUBE_DECAMETER, CUBE_DECAMETER);
        Volume cubeMeterTestResult = convert(cubeMeterValue, CUBE_METER, CUBE_DECAMETER);
        Volume cubeDecimeterTestResult = convert(cubeDecimeterValue, CUBE_DECIMETER, CUBE_DECAMETER);
        Volume cubeCentimeterTestResult = convert(cubeCentimeterValue, CUBE_CENTIMETER, CUBE_DECAMETER);
        Volume cubeMillimeterTestResult = convert(cubeMillimeterValue, CUBE_MILLIMETER, CUBE_DECAMETER);

        Volume cubeKilometerResult = toCubeDecameter(cubeKilometerValue, CUBE_KILOMETER);
        Volume cubeHectometerResult = toCubeDecameter(cubeHectometerValue, CUBE_HECTOMETER);
        Volume cubeDecameterResult = toCubeDecameter(cubeDecameterValue, CUBE_DECAMETER);
        Volume cubeMeterResult = toCubeDecameter(cubeMeterValue, CUBE_METER);
        Volume cubeDecimeterResult = toCubeDecameter(cubeDecimeterValue, CUBE_DECIMETER);
        Volume cubeCentimeterResult = toCubeDecameter(cubeCentimeterValue, CUBE_CENTIMETER);
        Volume cubeMillimeterResult = toCubeDecameter(cubeMillimeterValue, CUBE_MILLIMETER);

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

        Volume cubeKilometerTestResult = convert(cubeKilometerValue, CUBE_KILOMETER, CUBE_METER);
        Volume cubeHectometerTestResult = convert(cubeHectometerValue, CUBE_HECTOMETER, CUBE_METER);
        Volume cubeDecameterTestResult = convert(cubeDecameterValue, CUBE_DECAMETER, CUBE_METER);
        Volume cubeMeterTestResult = convert(cubeMeterValue, CUBE_METER, CUBE_METER);
        Volume cubeDecimeterTestResult = convert(cubeDecimeterValue, CUBE_DECIMETER, CUBE_METER);
        Volume cubeCentimeterTestResult = convert(cubeCentimeterValue, CUBE_CENTIMETER, CUBE_METER);
        Volume cubeMillimeterTestResult = convert(cubeMillimeterValue, CUBE_MILLIMETER, CUBE_METER);

        Volume cubeKilometerResult = toCubeMeter(cubeKilometerValue, CUBE_KILOMETER);
        Volume cubeHectometerResult = toCubeMeter(cubeHectometerValue, CUBE_HECTOMETER);
        Volume cubeDecameterResult = toCubeMeter(cubeDecameterValue, CUBE_DECAMETER);
        Volume cubeMeterResult = toCubeMeter(cubeMeterValue, CUBE_METER);
        Volume cubeDecimeterResult = toCubeMeter(cubeDecimeterValue, CUBE_DECIMETER);
        Volume cubeCentimeterResult = toCubeMeter(cubeCentimeterValue, CUBE_CENTIMETER);
        Volume cubeMillimeterResult = toCubeMeter(cubeMillimeterValue, CUBE_MILLIMETER);

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

        Volume cubeKilometerTestResult = convert(cubeKilometerValue, CUBE_KILOMETER, CUBE_DECIMETER);
        Volume cubeHectometerTestResult = convert(cubeHectometerValue, CUBE_HECTOMETER, CUBE_DECIMETER);
        Volume cubeDecameterTestResult = convert(cubeDecameterValue, CUBE_DECAMETER, CUBE_DECIMETER);
        Volume cubeMeterTestResult = convert(cubeMeterValue, CUBE_METER, CUBE_DECIMETER);
        Volume cubeDecimeterTestResult = convert(cubeDecimeterValue, CUBE_DECIMETER, CUBE_DECIMETER);
        Volume cubeCentimeterTestResult = convert(cubeCentimeterValue, CUBE_CENTIMETER, CUBE_DECIMETER);
        Volume cubeMillimeterTestResult = convert(cubeMillimeterValue, CUBE_MILLIMETER, CUBE_DECIMETER);

        Volume cubeKilometerResult = toCubeDecimeter(cubeKilometerValue, CUBE_KILOMETER);
        Volume cubeHectometerResult = toCubeDecimeter(cubeHectometerValue, CUBE_HECTOMETER);
        Volume cubeDecameterResult = toCubeDecimeter(cubeDecameterValue, CUBE_DECAMETER);
        Volume cubeMeterResult = toCubeDecimeter(cubeMeterValue, CUBE_METER);
        Volume cubeDecimeterResult = toCubeDecimeter(cubeDecimeterValue, CUBE_DECIMETER);
        Volume cubeCentimeterResult = toCubeDecimeter(cubeCentimeterValue, CUBE_CENTIMETER);
        Volume cubeMillimeterResult = toCubeDecimeter(cubeMillimeterValue, CUBE_MILLIMETER);

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

        Volume cubeKilometerTestResult = convert(cubeKilometerValue, CUBE_KILOMETER, CUBE_CENTIMETER);
        Volume cubeHectometerTestResult = convert(cubeHectometerValue, CUBE_HECTOMETER, CUBE_CENTIMETER);
        Volume cubeDecameterTestResult = convert(cubeDecameterValue, CUBE_DECAMETER, CUBE_CENTIMETER);
        Volume cubeMeterTestResult = convert(cubeMeterValue, CUBE_METER, CUBE_CENTIMETER);
        Volume cubeDecimeterTestResult = convert(cubeDecimeterValue, CUBE_DECIMETER, CUBE_CENTIMETER);
        Volume cubeCentimeterTestResult = convert(cubeCentimeterValue, CUBE_CENTIMETER, CUBE_CENTIMETER);
        Volume cubeMillimeterTestResult = convert(cubeMillimeterValue, CUBE_MILLIMETER, CUBE_CENTIMETER);

        Volume cubeKilometerResult = toCubeCentimeter(cubeKilometerValue, CUBE_KILOMETER);
        Volume cubeHectometerResult = toCubeCentimeter(cubeHectometerValue, CUBE_HECTOMETER);
        Volume cubeDecameterResult = toCubeCentimeter(cubeDecameterValue, CUBE_DECAMETER);
        Volume cubeMeterResult = toCubeCentimeter(cubeMeterValue, CUBE_METER);
        Volume cubeDecimeterResult = toCubeCentimeter(cubeDecimeterValue, CUBE_DECIMETER);
        Volume cubeCentimeterResult = toCubeCentimeter(cubeCentimeterValue, CUBE_CENTIMETER);
        Volume cubeMillimeterResult = toCubeCentimeter(cubeMillimeterValue, CUBE_MILLIMETER);

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

        Volume cubeKilometerTestResult = convert(cubeKilometerValue, CUBE_KILOMETER, CUBE_MILLIMETER);
        Volume cubeHectometerTestResult = convert(cubeHectometerValue, CUBE_HECTOMETER, CUBE_MILLIMETER);
        Volume cubeDecameterTestResult = convert(cubeDecameterValue, CUBE_DECAMETER, CUBE_MILLIMETER);
        Volume cubeMeterTestResult = convert(cubeMeterValue, CUBE_METER, CUBE_MILLIMETER);
        Volume cubeDecimeterTestResult = convert(cubeDecimeterValue, CUBE_DECIMETER, CUBE_MILLIMETER);
        Volume cubeCentimeterTestResult = convert(cubeCentimeterValue, CUBE_CENTIMETER, CUBE_MILLIMETER);
        Volume cubeMillimeterTestResult = convert(cubeMillimeterValue, CUBE_MILLIMETER, CUBE_MILLIMETER);

        Volume cubeKilometerResult = toCubeMillimeter(cubeKilometerValue, CUBE_KILOMETER);
        Volume cubeHectometerResult = toCubeMillimeter(cubeHectometerValue, CUBE_HECTOMETER);
        Volume cubeDecameterResult = toCubeMillimeter(cubeDecameterValue, CUBE_DECAMETER);
        Volume cubeMeterResult = toCubeMillimeter(cubeMeterValue, CUBE_METER);
        Volume cubeDecimeterResult = toCubeMillimeter(cubeDecimeterValue, CUBE_DECIMETER);
        Volume cubeCentimeterResult = toCubeMillimeter(cubeCentimeterValue, CUBE_CENTIMETER);
        Volume cubeMillimeterResult = toCubeMillimeter(cubeMillimeterValue, CUBE_MILLIMETER);

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

        Volume cubeKilometerTestResult = new Volume("1.00000000000000000000", CUBE_KILOMETER);
        Volume cubeHectometerTestResult= new Volume("0.00100000000000000000", CUBE_KILOMETER);
        Volume cubeDecameterTestResult = new Volume("0.00000100000000000000", CUBE_KILOMETER);
        Volume cubeMeterTestResult = new Volume("0.00000000100000000000", CUBE_KILOMETER);
        Volume cubeDecimeterTestResult = new Volume("0.00000000000100000000", CUBE_KILOMETER);
        Volume cubeCentimeterTestResult = new Volume("0.00000000000000100000", CUBE_KILOMETER);
        Volume cubeMillimeterTestResult = new Volume("0.00000000000000000100", CUBE_KILOMETER);

        Volume cubeKilometerResult = toCubeKilometer(cubeKilometerValue, CUBE_KILOMETER);
        Volume cubeHectometerResult = toCubeKilometer(cubeHectometerValue, CUBE_HECTOMETER);
        Volume cubeDecameterResult = toCubeKilometer(cubeDecameterValue, CUBE_DECAMETER);
        Volume cubeMeterResult = toCubeKilometer(cubeMeterValue, CUBE_METER);
        Volume cubeDecimeterResult = toCubeKilometer(cubeDecimeterValue, CUBE_DECIMETER);
        Volume cubeCentimeterResult = toCubeKilometer(cubeCentimeterValue, CUBE_CENTIMETER);
        Volume cubeMillimeterResult = toCubeKilometer(cubeMillimeterValue, CUBE_MILLIMETER);

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

        Volume cubeKilometerTestResult = new Volume("1000.00000000000000000000", CUBE_HECTOMETER);
        Volume cubeHectometerTestResult= new Volume("1.00000000000000000000", CUBE_HECTOMETER);
        Volume cubeDecameterTestResult = new Volume("0.00100000000000000000", CUBE_HECTOMETER);
        Volume cubeMeterTestResult = new Volume("0.00000100000000000000", CUBE_HECTOMETER);
        Volume cubeDecimeterTestResult = new Volume("0.00000000100000000000", CUBE_HECTOMETER);
        Volume cubeCentimeterTestResult = new Volume("0.00000000000100000000", CUBE_HECTOMETER);
        Volume cubeMillimeterTestResult = new Volume("0.00000000000000100000", CUBE_HECTOMETER);

        Volume cubeKilometerResult = toCubeHectometer(cubeKilometerValue, CUBE_KILOMETER);
        Volume cubeHectometerResult = toCubeHectometer(cubeHectometerValue, CUBE_HECTOMETER);
        Volume cubeDecameterResult = toCubeHectometer(cubeDecameterValue, CUBE_DECAMETER);
        Volume cubeMeterResult = toCubeHectometer(cubeMeterValue, CUBE_METER);
        Volume cubeDecimeterResult = toCubeHectometer(cubeDecimeterValue, CUBE_DECIMETER);
        Volume cubeCentimeterResult = toCubeHectometer(cubeCentimeterValue, CUBE_CENTIMETER);
        Volume cubeMillimeterResult = toCubeHectometer(cubeMillimeterValue, CUBE_MILLIMETER);

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

        Volume cubeKilometerTestResult = new Volume("1000000.00000000000000000000", CUBE_DECAMETER);
        Volume cubeHectometerTestResult= new Volume("1000.00000000000000000000", CUBE_DECAMETER);
        Volume cubeDecameterTestResult = new Volume("1.00000000000000000000", CUBE_DECAMETER);
        Volume cubeMeterTestResult = new Volume("0.00100000000000000000", CUBE_DECAMETER);
        Volume cubeDecimeterTestResult = new Volume("0.00000100000000000000", CUBE_DECAMETER);
        Volume cubeCentimeterTestResult = new Volume("0.00000000100000000000", CUBE_DECAMETER);
        Volume cubeMillimeterTestResult = new Volume("0.00000000000100000000", CUBE_DECAMETER);

        Volume cubeKilometerResult = toCubeDecameter(cubeKilometerValue, CUBE_KILOMETER);
        Volume cubeHectometerResult = toCubeDecameter(cubeHectometerValue, CUBE_HECTOMETER);
        Volume cubeDecameterResult = toCubeDecameter(cubeDecameterValue, CUBE_DECAMETER);
        Volume cubeMeterResult = toCubeDecameter(cubeMeterValue, CUBE_METER);
        Volume cubeDecimeterResult = toCubeDecameter(cubeDecimeterValue, CUBE_DECIMETER);
        Volume cubeCentimeterResult = toCubeDecameter(cubeCentimeterValue, CUBE_CENTIMETER);
        Volume cubeMillimeterResult = toCubeDecameter(cubeMillimeterValue, CUBE_MILLIMETER);

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

        Volume cubeKilometerTestResult = new Volume("1000000000.00000000000000000000", CUBE_METER);
        Volume cubeHectometerTestResult= new Volume("1000000.00000000000000000000", CUBE_METER);
        Volume cubeDecameterTestResult = new Volume("1000.00000000000000000000", CUBE_METER);
        Volume cubeMeterTestResult = new Volume("1.00000000000000000000", CUBE_METER);
        Volume cubeDecimeterTestResult = new Volume("0.00100000000000000000", CUBE_METER);
        Volume cubeCentimeterTestResult = new Volume("0.00000100000000000000", CUBE_METER);
        Volume cubeMillimeterTestResult = new Volume("0.00000000100000000000", CUBE_METER);

        Volume cubeKilometerResult = toCubeMeter(cubeKilometerValue, CUBE_KILOMETER);
        Volume cubeHectometerResult = toCubeMeter(cubeHectometerValue, CUBE_HECTOMETER);
        Volume cubeDecameterResult = toCubeMeter(cubeDecameterValue, CUBE_DECAMETER);
        Volume cubeMeterResult = toCubeMeter(cubeMeterValue, CUBE_METER);
        Volume cubeDecimeterResult = toCubeMeter(cubeDecimeterValue, CUBE_DECIMETER);
        Volume cubeCentimeterResult = toCubeMeter(cubeCentimeterValue, CUBE_CENTIMETER);
        Volume cubeMillimeterResult = toCubeMeter(cubeMillimeterValue, CUBE_MILLIMETER);

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

        Volume cubeKilometerTestResult = new Volume("1000000000000.00000000000000000000", CUBE_DECIMETER);
        Volume cubeHectometerTestResult= new Volume("1000000000.00000000000000000000", CUBE_DECIMETER);
        Volume cubeDecameterTestResult = new Volume("1000000.00000000000000000000", CUBE_DECIMETER);
        Volume cubeMeterTestResult = new Volume("1000.00000000000000000000", CUBE_DECIMETER);
        Volume cubeDecimeterTestResult = new Volume("1.00000000000000000000", CUBE_DECIMETER);
        Volume cubeCentimeterTestResult = new Volume("0.00100000000000000000", CUBE_DECIMETER);
        Volume cubeMillimeterTestResult = new Volume("0.00000100000000000000", CUBE_DECIMETER);

        Volume cubeKilometerResult = toCubeDecimeter(cubeKilometerValue, CUBE_KILOMETER);
        Volume cubeHectometerResult = toCubeDecimeter(cubeHectometerValue, CUBE_HECTOMETER);
        Volume cubeDecameterResult = toCubeDecimeter(cubeDecameterValue, CUBE_DECAMETER);
        Volume cubeMeterResult = toCubeDecimeter(cubeMeterValue, CUBE_METER);
        Volume cubeDecimeterResult = toCubeDecimeter(cubeDecimeterValue, CUBE_DECIMETER);
        Volume cubeCentimeterResult = toCubeDecimeter(cubeCentimeterValue, CUBE_CENTIMETER);
        Volume cubeMillimeterResult = toCubeDecimeter(cubeMillimeterValue, CUBE_MILLIMETER);

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

        Volume cubeKilometerTestResult = new Volume("1000000000000000.00000000000000000000", CUBE_CENTIMETER);
        Volume cubeHectometerTestResult= new Volume("1000000000000.00000000000000000000", CUBE_CENTIMETER);
        Volume cubeDecameterTestResult = new Volume("1000000000.00000000000000000000", CUBE_CENTIMETER);
        Volume cubeMeterTestResult = new Volume("1000000.00000000000000000000", CUBE_CENTIMETER);
        Volume cubeDecimeterTestResult = new Volume("1000.00000000000000000000", CUBE_CENTIMETER);
        Volume cubeCentimeterTestResult = new Volume("1.00000000000000000000", CUBE_CENTIMETER);
        Volume cubeMillimeterTestResult = new Volume("0.00100000000000000000", CUBE_CENTIMETER);

        Volume cubeKilometerResult = toCubeCentimeter(cubeKilometerValue, CUBE_KILOMETER);
        Volume cubeHectometerResult = toCubeCentimeter(cubeHectometerValue, CUBE_HECTOMETER);
        Volume cubeDecameterResult = toCubeCentimeter(cubeDecameterValue, CUBE_DECAMETER);
        Volume cubeMeterResult = toCubeCentimeter(cubeMeterValue, CUBE_METER);
        Volume cubeDecimeterResult = toCubeCentimeter(cubeDecimeterValue, CUBE_DECIMETER);
        Volume cubeCentimeterResult = toCubeCentimeter(cubeCentimeterValue, CUBE_CENTIMETER);
        Volume cubeMillimeterResult = toCubeCentimeter(cubeMillimeterValue, CUBE_MILLIMETER);

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

        Volume cubeKilometerTestResult = new Volume("1000000000000000000.00000000000000000000", CUBE_MILLIMETER);
        Volume cubeHectometerTestResult= new Volume("1000000000000000.00000000000000000000", CUBE_MILLIMETER);
        Volume cubeDecameterTestResult = new Volume("1000000000000.00000000000000000000", CUBE_MILLIMETER);
        Volume cubeMeterTestResult = new Volume("1000000000.00000000000000000000", CUBE_MILLIMETER);
        Volume cubeDecimeterTestResult = new Volume("1000000.00000000000000000000", CUBE_MILLIMETER);
        Volume cubeCentimeterTestResult = new Volume("1000.00000000000000000000", CUBE_MILLIMETER);
        Volume cubeMillimeterTestResult = new Volume("1.00000000000000000000", CUBE_MILLIMETER);

        Volume cubeKilometerResult = toCubeMillimeter(cubeKilometerValue, CUBE_KILOMETER);
        Volume cubeHectometerResult = toCubeMillimeter(cubeHectometerValue, CUBE_HECTOMETER);
        Volume cubeDecameterResult = toCubeMillimeter(cubeDecameterValue, CUBE_DECAMETER);
        Volume cubeMeterResult = toCubeMillimeter(cubeMeterValue, CUBE_METER);
        Volume cubeDecimeterResult = toCubeMillimeter(cubeDecimeterValue, CUBE_DECIMETER);
        Volume cubeCentimeterResult = toCubeMillimeter(cubeCentimeterValue, CUBE_CENTIMETER);
        Volume cubeMillimeterResult = toCubeMillimeter(cubeMillimeterValue, CUBE_MILLIMETER);

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
