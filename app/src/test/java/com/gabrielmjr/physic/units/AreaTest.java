package com.gabrielmjr.physic.units;

import com.gabrielmjr.physic.PhysicException;
import java.math.BigDecimal;
import java.util.Random;
import org.junit.jupiter.api.Test;

import static com.gabrielmjr.physic.units.Area.toSquareKilometer;
import static com.gabrielmjr.physic.units.Area.toSquareHectometer;
import static com.gabrielmjr.physic.units.Area.toSquareDecameter;
import static com.gabrielmjr.physic.units.Area.toSquareMeter;
import static com.gabrielmjr.physic.units.Area.toSquareDecimeter;
import static com.gabrielmjr.physic.units.Area.toSquareCentimeter;
import static com.gabrielmjr.physic.units.Area.toSquareMillimeter;
import static com.gabrielmjr.physic.units.Area.AREA_SCALES;
import static com.gabrielmjr.physic.units.Area.SQUARE_KILOMETER;
import static com.gabrielmjr.physic.units.Area.SQUARE_HECTOMETER;
import static com.gabrielmjr.physic.units.Area.SQUARE_DECAMETER;
import static com.gabrielmjr.physic.units.Area.SQUARE_METER;
import static com.gabrielmjr.physic.units.Area.SQUARE_DECIMETER;
import static com.gabrielmjr.physic.units.Area.SQUARE_CENTIMETER;
import static com.gabrielmjr.physic.units.Area.SQUARE_MILLIMETER;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaTest {
	private final Random random;

	public AreaTest() {
		random = new Random();
	}

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
            Area squareKilometerTestResult = new Area(BigDecimal.valueOf(squareKilometerValue).multiply(AREA_SCALES[SQUARE_KILOMETER - 7]).divide(AREA_SCALES[SQUARE_KILOMETER - 7]), SQUARE_KILOMETER);
            Area squareHectometerTestResult = new Area(BigDecimal.valueOf(squareHectometerValue).multiply(AREA_SCALES[SQUARE_HECTOMETER - 7]).divide(AREA_SCALES[SQUARE_KILOMETER - 7]), SQUARE_HECTOMETER);
            Area squareDecameterTestResult = new Area(BigDecimal.valueOf(squareDecameterValue).multiply(AREA_SCALES[SQUARE_DECAMETER - 7]).divide(AREA_SCALES[SQUARE_KILOMETER - 7]), SQUARE_DECAMETER);
            Area squareMeterTestResult = new Area(BigDecimal.valueOf(squareMeterValue).multiply(AREA_SCALES[SQUARE_METER - 7]).divide(AREA_SCALES[SQUARE_KILOMETER - 7]), SQUARE_METER);
            Area squareDecimeterTestResult = new Area(BigDecimal.valueOf(squareDecimeterValue).multiply(AREA_SCALES[SQUARE_DECIMETER - 7]).divide(AREA_SCALES[SQUARE_KILOMETER - 7]), SQUARE_DECIMETER);
            Area squareCentimeterTestResult = new Area(BigDecimal.valueOf(squareCentimeterValue).multiply(AREA_SCALES[SQUARE_CENTIMETER - 7]).divide(AREA_SCALES[SQUARE_KILOMETER - 7]), SQUARE_CENTIMETER);
            Area squareMillimeterTestResult = new Area(BigDecimal.valueOf(squareMillimeterValue).multiply(AREA_SCALES[SQUARE_MILLIMETER - 7]).divide(AREA_SCALES[SQUARE_KILOMETER - 7]), SQUARE_MILLIMETER);

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
        } catch (InvalidUnitException e) {
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
            Area squareKilometerTestResult = new Area(BigDecimal.valueOf(squareKilometerValue).multiply(AREA_SCALES[SQUARE_KILOMETER - 7]).divide(AREA_SCALES[SQUARE_HECTOMETER - 7]), SQUARE_KILOMETER);
            Area squareHectometerTestResult = new Area(BigDecimal.valueOf(squareHectometerValue).multiply(AREA_SCALES[SQUARE_HECTOMETER - 7]).divide(AREA_SCALES[SQUARE_HECTOMETER - 7]), SQUARE_HECTOMETER);
            Area squareDecameterTestResult = new Area(BigDecimal.valueOf(squareDecameterValue).multiply(AREA_SCALES[SQUARE_DECAMETER - 7]).divide(AREA_SCALES[SQUARE_HECTOMETER - 7]), SQUARE_DECAMETER);
            Area squareMeterTestResult = new Area(BigDecimal.valueOf(squareMeterValue).multiply(AREA_SCALES[SQUARE_METER - 7]).divide(AREA_SCALES[SQUARE_HECTOMETER - 7]), SQUARE_METER);
            Area squareDecimeterTestResult = new Area(BigDecimal.valueOf(squareDecimeterValue).multiply(AREA_SCALES[SQUARE_DECIMETER - 7]).divide(AREA_SCALES[SQUARE_HECTOMETER - 7]), SQUARE_DECIMETER);
            Area squareCentimeterTestResult = new Area(BigDecimal.valueOf(squareCentimeterValue).multiply(AREA_SCALES[SQUARE_CENTIMETER - 7]).divide(AREA_SCALES[SQUARE_HECTOMETER - 7]), SQUARE_CENTIMETER);
            Area squareMillimeterTestResult = new Area(BigDecimal.valueOf(squareMillimeterValue).multiply(AREA_SCALES[SQUARE_MILLIMETER - 7]).divide(AREA_SCALES[SQUARE_HECTOMETER - 7]), SQUARE_MILLIMETER);

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
        } catch (InvalidUnitException e) {
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
            Area squareKilometerTestResult = new Area(BigDecimal.valueOf(squareKilometerValue).multiply(AREA_SCALES[SQUARE_KILOMETER - 7]).divide(AREA_SCALES[SQUARE_DECAMETER - 7]), SQUARE_KILOMETER);
            Area squareHectometerTestResult = new Area(BigDecimal.valueOf(squareHectometerValue).multiply(AREA_SCALES[SQUARE_HECTOMETER - 7]).divide(AREA_SCALES[SQUARE_DECAMETER - 7]), SQUARE_HECTOMETER);
            Area squareDecameterTestResult = new Area(BigDecimal.valueOf(squareDecameterValue).multiply(AREA_SCALES[SQUARE_DECAMETER - 7]).divide(AREA_SCALES[SQUARE_DECAMETER - 7]), SQUARE_DECAMETER);
            Area squareMeterTestResult = new Area(BigDecimal.valueOf(squareMeterValue).multiply(AREA_SCALES[SQUARE_METER - 7]).divide(AREA_SCALES[SQUARE_DECAMETER - 7]), SQUARE_METER);
            Area squareDecimeterTestResult = new Area(BigDecimal.valueOf(squareDecimeterValue).multiply(AREA_SCALES[SQUARE_DECIMETER - 7]).divide(AREA_SCALES[SQUARE_DECAMETER - 7]), SQUARE_DECIMETER);
            Area squareCentimeterTestResult = new Area(BigDecimal.valueOf(squareCentimeterValue).multiply(AREA_SCALES[SQUARE_CENTIMETER - 7]).divide(AREA_SCALES[SQUARE_DECAMETER - 7]), SQUARE_CENTIMETER);
            Area squareMillimeterTestResult = new Area(BigDecimal.valueOf(squareMillimeterValue).multiply(AREA_SCALES[SQUARE_MILLIMETER - 7]).divide(AREA_SCALES[SQUARE_DECAMETER - 7]), SQUARE_MILLIMETER);

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
        } catch (InvalidUnitException e) {
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
            Area squareKilometerTestResult = new Area(BigDecimal.valueOf(squareKilometerValue).multiply(AREA_SCALES[SQUARE_KILOMETER - 7]).divide(AREA_SCALES[SQUARE_METER - 7]), SQUARE_KILOMETER);
            Area squareHectometerTestResult = new Area(BigDecimal.valueOf(squareHectometerValue).multiply(AREA_SCALES[SQUARE_HECTOMETER - 7]).divide(AREA_SCALES[SQUARE_METER - 7]), SQUARE_HECTOMETER);
            Area squareDecameterTestResult = new Area(BigDecimal.valueOf(squareDecameterValue).multiply(AREA_SCALES[SQUARE_DECAMETER - 7]).divide(AREA_SCALES[SQUARE_METER - 7]), SQUARE_DECAMETER);
            Area squareMeterTestResult = new Area(BigDecimal.valueOf(squareMeterValue).multiply(AREA_SCALES[SQUARE_METER - 7]).divide(AREA_SCALES[SQUARE_METER - 7]), SQUARE_METER);
            Area squareDecimeterTestResult = new Area(BigDecimal.valueOf(squareDecimeterValue).multiply(AREA_SCALES[SQUARE_DECIMETER - 7]).divide(AREA_SCALES[SQUARE_METER - 7]), SQUARE_DECIMETER);
            Area squareCentimeterTestResult = new Area(BigDecimal.valueOf(squareCentimeterValue).multiply(AREA_SCALES[SQUARE_CENTIMETER - 7]).divide(AREA_SCALES[SQUARE_METER - 7]), SQUARE_CENTIMETER);
            Area squareMillimeterTestResult = new Area(BigDecimal.valueOf(squareMillimeterValue).multiply(AREA_SCALES[SQUARE_MILLIMETER - 7]).divide(AREA_SCALES[SQUARE_METER - 7]), SQUARE_MILLIMETER);

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
        } catch (InvalidUnitException e) {
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
            Area squareKilometerTestResult = new Area(BigDecimal.valueOf(squareKilometerValue).multiply(AREA_SCALES[SQUARE_KILOMETER - 7]).divide(AREA_SCALES[SQUARE_DECIMETER - 7]), SQUARE_KILOMETER);
            Area squareHectometerTestResult = new Area(BigDecimal.valueOf(squareHectometerValue).multiply(AREA_SCALES[SQUARE_HECTOMETER - 7]).divide(AREA_SCALES[SQUARE_DECIMETER - 7]), SQUARE_HECTOMETER);
            Area squareDecameterTestResult = new Area(BigDecimal.valueOf(squareDecameterValue).multiply(AREA_SCALES[SQUARE_DECAMETER - 7]).divide(AREA_SCALES[SQUARE_DECIMETER - 7]), SQUARE_DECAMETER);
            Area squareMeterTestResult = new Area(BigDecimal.valueOf(squareMeterValue).multiply(AREA_SCALES[SQUARE_METER - 7]).divide(AREA_SCALES[SQUARE_DECIMETER - 7]), SQUARE_METER);
            Area squareDecimeterTestResult = new Area(BigDecimal.valueOf(squareDecimeterValue).multiply(AREA_SCALES[SQUARE_DECIMETER - 7]).divide(AREA_SCALES[SQUARE_DECIMETER - 7]), SQUARE_DECIMETER);
            Area squareCentimeterTestResult = new Area(BigDecimal.valueOf(squareCentimeterValue).multiply(AREA_SCALES[SQUARE_CENTIMETER - 7]).divide(AREA_SCALES[SQUARE_DECIMETER - 7]), SQUARE_CENTIMETER);
            Area squareMillimeterTestResult = new Area(BigDecimal.valueOf(squareMillimeterValue).multiply(AREA_SCALES[SQUARE_MILLIMETER - 7]).divide(AREA_SCALES[SQUARE_DECIMETER - 7]), SQUARE_MILLIMETER);

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
        } catch (InvalidUnitException e) {
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
            Area squareKilometerTestResult = new Area(BigDecimal.valueOf(squareKilometerValue).multiply(AREA_SCALES[SQUARE_KILOMETER - 7]).divide(AREA_SCALES[SQUARE_CENTIMETER - 7]), SQUARE_KILOMETER);
            Area squareHectometerTestResult = new Area(BigDecimal.valueOf(squareHectometerValue).multiply(AREA_SCALES[SQUARE_HECTOMETER - 7]).divide(AREA_SCALES[SQUARE_CENTIMETER - 7]), SQUARE_HECTOMETER);
            Area squareDecameterTestResult = new Area(BigDecimal.valueOf(squareDecameterValue).multiply(AREA_SCALES[SQUARE_DECAMETER - 7]).divide(AREA_SCALES[SQUARE_CENTIMETER - 7]), SQUARE_DECAMETER);
            Area squareMeterTestResult = new Area(BigDecimal.valueOf(squareMeterValue).multiply(AREA_SCALES[SQUARE_METER - 7]).divide(AREA_SCALES[SQUARE_CENTIMETER - 7]), SQUARE_METER);
            Area squareDecimeterTestResult = new Area(BigDecimal.valueOf(squareDecimeterValue).multiply(AREA_SCALES[SQUARE_DECIMETER - 7]).divide(AREA_SCALES[SQUARE_CENTIMETER - 7]), SQUARE_DECIMETER);
            Area squareCentimeterTestResult = new Area(BigDecimal.valueOf(squareCentimeterValue).multiply(AREA_SCALES[SQUARE_CENTIMETER - 7]).divide(AREA_SCALES[SQUARE_CENTIMETER - 7]), SQUARE_CENTIMETER);
            Area squareMillimeterTestResult = new Area(BigDecimal.valueOf(squareMillimeterValue).multiply(AREA_SCALES[SQUARE_MILLIMETER - 7]).divide(AREA_SCALES[SQUARE_CENTIMETER - 7]), SQUARE_MILLIMETER);
        
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
        } catch (InvalidUnitException e) {
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
            Area squareKilometerTestResult = new Area(BigDecimal.valueOf(squareKilometerValue).multiply(AREA_SCALES[SQUARE_KILOMETER - 7]).divide(AREA_SCALES[SQUARE_MILLIMETER - 7]), SQUARE_KILOMETER);
            Area squareHectometerTestResult = new Area(BigDecimal.valueOf(squareHectometerValue).multiply(AREA_SCALES[SQUARE_HECTOMETER - 7]).divide(AREA_SCALES[SQUARE_MILLIMETER - 7]), SQUARE_HECTOMETER);
            Area squareDecameterTestResult = new Area(BigDecimal.valueOf(squareDecameterValue).multiply(AREA_SCALES[SQUARE_DECAMETER - 7]).divide(AREA_SCALES[SQUARE_MILLIMETER - 7]), SQUARE_DECAMETER);
            Area squareMeterTestResult = new Area(BigDecimal.valueOf(squareMeterValue).multiply(AREA_SCALES[SQUARE_METER - 7]).divide(AREA_SCALES[SQUARE_MILLIMETER - 7]), SQUARE_METER);
            Area squareDecimeterTestResult = new Area(BigDecimal.valueOf(squareDecimeterValue).multiply(AREA_SCALES[SQUARE_DECIMETER - 7]).divide(AREA_SCALES[SQUARE_MILLIMETER - 7]), SQUARE_DECIMETER);
            Area squareCentimeterTestResult = new Area(BigDecimal.valueOf(squareCentimeterValue).multiply(AREA_SCALES[SQUARE_CENTIMETER - 7]).divide(AREA_SCALES[SQUARE_MILLIMETER - 7]), SQUARE_CENTIMETER);
            Area squareMillimeterTestResult = new Area(BigDecimal.valueOf(squareMillimeterValue).multiply(AREA_SCALES[SQUARE_MILLIMETER - 7]).divide(AREA_SCALES[SQUARE_MILLIMETER - 7]), SQUARE_MILLIMETER);
        
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
        } catch (InvalidUnitException e) {
            throw e;
        }
	}

	private double getRandomDouble() {
		return random.nextDouble() * 100;
	}
}
