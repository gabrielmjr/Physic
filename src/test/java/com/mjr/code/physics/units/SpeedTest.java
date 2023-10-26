package com.mjr.code.physics.units;

import com.mjr.code.physics.NumberRandomizer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.mjr.code.physics.units.Speed.*;
import static com.mjr.code.physics.units.Unit.divide;
import static com.mjr.code.physics.units.Unit.multiply;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpeedTest extends UnitTest {
    private double kilometerPerSecondValue;
    private double hectometerPerSecondValue;
    private double decameterPerSecondValue;
    private double meterPerSecondValue;
    private double decimeterPerSecondValue;
    private double centimeterPerSecondValue;
    private double millimeterPerSecondValue;

    private double kilometerPerMinuteValue;
    private double hectometerPerMinuteValue;
    private double decameterPerMinuteValue;
    private double meterPerMinuteValue;
    private double decimeterPerMinuteValue;
    private double centimeterPerMinuteValue;
    private double millimeterPerMinuteValue;

    private double kilometerPerHourValue;
    private double hectometerPerHourValue;
    private double decameterPerHourValue;
    private double meterPerHourValue;
    private double decimeterPerHourValue;
    private double centimeterPerHourValue;
    private double millimeterPerHourValue;

    private Speed kilometerPerSecondResultTest;
    private Speed hectometerPerSecondResultTest;
    private Speed decameterPerSecondResultTest;
    private Speed meterPerSecondResultTest;
    private Speed decimeterPerSecondResultTest;
    private Speed centimeterPerSecondResultTest;
    private Speed millimeterPerSecondResultTest;

    private Speed kilometerPerMinuteResultTest;
    private Speed hectometerPerMinuteResultTest;
    private Speed decameterPerMinuteResultTest;
    private Speed meterPerMinuteResultTest;
    private Speed decimeterPerMinuteResultTest;
    private Speed centimeterPerMinuteResultTest;
    private Speed millimeterPerMinuteResultTest;

    private Speed kilometerPerHourResultTest;
    private Speed hectometerPerHourResultTest;
    private Speed decameterPerHourResultTest;
    private Speed meterPerHourResultTest;
    private Speed decimeterPerHourResultTest;
    private Speed centimeterPerHourResultTest;
    private Speed millimeterPerHourResultTest;

    private Speed kilometerPerSecondResult;
    private Speed hectometerPerSecondResult;
    private Speed decameterPerSecondResult;
    private Speed meterPerSecondResult;
    private Speed decimeterPerSecondResult;
    private Speed centimeterPerSecondResult;
    private Speed millimeterPerSecondResult;

    private Speed kilometerPerMinuteResult;
    private Speed hectometerPerMinuteResult;
    private Speed decameterPerMinuteResult;
    private Speed meterPerMinuteResult;
    private Speed decimeterPerMinuteResult;
    private Speed centimeterPerMinuteResult;
    private Speed millimeterPerMinuteResult;

    private Speed kilometerPerHourResult;
    private Speed hectometerPerHourResult;
    private Speed decameterPerHourResult;
    private Speed meterPerHourResult;
    private Speed decimeterPerHourResult;
    private Speed centimeterPerHourResult;
    private Speed millimeterPerHourResult;

    @BeforeEach
    void setUp() {
        kilometerPerSecondValue = NumberRandomizer.getRandomDouble();
        hectometerPerSecondValue = NumberRandomizer.getRandomDouble();
        decameterPerSecondValue = NumberRandomizer.getRandomDouble();
        meterPerSecondValue = NumberRandomizer.getRandomDouble();
        decimeterPerSecondValue = NumberRandomizer.getRandomDouble();
        centimeterPerSecondValue = NumberRandomizer.getRandomDouble();
        millimeterPerSecondValue = NumberRandomizer.getRandomDouble();

        kilometerPerMinuteValue = NumberRandomizer.getRandomDouble();
        hectometerPerMinuteValue = NumberRandomizer.getRandomDouble();
        decameterPerMinuteValue = NumberRandomizer.getRandomDouble();
        meterPerMinuteValue = NumberRandomizer.getRandomDouble();
        decimeterPerMinuteValue = NumberRandomizer.getRandomDouble();
        centimeterPerMinuteValue = NumberRandomizer.getRandomDouble();
        millimeterPerMinuteValue = NumberRandomizer.getRandomDouble();

        kilometerPerHourValue = NumberRandomizer.getRandomDouble();
        hectometerPerHourValue = NumberRandomizer.getRandomDouble();
        decameterPerHourValue = NumberRandomizer.getRandomDouble();
        meterPerHourValue = NumberRandomizer.getRandomDouble();
        decimeterPerHourValue = NumberRandomizer.getRandomDouble();
        centimeterPerHourValue = NumberRandomizer.getRandomDouble();
        millimeterPerHourValue = NumberRandomizer.getRandomDouble();
    }

    @Test
    public void toKilometerPerSecondTest() {
        kilometerPerSecondResultTest = convert(kilometerPerSecondValue, KILOMETER_PER_SECOND, KILOMETER_PER_SECOND);
        hectometerPerSecondResultTest = convert(hectometerPerSecondValue, HECTOMETER_PER_SECOND, KILOMETER_PER_SECOND);
        decameterPerSecondResultTest = convert(decameterPerSecondValue, DECAMETER_PER_SECOND, KILOMETER_PER_SECOND);
        meterPerSecondResultTest = convert(meterPerSecondValue, METER_PER_SECOND, KILOMETER_PER_SECOND);
        decimeterPerSecondResultTest = convert(decimeterPerSecondValue, DECIMETER_PER_SECOND, KILOMETER_PER_SECOND);
        centimeterPerSecondResultTest = convert(centimeterPerSecondValue, CENTIMETER_PER_SECOND, KILOMETER_PER_SECOND);
        millimeterPerSecondResultTest = convert(millimeterPerSecondValue, MILLIMETER_PER_SECOND, KILOMETER_PER_SECOND);

        kilometerPerMinuteResultTest = convert(kilometerPerMinuteValue, KILOMETER_PER_MINUTE, KILOMETER_PER_SECOND);
        hectometerPerMinuteResultTest = convert(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE, KILOMETER_PER_SECOND);
        decameterPerMinuteResultTest = convert(decameterPerMinuteValue, DECAMETER_PER_MINUTE, KILOMETER_PER_SECOND);
        meterPerMinuteResultTest = convert(meterPerMinuteValue, METER_PER_MINUTE, KILOMETER_PER_SECOND);
        decimeterPerMinuteResultTest = convert(decimeterPerMinuteValue, DECIMETER_PER_MINUTE, KILOMETER_PER_SECOND);
        centimeterPerMinuteResultTest = convert(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE, KILOMETER_PER_SECOND);
        millimeterPerMinuteResultTest = convert(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE, KILOMETER_PER_SECOND);

        kilometerPerHourResultTest = convert(kilometerPerHourValue, KILOMETER_PER_HOUR, KILOMETER_PER_SECOND);
        hectometerPerHourResultTest = convert(hectometerPerHourValue, HECTOMETER_PER_HOUR, KILOMETER_PER_SECOND);
        decameterPerHourResultTest = convert(decameterPerHourValue, DECAMETER_PER_HOUR, KILOMETER_PER_SECOND);
        meterPerHourResultTest = convert(meterPerHourValue, METER_PER_HOUR, KILOMETER_PER_SECOND);
        decimeterPerHourResultTest = convert(decimeterPerHourValue, DECIMETER_PER_HOUR, KILOMETER_PER_SECOND);
        centimeterPerHourResultTest = convert(centimeterPerHourValue, CENTIMETER_PER_HOUR, KILOMETER_PER_SECOND);
        millimeterPerHourResultTest = convert(millimeterPerHourValue, MILLIMETER_PER_HOUR, KILOMETER_PER_SECOND);

        kilometerPerSecondResult = toKilometerPerSecond(kilometerPerSecondValue, KILOMETER_PER_SECOND);
        hectometerPerSecondResult = toKilometerPerSecond(hectometerPerSecondValue, HECTOMETER_PER_SECOND);
        decameterPerSecondResult = toKilometerPerSecond(decameterPerSecondValue, DECAMETER_PER_SECOND);
        meterPerSecondResult = toKilometerPerSecond(meterPerSecondValue, METER_PER_SECOND);
        decimeterPerSecondResult = toKilometerPerSecond(decimeterPerSecondValue, DECIMETER_PER_SECOND);
        centimeterPerSecondResult = toKilometerPerSecond(centimeterPerSecondValue, CENTIMETER_PER_SECOND);
        millimeterPerSecondResult = toKilometerPerSecond(millimeterPerSecondValue, MILLIMETER_PER_SECOND);

        kilometerPerMinuteResult = toKilometerPerSecond(kilometerPerMinuteValue, KILOMETER_PER_MINUTE);
        hectometerPerMinuteResult = toKilometerPerSecond(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE);
        decameterPerMinuteResult = toKilometerPerSecond(decameterPerMinuteValue, DECAMETER_PER_MINUTE);
        meterPerMinuteResult = toKilometerPerSecond(meterPerMinuteValue, METER_PER_MINUTE);
        decimeterPerMinuteResult = toKilometerPerSecond(decimeterPerMinuteValue, DECIMETER_PER_MINUTE);
        centimeterPerMinuteResult = toKilometerPerSecond(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE);
        millimeterPerMinuteResult = toKilometerPerSecond(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE);

        kilometerPerHourResult = toKilometerPerSecond(kilometerPerHourValue, KILOMETER_PER_HOUR);
        hectometerPerHourResult = toKilometerPerSecond(hectometerPerHourValue, HECTOMETER_PER_HOUR);
        decameterPerHourResult = toKilometerPerSecond(decameterPerHourValue, DECAMETER_PER_HOUR);
        meterPerHourResult = toKilometerPerSecond(meterPerHourValue, METER_PER_HOUR);
        decimeterPerHourResult = toKilometerPerSecond(decimeterPerHourValue, DECIMETER_PER_HOUR);
        centimeterPerHourResult = toKilometerPerSecond(centimeterPerHourValue, CENTIMETER_PER_HOUR);
        millimeterPerHourResult = toKilometerPerSecond(millimeterPerHourValue, MILLIMETER_PER_HOUR);

        assertEquals(kilometerPerSecondResult, kilometerPerSecondResultTest);
        assertEquals(hectometerPerSecondResult, hectometerPerSecondResultTest);
        assertEquals(decameterPerSecondResult, decameterPerSecondResultTest);
        assertEquals(meterPerSecondResult, meterPerSecondResultTest);
        assertEquals(decimeterPerSecondResult, decimeterPerSecondResultTest);
        assertEquals(centimeterPerSecondResult, centimeterPerSecondResultTest);
        assertEquals(millimeterPerSecondResult, millimeterPerSecondResultTest);

        assertEquals(kilometerPerMinuteResult, kilometerPerMinuteResultTest);
        assertEquals(hectometerPerMinuteResult, hectometerPerMinuteResultTest);
        assertEquals(decameterPerMinuteResult, decameterPerMinuteResultTest);
        assertEquals(meterPerMinuteResult, meterPerMinuteResultTest);
        assertEquals(decimeterPerMinuteResult, decimeterPerMinuteResultTest);
        assertEquals(centimeterPerMinuteResult, centimeterPerMinuteResultTest);
        assertEquals(millimeterPerMinuteResult, millimeterPerMinuteResultTest);

        assertEquals(kilometerPerHourResult, kilometerPerHourResultTest);
        assertEquals(hectometerPerHourResult, hectometerPerHourResultTest);
        assertEquals(decameterPerHourResult, decameterPerHourResultTest);
        assertEquals(meterPerHourResult, meterPerHourResultTest);
        assertEquals(decimeterPerHourResult, decimeterPerHourResultTest);
        assertEquals(centimeterPerHourResult, centimeterPerHourResultTest);
        assertEquals(millimeterPerHourResult, millimeterPerHourResultTest);

    }
	
	@Test
    public void toHectometerPerSecondTest() {
        kilometerPerSecondResultTest = convert(kilometerPerSecondValue, KILOMETER_PER_SECOND, HECTOMETER_PER_SECOND);
        hectometerPerSecondResultTest = convert(hectometerPerSecondValue, HECTOMETER_PER_SECOND, HECTOMETER_PER_SECOND);
        decameterPerSecondResultTest = convert(decameterPerSecondValue, DECAMETER_PER_SECOND, HECTOMETER_PER_SECOND);
        meterPerSecondResultTest = convert(meterPerSecondValue, METER_PER_SECOND, HECTOMETER_PER_SECOND);
        decimeterPerSecondResultTest = convert(decimeterPerSecondValue, DECIMETER_PER_SECOND, HECTOMETER_PER_SECOND);
        centimeterPerSecondResultTest = convert(centimeterPerSecondValue, CENTIMETER_PER_SECOND, HECTOMETER_PER_SECOND);
        millimeterPerSecondResultTest = convert(millimeterPerSecondValue, MILLIMETER_PER_SECOND, HECTOMETER_PER_SECOND);

        kilometerPerMinuteResultTest = convert(kilometerPerMinuteValue, KILOMETER_PER_MINUTE, HECTOMETER_PER_SECOND);
        hectometerPerMinuteResultTest = convert(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE, HECTOMETER_PER_SECOND);
        decameterPerMinuteResultTest = convert(decameterPerMinuteValue, DECAMETER_PER_MINUTE, HECTOMETER_PER_SECOND);
        meterPerMinuteResultTest = convert(meterPerMinuteValue, METER_PER_MINUTE, HECTOMETER_PER_SECOND);
        decimeterPerMinuteResultTest = convert(decimeterPerMinuteValue, DECIMETER_PER_MINUTE, HECTOMETER_PER_SECOND);
        centimeterPerMinuteResultTest = convert(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE, HECTOMETER_PER_SECOND);
        millimeterPerMinuteResultTest = convert(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE, HECTOMETER_PER_SECOND);

        kilometerPerHourResultTest = convert(kilometerPerHourValue, KILOMETER_PER_HOUR, HECTOMETER_PER_SECOND);
        hectometerPerHourResultTest = convert(hectometerPerHourValue, HECTOMETER_PER_HOUR, HECTOMETER_PER_SECOND);
        decameterPerHourResultTest = convert(decameterPerHourValue, DECAMETER_PER_HOUR, HECTOMETER_PER_SECOND);
        meterPerHourResultTest = convert(meterPerHourValue, METER_PER_HOUR, HECTOMETER_PER_SECOND);
        decimeterPerHourResultTest = convert(decimeterPerHourValue, DECIMETER_PER_HOUR, HECTOMETER_PER_SECOND);
        centimeterPerHourResultTest = convert(centimeterPerHourValue, CENTIMETER_PER_HOUR, HECTOMETER_PER_SECOND);
        millimeterPerHourResultTest = convert(millimeterPerHourValue, MILLIMETER_PER_HOUR, HECTOMETER_PER_SECOND);

        kilometerPerSecondResult = toHectometerPerSecond(kilometerPerSecondValue, KILOMETER_PER_SECOND);
        hectometerPerSecondResult = toHectometerPerSecond(hectometerPerSecondValue, HECTOMETER_PER_SECOND);
        decameterPerSecondResult = toHectometerPerSecond(decameterPerSecondValue, DECAMETER_PER_SECOND);
        meterPerSecondResult = toHectometerPerSecond(meterPerSecondValue, METER_PER_SECOND);
        decimeterPerSecondResult = toHectometerPerSecond(decimeterPerSecondValue, DECIMETER_PER_SECOND);
        centimeterPerSecondResult = toHectometerPerSecond(centimeterPerSecondValue, CENTIMETER_PER_SECOND);
        millimeterPerSecondResult = toHectometerPerSecond(millimeterPerSecondValue, MILLIMETER_PER_SECOND);

        kilometerPerMinuteResult = toHectometerPerSecond(kilometerPerMinuteValue, KILOMETER_PER_MINUTE);
        hectometerPerMinuteResult = toHectometerPerSecond(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE);
        decameterPerMinuteResult = toHectometerPerSecond(decameterPerMinuteValue, DECAMETER_PER_MINUTE);
        meterPerMinuteResult = toHectometerPerSecond(meterPerMinuteValue, METER_PER_MINUTE);
        decimeterPerMinuteResult = toHectometerPerSecond(decimeterPerMinuteValue, DECIMETER_PER_MINUTE);
        centimeterPerMinuteResult = toHectometerPerSecond(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE);
        millimeterPerMinuteResult = toHectometerPerSecond(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE);

        kilometerPerHourResult = toHectometerPerSecond(kilometerPerHourValue, KILOMETER_PER_HOUR);
        hectometerPerHourResult = toHectometerPerSecond(hectometerPerHourValue, HECTOMETER_PER_HOUR);
        decameterPerHourResult = toHectometerPerSecond(decameterPerHourValue, DECAMETER_PER_HOUR);
        meterPerHourResult = toHectometerPerSecond(meterPerHourValue, METER_PER_HOUR);
        decimeterPerHourResult = toHectometerPerSecond(decimeterPerHourValue, DECIMETER_PER_HOUR);
        centimeterPerHourResult = toHectometerPerSecond(centimeterPerHourValue, CENTIMETER_PER_HOUR);
        millimeterPerHourResult = toHectometerPerSecond(millimeterPerHourValue, MILLIMETER_PER_HOUR);

        assertEquals(kilometerPerSecondResult, kilometerPerSecondResultTest);
        assertEquals(hectometerPerSecondResult, hectometerPerSecondResultTest);
        assertEquals(decameterPerSecondResult, decameterPerSecondResultTest);
        assertEquals(meterPerSecondResult, meterPerSecondResultTest);
        assertEquals(decimeterPerSecondResult, decimeterPerSecondResultTest);
        assertEquals(centimeterPerSecondResult, centimeterPerSecondResultTest);
        assertEquals(millimeterPerSecondResult, millimeterPerSecondResultTest);

        assertEquals(kilometerPerMinuteResult, kilometerPerMinuteResultTest);
        assertEquals(hectometerPerMinuteResult, hectometerPerMinuteResultTest);
        assertEquals(decameterPerMinuteResult, decameterPerMinuteResultTest);
        assertEquals(meterPerMinuteResult, meterPerMinuteResultTest);
        assertEquals(decimeterPerMinuteResult, decimeterPerMinuteResultTest);
        assertEquals(centimeterPerMinuteResult, centimeterPerMinuteResultTest);
        assertEquals(millimeterPerMinuteResult, millimeterPerMinuteResultTest);

        assertEquals(kilometerPerHourResult, kilometerPerHourResultTest);
        assertEquals(hectometerPerHourResult, hectometerPerHourResultTest);
        assertEquals(decameterPerHourResult, decameterPerHourResultTest);
        assertEquals(meterPerHourResult, meterPerHourResultTest);
        assertEquals(decimeterPerHourResult, decimeterPerHourResultTest);
        assertEquals(centimeterPerHourResult, centimeterPerHourResultTest);
        assertEquals(millimeterPerHourResult, millimeterPerHourResultTest);
    }
	
	@Test
    public void toDecameterPerSecondTest() {
        kilometerPerSecondResultTest = convert(kilometerPerSecondValue, KILOMETER_PER_SECOND, DECAMETER_PER_SECOND);
        hectometerPerSecondResultTest = convert(hectometerPerSecondValue, HECTOMETER_PER_SECOND, DECAMETER_PER_SECOND);
        decameterPerSecondResultTest = convert(decameterPerSecondValue, DECAMETER_PER_SECOND, DECAMETER_PER_SECOND);
        meterPerSecondResultTest = convert(meterPerSecondValue, METER_PER_SECOND, DECAMETER_PER_SECOND);
        decimeterPerSecondResultTest = convert(decimeterPerSecondValue, DECIMETER_PER_SECOND, DECAMETER_PER_SECOND);
        centimeterPerSecondResultTest = convert(centimeterPerSecondValue, CENTIMETER_PER_SECOND, DECAMETER_PER_SECOND);
        millimeterPerSecondResultTest = convert(millimeterPerSecondValue, MILLIMETER_PER_SECOND, DECAMETER_PER_SECOND);

        kilometerPerMinuteResultTest = convert(kilometerPerMinuteValue, KILOMETER_PER_MINUTE, DECAMETER_PER_SECOND);
        hectometerPerMinuteResultTest = convert(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE, DECAMETER_PER_SECOND);
        decameterPerMinuteResultTest = convert(decameterPerMinuteValue, DECAMETER_PER_MINUTE, DECAMETER_PER_SECOND);
        meterPerMinuteResultTest = convert(meterPerMinuteValue, METER_PER_MINUTE, DECAMETER_PER_SECOND);
        decimeterPerMinuteResultTest = convert(decimeterPerMinuteValue, DECIMETER_PER_MINUTE, DECAMETER_PER_SECOND);
        centimeterPerMinuteResultTest = convert(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE, DECAMETER_PER_SECOND);
        millimeterPerMinuteResultTest = convert(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE, DECAMETER_PER_SECOND);

        kilometerPerHourResultTest = convert(kilometerPerHourValue, KILOMETER_PER_HOUR, DECAMETER_PER_SECOND);
        hectometerPerHourResultTest = convert(hectometerPerHourValue, HECTOMETER_PER_HOUR, DECAMETER_PER_SECOND);
        decameterPerHourResultTest = convert(decameterPerHourValue, DECAMETER_PER_HOUR, DECAMETER_PER_SECOND);
        meterPerHourResultTest = convert(meterPerHourValue, METER_PER_HOUR, DECAMETER_PER_SECOND);
        decimeterPerHourResultTest = convert(decimeterPerHourValue, DECIMETER_PER_HOUR, DECAMETER_PER_SECOND);
        centimeterPerHourResultTest = convert(centimeterPerHourValue, CENTIMETER_PER_HOUR, DECAMETER_PER_SECOND);
        millimeterPerHourResultTest = convert(millimeterPerHourValue, MILLIMETER_PER_HOUR, DECAMETER_PER_SECOND);

        kilometerPerSecondResult = toDecameterPerSecond(kilometerPerSecondValue, KILOMETER_PER_SECOND);
        hectometerPerSecondResult = toDecameterPerSecond(hectometerPerSecondValue, HECTOMETER_PER_SECOND);
        decameterPerSecondResult = toDecameterPerSecond(decameterPerSecondValue, DECAMETER_PER_SECOND);
        meterPerSecondResult = toDecameterPerSecond(meterPerSecondValue, METER_PER_SECOND);
        decimeterPerSecondResult = toDecameterPerSecond(decimeterPerSecondValue, DECIMETER_PER_SECOND);
        centimeterPerSecondResult = toDecameterPerSecond(centimeterPerSecondValue, CENTIMETER_PER_SECOND);
        millimeterPerSecondResult = toDecameterPerSecond(millimeterPerSecondValue, MILLIMETER_PER_SECOND);

        kilometerPerMinuteResult = toDecameterPerSecond(kilometerPerMinuteValue, KILOMETER_PER_MINUTE);
        hectometerPerMinuteResult = toDecameterPerSecond(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE);
        decameterPerMinuteResult = toDecameterPerSecond(decameterPerMinuteValue, DECAMETER_PER_MINUTE);
        meterPerMinuteResult = toDecameterPerSecond(meterPerMinuteValue, METER_PER_MINUTE);
        decimeterPerMinuteResult = toDecameterPerSecond(decimeterPerMinuteValue, DECIMETER_PER_MINUTE);
        centimeterPerMinuteResult = toDecameterPerSecond(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE);
        millimeterPerMinuteResult = toDecameterPerSecond(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE);

        kilometerPerHourResult = toDecameterPerSecond(kilometerPerHourValue, KILOMETER_PER_HOUR);
        hectometerPerHourResult = toDecameterPerSecond(hectometerPerHourValue, HECTOMETER_PER_HOUR);
        decameterPerHourResult = toDecameterPerSecond(decameterPerHourValue, DECAMETER_PER_HOUR);
        meterPerHourResult = toDecameterPerSecond(meterPerHourValue, METER_PER_HOUR);
        decimeterPerHourResult = toDecameterPerSecond(decimeterPerHourValue, DECIMETER_PER_HOUR);
        centimeterPerHourResult = toDecameterPerSecond(centimeterPerHourValue, CENTIMETER_PER_HOUR);
        millimeterPerHourResult = toDecameterPerSecond(millimeterPerHourValue, MILLIMETER_PER_HOUR);

        assertEquals(kilometerPerSecondResult, kilometerPerSecondResultTest);
        assertEquals(hectometerPerSecondResult, hectometerPerSecondResultTest);
        assertEquals(decameterPerSecondResult, decameterPerSecondResultTest);
        assertEquals(meterPerSecondResult, meterPerSecondResultTest);
        assertEquals(decimeterPerSecondResult, decimeterPerSecondResultTest);
        assertEquals(centimeterPerSecondResult, centimeterPerSecondResultTest);
        assertEquals(millimeterPerSecondResult, millimeterPerSecondResultTest);

        assertEquals(kilometerPerMinuteResult, kilometerPerMinuteResultTest);
        assertEquals(hectometerPerMinuteResult, hectometerPerMinuteResultTest);
        assertEquals(decameterPerMinuteResult, decameterPerMinuteResultTest);
        assertEquals(meterPerMinuteResult, meterPerMinuteResultTest);
        assertEquals(decimeterPerMinuteResult, decimeterPerMinuteResultTest);
        assertEquals(centimeterPerMinuteResult, centimeterPerMinuteResultTest);
        assertEquals(millimeterPerMinuteResult, millimeterPerMinuteResultTest);

        assertEquals(kilometerPerHourResult, kilometerPerHourResultTest);
        assertEquals(hectometerPerHourResult, hectometerPerHourResultTest);
        assertEquals(decameterPerHourResult, decameterPerHourResultTest);
        assertEquals(meterPerHourResult, meterPerHourResultTest);
        assertEquals(decimeterPerHourResult, decimeterPerHourResultTest);
        assertEquals(centimeterPerHourResult, centimeterPerHourResultTest);
        assertEquals(millimeterPerHourResult, millimeterPerHourResultTest);
    }
    
	@Test
    public void toMeterPerSecondTest() {
        kilometerPerSecondResultTest = convert(kilometerPerSecondValue, KILOMETER_PER_SECOND, METER_PER_SECOND);
        hectometerPerSecondResultTest = convert(hectometerPerSecondValue, HECTOMETER_PER_SECOND, METER_PER_SECOND);
        decameterPerSecondResultTest = convert(decameterPerSecondValue, DECAMETER_PER_SECOND, METER_PER_SECOND);
        meterPerSecondResultTest = convert(meterPerSecondValue, METER_PER_SECOND, METER_PER_SECOND);
        decimeterPerSecondResultTest = convert(decimeterPerSecondValue, DECIMETER_PER_SECOND, METER_PER_SECOND);
        centimeterPerSecondResultTest = convert(centimeterPerSecondValue, CENTIMETER_PER_SECOND, METER_PER_SECOND);
        millimeterPerSecondResultTest = convert(millimeterPerSecondValue, MILLIMETER_PER_SECOND, METER_PER_SECOND);

        kilometerPerMinuteResultTest = convert(kilometerPerMinuteValue, KILOMETER_PER_MINUTE, METER_PER_SECOND);
        hectometerPerMinuteResultTest = convert(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE, METER_PER_SECOND);
        decameterPerMinuteResultTest = convert(decameterPerMinuteValue, DECAMETER_PER_MINUTE, METER_PER_SECOND);
        meterPerMinuteResultTest = convert(meterPerMinuteValue, METER_PER_MINUTE, METER_PER_SECOND);
        decimeterPerMinuteResultTest = convert(decimeterPerMinuteValue, DECIMETER_PER_MINUTE, METER_PER_SECOND);
        centimeterPerMinuteResultTest = convert(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE, METER_PER_SECOND);
        millimeterPerMinuteResultTest = convert(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE, METER_PER_SECOND);

        kilometerPerHourResultTest = convert(kilometerPerHourValue, KILOMETER_PER_HOUR, METER_PER_SECOND);
        hectometerPerHourResultTest = convert(hectometerPerHourValue, HECTOMETER_PER_HOUR, METER_PER_SECOND);
        decameterPerHourResultTest = convert(decameterPerHourValue, DECAMETER_PER_HOUR, METER_PER_SECOND);
        meterPerHourResultTest = convert(meterPerHourValue, METER_PER_HOUR, METER_PER_SECOND);
        decimeterPerHourResultTest = convert(decimeterPerHourValue, DECIMETER_PER_HOUR, METER_PER_SECOND);
        centimeterPerHourResultTest = convert(centimeterPerHourValue, CENTIMETER_PER_HOUR, METER_PER_SECOND);
        millimeterPerHourResultTest = convert(millimeterPerHourValue, MILLIMETER_PER_HOUR, METER_PER_SECOND);

        kilometerPerSecondResult = toMeterPerSecond(kilometerPerSecondValue, KILOMETER_PER_SECOND);
        hectometerPerSecondResult = toMeterPerSecond(hectometerPerSecondValue, HECTOMETER_PER_SECOND);
        decameterPerSecondResult = toMeterPerSecond(decameterPerSecondValue, DECAMETER_PER_SECOND);
        meterPerSecondResult = toMeterPerSecond(meterPerSecondValue, METER_PER_SECOND);
        decimeterPerSecondResult = toMeterPerSecond(decimeterPerSecondValue, DECIMETER_PER_SECOND);
        centimeterPerSecondResult = toMeterPerSecond(centimeterPerSecondValue, CENTIMETER_PER_SECOND);
        millimeterPerSecondResult = toMeterPerSecond(millimeterPerSecondValue, MILLIMETER_PER_SECOND);

        kilometerPerMinuteResult = toMeterPerSecond(kilometerPerMinuteValue, KILOMETER_PER_MINUTE);
        hectometerPerMinuteResult = toMeterPerSecond(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE);
        decameterPerMinuteResult = toMeterPerSecond(decameterPerMinuteValue, DECAMETER_PER_MINUTE);
        meterPerMinuteResult = toMeterPerSecond(meterPerMinuteValue, METER_PER_MINUTE);
        decimeterPerMinuteResult = toMeterPerSecond(decimeterPerMinuteValue, DECIMETER_PER_MINUTE);
        centimeterPerMinuteResult = toMeterPerSecond(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE);
        millimeterPerMinuteResult = toMeterPerSecond(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE);

        kilometerPerHourResult = toMeterPerSecond(kilometerPerHourValue, KILOMETER_PER_HOUR);
        hectometerPerHourResult = toMeterPerSecond(hectometerPerHourValue, HECTOMETER_PER_HOUR);
        decameterPerHourResult = toMeterPerSecond(decameterPerHourValue, DECAMETER_PER_HOUR);
        meterPerHourResult = toMeterPerSecond(meterPerHourValue, METER_PER_HOUR);
        decimeterPerHourResult = toMeterPerSecond(decimeterPerHourValue, DECIMETER_PER_HOUR);
        centimeterPerHourResult = toMeterPerSecond(centimeterPerHourValue, CENTIMETER_PER_HOUR);
        millimeterPerHourResult = toMeterPerSecond(millimeterPerHourValue, MILLIMETER_PER_HOUR);

        assertEquals(kilometerPerSecondResult, kilometerPerSecondResultTest);
        assertEquals(hectometerPerSecondResult, hectometerPerSecondResultTest);
        assertEquals(decameterPerSecondResult, decameterPerSecondResultTest);
        assertEquals(meterPerSecondResult, meterPerSecondResultTest);
        assertEquals(decimeterPerSecondResult, decimeterPerSecondResultTest);
        assertEquals(centimeterPerSecondResult, centimeterPerSecondResultTest);
        assertEquals(millimeterPerSecondResult, millimeterPerSecondResultTest);

        assertEquals(kilometerPerMinuteResult, kilometerPerMinuteResultTest);
        assertEquals(hectometerPerMinuteResult, hectometerPerMinuteResultTest);
        assertEquals(decameterPerMinuteResult, decameterPerMinuteResultTest);
        assertEquals(meterPerMinuteResult, meterPerMinuteResultTest);
        assertEquals(decimeterPerMinuteResult, decimeterPerMinuteResultTest);
        assertEquals(centimeterPerMinuteResult, centimeterPerMinuteResultTest);
        assertEquals(millimeterPerMinuteResult, millimeterPerMinuteResultTest);

        assertEquals(kilometerPerHourResult, kilometerPerHourResultTest);
        assertEquals(hectometerPerHourResult, hectometerPerHourResultTest);
        assertEquals(decameterPerHourResult, decameterPerHourResultTest);
        assertEquals(meterPerHourResult, meterPerHourResultTest);
        assertEquals(decimeterPerHourResult, decimeterPerHourResultTest);
        assertEquals(centimeterPerHourResult, centimeterPerHourResultTest);
        assertEquals(millimeterPerHourResult, millimeterPerHourResultTest);
    }
	
	@Test
    public void toDecimeterPerSecondTest() {
        kilometerPerSecondResultTest = convert(kilometerPerSecondValue, KILOMETER_PER_SECOND, DECIMETER_PER_SECOND);
        hectometerPerSecondResultTest = convert(hectometerPerSecondValue, HECTOMETER_PER_SECOND, DECIMETER_PER_SECOND);
        decameterPerSecondResultTest = convert(decameterPerSecondValue, DECAMETER_PER_SECOND, DECIMETER_PER_SECOND);
        meterPerSecondResultTest = convert(meterPerSecondValue, METER_PER_SECOND, DECIMETER_PER_SECOND);
        decimeterPerSecondResultTest = convert(decimeterPerSecondValue, DECIMETER_PER_SECOND, DECIMETER_PER_SECOND);
        centimeterPerSecondResultTest = convert(centimeterPerSecondValue, CENTIMETER_PER_SECOND, DECIMETER_PER_SECOND);
        millimeterPerSecondResultTest = convert(millimeterPerSecondValue, MILLIMETER_PER_SECOND, DECIMETER_PER_SECOND);

        kilometerPerMinuteResultTest = convert(kilometerPerMinuteValue, KILOMETER_PER_MINUTE, DECIMETER_PER_SECOND);
        hectometerPerMinuteResultTest = convert(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE, DECIMETER_PER_SECOND);
        decameterPerMinuteResultTest = convert(decameterPerMinuteValue, DECAMETER_PER_MINUTE, DECIMETER_PER_SECOND);
        meterPerMinuteResultTest = convert(meterPerMinuteValue, METER_PER_MINUTE, DECIMETER_PER_SECOND);
        decimeterPerMinuteResultTest = convert(decimeterPerMinuteValue, DECIMETER_PER_MINUTE, DECIMETER_PER_SECOND);
        centimeterPerMinuteResultTest = convert(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE, DECIMETER_PER_SECOND);
        millimeterPerMinuteResultTest = convert(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE, DECIMETER_PER_SECOND);

        kilometerPerHourResultTest = convert(kilometerPerHourValue, KILOMETER_PER_HOUR, DECIMETER_PER_SECOND);
        hectometerPerHourResultTest = convert(hectometerPerHourValue, HECTOMETER_PER_HOUR, DECIMETER_PER_SECOND);
        decameterPerHourResultTest = convert(decameterPerHourValue, DECAMETER_PER_HOUR, DECIMETER_PER_SECOND);
        meterPerHourResultTest = convert(meterPerHourValue, METER_PER_HOUR, DECIMETER_PER_SECOND);
        decimeterPerHourResultTest = convert(decimeterPerHourValue, DECIMETER_PER_HOUR, DECIMETER_PER_SECOND);
        centimeterPerHourResultTest = convert(centimeterPerHourValue, CENTIMETER_PER_HOUR, DECIMETER_PER_SECOND);
        millimeterPerHourResultTest = convert(millimeterPerHourValue, MILLIMETER_PER_HOUR, DECIMETER_PER_SECOND);

        kilometerPerSecondResult = toDecimeterPerSecond(kilometerPerSecondValue, KILOMETER_PER_SECOND);
        hectometerPerSecondResult = toDecimeterPerSecond(hectometerPerSecondValue, HECTOMETER_PER_SECOND);
        decameterPerSecondResult = toDecimeterPerSecond(decameterPerSecondValue, DECAMETER_PER_SECOND);
        meterPerSecondResult = toDecimeterPerSecond(meterPerSecondValue, METER_PER_SECOND);
        decimeterPerSecondResult = toDecimeterPerSecond(decimeterPerSecondValue, DECIMETER_PER_SECOND);
        centimeterPerSecondResult = toDecimeterPerSecond(centimeterPerSecondValue, CENTIMETER_PER_SECOND);
        millimeterPerSecondResult = toDecimeterPerSecond(millimeterPerSecondValue, MILLIMETER_PER_SECOND);

        kilometerPerMinuteResult = toDecimeterPerSecond(kilometerPerMinuteValue, KILOMETER_PER_MINUTE);
        hectometerPerMinuteResult = toDecimeterPerSecond(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE);
        decameterPerMinuteResult = toDecimeterPerSecond(decameterPerMinuteValue, DECAMETER_PER_MINUTE);
        meterPerMinuteResult = toDecimeterPerSecond(meterPerMinuteValue, METER_PER_MINUTE);
        decimeterPerMinuteResult = toDecimeterPerSecond(decimeterPerMinuteValue, DECIMETER_PER_MINUTE);
        centimeterPerMinuteResult = toDecimeterPerSecond(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE);
        millimeterPerMinuteResult = toDecimeterPerSecond(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE);

        kilometerPerHourResult = toDecimeterPerSecond(kilometerPerHourValue, KILOMETER_PER_HOUR);
        hectometerPerHourResult = toDecimeterPerSecond(hectometerPerHourValue, HECTOMETER_PER_HOUR);
        decameterPerHourResult = toDecimeterPerSecond(decameterPerHourValue, DECAMETER_PER_HOUR);
        meterPerHourResult = toDecimeterPerSecond(meterPerHourValue, METER_PER_HOUR);
        decimeterPerHourResult = toDecimeterPerSecond(decimeterPerHourValue, DECIMETER_PER_HOUR);
        centimeterPerHourResult = toDecimeterPerSecond(centimeterPerHourValue, CENTIMETER_PER_HOUR);
        millimeterPerHourResult = toDecimeterPerSecond(millimeterPerHourValue, MILLIMETER_PER_HOUR);

        assertEquals(kilometerPerSecondResult, kilometerPerSecondResultTest);
        assertEquals(hectometerPerSecondResult, hectometerPerSecondResultTest);
        assertEquals(decameterPerSecondResult, decameterPerSecondResultTest);
        assertEquals(meterPerSecondResult, meterPerSecondResultTest);
        assertEquals(decimeterPerSecondResult, decimeterPerSecondResultTest);
        assertEquals(centimeterPerSecondResult, centimeterPerSecondResultTest);
        assertEquals(millimeterPerSecondResult, millimeterPerSecondResultTest);

        assertEquals(kilometerPerMinuteResult, kilometerPerMinuteResultTest);
        assertEquals(hectometerPerMinuteResult, hectometerPerMinuteResultTest);
        assertEquals(decameterPerMinuteResult, decameterPerMinuteResultTest);
        assertEquals(meterPerMinuteResult, meterPerMinuteResultTest);
        assertEquals(decimeterPerMinuteResult, decimeterPerMinuteResultTest);
        assertEquals(centimeterPerMinuteResult, centimeterPerMinuteResultTest);
        assertEquals(millimeterPerMinuteResult, millimeterPerMinuteResultTest);

        assertEquals(kilometerPerHourResult, kilometerPerHourResultTest);
        assertEquals(hectometerPerHourResult, hectometerPerHourResultTest);
        assertEquals(decameterPerHourResult, decameterPerHourResultTest);
        assertEquals(meterPerHourResult, meterPerHourResultTest);
        assertEquals(decimeterPerHourResult, decimeterPerHourResultTest);
        assertEquals(centimeterPerHourResult, centimeterPerHourResultTest);
        assertEquals(millimeterPerHourResult, millimeterPerHourResultTest);
    }
	
	@Test
    public void toCentimeterPerSecondTest() {
        kilometerPerSecondResultTest = convert(kilometerPerSecondValue, KILOMETER_PER_SECOND, CENTIMETER_PER_SECOND);
        hectometerPerSecondResultTest = convert(hectometerPerSecondValue, HECTOMETER_PER_SECOND, CENTIMETER_PER_SECOND);
        decameterPerSecondResultTest = convert(decameterPerSecondValue, DECAMETER_PER_SECOND, CENTIMETER_PER_SECOND);
        meterPerSecondResultTest = convert(meterPerSecondValue, METER_PER_SECOND, CENTIMETER_PER_SECOND);
        decimeterPerSecondResultTest = convert(decimeterPerSecondValue, DECIMETER_PER_SECOND, CENTIMETER_PER_SECOND);
        centimeterPerSecondResultTest = convert(centimeterPerSecondValue, CENTIMETER_PER_SECOND, CENTIMETER_PER_SECOND);
        millimeterPerSecondResultTest = convert(millimeterPerSecondValue, MILLIMETER_PER_SECOND, CENTIMETER_PER_SECOND);

        kilometerPerMinuteResultTest = convert(kilometerPerMinuteValue, KILOMETER_PER_MINUTE, CENTIMETER_PER_SECOND);
        hectometerPerMinuteResultTest = convert(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE, CENTIMETER_PER_SECOND);
        decameterPerMinuteResultTest = convert(decameterPerMinuteValue, DECAMETER_PER_MINUTE, CENTIMETER_PER_SECOND);
        meterPerMinuteResultTest = convert(meterPerMinuteValue, METER_PER_MINUTE, CENTIMETER_PER_SECOND);
        decimeterPerMinuteResultTest = convert(decimeterPerMinuteValue, DECIMETER_PER_MINUTE, CENTIMETER_PER_SECOND);
        centimeterPerMinuteResultTest = convert(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE, CENTIMETER_PER_SECOND);
        millimeterPerMinuteResultTest = convert(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE, CENTIMETER_PER_SECOND);

        kilometerPerHourResultTest = convert(kilometerPerHourValue, KILOMETER_PER_HOUR, CENTIMETER_PER_SECOND);
        hectometerPerHourResultTest = convert(hectometerPerHourValue, HECTOMETER_PER_HOUR, CENTIMETER_PER_SECOND);
        decameterPerHourResultTest = convert(decameterPerHourValue, DECAMETER_PER_HOUR, CENTIMETER_PER_SECOND);
        meterPerHourResultTest = convert(meterPerHourValue, METER_PER_HOUR, CENTIMETER_PER_SECOND);
        decimeterPerHourResultTest = convert(decimeterPerHourValue, DECIMETER_PER_HOUR, CENTIMETER_PER_SECOND);
        centimeterPerHourResultTest = convert(centimeterPerHourValue, CENTIMETER_PER_HOUR, CENTIMETER_PER_SECOND);
        millimeterPerHourResultTest = convert(millimeterPerHourValue, MILLIMETER_PER_HOUR, CENTIMETER_PER_SECOND);

        kilometerPerSecondResult = toCentimeterPerSecond(kilometerPerSecondValue, KILOMETER_PER_SECOND);
        hectometerPerSecondResult = toCentimeterPerSecond(hectometerPerSecondValue, HECTOMETER_PER_SECOND);
        decameterPerSecondResult = toCentimeterPerSecond(decameterPerSecondValue, DECAMETER_PER_SECOND);
        meterPerSecondResult = toCentimeterPerSecond(meterPerSecondValue, METER_PER_SECOND);
        decimeterPerSecondResult = toCentimeterPerSecond(decimeterPerSecondValue, DECIMETER_PER_SECOND);
        centimeterPerSecondResult = toCentimeterPerSecond(centimeterPerSecondValue, CENTIMETER_PER_SECOND);
        millimeterPerSecondResult = toCentimeterPerSecond(millimeterPerSecondValue, MILLIMETER_PER_SECOND);

        kilometerPerMinuteResult = toCentimeterPerSecond(kilometerPerMinuteValue, KILOMETER_PER_MINUTE);
        hectometerPerMinuteResult = toCentimeterPerSecond(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE);
        decameterPerMinuteResult = toCentimeterPerSecond(decameterPerMinuteValue, DECAMETER_PER_MINUTE);
        meterPerMinuteResult = toCentimeterPerSecond(meterPerMinuteValue, METER_PER_MINUTE);
        decimeterPerMinuteResult = toCentimeterPerSecond(decimeterPerMinuteValue, DECIMETER_PER_MINUTE);
        centimeterPerMinuteResult = toCentimeterPerSecond(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE);
        millimeterPerMinuteResult = toCentimeterPerSecond(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE);

        kilometerPerHourResult = toCentimeterPerSecond(kilometerPerHourValue, KILOMETER_PER_HOUR);
        hectometerPerHourResult = toCentimeterPerSecond(hectometerPerHourValue, HECTOMETER_PER_HOUR);
        decameterPerHourResult = toCentimeterPerSecond(decameterPerHourValue, DECAMETER_PER_HOUR);
        meterPerHourResult = toCentimeterPerSecond(meterPerHourValue, METER_PER_HOUR);
        decimeterPerHourResult = toCentimeterPerSecond(decimeterPerHourValue, DECIMETER_PER_HOUR);
        centimeterPerHourResult = toCentimeterPerSecond(centimeterPerHourValue, CENTIMETER_PER_HOUR);
        millimeterPerHourResult = toCentimeterPerSecond(millimeterPerHourValue, MILLIMETER_PER_HOUR);

        assertEquals(kilometerPerSecondResult, kilometerPerSecondResultTest);
        assertEquals(hectometerPerSecondResult, hectometerPerSecondResultTest);
        assertEquals(decameterPerSecondResult, decameterPerSecondResultTest);
        assertEquals(meterPerSecondResult, meterPerSecondResultTest);
        assertEquals(decimeterPerSecondResult, decimeterPerSecondResultTest);
        assertEquals(centimeterPerSecondResult, centimeterPerSecondResultTest);
        assertEquals(millimeterPerSecondResult, millimeterPerSecondResultTest);

        assertEquals(kilometerPerMinuteResult, kilometerPerMinuteResultTest);
        assertEquals(hectometerPerMinuteResult, hectometerPerMinuteResultTest);
        assertEquals(decameterPerMinuteResult, decameterPerMinuteResultTest);
        assertEquals(meterPerMinuteResult, meterPerMinuteResultTest);
        assertEquals(decimeterPerMinuteResult, decimeterPerMinuteResultTest);
        assertEquals(centimeterPerMinuteResult, centimeterPerMinuteResultTest);
        assertEquals(millimeterPerMinuteResult, millimeterPerMinuteResultTest);

        assertEquals(kilometerPerHourResult, kilometerPerHourResultTest);
        assertEquals(hectometerPerHourResult, hectometerPerHourResultTest);
        assertEquals(decameterPerHourResult, decameterPerHourResultTest);
        assertEquals(meterPerHourResult, meterPerHourResultTest);
        assertEquals(decimeterPerHourResult, decimeterPerHourResultTest);
        assertEquals(centimeterPerHourResult, centimeterPerHourResultTest);
        assertEquals(millimeterPerHourResult, millimeterPerHourResultTest);
    }
	
	@Test
    public void toMillimeterPerSecondTest() {
        kilometerPerSecondResultTest = convert(kilometerPerSecondValue, KILOMETER_PER_SECOND, MILLIMETER_PER_SECOND);
        hectometerPerSecondResultTest = convert(hectometerPerSecondValue, HECTOMETER_PER_SECOND, MILLIMETER_PER_SECOND);
        decameterPerSecondResultTest = convert(decameterPerSecondValue, DECAMETER_PER_SECOND, MILLIMETER_PER_SECOND);
        meterPerSecondResultTest = convert(meterPerSecondValue, METER_PER_SECOND, MILLIMETER_PER_SECOND);
        decimeterPerSecondResultTest = convert(decimeterPerSecondValue, DECIMETER_PER_SECOND, MILLIMETER_PER_SECOND);
        centimeterPerSecondResultTest = convert(centimeterPerSecondValue, CENTIMETER_PER_SECOND, MILLIMETER_PER_SECOND);
        millimeterPerSecondResultTest = convert(millimeterPerSecondValue, MILLIMETER_PER_SECOND, MILLIMETER_PER_SECOND);

        kilometerPerMinuteResultTest = convert(kilometerPerMinuteValue, KILOMETER_PER_MINUTE, MILLIMETER_PER_SECOND);
        hectometerPerMinuteResultTest = convert(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE, MILLIMETER_PER_SECOND);
        decameterPerMinuteResultTest = convert(decameterPerMinuteValue, DECAMETER_PER_MINUTE, MILLIMETER_PER_SECOND);
        meterPerMinuteResultTest = convert(meterPerMinuteValue, METER_PER_MINUTE, MILLIMETER_PER_SECOND);
        decimeterPerMinuteResultTest = convert(decimeterPerMinuteValue, DECIMETER_PER_MINUTE, MILLIMETER_PER_SECOND);
        centimeterPerMinuteResultTest = convert(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE, MILLIMETER_PER_SECOND);
        millimeterPerMinuteResultTest = convert(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE, MILLIMETER_PER_SECOND);

        kilometerPerHourResultTest = convert(kilometerPerHourValue, KILOMETER_PER_HOUR, MILLIMETER_PER_SECOND);
        hectometerPerHourResultTest = convert(hectometerPerHourValue, HECTOMETER_PER_HOUR, MILLIMETER_PER_SECOND);
        decameterPerHourResultTest = convert(decameterPerHourValue, DECAMETER_PER_HOUR, MILLIMETER_PER_SECOND);
        meterPerHourResultTest = convert(meterPerHourValue, METER_PER_HOUR, MILLIMETER_PER_SECOND);
        decimeterPerHourResultTest = convert(decimeterPerHourValue, DECIMETER_PER_HOUR, MILLIMETER_PER_SECOND);
        centimeterPerHourResultTest = convert(centimeterPerHourValue, CENTIMETER_PER_HOUR, MILLIMETER_PER_SECOND);
        millimeterPerHourResultTest = convert(millimeterPerHourValue, MILLIMETER_PER_HOUR, MILLIMETER_PER_SECOND);

        kilometerPerSecondResult = toMillimeterPerSecond(kilometerPerSecondValue, KILOMETER_PER_SECOND);
        hectometerPerSecondResult = toMillimeterPerSecond(hectometerPerSecondValue, HECTOMETER_PER_SECOND);
        decameterPerSecondResult = toMillimeterPerSecond(decameterPerSecondValue, DECAMETER_PER_SECOND);
        meterPerSecondResult = toMillimeterPerSecond(meterPerSecondValue, METER_PER_SECOND);
        decimeterPerSecondResult = toMillimeterPerSecond(decimeterPerSecondValue, DECIMETER_PER_SECOND);
        centimeterPerSecondResult = toMillimeterPerSecond(centimeterPerSecondValue, CENTIMETER_PER_SECOND);
        millimeterPerSecondResult = toMillimeterPerSecond(millimeterPerSecondValue, MILLIMETER_PER_SECOND);

        kilometerPerMinuteResult = toMillimeterPerSecond(kilometerPerMinuteValue, KILOMETER_PER_MINUTE);
        hectometerPerMinuteResult = toMillimeterPerSecond(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE);
        decameterPerMinuteResult = toMillimeterPerSecond(decameterPerMinuteValue, DECAMETER_PER_MINUTE);
        meterPerMinuteResult = toMillimeterPerSecond(meterPerMinuteValue, METER_PER_MINUTE);
        decimeterPerMinuteResult = toMillimeterPerSecond(decimeterPerMinuteValue, DECIMETER_PER_MINUTE);
        centimeterPerMinuteResult = toMillimeterPerSecond(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE);
        millimeterPerMinuteResult = toMillimeterPerSecond(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE);

        kilometerPerHourResult = toMillimeterPerSecond(kilometerPerHourValue, KILOMETER_PER_HOUR);
        hectometerPerHourResult = toMillimeterPerSecond(hectometerPerHourValue, HECTOMETER_PER_HOUR);
        decameterPerHourResult = toMillimeterPerSecond(decameterPerHourValue, DECAMETER_PER_HOUR);
        meterPerHourResult = toMillimeterPerSecond(meterPerHourValue, METER_PER_HOUR);
        decimeterPerHourResult = toMillimeterPerSecond(decimeterPerHourValue, DECIMETER_PER_HOUR);
        centimeterPerHourResult = toMillimeterPerSecond(centimeterPerHourValue, CENTIMETER_PER_HOUR);
        millimeterPerHourResult = toMillimeterPerSecond(millimeterPerHourValue, MILLIMETER_PER_HOUR);

        assertEquals(kilometerPerSecondResult, kilometerPerSecondResultTest);
        assertEquals(hectometerPerSecondResult, hectometerPerSecondResultTest);
        assertEquals(decameterPerSecondResult, decameterPerSecondResultTest);
        assertEquals(meterPerSecondResult, meterPerSecondResultTest);
        assertEquals(decimeterPerSecondResult, decimeterPerSecondResultTest);
        assertEquals(centimeterPerSecondResult, centimeterPerSecondResultTest);
        assertEquals(millimeterPerSecondResult, millimeterPerSecondResultTest);

        assertEquals(kilometerPerMinuteResult, kilometerPerMinuteResultTest);
        assertEquals(hectometerPerMinuteResult, hectometerPerMinuteResultTest);
        assertEquals(decameterPerMinuteResult, decameterPerMinuteResultTest);
        assertEquals(meterPerMinuteResult, meterPerMinuteResultTest);
        assertEquals(decimeterPerMinuteResult, decimeterPerMinuteResultTest);
        assertEquals(centimeterPerMinuteResult, centimeterPerMinuteResultTest);
        assertEquals(millimeterPerMinuteResult, millimeterPerMinuteResultTest);

        assertEquals(kilometerPerHourResult, kilometerPerHourResultTest);
        assertEquals(hectometerPerHourResult, hectometerPerHourResultTest);
        assertEquals(decameterPerHourResult, decameterPerHourResultTest);
        assertEquals(meterPerHourResult, meterPerHourResultTest);
        assertEquals(decimeterPerHourResult, decimeterPerHourResultTest);
        assertEquals(centimeterPerHourResult, centimeterPerHourResultTest);
        assertEquals(millimeterPerHourResult, millimeterPerHourResultTest);
    }
	
	@Test
    public void toKilometerPerMinuteTest() {
        kilometerPerSecondResultTest = convert(kilometerPerSecondValue, KILOMETER_PER_SECOND, KILOMETER_PER_MINUTE);
        hectometerPerSecondResultTest = convert(hectometerPerSecondValue, HECTOMETER_PER_SECOND, KILOMETER_PER_MINUTE);
        decameterPerSecondResultTest = convert(decameterPerSecondValue, DECAMETER_PER_SECOND, KILOMETER_PER_MINUTE);
        meterPerSecondResultTest = convert(meterPerSecondValue, METER_PER_SECOND, KILOMETER_PER_MINUTE);
        decimeterPerSecondResultTest = convert(decimeterPerSecondValue, DECIMETER_PER_SECOND, KILOMETER_PER_MINUTE);
        centimeterPerSecondResultTest = convert(centimeterPerSecondValue, CENTIMETER_PER_SECOND, KILOMETER_PER_MINUTE);
        millimeterPerSecondResultTest = convert(millimeterPerSecondValue, MILLIMETER_PER_SECOND, KILOMETER_PER_MINUTE);

        kilometerPerMinuteResultTest = convert(kilometerPerMinuteValue, KILOMETER_PER_MINUTE, KILOMETER_PER_MINUTE);
        hectometerPerMinuteResultTest = convert(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE, KILOMETER_PER_MINUTE);
        decameterPerMinuteResultTest = convert(decameterPerMinuteValue, DECAMETER_PER_MINUTE, KILOMETER_PER_MINUTE);
        meterPerMinuteResultTest = convert(meterPerMinuteValue, METER_PER_MINUTE, KILOMETER_PER_MINUTE);
        decimeterPerMinuteResultTest = convert(decimeterPerMinuteValue, DECIMETER_PER_MINUTE, KILOMETER_PER_MINUTE);
        centimeterPerMinuteResultTest = convert(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE, KILOMETER_PER_MINUTE);
        millimeterPerMinuteResultTest = convert(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE, KILOMETER_PER_MINUTE);

        kilometerPerHourResultTest = convert(kilometerPerHourValue, KILOMETER_PER_HOUR, KILOMETER_PER_MINUTE);
        hectometerPerHourResultTest = convert(hectometerPerHourValue, HECTOMETER_PER_HOUR, KILOMETER_PER_MINUTE);
        decameterPerHourResultTest = convert(decameterPerHourValue, DECAMETER_PER_HOUR, KILOMETER_PER_MINUTE);
        meterPerHourResultTest = convert(meterPerHourValue, METER_PER_HOUR, KILOMETER_PER_MINUTE);
        decimeterPerHourResultTest = convert(decimeterPerHourValue, DECIMETER_PER_HOUR, KILOMETER_PER_MINUTE);
        centimeterPerHourResultTest = convert(centimeterPerHourValue, CENTIMETER_PER_HOUR, KILOMETER_PER_MINUTE);
        millimeterPerHourResultTest = convert(millimeterPerHourValue, MILLIMETER_PER_HOUR, KILOMETER_PER_MINUTE);

        kilometerPerSecondResult = toKilometerPerMinute(kilometerPerSecondValue, KILOMETER_PER_SECOND);
        hectometerPerSecondResult = toKilometerPerMinute(hectometerPerSecondValue, HECTOMETER_PER_SECOND);
        decameterPerSecondResult = toKilometerPerMinute(decameterPerSecondValue, DECAMETER_PER_SECOND);
        meterPerSecondResult = toKilometerPerMinute(meterPerSecondValue, METER_PER_SECOND);
        decimeterPerSecondResult = toKilometerPerMinute(decimeterPerSecondValue, DECIMETER_PER_SECOND);
        centimeterPerSecondResult = toKilometerPerMinute(centimeterPerSecondValue, CENTIMETER_PER_SECOND);
        millimeterPerSecondResult = toKilometerPerMinute(millimeterPerSecondValue, MILLIMETER_PER_SECOND);

        kilometerPerMinuteResult = toKilometerPerMinute(kilometerPerMinuteValue, KILOMETER_PER_MINUTE);
        hectometerPerMinuteResult = toKilometerPerMinute(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE);
        decameterPerMinuteResult = toKilometerPerMinute(decameterPerMinuteValue, DECAMETER_PER_MINUTE);
        meterPerMinuteResult = toKilometerPerMinute(meterPerMinuteValue, METER_PER_MINUTE);
        decimeterPerMinuteResult = toKilometerPerMinute(decimeterPerMinuteValue, DECIMETER_PER_MINUTE);
        centimeterPerMinuteResult = toKilometerPerMinute(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE);
        millimeterPerMinuteResult = toKilometerPerMinute(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE);

        kilometerPerHourResult = toKilometerPerMinute(kilometerPerHourValue, KILOMETER_PER_HOUR);
        hectometerPerHourResult = toKilometerPerMinute(hectometerPerHourValue, HECTOMETER_PER_HOUR);
        decameterPerHourResult = toKilometerPerMinute(decameterPerHourValue, DECAMETER_PER_HOUR);
        meterPerHourResult = toKilometerPerMinute(meterPerHourValue, METER_PER_HOUR);
        decimeterPerHourResult = toKilometerPerMinute(decimeterPerHourValue, DECIMETER_PER_HOUR);
        centimeterPerHourResult = toKilometerPerMinute(centimeterPerHourValue, CENTIMETER_PER_HOUR);
        millimeterPerHourResult = toKilometerPerMinute(millimeterPerHourValue, MILLIMETER_PER_HOUR);

        assertEquals(kilometerPerSecondResult, kilometerPerSecondResultTest);
        assertEquals(hectometerPerSecondResult, hectometerPerSecondResultTest);
        assertEquals(decameterPerSecondResult, decameterPerSecondResultTest);
        assertEquals(meterPerSecondResult, meterPerSecondResultTest);
        assertEquals(decimeterPerSecondResult, decimeterPerSecondResultTest);
        assertEquals(centimeterPerSecondResult, centimeterPerSecondResultTest);
        assertEquals(millimeterPerSecondResult, millimeterPerSecondResultTest);

        assertEquals(kilometerPerMinuteResult, kilometerPerMinuteResultTest);
        assertEquals(hectometerPerMinuteResult, hectometerPerMinuteResultTest);
        assertEquals(decameterPerMinuteResult, decameterPerMinuteResultTest);
        assertEquals(meterPerMinuteResult, meterPerMinuteResultTest);
        assertEquals(decimeterPerMinuteResult, decimeterPerMinuteResultTest);
        assertEquals(centimeterPerMinuteResult, centimeterPerMinuteResultTest);
        assertEquals(millimeterPerMinuteResult, millimeterPerMinuteResultTest);

        assertEquals(kilometerPerHourResult, kilometerPerHourResultTest);
        assertEquals(hectometerPerHourResult, hectometerPerHourResultTest);
        assertEquals(decameterPerHourResult, decameterPerHourResultTest);
        assertEquals(meterPerHourResult, meterPerHourResultTest);
        assertEquals(decimeterPerHourResult, decimeterPerHourResultTest);
        assertEquals(centimeterPerHourResult, centimeterPerHourResultTest);
        assertEquals(millimeterPerHourResult, millimeterPerHourResultTest);
    }
	
	@Test
    public void toHectometerPerMinuteTest() {
        kilometerPerSecondResultTest = convert(kilometerPerSecondValue, KILOMETER_PER_SECOND, HECTOMETER_PER_MINUTE);
        hectometerPerSecondResultTest = convert(hectometerPerSecondValue, HECTOMETER_PER_SECOND, HECTOMETER_PER_MINUTE);
        decameterPerSecondResultTest = convert(decameterPerSecondValue, DECAMETER_PER_SECOND, HECTOMETER_PER_MINUTE);
        meterPerSecondResultTest = convert(meterPerSecondValue, METER_PER_SECOND, HECTOMETER_PER_MINUTE);
        decimeterPerSecondResultTest = convert(decimeterPerSecondValue, DECIMETER_PER_SECOND, HECTOMETER_PER_MINUTE);
        centimeterPerSecondResultTest = convert(centimeterPerSecondValue, CENTIMETER_PER_SECOND, HECTOMETER_PER_MINUTE);
        millimeterPerSecondResultTest = convert(millimeterPerSecondValue, MILLIMETER_PER_SECOND, HECTOMETER_PER_MINUTE);

        kilometerPerMinuteResultTest = convert(kilometerPerMinuteValue, KILOMETER_PER_MINUTE, HECTOMETER_PER_MINUTE);
        hectometerPerMinuteResultTest = convert(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE, HECTOMETER_PER_MINUTE);
        decameterPerMinuteResultTest = convert(decameterPerMinuteValue, DECAMETER_PER_MINUTE, HECTOMETER_PER_MINUTE);
        meterPerMinuteResultTest = convert(meterPerMinuteValue, METER_PER_MINUTE, HECTOMETER_PER_MINUTE);
        decimeterPerMinuteResultTest = convert(decimeterPerMinuteValue, DECIMETER_PER_MINUTE, HECTOMETER_PER_MINUTE);
        centimeterPerMinuteResultTest = convert(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE, HECTOMETER_PER_MINUTE);
        millimeterPerMinuteResultTest = convert(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE, HECTOMETER_PER_MINUTE);

        kilometerPerHourResultTest = convert(kilometerPerHourValue, KILOMETER_PER_HOUR, HECTOMETER_PER_MINUTE);
        hectometerPerHourResultTest = convert(hectometerPerHourValue, HECTOMETER_PER_HOUR, HECTOMETER_PER_MINUTE);
        decameterPerHourResultTest = convert(decameterPerHourValue, DECAMETER_PER_HOUR, HECTOMETER_PER_MINUTE);
        meterPerHourResultTest = convert(meterPerHourValue, METER_PER_HOUR, HECTOMETER_PER_MINUTE);
        decimeterPerHourResultTest = convert(decimeterPerHourValue, DECIMETER_PER_HOUR, HECTOMETER_PER_MINUTE);
        centimeterPerHourResultTest = convert(centimeterPerHourValue, CENTIMETER_PER_HOUR, HECTOMETER_PER_MINUTE);
        millimeterPerHourResultTest = convert(millimeterPerHourValue, MILLIMETER_PER_HOUR, HECTOMETER_PER_MINUTE);

        kilometerPerSecondResult = toHectometerPerMinute(kilometerPerSecondValue, KILOMETER_PER_SECOND);
        hectometerPerSecondResult = toHectometerPerMinute(hectometerPerSecondValue, HECTOMETER_PER_SECOND);
        decameterPerSecondResult = toHectometerPerMinute(decameterPerSecondValue, DECAMETER_PER_SECOND);
        meterPerSecondResult = toHectometerPerMinute(meterPerSecondValue, METER_PER_SECOND);
        decimeterPerSecondResult = toHectometerPerMinute(decimeterPerSecondValue, DECIMETER_PER_SECOND);
        centimeterPerSecondResult = toHectometerPerMinute(centimeterPerSecondValue, CENTIMETER_PER_SECOND);
        millimeterPerSecondResult = toHectometerPerMinute(millimeterPerSecondValue, MILLIMETER_PER_SECOND);

        kilometerPerMinuteResult = toHectometerPerMinute(kilometerPerMinuteValue, KILOMETER_PER_MINUTE);
        hectometerPerMinuteResult = toHectometerPerMinute(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE);
        decameterPerMinuteResult = toHectometerPerMinute(decameterPerMinuteValue, DECAMETER_PER_MINUTE);
        meterPerMinuteResult = toHectometerPerMinute(meterPerMinuteValue, METER_PER_MINUTE);
        decimeterPerMinuteResult = toHectometerPerMinute(decimeterPerMinuteValue, DECIMETER_PER_MINUTE);
        centimeterPerMinuteResult = toHectometerPerMinute(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE);
        millimeterPerMinuteResult = toHectometerPerMinute(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE);

        kilometerPerHourResult = toHectometerPerMinute(kilometerPerHourValue, KILOMETER_PER_HOUR);
        hectometerPerHourResult = toHectometerPerMinute(hectometerPerHourValue, HECTOMETER_PER_HOUR);
        decameterPerHourResult = toHectometerPerMinute(decameterPerHourValue, DECAMETER_PER_HOUR);
        meterPerHourResult = toHectometerPerMinute(meterPerHourValue, METER_PER_HOUR);
        decimeterPerHourResult = toHectometerPerMinute(decimeterPerHourValue, DECIMETER_PER_HOUR);
        centimeterPerHourResult = toHectometerPerMinute(centimeterPerHourValue, CENTIMETER_PER_HOUR);
        millimeterPerHourResult = toHectometerPerMinute(millimeterPerHourValue, MILLIMETER_PER_HOUR);

        assertEquals(kilometerPerSecondResult, kilometerPerSecondResultTest);
        assertEquals(hectometerPerSecondResult, hectometerPerSecondResultTest);
        assertEquals(decameterPerSecondResult, decameterPerSecondResultTest);
        assertEquals(meterPerSecondResult, meterPerSecondResultTest);
        assertEquals(decimeterPerSecondResult, decimeterPerSecondResultTest);
        assertEquals(centimeterPerSecondResult, centimeterPerSecondResultTest);
        assertEquals(millimeterPerSecondResult, millimeterPerSecondResultTest);

        assertEquals(kilometerPerMinuteResult, kilometerPerMinuteResultTest);
        assertEquals(hectometerPerMinuteResult, hectometerPerMinuteResultTest);
        assertEquals(decameterPerMinuteResult, decameterPerMinuteResultTest);
        assertEquals(meterPerMinuteResult, meterPerMinuteResultTest);
        assertEquals(decimeterPerMinuteResult, decimeterPerMinuteResultTest);
        assertEquals(centimeterPerMinuteResult, centimeterPerMinuteResultTest);
        assertEquals(millimeterPerMinuteResult, millimeterPerMinuteResultTest);

        assertEquals(kilometerPerHourResult, kilometerPerHourResultTest);
        assertEquals(hectometerPerHourResult, hectometerPerHourResultTest);
        assertEquals(decameterPerHourResult, decameterPerHourResultTest);
        assertEquals(meterPerHourResult, meterPerHourResultTest);
        assertEquals(decimeterPerHourResult, decimeterPerHourResultTest);
        assertEquals(centimeterPerHourResult, centimeterPerHourResultTest);
        assertEquals(millimeterPerHourResult, millimeterPerHourResultTest);
    }
	
	@Test
    public void toDecameterPerMinuteTest() {
        kilometerPerSecondResultTest = convert(kilometerPerSecondValue, KILOMETER_PER_SECOND, DECAMETER_PER_MINUTE);
        hectometerPerSecondResultTest = convert(hectometerPerSecondValue, HECTOMETER_PER_SECOND, DECAMETER_PER_MINUTE);
        decameterPerSecondResultTest = convert(decameterPerSecondValue, DECAMETER_PER_SECOND, DECAMETER_PER_MINUTE);
        meterPerSecondResultTest = convert(meterPerSecondValue, METER_PER_SECOND, DECAMETER_PER_MINUTE);
        decimeterPerSecondResultTest = convert(decimeterPerSecondValue, DECIMETER_PER_SECOND, DECAMETER_PER_MINUTE);
        centimeterPerSecondResultTest = convert(centimeterPerSecondValue, CENTIMETER_PER_SECOND, DECAMETER_PER_MINUTE);
        millimeterPerSecondResultTest = convert(millimeterPerSecondValue, MILLIMETER_PER_SECOND, DECAMETER_PER_MINUTE);

        kilometerPerMinuteResultTest = convert(kilometerPerMinuteValue, KILOMETER_PER_MINUTE, DECAMETER_PER_MINUTE);
        hectometerPerMinuteResultTest = convert(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE, DECAMETER_PER_MINUTE);
        decameterPerMinuteResultTest = convert(decameterPerMinuteValue, DECAMETER_PER_MINUTE, DECAMETER_PER_MINUTE);
        meterPerMinuteResultTest = convert(meterPerMinuteValue, METER_PER_MINUTE, DECAMETER_PER_MINUTE);
        decimeterPerMinuteResultTest = convert(decimeterPerMinuteValue, DECIMETER_PER_MINUTE, DECAMETER_PER_MINUTE);
        centimeterPerMinuteResultTest = convert(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE, DECAMETER_PER_MINUTE);
        millimeterPerMinuteResultTest = convert(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE, DECAMETER_PER_MINUTE);

        kilometerPerHourResultTest = convert(kilometerPerHourValue, KILOMETER_PER_HOUR, DECAMETER_PER_MINUTE);
        hectometerPerHourResultTest = convert(hectometerPerHourValue, HECTOMETER_PER_HOUR, DECAMETER_PER_MINUTE);
        decameterPerHourResultTest = convert(decameterPerHourValue, DECAMETER_PER_HOUR, DECAMETER_PER_MINUTE);
        meterPerHourResultTest = convert(meterPerHourValue, METER_PER_HOUR, DECAMETER_PER_MINUTE);
        decimeterPerHourResultTest = convert(decimeterPerHourValue, DECIMETER_PER_HOUR, DECAMETER_PER_MINUTE);
        centimeterPerHourResultTest = convert(centimeterPerHourValue, CENTIMETER_PER_HOUR, DECAMETER_PER_MINUTE);
        millimeterPerHourResultTest = convert(millimeterPerHourValue, MILLIMETER_PER_HOUR, DECAMETER_PER_MINUTE);

        kilometerPerSecondResult = toDecameterPerMinute(kilometerPerSecondValue, KILOMETER_PER_SECOND);
        hectometerPerSecondResult = toDecameterPerMinute(hectometerPerSecondValue, HECTOMETER_PER_SECOND);
        decameterPerSecondResult = toDecameterPerMinute(decameterPerSecondValue, DECAMETER_PER_SECOND);
        meterPerSecondResult = toDecameterPerMinute(meterPerSecondValue, METER_PER_SECOND);
        decimeterPerSecondResult = toDecameterPerMinute(decimeterPerSecondValue, DECIMETER_PER_SECOND);
        centimeterPerSecondResult = toDecameterPerMinute(centimeterPerSecondValue, CENTIMETER_PER_SECOND);
        millimeterPerSecondResult = toDecameterPerMinute(millimeterPerSecondValue, MILLIMETER_PER_SECOND);

        kilometerPerMinuteResult = toDecameterPerMinute(kilometerPerMinuteValue, KILOMETER_PER_MINUTE);
        hectometerPerMinuteResult = toDecameterPerMinute(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE);
        decameterPerMinuteResult = toDecameterPerMinute(decameterPerMinuteValue, DECAMETER_PER_MINUTE);
        meterPerMinuteResult = toDecameterPerMinute(meterPerMinuteValue, METER_PER_MINUTE);
        decimeterPerMinuteResult = toDecameterPerMinute(decimeterPerMinuteValue, DECIMETER_PER_MINUTE);
        centimeterPerMinuteResult = toDecameterPerMinute(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE);
        millimeterPerMinuteResult = toDecameterPerMinute(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE);

        kilometerPerHourResult = toDecameterPerMinute(kilometerPerHourValue, KILOMETER_PER_HOUR);
        hectometerPerHourResult = toDecameterPerMinute(hectometerPerHourValue, HECTOMETER_PER_HOUR);
        decameterPerHourResult = toDecameterPerMinute(decameterPerHourValue, DECAMETER_PER_HOUR);
        meterPerHourResult = toDecameterPerMinute(meterPerHourValue, METER_PER_HOUR);
        decimeterPerHourResult = toDecameterPerMinute(decimeterPerHourValue, DECIMETER_PER_HOUR);
        centimeterPerHourResult = toDecameterPerMinute(centimeterPerHourValue, CENTIMETER_PER_HOUR);
        millimeterPerHourResult = toDecameterPerMinute(millimeterPerHourValue, MILLIMETER_PER_HOUR);

        assertEquals(kilometerPerSecondResult, kilometerPerSecondResultTest);
        assertEquals(hectometerPerSecondResult, hectometerPerSecondResultTest);
        assertEquals(decameterPerSecondResult, decameterPerSecondResultTest);
        assertEquals(meterPerSecondResult, meterPerSecondResultTest);
        assertEquals(decimeterPerSecondResult, decimeterPerSecondResultTest);
        assertEquals(centimeterPerSecondResult, centimeterPerSecondResultTest);
        assertEquals(millimeterPerSecondResult, millimeterPerSecondResultTest);

        assertEquals(kilometerPerMinuteResult, kilometerPerMinuteResultTest);
        assertEquals(hectometerPerMinuteResult, hectometerPerMinuteResultTest);
        assertEquals(decameterPerMinuteResult, decameterPerMinuteResultTest);
        assertEquals(meterPerMinuteResult, meterPerMinuteResultTest);
        assertEquals(decimeterPerMinuteResult, decimeterPerMinuteResultTest);
        assertEquals(centimeterPerMinuteResult, centimeterPerMinuteResultTest);
        assertEquals(millimeterPerMinuteResult, millimeterPerMinuteResultTest);

        assertEquals(kilometerPerHourResult, kilometerPerHourResultTest);
        assertEquals(hectometerPerHourResult, hectometerPerHourResultTest);
        assertEquals(decameterPerHourResult, decameterPerHourResultTest);
        assertEquals(meterPerHourResult, meterPerHourResultTest);
        assertEquals(decimeterPerHourResult, decimeterPerHourResultTest);
        assertEquals(centimeterPerHourResult, centimeterPerHourResultTest);
        assertEquals(millimeterPerHourResult, millimeterPerHourResultTest);
    }
	
	@Test
    public void toMeterPerMinuteTest() {
        kilometerPerSecondResultTest = convert(kilometerPerSecondValue, KILOMETER_PER_SECOND, METER_PER_MINUTE);
        hectometerPerSecondResultTest = convert(hectometerPerSecondValue, HECTOMETER_PER_SECOND, METER_PER_MINUTE);
        decameterPerSecondResultTest = convert(decameterPerSecondValue, DECAMETER_PER_SECOND, METER_PER_MINUTE);
        meterPerSecondResultTest = convert(meterPerSecondValue, METER_PER_SECOND, METER_PER_MINUTE);
        decimeterPerSecondResultTest = convert(decimeterPerSecondValue, DECIMETER_PER_SECOND, METER_PER_MINUTE);
        centimeterPerSecondResultTest = convert(centimeterPerSecondValue, CENTIMETER_PER_SECOND, METER_PER_MINUTE);
        millimeterPerSecondResultTest = convert(millimeterPerSecondValue, MILLIMETER_PER_SECOND, METER_PER_MINUTE);

        kilometerPerMinuteResultTest = convert(kilometerPerMinuteValue, KILOMETER_PER_MINUTE, METER_PER_MINUTE);
        hectometerPerMinuteResultTest = convert(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE, METER_PER_MINUTE);
        decameterPerMinuteResultTest = convert(decameterPerMinuteValue, DECAMETER_PER_MINUTE, METER_PER_MINUTE);
        meterPerMinuteResultTest = convert(meterPerMinuteValue, METER_PER_MINUTE, METER_PER_MINUTE);
        decimeterPerMinuteResultTest = convert(decimeterPerMinuteValue, DECIMETER_PER_MINUTE, METER_PER_MINUTE);
        centimeterPerMinuteResultTest = convert(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE, METER_PER_MINUTE);
        millimeterPerMinuteResultTest = convert(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE, METER_PER_MINUTE);

        kilometerPerHourResultTest = convert(kilometerPerHourValue, KILOMETER_PER_HOUR, METER_PER_MINUTE);
        hectometerPerHourResultTest = convert(hectometerPerHourValue, HECTOMETER_PER_HOUR, METER_PER_MINUTE);
        decameterPerHourResultTest = convert(decameterPerHourValue, DECAMETER_PER_HOUR, METER_PER_MINUTE);
        meterPerHourResultTest = convert(meterPerHourValue, METER_PER_HOUR, METER_PER_MINUTE);
        decimeterPerHourResultTest = convert(decimeterPerHourValue, DECIMETER_PER_HOUR, METER_PER_MINUTE);
        centimeterPerHourResultTest = convert(centimeterPerHourValue, CENTIMETER_PER_HOUR, METER_PER_MINUTE);
        millimeterPerHourResultTest = convert(millimeterPerHourValue, MILLIMETER_PER_HOUR, METER_PER_MINUTE);

        kilometerPerSecondResult = toMeterPerMinute(kilometerPerSecondValue, KILOMETER_PER_SECOND);
        hectometerPerSecondResult = toMeterPerMinute(hectometerPerSecondValue, HECTOMETER_PER_SECOND);
        decameterPerSecondResult = toMeterPerMinute(decameterPerSecondValue, DECAMETER_PER_SECOND);
        meterPerSecondResult = toMeterPerMinute(meterPerSecondValue, METER_PER_SECOND);
        decimeterPerSecondResult = toMeterPerMinute(decimeterPerSecondValue, DECIMETER_PER_SECOND);
        centimeterPerSecondResult = toMeterPerMinute(centimeterPerSecondValue, CENTIMETER_PER_SECOND);
        millimeterPerSecondResult = toMeterPerMinute(millimeterPerSecondValue, MILLIMETER_PER_SECOND);

        kilometerPerMinuteResult = toMeterPerMinute(kilometerPerMinuteValue, KILOMETER_PER_MINUTE);
        hectometerPerMinuteResult = toMeterPerMinute(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE);
        decameterPerMinuteResult = toMeterPerMinute(decameterPerMinuteValue, DECAMETER_PER_MINUTE);
        meterPerMinuteResult = toMeterPerMinute(meterPerMinuteValue, METER_PER_MINUTE);
        decimeterPerMinuteResult = toMeterPerMinute(decimeterPerMinuteValue, DECIMETER_PER_MINUTE);
        centimeterPerMinuteResult = toMeterPerMinute(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE);
        millimeterPerMinuteResult = toMeterPerMinute(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE);

        kilometerPerHourResult = toMeterPerMinute(kilometerPerHourValue, KILOMETER_PER_HOUR);
        hectometerPerHourResult = toMeterPerMinute(hectometerPerHourValue, HECTOMETER_PER_HOUR);
        decameterPerHourResult = toMeterPerMinute(decameterPerHourValue, DECAMETER_PER_HOUR);
        meterPerHourResult = toMeterPerMinute(meterPerHourValue, METER_PER_HOUR);
        decimeterPerHourResult = toMeterPerMinute(decimeterPerHourValue, DECIMETER_PER_HOUR);
        centimeterPerHourResult = toMeterPerMinute(centimeterPerHourValue, CENTIMETER_PER_HOUR);
        millimeterPerHourResult = toMeterPerMinute(millimeterPerHourValue, MILLIMETER_PER_HOUR);

        assertEquals(kilometerPerSecondResult, kilometerPerSecondResultTest);
        assertEquals(hectometerPerSecondResult, hectometerPerSecondResultTest);
        assertEquals(decameterPerSecondResult, decameterPerSecondResultTest);
        assertEquals(meterPerSecondResult, meterPerSecondResultTest);
        assertEquals(decimeterPerSecondResult, decimeterPerSecondResultTest);
        assertEquals(centimeterPerSecondResult, centimeterPerSecondResultTest);
        assertEquals(millimeterPerSecondResult, millimeterPerSecondResultTest);

        assertEquals(kilometerPerMinuteResult, kilometerPerMinuteResultTest);
        assertEquals(hectometerPerMinuteResult, hectometerPerMinuteResultTest);
        assertEquals(decameterPerMinuteResult, decameterPerMinuteResultTest);
        assertEquals(meterPerMinuteResult, meterPerMinuteResultTest);
        assertEquals(decimeterPerMinuteResult, decimeterPerMinuteResultTest);
        assertEquals(centimeterPerMinuteResult, centimeterPerMinuteResultTest);
        assertEquals(millimeterPerMinuteResult, millimeterPerMinuteResultTest);

        assertEquals(kilometerPerHourResult, kilometerPerHourResultTest);
        assertEquals(hectometerPerHourResult, hectometerPerHourResultTest);
        assertEquals(decameterPerHourResult, decameterPerHourResultTest);
        assertEquals(meterPerHourResult, meterPerHourResultTest);
        assertEquals(decimeterPerHourResult, decimeterPerHourResultTest);
        assertEquals(centimeterPerHourResult, centimeterPerHourResultTest);
        assertEquals(millimeterPerHourResult, millimeterPerHourResultTest);
    }
	
	@Test
    public void toDecimeterPerMinuteTest() {
        kilometerPerSecondResultTest = convert(kilometerPerSecondValue, KILOMETER_PER_SECOND, DECIMETER_PER_MINUTE);
        hectometerPerSecondResultTest = convert(hectometerPerSecondValue, HECTOMETER_PER_SECOND, DECIMETER_PER_MINUTE);
        decameterPerSecondResultTest = convert(decameterPerSecondValue, DECAMETER_PER_SECOND, DECIMETER_PER_MINUTE);
        meterPerSecondResultTest = convert(meterPerSecondValue, METER_PER_SECOND, DECIMETER_PER_MINUTE);
        decimeterPerSecondResultTest = convert(decimeterPerSecondValue, DECIMETER_PER_SECOND, DECIMETER_PER_MINUTE);
        centimeterPerSecondResultTest = convert(centimeterPerSecondValue, CENTIMETER_PER_SECOND, DECIMETER_PER_MINUTE);
        millimeterPerSecondResultTest = convert(millimeterPerSecondValue, MILLIMETER_PER_SECOND, DECIMETER_PER_MINUTE);

        kilometerPerMinuteResultTest = convert(kilometerPerMinuteValue, KILOMETER_PER_MINUTE, DECIMETER_PER_MINUTE);
        hectometerPerMinuteResultTest = convert(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE, DECIMETER_PER_MINUTE);
        decameterPerMinuteResultTest = convert(decameterPerMinuteValue, DECAMETER_PER_MINUTE, DECIMETER_PER_MINUTE);
        meterPerMinuteResultTest = convert(meterPerMinuteValue, METER_PER_MINUTE, DECIMETER_PER_MINUTE);
        decimeterPerMinuteResultTest = convert(decimeterPerMinuteValue, DECIMETER_PER_MINUTE, DECIMETER_PER_MINUTE);
        centimeterPerMinuteResultTest = convert(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE, DECIMETER_PER_MINUTE);
        millimeterPerMinuteResultTest = convert(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE, DECIMETER_PER_MINUTE);

        kilometerPerHourResultTest = convert(kilometerPerHourValue, KILOMETER_PER_HOUR, DECIMETER_PER_MINUTE);
        hectometerPerHourResultTest = convert(hectometerPerHourValue, HECTOMETER_PER_HOUR, DECIMETER_PER_MINUTE);
        decameterPerHourResultTest = convert(decameterPerHourValue, DECAMETER_PER_HOUR, DECIMETER_PER_MINUTE);
        meterPerHourResultTest = convert(meterPerHourValue, METER_PER_HOUR, DECIMETER_PER_MINUTE);
        decimeterPerHourResultTest = convert(decimeterPerHourValue, DECIMETER_PER_HOUR, DECIMETER_PER_MINUTE);
        centimeterPerHourResultTest = convert(centimeterPerHourValue, CENTIMETER_PER_HOUR, DECIMETER_PER_MINUTE);
        millimeterPerHourResultTest = convert(millimeterPerHourValue, MILLIMETER_PER_HOUR, DECIMETER_PER_MINUTE);

        kilometerPerSecondResult = toDecimeterPerMinute(kilometerPerSecondValue, KILOMETER_PER_SECOND);
        hectometerPerSecondResult = toDecimeterPerMinute(hectometerPerSecondValue, HECTOMETER_PER_SECOND);
        decameterPerSecondResult = toDecimeterPerMinute(decameterPerSecondValue, DECAMETER_PER_SECOND);
        meterPerSecondResult = toDecimeterPerMinute(meterPerSecondValue, METER_PER_SECOND);
        decimeterPerSecondResult = toDecimeterPerMinute(decimeterPerSecondValue, DECIMETER_PER_SECOND);
        centimeterPerSecondResult = toDecimeterPerMinute(centimeterPerSecondValue, CENTIMETER_PER_SECOND);
        millimeterPerSecondResult = toDecimeterPerMinute(millimeterPerSecondValue, MILLIMETER_PER_SECOND);

        kilometerPerMinuteResult = toDecimeterPerMinute(kilometerPerMinuteValue, KILOMETER_PER_MINUTE);
        hectometerPerMinuteResult = toDecimeterPerMinute(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE);
        decameterPerMinuteResult = toDecimeterPerMinute(decameterPerMinuteValue, DECAMETER_PER_MINUTE);
        meterPerMinuteResult = toDecimeterPerMinute(meterPerMinuteValue, METER_PER_MINUTE);
        decimeterPerMinuteResult = toDecimeterPerMinute(decimeterPerMinuteValue, DECIMETER_PER_MINUTE);
        centimeterPerMinuteResult = toDecimeterPerMinute(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE);
        millimeterPerMinuteResult = toDecimeterPerMinute(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE);

        kilometerPerHourResult = toDecimeterPerMinute(kilometerPerHourValue, KILOMETER_PER_HOUR);
        hectometerPerHourResult = toDecimeterPerMinute(hectometerPerHourValue, HECTOMETER_PER_HOUR);
        decameterPerHourResult = toDecimeterPerMinute(decameterPerHourValue, DECAMETER_PER_HOUR);
        meterPerHourResult = toDecimeterPerMinute(meterPerHourValue, METER_PER_HOUR);
        decimeterPerHourResult = toDecimeterPerMinute(decimeterPerHourValue, DECIMETER_PER_HOUR);
        centimeterPerHourResult = toDecimeterPerMinute(centimeterPerHourValue, CENTIMETER_PER_HOUR);
        millimeterPerHourResult = toDecimeterPerMinute(millimeterPerHourValue, MILLIMETER_PER_HOUR);

        assertEquals(kilometerPerSecondResult, kilometerPerSecondResultTest);
        assertEquals(hectometerPerSecondResult, hectometerPerSecondResultTest);
        assertEquals(decameterPerSecondResult, decameterPerSecondResultTest);
        assertEquals(meterPerSecondResult, meterPerSecondResultTest);
        assertEquals(decimeterPerSecondResult, decimeterPerSecondResultTest);
        assertEquals(centimeterPerSecondResult, centimeterPerSecondResultTest);
        assertEquals(millimeterPerSecondResult, millimeterPerSecondResultTest);

        assertEquals(kilometerPerMinuteResult, kilometerPerMinuteResultTest);
        assertEquals(hectometerPerMinuteResult, hectometerPerMinuteResultTest);
        assertEquals(decameterPerMinuteResult, decameterPerMinuteResultTest);
        assertEquals(meterPerMinuteResult, meterPerMinuteResultTest);
        assertEquals(decimeterPerMinuteResult, decimeterPerMinuteResultTest);
        assertEquals(centimeterPerMinuteResult, centimeterPerMinuteResultTest);
        assertEquals(millimeterPerMinuteResult, millimeterPerMinuteResultTest);

        assertEquals(kilometerPerHourResult, kilometerPerHourResultTest);
        assertEquals(hectometerPerHourResult, hectometerPerHourResultTest);
        assertEquals(decameterPerHourResult, decameterPerHourResultTest);
        assertEquals(meterPerHourResult, meterPerHourResultTest);
        assertEquals(decimeterPerHourResult, decimeterPerHourResultTest);
        assertEquals(centimeterPerHourResult, centimeterPerHourResultTest);
        assertEquals(millimeterPerHourResult, millimeterPerHourResultTest);
    }
	
	@Test
    public void toCentimeterPerMinuteTest() {
        kilometerPerSecondResultTest = convert(kilometerPerSecondValue, KILOMETER_PER_SECOND, CENTIMETER_PER_MINUTE);
        hectometerPerSecondResultTest = convert(hectometerPerSecondValue, HECTOMETER_PER_SECOND, CENTIMETER_PER_MINUTE);
        decameterPerSecondResultTest = convert(decameterPerSecondValue, DECAMETER_PER_SECOND, CENTIMETER_PER_MINUTE);
        meterPerSecondResultTest = convert(meterPerSecondValue, METER_PER_SECOND, CENTIMETER_PER_MINUTE);
        decimeterPerSecondResultTest = convert(decimeterPerSecondValue, DECIMETER_PER_SECOND, CENTIMETER_PER_MINUTE);
        centimeterPerSecondResultTest = convert(centimeterPerSecondValue, CENTIMETER_PER_SECOND, CENTIMETER_PER_MINUTE);
        millimeterPerSecondResultTest = convert(millimeterPerSecondValue, MILLIMETER_PER_SECOND, CENTIMETER_PER_MINUTE);

        kilometerPerMinuteResultTest = convert(kilometerPerMinuteValue, KILOMETER_PER_MINUTE, CENTIMETER_PER_MINUTE);
        hectometerPerMinuteResultTest = convert(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE, CENTIMETER_PER_MINUTE);
        decameterPerMinuteResultTest = convert(decameterPerMinuteValue, DECAMETER_PER_MINUTE, CENTIMETER_PER_MINUTE);
        meterPerMinuteResultTest = convert(meterPerMinuteValue, METER_PER_MINUTE, CENTIMETER_PER_MINUTE);
        decimeterPerMinuteResultTest = convert(decimeterPerMinuteValue, DECIMETER_PER_MINUTE, CENTIMETER_PER_MINUTE);
        centimeterPerMinuteResultTest = convert(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE, CENTIMETER_PER_MINUTE);
        millimeterPerMinuteResultTest = convert(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE, CENTIMETER_PER_MINUTE);

        kilometerPerHourResultTest = convert(kilometerPerHourValue, KILOMETER_PER_HOUR, CENTIMETER_PER_MINUTE);
        hectometerPerHourResultTest = convert(hectometerPerHourValue, HECTOMETER_PER_HOUR, CENTIMETER_PER_MINUTE);
        decameterPerHourResultTest = convert(decameterPerHourValue, DECAMETER_PER_HOUR, CENTIMETER_PER_MINUTE);
        meterPerHourResultTest = convert(meterPerHourValue, METER_PER_HOUR, CENTIMETER_PER_MINUTE);
        decimeterPerHourResultTest = convert(decimeterPerHourValue, DECIMETER_PER_HOUR, CENTIMETER_PER_MINUTE);
        centimeterPerHourResultTest = convert(centimeterPerHourValue, CENTIMETER_PER_HOUR, CENTIMETER_PER_MINUTE);
        millimeterPerHourResultTest = convert(millimeterPerHourValue, MILLIMETER_PER_HOUR, CENTIMETER_PER_MINUTE);

        kilometerPerSecondResult = toCentimeterPerMinute(kilometerPerSecondValue, KILOMETER_PER_SECOND);
        hectometerPerSecondResult = toCentimeterPerMinute(hectometerPerSecondValue, HECTOMETER_PER_SECOND);
        decameterPerSecondResult = toCentimeterPerMinute(decameterPerSecondValue, DECAMETER_PER_SECOND);
        meterPerSecondResult = toCentimeterPerMinute(meterPerSecondValue, METER_PER_SECOND);
        decimeterPerSecondResult = toCentimeterPerMinute(decimeterPerSecondValue, DECIMETER_PER_SECOND);
        centimeterPerSecondResult = toCentimeterPerMinute(centimeterPerSecondValue, CENTIMETER_PER_SECOND);
        millimeterPerSecondResult = toCentimeterPerMinute(millimeterPerSecondValue, MILLIMETER_PER_SECOND);

        kilometerPerMinuteResult = toCentimeterPerMinute(kilometerPerMinuteValue, KILOMETER_PER_MINUTE);
        hectometerPerMinuteResult = toCentimeterPerMinute(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE);
        decameterPerMinuteResult = toCentimeterPerMinute(decameterPerMinuteValue, DECAMETER_PER_MINUTE);
        meterPerMinuteResult = toCentimeterPerMinute(meterPerMinuteValue, METER_PER_MINUTE);
        decimeterPerMinuteResult = toCentimeterPerMinute(decimeterPerMinuteValue, DECIMETER_PER_MINUTE);
        centimeterPerMinuteResult = toCentimeterPerMinute(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE);
        millimeterPerMinuteResult = toCentimeterPerMinute(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE);

        kilometerPerHourResult = toCentimeterPerMinute(kilometerPerHourValue, KILOMETER_PER_HOUR);
        hectometerPerHourResult = toCentimeterPerMinute(hectometerPerHourValue, HECTOMETER_PER_HOUR);
        decameterPerHourResult = toCentimeterPerMinute(decameterPerHourValue, DECAMETER_PER_HOUR);
        meterPerHourResult = toCentimeterPerMinute(meterPerHourValue, METER_PER_HOUR);
        decimeterPerHourResult = toCentimeterPerMinute(decimeterPerHourValue, DECIMETER_PER_HOUR);
        centimeterPerHourResult = toCentimeterPerMinute(centimeterPerHourValue, CENTIMETER_PER_HOUR);
        millimeterPerHourResult = toCentimeterPerMinute(millimeterPerHourValue, MILLIMETER_PER_HOUR);

        assertEquals(kilometerPerSecondResult, kilometerPerSecondResultTest);
        assertEquals(hectometerPerSecondResult, hectometerPerSecondResultTest);
        assertEquals(decameterPerSecondResult, decameterPerSecondResultTest);
        assertEquals(meterPerSecondResult, meterPerSecondResultTest);
        assertEquals(decimeterPerSecondResult, decimeterPerSecondResultTest);
        assertEquals(centimeterPerSecondResult, centimeterPerSecondResultTest);
        assertEquals(millimeterPerSecondResult, millimeterPerSecondResultTest);

        assertEquals(kilometerPerMinuteResult, kilometerPerMinuteResultTest);
        assertEquals(hectometerPerMinuteResult, hectometerPerMinuteResultTest);
        assertEquals(decameterPerMinuteResult, decameterPerMinuteResultTest);
        assertEquals(meterPerMinuteResult, meterPerMinuteResultTest);
        assertEquals(decimeterPerMinuteResult, decimeterPerMinuteResultTest);
        assertEquals(centimeterPerMinuteResult, centimeterPerMinuteResultTest);
        assertEquals(millimeterPerMinuteResult, millimeterPerMinuteResultTest);

        assertEquals(kilometerPerHourResult, kilometerPerHourResultTest);
        assertEquals(hectometerPerHourResult, hectometerPerHourResultTest);
        assertEquals(decameterPerHourResult, decameterPerHourResultTest);
        assertEquals(meterPerHourResult, meterPerHourResultTest);
        assertEquals(decimeterPerHourResult, decimeterPerHourResultTest);
        assertEquals(centimeterPerHourResult, centimeterPerHourResultTest);
        assertEquals(millimeterPerHourResult, millimeterPerHourResultTest);
    }
	
	@Test
    public void toMillimeterPerMinuteTest() {
        kilometerPerSecondResultTest = convert(kilometerPerSecondValue, KILOMETER_PER_SECOND, MILLIMETER_PER_MINUTE);
        hectometerPerSecondResultTest = convert(hectometerPerSecondValue, HECTOMETER_PER_SECOND, MILLIMETER_PER_MINUTE);
        decameterPerSecondResultTest = convert(decameterPerSecondValue, DECAMETER_PER_SECOND, MILLIMETER_PER_MINUTE);
        meterPerSecondResultTest = convert(meterPerSecondValue, METER_PER_SECOND, MILLIMETER_PER_MINUTE);
        decimeterPerSecondResultTest = convert(decimeterPerSecondValue, DECIMETER_PER_SECOND, MILLIMETER_PER_MINUTE);
        centimeterPerSecondResultTest = convert(centimeterPerSecondValue, CENTIMETER_PER_SECOND, MILLIMETER_PER_MINUTE);
        millimeterPerSecondResultTest = convert(millimeterPerSecondValue, MILLIMETER_PER_SECOND, MILLIMETER_PER_MINUTE);

        kilometerPerMinuteResultTest = convert(kilometerPerMinuteValue, KILOMETER_PER_MINUTE, MILLIMETER_PER_MINUTE);
        hectometerPerMinuteResultTest = convert(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE, MILLIMETER_PER_MINUTE);
        decameterPerMinuteResultTest = convert(decameterPerMinuteValue, DECAMETER_PER_MINUTE, MILLIMETER_PER_MINUTE);
        meterPerMinuteResultTest = convert(meterPerMinuteValue, METER_PER_MINUTE, MILLIMETER_PER_MINUTE);
        decimeterPerMinuteResultTest = convert(decimeterPerMinuteValue, DECIMETER_PER_MINUTE, MILLIMETER_PER_MINUTE);
        centimeterPerMinuteResultTest = convert(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE, MILLIMETER_PER_MINUTE);
        millimeterPerMinuteResultTest = convert(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE, MILLIMETER_PER_MINUTE);

        kilometerPerHourResultTest = convert(kilometerPerHourValue, KILOMETER_PER_HOUR, MILLIMETER_PER_MINUTE);
        hectometerPerHourResultTest = convert(hectometerPerHourValue, HECTOMETER_PER_HOUR, MILLIMETER_PER_MINUTE);
        decameterPerHourResultTest = convert(decameterPerHourValue, DECAMETER_PER_HOUR, MILLIMETER_PER_MINUTE);
        meterPerHourResultTest = convert(meterPerHourValue, METER_PER_HOUR, MILLIMETER_PER_MINUTE);
        decimeterPerHourResultTest = convert(decimeterPerHourValue, DECIMETER_PER_HOUR, MILLIMETER_PER_MINUTE);
        centimeterPerHourResultTest = convert(centimeterPerHourValue, CENTIMETER_PER_HOUR, MILLIMETER_PER_MINUTE);
        millimeterPerHourResultTest = convert(millimeterPerHourValue, MILLIMETER_PER_HOUR, MILLIMETER_PER_MINUTE);

        kilometerPerSecondResult = toMillimeterPerMinute(kilometerPerSecondValue, KILOMETER_PER_SECOND);
        hectometerPerSecondResult = toMillimeterPerMinute(hectometerPerSecondValue, HECTOMETER_PER_SECOND);
        decameterPerSecondResult = toMillimeterPerMinute(decameterPerSecondValue, DECAMETER_PER_SECOND);
        meterPerSecondResult = toMillimeterPerMinute(meterPerSecondValue, METER_PER_SECOND);
        decimeterPerSecondResult = toMillimeterPerMinute(decimeterPerSecondValue, DECIMETER_PER_SECOND);
        centimeterPerSecondResult = toMillimeterPerMinute(centimeterPerSecondValue, CENTIMETER_PER_SECOND);
        millimeterPerSecondResult = toMillimeterPerMinute(millimeterPerSecondValue, MILLIMETER_PER_SECOND);

        kilometerPerMinuteResult = toMillimeterPerMinute(kilometerPerMinuteValue, KILOMETER_PER_MINUTE);
        hectometerPerMinuteResult = toMillimeterPerMinute(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE);
        decameterPerMinuteResult = toMillimeterPerMinute(decameterPerMinuteValue, DECAMETER_PER_MINUTE);
        meterPerMinuteResult = toMillimeterPerMinute(meterPerMinuteValue, METER_PER_MINUTE);
        decimeterPerMinuteResult = toMillimeterPerMinute(decimeterPerMinuteValue, DECIMETER_PER_MINUTE);
        centimeterPerMinuteResult = toMillimeterPerMinute(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE);
        millimeterPerMinuteResult = toMillimeterPerMinute(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE);

        kilometerPerHourResult = toMillimeterPerMinute(kilometerPerHourValue, KILOMETER_PER_HOUR);
        hectometerPerHourResult = toMillimeterPerMinute(hectometerPerHourValue, HECTOMETER_PER_HOUR);
        decameterPerHourResult = toMillimeterPerMinute(decameterPerHourValue, DECAMETER_PER_HOUR);
        meterPerHourResult = toMillimeterPerMinute(meterPerHourValue, METER_PER_HOUR);
        decimeterPerHourResult = toMillimeterPerMinute(decimeterPerHourValue, DECIMETER_PER_HOUR);
        centimeterPerHourResult = toMillimeterPerMinute(centimeterPerHourValue, CENTIMETER_PER_HOUR);
        millimeterPerHourResult = toMillimeterPerMinute(millimeterPerHourValue, MILLIMETER_PER_HOUR);

        assertEquals(kilometerPerSecondResult, kilometerPerSecondResultTest);
        assertEquals(hectometerPerSecondResult, hectometerPerSecondResultTest);
        assertEquals(decameterPerSecondResult, decameterPerSecondResultTest);
        assertEquals(meterPerSecondResult, meterPerSecondResultTest);
        assertEquals(decimeterPerSecondResult, decimeterPerSecondResultTest);
        assertEquals(centimeterPerSecondResult, centimeterPerSecondResultTest);
        assertEquals(millimeterPerSecondResult, millimeterPerSecondResultTest);

        assertEquals(kilometerPerMinuteResult, kilometerPerMinuteResultTest);
        assertEquals(hectometerPerMinuteResult, hectometerPerMinuteResultTest);
        assertEquals(decameterPerMinuteResult, decameterPerMinuteResultTest);
        assertEquals(meterPerMinuteResult, meterPerMinuteResultTest);
        assertEquals(decimeterPerMinuteResult, decimeterPerMinuteResultTest);
        assertEquals(centimeterPerMinuteResult, centimeterPerMinuteResultTest);
        assertEquals(millimeterPerMinuteResult, millimeterPerMinuteResultTest);

        assertEquals(kilometerPerHourResult, kilometerPerHourResultTest);
        assertEquals(hectometerPerHourResult, hectometerPerHourResultTest);
        assertEquals(decameterPerHourResult, decameterPerHourResultTest);
        assertEquals(meterPerHourResult, meterPerHourResultTest);
        assertEquals(decimeterPerHourResult, decimeterPerHourResultTest);
        assertEquals(centimeterPerHourResult, centimeterPerHourResultTest);
        assertEquals(millimeterPerHourResult, millimeterPerHourResultTest);
    }
	
	@Test
    public void toKilometerPerHourTest() {
        kilometerPerSecondResultTest = convert(kilometerPerSecondValue, KILOMETER_PER_SECOND, KILOMETER_PER_HOUR);
        hectometerPerSecondResultTest = convert(hectometerPerSecondValue, HECTOMETER_PER_SECOND, KILOMETER_PER_HOUR);
        decameterPerSecondResultTest = convert(decameterPerSecondValue, DECAMETER_PER_SECOND, KILOMETER_PER_HOUR);
        meterPerSecondResultTest = convert(meterPerSecondValue, METER_PER_SECOND, KILOMETER_PER_HOUR);
        decimeterPerSecondResultTest = convert(decimeterPerSecondValue, DECIMETER_PER_SECOND, KILOMETER_PER_HOUR);
        centimeterPerSecondResultTest = convert(centimeterPerSecondValue, CENTIMETER_PER_SECOND, KILOMETER_PER_HOUR);
        millimeterPerSecondResultTest = convert(millimeterPerSecondValue, MILLIMETER_PER_SECOND, KILOMETER_PER_HOUR);

        kilometerPerMinuteResultTest = convert(kilometerPerMinuteValue, KILOMETER_PER_MINUTE, KILOMETER_PER_HOUR);
        hectometerPerMinuteResultTest = convert(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE, KILOMETER_PER_HOUR);
        decameterPerMinuteResultTest = convert(decameterPerMinuteValue, DECAMETER_PER_MINUTE, KILOMETER_PER_HOUR);
        meterPerMinuteResultTest = convert(meterPerMinuteValue, METER_PER_MINUTE, KILOMETER_PER_HOUR);
        decimeterPerMinuteResultTest = convert(decimeterPerMinuteValue, DECIMETER_PER_MINUTE, KILOMETER_PER_HOUR);
        centimeterPerMinuteResultTest = convert(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE, KILOMETER_PER_HOUR);
        millimeterPerMinuteResultTest = convert(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE, KILOMETER_PER_HOUR);

        kilometerPerHourResultTest = convert(kilometerPerHourValue, KILOMETER_PER_HOUR, KILOMETER_PER_HOUR);
        hectometerPerHourResultTest = convert(hectometerPerHourValue, HECTOMETER_PER_HOUR, KILOMETER_PER_HOUR);
        decameterPerHourResultTest = convert(decameterPerHourValue, DECAMETER_PER_HOUR, KILOMETER_PER_HOUR);
        meterPerHourResultTest = convert(meterPerHourValue, METER_PER_HOUR, KILOMETER_PER_HOUR);
        decimeterPerHourResultTest = convert(decimeterPerHourValue, DECIMETER_PER_HOUR, KILOMETER_PER_HOUR);
        centimeterPerHourResultTest = convert(centimeterPerHourValue, CENTIMETER_PER_HOUR, KILOMETER_PER_HOUR);
        millimeterPerHourResultTest = convert(millimeterPerHourValue, MILLIMETER_PER_HOUR, KILOMETER_PER_HOUR);

        kilometerPerSecondResult = toKilometerPerHour(kilometerPerSecondValue, KILOMETER_PER_SECOND);
        hectometerPerSecondResult = toKilometerPerHour(hectometerPerSecondValue, HECTOMETER_PER_SECOND);
        decameterPerSecondResult = toKilometerPerHour(decameterPerSecondValue, DECAMETER_PER_SECOND);
        meterPerSecondResult = toKilometerPerHour(meterPerSecondValue, METER_PER_SECOND);
        decimeterPerSecondResult = toKilometerPerHour(decimeterPerSecondValue, DECIMETER_PER_SECOND);
        centimeterPerSecondResult = toKilometerPerHour(centimeterPerSecondValue, CENTIMETER_PER_SECOND);
        millimeterPerSecondResult = toKilometerPerHour(millimeterPerSecondValue, MILLIMETER_PER_SECOND);

        kilometerPerMinuteResult = toKilometerPerHour(kilometerPerMinuteValue, KILOMETER_PER_MINUTE);
        hectometerPerMinuteResult = toKilometerPerHour(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE);
        decameterPerMinuteResult = toKilometerPerHour(decameterPerMinuteValue, DECAMETER_PER_MINUTE);
        meterPerMinuteResult = toKilometerPerHour(meterPerMinuteValue, METER_PER_MINUTE);
        decimeterPerMinuteResult = toKilometerPerHour(decimeterPerMinuteValue, DECIMETER_PER_MINUTE);
        centimeterPerMinuteResult = toKilometerPerHour(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE);
        millimeterPerMinuteResult = toKilometerPerHour(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE);

        kilometerPerHourResult = toKilometerPerHour(kilometerPerHourValue, KILOMETER_PER_HOUR);
        hectometerPerHourResult = toKilometerPerHour(hectometerPerHourValue, HECTOMETER_PER_HOUR);
        decameterPerHourResult = toKilometerPerHour(decameterPerHourValue, DECAMETER_PER_HOUR);
        meterPerHourResult = toKilometerPerHour(meterPerHourValue, METER_PER_HOUR);
        decimeterPerHourResult = toKilometerPerHour(decimeterPerHourValue, DECIMETER_PER_HOUR);
        centimeterPerHourResult = toKilometerPerHour(centimeterPerHourValue, CENTIMETER_PER_HOUR);
        millimeterPerHourResult = toKilometerPerHour(millimeterPerHourValue, MILLIMETER_PER_HOUR);

        assertEquals(kilometerPerSecondResult, kilometerPerSecondResultTest);
        assertEquals(hectometerPerSecondResult, hectometerPerSecondResultTest);
        assertEquals(decameterPerSecondResult, decameterPerSecondResultTest);
        assertEquals(meterPerSecondResult, meterPerSecondResultTest);
        assertEquals(decimeterPerSecondResult, decimeterPerSecondResultTest);
        assertEquals(centimeterPerSecondResult, centimeterPerSecondResultTest);
        assertEquals(millimeterPerSecondResult, millimeterPerSecondResultTest);

        assertEquals(kilometerPerMinuteResult, kilometerPerMinuteResultTest);
        assertEquals(hectometerPerMinuteResult, hectometerPerMinuteResultTest);
        assertEquals(decameterPerMinuteResult, decameterPerMinuteResultTest);
        assertEquals(meterPerMinuteResult, meterPerMinuteResultTest);
        assertEquals(decimeterPerMinuteResult, decimeterPerMinuteResultTest);
        assertEquals(centimeterPerMinuteResult, centimeterPerMinuteResultTest);
        assertEquals(millimeterPerMinuteResult, millimeterPerMinuteResultTest);

        assertEquals(kilometerPerHourResult, kilometerPerHourResultTest);
        assertEquals(hectometerPerHourResult, hectometerPerHourResultTest);
        assertEquals(decameterPerHourResult, decameterPerHourResultTest);
        assertEquals(meterPerHourResult, meterPerHourResultTest);
        assertEquals(decimeterPerHourResult, decimeterPerHourResultTest);
        assertEquals(centimeterPerHourResult, centimeterPerHourResultTest);
        assertEquals(millimeterPerHourResult, millimeterPerHourResultTest);
    }
	
	@Test
    public void toHectometerPerHourTest() {
        kilometerPerSecondResultTest = convert(kilometerPerSecondValue, KILOMETER_PER_SECOND, HECTOMETER_PER_HOUR);
        hectometerPerSecondResultTest = convert(hectometerPerSecondValue, HECTOMETER_PER_SECOND, HECTOMETER_PER_HOUR);
        decameterPerSecondResultTest = convert(decameterPerSecondValue, DECAMETER_PER_SECOND, HECTOMETER_PER_HOUR);
        meterPerSecondResultTest = convert(meterPerSecondValue, METER_PER_SECOND, HECTOMETER_PER_HOUR);
        decimeterPerSecondResultTest = convert(decimeterPerSecondValue, DECIMETER_PER_SECOND, HECTOMETER_PER_HOUR);
        centimeterPerSecondResultTest = convert(centimeterPerSecondValue, CENTIMETER_PER_SECOND, HECTOMETER_PER_HOUR);
        millimeterPerSecondResultTest = convert(millimeterPerSecondValue, MILLIMETER_PER_SECOND, HECTOMETER_PER_HOUR);

        kilometerPerMinuteResultTest = convert(kilometerPerMinuteValue, KILOMETER_PER_MINUTE, HECTOMETER_PER_HOUR);
        hectometerPerMinuteResultTest = convert(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE, HECTOMETER_PER_HOUR);
        decameterPerMinuteResultTest = convert(decameterPerMinuteValue, DECAMETER_PER_MINUTE, HECTOMETER_PER_HOUR);
        meterPerMinuteResultTest = convert(meterPerMinuteValue, METER_PER_MINUTE, HECTOMETER_PER_HOUR);
        decimeterPerMinuteResultTest = convert(decimeterPerMinuteValue, DECIMETER_PER_MINUTE, HECTOMETER_PER_HOUR);
        centimeterPerMinuteResultTest = convert(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE, HECTOMETER_PER_HOUR);
        millimeterPerMinuteResultTest = convert(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE, HECTOMETER_PER_HOUR);

        kilometerPerHourResultTest = convert(kilometerPerHourValue, KILOMETER_PER_HOUR, HECTOMETER_PER_HOUR);
        hectometerPerHourResultTest = convert(hectometerPerHourValue, HECTOMETER_PER_HOUR, HECTOMETER_PER_HOUR);
        decameterPerHourResultTest = convert(decameterPerHourValue, DECAMETER_PER_HOUR, HECTOMETER_PER_HOUR);
        meterPerHourResultTest = convert(meterPerHourValue, METER_PER_HOUR, HECTOMETER_PER_HOUR);
        decimeterPerHourResultTest = convert(decimeterPerHourValue, DECIMETER_PER_HOUR, HECTOMETER_PER_HOUR);
        centimeterPerHourResultTest = convert(centimeterPerHourValue, CENTIMETER_PER_HOUR, HECTOMETER_PER_HOUR);
        millimeterPerHourResultTest = convert(millimeterPerHourValue, MILLIMETER_PER_HOUR, HECTOMETER_PER_HOUR);

        kilometerPerSecondResult = toHectometerPerHour(kilometerPerSecondValue, KILOMETER_PER_SECOND);
        hectometerPerSecondResult = toHectometerPerHour(hectometerPerSecondValue, HECTOMETER_PER_SECOND);
        decameterPerSecondResult = toHectometerPerHour(decameterPerSecondValue, DECAMETER_PER_SECOND);
        meterPerSecondResult = toHectometerPerHour(meterPerSecondValue, METER_PER_SECOND);
        decimeterPerSecondResult = toHectometerPerHour(decimeterPerSecondValue, DECIMETER_PER_SECOND);
        centimeterPerSecondResult = toHectometerPerHour(centimeterPerSecondValue, CENTIMETER_PER_SECOND);
        millimeterPerSecondResult = toHectometerPerHour(millimeterPerSecondValue, MILLIMETER_PER_SECOND);

        kilometerPerMinuteResult = toHectometerPerHour(kilometerPerMinuteValue, KILOMETER_PER_MINUTE);
        hectometerPerMinuteResult = toHectometerPerHour(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE);
        decameterPerMinuteResult = toHectometerPerHour(decameterPerMinuteValue, DECAMETER_PER_MINUTE);
        meterPerMinuteResult = toHectometerPerHour(meterPerMinuteValue, METER_PER_MINUTE);
        decimeterPerMinuteResult = toHectometerPerHour(decimeterPerMinuteValue, DECIMETER_PER_MINUTE);
        centimeterPerMinuteResult = toHectometerPerHour(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE);
        millimeterPerMinuteResult = toHectometerPerHour(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE);

        kilometerPerHourResult = toHectometerPerHour(kilometerPerHourValue, KILOMETER_PER_HOUR);
        hectometerPerHourResult = toHectometerPerHour(hectometerPerHourValue, HECTOMETER_PER_HOUR);
        decameterPerHourResult = toHectometerPerHour(decameterPerHourValue, DECAMETER_PER_HOUR);
        meterPerHourResult = toHectometerPerHour(meterPerHourValue, METER_PER_HOUR);
        decimeterPerHourResult = toHectometerPerHour(decimeterPerHourValue, DECIMETER_PER_HOUR);
        centimeterPerHourResult = toHectometerPerHour(centimeterPerHourValue, CENTIMETER_PER_HOUR);
        millimeterPerHourResult = toHectometerPerHour(millimeterPerHourValue, MILLIMETER_PER_HOUR);

        assertEquals(kilometerPerSecondResult, kilometerPerSecondResultTest);
        assertEquals(hectometerPerSecondResult, hectometerPerSecondResultTest);
        assertEquals(decameterPerSecondResult, decameterPerSecondResultTest);
        assertEquals(meterPerSecondResult, meterPerSecondResultTest);
        assertEquals(decimeterPerSecondResult, decimeterPerSecondResultTest);
        assertEquals(centimeterPerSecondResult, centimeterPerSecondResultTest);
        assertEquals(millimeterPerSecondResult, millimeterPerSecondResultTest);

        assertEquals(kilometerPerMinuteResult, kilometerPerMinuteResultTest);
        assertEquals(hectometerPerMinuteResult, hectometerPerMinuteResultTest);
        assertEquals(decameterPerMinuteResult, decameterPerMinuteResultTest);
        assertEquals(meterPerMinuteResult, meterPerMinuteResultTest);
        assertEquals(decimeterPerMinuteResult, decimeterPerMinuteResultTest);
        assertEquals(centimeterPerMinuteResult, centimeterPerMinuteResultTest);
        assertEquals(millimeterPerMinuteResult, millimeterPerMinuteResultTest);

        assertEquals(kilometerPerHourResult, kilometerPerHourResultTest);
        assertEquals(hectometerPerHourResult, hectometerPerHourResultTest);
        assertEquals(decameterPerHourResult, decameterPerHourResultTest);
        assertEquals(meterPerHourResult, meterPerHourResultTest);
        assertEquals(decimeterPerHourResult, decimeterPerHourResultTest);
        assertEquals(centimeterPerHourResult, centimeterPerHourResultTest);
        assertEquals(millimeterPerHourResult, millimeterPerHourResultTest);
    }
	
	@Test
    public void toDecameterPerHourTest() {
        kilometerPerSecondResultTest = convert(kilometerPerSecondValue, KILOMETER_PER_SECOND, DECAMETER_PER_HOUR);
        hectometerPerSecondResultTest = convert(hectometerPerSecondValue, HECTOMETER_PER_SECOND, DECAMETER_PER_HOUR);
        decameterPerSecondResultTest = convert(decameterPerSecondValue, DECAMETER_PER_SECOND, DECAMETER_PER_HOUR);
        meterPerSecondResultTest = convert(meterPerSecondValue, METER_PER_SECOND, DECAMETER_PER_HOUR);
        decimeterPerSecondResultTest = convert(decimeterPerSecondValue, DECIMETER_PER_SECOND, DECAMETER_PER_HOUR);
        centimeterPerSecondResultTest = convert(centimeterPerSecondValue, CENTIMETER_PER_SECOND, DECAMETER_PER_HOUR);
        millimeterPerSecondResultTest = convert(millimeterPerSecondValue, MILLIMETER_PER_SECOND, DECAMETER_PER_HOUR);

        kilometerPerMinuteResultTest = convert(kilometerPerMinuteValue, KILOMETER_PER_MINUTE, DECAMETER_PER_HOUR);
        hectometerPerMinuteResultTest = convert(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE, DECAMETER_PER_HOUR);
        decameterPerMinuteResultTest = convert(decameterPerMinuteValue, DECAMETER_PER_MINUTE, DECAMETER_PER_HOUR);
        meterPerMinuteResultTest = convert(meterPerMinuteValue, METER_PER_MINUTE, DECAMETER_PER_HOUR);
        decimeterPerMinuteResultTest = convert(decimeterPerMinuteValue, DECIMETER_PER_MINUTE, DECAMETER_PER_HOUR);
        centimeterPerMinuteResultTest = convert(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE, DECAMETER_PER_HOUR);
        millimeterPerMinuteResultTest = convert(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE, DECAMETER_PER_HOUR);

        kilometerPerHourResultTest = convert(kilometerPerHourValue, KILOMETER_PER_HOUR, DECAMETER_PER_HOUR);
        hectometerPerHourResultTest = convert(hectometerPerHourValue, HECTOMETER_PER_HOUR, DECAMETER_PER_HOUR);
        decameterPerHourResultTest = convert(decameterPerHourValue, DECAMETER_PER_HOUR, DECAMETER_PER_HOUR);
        meterPerHourResultTest = convert(meterPerHourValue, METER_PER_HOUR, DECAMETER_PER_HOUR);
        decimeterPerHourResultTest = convert(decimeterPerHourValue, DECIMETER_PER_HOUR, DECAMETER_PER_HOUR);
        centimeterPerHourResultTest = convert(centimeterPerHourValue, CENTIMETER_PER_HOUR, DECAMETER_PER_HOUR);
        millimeterPerHourResultTest = convert(millimeterPerHourValue, MILLIMETER_PER_HOUR, DECAMETER_PER_HOUR);

        kilometerPerSecondResult = toDecameterPerHour(kilometerPerSecondValue, KILOMETER_PER_SECOND);
        hectometerPerSecondResult = toDecameterPerHour(hectometerPerSecondValue, HECTOMETER_PER_SECOND);
        decameterPerSecondResult = toDecameterPerHour(decameterPerSecondValue, DECAMETER_PER_SECOND);
        meterPerSecondResult = toDecameterPerHour(meterPerSecondValue, METER_PER_SECOND);
        decimeterPerSecondResult = toDecameterPerHour(decimeterPerSecondValue, DECIMETER_PER_SECOND);
        centimeterPerSecondResult = toDecameterPerHour(centimeterPerSecondValue, CENTIMETER_PER_SECOND);
        millimeterPerSecondResult = toDecameterPerHour(millimeterPerSecondValue, MILLIMETER_PER_SECOND);

        kilometerPerMinuteResult = toDecameterPerHour(kilometerPerMinuteValue, KILOMETER_PER_MINUTE);
        hectometerPerMinuteResult = toDecameterPerHour(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE);
        decameterPerMinuteResult = toDecameterPerHour(decameterPerMinuteValue, DECAMETER_PER_MINUTE);
        meterPerMinuteResult = toDecameterPerHour(meterPerMinuteValue, METER_PER_MINUTE);
        decimeterPerMinuteResult = toDecameterPerHour(decimeterPerMinuteValue, DECIMETER_PER_MINUTE);
        centimeterPerMinuteResult = toDecameterPerHour(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE);
        millimeterPerMinuteResult = toDecameterPerHour(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE);

        kilometerPerHourResult = toDecameterPerHour(kilometerPerHourValue, KILOMETER_PER_HOUR);
        hectometerPerHourResult = toDecameterPerHour(hectometerPerHourValue, HECTOMETER_PER_HOUR);
        decameterPerHourResult = toDecameterPerHour(decameterPerHourValue, DECAMETER_PER_HOUR);
        meterPerHourResult = toDecameterPerHour(meterPerHourValue, METER_PER_HOUR);
        decimeterPerHourResult = toDecameterPerHour(decimeterPerHourValue, DECIMETER_PER_HOUR);
        centimeterPerHourResult = toDecameterPerHour(centimeterPerHourValue, CENTIMETER_PER_HOUR);
        millimeterPerHourResult = toDecameterPerHour(millimeterPerHourValue, MILLIMETER_PER_HOUR);

        assertEquals(kilometerPerSecondResult, kilometerPerSecondResultTest);
        assertEquals(hectometerPerSecondResult, hectometerPerSecondResultTest);
        assertEquals(decameterPerSecondResult, decameterPerSecondResultTest);
        assertEquals(meterPerSecondResult, meterPerSecondResultTest);
        assertEquals(decimeterPerSecondResult, decimeterPerSecondResultTest);
        assertEquals(centimeterPerSecondResult, centimeterPerSecondResultTest);
        assertEquals(millimeterPerSecondResult, millimeterPerSecondResultTest);

        assertEquals(kilometerPerMinuteResult, kilometerPerMinuteResultTest);
        assertEquals(hectometerPerMinuteResult, hectometerPerMinuteResultTest);
        assertEquals(decameterPerMinuteResult, decameterPerMinuteResultTest);
        assertEquals(meterPerMinuteResult, meterPerMinuteResultTest);
        assertEquals(decimeterPerMinuteResult, decimeterPerMinuteResultTest);
        assertEquals(centimeterPerMinuteResult, centimeterPerMinuteResultTest);
        assertEquals(millimeterPerMinuteResult, millimeterPerMinuteResultTest);

        assertEquals(kilometerPerHourResult, kilometerPerHourResultTest);
        assertEquals(hectometerPerHourResult, hectometerPerHourResultTest);
        assertEquals(decameterPerHourResult, decameterPerHourResultTest);
        assertEquals(meterPerHourResult, meterPerHourResultTest);
        assertEquals(decimeterPerHourResult, decimeterPerHourResultTest);
        assertEquals(centimeterPerHourResult, centimeterPerHourResultTest);
        assertEquals(millimeterPerHourResult, millimeterPerHourResultTest);
    }
	
	@Test
    public void toMeterPerHourTest() {
        kilometerPerSecondResultTest = convert(kilometerPerSecondValue, KILOMETER_PER_SECOND, METER_PER_HOUR);
        hectometerPerSecondResultTest = convert(hectometerPerSecondValue, HECTOMETER_PER_SECOND, METER_PER_HOUR);
        decameterPerSecondResultTest = convert(decameterPerSecondValue, DECAMETER_PER_SECOND, METER_PER_HOUR);
        meterPerSecondResultTest = convert(meterPerSecondValue, METER_PER_SECOND, METER_PER_HOUR);
        decimeterPerSecondResultTest = convert(decimeterPerSecondValue, DECIMETER_PER_SECOND, METER_PER_HOUR);
        centimeterPerSecondResultTest = convert(centimeterPerSecondValue, CENTIMETER_PER_SECOND, METER_PER_HOUR);
        millimeterPerSecondResultTest = convert(millimeterPerSecondValue, MILLIMETER_PER_SECOND, METER_PER_HOUR);

        kilometerPerMinuteResultTest = convert(kilometerPerMinuteValue, KILOMETER_PER_MINUTE, METER_PER_HOUR);
        hectometerPerMinuteResultTest = convert(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE, METER_PER_HOUR);
        decameterPerMinuteResultTest = convert(decameterPerMinuteValue, DECAMETER_PER_MINUTE, METER_PER_HOUR);
        meterPerMinuteResultTest = convert(meterPerMinuteValue, METER_PER_MINUTE, METER_PER_HOUR);
        decimeterPerMinuteResultTest = convert(decimeterPerMinuteValue, DECIMETER_PER_MINUTE, METER_PER_HOUR);
        centimeterPerMinuteResultTest = convert(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE, METER_PER_HOUR);
        millimeterPerMinuteResultTest = convert(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE, METER_PER_HOUR);

        kilometerPerHourResultTest = convert(kilometerPerHourValue, KILOMETER_PER_HOUR, METER_PER_HOUR);
        hectometerPerHourResultTest = convert(hectometerPerHourValue, HECTOMETER_PER_HOUR, METER_PER_HOUR);
        decameterPerHourResultTest = convert(decameterPerHourValue, DECAMETER_PER_HOUR, METER_PER_HOUR);
        meterPerHourResultTest = convert(meterPerHourValue, METER_PER_HOUR, METER_PER_HOUR);
        decimeterPerHourResultTest = convert(decimeterPerHourValue, DECIMETER_PER_HOUR, METER_PER_HOUR);
        centimeterPerHourResultTest = convert(centimeterPerHourValue, CENTIMETER_PER_HOUR, METER_PER_HOUR);
        millimeterPerHourResultTest = convert(millimeterPerHourValue, MILLIMETER_PER_HOUR, METER_PER_HOUR);

        kilometerPerSecondResult = toMeterPerHour(kilometerPerSecondValue, KILOMETER_PER_SECOND);
        hectometerPerSecondResult = toMeterPerHour(hectometerPerSecondValue, HECTOMETER_PER_SECOND);
        decameterPerSecondResult = toMeterPerHour(decameterPerSecondValue, DECAMETER_PER_SECOND);
        meterPerSecondResult = toMeterPerHour(meterPerSecondValue, METER_PER_SECOND);
        decimeterPerSecondResult = toMeterPerHour(decimeterPerSecondValue, DECIMETER_PER_SECOND);
        centimeterPerSecondResult = toMeterPerHour(centimeterPerSecondValue, CENTIMETER_PER_SECOND);
        millimeterPerSecondResult = toMeterPerHour(millimeterPerSecondValue, MILLIMETER_PER_SECOND);

        kilometerPerMinuteResult = toMeterPerHour(kilometerPerMinuteValue, KILOMETER_PER_MINUTE);
        hectometerPerMinuteResult = toMeterPerHour(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE);
        decameterPerMinuteResult = toMeterPerHour(decameterPerMinuteValue, DECAMETER_PER_MINUTE);
        meterPerMinuteResult = toMeterPerHour(meterPerMinuteValue, METER_PER_MINUTE);
        decimeterPerMinuteResult = toMeterPerHour(decimeterPerMinuteValue, DECIMETER_PER_MINUTE);
        centimeterPerMinuteResult = toMeterPerHour(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE);
        millimeterPerMinuteResult = toMeterPerHour(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE);

        kilometerPerHourResult = toMeterPerHour(kilometerPerHourValue, KILOMETER_PER_HOUR);
        hectometerPerHourResult = toMeterPerHour(hectometerPerHourValue, HECTOMETER_PER_HOUR);
        decameterPerHourResult = toMeterPerHour(decameterPerHourValue, DECAMETER_PER_HOUR);
        meterPerHourResult = toMeterPerHour(meterPerHourValue, METER_PER_HOUR);
        decimeterPerHourResult = toMeterPerHour(decimeterPerHourValue, DECIMETER_PER_HOUR);
        centimeterPerHourResult = toMeterPerHour(centimeterPerHourValue, CENTIMETER_PER_HOUR);
        millimeterPerHourResult = toMeterPerHour(millimeterPerHourValue, MILLIMETER_PER_HOUR);

        assertEquals(kilometerPerSecondResult, kilometerPerSecondResultTest);
        assertEquals(hectometerPerSecondResult, hectometerPerSecondResultTest);
        assertEquals(decameterPerSecondResult, decameterPerSecondResultTest);
        assertEquals(meterPerSecondResult, meterPerSecondResultTest);
        assertEquals(decimeterPerSecondResult, decimeterPerSecondResultTest);
        assertEquals(centimeterPerSecondResult, centimeterPerSecondResultTest);
        assertEquals(millimeterPerSecondResult, millimeterPerSecondResultTest);

        assertEquals(kilometerPerMinuteResult, kilometerPerMinuteResultTest);
        assertEquals(hectometerPerMinuteResult, hectometerPerMinuteResultTest);
        assertEquals(decameterPerMinuteResult, decameterPerMinuteResultTest);
        assertEquals(meterPerMinuteResult, meterPerMinuteResultTest);
        assertEquals(decimeterPerMinuteResult, decimeterPerMinuteResultTest);
        assertEquals(centimeterPerMinuteResult, centimeterPerMinuteResultTest);
        assertEquals(millimeterPerMinuteResult, millimeterPerMinuteResultTest);

        assertEquals(kilometerPerHourResult, kilometerPerHourResultTest);
        assertEquals(hectometerPerHourResult, hectometerPerHourResultTest);
        assertEquals(decameterPerHourResult, decameterPerHourResultTest);
        assertEquals(meterPerHourResult, meterPerHourResultTest);
        assertEquals(decimeterPerHourResult, decimeterPerHourResultTest);
        assertEquals(centimeterPerHourResult, centimeterPerHourResultTest);
        assertEquals(millimeterPerHourResult, millimeterPerHourResultTest);
    }
	
	@Test
    public void toDecimeterPerHourTest() {
        kilometerPerSecondResultTest = convert(kilometerPerSecondValue, KILOMETER_PER_SECOND, DECIMETER_PER_HOUR);
        hectometerPerSecondResultTest = convert(hectometerPerSecondValue, HECTOMETER_PER_SECOND, DECIMETER_PER_HOUR);
        decameterPerSecondResultTest = convert(decameterPerSecondValue, DECAMETER_PER_SECOND, DECIMETER_PER_HOUR);
        meterPerSecondResultTest = convert(meterPerSecondValue, METER_PER_SECOND, DECIMETER_PER_HOUR);
        decimeterPerSecondResultTest = convert(decimeterPerSecondValue, DECIMETER_PER_SECOND, DECIMETER_PER_HOUR);
        centimeterPerSecondResultTest = convert(centimeterPerSecondValue, CENTIMETER_PER_SECOND, DECIMETER_PER_HOUR);
        millimeterPerSecondResultTest = convert(millimeterPerSecondValue, MILLIMETER_PER_SECOND, DECIMETER_PER_HOUR);

        kilometerPerMinuteResultTest = convert(kilometerPerMinuteValue, KILOMETER_PER_MINUTE, DECIMETER_PER_HOUR);
        hectometerPerMinuteResultTest = convert(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE, DECIMETER_PER_HOUR);
        decameterPerMinuteResultTest = convert(decameterPerMinuteValue, DECAMETER_PER_MINUTE, DECIMETER_PER_HOUR);
        meterPerMinuteResultTest = convert(meterPerMinuteValue, METER_PER_MINUTE, DECIMETER_PER_HOUR);
        decimeterPerMinuteResultTest = convert(decimeterPerMinuteValue, DECIMETER_PER_MINUTE, DECIMETER_PER_HOUR);
        centimeterPerMinuteResultTest = convert(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE, DECIMETER_PER_HOUR);
        millimeterPerMinuteResultTest = convert(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE, DECIMETER_PER_HOUR);

        kilometerPerHourResultTest = convert(kilometerPerHourValue, KILOMETER_PER_HOUR, DECIMETER_PER_HOUR);
        hectometerPerHourResultTest = convert(hectometerPerHourValue, HECTOMETER_PER_HOUR, DECIMETER_PER_HOUR);
        decameterPerHourResultTest = convert(decameterPerHourValue, DECAMETER_PER_HOUR, DECIMETER_PER_HOUR);
        meterPerHourResultTest = convert(meterPerHourValue, METER_PER_HOUR, DECIMETER_PER_HOUR);
        decimeterPerHourResultTest = convert(decimeterPerHourValue, DECIMETER_PER_HOUR, DECIMETER_PER_HOUR);
        centimeterPerHourResultTest = convert(centimeterPerHourValue, CENTIMETER_PER_HOUR, DECIMETER_PER_HOUR);
        millimeterPerHourResultTest = convert(millimeterPerHourValue, MILLIMETER_PER_HOUR, DECIMETER_PER_HOUR);

        kilometerPerSecondResult = toDecimeterPerHour(kilometerPerSecondValue, KILOMETER_PER_SECOND);
        hectometerPerSecondResult = toDecimeterPerHour(hectometerPerSecondValue, HECTOMETER_PER_SECOND);
        decameterPerSecondResult = toDecimeterPerHour(decameterPerSecondValue, DECAMETER_PER_SECOND);
        meterPerSecondResult = toDecimeterPerHour(meterPerSecondValue, METER_PER_SECOND);
        decimeterPerSecondResult = toDecimeterPerHour(decimeterPerSecondValue, DECIMETER_PER_SECOND);
        centimeterPerSecondResult = toDecimeterPerHour(centimeterPerSecondValue, CENTIMETER_PER_SECOND);
        millimeterPerSecondResult = toDecimeterPerHour(millimeterPerSecondValue, MILLIMETER_PER_SECOND);

        kilometerPerMinuteResult = toDecimeterPerHour(kilometerPerMinuteValue, KILOMETER_PER_MINUTE);
        hectometerPerMinuteResult = toDecimeterPerHour(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE);
        decameterPerMinuteResult = toDecimeterPerHour(decameterPerMinuteValue, DECAMETER_PER_MINUTE);
        meterPerMinuteResult = toDecimeterPerHour(meterPerMinuteValue, METER_PER_MINUTE);
        decimeterPerMinuteResult = toDecimeterPerHour(decimeterPerMinuteValue, DECIMETER_PER_MINUTE);
        centimeterPerMinuteResult = toDecimeterPerHour(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE);
        millimeterPerMinuteResult = toDecimeterPerHour(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE);

        kilometerPerHourResult = toDecimeterPerHour(kilometerPerHourValue, KILOMETER_PER_HOUR);
        hectometerPerHourResult = toDecimeterPerHour(hectometerPerHourValue, HECTOMETER_PER_HOUR);
        decameterPerHourResult = toDecimeterPerHour(decameterPerHourValue, DECAMETER_PER_HOUR);
        meterPerHourResult = toDecimeterPerHour(meterPerHourValue, METER_PER_HOUR);
        decimeterPerHourResult = toDecimeterPerHour(decimeterPerHourValue, DECIMETER_PER_HOUR);
        centimeterPerHourResult = toDecimeterPerHour(centimeterPerHourValue, CENTIMETER_PER_HOUR);
        millimeterPerHourResult = toDecimeterPerHour(millimeterPerHourValue, MILLIMETER_PER_HOUR);

        assertEquals(kilometerPerSecondResult, kilometerPerSecondResultTest);
        assertEquals(hectometerPerSecondResult, hectometerPerSecondResultTest);
        assertEquals(decameterPerSecondResult, decameterPerSecondResultTest);
        assertEquals(meterPerSecondResult, meterPerSecondResultTest);
        assertEquals(decimeterPerSecondResult, decimeterPerSecondResultTest);
        assertEquals(centimeterPerSecondResult, centimeterPerSecondResultTest);
        assertEquals(millimeterPerSecondResult, millimeterPerSecondResultTest);

        assertEquals(kilometerPerMinuteResult, kilometerPerMinuteResultTest);
        assertEquals(hectometerPerMinuteResult, hectometerPerMinuteResultTest);
        assertEquals(decameterPerMinuteResult, decameterPerMinuteResultTest);
        assertEquals(meterPerMinuteResult, meterPerMinuteResultTest);
        assertEquals(decimeterPerMinuteResult, decimeterPerMinuteResultTest);
        assertEquals(centimeterPerMinuteResult, centimeterPerMinuteResultTest);
        assertEquals(millimeterPerMinuteResult, millimeterPerMinuteResultTest);

        assertEquals(kilometerPerHourResult, kilometerPerHourResultTest);
        assertEquals(hectometerPerHourResult, hectometerPerHourResultTest);
        assertEquals(decameterPerHourResult, decameterPerHourResultTest);
        assertEquals(meterPerHourResult, meterPerHourResultTest);
        assertEquals(decimeterPerHourResult, decimeterPerHourResultTest);
        assertEquals(centimeterPerHourResult, centimeterPerHourResultTest);
        assertEquals(millimeterPerHourResult, millimeterPerHourResultTest);
    }
	
	@Test
    public void toCentimeterPerHourTest()  {
        kilometerPerSecondResultTest = convert(kilometerPerSecondValue, KILOMETER_PER_SECOND, CENTIMETER_PER_HOUR);
        hectometerPerSecondResultTest = convert(hectometerPerSecondValue, HECTOMETER_PER_SECOND, CENTIMETER_PER_HOUR);
        decameterPerSecondResultTest = convert(decameterPerSecondValue, DECAMETER_PER_SECOND, CENTIMETER_PER_HOUR);
        meterPerSecondResultTest = convert(meterPerSecondValue, METER_PER_SECOND, CENTIMETER_PER_HOUR);
        decimeterPerSecondResultTest = convert(decimeterPerSecondValue, DECIMETER_PER_SECOND, CENTIMETER_PER_HOUR);
        centimeterPerSecondResultTest = convert(centimeterPerSecondValue, CENTIMETER_PER_SECOND, CENTIMETER_PER_HOUR);
        millimeterPerSecondResultTest = convert(millimeterPerSecondValue, MILLIMETER_PER_SECOND, CENTIMETER_PER_HOUR);

        kilometerPerMinuteResultTest = convert(kilometerPerMinuteValue, KILOMETER_PER_MINUTE, CENTIMETER_PER_HOUR);
        hectometerPerMinuteResultTest = convert(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE, CENTIMETER_PER_HOUR);
        decameterPerMinuteResultTest = convert(decameterPerMinuteValue, DECAMETER_PER_MINUTE, CENTIMETER_PER_HOUR);
        meterPerMinuteResultTest = convert(meterPerMinuteValue, METER_PER_MINUTE, CENTIMETER_PER_HOUR);
        decimeterPerMinuteResultTest = convert(decimeterPerMinuteValue, DECIMETER_PER_MINUTE, CENTIMETER_PER_HOUR);
        centimeterPerMinuteResultTest = convert(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE, CENTIMETER_PER_HOUR);
        millimeterPerMinuteResultTest = convert(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE, CENTIMETER_PER_HOUR);

        kilometerPerHourResultTest = convert(kilometerPerHourValue, KILOMETER_PER_HOUR, CENTIMETER_PER_HOUR);
        hectometerPerHourResultTest = convert(hectometerPerHourValue, HECTOMETER_PER_HOUR, CENTIMETER_PER_HOUR);
        decameterPerHourResultTest = convert(decameterPerHourValue, DECAMETER_PER_HOUR, CENTIMETER_PER_HOUR);
        meterPerHourResultTest = convert(meterPerHourValue, METER_PER_HOUR, CENTIMETER_PER_HOUR);
        decimeterPerHourResultTest = convert(decimeterPerHourValue, DECIMETER_PER_HOUR, CENTIMETER_PER_HOUR);
        centimeterPerHourResultTest = convert(centimeterPerHourValue, CENTIMETER_PER_HOUR, CENTIMETER_PER_HOUR);
        millimeterPerHourResultTest = convert(millimeterPerHourValue, MILLIMETER_PER_HOUR, CENTIMETER_PER_HOUR);

        kilometerPerSecondResult = toCentimeterPerHour(kilometerPerSecondValue, KILOMETER_PER_SECOND);
        hectometerPerSecondResult = toCentimeterPerHour(hectometerPerSecondValue, HECTOMETER_PER_SECOND);
        decameterPerSecondResult = toCentimeterPerHour(decameterPerSecondValue, DECAMETER_PER_SECOND);
        meterPerSecondResult = toCentimeterPerHour(meterPerSecondValue, METER_PER_SECOND);
        decimeterPerSecondResult = toCentimeterPerHour(decimeterPerSecondValue, DECIMETER_PER_SECOND);
        centimeterPerSecondResult = toCentimeterPerHour(centimeterPerSecondValue, CENTIMETER_PER_SECOND);
        millimeterPerSecondResult = toCentimeterPerHour(millimeterPerSecondValue, MILLIMETER_PER_SECOND);

        kilometerPerMinuteResult = toCentimeterPerHour(kilometerPerMinuteValue, KILOMETER_PER_MINUTE);
        hectometerPerMinuteResult = toCentimeterPerHour(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE);
        decameterPerMinuteResult = toCentimeterPerHour(decameterPerMinuteValue, DECAMETER_PER_MINUTE);
        meterPerMinuteResult = toCentimeterPerHour(meterPerMinuteValue, METER_PER_MINUTE);
        decimeterPerMinuteResult = toCentimeterPerHour(decimeterPerMinuteValue, DECIMETER_PER_MINUTE);
        centimeterPerMinuteResult = toCentimeterPerHour(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE);
        millimeterPerMinuteResult = toCentimeterPerHour(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE);

        kilometerPerHourResult = toCentimeterPerHour(kilometerPerHourValue, KILOMETER_PER_HOUR);
        hectometerPerHourResult = toCentimeterPerHour(hectometerPerHourValue, HECTOMETER_PER_HOUR);
        decameterPerHourResult = toCentimeterPerHour(decameterPerHourValue, DECAMETER_PER_HOUR);
        meterPerHourResult = toCentimeterPerHour(meterPerHourValue, METER_PER_HOUR);
        decimeterPerHourResult = toCentimeterPerHour(decimeterPerHourValue, DECIMETER_PER_HOUR);
        centimeterPerHourResult = toCentimeterPerHour(centimeterPerHourValue, CENTIMETER_PER_HOUR);
        millimeterPerHourResult = toCentimeterPerHour(millimeterPerHourValue, MILLIMETER_PER_HOUR);

        assertEquals(kilometerPerSecondResult, kilometerPerSecondResultTest);
        assertEquals(hectometerPerSecondResult, hectometerPerSecondResultTest);
        assertEquals(decameterPerSecondResult, decameterPerSecondResultTest);
        assertEquals(meterPerSecondResult, meterPerSecondResultTest);
        assertEquals(decimeterPerSecondResult, decimeterPerSecondResultTest);
        assertEquals(centimeterPerSecondResult, centimeterPerSecondResultTest);
        assertEquals(millimeterPerSecondResult, millimeterPerSecondResultTest);

        assertEquals(kilometerPerMinuteResult, kilometerPerMinuteResultTest);
        assertEquals(hectometerPerMinuteResult, hectometerPerMinuteResultTest);
        assertEquals(decameterPerMinuteResult, decameterPerMinuteResultTest);
        assertEquals(meterPerMinuteResult, meterPerMinuteResultTest);
        assertEquals(decimeterPerMinuteResult, decimeterPerMinuteResultTest);
        assertEquals(centimeterPerMinuteResult, centimeterPerMinuteResultTest);
        assertEquals(millimeterPerMinuteResult, millimeterPerMinuteResultTest);

        assertEquals(kilometerPerHourResult, kilometerPerHourResultTest);
        assertEquals(hectometerPerHourResult, hectometerPerHourResultTest);
        assertEquals(decameterPerHourResult, decameterPerHourResultTest);
        assertEquals(meterPerHourResult, meterPerHourResultTest);
        assertEquals(decimeterPerHourResult, decimeterPerHourResultTest);
        assertEquals(centimeterPerHourResult, centimeterPerHourResultTest);
        assertEquals(millimeterPerHourResult, millimeterPerHourResultTest);
    }
	
	@Test
    public void toMillimeterPerHourTest() {
        kilometerPerSecondResultTest = convert(kilometerPerSecondValue, KILOMETER_PER_SECOND, MILLIMETER_PER_HOUR);
        hectometerPerSecondResultTest = convert(hectometerPerSecondValue, HECTOMETER_PER_SECOND, MILLIMETER_PER_HOUR);
        decameterPerSecondResultTest = convert(decameterPerSecondValue, DECAMETER_PER_SECOND, MILLIMETER_PER_HOUR);
        meterPerSecondResultTest = convert(meterPerSecondValue, METER_PER_SECOND, MILLIMETER_PER_HOUR);
        decimeterPerSecondResultTest = convert(decimeterPerSecondValue, DECIMETER_PER_SECOND, MILLIMETER_PER_HOUR);
        centimeterPerSecondResultTest = convert(centimeterPerSecondValue, CENTIMETER_PER_SECOND, MILLIMETER_PER_HOUR);
        millimeterPerSecondResultTest = convert(millimeterPerSecondValue, MILLIMETER_PER_SECOND, MILLIMETER_PER_HOUR);

        kilometerPerMinuteResultTest = convert(kilometerPerMinuteValue, KILOMETER_PER_MINUTE, MILLIMETER_PER_HOUR);
        hectometerPerMinuteResultTest = convert(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE, MILLIMETER_PER_HOUR);
        decameterPerMinuteResultTest = convert(decameterPerMinuteValue, DECAMETER_PER_MINUTE, MILLIMETER_PER_HOUR);
        meterPerMinuteResultTest = convert(meterPerMinuteValue, METER_PER_MINUTE, MILLIMETER_PER_HOUR);
        decimeterPerMinuteResultTest = convert(decimeterPerMinuteValue, DECIMETER_PER_MINUTE, MILLIMETER_PER_HOUR);
        centimeterPerMinuteResultTest = convert(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE, MILLIMETER_PER_HOUR);
        millimeterPerMinuteResultTest = convert(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE, MILLIMETER_PER_HOUR);

        kilometerPerHourResultTest = convert(kilometerPerHourValue, KILOMETER_PER_HOUR, MILLIMETER_PER_HOUR);
        hectometerPerHourResultTest = convert(hectometerPerHourValue, HECTOMETER_PER_HOUR, MILLIMETER_PER_HOUR);
        decameterPerHourResultTest = convert(decameterPerHourValue, DECAMETER_PER_HOUR, MILLIMETER_PER_HOUR);
        meterPerHourResultTest = convert(meterPerHourValue, METER_PER_HOUR, MILLIMETER_PER_HOUR);
        decimeterPerHourResultTest = convert(decimeterPerHourValue, DECIMETER_PER_HOUR, MILLIMETER_PER_HOUR);
        centimeterPerHourResultTest = convert(centimeterPerHourValue, CENTIMETER_PER_HOUR, MILLIMETER_PER_HOUR);
        millimeterPerHourResultTest = convert(millimeterPerHourValue, MILLIMETER_PER_HOUR, MILLIMETER_PER_HOUR);

        kilometerPerSecondResult = toMillimeterPerHour(kilometerPerSecondValue, KILOMETER_PER_SECOND);
        hectometerPerSecondResult = toMillimeterPerHour(hectometerPerSecondValue, HECTOMETER_PER_SECOND);
        decameterPerSecondResult = toMillimeterPerHour(decameterPerSecondValue, DECAMETER_PER_SECOND);
        meterPerSecondResult = toMillimeterPerHour(meterPerSecondValue, METER_PER_SECOND);
        decimeterPerSecondResult = toMillimeterPerHour(decimeterPerSecondValue, DECIMETER_PER_SECOND);
        centimeterPerSecondResult = toMillimeterPerHour(centimeterPerSecondValue, CENTIMETER_PER_SECOND);
        millimeterPerSecondResult = toMillimeterPerHour(millimeterPerSecondValue, MILLIMETER_PER_SECOND);

        kilometerPerMinuteResult = toMillimeterPerHour(kilometerPerMinuteValue, KILOMETER_PER_MINUTE);
        hectometerPerMinuteResult = toMillimeterPerHour(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE);
        decameterPerMinuteResult = toMillimeterPerHour(decameterPerMinuteValue, DECAMETER_PER_MINUTE);
        meterPerMinuteResult = toMillimeterPerHour(meterPerMinuteValue, METER_PER_MINUTE);
        decimeterPerMinuteResult = toMillimeterPerHour(decimeterPerMinuteValue, DECIMETER_PER_MINUTE);
        centimeterPerMinuteResult = toMillimeterPerHour(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE);
        millimeterPerMinuteResult = toMillimeterPerHour(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE);

        kilometerPerHourResult = toMillimeterPerHour(kilometerPerHourValue, KILOMETER_PER_HOUR);
        hectometerPerHourResult = toMillimeterPerHour(hectometerPerHourValue, HECTOMETER_PER_HOUR);
        decameterPerHourResult = toMillimeterPerHour(decameterPerHourValue, DECAMETER_PER_HOUR);
        meterPerHourResult = toMillimeterPerHour(meterPerHourValue, METER_PER_HOUR);
        decimeterPerHourResult = toMillimeterPerHour(decimeterPerHourValue, DECIMETER_PER_HOUR);
        centimeterPerHourResult = toMillimeterPerHour(centimeterPerHourValue, CENTIMETER_PER_HOUR);
        millimeterPerHourResult = toMillimeterPerHour(millimeterPerHourValue, MILLIMETER_PER_HOUR);

        assertEquals(kilometerPerSecondResult, kilometerPerSecondResultTest);
        assertEquals(hectometerPerSecondResult, hectometerPerSecondResultTest);
        assertEquals(decameterPerSecondResult, decameterPerSecondResultTest);
        assertEquals(meterPerSecondResult, meterPerSecondResultTest);
        assertEquals(decimeterPerSecondResult, decimeterPerSecondResultTest);
        assertEquals(centimeterPerSecondResult, centimeterPerSecondResultTest);
        assertEquals(millimeterPerSecondResult, millimeterPerSecondResultTest);

        assertEquals(kilometerPerMinuteResult, kilometerPerMinuteResultTest);
        assertEquals(hectometerPerMinuteResult, hectometerPerMinuteResultTest);
        assertEquals(decameterPerMinuteResult, decameterPerMinuteResultTest);
        assertEquals(meterPerMinuteResult, meterPerMinuteResultTest);
        assertEquals(decimeterPerMinuteResult, decimeterPerMinuteResultTest);
        assertEquals(centimeterPerMinuteResult, centimeterPerMinuteResultTest);
        assertEquals(millimeterPerMinuteResult, millimeterPerMinuteResultTest);

        assertEquals(kilometerPerHourResult, kilometerPerHourResultTest);
        assertEquals(hectometerPerHourResult, hectometerPerHourResultTest);
        assertEquals(decameterPerHourResult, decameterPerHourResultTest);
        assertEquals(meterPerHourResult, meterPerHourResultTest);
        assertEquals(decimeterPerHourResult, decimeterPerHourResultTest);
        assertEquals(centimeterPerHourResult, centimeterPerHourResultTest);
        assertEquals(millimeterPerHourResult, millimeterPerHourResultTest);
    }

    @Override
    public Speed convert(double value, int currentUnit, int targetUnit) {
        return new Speed(divide(multiply(value, SPEED_SCALES[targetUnit - UNIT_SCALE]), SPEED_SCALES[currentUnit - UNIT_SCALE]), targetUnit);
    }
}
