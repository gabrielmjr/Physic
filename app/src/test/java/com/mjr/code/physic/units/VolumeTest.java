package com.mjr.code.physic.units;

import com.mjr.code.physic.PhysicException;
import java.math.BigDecimal;
import java.util.Random;
import org.junit.jupiter.api.Test;

import static com.mjr.code.physic.units.Volume.toCubeKilometer;
import static com.mjr.code.physic.units.Volume.toCubeHectometer;
import static com.mjr.code.physic.units.Volume.toCubeDecameter;
import static com.mjr.code.physic.units.Volume.toCubeMeter;
import static com.mjr.code.physic.units.Volume.toCubeDecimeter;
import static com.mjr.code.physic.units.Volume.toCubeCentimeter;
import static com.mjr.code.physic.units.Volume.toCubeMillimeter;
import static com.mjr.code.physic.units.Volume.VOLUME_SCALES;
import static com.mjr.code.physic.units.Volume.CUBE_KILOMETER;
import static com.mjr.code.physic.units.Volume.CUBE_HECTOMETER;
import static com.mjr.code.physic.units.Volume.CUBE_DECAMETER;
import static com.mjr.code.physic.units.Volume.CUBE_METER;
import static com.mjr.code.physic.units.Volume.CUBE_DECIMETER;
import static com.mjr.code.physic.units.Volume.CUBE_CENTIMETER;
import static com.mjr.code.physic.units.Volume.CUBE_MILLIMETER;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VolumeTest {
	private final Random random;

	public VolumeTest() {
		random = new Random();
	}

	@Test 
	public void toCubeKilometerTest() throws PhysicException {
		double cubeKilometerValue = getRandomDouble();
		double cubeHectometerValue = getRandomDouble();
		double cubeDecameterValue = getRandomDouble();
		double cubeMeterValue = getRandomDouble();
		double cubeDecimeterValue = getRandomDouble();
		double cubeCentimeterValue = getRandomDouble();
	    double cubeMillimeterValue = getRandomDouble();

        try {
            Volume cubeKilometerTestResult = new Volume(BigDecimal.valueOf(cubeKilometerValue).multiply(VOLUME_SCALES[CUBE_KILOMETER - 14]).divide(VOLUME_SCALES[CUBE_KILOMETER - 14]), CUBE_KILOMETER);
            Volume cubeHectometerTestResult = new Volume(BigDecimal.valueOf(cubeHectometerValue).multiply(VOLUME_SCALES[CUBE_HECTOMETER - 14]).divide(VOLUME_SCALES[CUBE_KILOMETER - 14]), CUBE_HECTOMETER);
            Volume cubeDecameterTestResult = new Volume(BigDecimal.valueOf(cubeDecameterValue).multiply(VOLUME_SCALES[CUBE_DECAMETER - 14]).divide(VOLUME_SCALES[CUBE_KILOMETER - 14]), CUBE_DECAMETER);
            Volume cubeMeterTestResult = new Volume(BigDecimal.valueOf(cubeMeterValue).multiply(VOLUME_SCALES[CUBE_METER - 14]).divide(VOLUME_SCALES[CUBE_KILOMETER - 14]), CUBE_METER);
            Volume cubeDecimeterTestResult = new Volume(BigDecimal.valueOf(cubeDecimeterValue).multiply(VOLUME_SCALES[CUBE_DECIMETER - 14]).divide(VOLUME_SCALES[CUBE_KILOMETER - 14]), CUBE_DECIMETER);
            Volume cubeCentimeterTestResult = new Volume(BigDecimal.valueOf(cubeCentimeterValue).multiply(VOLUME_SCALES[CUBE_CENTIMETER - 14]).divide(VOLUME_SCALES[CUBE_KILOMETER - 14]), CUBE_CENTIMETER);
            Volume cubeMillimeterTestResult = new Volume(BigDecimal.valueOf(cubeMillimeterValue).multiply(VOLUME_SCALES[CUBE_MILLIMETER - 14]).divide(VOLUME_SCALES[CUBE_KILOMETER - 14]), CUBE_MILLIMETER);

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
        } catch (PhysicException e) {
            throw e;
        }
	}

	@Test 
	public void toCubeHectometerTest() throws PhysicException {
		double cubeKilometerValue = getRandomDouble();
		double cubeHectometerValue = getRandomDouble();
		double cubeDecameterValue = getRandomDouble();
		double cubeMeterValue = getRandomDouble();
		double cubeDecimeterValue = getRandomDouble();
		double cubeCentimeterValue = getRandomDouble();
		double cubeMillimeterValue = getRandomDouble();

        try {
            Volume cubeKilometerTestResult = new Volume(BigDecimal.valueOf(cubeKilometerValue).multiply(VOLUME_SCALES[CUBE_KILOMETER - 14]).divide(VOLUME_SCALES[CUBE_HECTOMETER - 14]), CUBE_KILOMETER);
            Volume cubeHectometerTestResult = new Volume(BigDecimal.valueOf(cubeHectometerValue).multiply(VOLUME_SCALES[CUBE_HECTOMETER - 14]).divide(VOLUME_SCALES[CUBE_HECTOMETER - 14]), CUBE_HECTOMETER);
            Volume cubeDecameterTestResult = new Volume(BigDecimal.valueOf(cubeDecameterValue).multiply(VOLUME_SCALES[CUBE_DECAMETER - 14]).divide(VOLUME_SCALES[CUBE_HECTOMETER - 14]), CUBE_DECAMETER);
            Volume cubeMeterTestResult = new Volume(BigDecimal.valueOf(cubeMeterValue).multiply(VOLUME_SCALES[CUBE_METER - 14]).divide(VOLUME_SCALES[CUBE_HECTOMETER - 14]), CUBE_METER);
            Volume cubeDecimeterTestResult = new Volume(BigDecimal.valueOf(cubeDecimeterValue).multiply(VOLUME_SCALES[CUBE_DECIMETER - 14]).divide(VOLUME_SCALES[CUBE_HECTOMETER - 14]), CUBE_DECIMETER);
            Volume cubeCentimeterTestResult = new Volume(BigDecimal.valueOf(cubeCentimeterValue).multiply(VOLUME_SCALES[CUBE_CENTIMETER - 14]).divide(VOLUME_SCALES[CUBE_HECTOMETER - 14]), CUBE_CENTIMETER);
            Volume cubeMillimeterTestResult = new Volume(BigDecimal.valueOf(cubeMillimeterValue).multiply(VOLUME_SCALES[CUBE_MILLIMETER - 14]).divide(VOLUME_SCALES[CUBE_HECTOMETER - 14]), CUBE_MILLIMETER);

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
        } catch (PhysicException e) {
            throw e;
        }
	}

	@Test 
	public void toCubeDecameterTest() throws PhysicException {
		double cubeKilometerValue = getRandomDouble();
		double cubeHectometerValue = getRandomDouble();
		double cubeDecameterValue = getRandomDouble();
		double cubeMeterValue = getRandomDouble();
		double cubeDecimeterValue = getRandomDouble();
		double cubeCentimeterValue = getRandomDouble();
		double cubeMillimeterValue = getRandomDouble();

        try {
            Volume cubeKilometerTestResult = new Volume(BigDecimal.valueOf(cubeKilometerValue).multiply(VOLUME_SCALES[CUBE_KILOMETER - 14]).divide(VOLUME_SCALES[CUBE_DECAMETER - 14]), CUBE_KILOMETER);
            Volume cubeHectometerTestResult = new Volume(BigDecimal.valueOf(cubeHectometerValue).multiply(VOLUME_SCALES[CUBE_HECTOMETER - 14]).divide(VOLUME_SCALES[CUBE_DECAMETER - 14]), CUBE_HECTOMETER);
            Volume cubeDecameterTestResult = new Volume(BigDecimal.valueOf(cubeDecameterValue).multiply(VOLUME_SCALES[CUBE_DECAMETER - 14]).divide(VOLUME_SCALES[CUBE_DECAMETER - 14]), CUBE_DECAMETER);
            Volume cubeMeterTestResult = new Volume(BigDecimal.valueOf(cubeMeterValue).multiply(VOLUME_SCALES[CUBE_METER - 14]).divide(VOLUME_SCALES[CUBE_DECAMETER - 14]), CUBE_METER);
            Volume cubeDecimeterTestResult = new Volume(BigDecimal.valueOf(cubeDecimeterValue).multiply(VOLUME_SCALES[CUBE_DECIMETER - 14]).divide(VOLUME_SCALES[CUBE_DECAMETER - 14]), CUBE_DECIMETER);
            Volume cubeCentimeterTestResult = new Volume(BigDecimal.valueOf(cubeCentimeterValue).multiply(VOLUME_SCALES[CUBE_CENTIMETER - 14]).divide(VOLUME_SCALES[CUBE_DECAMETER - 14]), CUBE_CENTIMETER);
            Volume cubeMillimeterTestResult = new Volume(BigDecimal.valueOf(cubeMillimeterValue).multiply(VOLUME_SCALES[CUBE_MILLIMETER - 14]).divide(VOLUME_SCALES[CUBE_DECAMETER - 14]), CUBE_MILLIMETER);

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
        } catch (PhysicException e) {
            throw e;
        }
	}

	@Test 
	public void toCubeMeterTest() throws PhysicException {
		double cubeKilometerValue = getRandomDouble();
		double cubeHectometerValue = getRandomDouble();
		double cubeDecameterValue = getRandomDouble();
		double cubeMeterValue = getRandomDouble();
		double cubeDecimeterValue = getRandomDouble();
		double cubeCentimeterValue = getRandomDouble();
		double cubeMillimeterValue = getRandomDouble();

        try {
            Volume cubeKilometerTestResult = new Volume(BigDecimal.valueOf(cubeKilometerValue).multiply(VOLUME_SCALES[CUBE_KILOMETER - 14]).divide(VOLUME_SCALES[CUBE_METER - 14]), CUBE_KILOMETER);
            Volume cubeHectometerTestResult = new Volume(BigDecimal.valueOf(cubeHectometerValue).multiply(VOLUME_SCALES[CUBE_HECTOMETER - 14]).divide(VOLUME_SCALES[CUBE_METER - 14]), CUBE_HECTOMETER);
            Volume cubeDecameterTestResult = new Volume(BigDecimal.valueOf(cubeDecameterValue).multiply(VOLUME_SCALES[CUBE_DECAMETER - 14]).divide(VOLUME_SCALES[CUBE_METER - 14]), CUBE_DECAMETER);
            Volume cubeMeterTestResult = new Volume(BigDecimal.valueOf(cubeMeterValue).multiply(VOLUME_SCALES[CUBE_METER - 14]).divide(VOLUME_SCALES[CUBE_METER - 14]), CUBE_METER);
            Volume cubeDecimeterTestResult = new Volume(BigDecimal.valueOf(cubeDecimeterValue).multiply(VOLUME_SCALES[CUBE_DECIMETER - 14]).divide(VOLUME_SCALES[CUBE_METER - 14]), CUBE_DECIMETER);
            Volume cubeCentimeterTestResult = new Volume(BigDecimal.valueOf(cubeCentimeterValue).multiply(VOLUME_SCALES[CUBE_CENTIMETER - 14]).divide(VOLUME_SCALES[CUBE_METER - 14]), CUBE_CENTIMETER);
            Volume cubeMillimeterTestResult = new Volume(BigDecimal.valueOf(cubeMillimeterValue).multiply(VOLUME_SCALES[CUBE_MILLIMETER - 14]).divide(VOLUME_SCALES[CUBE_METER - 14]), CUBE_MILLIMETER);

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
        } catch (PhysicException e) {
            throw e;
        }
	}

	@Test 
	public void toCubeDecimeterTest() throws PhysicException {
		double cubeKilometerValue = getRandomDouble();
		double cubeHectometerValue = getRandomDouble();
		double cubeDecameterValue = getRandomDouble();
		double cubeMeterValue = getRandomDouble();
		double cubeDecimeterValue = getRandomDouble();
		double cubeCentimeterValue = getRandomDouble();
		double cubeMillimeterValue = getRandomDouble();

        try {
            Volume cubeKilometerTestResult = new Volume(BigDecimal.valueOf(cubeKilometerValue).multiply(VOLUME_SCALES[CUBE_KILOMETER - 14]).divide(VOLUME_SCALES[CUBE_DECIMETER - 14]), CUBE_KILOMETER);
            Volume cubeHectometerTestResult = new Volume(BigDecimal.valueOf(cubeHectometerValue).multiply(VOLUME_SCALES[CUBE_HECTOMETER - 14]).divide(VOLUME_SCALES[CUBE_DECIMETER - 14]), CUBE_HECTOMETER);
            Volume cubeDecameterTestResult = new Volume(BigDecimal.valueOf(cubeDecameterValue).multiply(VOLUME_SCALES[CUBE_DECAMETER - 14]).divide(VOLUME_SCALES[CUBE_DECIMETER - 14]), CUBE_DECAMETER);
            Volume cubeMeterTestResult = new Volume(BigDecimal.valueOf(cubeMeterValue).multiply(VOLUME_SCALES[CUBE_METER - 14]).divide(VOLUME_SCALES[CUBE_DECIMETER - 14]), CUBE_METER);
            Volume cubeDecimeterTestResult = new Volume(BigDecimal.valueOf(cubeDecimeterValue).multiply(VOLUME_SCALES[CUBE_DECIMETER - 14]).divide(VOLUME_SCALES[CUBE_DECIMETER - 14]), CUBE_DECIMETER);
            Volume cubeCentimeterTestResult = new Volume(BigDecimal.valueOf(cubeCentimeterValue).multiply(VOLUME_SCALES[CUBE_CENTIMETER - 14]).divide(VOLUME_SCALES[CUBE_DECIMETER - 14]), CUBE_CENTIMETER);
            Volume cubeMillimeterTestResult = new Volume(BigDecimal.valueOf(cubeMillimeterValue).multiply(VOLUME_SCALES[CUBE_MILLIMETER - 14]).divide(VOLUME_SCALES[CUBE_DECIMETER - 14]), CUBE_MILLIMETER);

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
        } catch (PhysicException e) {
            throw e;
        }
	}

	@Test 
	public void toCubeCentimeterTest() throws PhysicException {
		double cubeKilometerValue = getRandomDouble();
		double cubeHectometerValue = getRandomDouble();
		double cubeDecameterValue = getRandomDouble();
		double cubeMeterValue = getRandomDouble();
		double cubeDecimeterValue = getRandomDouble();
		double cubeCentimeterValue = getRandomDouble();
		double cubeMillimeterValue = getRandomDouble();

        try {
            Volume cubeKilometerTestResult = new Volume(BigDecimal.valueOf(cubeKilometerValue).multiply(VOLUME_SCALES[CUBE_KILOMETER - 14]).divide(VOLUME_SCALES[CUBE_CENTIMETER - 14]), CUBE_KILOMETER);
            Volume cubeHectometerTestResult = new Volume(BigDecimal.valueOf(cubeHectometerValue).multiply(VOLUME_SCALES[CUBE_HECTOMETER - 14]).divide(VOLUME_SCALES[CUBE_CENTIMETER - 14]), CUBE_HECTOMETER);
            Volume cubeDecameterTestResult = new Volume(BigDecimal.valueOf(cubeDecameterValue).multiply(VOLUME_SCALES[CUBE_DECAMETER - 14]).divide(VOLUME_SCALES[CUBE_CENTIMETER - 14]), CUBE_DECAMETER);
            Volume cubeMeterTestResult = new Volume(BigDecimal.valueOf(cubeMeterValue).multiply(VOLUME_SCALES[CUBE_METER - 14]).divide(VOLUME_SCALES[CUBE_CENTIMETER - 14]), CUBE_METER);
            Volume cubeDecimeterTestResult = new Volume(BigDecimal.valueOf(cubeDecimeterValue).multiply(VOLUME_SCALES[CUBE_DECIMETER - 14]).divide(VOLUME_SCALES[CUBE_CENTIMETER - 14]), CUBE_DECIMETER);
            Volume cubeCentimeterTestResult = new Volume(BigDecimal.valueOf(cubeCentimeterValue).multiply(VOLUME_SCALES[CUBE_CENTIMETER - 14]).divide(VOLUME_SCALES[CUBE_CENTIMETER - 14]), CUBE_CENTIMETER);
            Volume cubeMillimeterTestResult = new Volume(BigDecimal.valueOf(cubeMillimeterValue).multiply(VOLUME_SCALES[CUBE_MILLIMETER - 14]).divide(VOLUME_SCALES[CUBE_CENTIMETER - 14]), CUBE_MILLIMETER);

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
        } catch (PhysicException e) {
            throw e;
        }
	}

	@Test 
	public void toCubeMillimeterTest() throws PhysicException {
		double cubeKilometerValue = getRandomDouble();
		double cubeHectometerValue = getRandomDouble();
		double cubeDecameterValue = getRandomDouble();
		double cubeMeterValue = getRandomDouble();
		double cubeDecimeterValue = getRandomDouble();
		double cubeCentimeterValue = getRandomDouble();
		double cubeMillimeterValue = getRandomDouble();

        try {
            Volume cubeKilometerTestResult = new Volume(BigDecimal.valueOf(cubeKilometerValue).multiply(VOLUME_SCALES[CUBE_KILOMETER - 14]).divide(VOLUME_SCALES[CUBE_MILLIMETER - 14]), CUBE_KILOMETER);
            Volume cubeHectometerTestResult = new Volume(BigDecimal.valueOf(cubeHectometerValue).multiply(VOLUME_SCALES[CUBE_HECTOMETER - 14]).divide(VOLUME_SCALES[CUBE_MILLIMETER - 14]), CUBE_HECTOMETER);
            Volume cubeDecameterTestResult = new Volume(BigDecimal.valueOf(cubeDecameterValue).multiply(VOLUME_SCALES[CUBE_DECAMETER - 14]).divide(VOLUME_SCALES[CUBE_MILLIMETER - 14]), CUBE_DECAMETER);
            Volume cubeMeterTestResult = new Volume(BigDecimal.valueOf(cubeMeterValue).multiply(VOLUME_SCALES[CUBE_METER - 14]).divide(VOLUME_SCALES[CUBE_MILLIMETER - 14]), CUBE_METER);
            Volume cubeDecimeterTestResult = new Volume(BigDecimal.valueOf(cubeDecimeterValue).multiply(VOLUME_SCALES[CUBE_DECIMETER - 14]).divide(VOLUME_SCALES[CUBE_MILLIMETER - 14]), CUBE_DECIMETER);
            Volume cubeCentimeterTestResult = new Volume(BigDecimal.valueOf(cubeCentimeterValue).multiply(VOLUME_SCALES[CUBE_CENTIMETER - 14]).divide(VOLUME_SCALES[CUBE_MILLIMETER - 14]), CUBE_CENTIMETER);
            Volume cubeMillimeterTestResult = new Volume(BigDecimal.valueOf(cubeMillimeterValue).multiply(VOLUME_SCALES[CUBE_MILLIMETER - 14]).divide(VOLUME_SCALES[CUBE_MILLIMETER - 14]), CUBE_MILLIMETER);

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
        } catch (PhysicException e) {
            throw e;
        }
	}

	private double getRandomDouble() {
		return random.nextDouble() * 100;
	}
}
