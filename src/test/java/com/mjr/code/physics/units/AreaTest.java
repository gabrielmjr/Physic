package com.mjr.code.physics.units;

import com.mjr.code.physics.NumberRandomizer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.mjr.code.physics.units.Area.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaTest extends UnitTest {
    private double squaredKilometerValue;
    private double squaredHectometerValue;
    private double squaredDecameterValue;
    private double squaredMeterValue;
    private double squaredDecimeterValue;
    private double squaredCentimeterValue;
    private double squaredMillimeterValue;

    private Area squaredKilometerTestResult;
    private Area squaredHectometerTestResult;
    private Area squaredDecameterTestResult;
    private Area squaredMeterTestResult;
    private Area squaredDecimeterTestResult;
    private Area squaredCentimeterTestResult;
    private Area squaredMillimeterTestResult;

    private Area squaredKilometerResult;
    private Area squaredHectometerResult;
    private Area squaredDecameterResult;
    private Area squaredMeterResult;
    private Area squaredDecimeterResult;
    private Area squaredCentimeterResult;
    private Area squaredMillimeterResult;

    @BeforeEach
    void setUp() {
        squaredKilometerValue = NumberRandomizer.getRandomDouble();
        squaredHectometerValue = NumberRandomizer.getRandomDouble();
        squaredDecameterValue = NumberRandomizer.getRandomDouble();
        squaredMeterValue = NumberRandomizer.getRandomDouble();
        squaredDecimeterValue = NumberRandomizer.getRandomDouble();
        squaredCentimeterValue = NumberRandomizer.getRandomDouble();
        squaredMillimeterValue = NumberRandomizer.getRandomDouble();
    }

    @Test
    public void toSquaredKilometerTest() {
        squaredKilometerTestResult = convert(squaredKilometerValue, SQUARED_KILOMETER, SQUARED_KILOMETER);
        squaredHectometerTestResult = convert(squaredHectometerValue, SQUARED_HECTOMETER, SQUARED_KILOMETER);
        squaredDecameterTestResult = convert(squaredDecameterValue, SQUARED_DECAMETER, SQUARED_KILOMETER);
        squaredMeterTestResult = convert(squaredMeterValue, SQUARED_METER, SQUARED_KILOMETER);
        squaredDecimeterTestResult = convert(squaredDecimeterValue, SQUARED_DECIMETER, SQUARED_KILOMETER);
        squaredCentimeterTestResult = convert(squaredCentimeterValue, SQUARED_CENTIMETER, SQUARED_KILOMETER);
        squaredMillimeterTestResult = convert(squaredMillimeterValue, SQUARED_MILLIMETER, SQUARED_KILOMETER);

        squaredKilometerResult = toSquaredKilometer(squaredKilometerValue, SQUARED_KILOMETER);
        squaredHectometerResult = toSquaredKilometer(squaredHectometerValue, SQUARED_HECTOMETER);
        squaredDecameterResult = toSquaredKilometer(squaredDecameterValue, SQUARED_DECAMETER);
        squaredMeterResult = toSquaredKilometer(squaredMeterValue, SQUARED_METER);
        squaredDecimeterResult = toSquaredKilometer(squaredDecimeterValue, SQUARED_DECIMETER);
        squaredCentimeterResult = toSquaredKilometer(squaredCentimeterValue, SQUARED_CENTIMETER);
        squaredMillimeterResult = toSquaredKilometer(squaredMillimeterValue, SQUARED_MILLIMETER);

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
        squaredKilometerTestResult = convert(squaredKilometerValue, SQUARED_KILOMETER, SQUARED_HECTOMETER);
        squaredHectometerTestResult = convert(squaredHectometerValue, SQUARED_HECTOMETER, SQUARED_HECTOMETER);
        squaredDecameterTestResult = convert(squaredDecameterValue, SQUARED_DECAMETER, SQUARED_HECTOMETER);
        squaredMeterTestResult = convert(squaredMeterValue, SQUARED_METER, SQUARED_HECTOMETER);
        squaredDecimeterTestResult = convert(squaredDecimeterValue, SQUARED_DECIMETER, SQUARED_HECTOMETER);
        squaredCentimeterTestResult = convert(squaredCentimeterValue, SQUARED_CENTIMETER, SQUARED_HECTOMETER);
        squaredMillimeterTestResult = convert(squaredMillimeterValue, SQUARED_MILLIMETER, SQUARED_HECTOMETER);

        squaredKilometerResult = toSquaredHectometer(squaredKilometerValue, SQUARED_KILOMETER);
        squaredHectometerResult = toSquaredHectometer(squaredHectometerValue, SQUARED_HECTOMETER);
        squaredDecameterResult = toSquaredHectometer(squaredDecameterValue, SQUARED_DECAMETER);
        squaredMeterResult = toSquaredHectometer(squaredMeterValue, SQUARED_METER);
        squaredDecimeterResult = toSquaredHectometer(squaredDecimeterValue, SQUARED_DECIMETER);
        squaredCentimeterResult = toSquaredHectometer(squaredCentimeterValue, SQUARED_CENTIMETER);
        squaredMillimeterResult = toSquaredHectometer(squaredMillimeterValue, SQUARED_MILLIMETER);

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
        squaredKilometerTestResult = convert(squaredKilometerValue, SQUARED_KILOMETER, SQUARED_DECAMETER);
        squaredHectometerTestResult = convert(squaredHectometerValue, SQUARED_HECTOMETER, SQUARED_DECAMETER);
        squaredDecameterTestResult = convert(squaredDecameterValue, SQUARED_DECAMETER, SQUARED_DECAMETER);
        squaredMeterTestResult = convert(squaredMeterValue, SQUARED_METER, SQUARED_DECAMETER);
        squaredDecimeterTestResult = convert(squaredDecimeterValue, SQUARED_DECIMETER, SQUARED_DECAMETER);
        squaredCentimeterTestResult = convert(squaredCentimeterValue, SQUARED_CENTIMETER, SQUARED_DECAMETER);
        squaredMillimeterTestResult = convert(squaredMillimeterValue, SQUARED_MILLIMETER, SQUARED_DECAMETER);

        squaredKilometerResult = toSquaredDecameter(squaredKilometerValue, SQUARED_KILOMETER);
        squaredHectometerResult = toSquaredDecameter(squaredHectometerValue, SQUARED_HECTOMETER);
        squaredDecameterResult = toSquaredDecameter(squaredDecameterValue, SQUARED_DECAMETER);
        squaredMeterResult = toSquaredDecameter(squaredMeterValue, SQUARED_METER);
        squaredDecimeterResult = toSquaredDecameter(squaredDecimeterValue, SQUARED_DECIMETER);
        squaredCentimeterResult = toSquaredDecameter(squaredCentimeterValue, SQUARED_CENTIMETER);
        squaredMillimeterResult = toSquaredDecameter(squaredMillimeterValue, SQUARED_MILLIMETER);

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
        squaredKilometerTestResult = convert(squaredKilometerValue, SQUARED_KILOMETER, SQUARED_METER);
        squaredHectometerTestResult = convert(squaredHectometerValue, SQUARED_HECTOMETER, SQUARED_METER);
        squaredDecameterTestResult = convert(squaredDecameterValue, SQUARED_DECAMETER, SQUARED_METER);
        squaredMeterTestResult = convert(squaredMeterValue, SQUARED_METER, SQUARED_METER);
        squaredDecimeterTestResult = convert(squaredDecimeterValue, SQUARED_DECIMETER, SQUARED_METER);
        squaredCentimeterTestResult = convert(squaredCentimeterValue, SQUARED_CENTIMETER, SQUARED_METER);
        squaredMillimeterTestResult = convert(squaredMillimeterValue, SQUARED_MILLIMETER, SQUARED_METER);

        squaredKilometerResult = toSquaredMeter(squaredKilometerValue, SQUARED_KILOMETER);
        squaredHectometerResult = toSquaredMeter(squaredHectometerValue, SQUARED_HECTOMETER);
        squaredDecameterResult = toSquaredMeter(squaredDecameterValue, SQUARED_DECAMETER);
        squaredMeterResult = toSquaredMeter(squaredMeterValue, SQUARED_METER);
        squaredDecimeterResult = toSquaredMeter(squaredDecimeterValue, SQUARED_DECIMETER);
        squaredCentimeterResult = toSquaredMeter(squaredCentimeterValue, SQUARED_CENTIMETER);
        squaredMillimeterResult = toSquaredMeter(squaredMillimeterValue, SQUARED_MILLIMETER);

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
        squaredKilometerTestResult = convert(squaredKilometerValue, SQUARED_KILOMETER, SQUARED_DECIMETER);
        squaredHectometerTestResult = convert(squaredHectometerValue, SQUARED_HECTOMETER, SQUARED_DECIMETER);
        squaredDecameterTestResult = convert(squaredDecameterValue, SQUARED_DECAMETER, SQUARED_DECIMETER);
        squaredMeterTestResult = convert(squaredMeterValue, SQUARED_METER, SQUARED_DECIMETER);
        squaredDecimeterTestResult = convert(squaredDecimeterValue, SQUARED_DECIMETER, SQUARED_DECIMETER);
        squaredCentimeterTestResult = convert(squaredCentimeterValue, SQUARED_CENTIMETER, SQUARED_DECIMETER);
        squaredMillimeterTestResult = convert(squaredMillimeterValue, SQUARED_MILLIMETER, SQUARED_DECIMETER);

        squaredKilometerResult = toSquaredDecimeter(squaredKilometerValue, SQUARED_KILOMETER);
        squaredHectometerResult = toSquaredDecimeter(squaredHectometerValue, SQUARED_HECTOMETER);
        squaredDecameterResult = toSquaredDecimeter(squaredDecameterValue, SQUARED_DECAMETER);
        squaredMeterResult = toSquaredDecimeter(squaredMeterValue, SQUARED_METER);
        squaredDecimeterResult = toSquaredDecimeter(squaredDecimeterValue, SQUARED_DECIMETER);
        squaredCentimeterResult = toSquaredDecimeter(squaredCentimeterValue, SQUARED_CENTIMETER);
        squaredMillimeterResult = toSquaredDecimeter(squaredMillimeterValue, SQUARED_MILLIMETER);

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
        squaredKilometerTestResult = convert(squaredKilometerValue, SQUARED_KILOMETER, SQUARED_CENTIMETER);
        squaredHectometerTestResult = convert(squaredHectometerValue, SQUARED_HECTOMETER, SQUARED_CENTIMETER);
        squaredDecameterTestResult = convert(squaredDecameterValue, SQUARED_DECAMETER, SQUARED_CENTIMETER);
        squaredMeterTestResult = convert(squaredMeterValue, SQUARED_METER, SQUARED_CENTIMETER);
        squaredDecimeterTestResult = convert(squaredDecimeterValue, SQUARED_DECIMETER, SQUARED_CENTIMETER);
        squaredCentimeterTestResult = convert(squaredCentimeterValue, SQUARED_CENTIMETER, SQUARED_CENTIMETER);
        squaredMillimeterTestResult = convert(squaredMillimeterValue, SQUARED_MILLIMETER, SQUARED_CENTIMETER);

        squaredKilometerResult = toSquaredCentimeter(squaredKilometerValue, SQUARED_KILOMETER);
        squaredHectometerResult = toSquaredCentimeter(squaredHectometerValue, SQUARED_HECTOMETER);
        squaredDecameterResult = toSquaredCentimeter(squaredDecameterValue, SQUARED_DECAMETER);
        squaredMeterResult = toSquaredCentimeter(squaredMeterValue, SQUARED_METER);
        squaredDecimeterResult = toSquaredCentimeter(squaredDecimeterValue, SQUARED_DECIMETER);
        squaredCentimeterResult = toSquaredCentimeter(squaredCentimeterValue, SQUARED_CENTIMETER);
        squaredMillimeterResult = toSquaredCentimeter(squaredMillimeterValue, SQUARED_MILLIMETER);

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
        squaredKilometerTestResult = convert(squaredKilometerValue, SQUARED_KILOMETER, SQUARED_MILLIMETER);
        squaredHectometerTestResult = convert(squaredHectometerValue, SQUARED_HECTOMETER, SQUARED_MILLIMETER);
        squaredDecameterTestResult = convert(squaredDecameterValue, SQUARED_DECAMETER, SQUARED_MILLIMETER);
        squaredMeterTestResult = convert(squaredMeterValue, SQUARED_METER, SQUARED_MILLIMETER);
        squaredDecimeterTestResult = convert(squaredDecimeterValue, SQUARED_DECIMETER, SQUARED_MILLIMETER);
        squaredCentimeterTestResult = convert(squaredCentimeterValue, SQUARED_CENTIMETER, SQUARED_MILLIMETER);
        squaredMillimeterTestResult = convert(squaredMillimeterValue, SQUARED_MILLIMETER, SQUARED_MILLIMETER);

        squaredKilometerResult = toSquaredMillimeter(squaredKilometerValue, SQUARED_KILOMETER);
        squaredHectometerResult = toSquaredMillimeter(squaredHectometerValue, SQUARED_HECTOMETER);
        squaredDecameterResult = toSquaredMillimeter(squaredDecameterValue, SQUARED_DECAMETER);
        squaredMeterResult = toSquaredMillimeter(squaredMeterValue, SQUARED_METER);
        squaredDecimeterResult = toSquaredMillimeter(squaredDecimeterValue, SQUARED_DECIMETER);
        squaredCentimeterResult = toSquaredMillimeter(squaredCentimeterValue, SQUARED_CENTIMETER);
        squaredMillimeterResult = toSquaredMillimeter(squaredMillimeterValue, SQUARED_MILLIMETER);

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
        squaredKilometerValue = 1;
        squaredHectometerValue = 1;
        squaredDecameterValue = 1;
        squaredMeterValue = 1;
        squaredDecimeterValue = 1;
        squaredCentimeterValue = 1;
        squaredMillimeterValue = 1;

        squaredKilometerTestResult = new Area("1.00000000000000000000", SQUARED_KILOMETER);
        squaredHectometerTestResult = new Area("0.01000000000000000000", SQUARED_KILOMETER);
        squaredDecameterTestResult = new Area("0.00010000000000000000", SQUARED_KILOMETER);
        squaredMeterTestResult = new Area("0.00000100000000000000", SQUARED_KILOMETER);
        squaredDecimeterTestResult = new Area("0.00000001000000000000", SQUARED_KILOMETER);
        squaredCentimeterTestResult = new Area("0.00000000010000000000", SQUARED_KILOMETER);
        squaredMillimeterTestResult = new Area("0.00000000000100000000", SQUARED_KILOMETER);

        squaredKilometerResult = toSquaredKilometer(squaredKilometerValue, SQUARED_KILOMETER);
        squaredHectometerResult = toSquaredKilometer(squaredHectometerValue, SQUARED_HECTOMETER);
        squaredDecameterResult = toSquaredKilometer(squaredDecameterValue, SQUARED_DECAMETER);
        squaredMeterResult = toSquaredKilometer(squaredMeterValue, SQUARED_METER);
        squaredDecimeterResult = toSquaredKilometer(squaredDecimeterValue, SQUARED_DECIMETER);
        squaredCentimeterResult = toSquaredKilometer(squaredCentimeterValue, SQUARED_CENTIMETER);
        squaredMillimeterResult = toSquaredKilometer(squaredMillimeterValue, SQUARED_MILLIMETER);

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
        squaredKilometerValue = 1;
        squaredHectometerValue = 1;
        squaredDecameterValue = 1;
        squaredMeterValue = 1;
        squaredDecimeterValue = 1;
        squaredCentimeterValue = 1;
        squaredMillimeterValue = 1;

        squaredKilometerTestResult = new Area("100.00000000000000000000", SQUARED_HECTOMETER);
        squaredHectometerTestResult = new Area("1.00000000000000000000", SQUARED_HECTOMETER);
        squaredDecameterTestResult = new Area("0.01000000000000000000", SQUARED_HECTOMETER);
        squaredMeterTestResult = new Area("0.00010000000000000000", SQUARED_HECTOMETER);
        squaredDecimeterTestResult = new Area("0.00000100000000000000", SQUARED_HECTOMETER);
        squaredCentimeterTestResult = new Area("0.00000001000000000000", SQUARED_HECTOMETER);
        squaredMillimeterTestResult = new Area("0.00000000010000000000", SQUARED_HECTOMETER);

        squaredKilometerResult = toSquaredHectometer(squaredKilometerValue, SQUARED_KILOMETER);
        squaredHectometerResult = toSquaredHectometer(squaredHectometerValue, SQUARED_HECTOMETER);
        squaredDecameterResult = toSquaredHectometer(squaredDecameterValue, SQUARED_DECAMETER);
        squaredMeterResult = toSquaredHectometer(squaredMeterValue, SQUARED_METER);
        squaredDecimeterResult = toSquaredHectometer(squaredDecimeterValue, SQUARED_DECIMETER);
        squaredCentimeterResult = toSquaredHectometer(squaredCentimeterValue, SQUARED_CENTIMETER);
        squaredMillimeterResult = toSquaredHectometer(squaredMillimeterValue, SQUARED_MILLIMETER);

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
        squaredKilometerValue = 1;
        squaredHectometerValue = 1;
        squaredDecameterValue = 1;
        squaredMeterValue = 1;
        squaredDecimeterValue = 1;
        squaredCentimeterValue = 1;
        squaredMillimeterValue = 1;

        squaredKilometerTestResult = new Area("10000.00000000000000000000", SQUARED_DECAMETER);
        squaredHectometerTestResult = new Area("100.00000000000000000000", SQUARED_DECAMETER);
        squaredDecameterTestResult = new Area("1.00000000000000000000", SQUARED_DECAMETER);
        squaredMeterTestResult = new Area("0.01000000000000000000", SQUARED_DECAMETER);
        squaredDecimeterTestResult = new Area("0.00010000000000000000", SQUARED_DECAMETER);
        squaredCentimeterTestResult = new Area("0.00000100000000000000", SQUARED_DECAMETER);
        squaredMillimeterTestResult = new Area("0.00000001000000000000", SQUARED_DECAMETER);

        squaredKilometerResult = toSquaredDecameter(squaredKilometerValue, SQUARED_KILOMETER);
        squaredHectometerResult = toSquaredDecameter(squaredHectometerValue, SQUARED_HECTOMETER);
        squaredDecameterResult = toSquaredDecameter(squaredDecameterValue, SQUARED_DECAMETER);
        squaredMeterResult = toSquaredDecameter(squaredMeterValue, SQUARED_METER);
        squaredDecimeterResult = toSquaredDecameter(squaredDecimeterValue, SQUARED_DECIMETER);
        squaredCentimeterResult = toSquaredDecameter(squaredCentimeterValue, SQUARED_CENTIMETER);
        squaredMillimeterResult = toSquaredDecameter(squaredMillimeterValue, SQUARED_MILLIMETER);

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
        squaredKilometerValue = 1;
        squaredHectometerValue = 1;
        squaredDecameterValue = 1;
        squaredMeterValue = 1;
        squaredDecimeterValue = 1;
        squaredCentimeterValue = 1;
        squaredMillimeterValue = 1;

        squaredKilometerTestResult = new Area("1000000.00000000000000000000", SQUARED_METER);
        squaredHectometerTestResult = new Area("10000.00000000000000000000", SQUARED_METER);
        squaredDecameterTestResult = new Area("100.00000000000000000000", SQUARED_METER);
        squaredMeterTestResult = new Area("1.00000000000000000000", SQUARED_METER);
        squaredDecimeterTestResult = new Area("0.01000000000000000000", SQUARED_METER);
        squaredCentimeterTestResult = new Area("0.00010000000000000000", SQUARED_METER);
        squaredMillimeterTestResult = new Area("0.00000100000000000000", SQUARED_METER);

        squaredKilometerResult = toSquaredMeter(squaredKilometerValue, SQUARED_KILOMETER);
        squaredHectometerResult = toSquaredMeter(squaredHectometerValue, SQUARED_HECTOMETER);
        squaredDecameterResult = toSquaredMeter(squaredDecameterValue, SQUARED_DECAMETER);
        squaredMeterResult = toSquaredMeter(squaredMeterValue, SQUARED_METER);
        squaredDecimeterResult = toSquaredMeter(squaredDecimeterValue, SQUARED_DECIMETER);
        squaredCentimeterResult = toSquaredMeter(squaredCentimeterValue, SQUARED_CENTIMETER);
        squaredMillimeterResult = toSquaredMeter(squaredMillimeterValue, SQUARED_MILLIMETER);

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
        squaredKilometerValue = 1;
        squaredHectometerValue = 1;
        squaredDecameterValue = 1;
        squaredMeterValue = 1;
        squaredDecimeterValue = 1;
        squaredCentimeterValue = 1;
        squaredMillimeterValue = 1;

        squaredKilometerTestResult = new Area("100000000.00000000000000000000", SQUARED_DECIMETER);
        squaredHectometerTestResult = new Area("1000000.00000000000000000000", SQUARED_DECIMETER);
        squaredDecameterTestResult = new Area("10000.00000000000000000000", SQUARED_DECIMETER);
        squaredMeterTestResult = new Area("100.00000000000000000000", SQUARED_DECIMETER);
        squaredDecimeterTestResult = new Area("1.00000000000000000000", SQUARED_DECIMETER);
        squaredCentimeterTestResult = new Area("0.01000000000000000000", SQUARED_DECIMETER);
        squaredMillimeterTestResult = new Area("0.00010000000000000000", SQUARED_DECIMETER);

        squaredKilometerResult = toSquaredDecimeter(squaredKilometerValue, SQUARED_KILOMETER);
        squaredHectometerResult = toSquaredDecimeter(squaredHectometerValue, SQUARED_HECTOMETER);
        squaredDecameterResult = toSquaredDecimeter(squaredDecameterValue, SQUARED_DECAMETER);
        squaredMeterResult = toSquaredDecimeter(squaredMeterValue, SQUARED_METER);
        squaredDecimeterResult = toSquaredDecimeter(squaredDecimeterValue, SQUARED_DECIMETER);
        squaredCentimeterResult = toSquaredDecimeter(squaredCentimeterValue, SQUARED_CENTIMETER);
        squaredMillimeterResult = toSquaredDecimeter(squaredMillimeterValue, SQUARED_MILLIMETER);

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
        squaredKilometerValue = 1;
        squaredHectometerValue = 1;
        squaredDecameterValue = 1;
        squaredMeterValue = 1;
        squaredDecimeterValue = 1;
        squaredCentimeterValue = 1;
        squaredMillimeterValue = 1;

        squaredKilometerTestResult = new Area("10000000000.00000000000000000000", SQUARED_CENTIMETER);
        squaredHectometerTestResult = new Area("100000000.00000000000000000000", SQUARED_CENTIMETER);
        squaredDecameterTestResult = new Area("1000000.00000000000000000000", SQUARED_CENTIMETER);
        squaredMeterTestResult = new Area("10000.00000000000000000000", SQUARED_CENTIMETER);
        squaredDecimeterTestResult = new Area("100.00000000000000000000", SQUARED_CENTIMETER);
        squaredCentimeterTestResult = new Area("1.00000000000000000000", SQUARED_CENTIMETER);
        squaredMillimeterTestResult = new Area("0.01000000000000000000", SQUARED_CENTIMETER);

        squaredKilometerResult = toSquaredCentimeter(squaredKilometerValue, SQUARED_KILOMETER);
        squaredHectometerResult = toSquaredCentimeter(squaredHectometerValue, SQUARED_HECTOMETER);
        squaredDecameterResult = toSquaredCentimeter(squaredDecameterValue, SQUARED_DECAMETER);
        squaredMeterResult = toSquaredCentimeter(squaredMeterValue, SQUARED_METER);
        squaredDecimeterResult = toSquaredCentimeter(squaredDecimeterValue, SQUARED_DECIMETER);
        squaredCentimeterResult = toSquaredCentimeter(squaredCentimeterValue, SQUARED_CENTIMETER);
        squaredMillimeterResult = toSquaredCentimeter(squaredMillimeterValue, SQUARED_MILLIMETER);

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
        squaredKilometerValue = 1;
        squaredHectometerValue = 1;
        squaredDecameterValue = 1;
        squaredMeterValue = 1;
        squaredDecimeterValue = 1;
        squaredCentimeterValue = 1;
        squaredMillimeterValue = 1;

        squaredKilometerTestResult = new Area("1000000000000.00000000000000000000", SQUARED_MILLIMETER);
        squaredHectometerTestResult = new Area("10000000000.00000000000000000000", SQUARED_MILLIMETER);
        squaredDecameterTestResult = new Area("100000000.00000000000000000000", SQUARED_MILLIMETER);
        squaredMeterTestResult = new Area("1000000.00000000000000000000", SQUARED_MILLIMETER);
        squaredDecimeterTestResult = new Area("10000.00000000000000000000", SQUARED_MILLIMETER);
        squaredCentimeterTestResult = new Area("100.00000000000000000000", SQUARED_MILLIMETER);
        squaredMillimeterTestResult = new Area("1.00000000000000000000", SQUARED_MILLIMETER);

        squaredKilometerResult = toSquaredMillimeter(squaredKilometerValue, SQUARED_KILOMETER);
        squaredHectometerResult = toSquaredMillimeter(squaredHectometerValue, SQUARED_HECTOMETER);
        squaredDecameterResult = toSquaredMillimeter(squaredDecameterValue, SQUARED_DECAMETER);
        squaredMeterResult = toSquaredMillimeter(squaredMeterValue, SQUARED_METER);
        squaredDecimeterResult = toSquaredMillimeter(squaredDecimeterValue, SQUARED_DECIMETER);
        squaredCentimeterResult = toSquaredMillimeter(squaredCentimeterValue, SQUARED_CENTIMETER);
        squaredMillimeterResult = toSquaredMillimeter(squaredMillimeterValue, SQUARED_MILLIMETER);

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
