package com.mjr.twaire.code.physic.units;

import com.mjr.twaire.code.physic.PhysicException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.junit.jupiter.api.Test;

import static com.mjr.twaire.code.physic.NumberRandomizer.getRandomDouble;
import static com.mjr.twaire.code.physic.Physic.ROUND_SCALE;
import static com.mjr.twaire.code.physic.units.Area.toSquareKilometer;
import static com.mjr.twaire.code.physic.units.Area.toSquareHectometer;
import static com.mjr.twaire.code.physic.units.Area.toSquareDecameter;
import static com.mjr.twaire.code.physic.units.Area.toSquareMeter;
import static com.mjr.twaire.code.physic.units.Area.toSquareDecimeter;
import static com.mjr.twaire.code.physic.units.Area.toSquareCentimeter;
import static com.mjr.twaire.code.physic.units.Area.toSquareMillimeter;
import static com.mjr.twaire.code.physic.units.Area.AREA_SCALES;
import static com.mjr.twaire.code.physic.units.Area.SQUARE_KILOMETER;
import static com.mjr.twaire.code.physic.units.Area.SQUARE_HECTOMETER;
import static com.mjr.twaire.code.physic.units.Area.SQUARE_DECAMETER;
import static com.mjr.twaire.code.physic.units.Area.SQUARE_METER;
import static com.mjr.twaire.code.physic.units.Area.SQUARE_DECIMETER;
import static com.mjr.twaire.code.physic.units.Area.SQUARE_CENTIMETER;
import static com.mjr.twaire.code.physic.units.Area.SQUARE_MILLIMETER;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaTest {
	@Test 
	public void toSquareKilometerTest() throws PhysicException {
		double squareKilometerValue = getRandomDouble();
		double squareHectometerValue = getRandomDouble();
		double squareDecameterValue = getRandomDouble();
		double squareMeterValue = getRandomDouble();
		double squareDecimeterValue = getRandomDouble();
		double squareCentimeterValue = getRandomDouble();
	    double squareMillimeterValue = getRandomDouble();

        try {
            Area squareKilometerTestResult = new Area(BigDecimal.valueOf(squareKilometerValue).multiply(AREA_SCALES[SQUARE_KILOMETER - 7]).divide(AREA_SCALES[SQUARE_KILOMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_KILOMETER);
            Area squareHectometerTestResult = new Area(BigDecimal.valueOf(squareHectometerValue).multiply(AREA_SCALES[SQUARE_HECTOMETER - 7]).divide(AREA_SCALES[SQUARE_KILOMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_HECTOMETER);
            Area squareDecameterTestResult = new Area(BigDecimal.valueOf(squareDecameterValue).multiply(AREA_SCALES[SQUARE_DECAMETER - 7]).divide(AREA_SCALES[SQUARE_KILOMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_DECAMETER);
            Area squareMeterTestResult = new Area(BigDecimal.valueOf(squareMeterValue).multiply(AREA_SCALES[SQUARE_METER - 7]).divide(AREA_SCALES[SQUARE_KILOMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_METER);
            Area squareDecimeterTestResult = new Area(BigDecimal.valueOf(squareDecimeterValue).multiply(AREA_SCALES[SQUARE_DECIMETER - 7]).divide(AREA_SCALES[SQUARE_KILOMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_DECIMETER);
            Area squareCentimeterTestResult = new Area(BigDecimal.valueOf(squareCentimeterValue).multiply(AREA_SCALES[SQUARE_CENTIMETER - 7]).divide(AREA_SCALES[SQUARE_KILOMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_CENTIMETER);
            Area squareMillimeterTestResult = new Area(BigDecimal.valueOf(squareMillimeterValue).multiply(AREA_SCALES[SQUARE_MILLIMETER - 7]).divide(AREA_SCALES[SQUARE_KILOMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_MILLIMETER);

            Area squareKilometerResult = toSquareKilometer(squareKilometerValue, SQUARE_KILOMETER);
            Area squareHectometerResult = toSquareKilometer(squareHectometerValue, SQUARE_HECTOMETER);
            Area squareDecameterResult = toSquareKilometer(squareDecameterValue, SQUARE_DECAMETER);
            Area squareMeterResult = toSquareKilometer(squareMeterValue, SQUARE_METER);
            Area squareDecimeterResult = toSquareKilometer(squareDecimeterValue, SQUARE_DECIMETER);
            Area squareCentimeterResult = toSquareKilometer(squareCentimeterValue, SQUARE_CENTIMETER);
            Area squareMillimeterResult = toSquareKilometer(squareMillimeterValue, SQUARE_MILLIMETER);
            
            assertEquals(squareKilometerTestResult, squareKilometerResult);
            assertEquals(squareHectometerTestResult, squareHectometerResult);
            assertEquals(squareDecameterTestResult, squareDecameterResult);
            assertEquals(squareMeterTestResult, squareMeterResult);
            assertEquals(squareDecimeterTestResult, squareDecimeterResult);
            assertEquals(squareCentimeterTestResult, squareCentimeterResult);
            assertEquals(squareMillimeterTestResult, squareMillimeterResult);
        } catch (PhysicException e) {
            throw e;
        }
    }

	@Test 
	public void toSquareHectometerTest() throws PhysicException {
		double squareKilometerValue = getRandomDouble();
		double squareHectometerValue = getRandomDouble();
		double squareDecameterValue = getRandomDouble();
		double squareMeterValue = getRandomDouble();
		double squareDecimeterValue = getRandomDouble();
		double squareCentimeterValue = getRandomDouble();
		double squareMillimeterValue = getRandomDouble();

        try {
            Area squareKilometerTestResult = new Area(BigDecimal.valueOf(squareKilometerValue).multiply(AREA_SCALES[SQUARE_KILOMETER - 7]).divide(AREA_SCALES[SQUARE_HECTOMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_KILOMETER);
            Area squareHectometerTestResult = new Area(BigDecimal.valueOf(squareHectometerValue).multiply(AREA_SCALES[SQUARE_HECTOMETER - 7]).divide(AREA_SCALES[SQUARE_HECTOMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_HECTOMETER);
            Area squareDecameterTestResult = new Area(BigDecimal.valueOf(squareDecameterValue).multiply(AREA_SCALES[SQUARE_DECAMETER - 7]).divide(AREA_SCALES[SQUARE_HECTOMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_DECAMETER);
            Area squareMeterTestResult = new Area(BigDecimal.valueOf(squareMeterValue).multiply(AREA_SCALES[SQUARE_METER - 7]).divide(AREA_SCALES[SQUARE_HECTOMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_METER);
            Area squareDecimeterTestResult = new Area(BigDecimal.valueOf(squareDecimeterValue).multiply(AREA_SCALES[SQUARE_DECIMETER - 7]).divide(AREA_SCALES[SQUARE_HECTOMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_DECIMETER);
            Area squareCentimeterTestResult = new Area(BigDecimal.valueOf(squareCentimeterValue).multiply(AREA_SCALES[SQUARE_CENTIMETER - 7]).divide(AREA_SCALES[SQUARE_HECTOMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_CENTIMETER);
            Area squareMillimeterTestResult = new Area(BigDecimal.valueOf(squareMillimeterValue).multiply(AREA_SCALES[SQUARE_MILLIMETER - 7]).divide(AREA_SCALES[SQUARE_HECTOMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_MILLIMETER);

            Area squareKilometerResult = toSquareHectometer(squareKilometerValue, SQUARE_KILOMETER);
            Area squareHectometerResult = toSquareHectometer(squareHectometerValue, SQUARE_HECTOMETER);
            Area squareDecameterResult = toSquareHectometer(squareDecameterValue, SQUARE_DECAMETER);
            Area squareMeterResult = toSquareHectometer(squareMeterValue, SQUARE_METER);
            Area squareDecimeterResult = toSquareHectometer(squareDecimeterValue, SQUARE_DECIMETER);
            Area squareCentimeterResult = toSquareHectometer(squareCentimeterValue, SQUARE_CENTIMETER);
            Area squareMillimeterResult = toSquareHectometer(squareMillimeterValue, SQUARE_MILLIMETER);

            assertEquals(squareKilometerTestResult, squareKilometerResult);
            assertEquals(squareHectometerTestResult, squareHectometerResult);
            assertEquals(squareDecameterTestResult, squareDecameterResult);
            assertEquals(squareMeterTestResult, squareMeterResult);
            assertEquals(squareDecimeterTestResult, squareDecimeterResult);
            assertEquals(squareCentimeterTestResult, squareCentimeterResult);
            assertEquals(squareMillimeterTestResult, squareMillimeterResult);
        } catch (PhysicException e) {
            throw e;
        }
    }

	@Test 
	public void toSquareDecameterTest() throws PhysicException {
		double squareKilometerValue = getRandomDouble();
		double squareHectometerValue = getRandomDouble();
		double squareDecameterValue = getRandomDouble();
		double squareMeterValue = getRandomDouble();
		double squareDecimeterValue = getRandomDouble();
		double squareCentimeterValue = getRandomDouble();
		double squareMillimeterValue = getRandomDouble();

        try {
            Area squareKilometerTestResult = new Area(BigDecimal.valueOf(squareKilometerValue).multiply(AREA_SCALES[SQUARE_KILOMETER - 7]).divide(AREA_SCALES[SQUARE_DECAMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_KILOMETER);
            Area squareHectometerTestResult = new Area(BigDecimal.valueOf(squareHectometerValue).multiply(AREA_SCALES[SQUARE_HECTOMETER - 7]).divide(AREA_SCALES[SQUARE_DECAMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_HECTOMETER);
            Area squareDecameterTestResult = new Area(BigDecimal.valueOf(squareDecameterValue).multiply(AREA_SCALES[SQUARE_DECAMETER - 7]).divide(AREA_SCALES[SQUARE_DECAMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_DECAMETER);
            Area squareMeterTestResult = new Area(BigDecimal.valueOf(squareMeterValue).multiply(AREA_SCALES[SQUARE_METER - 7]).divide(AREA_SCALES[SQUARE_DECAMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_METER);
            Area squareDecimeterTestResult = new Area(BigDecimal.valueOf(squareDecimeterValue).multiply(AREA_SCALES[SQUARE_DECIMETER - 7]).divide(AREA_SCALES[SQUARE_DECAMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_DECIMETER);
            Area squareCentimeterTestResult = new Area(BigDecimal.valueOf(squareCentimeterValue).multiply(AREA_SCALES[SQUARE_CENTIMETER - 7]).divide(AREA_SCALES[SQUARE_DECAMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_CENTIMETER);
            Area squareMillimeterTestResult = new Area(BigDecimal.valueOf(squareMillimeterValue).multiply(AREA_SCALES[SQUARE_MILLIMETER - 7]).divide(AREA_SCALES[SQUARE_DECAMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_MILLIMETER);

            Area squareKilometerResult = toSquareDecameter(squareKilometerValue, SQUARE_KILOMETER);
            Area squareHectometerResult = toSquareDecameter(squareHectometerValue, SQUARE_HECTOMETER);
            Area squareDecameterResult = toSquareDecameter(squareDecameterValue, SQUARE_DECAMETER);
            Area squareMeterResult = toSquareDecameter(squareMeterValue, SQUARE_METER);
            Area squareDecimeterResult = toSquareDecameter(squareDecimeterValue, SQUARE_DECIMETER);
            Area squareCentimeterResult = toSquareDecameter(squareCentimeterValue, SQUARE_CENTIMETER);
            Area squareMillimeterResult = toSquareDecameter(squareMillimeterValue, SQUARE_MILLIMETER);

            assertEquals(squareKilometerTestResult, squareKilometerResult);
            assertEquals(squareHectometerTestResult, squareHectometerResult);
            assertEquals(squareDecameterTestResult, squareDecameterResult);
            assertEquals(squareMeterTestResult, squareMeterResult);
            assertEquals(squareDecimeterTestResult, squareDecimeterResult);
            assertEquals(squareCentimeterTestResult, squareCentimeterResult);
            assertEquals(squareMillimeterTestResult, squareMillimeterResult);
        } catch (PhysicException e) {
            throw e;
        }
	}

	@Test 
	public void toSquareMeterTest() throws PhysicException {
		double squareKilometerValue = getRandomDouble();
		double squareHectometerValue = getRandomDouble();
		double squareDecameterValue = getRandomDouble();
		double squareMeterValue = getRandomDouble();
		double squareDecimeterValue = getRandomDouble();
		double squareCentimeterValue = getRandomDouble();
		double squareMillimeterValue = getRandomDouble();

        try {
            Area squareKilometerTestResult = new Area(BigDecimal.valueOf(squareKilometerValue).multiply(AREA_SCALES[SQUARE_KILOMETER - 7]).divide(AREA_SCALES[SQUARE_METER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_KILOMETER);
            Area squareHectometerTestResult = new Area(BigDecimal.valueOf(squareHectometerValue).multiply(AREA_SCALES[SQUARE_HECTOMETER - 7]).divide(AREA_SCALES[SQUARE_METER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_HECTOMETER);
            Area squareDecameterTestResult = new Area(BigDecimal.valueOf(squareDecameterValue).multiply(AREA_SCALES[SQUARE_DECAMETER - 7]).divide(AREA_SCALES[SQUARE_METER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_DECAMETER);
            Area squareMeterTestResult = new Area(BigDecimal.valueOf(squareMeterValue).multiply(AREA_SCALES[SQUARE_METER - 7]).divide(AREA_SCALES[SQUARE_METER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_METER);
            Area squareDecimeterTestResult = new Area(BigDecimal.valueOf(squareDecimeterValue).multiply(AREA_SCALES[SQUARE_DECIMETER - 7]).divide(AREA_SCALES[SQUARE_METER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_DECIMETER);
            Area squareCentimeterTestResult = new Area(BigDecimal.valueOf(squareCentimeterValue).multiply(AREA_SCALES[SQUARE_CENTIMETER - 7]).divide(AREA_SCALES[SQUARE_METER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_CENTIMETER);
            Area squareMillimeterTestResult = new Area(BigDecimal.valueOf(squareMillimeterValue).multiply(AREA_SCALES[SQUARE_MILLIMETER - 7]).divide(AREA_SCALES[SQUARE_METER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_MILLIMETER);

            Area squareKilometerResult = toSquareMeter(squareKilometerValue, SQUARE_KILOMETER);
            Area squareHectometerResult = toSquareMeter(squareHectometerValue, SQUARE_HECTOMETER);
            Area squareDecameterResult = toSquareMeter(squareDecameterValue, SQUARE_DECAMETER);
            Area squareMeterResult = toSquareMeter(squareMeterValue, SQUARE_METER);
            Area squareDecimeterResult = toSquareMeter(squareDecimeterValue, SQUARE_DECIMETER);
            Area squareCentimeterResult = toSquareMeter(squareCentimeterValue, SQUARE_CENTIMETER);
            Area squareMillimeterResult = toSquareMeter(squareMillimeterValue, SQUARE_MILLIMETER);

            assertEquals(squareKilometerTestResult, squareKilometerResult);
            assertEquals(squareHectometerTestResult, squareHectometerResult);
            assertEquals(squareDecameterTestResult, squareDecameterResult);
            assertEquals(squareMeterTestResult, squareMeterResult);
            assertEquals(squareDecimeterTestResult, squareDecimeterResult);
            assertEquals(squareCentimeterTestResult, squareCentimeterResult);
            assertEquals(squareMillimeterTestResult, squareMillimeterResult);
        } catch (PhysicException e) {
            throw e;
        }
    }

	@Test 
	public void toSquareDecimeterTest() throws PhysicException {
		double squareKilometerValue = getRandomDouble();
		double squareHectometerValue = getRandomDouble();
		double squareDecameterValue = getRandomDouble();
		double squareMeterValue = getRandomDouble();
		double squareDecimeterValue = getRandomDouble();
		double squareCentimeterValue = getRandomDouble();
		double squareMillimeterValue = getRandomDouble();

        try {
            Area squareKilometerTestResult = new Area(BigDecimal.valueOf(squareKilometerValue).multiply(AREA_SCALES[SQUARE_KILOMETER - 7]).divide(AREA_SCALES[SQUARE_DECIMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_KILOMETER);
            Area squareHectometerTestResult = new Area(BigDecimal.valueOf(squareHectometerValue).multiply(AREA_SCALES[SQUARE_HECTOMETER - 7]).divide(AREA_SCALES[SQUARE_DECIMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_HECTOMETER);
            Area squareDecameterTestResult = new Area(BigDecimal.valueOf(squareDecameterValue).multiply(AREA_SCALES[SQUARE_DECAMETER - 7]).divide(AREA_SCALES[SQUARE_DECIMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_DECAMETER);
            Area squareMeterTestResult = new Area(BigDecimal.valueOf(squareMeterValue).multiply(AREA_SCALES[SQUARE_METER - 7]).divide(AREA_SCALES[SQUARE_DECIMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_METER);
            Area squareDecimeterTestResult = new Area(BigDecimal.valueOf(squareDecimeterValue).multiply(AREA_SCALES[SQUARE_DECIMETER - 7]).divide(AREA_SCALES[SQUARE_DECIMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_DECIMETER);
            Area squareCentimeterTestResult = new Area(BigDecimal.valueOf(squareCentimeterValue).multiply(AREA_SCALES[SQUARE_CENTIMETER - 7]).divide(AREA_SCALES[SQUARE_DECIMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_CENTIMETER);
            Area squareMillimeterTestResult = new Area(BigDecimal.valueOf(squareMillimeterValue).multiply(AREA_SCALES[SQUARE_MILLIMETER - 7]).divide(AREA_SCALES[SQUARE_DECIMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_MILLIMETER);

            Area squareKilometerResult = toSquareDecimeter(squareKilometerValue, SQUARE_KILOMETER);
            Area squareHectometerResult = toSquareDecimeter(squareHectometerValue, SQUARE_HECTOMETER);
            Area squareDecameterResult = toSquareDecimeter(squareDecameterValue, SQUARE_DECAMETER);
            Area squareMeterResult = toSquareDecimeter(squareMeterValue, SQUARE_METER);
            Area squareDecimeterResult = toSquareDecimeter(squareDecimeterValue, SQUARE_DECIMETER);
            Area squareCentimeterResult = toSquareDecimeter(squareCentimeterValue, SQUARE_CENTIMETER);
            Area squareMillimeterResult = toSquareDecimeter(squareMillimeterValue, SQUARE_MILLIMETER);

            assertEquals(squareKilometerTestResult, squareKilometerResult);
            assertEquals(squareHectometerTestResult, squareHectometerResult);
            assertEquals(squareDecameterTestResult, squareDecameterResult);
            assertEquals(squareMeterTestResult, squareMeterResult);
            assertEquals(squareDecimeterTestResult, squareDecimeterResult);
            assertEquals(squareCentimeterTestResult, squareCentimeterResult);
            assertEquals(squareMillimeterTestResult, squareMillimeterResult);
        } catch (PhysicException e) {
            throw e;
        }
	}

	@Test 
	public void toSquareCentimeterTest() throws PhysicException {
		double squareKilometerValue = getRandomDouble();
		double squareHectometerValue = getRandomDouble();
		double squareDecameterValue = getRandomDouble();
		double squareMeterValue = getRandomDouble();
		double squareDecimeterValue = getRandomDouble();
		double squareCentimeterValue = getRandomDouble();
		double squareMillimeterValue = getRandomDouble();

        try {
            Area squareKilometerTestResult = new Area(BigDecimal.valueOf(squareKilometerValue).multiply(AREA_SCALES[SQUARE_KILOMETER - 7]).divide(AREA_SCALES[SQUARE_CENTIMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_KILOMETER);
            Area squareHectometerTestResult = new Area(BigDecimal.valueOf(squareHectometerValue).multiply(AREA_SCALES[SQUARE_HECTOMETER - 7]).divide(AREA_SCALES[SQUARE_CENTIMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_HECTOMETER);
            Area squareDecameterTestResult = new Area(BigDecimal.valueOf(squareDecameterValue).multiply(AREA_SCALES[SQUARE_DECAMETER - 7]).divide(AREA_SCALES[SQUARE_CENTIMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_DECAMETER);
            Area squareMeterTestResult = new Area(BigDecimal.valueOf(squareMeterValue).multiply(AREA_SCALES[SQUARE_METER - 7]).divide(AREA_SCALES[SQUARE_CENTIMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_METER);
            Area squareDecimeterTestResult = new Area(BigDecimal.valueOf(squareDecimeterValue).multiply(AREA_SCALES[SQUARE_DECIMETER - 7]).divide(AREA_SCALES[SQUARE_CENTIMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_DECIMETER);
            Area squareCentimeterTestResult = new Area(BigDecimal.valueOf(squareCentimeterValue).multiply(AREA_SCALES[SQUARE_CENTIMETER - 7]).divide(AREA_SCALES[SQUARE_CENTIMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_CENTIMETER);
            Area squareMillimeterTestResult = new Area(BigDecimal.valueOf(squareMillimeterValue).multiply(AREA_SCALES[SQUARE_MILLIMETER - 7]).divide(AREA_SCALES[SQUARE_CENTIMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_MILLIMETER);
        
            Area squareKilometerResult = toSquareCentimeter(squareKilometerValue, SQUARE_KILOMETER);
            Area squareHectometerResult = toSquareCentimeter(squareHectometerValue, SQUARE_HECTOMETER);
            Area squareDecameterResult = toSquareCentimeter(squareDecameterValue, SQUARE_DECAMETER);
            Area squareMeterResult = toSquareCentimeter(squareMeterValue, SQUARE_METER);
            Area squareDecimeterResult = toSquareCentimeter(squareDecimeterValue, SQUARE_DECIMETER);
            Area squareCentimeterResult = toSquareCentimeter(squareCentimeterValue, SQUARE_CENTIMETER);
            Area squareMillimeterResult = toSquareCentimeter(squareMillimeterValue, SQUARE_MILLIMETER);

            assertEquals(squareKilometerTestResult, squareKilometerResult);
            assertEquals(squareHectometerTestResult, squareHectometerResult);
            assertEquals(squareDecameterTestResult, squareDecameterResult);
            assertEquals(squareMeterTestResult, squareMeterResult);
            assertEquals(squareDecimeterTestResult, squareDecimeterResult);
            assertEquals(squareCentimeterTestResult, squareCentimeterResult);
            assertEquals(squareMillimeterTestResult, squareMillimeterResult);
        } catch (PhysicException e) {
            throw e;
        }
	}

	@Test 
	public void toSquareMillimeterTest() throws PhysicException {
		double squareKilometerValue = getRandomDouble();
		double squareHectometerValue = getRandomDouble();
		double squareDecameterValue = getRandomDouble();
		double squareMeterValue = getRandomDouble();
		double squareDecimeterValue = getRandomDouble();
		double squareCentimeterValue = getRandomDouble();
		double squareMillimeterValue = getRandomDouble();

        try {
            Area squareKilometerTestResult = new Area(BigDecimal.valueOf(squareKilometerValue).multiply(AREA_SCALES[SQUARE_KILOMETER - 7]).divide(AREA_SCALES[SQUARE_MILLIMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_KILOMETER);
            Area squareHectometerTestResult = new Area(BigDecimal.valueOf(squareHectometerValue).multiply(AREA_SCALES[SQUARE_HECTOMETER - 7]).divide(AREA_SCALES[SQUARE_MILLIMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_HECTOMETER);
            Area squareDecameterTestResult = new Area(BigDecimal.valueOf(squareDecameterValue).multiply(AREA_SCALES[SQUARE_DECAMETER - 7]).divide(AREA_SCALES[SQUARE_MILLIMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_DECAMETER);
            Area squareMeterTestResult = new Area(BigDecimal.valueOf(squareMeterValue).multiply(AREA_SCALES[SQUARE_METER - 7]).divide(AREA_SCALES[SQUARE_MILLIMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_METER);
            Area squareDecimeterTestResult = new Area(BigDecimal.valueOf(squareDecimeterValue).multiply(AREA_SCALES[SQUARE_DECIMETER - 7]).divide(AREA_SCALES[SQUARE_MILLIMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_DECIMETER);
            Area squareCentimeterTestResult = new Area(BigDecimal.valueOf(squareCentimeterValue).multiply(AREA_SCALES[SQUARE_CENTIMETER - 7]).divide(AREA_SCALES[SQUARE_MILLIMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_CENTIMETER);
            Area squareMillimeterTestResult = new Area(BigDecimal.valueOf(squareMillimeterValue).multiply(AREA_SCALES[SQUARE_MILLIMETER - 7]).divide(AREA_SCALES[SQUARE_MILLIMETER - 7], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_MILLIMETER);
        
            Area squareKilometerResult = toSquareMillimeter(squareKilometerValue, SQUARE_KILOMETER);
            Area squareHectometerResult = toSquareMillimeter(squareHectometerValue, SQUARE_HECTOMETER);
            Area squareDecameterResult = toSquareMillimeter(squareDecameterValue, SQUARE_DECAMETER);
            Area squareMeterResult = toSquareMillimeter(squareMeterValue, SQUARE_METER);
            Area squareDecimeterResult = toSquareMillimeter(squareDecimeterValue, SQUARE_DECIMETER);
            Area squareCentimeterResult = toSquareMillimeter(squareCentimeterValue, SQUARE_CENTIMETER);
            Area squareMillimeterResult = toSquareMillimeter(squareMillimeterValue, SQUARE_MILLIMETER);

            assertEquals(squareKilometerTestResult, squareKilometerResult);
            assertEquals(squareHectometerTestResult, squareHectometerResult);
            assertEquals(squareDecameterTestResult, squareDecameterResult);
            assertEquals(squareMeterTestResult, squareMeterResult);
            assertEquals(squareDecimeterTestResult, squareDecimeterResult);
            assertEquals(squareCentimeterTestResult, squareCentimeterResult);
            assertEquals(squareMillimeterTestResult, squareMillimeterResult);
        } catch (PhysicException e) {
            throw e;
        }
	}
	
	@Test
	public void toSquareKilometerFixedResultTest() throws PhysicException {
		int squareKilometerValue = 1;
		int squareHectometerValue = 1;
		int squareDecameterValue = 1;
		int squareMeterValue = 1;
		int squareDecimeterValue = 1;
		int squareCentimeterValue = 1;
		int squareMillimeterValue = 1;

		try {
			Area squareKilometerTestResult = new Area("1.00000000000000000000", SQUARE_KILOMETER);
			Area squareHectometerTestResult= new Area("0.01000000000000000000", SQUARE_KILOMETER);
			Area squareDecameterTestResult = new Area("0.00010000000000000000", SQUARE_KILOMETER);
			Area squareMeterTestResult = new Area("0.00000100000000000000", SQUARE_KILOMETER);
			Area squareDecimeterTestResult = new Area("0.00000001000000000000", SQUARE_KILOMETER);
			Area squareCentimeterTestResult = new Area("0.00000000010000000000", SQUARE_KILOMETER);
			Area squareMillimeterTestResult = new Area("0.00000000000100000000", SQUARE_KILOMETER);

			Area squareKilometerResult = toSquareKilometer(squareKilometerValue, SQUARE_KILOMETER);
			Area squareHectometerResult = toSquareKilometer(squareHectometerValue, SQUARE_HECTOMETER);
			Area squareDecameterResult = toSquareKilometer(squareDecameterValue, SQUARE_DECAMETER);
			Area squareMeterResult = toSquareKilometer(squareMeterValue, SQUARE_METER);
			Area squareDecimeterResult = toSquareKilometer(squareDecimeterValue, SQUARE_DECIMETER);
			Area squareCentimeterResult = toSquareKilometer(squareCentimeterValue, SQUARE_CENTIMETER);
			Area squareMillimeterResult = toSquareKilometer(squareMillimeterValue, SQUARE_MILLIMETER);

			assertEquals(squareKilometerTestResult, squareKilometerResult);
            assertEquals(squareHectometerTestResult, squareHectometerResult);
            assertEquals(squareDecameterTestResult, squareDecameterResult);
            assertEquals(squareMeterTestResult, squareMeterResult);
            assertEquals(squareDecimeterTestResult, squareDecimeterResult);
            assertEquals(squareCentimeterTestResult, squareCentimeterResult);
            assertEquals(squareMillimeterTestResult, squareMillimeterResult);
        } catch (PhysicException e) {
            throw e;
        }
	}
	
	@Test
	public void toSquareHectometerFixedResultTest() throws PhysicException {
		int squareKilometerValue = 1;
		int squareHectometerValue = 1;
		int squareDecameterValue = 1;
		int squareMeterValue = 1;
		int squareDecimeterValue = 1;
		int squareCentimeterValue = 1;
		int squareMillimeterValue = 1;

		try {
			Area squareKilometerTestResult = new Area("100.00000000000000000000", SQUARE_HECTOMETER);
			Area squareHectometerTestResult= new Area("1.00000000000000000000", SQUARE_HECTOMETER);
			Area squareDecameterTestResult = new Area("0.01000000000000000000", SQUARE_HECTOMETER);
			Area squareMeterTestResult = new Area("0.00010000000000000000", SQUARE_HECTOMETER);
			Area squareDecimeterTestResult = new Area("0.00000100000000000000", SQUARE_HECTOMETER);
			Area squareCentimeterTestResult = new Area("0.00000001000000000000", SQUARE_HECTOMETER);
			Area squareMillimeterTestResult = new Area("0.00000000010000000000", SQUARE_HECTOMETER);

			Area squareKilometerResult = toSquareHectometer(squareKilometerValue, SQUARE_KILOMETER);
			Area squareHectometerResult = toSquareHectometer(squareHectometerValue, SQUARE_HECTOMETER);
			Area squareDecameterResult = toSquareHectometer(squareDecameterValue, SQUARE_DECAMETER);
			Area squareMeterResult = toSquareHectometer(squareMeterValue, SQUARE_METER);
			Area squareDecimeterResult = toSquareHectometer(squareDecimeterValue, SQUARE_DECIMETER);
			Area squareCentimeterResult = toSquareHectometer(squareCentimeterValue, SQUARE_CENTIMETER);
			Area squareMillimeterResult = toSquareHectometer(squareMillimeterValue, SQUARE_MILLIMETER);

			assertEquals(squareKilometerTestResult, squareKilometerResult);
            assertEquals(squareHectometerTestResult, squareHectometerResult);
            assertEquals(squareDecameterTestResult, squareDecameterResult);
            assertEquals(squareMeterTestResult, squareMeterResult);
            assertEquals(squareDecimeterTestResult, squareDecimeterResult);
            assertEquals(squareCentimeterTestResult, squareCentimeterResult);
            assertEquals(squareMillimeterTestResult, squareMillimeterResult);
        } catch (PhysicException e) {
            throw e;
        }
	}
	
	@Test
	public void toSquareDecameterFixedResultTest() throws PhysicException {
		int squareKilometerValue = 1;
		int squareHectometerValue = 1;
		int squareDecameterValue = 1;
		int squareMeterValue = 1;
		int squareDecimeterValue = 1;
		int squareCentimeterValue = 1;
		int squareMillimeterValue = 1;

		try {
			Area squareKilometerTestResult = new Area("10000.00000000000000000000", SQUARE_DECAMETER);
			Area squareHectometerTestResult= new Area("100.00000000000000000000", SQUARE_DECAMETER);
			Area squareDecameterTestResult = new Area("1.00000000000000000000", SQUARE_DECAMETER);
			Area squareMeterTestResult = new Area("0.01000000000000000000", SQUARE_DECAMETER);
			Area squareDecimeterTestResult = new Area("0.00010000000000000000", SQUARE_DECAMETER);
			Area squareCentimeterTestResult = new Area("0.00000100000000000000", SQUARE_DECAMETER);
			Area squareMillimeterTestResult = new Area("0.00000001000000000000", SQUARE_DECAMETER);

			Area squareKilometerResult = toSquareDecameter(squareKilometerValue, SQUARE_KILOMETER);
			Area squareHectometerResult = toSquareDecameter(squareHectometerValue, SQUARE_HECTOMETER);
			Area squareDecameterResult = toSquareDecameter(squareDecameterValue, SQUARE_DECAMETER);
			Area squareMeterResult = toSquareDecameter(squareMeterValue, SQUARE_METER);
			Area squareDecimeterResult = toSquareDecameter(squareDecimeterValue, SQUARE_DECIMETER);
			Area squareCentimeterResult = toSquareDecameter(squareCentimeterValue, SQUARE_CENTIMETER);
			Area squareMillimeterResult = toSquareDecameter(squareMillimeterValue, SQUARE_MILLIMETER);

			assertEquals(squareKilometerTestResult, squareKilometerResult);
            assertEquals(squareHectometerTestResult, squareHectometerResult);
            assertEquals(squareDecameterTestResult, squareDecameterResult);
            assertEquals(squareMeterTestResult, squareMeterResult);
            assertEquals(squareDecimeterTestResult, squareDecimeterResult);
            assertEquals(squareCentimeterTestResult, squareCentimeterResult);
            assertEquals(squareMillimeterTestResult, squareMillimeterResult);
        } catch (PhysicException e) {
            throw e;
        }
	}
	
	@Test
	public void toSquareMeterFixedResultTest() throws PhysicException {
		int squareKilometerValue = 1;
		int squareHectometerValue = 1;
		int squareDecameterValue = 1;
		int squareMeterValue = 1;
		int squareDecimeterValue = 1;
		int squareCentimeterValue = 1;
		int squareMillimeterValue = 1;

		try {
			Area squareKilometerTestResult = new Area("1000000.00000000000000000000", SQUARE_DECAMETER);
			Area squareHectometerTestResult= new Area("10000.00000000000000000000", SQUARE_DECAMETER);
			Area squareDecameterTestResult = new Area("100.00000000000000000000", SQUARE_DECAMETER);
			Area squareMeterTestResult = new Area("1.00000000000000000000", SQUARE_DECAMETER);
			Area squareDecimeterTestResult = new Area("0.01000000000000000000", SQUARE_DECAMETER);
			Area squareCentimeterTestResult = new Area("0.00010000000000000000", SQUARE_DECAMETER);
			Area squareMillimeterTestResult = new Area("0.00000100000000000000", SQUARE_DECAMETER);

			Area squareKilometerResult = toSquareMeter(squareKilometerValue, SQUARE_KILOMETER);
			Area squareHectometerResult = toSquareMeter(squareHectometerValue, SQUARE_HECTOMETER);
			Area squareDecameterResult = toSquareMeter(squareDecameterValue, SQUARE_DECAMETER);
			Area squareMeterResult = toSquareMeter(squareMeterValue, SQUARE_METER);
			Area squareDecimeterResult = toSquareMeter(squareDecimeterValue, SQUARE_DECIMETER);
			Area squareCentimeterResult = toSquareMeter(squareCentimeterValue, SQUARE_CENTIMETER);
			Area squareMillimeterResult = toSquareMeter(squareMillimeterValue, SQUARE_MILLIMETER);

			assertEquals(squareKilometerTestResult, squareKilometerResult);
            assertEquals(squareHectometerTestResult, squareHectometerResult);
            assertEquals(squareDecameterTestResult, squareDecameterResult);
            assertEquals(squareMeterTestResult, squareMeterResult);
            assertEquals(squareDecimeterTestResult, squareDecimeterResult);
            assertEquals(squareCentimeterTestResult, squareCentimeterResult);
            assertEquals(squareMillimeterTestResult, squareMillimeterResult);
        } catch (PhysicException e) {
            throw e;
        }
	}
	
	@Test
	public void toSquareDecimeterFixedResultTest() throws PhysicException {
		int squareKilometerValue = 1;
		int squareHectometerValue = 1;
		int squareDecameterValue = 1;
		int squareMeterValue = 1;
		int squareDecimeterValue = 1;
		int squareCentimeterValue = 1;
		int squareMillimeterValue = 1;

		try {
			Area squareKilometerTestResult = new Area("100000000.00000000000000000000", SQUARE_DECAMETER);
			Area squareHectometerTestResult= new Area("1000000.00000000000000000000", SQUARE_DECAMETER);
			Area squareDecameterTestResult = new Area("10000.00000000000000000000", SQUARE_DECAMETER);
			Area squareMeterTestResult = new Area("100.00000000000000000000", SQUARE_DECAMETER);
			Area squareDecimeterTestResult = new Area("1.00000000000000000000", SQUARE_DECAMETER);
			Area squareCentimeterTestResult = new Area("0.01000000000000000000", SQUARE_DECAMETER);
			Area squareMillimeterTestResult = new Area("0.00010000000000000000", SQUARE_DECAMETER);

			Area squareKilometerResult = toSquareDecimeter(squareKilometerValue, SQUARE_KILOMETER);
			Area squareHectometerResult = toSquareDecimeter(squareHectometerValue, SQUARE_HECTOMETER);
			Area squareDecameterResult = toSquareDecimeter(squareDecameterValue, SQUARE_DECAMETER);
			Area squareMeterResult = toSquareDecimeter(squareMeterValue, SQUARE_METER);
			Area squareDecimeterResult = toSquareDecimeter(squareDecimeterValue, SQUARE_DECIMETER);
			Area squareCentimeterResult = toSquareDecimeter(squareCentimeterValue, SQUARE_CENTIMETER);
			Area squareMillimeterResult = toSquareDecimeter(squareMillimeterValue, SQUARE_MILLIMETER);

			assertEquals(squareKilometerTestResult, squareKilometerResult);
            assertEquals(squareHectometerTestResult, squareHectometerResult);
            assertEquals(squareDecameterTestResult, squareDecameterResult);
            assertEquals(squareMeterTestResult, squareMeterResult);
            assertEquals(squareDecimeterTestResult, squareDecimeterResult);
            assertEquals(squareCentimeterTestResult, squareCentimeterResult);
            assertEquals(squareMillimeterTestResult, squareMillimeterResult);
        } catch (PhysicException e) {
            throw e;
        }
	}
	
	@Test
	public void toSquareCentimeterFixedResultTest() throws PhysicException {
		int squareKilometerValue = 1;
		int squareHectometerValue = 1;
		int squareDecameterValue = 1;
		int squareMeterValue = 1;
		int squareDecimeterValue = 1;
		int squareCentimeterValue = 1;
		int squareMillimeterValue = 1;

		try {
			Area squareKilometerTestResult = new Area("10000000000.00000000000000000000", SQUARE_DECAMETER);
			Area squareHectometerTestResult= new Area("100000000.00000000000000000000", SQUARE_DECAMETER);
			Area squareDecameterTestResult = new Area("1000000.00000000000000000000", SQUARE_DECAMETER);
			Area squareMeterTestResult = new Area("10000.00000000000000000000", SQUARE_DECAMETER);
			Area squareDecimeterTestResult = new Area("100.00000000000000000000", SQUARE_DECAMETER);
			Area squareCentimeterTestResult = new Area("1.00000000000000000000", SQUARE_DECAMETER);
			Area squareMillimeterTestResult = new Area("0.01000000000000000000", SQUARE_DECAMETER);

			Area squareKilometerResult = toSquareCentimeter(squareKilometerValue, SQUARE_KILOMETER);
			Area squareHectometerResult = toSquareCentimeter(squareHectometerValue, SQUARE_HECTOMETER);
			Area squareDecameterResult = toSquareCentimeter(squareDecameterValue, SQUARE_DECAMETER);
			Area squareMeterResult = toSquareCentimeter(squareMeterValue, SQUARE_METER);
			Area squareDecimeterResult = toSquareCentimeter(squareDecimeterValue, SQUARE_DECIMETER);
			Area squareCentimeterResult = toSquareCentimeter(squareCentimeterValue, SQUARE_CENTIMETER);
			Area squareMillimeterResult = toSquareCentimeter(squareMillimeterValue, SQUARE_MILLIMETER);

			assertEquals(squareKilometerTestResult, squareKilometerResult);
            assertEquals(squareHectometerTestResult, squareHectometerResult);
            assertEquals(squareDecameterTestResult, squareDecameterResult);
            assertEquals(squareMeterTestResult, squareMeterResult);
            assertEquals(squareDecimeterTestResult, squareDecimeterResult);
            assertEquals(squareCentimeterTestResult, squareCentimeterResult);
            assertEquals(squareMillimeterTestResult, squareMillimeterResult);
        } catch (PhysicException e) {
            throw e;
        }
	}
	
	@Test
	public void toSquareMillimeterFixedResultTest() throws PhysicException {
		int squareKilometerValue = 1;
		int squareHectometerValue = 1;
		int squareDecameterValue = 1;
		int squareMeterValue = 1;
		int squareDecimeterValue = 1;
		int squareCentimeterValue = 1;
		int squareMillimeterValue = 1;

		try {
			Area squareKilometerTestResult = new Area("1000000000000.00000000000000000000", SQUARE_DECAMETER);
			Area squareHectometerTestResult= new Area("10000000000.00000000000000000000", SQUARE_DECAMETER);
			Area squareDecameterTestResult = new Area("100000000.00000000000000000000", SQUARE_DECAMETER);
			Area squareMeterTestResult = new Area("1000000.00000000000000000000", SQUARE_DECAMETER);
			Area squareDecimeterTestResult = new Area("10000.00000000000000000000", SQUARE_DECAMETER);
			Area squareCentimeterTestResult = new Area("100.00000000000000000000", SQUARE_DECAMETER);
			Area squareMillimeterTestResult = new Area("1.00000000000000000000", SQUARE_DECAMETER);

			Area squareKilometerResult = toSquareMillimeter(squareKilometerValue, SQUARE_KILOMETER);
			Area squareHectometerResult = toSquareMillimeter(squareHectometerValue, SQUARE_HECTOMETER);
			Area squareDecameterResult = toSquareMillimeter(squareDecameterValue, SQUARE_DECAMETER);
			Area squareMeterResult = toSquareMillimeter(squareMeterValue, SQUARE_METER);
			Area squareDecimeterResult = toSquareMillimeter(squareDecimeterValue, SQUARE_DECIMETER);
			Area squareCentimeterResult = toSquareMillimeter(squareCentimeterValue, SQUARE_CENTIMETER);
			Area squareMillimeterResult = toSquareMillimeter(squareMillimeterValue, SQUARE_MILLIMETER);

			assertEquals(squareKilometerTestResult, squareKilometerResult);
            assertEquals(squareHectometerTestResult, squareHectometerResult);
            assertEquals(squareDecameterTestResult, squareDecameterResult);
            assertEquals(squareMeterTestResult, squareMeterResult);
            assertEquals(squareDecimeterTestResult, squareDecimeterResult);
            assertEquals(squareCentimeterTestResult, squareCentimeterResult);
            assertEquals(squareMillimeterTestResult, squareMillimeterResult);
        } catch (PhysicException e) {
            throw e;
        }
	}
}
