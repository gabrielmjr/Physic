package com.mjr.code.physics.units;

import com.mjr.code.physics.NumberRandomizer;
import org.junit.jupiter.api.Test;

import static com.mjr.code.physics.units.Area.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaTest extends UnitTest {
    @Test
    public void toSquareKilometerTest() {
        double squareKilometerValue = NumberRandomizer.getRandomDouble();
        double squareHectometerValue = NumberRandomizer.getRandomDouble();
        double squareDecameterValue = NumberRandomizer.getRandomDouble();
        double squareMeterValue = NumberRandomizer.getRandomDouble();
        double squareDecimeterValue = NumberRandomizer.getRandomDouble();
        double squareCentimeterValue = NumberRandomizer.getRandomDouble();
        double squareMillimeterValue = NumberRandomizer.getRandomDouble();

        Area squareKilometerTestResult = convert(squareKilometerValue, SQUARE_KILOMETER, SQUARE_KILOMETER);
        Area squareHectometerTestResult = convert(squareHectometerValue, SQUARE_HECTOMETER, SQUARE_KILOMETER);
        Area squareDecameterTestResult = convert(squareDecameterValue, SQUARE_DECAMETER, SQUARE_KILOMETER);
        Area squareMeterTestResult = convert(squareMeterValue, SQUARE_METER, SQUARE_KILOMETER);
        Area squareDecimeterTestResult = convert(squareDecimeterValue, SQUARE_DECIMETER, SQUARE_KILOMETER);
        Area squareCentimeterTestResult = convert(squareCentimeterValue, SQUARE_CENTIMETER, SQUARE_KILOMETER);
        Area squareMillimeterTestResult = convert(squareMillimeterValue, SQUARE_MILLIMETER, SQUARE_KILOMETER);

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
    }

    @Test
    public void toSquareHectometerTest() {
        double squareKilometerValue = NumberRandomizer.getRandomDouble();
        double squareHectometerValue = NumberRandomizer.getRandomDouble();
        double squareDecameterValue = NumberRandomizer.getRandomDouble();
        double squareMeterValue = NumberRandomizer.getRandomDouble();
        double squareDecimeterValue = NumberRandomizer.getRandomDouble();
        double squareCentimeterValue = NumberRandomizer.getRandomDouble();
        double squareMillimeterValue = NumberRandomizer.getRandomDouble();

        Area squareKilometerTestResult = convert(squareKilometerValue, SQUARE_KILOMETER, SQUARE_HECTOMETER);
        Area squareHectometerTestResult = convert(squareHectometerValue, SQUARE_HECTOMETER, SQUARE_HECTOMETER);
        Area squareDecameterTestResult = convert(squareDecameterValue, SQUARE_DECAMETER, SQUARE_HECTOMETER);
        Area squareMeterTestResult = convert(squareMeterValue, SQUARE_METER, SQUARE_HECTOMETER);
        Area squareDecimeterTestResult = convert(squareDecimeterValue, SQUARE_DECIMETER, SQUARE_HECTOMETER);
        Area squareCentimeterTestResult = convert(squareCentimeterValue, SQUARE_CENTIMETER, SQUARE_HECTOMETER);
        Area squareMillimeterTestResult = convert(squareMillimeterValue, SQUARE_MILLIMETER, SQUARE_HECTOMETER);

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
    }

    @Test
    public void toSquareDecameterTest() {
        double squareKilometerValue = NumberRandomizer.getRandomDouble();
        double squareHectometerValue = NumberRandomizer.getRandomDouble();
        double squareDecameterValue = NumberRandomizer.getRandomDouble();
        double squareMeterValue = NumberRandomizer.getRandomDouble();
        double squareDecimeterValue = NumberRandomizer.getRandomDouble();
        double squareCentimeterValue = NumberRandomizer.getRandomDouble();
        double squareMillimeterValue = NumberRandomizer.getRandomDouble();

        Area squareKilometerTestResult = convert(squareKilometerValue, SQUARE_KILOMETER, SQUARE_DECAMETER);
        Area squareHectometerTestResult = convert(squareHectometerValue, SQUARE_HECTOMETER, SQUARE_DECAMETER);
        Area squareDecameterTestResult = convert(squareDecameterValue, SQUARE_DECAMETER, SQUARE_DECAMETER);
        Area squareMeterTestResult = convert(squareMeterValue, SQUARE_METER, SQUARE_DECAMETER);
        Area squareDecimeterTestResult = convert(squareDecimeterValue, SQUARE_DECIMETER, SQUARE_DECAMETER);
        Area squareCentimeterTestResult = convert(squareCentimeterValue, SQUARE_CENTIMETER, SQUARE_DECAMETER);
        Area squareMillimeterTestResult = convert(squareMillimeterValue, SQUARE_MILLIMETER, SQUARE_DECAMETER);

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
    }

    @Test
    public void toSquareMeterTest() {
        double squareKilometerValue = NumberRandomizer.getRandomDouble();
        double squareHectometerValue = NumberRandomizer.getRandomDouble();
        double squareDecameterValue = NumberRandomizer.getRandomDouble();
        double squareMeterValue = NumberRandomizer.getRandomDouble();
        double squareDecimeterValue = NumberRandomizer.getRandomDouble();
        double squareCentimeterValue = NumberRandomizer.getRandomDouble();
        double squareMillimeterValue = NumberRandomizer.getRandomDouble();

        Area squareKilometerTestResult = convert(squareKilometerValue, SQUARE_KILOMETER, SQUARE_METER);
        Area squareHectometerTestResult = convert(squareHectometerValue, SQUARE_HECTOMETER, SQUARE_METER);
        Area squareDecameterTestResult = convert(squareDecameterValue, SQUARE_DECAMETER, SQUARE_METER);
        Area squareMeterTestResult = convert(squareMeterValue, SQUARE_METER, SQUARE_METER);
        Area squareDecimeterTestResult = convert(squareDecimeterValue, SQUARE_DECIMETER, SQUARE_METER);
        Area squareCentimeterTestResult = convert(squareCentimeterValue, SQUARE_CENTIMETER, SQUARE_METER);
        Area squareMillimeterTestResult = convert(squareMillimeterValue, SQUARE_MILLIMETER, SQUARE_METER);

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
    }

    @Test
    public void toSquareDecimeterTest() {
        double squareKilometerValue = NumberRandomizer.getRandomDouble();
        double squareHectometerValue = NumberRandomizer.getRandomDouble();
        double squareDecameterValue = NumberRandomizer.getRandomDouble();
        double squareMeterValue = NumberRandomizer.getRandomDouble();
        double squareDecimeterValue = NumberRandomizer.getRandomDouble();
        double squareCentimeterValue = NumberRandomizer.getRandomDouble();
        double squareMillimeterValue = NumberRandomizer.getRandomDouble();

        Area squareKilometerTestResult = convert(squareKilometerValue, SQUARE_KILOMETER, SQUARE_DECIMETER);
        Area squareHectometerTestResult = convert(squareHectometerValue, SQUARE_HECTOMETER, SQUARE_DECIMETER);
        Area squareDecameterTestResult = convert(squareDecameterValue, SQUARE_DECAMETER, SQUARE_DECIMETER);
        Area squareMeterTestResult = convert(squareMeterValue, SQUARE_METER, SQUARE_DECIMETER);
        Area squareDecimeterTestResult = convert(squareDecimeterValue, SQUARE_DECIMETER, SQUARE_DECIMETER);
        Area squareCentimeterTestResult = convert(squareCentimeterValue, SQUARE_CENTIMETER, SQUARE_DECIMETER);
        Area squareMillimeterTestResult = convert(squareMillimeterValue, SQUARE_MILLIMETER, SQUARE_DECIMETER);

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
    }

    @Test
    public void toSquareCentimeterTest() {
        double squareKilometerValue = NumberRandomizer.getRandomDouble();
        double squareHectometerValue = NumberRandomizer.getRandomDouble();
        double squareDecameterValue = NumberRandomizer.getRandomDouble();
        double squareMeterValue = NumberRandomizer.getRandomDouble();
        double squareDecimeterValue = NumberRandomizer.getRandomDouble();
        double squareCentimeterValue = NumberRandomizer.getRandomDouble();
        double squareMillimeterValue = NumberRandomizer.getRandomDouble();

        Area squareKilometerTestResult = convert(squareKilometerValue, SQUARE_KILOMETER, SQUARE_CENTIMETER);
        Area squareHectometerTestResult = convert(squareHectometerValue, SQUARE_HECTOMETER, SQUARE_CENTIMETER);
        Area squareDecameterTestResult = convert(squareDecameterValue, SQUARE_DECAMETER, SQUARE_CENTIMETER);
        Area squareMeterTestResult = convert(squareMeterValue, SQUARE_METER, SQUARE_CENTIMETER);
        Area squareDecimeterTestResult = convert(squareDecimeterValue, SQUARE_DECIMETER, SQUARE_CENTIMETER);
        Area squareCentimeterTestResult = convert(squareCentimeterValue, SQUARE_CENTIMETER, SQUARE_CENTIMETER);
        Area squareMillimeterTestResult = convert(squareMillimeterValue, SQUARE_MILLIMETER, SQUARE_CENTIMETER);

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
    }

    @Test
    public void toSquareMillimeterTest() {
        double squareKilometerValue = NumberRandomizer.getRandomDouble();
        double squareHectometerValue = NumberRandomizer.getRandomDouble();
        double squareDecameterValue = NumberRandomizer.getRandomDouble();
        double squareMeterValue = NumberRandomizer.getRandomDouble();
        double squareDecimeterValue = NumberRandomizer.getRandomDouble();
        double squareCentimeterValue = NumberRandomizer.getRandomDouble();
        double squareMillimeterValue = NumberRandomizer.getRandomDouble();

        Area squareKilometerTestResult = convert(squareKilometerValue, SQUARE_KILOMETER, SQUARE_MILLIMETER);
        Area squareHectometerTestResult = convert(squareHectometerValue, SQUARE_HECTOMETER, SQUARE_MILLIMETER);
        Area squareDecameterTestResult = convert(squareDecameterValue, SQUARE_DECAMETER, SQUARE_MILLIMETER);
        Area squareMeterTestResult = convert(squareMeterValue, SQUARE_METER, SQUARE_MILLIMETER);
        Area squareDecimeterTestResult = convert(squareDecimeterValue, SQUARE_DECIMETER, SQUARE_MILLIMETER);
        Area squareCentimeterTestResult = convert(squareCentimeterValue, SQUARE_CENTIMETER, SQUARE_MILLIMETER);
        Area squareMillimeterTestResult = convert(squareMillimeterValue, SQUARE_MILLIMETER, SQUARE_MILLIMETER);

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
    }

    @Test
    public void toSquareKilometerFixedResultTest() {
        int squareKilometerValue = 1;
        int squareHectometerValue = 1;
        int squareDecameterValue = 1;
        int squareMeterValue = 1;
        int squareDecimeterValue = 1;
        int squareCentimeterValue = 1;
        int squareMillimeterValue = 1;

        Area squareKilometerTestResult = new Area("1.00000000000000000000", SQUARE_KILOMETER);
        Area squareHectometerTestResult = new Area("0.01000000000000000000", SQUARE_KILOMETER);
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
    }

    @Test
    public void toSquareHectometerFixedResultTest() {
        int squareKilometerValue = 1;
        int squareHectometerValue = 1;
        int squareDecameterValue = 1;
        int squareMeterValue = 1;
        int squareDecimeterValue = 1;
        int squareCentimeterValue = 1;
        int squareMillimeterValue = 1;

        Area squareKilometerTestResult = new Area("100.00000000000000000000", SQUARE_HECTOMETER);
        Area squareHectometerTestResult = new Area("1.00000000000000000000", SQUARE_HECTOMETER);
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
    }

    @Test
    public void toSquareDecameterFixedResultTest() {
        int squareKilometerValue = 1;
        int squareHectometerValue = 1;
        int squareDecameterValue = 1;
        int squareMeterValue = 1;
        int squareDecimeterValue = 1;
        int squareCentimeterValue = 1;
        int squareMillimeterValue = 1;

        Area squareKilometerTestResult = new Area("10000.00000000000000000000", SQUARE_DECAMETER);
        Area squareHectometerTestResult = new Area("100.00000000000000000000", SQUARE_DECAMETER);
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
    }

    @Test
    public void toSquareMeterFixedResultTest() {
        int squareKilometerValue = 1;
        int squareHectometerValue = 1;
        int squareDecameterValue = 1;
        int squareMeterValue = 1;
        int squareDecimeterValue = 1;
        int squareCentimeterValue = 1;
        int squareMillimeterValue = 1;

        Area squareKilometerTestResult = new Area("1000000.00000000000000000000", SQUARE_METER);
        Area squareHectometerTestResult = new Area("10000.00000000000000000000", SQUARE_METER);
        Area squareDecameterTestResult = new Area("100.00000000000000000000", SQUARE_METER);
        Area squareMeterTestResult = new Area("1.00000000000000000000", SQUARE_METER);
        Area squareDecimeterTestResult = new Area("0.01000000000000000000", SQUARE_METER);
        Area squareCentimeterTestResult = new Area("0.00010000000000000000", SQUARE_METER);
        Area squareMillimeterTestResult = new Area("0.00000100000000000000", SQUARE_METER);

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
    }

    @Test
    public void toSquareDecimeterFixedResultTest() {
        int squareKilometerValue = 1;
        int squareHectometerValue = 1;
        int squareDecameterValue = 1;
        int squareMeterValue = 1;
        int squareDecimeterValue = 1;
        int squareCentimeterValue = 1;
        int squareMillimeterValue = 1;

        Area squareKilometerTestResult = new Area("100000000.00000000000000000000", SQUARE_DECIMETER);
        Area squareHectometerTestResult = new Area("1000000.00000000000000000000", SQUARE_DECIMETER);
        Area squareDecameterTestResult = new Area("10000.00000000000000000000", SQUARE_DECIMETER);
        Area squareMeterTestResult = new Area("100.00000000000000000000", SQUARE_DECIMETER);
        Area squareDecimeterTestResult = new Area("1.00000000000000000000", SQUARE_DECIMETER);
        Area squareCentimeterTestResult = new Area("0.01000000000000000000", SQUARE_DECIMETER);
        Area squareMillimeterTestResult = new Area("0.00010000000000000000", SQUARE_DECIMETER);

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
    }

    @Test
    public void toSquareCentimeterFixedResultTest() {
        int squareKilometerValue = 1;
        int squareHectometerValue = 1;
        int squareDecameterValue = 1;
        int squareMeterValue = 1;
        int squareDecimeterValue = 1;
        int squareCentimeterValue = 1;
        int squareMillimeterValue = 1;

        Area squareKilometerTestResult = new Area("10000000000.00000000000000000000", SQUARE_CENTIMETER);
        Area squareHectometerTestResult = new Area("100000000.00000000000000000000", SQUARE_CENTIMETER);
        Area squareDecameterTestResult = new Area("1000000.00000000000000000000", SQUARE_CENTIMETER);
        Area squareMeterTestResult = new Area("10000.00000000000000000000", SQUARE_CENTIMETER);
        Area squareDecimeterTestResult = new Area("100.00000000000000000000", SQUARE_CENTIMETER);
        Area squareCentimeterTestResult = new Area("1.00000000000000000000", SQUARE_CENTIMETER);
        Area squareMillimeterTestResult = new Area("0.01000000000000000000", SQUARE_CENTIMETER);

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
    }

    @Test
    public void toSquareMillimeterFixedResultTest() {
        int squareKilometerValue = 1;
        int squareHectometerValue = 1;
        int squareDecameterValue = 1;
        int squareMeterValue = 1;
        int squareDecimeterValue = 1;
        int squareCentimeterValue = 1;
        int squareMillimeterValue = 1;

        Area squareKilometerTestResult = new Area("1000000000000.00000000000000000000", SQUARE_MILLIMETER);
        Area squareHectometerTestResult = new Area("10000000000.00000000000000000000", SQUARE_MILLIMETER);
        Area squareDecameterTestResult = new Area("100000000.00000000000000000000", SQUARE_MILLIMETER);
        Area squareMeterTestResult = new Area("1000000.00000000000000000000", SQUARE_MILLIMETER);
        Area squareDecimeterTestResult = new Area("10000.00000000000000000000", SQUARE_MILLIMETER);
        Area squareCentimeterTestResult = new Area("100.00000000000000000000", SQUARE_MILLIMETER);
        Area squareMillimeterTestResult = new Area("1.00000000000000000000", SQUARE_MILLIMETER);

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
    }

    @Override
    public Area convert(double value, int currentUnit, int targetUnit) {
        return new Area(divide(multiply(value, AREA_SCALES[targetUnit - UNIT_SCALE]), AREA_SCALES[currentUnit - UNIT_SCALE]), targetUnit);
    }
}
