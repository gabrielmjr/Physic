package com.mjr.code.physics.units;

import com.mjr.code.physics.NumberRandomizer;
import org.junit.jupiter.api.Test;

import static com.mjr.code.physics.units.Area.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaTest extends UnitTest {
    @Test
    public void toSquaredKilometerTest() {
        double squaredKilometerValue = NumberRandomizer.getRandomDouble();
        double squaredHectometerValue = NumberRandomizer.getRandomDouble();
        double squaredDecameterValue = NumberRandomizer.getRandomDouble();
        double squaredMeterValue = NumberRandomizer.getRandomDouble();
        double squaredDecimeterValue = NumberRandomizer.getRandomDouble();
        double squaredCentimeterValue = NumberRandomizer.getRandomDouble();
        double squaredMillimeterValue = NumberRandomizer.getRandomDouble();

        Area squaredKilometerTestResult = convert(squaredKilometerValue, SQUARED_KILOMETER, SQUARED_KILOMETER);
        Area squaredHectometerTestResult = convert(squaredHectometerValue, SQUARED_HECTOMETER, SQUARED_KILOMETER);
        Area squaredDecameterTestResult = convert(squaredDecameterValue, SQUARED_DECAMETER, SQUARED_KILOMETER);
        Area squaredMeterTestResult = convert(squaredMeterValue, SQUARED_METER, SQUARED_KILOMETER);
        Area squaredDecimeterTestResult = convert(squaredDecimeterValue, SQUARED_DECIMETER, SQUARED_KILOMETER);
        Area squaredCentimeterTestResult = convert(squaredCentimeterValue, SQUARED_CENTIMETER, SQUARED_KILOMETER);
        Area squaredMillimeterTestResult = convert(squaredMillimeterValue, SQUARED_MILLIMETER, SQUARED_KILOMETER);

        Area squaredKilometerResult = toSquaredKilometer(squaredKilometerValue, SQUARED_KILOMETER);
        Area squaredHectometerResult = toSquaredKilometer(squaredHectometerValue, SQUARED_HECTOMETER);
        Area squaredDecameterResult = toSquaredKilometer(squaredDecameterValue, SQUARED_DECAMETER);
        Area squaredMeterResult = toSquaredKilometer(squaredMeterValue, SQUARED_METER);
        Area squaredDecimeterResult = toSquaredKilometer(squaredDecimeterValue, SQUARED_DECIMETER);
        Area squaredCentimeterResult = toSquaredKilometer(squaredCentimeterValue, SQUARED_CENTIMETER);
        Area squaredMillimeterResult = toSquaredKilometer(squaredMillimeterValue, SQUARED_MILLIMETER);

        assertEquals(squaredKilometerTestResult, squaredKilometerResult);
        assertEquals(squaredHectometerTestResult, squaredHectometerResult);
        assertEquals(squaredDecameterTestResult, squaredDecameterResult);
        assertEquals(squaredMeterTestResult, squaredMeterResult);
        assertEquals(squaredDecimeterTestResult, squaredDecimeterResult);
        assertEquals(squaredCentimeterTestResult, squaredCentimeterResult);
        assertEquals(squaredMillimeterTestResult, squaredMillimeterResult);
    }

    @Test
    public void toSquaredHectometerTest() {
        double squaredKilometerValue = NumberRandomizer.getRandomDouble();
        double squaredHectometerValue = NumberRandomizer.getRandomDouble();
        double squaredDecameterValue = NumberRandomizer.getRandomDouble();
        double squaredMeterValue = NumberRandomizer.getRandomDouble();
        double squaredDecimeterValue = NumberRandomizer.getRandomDouble();
        double squaredCentimeterValue = NumberRandomizer.getRandomDouble();
        double squaredMillimeterValue = NumberRandomizer.getRandomDouble();

        Area squaredKilometerTestResult = convert(squaredKilometerValue, SQUARED_KILOMETER, SQUARED_HECTOMETER);
        Area squaredHectometerTestResult = convert(squaredHectometerValue, SQUARED_HECTOMETER, SQUARED_HECTOMETER);
        Area squaredDecameterTestResult = convert(squaredDecameterValue, SQUARED_DECAMETER, SQUARED_HECTOMETER);
        Area squaredMeterTestResult = convert(squaredMeterValue, SQUARED_METER, SQUARED_HECTOMETER);
        Area squaredDecimeterTestResult = convert(squaredDecimeterValue, SQUARED_DECIMETER, SQUARED_HECTOMETER);
        Area squaredCentimeterTestResult = convert(squaredCentimeterValue, SQUARED_CENTIMETER, SQUARED_HECTOMETER);
        Area squaredMillimeterTestResult = convert(squaredMillimeterValue, SQUARED_MILLIMETER, SQUARED_HECTOMETER);

        Area squaredKilometerResult = toSquaredHectometer(squaredKilometerValue, SQUARED_KILOMETER);
        Area squaredHectometerResult = toSquaredHectometer(squaredHectometerValue, SQUARED_HECTOMETER);
        Area squaredDecameterResult = toSquaredHectometer(squaredDecameterValue, SQUARED_DECAMETER);
        Area squaredMeterResult = toSquaredHectometer(squaredMeterValue, SQUARED_METER);
        Area squaredDecimeterResult = toSquaredHectometer(squaredDecimeterValue, SQUARED_DECIMETER);
        Area squaredCentimeterResult = toSquaredHectometer(squaredCentimeterValue, SQUARED_CENTIMETER);
        Area squaredMillimeterResult = toSquaredHectometer(squaredMillimeterValue, SQUARED_MILLIMETER);

        assertEquals(squaredKilometerTestResult, squaredKilometerResult);
        assertEquals(squaredHectometerTestResult, squaredHectometerResult);
        assertEquals(squaredDecameterTestResult, squaredDecameterResult);
        assertEquals(squaredMeterTestResult, squaredMeterResult);
        assertEquals(squaredDecimeterTestResult, squaredDecimeterResult);
        assertEquals(squaredCentimeterTestResult, squaredCentimeterResult);
        assertEquals(squaredMillimeterTestResult, squaredMillimeterResult);
    }

    @Test
    public void toSquaredDecameterTest() {
        double squaredKilometerValue = NumberRandomizer.getRandomDouble();
        double squaredHectometerValue = NumberRandomizer.getRandomDouble();
        double squaredDecameterValue = NumberRandomizer.getRandomDouble();
        double squaredMeterValue = NumberRandomizer.getRandomDouble();
        double squaredDecimeterValue = NumberRandomizer.getRandomDouble();
        double squaredCentimeterValue = NumberRandomizer.getRandomDouble();
        double squaredMillimeterValue = NumberRandomizer.getRandomDouble();

        Area squaredKilometerTestResult = convert(squaredKilometerValue, SQUARED_KILOMETER, SQUARED_DECAMETER);
        Area squaredHectometerTestResult = convert(squaredHectometerValue, SQUARED_HECTOMETER, SQUARED_DECAMETER);
        Area squaredDecameterTestResult = convert(squaredDecameterValue, SQUARED_DECAMETER, SQUARED_DECAMETER);
        Area squaredMeterTestResult = convert(squaredMeterValue, SQUARED_METER, SQUARED_DECAMETER);
        Area squaredDecimeterTestResult = convert(squaredDecimeterValue, SQUARED_DECIMETER, SQUARED_DECAMETER);
        Area squaredCentimeterTestResult = convert(squaredCentimeterValue, SQUARED_CENTIMETER, SQUARED_DECAMETER);
        Area squaredMillimeterTestResult = convert(squaredMillimeterValue, SQUARED_MILLIMETER, SQUARED_DECAMETER);

        Area squaredKilometerResult = toSquaredDecameter(squaredKilometerValue, SQUARED_KILOMETER);
        Area squaredHectometerResult = toSquaredDecameter(squaredHectometerValue, SQUARED_HECTOMETER);
        Area squaredDecameterResult = toSquaredDecameter(squaredDecameterValue, SQUARED_DECAMETER);
        Area squaredMeterResult = toSquaredDecameter(squaredMeterValue, SQUARED_METER);
        Area squaredDecimeterResult = toSquaredDecameter(squaredDecimeterValue, SQUARED_DECIMETER);
        Area squaredCentimeterResult = toSquaredDecameter(squaredCentimeterValue, SQUARED_CENTIMETER);
        Area squaredMillimeterResult = toSquaredDecameter(squaredMillimeterValue, SQUARED_MILLIMETER);

        assertEquals(squaredKilometerTestResult, squaredKilometerResult);
        assertEquals(squaredHectometerTestResult, squaredHectometerResult);
        assertEquals(squaredDecameterTestResult, squaredDecameterResult);
        assertEquals(squaredMeterTestResult, squaredMeterResult);
        assertEquals(squaredDecimeterTestResult, squaredDecimeterResult);
        assertEquals(squaredCentimeterTestResult, squaredCentimeterResult);
        assertEquals(squaredMillimeterTestResult, squaredMillimeterResult);
    }

    @Test
    public void toSquaredMeterTest() {
        double squaredKilometerValue = NumberRandomizer.getRandomDouble();
        double squaredHectometerValue = NumberRandomizer.getRandomDouble();
        double squaredDecameterValue = NumberRandomizer.getRandomDouble();
        double squaredMeterValue = NumberRandomizer.getRandomDouble();
        double squaredDecimeterValue = NumberRandomizer.getRandomDouble();
        double squaredCentimeterValue = NumberRandomizer.getRandomDouble();
        double squaredMillimeterValue = NumberRandomizer.getRandomDouble();

        Area squaredKilometerTestResult = convert(squaredKilometerValue, SQUARED_KILOMETER, SQUARED_METER);
        Area squaredHectometerTestResult = convert(squaredHectometerValue, SQUARED_HECTOMETER, SQUARED_METER);
        Area squaredDecameterTestResult = convert(squaredDecameterValue, SQUARED_DECAMETER, SQUARED_METER);
        Area squaredMeterTestResult = convert(squaredMeterValue, SQUARED_METER, SQUARED_METER);
        Area squaredDecimeterTestResult = convert(squaredDecimeterValue, SQUARED_DECIMETER, SQUARED_METER);
        Area squaredCentimeterTestResult = convert(squaredCentimeterValue, SQUARED_CENTIMETER, SQUARED_METER);
        Area squaredMillimeterTestResult = convert(squaredMillimeterValue, SQUARED_MILLIMETER, SQUARED_METER);

        Area squaredKilometerResult = toSquaredMeter(squaredKilometerValue, SQUARED_KILOMETER);
        Area squaredHectometerResult = toSquaredMeter(squaredHectometerValue, SQUARED_HECTOMETER);
        Area squaredDecameterResult = toSquaredMeter(squaredDecameterValue, SQUARED_DECAMETER);
        Area squaredMeterResult = toSquaredMeter(squaredMeterValue, SQUARED_METER);
        Area squaredDecimeterResult = toSquaredMeter(squaredDecimeterValue, SQUARED_DECIMETER);
        Area squaredCentimeterResult = toSquaredMeter(squaredCentimeterValue, SQUARED_CENTIMETER);
        Area squaredMillimeterResult = toSquaredMeter(squaredMillimeterValue, SQUARED_MILLIMETER);

        assertEquals(squaredKilometerTestResult, squaredKilometerResult);
        assertEquals(squaredHectometerTestResult, squaredHectometerResult);
        assertEquals(squaredDecameterTestResult, squaredDecameterResult);
        assertEquals(squaredMeterTestResult, squaredMeterResult);
        assertEquals(squaredDecimeterTestResult, squaredDecimeterResult);
        assertEquals(squaredCentimeterTestResult, squaredCentimeterResult);
        assertEquals(squaredMillimeterTestResult, squaredMillimeterResult);
    }

    @Test
    public void toSquaredDecimeterTest() {
        double squaredKilometerValue = NumberRandomizer.getRandomDouble();
        double squaredHectometerValue = NumberRandomizer.getRandomDouble();
        double squaredDecameterValue = NumberRandomizer.getRandomDouble();
        double squaredMeterValue = NumberRandomizer.getRandomDouble();
        double squaredDecimeterValue = NumberRandomizer.getRandomDouble();
        double squaredCentimeterValue = NumberRandomizer.getRandomDouble();
        double squaredMillimeterValue = NumberRandomizer.getRandomDouble();

        Area squaredKilometerTestResult = convert(squaredKilometerValue, SQUARED_KILOMETER, SQUARED_DECIMETER);
        Area squaredHectometerTestResult = convert(squaredHectometerValue, SQUARED_HECTOMETER, SQUARED_DECIMETER);
        Area squaredDecameterTestResult = convert(squaredDecameterValue, SQUARED_DECAMETER, SQUARED_DECIMETER);
        Area squaredMeterTestResult = convert(squaredMeterValue, SQUARED_METER, SQUARED_DECIMETER);
        Area squaredDecimeterTestResult = convert(squaredDecimeterValue, SQUARED_DECIMETER, SQUARED_DECIMETER);
        Area squaredCentimeterTestResult = convert(squaredCentimeterValue, SQUARED_CENTIMETER, SQUARED_DECIMETER);
        Area squaredMillimeterTestResult = convert(squaredMillimeterValue, SQUARED_MILLIMETER, SQUARED_DECIMETER);

        Area squaredKilometerResult = toSquaredDecimeter(squaredKilometerValue, SQUARED_KILOMETER);
        Area squaredHectometerResult = toSquaredDecimeter(squaredHectometerValue, SQUARED_HECTOMETER);
        Area squaredDecameterResult = toSquaredDecimeter(squaredDecameterValue, SQUARED_DECAMETER);
        Area squaredMeterResult = toSquaredDecimeter(squaredMeterValue, SQUARED_METER);
        Area squaredDecimeterResult = toSquaredDecimeter(squaredDecimeterValue, SQUARED_DECIMETER);
        Area squaredCentimeterResult = toSquaredDecimeter(squaredCentimeterValue, SQUARED_CENTIMETER);
        Area squaredMillimeterResult = toSquaredDecimeter(squaredMillimeterValue, SQUARED_MILLIMETER);

        assertEquals(squaredKilometerTestResult, squaredKilometerResult);
        assertEquals(squaredHectometerTestResult, squaredHectometerResult);
        assertEquals(squaredDecameterTestResult, squaredDecameterResult);
        assertEquals(squaredMeterTestResult, squaredMeterResult);
        assertEquals(squaredDecimeterTestResult, squaredDecimeterResult);
        assertEquals(squaredCentimeterTestResult, squaredCentimeterResult);
        assertEquals(squaredMillimeterTestResult, squaredMillimeterResult);
    }

    @Test
    public void toSquaredCentimeterTest() {
        double squaredKilometerValue = NumberRandomizer.getRandomDouble();
        double squaredHectometerValue = NumberRandomizer.getRandomDouble();
        double squaredDecameterValue = NumberRandomizer.getRandomDouble();
        double squaredMeterValue = NumberRandomizer.getRandomDouble();
        double squaredDecimeterValue = NumberRandomizer.getRandomDouble();
        double squaredCentimeterValue = NumberRandomizer.getRandomDouble();
        double squaredMillimeterValue = NumberRandomizer.getRandomDouble();

        Area squaredKilometerTestResult = convert(squaredKilometerValue, SQUARED_KILOMETER, SQUARED_CENTIMETER);
        Area squaredHectometerTestResult = convert(squaredHectometerValue, SQUARED_HECTOMETER, SQUARED_CENTIMETER);
        Area squaredDecameterTestResult = convert(squaredDecameterValue, SQUARED_DECAMETER, SQUARED_CENTIMETER);
        Area squaredMeterTestResult = convert(squaredMeterValue, SQUARED_METER, SQUARED_CENTIMETER);
        Area squaredDecimeterTestResult = convert(squaredDecimeterValue, SQUARED_DECIMETER, SQUARED_CENTIMETER);
        Area squaredCentimeterTestResult = convert(squaredCentimeterValue, SQUARED_CENTIMETER, SQUARED_CENTIMETER);
        Area squaredMillimeterTestResult = convert(squaredMillimeterValue, SQUARED_MILLIMETER, SQUARED_CENTIMETER);

        Area squaredKilometerResult = toSquaredCentimeter(squaredKilometerValue, SQUARED_KILOMETER);
        Area squaredHectometerResult = toSquaredCentimeter(squaredHectometerValue, SQUARED_HECTOMETER);
        Area squaredDecameterResult = toSquaredCentimeter(squaredDecameterValue, SQUARED_DECAMETER);
        Area squaredMeterResult = toSquaredCentimeter(squaredMeterValue, SQUARED_METER);
        Area squaredDecimeterResult = toSquaredCentimeter(squaredDecimeterValue, SQUARED_DECIMETER);
        Area squaredCentimeterResult = toSquaredCentimeter(squaredCentimeterValue, SQUARED_CENTIMETER);
        Area squaredMillimeterResult = toSquaredCentimeter(squaredMillimeterValue, SQUARED_MILLIMETER);

        assertEquals(squaredKilometerTestResult, squaredKilometerResult);
        assertEquals(squaredHectometerTestResult, squaredHectometerResult);
        assertEquals(squaredDecameterTestResult, squaredDecameterResult);
        assertEquals(squaredMeterTestResult, squaredMeterResult);
        assertEquals(squaredDecimeterTestResult, squaredDecimeterResult);
        assertEquals(squaredCentimeterTestResult, squaredCentimeterResult);
        assertEquals(squaredMillimeterTestResult, squaredMillimeterResult);
    }

    @Test
    public void toSquaredMillimeterTest() {
        double squaredKilometerValue = NumberRandomizer.getRandomDouble();
        double squaredHectometerValue = NumberRandomizer.getRandomDouble();
        double squaredDecameterValue = NumberRandomizer.getRandomDouble();
        double squaredMeterValue = NumberRandomizer.getRandomDouble();
        double squaredDecimeterValue = NumberRandomizer.getRandomDouble();
        double squaredCentimeterValue = NumberRandomizer.getRandomDouble();
        double squaredMillimeterValue = NumberRandomizer.getRandomDouble();

        Area squaredKilometerTestResult = convert(squaredKilometerValue, SQUARED_KILOMETER, SQUARED_MILLIMETER);
        Area squaredHectometerTestResult = convert(squaredHectometerValue, SQUARED_HECTOMETER, SQUARED_MILLIMETER);
        Area squaredDecameterTestResult = convert(squaredDecameterValue, SQUARED_DECAMETER, SQUARED_MILLIMETER);
        Area squaredMeterTestResult = convert(squaredMeterValue, SQUARED_METER, SQUARED_MILLIMETER);
        Area squaredDecimeterTestResult = convert(squaredDecimeterValue, SQUARED_DECIMETER, SQUARED_MILLIMETER);
        Area squaredCentimeterTestResult = convert(squaredCentimeterValue, SQUARED_CENTIMETER, SQUARED_MILLIMETER);
        Area squaredMillimeterTestResult = convert(squaredMillimeterValue, SQUARED_MILLIMETER, SQUARED_MILLIMETER);

        Area squaredKilometerResult = toSquaredMillimeter(squaredKilometerValue, SQUARED_KILOMETER);
        Area squaredHectometerResult = toSquaredMillimeter(squaredHectometerValue, SQUARED_HECTOMETER);
        Area squaredDecameterResult = toSquaredMillimeter(squaredDecameterValue, SQUARED_DECAMETER);
        Area squaredMeterResult = toSquaredMillimeter(squaredMeterValue, SQUARED_METER);
        Area squaredDecimeterResult = toSquaredMillimeter(squaredDecimeterValue, SQUARED_DECIMETER);
        Area squaredCentimeterResult = toSquaredMillimeter(squaredCentimeterValue, SQUARED_CENTIMETER);
        Area squaredMillimeterResult = toSquaredMillimeter(squaredMillimeterValue, SQUARED_MILLIMETER);

        assertEquals(squaredKilometerTestResult, squaredKilometerResult);
        assertEquals(squaredHectometerTestResult, squaredHectometerResult);
        assertEquals(squaredDecameterTestResult, squaredDecameterResult);
        assertEquals(squaredMeterTestResult, squaredMeterResult);
        assertEquals(squaredDecimeterTestResult, squaredDecimeterResult);
        assertEquals(squaredCentimeterTestResult, squaredCentimeterResult);
        assertEquals(squaredMillimeterTestResult, squaredMillimeterResult);
    }

    @Test
    public void toSquaredKilometerFixedResultTest() {
        int squaredKilometerValue = 1;
        int squaredHectometerValue = 1;
        int squaredDecameterValue = 1;
        int squaredMeterValue = 1;
        int squaredDecimeterValue = 1;
        int squaredCentimeterValue = 1;
        int squaredMillimeterValue = 1;

        Area squaredKilometerTestResult = new Area("1.00000000000000000000", SQUARED_KILOMETER);
        Area squaredHectometerTestResult = new Area("0.01000000000000000000", SQUARED_KILOMETER);
        Area squaredDecameterTestResult = new Area("0.00010000000000000000", SQUARED_KILOMETER);
        Area squaredMeterTestResult = new Area("0.00000100000000000000", SQUARED_KILOMETER);
        Area squaredDecimeterTestResult = new Area("0.00000001000000000000", SQUARED_KILOMETER);
        Area squaredCentimeterTestResult = new Area("0.00000000010000000000", SQUARED_KILOMETER);
        Area squaredMillimeterTestResult = new Area("0.00000000000100000000", SQUARED_KILOMETER);

        Area squaredKilometerResult = toSquaredKilometer(squaredKilometerValue, SQUARED_KILOMETER);
        Area squaredHectometerResult = toSquaredKilometer(squaredHectometerValue, SQUARED_HECTOMETER);
        Area squaredDecameterResult = toSquaredKilometer(squaredDecameterValue, SQUARED_DECAMETER);
        Area squaredMeterResult = toSquaredKilometer(squaredMeterValue, SQUARED_METER);
        Area squaredDecimeterResult = toSquaredKilometer(squaredDecimeterValue, SQUARED_DECIMETER);
        Area squaredCentimeterResult = toSquaredKilometer(squaredCentimeterValue, SQUARED_CENTIMETER);
        Area squaredMillimeterResult = toSquaredKilometer(squaredMillimeterValue, SQUARED_MILLIMETER);

        assertEquals(squaredKilometerTestResult, squaredKilometerResult);
        assertEquals(squaredHectometerTestResult, squaredHectometerResult);
        assertEquals(squaredDecameterTestResult, squaredDecameterResult);
        assertEquals(squaredMeterTestResult, squaredMeterResult);
        assertEquals(squaredDecimeterTestResult, squaredDecimeterResult);
        assertEquals(squaredCentimeterTestResult, squaredCentimeterResult);
        assertEquals(squaredMillimeterTestResult, squaredMillimeterResult);
    }

    @Test
    public void toSquaredHectometerFixedResultTest() {
        int squaredKilometerValue = 1;
        int squaredHectometerValue = 1;
        int squaredDecameterValue = 1;
        int squaredMeterValue = 1;
        int squaredDecimeterValue = 1;
        int squaredCentimeterValue = 1;
        int squaredMillimeterValue = 1;

        Area squaredKilometerTestResult = new Area("100.00000000000000000000", SQUARED_HECTOMETER);
        Area squaredHectometerTestResult = new Area("1.00000000000000000000", SQUARED_HECTOMETER);
        Area squaredDecameterTestResult = new Area("0.01000000000000000000", SQUARED_HECTOMETER);
        Area squaredMeterTestResult = new Area("0.00010000000000000000", SQUARED_HECTOMETER);
        Area squaredDecimeterTestResult = new Area("0.00000100000000000000", SQUARED_HECTOMETER);
        Area squaredCentimeterTestResult = new Area("0.00000001000000000000", SQUARED_HECTOMETER);
        Area squaredMillimeterTestResult = new Area("0.00000000010000000000", SQUARED_HECTOMETER);

        Area squaredKilometerResult = toSquaredHectometer(squaredKilometerValue, SQUARED_KILOMETER);
        Area squaredHectometerResult = toSquaredHectometer(squaredHectometerValue, SQUARED_HECTOMETER);
        Area squaredDecameterResult = toSquaredHectometer(squaredDecameterValue, SQUARED_DECAMETER);
        Area squaredMeterResult = toSquaredHectometer(squaredMeterValue, SQUARED_METER);
        Area squaredDecimeterResult = toSquaredHectometer(squaredDecimeterValue, SQUARED_DECIMETER);
        Area squaredCentimeterResult = toSquaredHectometer(squaredCentimeterValue, SQUARED_CENTIMETER);
        Area squaredMillimeterResult = toSquaredHectometer(squaredMillimeterValue, SQUARED_MILLIMETER);

        assertEquals(squaredKilometerTestResult, squaredKilometerResult);
        assertEquals(squaredHectometerTestResult, squaredHectometerResult);
        assertEquals(squaredDecameterTestResult, squaredDecameterResult);
        assertEquals(squaredMeterTestResult, squaredMeterResult);
        assertEquals(squaredDecimeterTestResult, squaredDecimeterResult);
        assertEquals(squaredCentimeterTestResult, squaredCentimeterResult);
        assertEquals(squaredMillimeterTestResult, squaredMillimeterResult);
    }

    @Test
    public void toSquaredDecameterFixedResultTest() {
        int squaredKilometerValue = 1;
        int squaredHectometerValue = 1;
        int squaredDecameterValue = 1;
        int squaredMeterValue = 1;
        int squaredDecimeterValue = 1;
        int squaredCentimeterValue = 1;
        int squaredMillimeterValue = 1;

        Area squaredKilometerTestResult = new Area("10000.00000000000000000000", SQUARED_DECAMETER);
        Area squaredHectometerTestResult = new Area("100.00000000000000000000", SQUARED_DECAMETER);
        Area squaredDecameterTestResult = new Area("1.00000000000000000000", SQUARED_DECAMETER);
        Area squaredMeterTestResult = new Area("0.01000000000000000000", SQUARED_DECAMETER);
        Area squaredDecimeterTestResult = new Area("0.00010000000000000000", SQUARED_DECAMETER);
        Area squaredCentimeterTestResult = new Area("0.00000100000000000000", SQUARED_DECAMETER);
        Area squaredMillimeterTestResult = new Area("0.00000001000000000000", SQUARED_DECAMETER);

        Area squaredKilometerResult = toSquaredDecameter(squaredKilometerValue, SQUARED_KILOMETER);
        Area squaredHectometerResult = toSquaredDecameter(squaredHectometerValue, SQUARED_HECTOMETER);
        Area squaredDecameterResult = toSquaredDecameter(squaredDecameterValue, SQUARED_DECAMETER);
        Area squaredMeterResult = toSquaredDecameter(squaredMeterValue, SQUARED_METER);
        Area squaredDecimeterResult = toSquaredDecameter(squaredDecimeterValue, SQUARED_DECIMETER);
        Area squaredCentimeterResult = toSquaredDecameter(squaredCentimeterValue, SQUARED_CENTIMETER);
        Area squaredMillimeterResult = toSquaredDecameter(squaredMillimeterValue, SQUARED_MILLIMETER);

        assertEquals(squaredKilometerTestResult, squaredKilometerResult);
        assertEquals(squaredHectometerTestResult, squaredHectometerResult);
        assertEquals(squaredDecameterTestResult, squaredDecameterResult);
        assertEquals(squaredMeterTestResult, squaredMeterResult);
        assertEquals(squaredDecimeterTestResult, squaredDecimeterResult);
        assertEquals(squaredCentimeterTestResult, squaredCentimeterResult);
        assertEquals(squaredMillimeterTestResult, squaredMillimeterResult);
    }

    @Test
    public void toSquaredMeterFixedResultTest() {
        int squaredKilometerValue = 1;
        int squaredHectometerValue = 1;
        int squaredDecameterValue = 1;
        int squaredMeterValue = 1;
        int squaredDecimeterValue = 1;
        int squaredCentimeterValue = 1;
        int squaredMillimeterValue = 1;

        Area squaredKilometerTestResult = new Area("1000000.00000000000000000000", SQUARED_METER);
        Area squaredHectometerTestResult = new Area("10000.00000000000000000000", SQUARED_METER);
        Area squaredDecameterTestResult = new Area("100.00000000000000000000", SQUARED_METER);
        Area squaredMeterTestResult = new Area("1.00000000000000000000", SQUARED_METER);
        Area squaredDecimeterTestResult = new Area("0.01000000000000000000", SQUARED_METER);
        Area squaredCentimeterTestResult = new Area("0.00010000000000000000", SQUARED_METER);
        Area squaredMillimeterTestResult = new Area("0.00000100000000000000", SQUARED_METER);

        Area squaredKilometerResult = toSquaredMeter(squaredKilometerValue, SQUARED_KILOMETER);
        Area squaredHectometerResult = toSquaredMeter(squaredHectometerValue, SQUARED_HECTOMETER);
        Area squaredDecameterResult = toSquaredMeter(squaredDecameterValue, SQUARED_DECAMETER);
        Area squaredMeterResult = toSquaredMeter(squaredMeterValue, SQUARED_METER);
        Area squaredDecimeterResult = toSquaredMeter(squaredDecimeterValue, SQUARED_DECIMETER);
        Area squaredCentimeterResult = toSquaredMeter(squaredCentimeterValue, SQUARED_CENTIMETER);
        Area squaredMillimeterResult = toSquaredMeter(squaredMillimeterValue, SQUARED_MILLIMETER);

        assertEquals(squaredKilometerTestResult, squaredKilometerResult);
        assertEquals(squaredHectometerTestResult, squaredHectometerResult);
        assertEquals(squaredDecameterTestResult, squaredDecameterResult);
        assertEquals(squaredMeterTestResult, squaredMeterResult);
        assertEquals(squaredDecimeterTestResult, squaredDecimeterResult);
        assertEquals(squaredCentimeterTestResult, squaredCentimeterResult);
        assertEquals(squaredMillimeterTestResult, squaredMillimeterResult);
    }

    @Test
    public void toSquaredDecimeterFixedResultTest() {
        int squaredKilometerValue = 1;
        int squaredHectometerValue = 1;
        int squaredDecameterValue = 1;
        int squaredMeterValue = 1;
        int squaredDecimeterValue = 1;
        int squaredCentimeterValue = 1;
        int squaredMillimeterValue = 1;

        Area squaredKilometerTestResult = new Area("100000000.00000000000000000000", SQUARED_DECIMETER);
        Area squaredHectometerTestResult = new Area("1000000.00000000000000000000", SQUARED_DECIMETER);
        Area squaredDecameterTestResult = new Area("10000.00000000000000000000", SQUARED_DECIMETER);
        Area squaredMeterTestResult = new Area("100.00000000000000000000", SQUARED_DECIMETER);
        Area squaredDecimeterTestResult = new Area("1.00000000000000000000", SQUARED_DECIMETER);
        Area squaredCentimeterTestResult = new Area("0.01000000000000000000", SQUARED_DECIMETER);
        Area squaredMillimeterTestResult = new Area("0.00010000000000000000", SQUARED_DECIMETER);

        Area squaredKilometerResult = toSquaredDecimeter(squaredKilometerValue, SQUARED_KILOMETER);
        Area squaredHectometerResult = toSquaredDecimeter(squaredHectometerValue, SQUARED_HECTOMETER);
        Area squaredDecameterResult = toSquaredDecimeter(squaredDecameterValue, SQUARED_DECAMETER);
        Area squaredMeterResult = toSquaredDecimeter(squaredMeterValue, SQUARED_METER);
        Area squaredDecimeterResult = toSquaredDecimeter(squaredDecimeterValue, SQUARED_DECIMETER);
        Area squaredCentimeterResult = toSquaredDecimeter(squaredCentimeterValue, SQUARED_CENTIMETER);
        Area squaredMillimeterResult = toSquaredDecimeter(squaredMillimeterValue, SQUARED_MILLIMETER);

        assertEquals(squaredKilometerTestResult, squaredKilometerResult);
        assertEquals(squaredHectometerTestResult, squaredHectometerResult);
        assertEquals(squaredDecameterTestResult, squaredDecameterResult);
        assertEquals(squaredMeterTestResult, squaredMeterResult);
        assertEquals(squaredDecimeterTestResult, squaredDecimeterResult);
        assertEquals(squaredCentimeterTestResult, squaredCentimeterResult);
        assertEquals(squaredMillimeterTestResult, squaredMillimeterResult);
    }

    @Test
    public void toSquaredCentimeterFixedResultTest() {
        int squaredKilometerValue = 1;
        int squaredHectometerValue = 1;
        int squaredDecameterValue = 1;
        int squaredMeterValue = 1;
        int squaredDecimeterValue = 1;
        int squaredCentimeterValue = 1;
        int squaredMillimeterValue = 1;

        Area squaredKilometerTestResult = new Area("10000000000.00000000000000000000", SQUARED_CENTIMETER);
        Area squaredHectometerTestResult = new Area("100000000.00000000000000000000", SQUARED_CENTIMETER);
        Area squaredDecameterTestResult = new Area("1000000.00000000000000000000", SQUARED_CENTIMETER);
        Area squaredMeterTestResult = new Area("10000.00000000000000000000", SQUARED_CENTIMETER);
        Area squaredDecimeterTestResult = new Area("100.00000000000000000000", SQUARED_CENTIMETER);
        Area squaredCentimeterTestResult = new Area("1.00000000000000000000", SQUARED_CENTIMETER);
        Area squaredMillimeterTestResult = new Area("0.01000000000000000000", SQUARED_CENTIMETER);

        Area squaredKilometerResult = toSquaredCentimeter(squaredKilometerValue, SQUARED_KILOMETER);
        Area squaredHectometerResult = toSquaredCentimeter(squaredHectometerValue, SQUARED_HECTOMETER);
        Area squaredDecameterResult = toSquaredCentimeter(squaredDecameterValue, SQUARED_DECAMETER);
        Area squaredMeterResult = toSquaredCentimeter(squaredMeterValue, SQUARED_METER);
        Area squaredDecimeterResult = toSquaredCentimeter(squaredDecimeterValue, SQUARED_DECIMETER);
        Area squaredCentimeterResult = toSquaredCentimeter(squaredCentimeterValue, SQUARED_CENTIMETER);
        Area squaredMillimeterResult = toSquaredCentimeter(squaredMillimeterValue, SQUARED_MILLIMETER);

        assertEquals(squaredKilometerTestResult, squaredKilometerResult);
        assertEquals(squaredHectometerTestResult, squaredHectometerResult);
        assertEquals(squaredDecameterTestResult, squaredDecameterResult);
        assertEquals(squaredMeterTestResult, squaredMeterResult);
        assertEquals(squaredDecimeterTestResult, squaredDecimeterResult);
        assertEquals(squaredCentimeterTestResult, squaredCentimeterResult);
        assertEquals(squaredMillimeterTestResult, squaredMillimeterResult);
    }

    @Test
    public void toSquaredMillimeterFixedResultTest() {
        int squaredKilometerValue = 1;
        int squaredHectometerValue = 1;
        int squaredDecameterValue = 1;
        int squaredMeterValue = 1;
        int squaredDecimeterValue = 1;
        int squaredCentimeterValue = 1;
        int squaredMillimeterValue = 1;

        Area squaredKilometerTestResult = new Area("1000000000000.00000000000000000000", SQUARED_MILLIMETER);
        Area squaredHectometerTestResult = new Area("10000000000.00000000000000000000", SQUARED_MILLIMETER);
        Area squaredDecameterTestResult = new Area("100000000.00000000000000000000", SQUARED_MILLIMETER);
        Area squaredMeterTestResult = new Area("1000000.00000000000000000000", SQUARED_MILLIMETER);
        Area squaredDecimeterTestResult = new Area("10000.00000000000000000000", SQUARED_MILLIMETER);
        Area squaredCentimeterTestResult = new Area("100.00000000000000000000", SQUARED_MILLIMETER);
        Area squaredMillimeterTestResult = new Area("1.00000000000000000000", SQUARED_MILLIMETER);

        Area squaredKilometerResult = toSquaredMillimeter(squaredKilometerValue, SQUARED_KILOMETER);
        Area squaredHectometerResult = toSquaredMillimeter(squaredHectometerValue, SQUARED_HECTOMETER);
        Area squaredDecameterResult = toSquaredMillimeter(squaredDecameterValue, SQUARED_DECAMETER);
        Area squaredMeterResult = toSquaredMillimeter(squaredMeterValue, SQUARED_METER);
        Area squaredDecimeterResult = toSquaredMillimeter(squaredDecimeterValue, SQUARED_DECIMETER);
        Area squaredCentimeterResult = toSquaredMillimeter(squaredCentimeterValue, SQUARED_CENTIMETER);
        Area squaredMillimeterResult = toSquaredMillimeter(squaredMillimeterValue, SQUARED_MILLIMETER);

        assertEquals(squaredKilometerTestResult, squaredKilometerResult);
        assertEquals(squaredHectometerTestResult, squaredHectometerResult);
        assertEquals(squaredDecameterTestResult, squaredDecameterResult);
        assertEquals(squaredMeterTestResult, squaredMeterResult);
        assertEquals(squaredDecimeterTestResult, squaredDecimeterResult);
        assertEquals(squaredCentimeterTestResult, squaredCentimeterResult);
        assertEquals(squaredMillimeterTestResult, squaredMillimeterResult);
    }

    @Override
    public Area convert(double value, int currentUnit, int targetUnit) {
        return new Area(divide(multiply(value, AREA_SCALES[targetUnit - UNIT_SCALE]), AREA_SCALES[currentUnit - UNIT_SCALE]), targetUnit);
    }
}
