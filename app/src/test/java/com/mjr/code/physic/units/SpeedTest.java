package com.mjr.code.physic.units;

import com.mjr.code.physic.PhysicException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import org.junit.jupiter.api.Test;

import static com.mjr.code.physic.Physic.ROUND_SCALE;
import static com.mjr.code.physic.units.Speed.toKilometerPerSecond;
import static com.mjr.code.physic.units.Speed.toHectometerPerSecond;
import static com.mjr.code.physic.units.Speed.toDecameterPerSecond;
import static com.mjr.code.physic.units.Speed.toMeterPerSecond;
import static com.mjr.code.physic.units.Speed.toDecimeterPerSecond;
import static com.mjr.code.physic.units.Speed.toCentimeterPerSecond;
import static com.mjr.code.physic.units.Speed.toMillimeterPerSecond;
import static com.mjr.code.physic.units.Speed.toKilometerPerMinute;
import static com.mjr.code.physic.units.Speed.toHectometerPerMinute;
import static com.mjr.code.physic.units.Speed.toDecameterPerMinute;
import static com.mjr.code.physic.units.Speed.toMeterPerMinute;
import static com.mjr.code.physic.units.Speed.toDecimeterPerMinute;
import static com.mjr.code.physic.units.Speed.toCentimeterPerMinute;
import static com.mjr.code.physic.units.Speed.toMillimeterPerMinute;
import static com.mjr.code.physic.units.Speed.toKilometerPerHour;
import static com.mjr.code.physic.units.Speed.toHectometerPerHour;
import static com.mjr.code.physic.units.Speed.toDecameterPerHour;
import static com.mjr.code.physic.units.Speed.toMeterPerHour;
import static com.mjr.code.physic.units.Speed.toDecimeterPerHour;
import static com.mjr.code.physic.units.Speed.toCentimeterPerHour;
import static com.mjr.code.physic.units.Speed.toMillimeterPerHour;
import static com.mjr.code.physic.units.Speed.SPEED_SCALES;
import static com.mjr.code.physic.units.Speed.KILOMETER_PER_SECOND;
import static com.mjr.code.physic.units.Speed.HECTOMETER_PER_SECOND;
import static com.mjr.code.physic.units.Speed.DECAMETER_PER_SECOND;
import static com.mjr.code.physic.units.Speed.METER_PER_SECOND;
import static com.mjr.code.physic.units.Speed.DECIMETER_PER_SECOND;
import static com.mjr.code.physic.units.Speed.CENTIMETER_PER_SECOND;
import static com.mjr.code.physic.units.Speed.MILLIMETER_PER_SECOND;
import static com.mjr.code.physic.units.Speed.KILOMETER_PER_MINUTE;
import static com.mjr.code.physic.units.Speed.HECTOMETER_PER_MINUTE;
import static com.mjr.code.physic.units.Speed.DECAMETER_PER_MINUTE;
import static com.mjr.code.physic.units.Speed.METER_PER_MINUTE;
import static com.mjr.code.physic.units.Speed.DECIMETER_PER_MINUTE;
import static com.mjr.code.physic.units.Speed.CENTIMETER_PER_MINUTE;
import static com.mjr.code.physic.units.Speed.MILLIMETER_PER_MINUTE;
import static com.mjr.code.physic.units.Speed.KILOMETER_PER_HOUR;
import static com.mjr.code.physic.units.Speed.HECTOMETER_PER_HOUR;
import static com.mjr.code.physic.units.Speed.DECAMETER_PER_HOUR;
import static com.mjr.code.physic.units.Speed.METER_PER_HOUR;
import static com.mjr.code.physic.units.Speed.DECIMETER_PER_HOUR;
import static com.mjr.code.physic.units.Speed.CENTIMETER_PER_HOUR;
import static com.mjr.code.physic.units.Speed.MILLIMETER_PER_HOUR;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpeedTest {
    private final Random random;
    
    public SpeedTest() {
        random = new Random();
    }
    
    @Test
    public void toKilometerPerSecondTest() throws PhysicException {
        double kilometerPerSecondValue = getRandomDouble();
        double hectometerPerSecondValue = getRandomDouble();
        double decameterPerSecondValue = getRandomDouble();
        double meterPerSecondValue = getRandomDouble();
        double decimeterPerSecondValue = getRandomDouble();
        double centimeterPerSecondValue = getRandomDouble();
	    double millimeterPerSecondValue = getRandomDouble();
        
        double kilometerPerMinuteValue = getRandomDouble();
        double hectometerPerMinuteValue = getRandomDouble();
        double decameterPerMinuteValue = getRandomDouble();
        double meterPerMinuteValue = getRandomDouble();
        double decimeterPerMinuteValue = getRandomDouble();
        double centimeterPerMinuteValue = getRandomDouble();
	    double millimeterPerMinuteValue = getRandomDouble();
        
        double kilometerPerHourValue = getRandomDouble();
        double hectometerPerHourValue = getRandomDouble();
        double decameterPerHourValue = getRandomDouble();
        double meterPerHourValue = getRandomDouble();
        double decimeterPerHourValue = getRandomDouble();
        double centimeterPerHourValue = getRandomDouble();
	    double millimeterPerHourValue = getRandomDouble();
        try {
            Speed kilometerPerSecondResultTest = new Speed(BigDecimal.valueOf(kilometerPerSecondValue).multiply(SPEED_SCALES[KILOMETER_PER_SECOND - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_SECOND);
			Speed hectometerPerSecondResultTest = new Speed(BigDecimal.valueOf(hectometerPerSecondValue).multiply(SPEED_SCALES[HECTOMETER_PER_SECOND - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_SECOND);
			Speed decameterPerSecondResultTest = new Speed(BigDecimal.valueOf(decameterPerSecondValue).multiply(SPEED_SCALES[DECAMETER_PER_SECOND - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_SECOND);
			Speed meterPerSecondResultTest = new Speed(BigDecimal.valueOf(meterPerSecondValue).multiply(SPEED_SCALES[METER_PER_SECOND - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_SECOND);
			Speed decimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(decimeterPerSecondValue).multiply(SPEED_SCALES[DECIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_SECOND);
			Speed centimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(centimeterPerSecondValue).multiply(SPEED_SCALES[CENTIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_SECOND);
			Speed millimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(millimeterPerSecondValue).multiply(SPEED_SCALES[MILLIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_SECOND);
			
			Speed kilometerPerMinuteResultTest = new Speed(BigDecimal.valueOf(kilometerPerMinuteValue).multiply(SPEED_SCALES[KILOMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_MINUTE);
			Speed hectometerPerMinuteResultTest = new Speed(BigDecimal.valueOf(hectometerPerMinuteValue).multiply(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_MINUTE);
			Speed decameterPerMinuteResultTest = new Speed(BigDecimal.valueOf(decameterPerMinuteValue).multiply(SPEED_SCALES[DECAMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_MINUTE);
			Speed meterPerMinuteResultTest = new Speed(BigDecimal.valueOf(meterPerMinuteValue).multiply(SPEED_SCALES[METER_PER_MINUTE - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_MINUTE);
			Speed decimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(decimeterPerMinuteValue).multiply(SPEED_SCALES[DECIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_MINUTE);
			Speed centimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(centimeterPerMinuteValue).multiply(SPEED_SCALES[CENTIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_MINUTE);
			Speed millimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(millimeterPerMinuteValue).multiply(SPEED_SCALES[MILLIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_MINUTE);
			
			Speed kilometerPerHourResultTest = new Speed(BigDecimal.valueOf(kilometerPerHourValue).multiply(SPEED_SCALES[KILOMETER_PER_HOUR - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_HOUR);
			Speed hectometerPerHourResultTest = new Speed(BigDecimal.valueOf(hectometerPerHourValue).multiply(SPEED_SCALES[HECTOMETER_PER_HOUR - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_HOUR);
			Speed decameterPerHourResultTest = new Speed(BigDecimal.valueOf(decameterPerHourValue).multiply(SPEED_SCALES[DECAMETER_PER_HOUR - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_HOUR);
			Speed meterPerHourResultTest = new Speed(BigDecimal.valueOf(meterPerHourValue).multiply(SPEED_SCALES[METER_PER_HOUR - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_HOUR);
			Speed decimeterPerHourResultTest = new Speed(BigDecimal.valueOf(decimeterPerHourValue).multiply(SPEED_SCALES[DECIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_HOUR);
			Speed centimeterPerHourResultTest = new Speed(BigDecimal.valueOf(centimeterPerHourValue).multiply(SPEED_SCALES[CENTIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_HOUR);
			Speed millimeterPerHourResultTest = new Speed(BigDecimal.valueOf(millimeterPerHourValue).multiply(SPEED_SCALES[MILLIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_HOUR);
			
			Speed kilometerPerSecondResult = toKilometerPerSecond(kilometerPerSecondValue, KILOMETER_PER_SECOND);
			Speed hectometerPerSecondResult = toKilometerPerSecond(hectometerPerSecondValue, HECTOMETER_PER_SECOND);
			Speed decameterPerSecondResult = toKilometerPerSecond(decameterPerSecondValue, DECAMETER_PER_SECOND);
			Speed meterPerSecondResult = toKilometerPerSecond(meterPerSecondValue, METER_PER_SECOND);
			Speed decimeterPerSecondResult = toKilometerPerSecond(decimeterPerSecondValue, DECIMETER_PER_SECOND);
			Speed centimeterPerSecondResult = toKilometerPerSecond(centimeterPerSecondValue, CENTIMETER_PER_SECOND);
			Speed millimeterPerSecondResult = toKilometerPerSecond(millimeterPerSecondValue, MILLIMETER_PER_SECOND);
		
			Speed kilometerPerMinuteResult = toKilometerPerSecond(kilometerPerMinuteValue, KILOMETER_PER_MINUTE);
			Speed hectometerPerMinuteResult = toKilometerPerSecond(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE);
			Speed decameterPerMinuteResult = toKilometerPerSecond(decameterPerMinuteValue, DECAMETER_PER_MINUTE);
			Speed meterPerMinuteResult = toKilometerPerSecond(meterPerMinuteValue, METER_PER_MINUTE);
			Speed decimeterPerMinuteResult = toKilometerPerSecond(decimeterPerMinuteValue, DECIMETER_PER_MINUTE);
			Speed centimeterPerMinuteResult = toKilometerPerSecond(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE);
			Speed millimeterPerMinuteResult = toKilometerPerSecond(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE);
			
			Speed kilometerPerHourResult = toKilometerPerSecond(kilometerPerHourValue, KILOMETER_PER_HOUR);
			Speed hectometerPerHourResult = toKilometerPerSecond(hectometerPerHourValue, HECTOMETER_PER_HOUR);
			Speed decameterPerHourResult = toKilometerPerSecond(decameterPerHourValue, DECAMETER_PER_HOUR);
			Speed meterPerHourResult = toKilometerPerSecond(meterPerHourValue, METER_PER_HOUR);
			Speed decimeterPerHourResult = toKilometerPerSecond(decimeterPerHourValue, DECIMETER_PER_HOUR);
			Speed centimeterPerHourResult = toKilometerPerSecond(centimeterPerHourValue, CENTIMETER_PER_HOUR);
			Speed millimeterPerHourResult = toKilometerPerSecond(millimeterPerHourValue, MILLIMETER_PER_HOUR);
			
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
			
        } catch (InvalidUnitException e) {
            throw e;
        }
    }
	
	@Test
    public void toHectometerPerSecondTest() throws PhysicException {
        double kilometerPerSecondValue = getRandomDouble();
        double hectometerPerSecondValue = getRandomDouble();
        double decameterPerSecondValue = getRandomDouble();
        double meterPerSecondValue = getRandomDouble();
        double decimeterPerSecondValue = getRandomDouble();
        double centimeterPerSecondValue = getRandomDouble();
	    double millimeterPerSecondValue = getRandomDouble();

        double kilometerPerMinuteValue = getRandomDouble();
        double hectometerPerMinuteValue = getRandomDouble();
        double decameterPerMinuteValue = getRandomDouble();
        double meterPerMinuteValue = getRandomDouble();
        double decimeterPerMinuteValue = getRandomDouble();
        double centimeterPerMinuteValue = getRandomDouble();
	    double millimeterPerMinuteValue = getRandomDouble();

        double kilometerPerHourValue = getRandomDouble();
        double hectometerPerHourValue = getRandomDouble();
        double decameterPerHourValue = getRandomDouble();
        double meterPerHourValue = getRandomDouble();
        double decimeterPerHourValue = getRandomDouble();
        double centimeterPerHourValue = getRandomDouble();
	    double millimeterPerHourValue = getRandomDouble();
        try {
            Speed kilometerPerSecondResultTest = new Speed(BigDecimal.valueOf(kilometerPerSecondValue).multiply(SPEED_SCALES[KILOMETER_PER_SECOND - 31]).divide(SPEED_SCALES[HECTOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_SECOND);
			Speed hectometerPerSecondResultTest = new Speed(BigDecimal.valueOf(hectometerPerSecondValue).multiply(SPEED_SCALES[HECTOMETER_PER_SECOND - 31]).divide(SPEED_SCALES[HECTOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_SECOND);
			Speed decameterPerSecondResultTest = new Speed(BigDecimal.valueOf(decameterPerSecondValue).multiply(SPEED_SCALES[DECAMETER_PER_SECOND - 31]).divide(SPEED_SCALES[HECTOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_SECOND);
			Speed meterPerSecondResultTest = new Speed(BigDecimal.valueOf(meterPerSecondValue).multiply(SPEED_SCALES[METER_PER_SECOND - 31]).divide(SPEED_SCALES[HECTOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_SECOND);
			Speed decimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(decimeterPerSecondValue).multiply(SPEED_SCALES[DECIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[HECTOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_SECOND);
			Speed centimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(centimeterPerSecondValue).multiply(SPEED_SCALES[CENTIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[HECTOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_SECOND);
			Speed millimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(millimeterPerSecondValue).multiply(SPEED_SCALES[MILLIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[HECTOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_SECOND);

			Speed kilometerPerMinuteResultTest = new Speed(BigDecimal.valueOf(kilometerPerMinuteValue).multiply(SPEED_SCALES[KILOMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[HECTOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_MINUTE);
			Speed hectometerPerMinuteResultTest = new Speed(BigDecimal.valueOf(hectometerPerMinuteValue).multiply(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[HECTOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_MINUTE);
			Speed decameterPerMinuteResultTest = new Speed(BigDecimal.valueOf(decameterPerMinuteValue).multiply(SPEED_SCALES[DECAMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[HECTOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_MINUTE);
			Speed meterPerMinuteResultTest = new Speed(BigDecimal.valueOf(meterPerMinuteValue).multiply(SPEED_SCALES[METER_PER_MINUTE - 31]).divide(SPEED_SCALES[HECTOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_MINUTE);
			Speed decimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(decimeterPerMinuteValue).multiply(SPEED_SCALES[DECIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[HECTOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_MINUTE);
			Speed centimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(centimeterPerMinuteValue).multiply(SPEED_SCALES[CENTIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[HECTOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_MINUTE);
			Speed millimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(millimeterPerMinuteValue).multiply(SPEED_SCALES[MILLIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[HECTOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_MINUTE);

			Speed kilometerPerHourResultTest = new Speed(BigDecimal.valueOf(kilometerPerHourValue).multiply(SPEED_SCALES[KILOMETER_PER_HOUR - 31]).divide(SPEED_SCALES[HECTOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_HOUR);
			Speed hectometerPerHourResultTest = new Speed(BigDecimal.valueOf(hectometerPerHourValue).multiply(SPEED_SCALES[HECTOMETER_PER_HOUR - 31]).divide(SPEED_SCALES[HECTOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_HOUR);
			Speed decameterPerHourResultTest = new Speed(BigDecimal.valueOf(decameterPerHourValue).multiply(SPEED_SCALES[DECAMETER_PER_HOUR - 31]).divide(SPEED_SCALES[HECTOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_HOUR);
			Speed meterPerHourResultTest = new Speed(BigDecimal.valueOf(meterPerHourValue).multiply(SPEED_SCALES[METER_PER_HOUR - 31]).divide(SPEED_SCALES[HECTOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_HOUR);
			Speed decimeterPerHourResultTest = new Speed(BigDecimal.valueOf(decimeterPerHourValue).multiply(SPEED_SCALES[DECIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[HECTOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_HOUR);
			Speed centimeterPerHourResultTest = new Speed(BigDecimal.valueOf(centimeterPerHourValue).multiply(SPEED_SCALES[CENTIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[HECTOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_HOUR);
			Speed millimeterPerHourResultTest = new Speed(BigDecimal.valueOf(millimeterPerHourValue).multiply(SPEED_SCALES[MILLIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[HECTOMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_HOUR);

			Speed kilometerPerSecondResult = toHectometerPerSecond(kilometerPerSecondValue, KILOMETER_PER_SECOND);
			Speed hectometerPerSecondResult = toHectometerPerSecond(hectometerPerSecondValue, HECTOMETER_PER_SECOND);
			Speed decameterPerSecondResult = toHectometerPerSecond(decameterPerSecondValue, DECAMETER_PER_SECOND);
			Speed meterPerSecondResult = toHectometerPerSecond(meterPerSecondValue, METER_PER_SECOND);
			Speed decimeterPerSecondResult = toHectometerPerSecond(decimeterPerSecondValue, DECIMETER_PER_SECOND);
			Speed centimeterPerSecondResult = toHectometerPerSecond(centimeterPerSecondValue, CENTIMETER_PER_SECOND);
			Speed millimeterPerSecondResult = toHectometerPerSecond(millimeterPerSecondValue, MILLIMETER_PER_SECOND);

			Speed kilometerPerMinuteResult = toHectometerPerSecond(kilometerPerMinuteValue, KILOMETER_PER_MINUTE);
			Speed hectometerPerMinuteResult = toHectometerPerSecond(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE);
			Speed decameterPerMinuteResult = toHectometerPerSecond(decameterPerMinuteValue, DECAMETER_PER_MINUTE);
			Speed meterPerMinuteResult = toHectometerPerSecond(meterPerMinuteValue, METER_PER_MINUTE);
			Speed decimeterPerMinuteResult = toHectometerPerSecond(decimeterPerMinuteValue, DECIMETER_PER_MINUTE);
			Speed centimeterPerMinuteResult = toHectometerPerSecond(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE);
			Speed millimeterPerMinuteResult = toHectometerPerSecond(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE);

			Speed kilometerPerHourResult = toHectometerPerSecond(kilometerPerHourValue, KILOMETER_PER_HOUR);
			Speed hectometerPerHourResult = toHectometerPerSecond(hectometerPerHourValue, HECTOMETER_PER_HOUR);
			Speed decameterPerHourResult = toHectometerPerSecond(decameterPerHourValue, DECAMETER_PER_HOUR);
			Speed meterPerHourResult = toHectometerPerSecond(meterPerHourValue, METER_PER_HOUR);
			Speed decimeterPerHourResult = toHectometerPerSecond(decimeterPerHourValue, DECIMETER_PER_HOUR);
			Speed centimeterPerHourResult = toHectometerPerSecond(centimeterPerHourValue, CENTIMETER_PER_HOUR);
			Speed millimeterPerHourResult = toHectometerPerSecond(millimeterPerHourValue, MILLIMETER_PER_HOUR);

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

        } catch (InvalidUnitException e) {
            throw e;
        }
    }
	
	@Test
    public void toDecameterPerSecondTest() throws PhysicException {
        double kilometerPerSecondValue = getRandomDouble();
        double hectometerPerSecondValue = getRandomDouble();
        double decameterPerSecondValue = getRandomDouble();
        double meterPerSecondValue = getRandomDouble();
        double decimeterPerSecondValue = getRandomDouble();
        double centimeterPerSecondValue = getRandomDouble();
	    double millimeterPerSecondValue = getRandomDouble();

        double kilometerPerMinuteValue = getRandomDouble();
        double hectometerPerMinuteValue = getRandomDouble();
        double decameterPerMinuteValue = getRandomDouble();
        double meterPerMinuteValue = getRandomDouble();
        double decimeterPerMinuteValue = getRandomDouble();
        double centimeterPerMinuteValue = getRandomDouble();
	    double millimeterPerMinuteValue = getRandomDouble();

        double kilometerPerHourValue = getRandomDouble();
        double hectometerPerHourValue = getRandomDouble();
        double decameterPerHourValue = getRandomDouble();
        double meterPerHourValue = getRandomDouble();
        double decimeterPerHourValue = getRandomDouble();
        double centimeterPerHourValue = getRandomDouble();
	    double millimeterPerHourValue = getRandomDouble();
        try {
            Speed kilometerPerSecondResultTest = new Speed(BigDecimal.valueOf(kilometerPerSecondValue).multiply(SPEED_SCALES[KILOMETER_PER_SECOND - 31]).divide(SPEED_SCALES[DECAMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_SECOND);
			Speed hectometerPerSecondResultTest = new Speed(BigDecimal.valueOf(hectometerPerSecondValue).multiply(SPEED_SCALES[HECTOMETER_PER_SECOND - 31]).divide(SPEED_SCALES[DECAMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_SECOND);
			Speed decameterPerSecondResultTest = new Speed(BigDecimal.valueOf(decameterPerSecondValue).multiply(SPEED_SCALES[DECAMETER_PER_SECOND - 31]).divide(SPEED_SCALES[DECAMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_SECOND);
			Speed meterPerSecondResultTest = new Speed(BigDecimal.valueOf(meterPerSecondValue).multiply(SPEED_SCALES[METER_PER_SECOND - 31]).divide(SPEED_SCALES[DECAMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_SECOND);
			Speed decimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(decimeterPerSecondValue).multiply(SPEED_SCALES[DECIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[DECAMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_SECOND);
			Speed centimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(centimeterPerSecondValue).multiply(SPEED_SCALES[CENTIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[DECAMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_SECOND);
			Speed millimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(millimeterPerSecondValue).multiply(SPEED_SCALES[MILLIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[DECAMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_SECOND);

			Speed kilometerPerMinuteResultTest = new Speed(BigDecimal.valueOf(kilometerPerMinuteValue).multiply(SPEED_SCALES[KILOMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[DECAMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_MINUTE);
			Speed hectometerPerMinuteResultTest = new Speed(BigDecimal.valueOf(hectometerPerMinuteValue).multiply(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[DECAMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_MINUTE);
			Speed decameterPerMinuteResultTest = new Speed(BigDecimal.valueOf(decameterPerMinuteValue).multiply(SPEED_SCALES[DECAMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[DECAMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_MINUTE);
			Speed meterPerMinuteResultTest = new Speed(BigDecimal.valueOf(meterPerMinuteValue).multiply(SPEED_SCALES[METER_PER_MINUTE - 31]).divide(SPEED_SCALES[DECAMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_MINUTE);
			Speed decimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(decimeterPerMinuteValue).multiply(SPEED_SCALES[DECIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[DECAMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_MINUTE);
			Speed centimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(centimeterPerMinuteValue).multiply(SPEED_SCALES[CENTIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[DECAMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_MINUTE);
			Speed millimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(millimeterPerMinuteValue).multiply(SPEED_SCALES[MILLIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[DECAMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_MINUTE);

			Speed kilometerPerHourResultTest = new Speed(BigDecimal.valueOf(kilometerPerHourValue).multiply(SPEED_SCALES[KILOMETER_PER_HOUR - 31]).divide(SPEED_SCALES[DECAMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_HOUR);
			Speed hectometerPerHourResultTest = new Speed(BigDecimal.valueOf(hectometerPerHourValue).multiply(SPEED_SCALES[HECTOMETER_PER_HOUR - 31]).divide(SPEED_SCALES[DECAMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_HOUR);
			Speed decameterPerHourResultTest = new Speed(BigDecimal.valueOf(decameterPerHourValue).multiply(SPEED_SCALES[DECAMETER_PER_HOUR - 31]).divide(SPEED_SCALES[DECAMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_HOUR);
			Speed meterPerHourResultTest = new Speed(BigDecimal.valueOf(meterPerHourValue).multiply(SPEED_SCALES[METER_PER_HOUR - 31]).divide(SPEED_SCALES[DECAMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_HOUR);
			Speed decimeterPerHourResultTest = new Speed(BigDecimal.valueOf(decimeterPerHourValue).multiply(SPEED_SCALES[DECIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[DECAMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_HOUR);
			Speed centimeterPerHourResultTest = new Speed(BigDecimal.valueOf(centimeterPerHourValue).multiply(SPEED_SCALES[CENTIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[DECAMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_HOUR);
			Speed millimeterPerHourResultTest = new Speed(BigDecimal.valueOf(millimeterPerHourValue).multiply(SPEED_SCALES[MILLIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[DECAMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_HOUR);

			Speed kilometerPerSecondResult = toDecameterPerSecond(kilometerPerSecondValue, KILOMETER_PER_SECOND);
			Speed hectometerPerSecondResult = toDecameterPerSecond(hectometerPerSecondValue, HECTOMETER_PER_SECOND);
			Speed decameterPerSecondResult = toDecameterPerSecond(decameterPerSecondValue, DECAMETER_PER_SECOND);
			Speed meterPerSecondResult = toDecameterPerSecond(meterPerSecondValue, METER_PER_SECOND);
			Speed decimeterPerSecondResult = toDecameterPerSecond(decimeterPerSecondValue, DECIMETER_PER_SECOND);
			Speed centimeterPerSecondResult = toDecameterPerSecond(centimeterPerSecondValue, CENTIMETER_PER_SECOND);
			Speed millimeterPerSecondResult = toDecameterPerSecond(millimeterPerSecondValue, MILLIMETER_PER_SECOND);

			Speed kilometerPerMinuteResult = toDecameterPerSecond(kilometerPerMinuteValue, KILOMETER_PER_MINUTE);
			Speed hectometerPerMinuteResult = toDecameterPerSecond(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE);
			Speed decameterPerMinuteResult = toDecameterPerSecond(decameterPerMinuteValue, DECAMETER_PER_MINUTE);
			Speed meterPerMinuteResult = toDecameterPerSecond(meterPerMinuteValue, METER_PER_MINUTE);
			Speed decimeterPerMinuteResult = toDecameterPerSecond(decimeterPerMinuteValue, DECIMETER_PER_MINUTE);
			Speed centimeterPerMinuteResult = toDecameterPerSecond(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE);
			Speed millimeterPerMinuteResult = toDecameterPerSecond(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE);

			Speed kilometerPerHourResult = toDecameterPerSecond(kilometerPerHourValue, KILOMETER_PER_HOUR);
			Speed hectometerPerHourResult = toDecameterPerSecond(hectometerPerHourValue, HECTOMETER_PER_HOUR);
			Speed decameterPerHourResult = toDecameterPerSecond(decameterPerHourValue, DECAMETER_PER_HOUR);
			Speed meterPerHourResult = toDecameterPerSecond(meterPerHourValue, METER_PER_HOUR);
			Speed decimeterPerHourResult = toDecameterPerSecond(decimeterPerHourValue, DECIMETER_PER_HOUR);
			Speed centimeterPerHourResult = toDecameterPerSecond(centimeterPerHourValue, CENTIMETER_PER_HOUR);
			Speed millimeterPerHourResult = toDecameterPerSecond(millimeterPerHourValue, MILLIMETER_PER_HOUR);

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

        } catch (InvalidUnitException e) {
            throw e;
        }
	}
    
	@Test
    public void toMeterPerSecondTest() throws PhysicException {
        double kilometerPerSecondValue = getRandomDouble();
        double hectometerPerSecondValue = getRandomDouble();
        double decameterPerSecondValue = getRandomDouble();
        double meterPerSecondValue = getRandomDouble();
        double decimeterPerSecondValue = getRandomDouble();
        double centimeterPerSecondValue = getRandomDouble();
	    double millimeterPerSecondValue = getRandomDouble();

        double kilometerPerMinuteValue = getRandomDouble();
        double hectometerPerMinuteValue = getRandomDouble();
        double decameterPerMinuteValue = getRandomDouble();
        double meterPerMinuteValue = getRandomDouble();
        double decimeterPerMinuteValue = getRandomDouble();
        double centimeterPerMinuteValue = getRandomDouble();
	    double millimeterPerMinuteValue = getRandomDouble();

        double kilometerPerHourValue = getRandomDouble();
        double hectometerPerHourValue = getRandomDouble();
        double decameterPerHourValue = getRandomDouble();
        double meterPerHourValue = getRandomDouble();
        double decimeterPerHourValue = getRandomDouble();
        double centimeterPerHourValue = getRandomDouble();
	    double millimeterPerHourValue = getRandomDouble();
        try {
            Speed kilometerPerSecondResultTest = new Speed(BigDecimal.valueOf(kilometerPerSecondValue).multiply(SPEED_SCALES[KILOMETER_PER_SECOND - 31]).divide(SPEED_SCALES[METER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_SECOND);
			Speed hectometerPerSecondResultTest = new Speed(BigDecimal.valueOf(hectometerPerSecondValue).multiply(SPEED_SCALES[HECTOMETER_PER_SECOND - 31]).divide(SPEED_SCALES[METER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_SECOND);
			Speed decameterPerSecondResultTest = new Speed(BigDecimal.valueOf(decameterPerSecondValue).multiply(SPEED_SCALES[DECAMETER_PER_SECOND - 31]).divide(SPEED_SCALES[METER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_SECOND);
			Speed meterPerSecondResultTest = new Speed(BigDecimal.valueOf(meterPerSecondValue).multiply(SPEED_SCALES[METER_PER_SECOND - 31]).divide(SPEED_SCALES[METER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_SECOND);
			Speed decimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(decimeterPerSecondValue).multiply(SPEED_SCALES[DECIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[METER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_SECOND);
			Speed centimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(centimeterPerSecondValue).multiply(SPEED_SCALES[CENTIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[METER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_SECOND);
			Speed millimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(millimeterPerSecondValue).multiply(SPEED_SCALES[MILLIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[METER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_SECOND);

			Speed kilometerPerMinuteResultTest = new Speed(BigDecimal.valueOf(kilometerPerMinuteValue).multiply(SPEED_SCALES[KILOMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[METER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_MINUTE);
			Speed hectometerPerMinuteResultTest = new Speed(BigDecimal.valueOf(hectometerPerMinuteValue).multiply(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[METER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_MINUTE);
			Speed decameterPerMinuteResultTest = new Speed(BigDecimal.valueOf(decameterPerMinuteValue).multiply(SPEED_SCALES[DECAMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[METER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_MINUTE);
			Speed meterPerMinuteResultTest = new Speed(BigDecimal.valueOf(meterPerMinuteValue).multiply(SPEED_SCALES[METER_PER_MINUTE - 31]).divide(SPEED_SCALES[METER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_MINUTE);
			Speed decimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(decimeterPerMinuteValue).multiply(SPEED_SCALES[DECIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[METER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_MINUTE);
			Speed centimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(centimeterPerMinuteValue).multiply(SPEED_SCALES[CENTIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[METER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_MINUTE);
			Speed millimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(millimeterPerMinuteValue).multiply(SPEED_SCALES[MILLIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[METER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_MINUTE);

			Speed kilometerPerHourResultTest = new Speed(BigDecimal.valueOf(kilometerPerHourValue).multiply(SPEED_SCALES[KILOMETER_PER_HOUR - 31]).divide(SPEED_SCALES[METER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_HOUR);
			Speed hectometerPerHourResultTest = new Speed(BigDecimal.valueOf(hectometerPerHourValue).multiply(SPEED_SCALES[HECTOMETER_PER_HOUR - 31]).divide(SPEED_SCALES[METER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_HOUR);
			Speed decameterPerHourResultTest = new Speed(BigDecimal.valueOf(decameterPerHourValue).multiply(SPEED_SCALES[DECAMETER_PER_HOUR - 31]).divide(SPEED_SCALES[METER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_HOUR);
			Speed meterPerHourResultTest = new Speed(BigDecimal.valueOf(meterPerHourValue).multiply(SPEED_SCALES[METER_PER_HOUR - 31]).divide(SPEED_SCALES[METER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_HOUR);
			Speed decimeterPerHourResultTest = new Speed(BigDecimal.valueOf(decimeterPerHourValue).multiply(SPEED_SCALES[DECIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[METER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_HOUR);
			Speed centimeterPerHourResultTest = new Speed(BigDecimal.valueOf(centimeterPerHourValue).multiply(SPEED_SCALES[CENTIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[METER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_HOUR);
			Speed millimeterPerHourResultTest = new Speed(BigDecimal.valueOf(millimeterPerHourValue).multiply(SPEED_SCALES[MILLIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[METER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_HOUR);

			Speed kilometerPerSecondResult = toMeterPerSecond(kilometerPerSecondValue, KILOMETER_PER_SECOND);
			Speed hectometerPerSecondResult = toMeterPerSecond(hectometerPerSecondValue, HECTOMETER_PER_SECOND);
			Speed decameterPerSecondResult = toMeterPerSecond(decameterPerSecondValue, DECAMETER_PER_SECOND);
			Speed meterPerSecondResult = toMeterPerSecond(meterPerSecondValue, METER_PER_SECOND);
			Speed decimeterPerSecondResult = toMeterPerSecond(decimeterPerSecondValue, DECIMETER_PER_SECOND);
			Speed centimeterPerSecondResult = toMeterPerSecond(centimeterPerSecondValue, CENTIMETER_PER_SECOND);
			Speed millimeterPerSecondResult = toMeterPerSecond(millimeterPerSecondValue, MILLIMETER_PER_SECOND);

			Speed kilometerPerMinuteResult = toMeterPerSecond(kilometerPerMinuteValue, KILOMETER_PER_MINUTE);
			Speed hectometerPerMinuteResult = toMeterPerSecond(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE);
			Speed decameterPerMinuteResult = toMeterPerSecond(decameterPerMinuteValue, DECAMETER_PER_MINUTE);
			Speed meterPerMinuteResult = toMeterPerSecond(meterPerMinuteValue, METER_PER_MINUTE);
			Speed decimeterPerMinuteResult = toMeterPerSecond(decimeterPerMinuteValue, DECIMETER_PER_MINUTE);
			Speed centimeterPerMinuteResult = toMeterPerSecond(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE);
			Speed millimeterPerMinuteResult = toMeterPerSecond(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE);

			Speed kilometerPerHourResult = toMeterPerSecond(kilometerPerHourValue, KILOMETER_PER_HOUR);
			Speed hectometerPerHourResult = toMeterPerSecond(hectometerPerHourValue, HECTOMETER_PER_HOUR);
			Speed decameterPerHourResult = toMeterPerSecond(decameterPerHourValue, DECAMETER_PER_HOUR);
			Speed meterPerHourResult = toMeterPerSecond(meterPerHourValue, METER_PER_HOUR);
			Speed decimeterPerHourResult = toMeterPerSecond(decimeterPerHourValue, DECIMETER_PER_HOUR);
			Speed centimeterPerHourResult = toMeterPerSecond(centimeterPerHourValue, CENTIMETER_PER_HOUR);
			Speed millimeterPerHourResult = toMeterPerSecond(millimeterPerHourValue, MILLIMETER_PER_HOUR);

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

        } catch (InvalidUnitException e) {
            throw e;
        }
	}
	
	@Test
    public void toDecimeterPerSecondTest() throws PhysicException {
        double kilometerPerSecondValue = getRandomDouble();
        double hectometerPerSecondValue = getRandomDouble();
        double decameterPerSecondValue = getRandomDouble();
        double meterPerSecondValue = getRandomDouble();
        double decimeterPerSecondValue = getRandomDouble();
        double centimeterPerSecondValue = getRandomDouble();
	    double millimeterPerSecondValue = getRandomDouble();

        double kilometerPerMinuteValue = getRandomDouble();
        double hectometerPerMinuteValue = getRandomDouble();
        double decameterPerMinuteValue = getRandomDouble();
        double meterPerMinuteValue = getRandomDouble();
        double decimeterPerMinuteValue = getRandomDouble();
        double centimeterPerMinuteValue = getRandomDouble();
	    double millimeterPerMinuteValue = getRandomDouble();

        double kilometerPerHourValue = getRandomDouble();
        double hectometerPerHourValue = getRandomDouble();
        double decameterPerHourValue = getRandomDouble();
        double meterPerHourValue = getRandomDouble();
        double decimeterPerHourValue = getRandomDouble();
        double centimeterPerHourValue = getRandomDouble();
	    double millimeterPerHourValue = getRandomDouble();
        try {
            Speed kilometerPerSecondResultTest = new Speed(BigDecimal.valueOf(kilometerPerSecondValue).multiply(SPEED_SCALES[KILOMETER_PER_SECOND - 31]).divide(SPEED_SCALES[DECIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_SECOND);
			Speed hectometerPerSecondResultTest = new Speed(BigDecimal.valueOf(hectometerPerSecondValue).multiply(SPEED_SCALES[HECTOMETER_PER_SECOND - 31]).divide(SPEED_SCALES[DECIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_SECOND);
			Speed decameterPerSecondResultTest = new Speed(BigDecimal.valueOf(decameterPerSecondValue).multiply(SPEED_SCALES[DECAMETER_PER_SECOND - 31]).divide(SPEED_SCALES[DECIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_SECOND);
			Speed meterPerSecondResultTest = new Speed(BigDecimal.valueOf(meterPerSecondValue).multiply(SPEED_SCALES[METER_PER_SECOND - 31]).divide(SPEED_SCALES[DECIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_SECOND);
			Speed decimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(decimeterPerSecondValue).multiply(SPEED_SCALES[DECIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[DECIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_SECOND);
			Speed centimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(centimeterPerSecondValue).multiply(SPEED_SCALES[CENTIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[DECIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_SECOND);
			Speed millimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(millimeterPerSecondValue).multiply(SPEED_SCALES[MILLIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[DECIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_SECOND);

			Speed kilometerPerMinuteResultTest = new Speed(BigDecimal.valueOf(kilometerPerMinuteValue).multiply(SPEED_SCALES[KILOMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[DECIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_MINUTE);
			Speed hectometerPerMinuteResultTest = new Speed(BigDecimal.valueOf(hectometerPerMinuteValue).multiply(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[DECIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_MINUTE);
			Speed decameterPerMinuteResultTest = new Speed(BigDecimal.valueOf(decameterPerMinuteValue).multiply(SPEED_SCALES[DECAMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[DECIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_MINUTE);
			Speed meterPerMinuteResultTest = new Speed(BigDecimal.valueOf(meterPerMinuteValue).multiply(SPEED_SCALES[METER_PER_MINUTE - 31]).divide(SPEED_SCALES[DECIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_MINUTE);
			Speed decimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(decimeterPerMinuteValue).multiply(SPEED_SCALES[DECIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[DECIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_MINUTE);
			Speed centimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(centimeterPerMinuteValue).multiply(SPEED_SCALES[CENTIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[DECIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_MINUTE);
			Speed millimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(millimeterPerMinuteValue).multiply(SPEED_SCALES[MILLIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[DECIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_MINUTE);

			Speed kilometerPerHourResultTest = new Speed(BigDecimal.valueOf(kilometerPerHourValue).multiply(SPEED_SCALES[KILOMETER_PER_HOUR - 31]).divide(SPEED_SCALES[DECIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_HOUR);
			Speed hectometerPerHourResultTest = new Speed(BigDecimal.valueOf(hectometerPerHourValue).multiply(SPEED_SCALES[HECTOMETER_PER_HOUR - 31]).divide(SPEED_SCALES[DECIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_HOUR);
			Speed decameterPerHourResultTest = new Speed(BigDecimal.valueOf(decameterPerHourValue).multiply(SPEED_SCALES[DECAMETER_PER_HOUR - 31]).divide(SPEED_SCALES[DECIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_HOUR);
			Speed meterPerHourResultTest = new Speed(BigDecimal.valueOf(meterPerHourValue).multiply(SPEED_SCALES[METER_PER_HOUR - 31]).divide(SPEED_SCALES[DECIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_HOUR);
			Speed decimeterPerHourResultTest = new Speed(BigDecimal.valueOf(decimeterPerHourValue).multiply(SPEED_SCALES[DECIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[DECIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_HOUR);
			Speed centimeterPerHourResultTest = new Speed(BigDecimal.valueOf(centimeterPerHourValue).multiply(SPEED_SCALES[CENTIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[DECIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_HOUR);
			Speed millimeterPerHourResultTest = new Speed(BigDecimal.valueOf(millimeterPerHourValue).multiply(SPEED_SCALES[MILLIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[DECIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_HOUR);

			Speed kilometerPerSecondResult = toDecimeterPerSecond(kilometerPerSecondValue, KILOMETER_PER_SECOND);
			Speed hectometerPerSecondResult = toDecimeterPerSecond(hectometerPerSecondValue, HECTOMETER_PER_SECOND);
			Speed decameterPerSecondResult = toDecimeterPerSecond(decameterPerSecondValue, DECAMETER_PER_SECOND);
			Speed meterPerSecondResult = toDecimeterPerSecond(meterPerSecondValue, METER_PER_SECOND);
			Speed decimeterPerSecondResult = toDecimeterPerSecond(decimeterPerSecondValue, DECIMETER_PER_SECOND);
			Speed centimeterPerSecondResult = toDecimeterPerSecond(centimeterPerSecondValue, CENTIMETER_PER_SECOND);
			Speed millimeterPerSecondResult = toDecimeterPerSecond(millimeterPerSecondValue, MILLIMETER_PER_SECOND);

			Speed kilometerPerMinuteResult = toDecimeterPerSecond(kilometerPerMinuteValue, KILOMETER_PER_MINUTE);
			Speed hectometerPerMinuteResult = toDecimeterPerSecond(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE);
			Speed decameterPerMinuteResult = toDecimeterPerSecond(decameterPerMinuteValue, DECAMETER_PER_MINUTE);
			Speed meterPerMinuteResult = toDecimeterPerSecond(meterPerMinuteValue, METER_PER_MINUTE);
			Speed decimeterPerMinuteResult = toDecimeterPerSecond(decimeterPerMinuteValue, DECIMETER_PER_MINUTE);
			Speed centimeterPerMinuteResult = toDecimeterPerSecond(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE);
			Speed millimeterPerMinuteResult = toDecimeterPerSecond(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE);

			Speed kilometerPerHourResult = toDecimeterPerSecond(kilometerPerHourValue, KILOMETER_PER_HOUR);
			Speed hectometerPerHourResult = toDecimeterPerSecond(hectometerPerHourValue, HECTOMETER_PER_HOUR);
			Speed decameterPerHourResult = toDecimeterPerSecond(decameterPerHourValue, DECAMETER_PER_HOUR);
			Speed meterPerHourResult = toDecimeterPerSecond(meterPerHourValue, METER_PER_HOUR);
			Speed decimeterPerHourResult = toDecimeterPerSecond(decimeterPerHourValue, DECIMETER_PER_HOUR);
			Speed centimeterPerHourResult = toDecimeterPerSecond(centimeterPerHourValue, CENTIMETER_PER_HOUR);
			Speed millimeterPerHourResult = toDecimeterPerSecond(millimeterPerHourValue, MILLIMETER_PER_HOUR);

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

        } catch (InvalidUnitException e) {
            throw e;
        }
	}
	
	@Test
    public void toCentimeterPerSecondTest() throws PhysicException {
        double kilometerPerSecondValue = getRandomDouble();
        double hectometerPerSecondValue = getRandomDouble();
        double decameterPerSecondValue = getRandomDouble();
        double meterPerSecondValue = getRandomDouble();
        double decimeterPerSecondValue = getRandomDouble();
        double centimeterPerSecondValue = getRandomDouble();
	    double millimeterPerSecondValue = getRandomDouble();

        double kilometerPerMinuteValue = getRandomDouble();
        double hectometerPerMinuteValue = getRandomDouble();
        double decameterPerMinuteValue = getRandomDouble();
        double meterPerMinuteValue = getRandomDouble();
        double decimeterPerMinuteValue = getRandomDouble();
        double centimeterPerMinuteValue = getRandomDouble();
	    double millimeterPerMinuteValue = getRandomDouble();

        double kilometerPerHourValue = getRandomDouble();
        double hectometerPerHourValue = getRandomDouble();
        double decameterPerHourValue = getRandomDouble();
        double meterPerHourValue = getRandomDouble();
        double decimeterPerHourValue = getRandomDouble();
        double centimeterPerHourValue = getRandomDouble();
	    double millimeterPerHourValue = getRandomDouble();
        try {
            Speed kilometerPerSecondResultTest = new Speed(BigDecimal.valueOf(kilometerPerSecondValue).multiply(SPEED_SCALES[KILOMETER_PER_SECOND - 31]).divide(SPEED_SCALES[CENTIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_SECOND);
			Speed hectometerPerSecondResultTest = new Speed(BigDecimal.valueOf(hectometerPerSecondValue).multiply(SPEED_SCALES[HECTOMETER_PER_SECOND - 31]).divide(SPEED_SCALES[CENTIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_SECOND);
			Speed decameterPerSecondResultTest = new Speed(BigDecimal.valueOf(decameterPerSecondValue).multiply(SPEED_SCALES[DECAMETER_PER_SECOND - 31]).divide(SPEED_SCALES[CENTIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_SECOND);
			Speed meterPerSecondResultTest = new Speed(BigDecimal.valueOf(meterPerSecondValue).multiply(SPEED_SCALES[METER_PER_SECOND - 31]).divide(SPEED_SCALES[CENTIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_SECOND);
			Speed decimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(decimeterPerSecondValue).multiply(SPEED_SCALES[DECIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[CENTIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_SECOND);
			Speed centimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(centimeterPerSecondValue).multiply(SPEED_SCALES[CENTIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[CENTIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_SECOND);
			Speed millimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(millimeterPerSecondValue).multiply(SPEED_SCALES[MILLIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[CENTIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_SECOND);

			Speed kilometerPerMinuteResultTest = new Speed(BigDecimal.valueOf(kilometerPerMinuteValue).multiply(SPEED_SCALES[KILOMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[CENTIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_MINUTE);
			Speed hectometerPerMinuteResultTest = new Speed(BigDecimal.valueOf(hectometerPerMinuteValue).multiply(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[CENTIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_MINUTE);
			Speed decameterPerMinuteResultTest = new Speed(BigDecimal.valueOf(decameterPerMinuteValue).multiply(SPEED_SCALES[DECAMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[CENTIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_MINUTE);
			Speed meterPerMinuteResultTest = new Speed(BigDecimal.valueOf(meterPerMinuteValue).multiply(SPEED_SCALES[METER_PER_MINUTE - 31]).divide(SPEED_SCALES[CENTIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_MINUTE);
			Speed decimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(decimeterPerMinuteValue).multiply(SPEED_SCALES[DECIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[CENTIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_MINUTE);
			Speed centimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(centimeterPerMinuteValue).multiply(SPEED_SCALES[CENTIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[CENTIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_MINUTE);
			Speed millimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(millimeterPerMinuteValue).multiply(SPEED_SCALES[MILLIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[CENTIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_MINUTE);

			Speed kilometerPerHourResultTest = new Speed(BigDecimal.valueOf(kilometerPerHourValue).multiply(SPEED_SCALES[KILOMETER_PER_HOUR - 31]).divide(SPEED_SCALES[CENTIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_HOUR);
			Speed hectometerPerHourResultTest = new Speed(BigDecimal.valueOf(hectometerPerHourValue).multiply(SPEED_SCALES[HECTOMETER_PER_HOUR - 31]).divide(SPEED_SCALES[CENTIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_HOUR);
			Speed decameterPerHourResultTest = new Speed(BigDecimal.valueOf(decameterPerHourValue).multiply(SPEED_SCALES[DECAMETER_PER_HOUR - 31]).divide(SPEED_SCALES[CENTIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_HOUR);
			Speed meterPerHourResultTest = new Speed(BigDecimal.valueOf(meterPerHourValue).multiply(SPEED_SCALES[METER_PER_HOUR - 31]).divide(SPEED_SCALES[CENTIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_HOUR);
			Speed decimeterPerHourResultTest = new Speed(BigDecimal.valueOf(decimeterPerHourValue).multiply(SPEED_SCALES[DECIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[CENTIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_HOUR);
			Speed centimeterPerHourResultTest = new Speed(BigDecimal.valueOf(centimeterPerHourValue).multiply(SPEED_SCALES[CENTIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[CENTIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_HOUR);
			Speed millimeterPerHourResultTest = new Speed(BigDecimal.valueOf(millimeterPerHourValue).multiply(SPEED_SCALES[MILLIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[CENTIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_HOUR);

			Speed kilometerPerSecondResult = toCentimeterPerSecond(kilometerPerSecondValue, KILOMETER_PER_SECOND);
			Speed hectometerPerSecondResult = toCentimeterPerSecond(hectometerPerSecondValue, HECTOMETER_PER_SECOND);
			Speed decameterPerSecondResult = toCentimeterPerSecond(decameterPerSecondValue, DECAMETER_PER_SECOND);
			Speed meterPerSecondResult = toCentimeterPerSecond(meterPerSecondValue, METER_PER_SECOND);
			Speed decimeterPerSecondResult = toCentimeterPerSecond(decimeterPerSecondValue, DECIMETER_PER_SECOND);
			Speed centimeterPerSecondResult = toCentimeterPerSecond(centimeterPerSecondValue, CENTIMETER_PER_SECOND);
			Speed millimeterPerSecondResult = toCentimeterPerSecond(millimeterPerSecondValue, MILLIMETER_PER_SECOND);

			Speed kilometerPerMinuteResult = toCentimeterPerSecond(kilometerPerMinuteValue, KILOMETER_PER_MINUTE);
			Speed hectometerPerMinuteResult = toCentimeterPerSecond(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE);
			Speed decameterPerMinuteResult = toCentimeterPerSecond(decameterPerMinuteValue, DECAMETER_PER_MINUTE);
			Speed meterPerMinuteResult = toCentimeterPerSecond(meterPerMinuteValue, METER_PER_MINUTE);
			Speed decimeterPerMinuteResult = toCentimeterPerSecond(decimeterPerMinuteValue, DECIMETER_PER_MINUTE);
			Speed centimeterPerMinuteResult = toCentimeterPerSecond(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE);
			Speed millimeterPerMinuteResult = toCentimeterPerSecond(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE);

			Speed kilometerPerHourResult = toCentimeterPerSecond(kilometerPerHourValue, KILOMETER_PER_HOUR);
			Speed hectometerPerHourResult = toCentimeterPerSecond(hectometerPerHourValue, HECTOMETER_PER_HOUR);
			Speed decameterPerHourResult = toCentimeterPerSecond(decameterPerHourValue, DECAMETER_PER_HOUR);
			Speed meterPerHourResult = toCentimeterPerSecond(meterPerHourValue, METER_PER_HOUR);
			Speed decimeterPerHourResult = toCentimeterPerSecond(decimeterPerHourValue, DECIMETER_PER_HOUR);
			Speed centimeterPerHourResult = toCentimeterPerSecond(centimeterPerHourValue, CENTIMETER_PER_HOUR);
			Speed millimeterPerHourResult = toCentimeterPerSecond(millimeterPerHourValue, MILLIMETER_PER_HOUR);

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

        } catch (InvalidUnitException e) {
            throw e;
        }
	}
	
	@Test
    public void toMillimeterPerSecondTest() throws PhysicException {
        double kilometerPerSecondValue = getRandomDouble();
        double hectometerPerSecondValue = getRandomDouble();
        double decameterPerSecondValue = getRandomDouble();
        double meterPerSecondValue = getRandomDouble();
        double decimeterPerSecondValue = getRandomDouble();
        double centimeterPerSecondValue = getRandomDouble();
	    double millimeterPerSecondValue = getRandomDouble();

        double kilometerPerMinuteValue = getRandomDouble();
        double hectometerPerMinuteValue = getRandomDouble();
        double decameterPerMinuteValue = getRandomDouble();
        double meterPerMinuteValue = getRandomDouble();
        double decimeterPerMinuteValue = getRandomDouble();
        double centimeterPerMinuteValue = getRandomDouble();
	    double millimeterPerMinuteValue = getRandomDouble();

        double kilometerPerHourValue = getRandomDouble();
        double hectometerPerHourValue = getRandomDouble();
        double decameterPerHourValue = getRandomDouble();
        double meterPerHourValue = getRandomDouble();
        double decimeterPerHourValue = getRandomDouble();
        double centimeterPerHourValue = getRandomDouble();
	    double millimeterPerHourValue = getRandomDouble();
        try {
            Speed kilometerPerSecondResultTest = new Speed(BigDecimal.valueOf(kilometerPerSecondValue).multiply(SPEED_SCALES[KILOMETER_PER_SECOND - 31]).divide(SPEED_SCALES[MILLIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_SECOND);
			Speed hectometerPerSecondResultTest = new Speed(BigDecimal.valueOf(hectometerPerSecondValue).multiply(SPEED_SCALES[HECTOMETER_PER_SECOND - 31]).divide(SPEED_SCALES[MILLIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_SECOND);
			Speed decameterPerSecondResultTest = new Speed(BigDecimal.valueOf(decameterPerSecondValue).multiply(SPEED_SCALES[DECAMETER_PER_SECOND - 31]).divide(SPEED_SCALES[MILLIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_SECOND);
			Speed meterPerSecondResultTest = new Speed(BigDecimal.valueOf(meterPerSecondValue).multiply(SPEED_SCALES[METER_PER_SECOND - 31]).divide(SPEED_SCALES[MILLIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_SECOND);
			Speed decimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(decimeterPerSecondValue).multiply(SPEED_SCALES[DECIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[MILLIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_SECOND);
			Speed centimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(centimeterPerSecondValue).multiply(SPEED_SCALES[CENTIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[MILLIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_SECOND);
			Speed millimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(millimeterPerSecondValue).multiply(SPEED_SCALES[MILLIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[MILLIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_SECOND);

			Speed kilometerPerMinuteResultTest = new Speed(BigDecimal.valueOf(kilometerPerMinuteValue).multiply(SPEED_SCALES[KILOMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[MILLIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_MINUTE);
			Speed hectometerPerMinuteResultTest = new Speed(BigDecimal.valueOf(hectometerPerMinuteValue).multiply(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[MILLIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_MINUTE);
			Speed decameterPerMinuteResultTest = new Speed(BigDecimal.valueOf(decameterPerMinuteValue).multiply(SPEED_SCALES[DECAMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[MILLIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_MINUTE);
			Speed meterPerMinuteResultTest = new Speed(BigDecimal.valueOf(meterPerMinuteValue).multiply(SPEED_SCALES[METER_PER_MINUTE - 31]).divide(SPEED_SCALES[MILLIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_MINUTE);
			Speed decimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(decimeterPerMinuteValue).multiply(SPEED_SCALES[DECIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[MILLIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_MINUTE);
			Speed centimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(centimeterPerMinuteValue).multiply(SPEED_SCALES[CENTIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[MILLIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_MINUTE);
			Speed millimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(millimeterPerMinuteValue).multiply(SPEED_SCALES[MILLIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[MILLIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_MINUTE);

			Speed kilometerPerHourResultTest = new Speed(BigDecimal.valueOf(kilometerPerHourValue).multiply(SPEED_SCALES[KILOMETER_PER_HOUR - 31]).divide(SPEED_SCALES[MILLIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_HOUR);
			Speed hectometerPerHourResultTest = new Speed(BigDecimal.valueOf(hectometerPerHourValue).multiply(SPEED_SCALES[HECTOMETER_PER_HOUR - 31]).divide(SPEED_SCALES[MILLIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_HOUR);
			Speed decameterPerHourResultTest = new Speed(BigDecimal.valueOf(decameterPerHourValue).multiply(SPEED_SCALES[DECAMETER_PER_HOUR - 31]).divide(SPEED_SCALES[MILLIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_HOUR);
			Speed meterPerHourResultTest = new Speed(BigDecimal.valueOf(meterPerHourValue).multiply(SPEED_SCALES[METER_PER_HOUR - 31]).divide(SPEED_SCALES[MILLIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_HOUR);
			Speed decimeterPerHourResultTest = new Speed(BigDecimal.valueOf(decimeterPerHourValue).multiply(SPEED_SCALES[DECIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[MILLIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_HOUR);
			Speed centimeterPerHourResultTest = new Speed(BigDecimal.valueOf(centimeterPerHourValue).multiply(SPEED_SCALES[CENTIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[MILLIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_HOUR);
			Speed millimeterPerHourResultTest = new Speed(BigDecimal.valueOf(millimeterPerHourValue).multiply(SPEED_SCALES[MILLIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[MILLIMETER_PER_SECOND - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_HOUR);

			Speed kilometerPerSecondResult = toMillimeterPerSecond(kilometerPerSecondValue, KILOMETER_PER_SECOND);
			Speed hectometerPerSecondResult = toMillimeterPerSecond(hectometerPerSecondValue, HECTOMETER_PER_SECOND);
			Speed decameterPerSecondResult = toMillimeterPerSecond(decameterPerSecondValue, DECAMETER_PER_SECOND);
			Speed meterPerSecondResult = toMillimeterPerSecond(meterPerSecondValue, METER_PER_SECOND);
			Speed decimeterPerSecondResult = toMillimeterPerSecond(decimeterPerSecondValue, DECIMETER_PER_SECOND);
			Speed centimeterPerSecondResult = toMillimeterPerSecond(centimeterPerSecondValue, CENTIMETER_PER_SECOND);
			Speed millimeterPerSecondResult = toMillimeterPerSecond(millimeterPerSecondValue, MILLIMETER_PER_SECOND);

			Speed kilometerPerMinuteResult = toMillimeterPerSecond(kilometerPerMinuteValue, KILOMETER_PER_MINUTE);
			Speed hectometerPerMinuteResult = toMillimeterPerSecond(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE);
			Speed decameterPerMinuteResult = toMillimeterPerSecond(decameterPerMinuteValue, DECAMETER_PER_MINUTE);
			Speed meterPerMinuteResult = toMillimeterPerSecond(meterPerMinuteValue, METER_PER_MINUTE);
			Speed decimeterPerMinuteResult = toMillimeterPerSecond(decimeterPerMinuteValue, DECIMETER_PER_MINUTE);
			Speed centimeterPerMinuteResult = toMillimeterPerSecond(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE);
			Speed millimeterPerMinuteResult = toMillimeterPerSecond(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE);

			Speed kilometerPerHourResult = toMillimeterPerSecond(kilometerPerHourValue, KILOMETER_PER_HOUR);
			Speed hectometerPerHourResult = toMillimeterPerSecond(hectometerPerHourValue, HECTOMETER_PER_HOUR);
			Speed decameterPerHourResult = toMillimeterPerSecond(decameterPerHourValue, DECAMETER_PER_HOUR);
			Speed meterPerHourResult = toMillimeterPerSecond(meterPerHourValue, METER_PER_HOUR);
			Speed decimeterPerHourResult = toMillimeterPerSecond(decimeterPerHourValue, DECIMETER_PER_HOUR);
			Speed centimeterPerHourResult = toMillimeterPerSecond(centimeterPerHourValue, CENTIMETER_PER_HOUR);
			Speed millimeterPerHourResult = toMillimeterPerSecond(millimeterPerHourValue, MILLIMETER_PER_HOUR);

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

        } catch (InvalidUnitException e) {
            throw e;
        }
	}
	
	@Test
    public void toKilometerPerMinuteTest() throws PhysicException {
        double kilometerPerSecondValue = getRandomDouble();
        double hectometerPerSecondValue = getRandomDouble();
        double decameterPerSecondValue = getRandomDouble();
        double meterPerSecondValue = getRandomDouble();
        double decimeterPerSecondValue = getRandomDouble();
        double centimeterPerSecondValue = getRandomDouble();
	    double millimeterPerSecondValue = getRandomDouble();

        double kilometerPerMinuteValue = getRandomDouble();
        double hectometerPerMinuteValue = getRandomDouble();
        double decameterPerMinuteValue = getRandomDouble();
        double meterPerMinuteValue = getRandomDouble();
        double decimeterPerMinuteValue = getRandomDouble();
        double centimeterPerMinuteValue = getRandomDouble();
	    double millimeterPerMinuteValue = getRandomDouble();

        double kilometerPerHourValue = getRandomDouble();
        double hectometerPerHourValue = getRandomDouble();
        double decameterPerHourValue = getRandomDouble();
        double meterPerHourValue = getRandomDouble();
        double decimeterPerHourValue = getRandomDouble();
        double centimeterPerHourValue = getRandomDouble();
	    double millimeterPerHourValue = getRandomDouble();
        try {
            Speed kilometerPerSecondResultTest = new Speed(BigDecimal.valueOf(kilometerPerSecondValue).multiply(SPEED_SCALES[KILOMETER_PER_SECOND - 31]).divide(SPEED_SCALES[KILOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_SECOND);
			Speed hectometerPerSecondResultTest = new Speed(BigDecimal.valueOf(hectometerPerSecondValue).multiply(SPEED_SCALES[HECTOMETER_PER_SECOND - 31]).divide(SPEED_SCALES[KILOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_SECOND);
			Speed decameterPerSecondResultTest = new Speed(BigDecimal.valueOf(decameterPerSecondValue).multiply(SPEED_SCALES[DECAMETER_PER_SECOND - 31]).divide(SPEED_SCALES[KILOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_SECOND);
			Speed meterPerSecondResultTest = new Speed(BigDecimal.valueOf(meterPerSecondValue).multiply(SPEED_SCALES[METER_PER_SECOND - 31]).divide(SPEED_SCALES[KILOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_SECOND);
			Speed decimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(decimeterPerSecondValue).multiply(SPEED_SCALES[DECIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[KILOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_SECOND);
			Speed centimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(centimeterPerSecondValue).multiply(SPEED_SCALES[CENTIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[KILOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_SECOND);
			Speed millimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(millimeterPerSecondValue).multiply(SPEED_SCALES[MILLIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[KILOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_SECOND);

			Speed kilometerPerMinuteResultTest = new Speed(BigDecimal.valueOf(kilometerPerMinuteValue).multiply(SPEED_SCALES[KILOMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[KILOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_MINUTE);
			Speed hectometerPerMinuteResultTest = new Speed(BigDecimal.valueOf(hectometerPerMinuteValue).multiply(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[KILOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_MINUTE);
			Speed decameterPerMinuteResultTest = new Speed(BigDecimal.valueOf(decameterPerMinuteValue).multiply(SPEED_SCALES[DECAMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[KILOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_MINUTE);
			Speed meterPerMinuteResultTest = new Speed(BigDecimal.valueOf(meterPerMinuteValue).multiply(SPEED_SCALES[METER_PER_MINUTE - 31]).divide(SPEED_SCALES[KILOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_MINUTE);
			Speed decimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(decimeterPerMinuteValue).multiply(SPEED_SCALES[DECIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[KILOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_MINUTE);
			Speed centimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(centimeterPerMinuteValue).multiply(SPEED_SCALES[CENTIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[KILOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_MINUTE);
			Speed millimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(millimeterPerMinuteValue).multiply(SPEED_SCALES[MILLIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[KILOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_MINUTE);

			Speed kilometerPerHourResultTest = new Speed(BigDecimal.valueOf(kilometerPerHourValue).multiply(SPEED_SCALES[KILOMETER_PER_HOUR - 31]).divide(SPEED_SCALES[KILOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_HOUR);
			Speed hectometerPerHourResultTest = new Speed(BigDecimal.valueOf(hectometerPerHourValue).multiply(SPEED_SCALES[HECTOMETER_PER_HOUR - 31]).divide(SPEED_SCALES[KILOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_HOUR);
			Speed decameterPerHourResultTest = new Speed(BigDecimal.valueOf(decameterPerHourValue).multiply(SPEED_SCALES[DECAMETER_PER_HOUR - 31]).divide(SPEED_SCALES[KILOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_HOUR);
			Speed meterPerHourResultTest = new Speed(BigDecimal.valueOf(meterPerHourValue).multiply(SPEED_SCALES[METER_PER_HOUR - 31]).divide(SPEED_SCALES[KILOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_HOUR);
			Speed decimeterPerHourResultTest = new Speed(BigDecimal.valueOf(decimeterPerHourValue).multiply(SPEED_SCALES[DECIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[KILOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_HOUR);
			Speed centimeterPerHourResultTest = new Speed(BigDecimal.valueOf(centimeterPerHourValue).multiply(SPEED_SCALES[CENTIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[KILOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_HOUR);
			Speed millimeterPerHourResultTest = new Speed(BigDecimal.valueOf(millimeterPerHourValue).multiply(SPEED_SCALES[MILLIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[KILOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_HOUR);

			Speed kilometerPerSecondResult = toKilometerPerMinute(kilometerPerSecondValue, KILOMETER_PER_SECOND);
			Speed hectometerPerSecondResult = toKilometerPerMinute(hectometerPerSecondValue, HECTOMETER_PER_SECOND);
			Speed decameterPerSecondResult = toKilometerPerMinute(decameterPerSecondValue, DECAMETER_PER_SECOND);
			Speed meterPerSecondResult = toKilometerPerMinute(meterPerSecondValue, METER_PER_SECOND);
			Speed decimeterPerSecondResult = toKilometerPerMinute(decimeterPerSecondValue, DECIMETER_PER_SECOND);
			Speed centimeterPerSecondResult = toKilometerPerMinute(centimeterPerSecondValue, CENTIMETER_PER_SECOND);
			Speed millimeterPerSecondResult = toKilometerPerMinute(millimeterPerSecondValue, MILLIMETER_PER_SECOND);

			Speed kilometerPerMinuteResult = toKilometerPerMinute(kilometerPerMinuteValue, KILOMETER_PER_MINUTE);
			Speed hectometerPerMinuteResult = toKilometerPerMinute(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE);
			Speed decameterPerMinuteResult = toKilometerPerMinute(decameterPerMinuteValue, DECAMETER_PER_MINUTE);
			Speed meterPerMinuteResult = toKilometerPerMinute(meterPerMinuteValue, METER_PER_MINUTE);
			Speed decimeterPerMinuteResult = toKilometerPerMinute(decimeterPerMinuteValue, DECIMETER_PER_MINUTE);
			Speed centimeterPerMinuteResult = toKilometerPerMinute(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE);
			Speed millimeterPerMinuteResult = toKilometerPerMinute(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE);

			Speed kilometerPerHourResult = toKilometerPerMinute(kilometerPerHourValue, KILOMETER_PER_HOUR);
			Speed hectometerPerHourResult = toKilometerPerMinute(hectometerPerHourValue, HECTOMETER_PER_HOUR);
			Speed decameterPerHourResult = toKilometerPerMinute(decameterPerHourValue, DECAMETER_PER_HOUR);
			Speed meterPerHourResult = toKilometerPerMinute(meterPerHourValue, METER_PER_HOUR);
			Speed decimeterPerHourResult = toKilometerPerMinute(decimeterPerHourValue, DECIMETER_PER_HOUR);
			Speed centimeterPerHourResult = toKilometerPerMinute(centimeterPerHourValue, CENTIMETER_PER_HOUR);
			Speed millimeterPerHourResult = toKilometerPerMinute(millimeterPerHourValue, MILLIMETER_PER_HOUR);

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

        } catch (InvalidUnitException e) {
            throw e;
        }
    }
	
	@Test
    public void toHectometerPerMinuteTest() throws PhysicException {
        double kilometerPerSecondValue = getRandomDouble();
        double hectometerPerSecondValue = getRandomDouble();
        double decameterPerSecondValue = getRandomDouble();
        double meterPerSecondValue = getRandomDouble();
        double decimeterPerSecondValue = getRandomDouble();
        double centimeterPerSecondValue = getRandomDouble();
	    double millimeterPerSecondValue = getRandomDouble();

        double kilometerPerMinuteValue = getRandomDouble();
        double hectometerPerMinuteValue = getRandomDouble();
        double decameterPerMinuteValue = getRandomDouble();
        double meterPerMinuteValue = getRandomDouble();
        double decimeterPerMinuteValue = getRandomDouble();
        double centimeterPerMinuteValue = getRandomDouble();
	    double millimeterPerMinuteValue = getRandomDouble();

        double kilometerPerHourValue = getRandomDouble();
        double hectometerPerHourValue = getRandomDouble();
        double decameterPerHourValue = getRandomDouble();
        double meterPerHourValue = getRandomDouble();
        double decimeterPerHourValue = getRandomDouble();
        double centimeterPerHourValue = getRandomDouble();
	    double millimeterPerHourValue = getRandomDouble();
        try {
            Speed kilometerPerSecondResultTest = new Speed(BigDecimal.valueOf(kilometerPerSecondValue).multiply(SPEED_SCALES[KILOMETER_PER_SECOND - 31]).divide(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_SECOND);
			Speed hectometerPerSecondResultTest = new Speed(BigDecimal.valueOf(hectometerPerSecondValue).multiply(SPEED_SCALES[HECTOMETER_PER_SECOND - 31]).divide(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_SECOND);
			Speed decameterPerSecondResultTest = new Speed(BigDecimal.valueOf(decameterPerSecondValue).multiply(SPEED_SCALES[DECAMETER_PER_SECOND - 31]).divide(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_SECOND);
			Speed meterPerSecondResultTest = new Speed(BigDecimal.valueOf(meterPerSecondValue).multiply(SPEED_SCALES[METER_PER_SECOND - 31]).divide(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_SECOND);
			Speed decimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(decimeterPerSecondValue).multiply(SPEED_SCALES[DECIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_SECOND);
			Speed centimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(centimeterPerSecondValue).multiply(SPEED_SCALES[CENTIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_SECOND);
			Speed millimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(millimeterPerSecondValue).multiply(SPEED_SCALES[MILLIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_SECOND);

			Speed kilometerPerMinuteResultTest = new Speed(BigDecimal.valueOf(kilometerPerMinuteValue).multiply(SPEED_SCALES[KILOMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_MINUTE);
			Speed hectometerPerMinuteResultTest = new Speed(BigDecimal.valueOf(hectometerPerMinuteValue).multiply(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_MINUTE);
			Speed decameterPerMinuteResultTest = new Speed(BigDecimal.valueOf(decameterPerMinuteValue).multiply(SPEED_SCALES[DECAMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_MINUTE);
			Speed meterPerMinuteResultTest = new Speed(BigDecimal.valueOf(meterPerMinuteValue).multiply(SPEED_SCALES[METER_PER_MINUTE - 31]).divide(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_MINUTE);
			Speed decimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(decimeterPerMinuteValue).multiply(SPEED_SCALES[DECIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_MINUTE);
			Speed centimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(centimeterPerMinuteValue).multiply(SPEED_SCALES[CENTIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_MINUTE);
			Speed millimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(millimeterPerMinuteValue).multiply(SPEED_SCALES[MILLIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_MINUTE);

			Speed kilometerPerHourResultTest = new Speed(BigDecimal.valueOf(kilometerPerHourValue).multiply(SPEED_SCALES[KILOMETER_PER_HOUR - 31]).divide(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_HOUR);
			Speed hectometerPerHourResultTest = new Speed(BigDecimal.valueOf(hectometerPerHourValue).multiply(SPEED_SCALES[HECTOMETER_PER_HOUR - 31]).divide(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_HOUR);
			Speed decameterPerHourResultTest = new Speed(BigDecimal.valueOf(decameterPerHourValue).multiply(SPEED_SCALES[DECAMETER_PER_HOUR - 31]).divide(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_HOUR);
			Speed meterPerHourResultTest = new Speed(BigDecimal.valueOf(meterPerHourValue).multiply(SPEED_SCALES[METER_PER_HOUR - 31]).divide(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_HOUR);
			Speed decimeterPerHourResultTest = new Speed(BigDecimal.valueOf(decimeterPerHourValue).multiply(SPEED_SCALES[DECIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_HOUR);
			Speed centimeterPerHourResultTest = new Speed(BigDecimal.valueOf(centimeterPerHourValue).multiply(SPEED_SCALES[CENTIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_HOUR);
			Speed millimeterPerHourResultTest = new Speed(BigDecimal.valueOf(millimeterPerHourValue).multiply(SPEED_SCALES[MILLIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_HOUR);

			Speed kilometerPerSecondResult = toHectometerPerMinute(kilometerPerSecondValue, KILOMETER_PER_SECOND);
			Speed hectometerPerSecondResult = toHectometerPerMinute(hectometerPerSecondValue, HECTOMETER_PER_SECOND);
			Speed decameterPerSecondResult = toHectometerPerMinute(decameterPerSecondValue, DECAMETER_PER_SECOND);
			Speed meterPerSecondResult = toHectometerPerMinute(meterPerSecondValue, METER_PER_SECOND);
			Speed decimeterPerSecondResult = toHectometerPerMinute(decimeterPerSecondValue, DECIMETER_PER_SECOND);
			Speed centimeterPerSecondResult = toHectometerPerMinute(centimeterPerSecondValue, CENTIMETER_PER_SECOND);
			Speed millimeterPerSecondResult = toHectometerPerMinute(millimeterPerSecondValue, MILLIMETER_PER_SECOND);

			Speed kilometerPerMinuteResult = toHectometerPerMinute(kilometerPerMinuteValue, KILOMETER_PER_MINUTE);
			Speed hectometerPerMinuteResult = toHectometerPerMinute(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE);
			Speed decameterPerMinuteResult = toHectometerPerMinute(decameterPerMinuteValue, DECAMETER_PER_MINUTE);
			Speed meterPerMinuteResult = toHectometerPerMinute(meterPerMinuteValue, METER_PER_MINUTE);
			Speed decimeterPerMinuteResult = toHectometerPerMinute(decimeterPerMinuteValue, DECIMETER_PER_MINUTE);
			Speed centimeterPerMinuteResult = toHectometerPerMinute(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE);
			Speed millimeterPerMinuteResult = toHectometerPerMinute(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE);

			Speed kilometerPerHourResult = toHectometerPerMinute(kilometerPerHourValue, KILOMETER_PER_HOUR);
			Speed hectometerPerHourResult = toHectometerPerMinute(hectometerPerHourValue, HECTOMETER_PER_HOUR);
			Speed decameterPerHourResult = toHectometerPerMinute(decameterPerHourValue, DECAMETER_PER_HOUR);
			Speed meterPerHourResult = toHectometerPerMinute(meterPerHourValue, METER_PER_HOUR);
			Speed decimeterPerHourResult = toHectometerPerMinute(decimeterPerHourValue, DECIMETER_PER_HOUR);
			Speed centimeterPerHourResult = toHectometerPerMinute(centimeterPerHourValue, CENTIMETER_PER_HOUR);
			Speed millimeterPerHourResult = toHectometerPerMinute(millimeterPerHourValue, MILLIMETER_PER_HOUR);

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

        } catch (InvalidUnitException e) {
            throw e;
        }
    }
	
	@Test
    public void toDecameterPerMinuteTest() throws PhysicException {
        double kilometerPerSecondValue = getRandomDouble();
        double hectometerPerSecondValue = getRandomDouble();
        double decameterPerSecondValue = getRandomDouble();
        double meterPerSecondValue = getRandomDouble();
        double decimeterPerSecondValue = getRandomDouble();
        double centimeterPerSecondValue = getRandomDouble();
	    double millimeterPerSecondValue = getRandomDouble();

        double kilometerPerMinuteValue = getRandomDouble();
        double hectometerPerMinuteValue = getRandomDouble();
        double decameterPerMinuteValue = getRandomDouble();
        double meterPerMinuteValue = getRandomDouble();
        double decimeterPerMinuteValue = getRandomDouble();
        double centimeterPerMinuteValue = getRandomDouble();
	    double millimeterPerMinuteValue = getRandomDouble();

        double kilometerPerHourValue = getRandomDouble();
        double hectometerPerHourValue = getRandomDouble();
        double decameterPerHourValue = getRandomDouble();
        double meterPerHourValue = getRandomDouble();
        double decimeterPerHourValue = getRandomDouble();
        double centimeterPerHourValue = getRandomDouble();
	    double millimeterPerHourValue = getRandomDouble();
        try {
            Speed kilometerPerSecondResultTest = new Speed(BigDecimal.valueOf(kilometerPerSecondValue).multiply(SPEED_SCALES[KILOMETER_PER_SECOND - 31]).divide(SPEED_SCALES[DECAMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_SECOND);
			Speed hectometerPerSecondResultTest = new Speed(BigDecimal.valueOf(hectometerPerSecondValue).multiply(SPEED_SCALES[HECTOMETER_PER_SECOND - 31]).divide(SPEED_SCALES[DECAMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_SECOND);
			Speed decameterPerSecondResultTest = new Speed(BigDecimal.valueOf(decameterPerSecondValue).multiply(SPEED_SCALES[DECAMETER_PER_SECOND - 31]).divide(SPEED_SCALES[DECAMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_SECOND);
			Speed meterPerSecondResultTest = new Speed(BigDecimal.valueOf(meterPerSecondValue).multiply(SPEED_SCALES[METER_PER_SECOND - 31]).divide(SPEED_SCALES[DECAMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_SECOND);
			Speed decimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(decimeterPerSecondValue).multiply(SPEED_SCALES[DECIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[DECAMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_SECOND);
			Speed centimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(centimeterPerSecondValue).multiply(SPEED_SCALES[CENTIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[DECAMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_SECOND);
			Speed millimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(millimeterPerSecondValue).multiply(SPEED_SCALES[MILLIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[DECAMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_SECOND);

			Speed kilometerPerMinuteResultTest = new Speed(BigDecimal.valueOf(kilometerPerMinuteValue).multiply(SPEED_SCALES[KILOMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[DECAMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_MINUTE);
			Speed hectometerPerMinuteResultTest = new Speed(BigDecimal.valueOf(hectometerPerMinuteValue).multiply(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[DECAMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_MINUTE);
			Speed decameterPerMinuteResultTest = new Speed(BigDecimal.valueOf(decameterPerMinuteValue).multiply(SPEED_SCALES[DECAMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[DECAMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_MINUTE);
			Speed meterPerMinuteResultTest = new Speed(BigDecimal.valueOf(meterPerMinuteValue).multiply(SPEED_SCALES[METER_PER_MINUTE - 31]).divide(SPEED_SCALES[DECAMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_MINUTE);
			Speed decimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(decimeterPerMinuteValue).multiply(SPEED_SCALES[DECIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[DECAMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_MINUTE);
			Speed centimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(centimeterPerMinuteValue).multiply(SPEED_SCALES[CENTIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[DECAMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_MINUTE);
			Speed millimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(millimeterPerMinuteValue).multiply(SPEED_SCALES[MILLIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[DECAMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_MINUTE);

			Speed kilometerPerHourResultTest = new Speed(BigDecimal.valueOf(kilometerPerHourValue).multiply(SPEED_SCALES[KILOMETER_PER_HOUR - 31]).divide(SPEED_SCALES[DECAMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_HOUR);
			Speed hectometerPerHourResultTest = new Speed(BigDecimal.valueOf(hectometerPerHourValue).multiply(SPEED_SCALES[HECTOMETER_PER_HOUR - 31]).divide(SPEED_SCALES[DECAMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_HOUR);
			Speed decameterPerHourResultTest = new Speed(BigDecimal.valueOf(decameterPerHourValue).multiply(SPEED_SCALES[DECAMETER_PER_HOUR - 31]).divide(SPEED_SCALES[DECAMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_HOUR);
			Speed meterPerHourResultTest = new Speed(BigDecimal.valueOf(meterPerHourValue).multiply(SPEED_SCALES[METER_PER_HOUR - 31]).divide(SPEED_SCALES[DECAMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_HOUR);
			Speed decimeterPerHourResultTest = new Speed(BigDecimal.valueOf(decimeterPerHourValue).multiply(SPEED_SCALES[DECIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[DECAMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_HOUR);
			Speed centimeterPerHourResultTest = new Speed(BigDecimal.valueOf(centimeterPerHourValue).multiply(SPEED_SCALES[CENTIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[DECAMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_HOUR);
			Speed millimeterPerHourResultTest = new Speed(BigDecimal.valueOf(millimeterPerHourValue).multiply(SPEED_SCALES[MILLIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[DECAMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_HOUR);

			Speed kilometerPerSecondResult = toDecameterPerMinute(kilometerPerSecondValue, KILOMETER_PER_SECOND);
			Speed hectometerPerSecondResult = toDecameterPerMinute(hectometerPerSecondValue, HECTOMETER_PER_SECOND);
			Speed decameterPerSecondResult = toDecameterPerMinute(decameterPerSecondValue, DECAMETER_PER_SECOND);
			Speed meterPerSecondResult = toDecameterPerMinute(meterPerSecondValue, METER_PER_SECOND);
			Speed decimeterPerSecondResult = toDecameterPerMinute(decimeterPerSecondValue, DECIMETER_PER_SECOND);
			Speed centimeterPerSecondResult = toDecameterPerMinute(centimeterPerSecondValue, CENTIMETER_PER_SECOND);
			Speed millimeterPerSecondResult = toDecameterPerMinute(millimeterPerSecondValue, MILLIMETER_PER_SECOND);

			Speed kilometerPerMinuteResult = toDecameterPerMinute(kilometerPerMinuteValue, KILOMETER_PER_MINUTE);
			Speed hectometerPerMinuteResult = toDecameterPerMinute(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE);
			Speed decameterPerMinuteResult = toDecameterPerMinute(decameterPerMinuteValue, DECAMETER_PER_MINUTE);
			Speed meterPerMinuteResult = toDecameterPerMinute(meterPerMinuteValue, METER_PER_MINUTE);
			Speed decimeterPerMinuteResult = toDecameterPerMinute(decimeterPerMinuteValue, DECIMETER_PER_MINUTE);
			Speed centimeterPerMinuteResult = toDecameterPerMinute(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE);
			Speed millimeterPerMinuteResult = toDecameterPerMinute(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE);

			Speed kilometerPerHourResult = toDecameterPerMinute(kilometerPerHourValue, KILOMETER_PER_HOUR);
			Speed hectometerPerHourResult = toDecameterPerMinute(hectometerPerHourValue, HECTOMETER_PER_HOUR);
			Speed decameterPerHourResult = toDecameterPerMinute(decameterPerHourValue, DECAMETER_PER_HOUR);
			Speed meterPerHourResult = toDecameterPerMinute(meterPerHourValue, METER_PER_HOUR);
			Speed decimeterPerHourResult = toDecameterPerMinute(decimeterPerHourValue, DECIMETER_PER_HOUR);
			Speed centimeterPerHourResult = toDecameterPerMinute(centimeterPerHourValue, CENTIMETER_PER_HOUR);
			Speed millimeterPerHourResult = toDecameterPerMinute(millimeterPerHourValue, MILLIMETER_PER_HOUR);

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

        } catch (InvalidUnitException e) {
            throw e;
        }
    }
	
	@Test
    public void toMeterPerMinuteTest() throws PhysicException {
        double kilometerPerSecondValue = getRandomDouble();
        double hectometerPerSecondValue = getRandomDouble();
        double decameterPerSecondValue = getRandomDouble();
        double meterPerSecondValue = getRandomDouble();
        double decimeterPerSecondValue = getRandomDouble();
        double centimeterPerSecondValue = getRandomDouble();
	    double millimeterPerSecondValue = getRandomDouble();

        double kilometerPerMinuteValue = getRandomDouble();
        double hectometerPerMinuteValue = getRandomDouble();
        double decameterPerMinuteValue = getRandomDouble();
        double meterPerMinuteValue = getRandomDouble();
        double decimeterPerMinuteValue = getRandomDouble();
        double centimeterPerMinuteValue = getRandomDouble();
	    double millimeterPerMinuteValue = getRandomDouble();

        double kilometerPerHourValue = getRandomDouble();
        double hectometerPerHourValue = getRandomDouble();
        double decameterPerHourValue = getRandomDouble();
        double meterPerHourValue = getRandomDouble();
        double decimeterPerHourValue = getRandomDouble();
        double centimeterPerHourValue = getRandomDouble();
	    double millimeterPerHourValue = getRandomDouble();
        try {
            Speed kilometerPerSecondResultTest = new Speed(BigDecimal.valueOf(kilometerPerSecondValue).multiply(SPEED_SCALES[KILOMETER_PER_SECOND - 31]).divide(SPEED_SCALES[METER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_SECOND);
			Speed hectometerPerSecondResultTest = new Speed(BigDecimal.valueOf(hectometerPerSecondValue).multiply(SPEED_SCALES[HECTOMETER_PER_SECOND - 31]).divide(SPEED_SCALES[METER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_SECOND);
			Speed decameterPerSecondResultTest = new Speed(BigDecimal.valueOf(decameterPerSecondValue).multiply(SPEED_SCALES[DECAMETER_PER_SECOND - 31]).divide(SPEED_SCALES[METER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_SECOND);
			Speed meterPerSecondResultTest = new Speed(BigDecimal.valueOf(meterPerSecondValue).multiply(SPEED_SCALES[METER_PER_SECOND - 31]).divide(SPEED_SCALES[METER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_SECOND);
			Speed decimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(decimeterPerSecondValue).multiply(SPEED_SCALES[DECIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[METER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_SECOND);
			Speed centimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(centimeterPerSecondValue).multiply(SPEED_SCALES[CENTIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[METER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_SECOND);
			Speed millimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(millimeterPerSecondValue).multiply(SPEED_SCALES[MILLIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[METER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_SECOND);

			Speed kilometerPerMinuteResultTest = new Speed(BigDecimal.valueOf(kilometerPerMinuteValue).multiply(SPEED_SCALES[KILOMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[METER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_MINUTE);
			Speed hectometerPerMinuteResultTest = new Speed(BigDecimal.valueOf(hectometerPerMinuteValue).multiply(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[METER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_MINUTE);
			Speed decameterPerMinuteResultTest = new Speed(BigDecimal.valueOf(decameterPerMinuteValue).multiply(SPEED_SCALES[DECAMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[METER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_MINUTE);
			Speed meterPerMinuteResultTest = new Speed(BigDecimal.valueOf(meterPerMinuteValue).multiply(SPEED_SCALES[METER_PER_MINUTE - 31]).divide(SPEED_SCALES[METER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_MINUTE);
			Speed decimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(decimeterPerMinuteValue).multiply(SPEED_SCALES[DECIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[METER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_MINUTE);
			Speed centimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(centimeterPerMinuteValue).multiply(SPEED_SCALES[CENTIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[METER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_MINUTE);
			Speed millimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(millimeterPerMinuteValue).multiply(SPEED_SCALES[MILLIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[METER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_MINUTE);

			Speed kilometerPerHourResultTest = new Speed(BigDecimal.valueOf(kilometerPerHourValue).multiply(SPEED_SCALES[KILOMETER_PER_HOUR - 31]).divide(SPEED_SCALES[METER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_HOUR);
			Speed hectometerPerHourResultTest = new Speed(BigDecimal.valueOf(hectometerPerHourValue).multiply(SPEED_SCALES[HECTOMETER_PER_HOUR - 31]).divide(SPEED_SCALES[METER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_HOUR);
			Speed decameterPerHourResultTest = new Speed(BigDecimal.valueOf(decameterPerHourValue).multiply(SPEED_SCALES[DECAMETER_PER_HOUR - 31]).divide(SPEED_SCALES[METER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_HOUR);
			Speed meterPerHourResultTest = new Speed(BigDecimal.valueOf(meterPerHourValue).multiply(SPEED_SCALES[METER_PER_HOUR - 31]).divide(SPEED_SCALES[METER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_HOUR);
			Speed decimeterPerHourResultTest = new Speed(BigDecimal.valueOf(decimeterPerHourValue).multiply(SPEED_SCALES[DECIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[METER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_HOUR);
			Speed centimeterPerHourResultTest = new Speed(BigDecimal.valueOf(centimeterPerHourValue).multiply(SPEED_SCALES[CENTIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[METER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_HOUR);
			Speed millimeterPerHourResultTest = new Speed(BigDecimal.valueOf(millimeterPerHourValue).multiply(SPEED_SCALES[MILLIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[METER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_HOUR);

			Speed kilometerPerSecondResult = toMeterPerMinute(kilometerPerSecondValue, KILOMETER_PER_SECOND);
			Speed hectometerPerSecondResult = toMeterPerMinute(hectometerPerSecondValue, HECTOMETER_PER_SECOND);
			Speed decameterPerSecondResult = toMeterPerMinute(decameterPerSecondValue, DECAMETER_PER_SECOND);
			Speed meterPerSecondResult = toMeterPerMinute(meterPerSecondValue, METER_PER_SECOND);
			Speed decimeterPerSecondResult = toMeterPerMinute(decimeterPerSecondValue, DECIMETER_PER_SECOND);
			Speed centimeterPerSecondResult = toMeterPerMinute(centimeterPerSecondValue, CENTIMETER_PER_SECOND);
			Speed millimeterPerSecondResult = toMeterPerMinute(millimeterPerSecondValue, MILLIMETER_PER_SECOND);

			Speed kilometerPerMinuteResult = toMeterPerMinute(kilometerPerMinuteValue, KILOMETER_PER_MINUTE);
			Speed hectometerPerMinuteResult = toMeterPerMinute(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE);
			Speed decameterPerMinuteResult = toMeterPerMinute(decameterPerMinuteValue, DECAMETER_PER_MINUTE);
			Speed meterPerMinuteResult = toMeterPerMinute(meterPerMinuteValue, METER_PER_MINUTE);
			Speed decimeterPerMinuteResult = toMeterPerMinute(decimeterPerMinuteValue, DECIMETER_PER_MINUTE);
			Speed centimeterPerMinuteResult = toMeterPerMinute(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE);
			Speed millimeterPerMinuteResult = toMeterPerMinute(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE);

			Speed kilometerPerHourResult = toMeterPerMinute(kilometerPerHourValue, KILOMETER_PER_HOUR);
			Speed hectometerPerHourResult = toMeterPerMinute(hectometerPerHourValue, HECTOMETER_PER_HOUR);
			Speed decameterPerHourResult = toMeterPerMinute(decameterPerHourValue, DECAMETER_PER_HOUR);
			Speed meterPerHourResult = toMeterPerMinute(meterPerHourValue, METER_PER_HOUR);
			Speed decimeterPerHourResult = toMeterPerMinute(decimeterPerHourValue, DECIMETER_PER_HOUR);
			Speed centimeterPerHourResult = toMeterPerMinute(centimeterPerHourValue, CENTIMETER_PER_HOUR);
			Speed millimeterPerHourResult = toMeterPerMinute(millimeterPerHourValue, MILLIMETER_PER_HOUR);

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

        } catch (InvalidUnitException e) {
            throw e;
        }
    }
	
	@Test
    public void toDecimeterPerMinuteTest() throws PhysicException {
        double kilometerPerSecondValue = getRandomDouble();
        double hectometerPerSecondValue = getRandomDouble();
        double decameterPerSecondValue = getRandomDouble();
        double meterPerSecondValue = getRandomDouble();
        double decimeterPerSecondValue = getRandomDouble();
        double centimeterPerSecondValue = getRandomDouble();
	    double millimeterPerSecondValue = getRandomDouble();

        double kilometerPerMinuteValue = getRandomDouble();
        double hectometerPerMinuteValue = getRandomDouble();
        double decameterPerMinuteValue = getRandomDouble();
        double meterPerMinuteValue = getRandomDouble();
        double decimeterPerMinuteValue = getRandomDouble();
        double centimeterPerMinuteValue = getRandomDouble();
	    double millimeterPerMinuteValue = getRandomDouble();

        double kilometerPerHourValue = getRandomDouble();
        double hectometerPerHourValue = getRandomDouble();
        double decameterPerHourValue = getRandomDouble();
        double meterPerHourValue = getRandomDouble();
        double decimeterPerHourValue = getRandomDouble();
        double centimeterPerHourValue = getRandomDouble();
	    double millimeterPerHourValue = getRandomDouble();
        try {
            Speed kilometerPerSecondResultTest = new Speed(BigDecimal.valueOf(kilometerPerSecondValue).multiply(SPEED_SCALES[KILOMETER_PER_SECOND - 31]).divide(SPEED_SCALES[DECIMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_SECOND);
			Speed hectometerPerSecondResultTest = new Speed(BigDecimal.valueOf(hectometerPerSecondValue).multiply(SPEED_SCALES[HECTOMETER_PER_SECOND - 31]).divide(SPEED_SCALES[DECIMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_SECOND);
			Speed decameterPerSecondResultTest = new Speed(BigDecimal.valueOf(decameterPerSecondValue).multiply(SPEED_SCALES[DECAMETER_PER_SECOND - 31]).divide(SPEED_SCALES[DECIMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_SECOND);
			Speed meterPerSecondResultTest = new Speed(BigDecimal.valueOf(meterPerSecondValue).multiply(SPEED_SCALES[METER_PER_SECOND - 31]).divide(SPEED_SCALES[DECIMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_SECOND);
			Speed decimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(decimeterPerSecondValue).multiply(SPEED_SCALES[DECIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[DECIMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_SECOND);
			Speed centimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(centimeterPerSecondValue).multiply(SPEED_SCALES[CENTIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[DECIMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_SECOND);
			Speed millimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(millimeterPerSecondValue).multiply(SPEED_SCALES[MILLIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[DECIMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_SECOND);

			Speed kilometerPerMinuteResultTest = new Speed(BigDecimal.valueOf(kilometerPerMinuteValue).multiply(SPEED_SCALES[KILOMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[DECIMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_MINUTE);
			Speed hectometerPerMinuteResultTest = new Speed(BigDecimal.valueOf(hectometerPerMinuteValue).multiply(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[DECIMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_MINUTE);
			Speed decameterPerMinuteResultTest = new Speed(BigDecimal.valueOf(decameterPerMinuteValue).multiply(SPEED_SCALES[DECAMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[DECIMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_MINUTE);
			Speed meterPerMinuteResultTest = new Speed(BigDecimal.valueOf(meterPerMinuteValue).multiply(SPEED_SCALES[METER_PER_MINUTE - 31]).divide(SPEED_SCALES[DECIMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_MINUTE);
			Speed decimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(decimeterPerMinuteValue).multiply(SPEED_SCALES[DECIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[DECIMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_MINUTE);
			Speed centimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(centimeterPerMinuteValue).multiply(SPEED_SCALES[CENTIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[DECIMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_MINUTE);
			Speed millimeterPerMinuteResultTest = new Speed(BigDecimal.valueOf(millimeterPerMinuteValue).multiply(SPEED_SCALES[MILLIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[DECIMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_MINUTE);

			Speed kilometerPerHourResultTest = new Speed(BigDecimal.valueOf(kilometerPerHourValue).multiply(SPEED_SCALES[KILOMETER_PER_HOUR - 31]).divide(SPEED_SCALES[DECIMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), KILOMETER_PER_HOUR);
			Speed hectometerPerHourResultTest = new Speed(BigDecimal.valueOf(hectometerPerHourValue).multiply(SPEED_SCALES[HECTOMETER_PER_HOUR - 31]).divide(SPEED_SCALES[DECIMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), HECTOMETER_PER_HOUR);
			Speed decameterPerHourResultTest = new Speed(BigDecimal.valueOf(decameterPerHourValue).multiply(SPEED_SCALES[DECAMETER_PER_HOUR - 31]).divide(SPEED_SCALES[DECIMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECAMETER_PER_HOUR);
			Speed meterPerHourResultTest = new Speed(BigDecimal.valueOf(meterPerHourValue).multiply(SPEED_SCALES[METER_PER_HOUR - 31]).divide(SPEED_SCALES[DECIMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), METER_PER_HOUR);
			Speed decimeterPerHourResultTest = new Speed(BigDecimal.valueOf(decimeterPerHourValue).multiply(SPEED_SCALES[DECIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[DECIMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), DECIMETER_PER_HOUR);
			Speed centimeterPerHourResultTest = new Speed(BigDecimal.valueOf(centimeterPerHourValue).multiply(SPEED_SCALES[CENTIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[DECIMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), CENTIMETER_PER_HOUR);
			Speed millimeterPerHourResultTest = new Speed(BigDecimal.valueOf(millimeterPerHourValue).multiply(SPEED_SCALES[MILLIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[DECIMETER_PER_MINUTE - 31], ROUND_SCALE, RoundingMode.HALF_UP), MILLIMETER_PER_HOUR);

			Speed kilometerPerSecondResult = toDecimeterPerMinute(kilometerPerSecondValue, KILOMETER_PER_SECOND);
			Speed hectometerPerSecondResult = toDecimeterPerMinute(hectometerPerSecondValue, HECTOMETER_PER_SECOND);
			Speed decameterPerSecondResult = toDecimeterPerMinute(decameterPerSecondValue, DECAMETER_PER_SECOND);
			Speed meterPerSecondResult = toDecimeterPerMinute(meterPerSecondValue, METER_PER_SECOND);
			Speed decimeterPerSecondResult = toDecimeterPerMinute(decimeterPerSecondValue, DECIMETER_PER_SECOND);
			Speed centimeterPerSecondResult = toDecimeterPerMinute(centimeterPerSecondValue, CENTIMETER_PER_SECOND);
			Speed millimeterPerSecondResult = toDecimeterPerMinute(millimeterPerSecondValue, MILLIMETER_PER_SECOND);

			Speed kilometerPerMinuteResult = toDecimeterPerMinute(kilometerPerMinuteValue, KILOMETER_PER_MINUTE);
			Speed hectometerPerMinuteResult = toDecimeterPerMinute(hectometerPerMinuteValue, HECTOMETER_PER_MINUTE);
			Speed decameterPerMinuteResult = toDecimeterPerMinute(decameterPerMinuteValue, DECAMETER_PER_MINUTE);
			Speed meterPerMinuteResult = toDecimeterPerMinute(meterPerMinuteValue, METER_PER_MINUTE);
			Speed decimeterPerMinuteResult = toDecimeterPerMinute(decimeterPerMinuteValue, DECIMETER_PER_MINUTE);
			Speed centimeterPerMinuteResult = toDecimeterPerMinute(centimeterPerMinuteValue, CENTIMETER_PER_MINUTE);
			Speed millimeterPerMinuteResult = toDecimeterPerMinute(millimeterPerMinuteValue, MILLIMETER_PER_MINUTE);

			Speed kilometerPerHourResult = toDecimeterPerMinute(kilometerPerHourValue, KILOMETER_PER_HOUR);
			Speed hectometerPerHourResult = toDecimeterPerMinute(hectometerPerHourValue, HECTOMETER_PER_HOUR);
			Speed decameterPerHourResult = toDecimeterPerMinute(decameterPerHourValue, DECAMETER_PER_HOUR);
			Speed meterPerHourResult = toDecimeterPerMinute(meterPerHourValue, METER_PER_HOUR);
			Speed decimeterPerHourResult = toDecimeterPerMinute(decimeterPerHourValue, DECIMETER_PER_HOUR);
			Speed centimeterPerHourResult = toDecimeterPerMinute(centimeterPerHourValue, CENTIMETER_PER_HOUR);
			Speed millimeterPerHourResult = toDecimeterPerMinute(millimeterPerHourValue, MILLIMETER_PER_HOUR);

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

        } catch (InvalidUnitException e) {
            throw e;
        }
    }
	
    private double getRandomDouble() {
        return random.nextDouble() * 100;
	}
}
