package com.mjr.code.physics.units;

import com.mjr.code.physics.NumberRandomizer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.mjr.code.physics.units.Acceleration.*;
import static com.mjr.code.physics.units.Acceleration.KILOMETER_PER_SQUARED_SECOND;
import static com.mjr.code.physics.units.Unit.divide;
import static com.mjr.code.physics.units.Unit.multiply;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AccelerationTest extends UnitTest {
    private double kilometerPerSquareSecondValue;

    private Acceleration kilometerPerSquareSecondTestResult;

    private Acceleration kilometerPerSquareSecondResult;

    @BeforeEach
    void setUp() {
        kilometerPerSquareSecondValue = NumberRandomizer.getRandomDouble();
    }

    @Test
    void testToKilometerPerSquaredSecond() {
        kilometerPerSquareSecondTestResult = convert(kilometerPerSquareSecondValue, KILOMETER_PER_SQUARED_SECOND, KILOMETER_PER_SQUARED_SECOND);

        kilometerPerSquareSecondResult = toKilometerPerSquaredSecond(kilometerPerSquareSecondValue, KILOMETER_PER_SQUARED_SECOND);

        assertEquals(kilometerPerSquareSecondTestResult, kilometerPerSquareSecondResult);
    }

    @Test
    void testToHectometerPerSquaredSecond() {
    }

    @Test
    void testToDecameterPerSquaredSecond() {
    }

    @Test
    void testToMeterPerSquaredSecond() {
    }

    @Test
    void testToDecimeterPerSquaredSecond() {
    }

    @Test
    void testToCentimeterPerSquaredSecond() {
    }

    @Test
    void testToMillimeterPerSquaredSecond() {
    }

    @Test
    void testToKilometerPerSquaredMinute() {
    }

    @Test
    void testToHectometerPerSquaredMinute() {
    }

    @Test
    void testToDecameterPerSquaredMinute() {
    }

    @Test
    void testToMeterPerSquaredMinute() {
    }

    @Test
    void testToDecimeterPerSquaredMinute() {
    }

    @Test
    void testToCentimeterPerSquaredMinute() {
    }

    @Test
    void testToMillimeterPerSquaredMinute() {
    }

    @Test
    void testToKilometerPerSquaredHour() {
    }

    @Test
    void testToHectometerPerSquaredHour() {
    }

    @Test
    void testToDecameterPerSquaredHour() {
    }

    @Test
    void testToMeterPerSquaredHour() {
    }

    @Test
    void testToDecimeterPerSquaredHour() {
    }

    @Test
    void testToCentimeterPerSquaredHour() {
    }

    @Test
    void testToMillimeterPerSquaredHour() {
    }

    @Test
    void isInInternationalSystem() {
    }

    @Test
    void getUnitSymbol() {
    }

    @Test
    void getInstance() {
    }

    @Override
    public Acceleration convert(double value, int currentUnit, int targetUnit) {
        return new Acceleration(divide(multiply(value, ACCELERATION_SCALES[targetUnit - UNIT_SCALE]), ACCELERATION_SCALES[currentUnit - UNIT_SCALE]), targetUnit);
    }
}