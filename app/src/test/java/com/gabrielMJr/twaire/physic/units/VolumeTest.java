package com.gabrielmjr.twaire.physic.units;

import java.math.BigDecimal;
import java.util.Random;
import org.junit.jupiter.api.Test;

import static com.gabrielmjr.twaire.physic.units.Volume.VOLUME_SCALES;

import static com.gabrielmjr.twaire.physic.units.Volume.CUBE_KILOMETER;
import static com.gabrielmjr.twaire.physic.units.Volume.CUBE_HECTOMETER;
import static com.gabrielmjr.twaire.physic.units.Volume.CUBE_DECAMETER;
import static com.gabrielmjr.twaire.physic.units.Volume.CUBE_METER;
import static com.gabrielmjr.twaire.physic.units.Volume.CUBE_DECIMETER;
import static com.gabrielmjr.twaire.physic.units.Volume.CUBE_CENTIMETER;
import static com.gabrielmjr.twaire.physic.units.Volume.CUBE_MILLIMETER;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VolumeTest {
	private final Volume volume;
	private final Random random;

	public VolumeTest() {
		volume = Volume.getInstance();
		random = new Random();
	}

	@Test 
	public void toCubeKilometerTest() {
		double cubeKilometerValue = getRandomDouble();
		double cubeHectometerValue = getRandomDouble();
		double cubeDecameterValue = getRandomDouble();
		double cubeMeterValue = getRandomDouble();
		double cubeDecimeterValue = getRandomDouble();
		double cubeCentimeterValue = getRandomDouble();
	    double cubeMillimeterValue = getRandomDouble();

		BigDecimal cubeKilometerTestResult = BigDecimal.valueOf(cubeKilometerValue).multiply(VOLUME_SCALES[CUBE_KILOMETER - 14]).divide(VOLUME_SCALES[CUBE_KILOMETER - 14]);
		BigDecimal cubeHectometerTestResult = BigDecimal.valueOf(cubeHectometerValue).multiply(VOLUME_SCALES[CUBE_HECTOMETER - 14]).divide(VOLUME_SCALES[CUBE_KILOMETER - 14]);
		BigDecimal cubeDecameterTestResult = BigDecimal.valueOf(cubeDecameterValue).multiply(VOLUME_SCALES[CUBE_DECAMETER - 14]).divide(VOLUME_SCALES[CUBE_KILOMETER - 14]);
		BigDecimal cubeMeterTestResult = BigDecimal.valueOf(cubeMeterValue).multiply(VOLUME_SCALES[CUBE_METER - 14]).divide(VOLUME_SCALES[CUBE_KILOMETER - 14]);
		BigDecimal cubeDecimeterTestResult = BigDecimal.valueOf(cubeDecimeterValue).multiply(VOLUME_SCALES[CUBE_DECIMETER - 14]).divide(VOLUME_SCALES[CUBE_KILOMETER - 14]);
        BigDecimal cubeCentimeterTestResult = BigDecimal.valueOf(cubeCentimeterValue).multiply(VOLUME_SCALES[CUBE_CENTIMETER - 14]).divide(VOLUME_SCALES[CUBE_KILOMETER - 14]);
		BigDecimal cubeMillimeterTestResult = BigDecimal.valueOf(cubeMillimeterValue).multiply(VOLUME_SCALES[CUBE_MILLIMETER - 14]).divide(VOLUME_SCALES[CUBE_KILOMETER - 14]);

        try {
            BigDecimal cubeKilometerResult = volume.toCubeKilometer(cubeKilometerValue, CUBE_KILOMETER);
            BigDecimal cubeHectometerResult = volume.toCubeKilometer(cubeHectometerValue, CUBE_HECTOMETER);
            BigDecimal cubeDecameterResult = volume.toCubeKilometer(cubeDecameterValue, CUBE_DECAMETER);
            BigDecimal cubeMeterResult = volume.toCubeKilometer(cubeMeterValue, CUBE_METER);
            BigDecimal cubeDecimeterResult = volume.toCubeKilometer(cubeDecimeterValue, CUBE_DECIMETER);
            BigDecimal cubeCentimeterResult = volume.toCubeKilometer(cubeCentimeterValue, CUBE_CENTIMETER);
            BigDecimal cubeMillimeterResult = volume.toCubeKilometer(cubeMillimeterValue, CUBE_MILLIMETER);

            assertEquals(cubeKilometerTestResult, cubeKilometerResult);
            assertEquals(cubeHectometerTestResult, cubeHectometerResult);
            assertEquals(cubeDecameterTestResult, cubeDecameterResult);
            assertEquals(cubeMeterTestResult, cubeMeterResult);
            assertEquals(cubeDecimeterTestResult, cubeDecimeterResult);
            assertEquals(cubeCentimeterTestResult, cubeCentimeterResult);
            assertEquals(cubeMillimeterTestResult, cubeMillimeterResult);
        } catch (InvalidUnitException e) {
            System.err.println(e.getMessage());
        }
	}

	@Test 
	public void toCubeHectometerTest() {
		double cubeKilometerValue = getRandomDouble();
		double cubeHectometerValue = getRandomDouble();
		double cubeDecameterValue = getRandomDouble();
		double cubeMeterValue = getRandomDouble();
		double cubeDecimeterValue = getRandomDouble();
		double cubeCentimeterValue = getRandomDouble();
		double cubeMillimeterValue = getRandomDouble();

		BigDecimal cubeKilometerTestResult = BigDecimal.valueOf(cubeKilometerValue).multiply(VOLUME_SCALES[CUBE_KILOMETER - 14]).divide(VOLUME_SCALES[CUBE_HECTOMETER - 14]);
		BigDecimal cubeHectometerTestResult = BigDecimal.valueOf(cubeHectometerValue).multiply(VOLUME_SCALES[CUBE_HECTOMETER - 14]).divide(VOLUME_SCALES[CUBE_HECTOMETER - 14]);
		BigDecimal cubeDecameterTestResult = BigDecimal.valueOf(cubeDecameterValue).multiply(VOLUME_SCALES[CUBE_DECAMETER - 14]).divide(VOLUME_SCALES[CUBE_HECTOMETER - 14]);
		BigDecimal cubeMeterTestResult = BigDecimal.valueOf(cubeMeterValue).multiply(VOLUME_SCALES[CUBE_METER - 14]).divide(VOLUME_SCALES[CUBE_HECTOMETER - 14]);
		BigDecimal cubeDecimeterTestResult = BigDecimal.valueOf(cubeDecimeterValue).multiply(VOLUME_SCALES[CUBE_DECIMETER - 14]).divide(VOLUME_SCALES[CUBE_HECTOMETER - 14]);
        BigDecimal cubeCentimeterTestResult = BigDecimal.valueOf(cubeCentimeterValue).multiply(VOLUME_SCALES[CUBE_CENTIMETER - 14]).divide(VOLUME_SCALES[CUBE_HECTOMETER - 14]);
		BigDecimal cubeMillimeterTestResult = BigDecimal.valueOf(cubeMillimeterValue).multiply(VOLUME_SCALES[CUBE_MILLIMETER - 14]).divide(VOLUME_SCALES[CUBE_HECTOMETER - 14]);

        try {
            BigDecimal cubeKilometerResult = volume.toCubeHectometer(cubeKilometerValue, CUBE_KILOMETER);
            BigDecimal cubeHectometerResult = volume.toCubeHectometer(cubeHectometerValue, CUBE_HECTOMETER);
            BigDecimal cubeDecameterResult = volume.toCubeHectometer(cubeDecameterValue, CUBE_DECAMETER);
            BigDecimal cubeMeterResult = volume.toCubeHectometer(cubeMeterValue, CUBE_METER);
            BigDecimal cubeDecimeterResult = volume.toCubeHectometer(cubeDecimeterValue, CUBE_DECIMETER);
            BigDecimal cubeCentimeterResult = volume.toCubeHectometer(cubeCentimeterValue, CUBE_CENTIMETER);
            BigDecimal cubeMillimeterResult = volume.toCubeHectometer(cubeMillimeterValue, CUBE_MILLIMETER);

            assertEquals(cubeKilometerTestResult, cubeKilometerResult);
            assertEquals(cubeHectometerTestResult, cubeHectometerResult);
            assertEquals(cubeDecameterTestResult, cubeDecameterResult);
            assertEquals(cubeMeterTestResult, cubeMeterResult);
            assertEquals(cubeDecimeterTestResult, cubeDecimeterResult);
            assertEquals(cubeCentimeterTestResult, cubeCentimeterResult);
            assertEquals(cubeMillimeterTestResult, cubeMillimeterResult);
        } catch (InvalidUnitException e) {
            System.err.println(e.getMessage());
        }
	}

	@Test 
	public void toCubeDecameterTest() {
		double cubeKilometerValue = getRandomDouble();
		double cubeHectometerValue = getRandomDouble();
		double cubeDecameterValue = getRandomDouble();
		double cubeMeterValue = getRandomDouble();
		double cubeDecimeterValue = getRandomDouble();
		double cubeCentimeterValue = getRandomDouble();
		double cubeMillimeterValue = getRandomDouble();

		BigDecimal cubeKilometerTestResult = BigDecimal.valueOf(cubeKilometerValue).multiply(VOLUME_SCALES[CUBE_KILOMETER - 14]).divide(VOLUME_SCALES[CUBE_DECAMETER - 14]);
		BigDecimal cubeHectometerTestResult = BigDecimal.valueOf(cubeHectometerValue).multiply(VOLUME_SCALES[CUBE_HECTOMETER - 14]).divide(VOLUME_SCALES[CUBE_DECAMETER - 14]);
		BigDecimal cubeDecameterTestResult = BigDecimal.valueOf(cubeDecameterValue).multiply(VOLUME_SCALES[CUBE_DECAMETER - 14]).divide(VOLUME_SCALES[CUBE_DECAMETER - 14]);
		BigDecimal cubeMeterTestResult = BigDecimal.valueOf(cubeMeterValue).multiply(VOLUME_SCALES[CUBE_METER - 14]).divide(VOLUME_SCALES[CUBE_DECAMETER - 14]);
		BigDecimal cubeDecimeterTestResult = BigDecimal.valueOf(cubeDecimeterValue).multiply(VOLUME_SCALES[CUBE_DECIMETER - 14]).divide(VOLUME_SCALES[CUBE_DECAMETER - 14]);
        BigDecimal cubeCentimeterTestResult = BigDecimal.valueOf(cubeCentimeterValue).multiply(VOLUME_SCALES[CUBE_CENTIMETER - 14]).divide(VOLUME_SCALES[CUBE_DECAMETER - 14]);
		BigDecimal cubeMillimeterTestResult = BigDecimal.valueOf(cubeMillimeterValue).multiply(VOLUME_SCALES[CUBE_MILLIMETER - 14]).divide(VOLUME_SCALES[CUBE_DECAMETER - 14]);

        try {
            BigDecimal cubeKilometerResult = volume.toCubeDecameter(cubeKilometerValue, CUBE_KILOMETER);
            BigDecimal cubeHectometerResult = volume.toCubeDecameter(cubeHectometerValue, CUBE_HECTOMETER);
            BigDecimal cubeDecameterResult = volume.toCubeDecameter(cubeDecameterValue, CUBE_DECAMETER);
            BigDecimal cubeMeterResult = volume.toCubeDecameter(cubeMeterValue, CUBE_METER);
            BigDecimal cubeDecimeterResult = volume.toCubeDecameter(cubeDecimeterValue, CUBE_DECIMETER);
            BigDecimal cubeCentimeterResult = volume.toCubeDecameter(cubeCentimeterValue, CUBE_CENTIMETER);
            BigDecimal cubeMillimeterResult = volume.toCubeDecameter(cubeMillimeterValue, CUBE_MILLIMETER);

            assertEquals(cubeKilometerTestResult, cubeKilometerResult);
            assertEquals(cubeHectometerTestResult, cubeHectometerResult);
            assertEquals(cubeDecameterTestResult, cubeDecameterResult);
            assertEquals(cubeMeterTestResult, cubeMeterResult);
            assertEquals(cubeDecimeterTestResult, cubeDecimeterResult);
            assertEquals(cubeCentimeterTestResult, cubeCentimeterResult);
            assertEquals(cubeMillimeterTestResult, cubeMillimeterResult);
        } catch (InvalidUnitException e) {
            System.err.println(e.getMessage());
        }
	}

	@Test 
	public void toCubeMeterTest() {
		double cubeKilometerValue = getRandomDouble();
		double cubeHectometerValue = getRandomDouble();
		double cubeDecameterValue = getRandomDouble();
		double cubeMeterValue = getRandomDouble();
		double cubeDecimeterValue = getRandomDouble();
		double cubeCentimeterValue = getRandomDouble();
		double cubeMillimeterValue = getRandomDouble();

		BigDecimal cubeKilometerTestResult = BigDecimal.valueOf(cubeKilometerValue).multiply(VOLUME_SCALES[CUBE_KILOMETER - 14]).divide(VOLUME_SCALES[CUBE_METER - 14]);
		BigDecimal cubeHectometerTestResult = BigDecimal.valueOf(cubeHectometerValue).multiply(VOLUME_SCALES[CUBE_HECTOMETER - 14]).divide(VOLUME_SCALES[CUBE_METER - 14]);
		BigDecimal cubeDecameterTestResult = BigDecimal.valueOf(cubeDecameterValue).multiply(VOLUME_SCALES[CUBE_DECAMETER - 14]).divide(VOLUME_SCALES[CUBE_METER - 14]);
		BigDecimal cubeMeterTestResult = BigDecimal.valueOf(cubeMeterValue).multiply(VOLUME_SCALES[CUBE_METER - 14]).divide(VOLUME_SCALES[CUBE_METER - 14]);
		BigDecimal cubeDecimeterTestResult = BigDecimal.valueOf(cubeDecimeterValue).multiply(VOLUME_SCALES[CUBE_DECIMETER - 14]).divide(VOLUME_SCALES[CUBE_METER - 14]);
        BigDecimal cubeCentimeterTestResult = BigDecimal.valueOf(cubeCentimeterValue).multiply(VOLUME_SCALES[CUBE_CENTIMETER - 14]).divide(VOLUME_SCALES[CUBE_METER - 14]);
		BigDecimal cubeMillimeterTestResult = BigDecimal.valueOf(cubeMillimeterValue).multiply(VOLUME_SCALES[CUBE_MILLIMETER - 14]).divide(VOLUME_SCALES[CUBE_METER - 14]);

        try {
            BigDecimal cubeKilometerResult = volume.toCubeMeter(cubeKilometerValue, CUBE_KILOMETER);
            BigDecimal cubeHectometerResult = volume.toCubeMeter(cubeHectometerValue, CUBE_HECTOMETER);
            BigDecimal cubeDecameterResult = volume.toCubeMeter(cubeDecameterValue, CUBE_DECAMETER);
            BigDecimal cubeMeterResult = volume.toCubeMeter(cubeMeterValue, CUBE_METER);
            BigDecimal cubeDecimeterResult = volume.toCubeMeter(cubeDecimeterValue, CUBE_DECIMETER);
            BigDecimal cubeCentimeterResult = volume.toCubeMeter(cubeCentimeterValue, CUBE_CENTIMETER);
            BigDecimal cubeMillimeterResult = volume.toCubeMeter(cubeMillimeterValue, CUBE_MILLIMETER);

            assertEquals(cubeKilometerTestResult, cubeKilometerResult);
            assertEquals(cubeHectometerTestResult, cubeHectometerResult);
            assertEquals(cubeDecameterTestResult, cubeDecameterResult);
            assertEquals(cubeMeterTestResult, cubeMeterResult);
            assertEquals(cubeDecimeterTestResult, cubeDecimeterResult);
            assertEquals(cubeCentimeterTestResult, cubeCentimeterResult);
            assertEquals(cubeMillimeterTestResult, cubeMillimeterResult);
        } catch (InvalidUnitException e) {
            System.err.println(e.getMessage());
        }
	}

	@Test 
	public void toCubeDecimeterTest() {
		double cubeKilometerValue = getRandomDouble();
		double cubeHectometerValue = getRandomDouble();
		double cubeDecameterValue = getRandomDouble();
		double cubeMeterValue = getRandomDouble();
		double cubeDecimeterValue = getRandomDouble();
		double cubeCentimeterValue = getRandomDouble();
		double cubeMillimeterValue = getRandomDouble();

		BigDecimal cubeKilometerTestResult = BigDecimal.valueOf(cubeKilometerValue).multiply(VOLUME_SCALES[CUBE_KILOMETER - 14]).divide(VOLUME_SCALES[CUBE_DECIMETER - 14]);
		BigDecimal cubeHectometerTestResult = BigDecimal.valueOf(cubeHectometerValue).multiply(VOLUME_SCALES[CUBE_HECTOMETER - 14]).divide(VOLUME_SCALES[CUBE_DECIMETER - 14]);
		BigDecimal cubeDecameterTestResult = BigDecimal.valueOf(cubeDecameterValue).multiply(VOLUME_SCALES[CUBE_DECAMETER - 14]).divide(VOLUME_SCALES[CUBE_DECIMETER - 14]);
		BigDecimal cubeMeterTestResult = BigDecimal.valueOf(cubeMeterValue).multiply(VOLUME_SCALES[CUBE_METER - 14]).divide(VOLUME_SCALES[CUBE_DECIMETER - 14]);
		BigDecimal cubeDecimeterTestResult = BigDecimal.valueOf(cubeDecimeterValue).multiply(VOLUME_SCALES[CUBE_DECIMETER - 14]).divide(VOLUME_SCALES[CUBE_DECIMETER - 14]);
        BigDecimal cubeCentimeterTestResult = BigDecimal.valueOf(cubeCentimeterValue).multiply(VOLUME_SCALES[CUBE_CENTIMETER - 14]).divide(VOLUME_SCALES[CUBE_DECIMETER - 14]);
		BigDecimal cubeMillimeterTestResult = BigDecimal.valueOf(cubeMillimeterValue).multiply(VOLUME_SCALES[CUBE_MILLIMETER - 14]).divide(VOLUME_SCALES[CUBE_DECIMETER - 14]);

        try {
            BigDecimal cubeKilometerResult = volume.toCubeDecimeter(cubeKilometerValue, CUBE_KILOMETER);
            BigDecimal cubeHectometerResult = volume.toCubeDecimeter(cubeHectometerValue, CUBE_HECTOMETER);
            BigDecimal cubeDecameterResult = volume.toCubeDecimeter(cubeDecameterValue, CUBE_DECAMETER);
            BigDecimal cubeMeterResult = volume.toCubeDecimeter(cubeMeterValue, CUBE_METER);
            BigDecimal cubeDecimeterResult = volume.toCubeDecimeter(cubeDecimeterValue, CUBE_DECIMETER);
            BigDecimal cubeCentimeterResult = volume.toCubeDecimeter(cubeCentimeterValue, CUBE_CENTIMETER);
            BigDecimal cubeMillimeterResult = volume.toCubeDecimeter(cubeMillimeterValue, CUBE_MILLIMETER);

            assertEquals(cubeKilometerTestResult, cubeKilometerResult);
            assertEquals(cubeHectometerTestResult, cubeHectometerResult);
            assertEquals(cubeDecameterTestResult, cubeDecameterResult);
            assertEquals(cubeMeterTestResult, cubeMeterResult);
            assertEquals(cubeDecimeterTestResult, cubeDecimeterResult);
            assertEquals(cubeCentimeterTestResult, cubeCentimeterResult);
            assertEquals(cubeMillimeterTestResult, cubeMillimeterResult);
        } catch (InvalidUnitException e) {
            System.err.println(e.getMessage());
        }
	}

	@Test 
	public void toCubeCentimeterTest() {
		double cubeKilometerValue = getRandomDouble();
		double cubeHectometerValue = getRandomDouble();
		double cubeDecameterValue = getRandomDouble();
		double cubeMeterValue = getRandomDouble();
		double cubeDecimeterValue = getRandomDouble();
		double cubeCentimeterValue = getRandomDouble();
		double cubeMillimeterValue = getRandomDouble();

		BigDecimal cubeKilometerTestResult = BigDecimal.valueOf(cubeKilometerValue).multiply(VOLUME_SCALES[CUBE_KILOMETER - 14]).divide(VOLUME_SCALES[CUBE_CENTIMETER - 14]);
		BigDecimal cubeHectometerTestResult = BigDecimal.valueOf(cubeHectometerValue).multiply(VOLUME_SCALES[CUBE_HECTOMETER - 14]).divide(VOLUME_SCALES[CUBE_CENTIMETER - 14]);
		BigDecimal cubeDecameterTestResult = BigDecimal.valueOf(cubeDecameterValue).multiply(VOLUME_SCALES[CUBE_DECAMETER - 14]).divide(VOLUME_SCALES[CUBE_CENTIMETER - 14]);
		BigDecimal cubeMeterTestResult = BigDecimal.valueOf(cubeMeterValue).multiply(VOLUME_SCALES[CUBE_METER - 14]).divide(VOLUME_SCALES[CUBE_CENTIMETER - 14]);
		BigDecimal cubeDecimeterTestResult = BigDecimal.valueOf(cubeDecimeterValue).multiply(VOLUME_SCALES[CUBE_DECIMETER - 14]).divide(VOLUME_SCALES[CUBE_CENTIMETER - 14]);
        BigDecimal cubeCentimeterTestResult = BigDecimal.valueOf(cubeCentimeterValue).multiply(VOLUME_SCALES[CUBE_CENTIMETER - 14]).divide(VOLUME_SCALES[CUBE_CENTIMETER - 14]);
		BigDecimal cubeMillimeterTestResult = BigDecimal.valueOf(cubeMillimeterValue).multiply(VOLUME_SCALES[CUBE_MILLIMETER - 14]).divide(VOLUME_SCALES[CUBE_CENTIMETER - 14]);

        try {
            BigDecimal cubeKilometerResult = volume.toCubeCentimeter(cubeKilometerValue, CUBE_KILOMETER);
            BigDecimal cubeHectometerResult = volume.toCubeCentimeter(cubeHectometerValue, CUBE_HECTOMETER);
            BigDecimal cubeDecameterResult = volume.toCubeCentimeter(cubeDecameterValue, CUBE_DECAMETER);
            BigDecimal cubeMeterResult = volume.toCubeCentimeter(cubeMeterValue, CUBE_METER);
            BigDecimal cubeDecimeterResult = volume.toCubeCentimeter(cubeDecimeterValue, CUBE_DECIMETER);
            BigDecimal cubeCentimeterResult = volume.toCubeCentimeter(cubeCentimeterValue, CUBE_CENTIMETER);
            BigDecimal cubeMillimeterResult = volume.toCubeCentimeter(cubeMillimeterValue, CUBE_MILLIMETER);

            assertEquals(cubeKilometerTestResult, cubeKilometerResult);
            assertEquals(cubeHectometerTestResult, cubeHectometerResult);
            assertEquals(cubeDecameterTestResult, cubeDecameterResult);
            assertEquals(cubeMeterTestResult, cubeMeterResult);
            assertEquals(cubeDecimeterTestResult, cubeDecimeterResult);
            assertEquals(cubeCentimeterTestResult, cubeCentimeterResult);
            assertEquals(cubeMillimeterTestResult, cubeMillimeterResult);
        } catch (InvalidUnitException e) {
            System.err.println(e.getMessage());
        }
	}

	@Test 
	public void toCubeMillimeterTest() {
		double cubeKilometerValue = getRandomDouble();
		double cubeHectometerValue = getRandomDouble();
		double cubeDecameterValue = getRandomDouble();
		double cubeMeterValue = getRandomDouble();
		double cubeDecimeterValue = getRandomDouble();
		double cubeCentimeterValue = getRandomDouble();
		double cubeMillimeterValue = getRandomDouble();

		BigDecimal cubeKilometerTestResult = BigDecimal.valueOf(cubeKilometerValue).multiply(VOLUME_SCALES[CUBE_KILOMETER - 14]).divide(VOLUME_SCALES[CUBE_MILLIMETER - 14]);
		BigDecimal cubeHectometerTestResult = BigDecimal.valueOf(cubeHectometerValue).multiply(VOLUME_SCALES[CUBE_HECTOMETER - 14]).divide(VOLUME_SCALES[CUBE_MILLIMETER - 14]);
		BigDecimal cubeDecameterTestResult = BigDecimal.valueOf(cubeDecameterValue).multiply(VOLUME_SCALES[CUBE_DECAMETER - 14]).divide(VOLUME_SCALES[CUBE_MILLIMETER - 14]);
		BigDecimal cubeMeterTestResult = BigDecimal.valueOf(cubeMeterValue).multiply(VOLUME_SCALES[CUBE_METER - 14]).divide(VOLUME_SCALES[CUBE_MILLIMETER - 14]);
		BigDecimal cubeDecimeterTestResult = BigDecimal.valueOf(cubeDecimeterValue).multiply(VOLUME_SCALES[CUBE_DECIMETER - 14]).divide(VOLUME_SCALES[CUBE_MILLIMETER - 14]);
        BigDecimal cubeCentimeterTestResult = BigDecimal.valueOf(cubeCentimeterValue).multiply(VOLUME_SCALES[CUBE_CENTIMETER - 14]).divide(VOLUME_SCALES[CUBE_MILLIMETER - 14]);
		BigDecimal cubeMillimeterTestResult = BigDecimal.valueOf(cubeMillimeterValue).multiply(VOLUME_SCALES[CUBE_MILLIMETER - 14]).divide(VOLUME_SCALES[CUBE_MILLIMETER - 14]);

        try {
            BigDecimal cubeKilometerResult = volume.toCubeMillimeter(cubeKilometerValue, CUBE_KILOMETER);
            BigDecimal cubeHectometerResult = volume.toCubeMillimeter(cubeHectometerValue, CUBE_HECTOMETER);
            BigDecimal cubeDecameterResult = volume.toCubeMillimeter(cubeDecameterValue, CUBE_DECAMETER);
            BigDecimal cubeMeterResult = volume.toCubeMillimeter(cubeMeterValue, CUBE_METER);
            BigDecimal cubeDecimeterResult = volume.toCubeMillimeter(cubeDecimeterValue, CUBE_DECIMETER);
            BigDecimal cubeCentimeterResult = volume.toCubeMillimeter(cubeCentimeterValue, CUBE_CENTIMETER);
            BigDecimal cubeMillimeterResult = volume.toCubeMillimeter(cubeMillimeterValue, CUBE_MILLIMETER);

            assertEquals(cubeKilometerTestResult, cubeKilometerResult);
            assertEquals(cubeHectometerTestResult, cubeHectometerResult);
            assertEquals(cubeDecameterTestResult, cubeDecameterResult);
            assertEquals(cubeMeterTestResult, cubeMeterResult);
            assertEquals(cubeDecimeterTestResult, cubeDecimeterResult);
            assertEquals(cubeCentimeterTestResult, cubeCentimeterResult);
            assertEquals(cubeMillimeterTestResult, cubeMillimeterResult);
        } catch (InvalidUnitException e) {
            System.err.println(e.getMessage());
        }
	}

	private double getRandomDouble() {
		return random.nextDouble() * 100;
	}
}
