package com.mjr.code.physic.units;

import com.mjr.code.physic.PhysicException;
import java.math.BigDecimal;
import java.util.Random;
import org.junit.jupiter.api.Test;

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
            Speed kilometerPerSecondTestResult = new Speed(BigDecimal.valueOf(kilometerPerSecondValue).multiply(SPEED_SCALES[KILOMETER_PER_SECOND - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31]), KILOMETER_PER_SECOND);
            Speed hectometerPerSecondTestResult = new Speed(BigDecimal.valueOf(hectometerPerSecondValue).multiply(SPEED_SCALES[HECTOMETER_PER_SECOND - 31]).divide(SPEED_SCALES[HECTOMETER_PER_SECOND - 31]), HECTOMETER_PER_SECOND);
            Speed decameterPerSecondTestResult = new Speed(BigDecimal.valueOf(decameterPerSecondValue).multiply(SPEED_SCALES[DECAMETER_PER_SECOND - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31]), DECAMETER_PER_SECOND);
            Speed meterPerSecondTestResult = new Speed(BigDecimal.valueOf(meterPerSecondValue).multiply(SPEED_SCALES[METER_PER_SECOND - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31]), METER_PER_SECOND);
            Speed decimeterPerSecondTestResult = new Speed(BigDecimal.valueOf(decimeterPerSecondValue).multiply(SPEED_SCALES[DECIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31]), DECIMETER_PER_SECOND);
            Speed centimeterPerSecondTestResult = new Speed(BigDecimal.valueOf(centimeterPerSecondValue).multiply(SPEED_SCALES[CENTIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31]), CENTIMETER_PER_SECOND);
            Speed millimeterPerSecondTestResult = new Speed(BigDecimal.valueOf(millimeterPerSecondValue).multiply(SPEED_SCALES[MILLIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31]), MILLIMETER_PER_SECOND);
            
            Speed kilometerPerMinuteTestResult = new Speed(BigDecimal.valueOf(kilometerPerMinuteValue).multiply(SPEED_SCALES[KILOMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31]), KILOMETER_PER_MINUTE);
            Speed hectometerPerMinuteTestResult = new Speed(BigDecimal.valueOf(hectometerPerMinuteValue).multiply(SPEED_SCALES[HECTOMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31]), HECTOMETER_PER_MINUTE);
            Speed decameterPerMinuteTestResult = new Speed(BigDecimal.valueOf(decameterPerMinuteValue).multiply(SPEED_SCALES[DECAMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31]), DECAMETER_PER_MINUTE);
            Speed meterPerMinuteTestResult = new Speed(BigDecimal.valueOf(meterPerMinuteValue).multiply(SPEED_SCALES[METER_PER_MINUTE - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31]), METER_PER_MINUTE);
            Speed decimeterPerMinuteTestResult = new Speed(BigDecimal.valueOf(decimeterPerMinuteValue).multiply(SPEED_SCALES[DECIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31]), DECIMETER_PER_MINUTE);
            Speed centimeterPerMinuteTestResult = new Speed(BigDecimal.valueOf(centimeterPerMinuteValue).multiply(SPEED_SCALES[CENTIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31]), CENTIMETER_PER_MINUTE);
            Speed millimeterPerMinuteTestResult = new Speed(BigDecimal.valueOf(millimeterPerMinuteValue).multiply(SPEED_SCALES[MILLIMETER_PER_MINUTE - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31]), MILLIMETER_PER_MINUTE);
            
            Speed kilometerPerHourTestResult = new Speed(BigDecimal.valueOf(kilometerPerHourValue).multiply(SPEED_SCALES[KILOMETER_PER_HOUR - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31]), KILOMETER_PER_HOUR);
            Speed hectometerPerHourTestResult = new Speed(BigDecimal.valueOf(hectometerPerHourValue).multiply(SPEED_SCALES[HECTOMETER_PER_HOUR - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31]), HECTOMETER_PER_HOUR);
            Speed decameterPerHourTestResult = new Speed(BigDecimal.valueOf(decameterPerHourValue).multiply(SPEED_SCALES[DECAMETER_PER_HOUR - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31]), DECAMETER_PER_HOUR);
            Speed meterPerHourTestResult = new Speed(BigDecimal.valueOf(meterPerHourValue).multiply(SPEED_SCALES[METER_PER_HOUR - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31]), METER_PER_HOUR);
            Speed decimeterPerHourTestResult = new Speed(BigDecimal.valueOf(decimeterPerHourValue).multiply(SPEED_SCALES[DECIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31]), DECIMETER_PER_HOUR);
            Speed centimeterPerHourTestResult = new Speed(BigDecimal.valueOf(centimeterPerHourValue).multiply(SPEED_SCALES[CENTIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31]), CENTIMETER_PER_HOUR);
            Speed millimeterPerHourTestResult = new Speed(BigDecimal.valueOf(millimeterPerHourValue).multiply(SPEED_SCALES[MILLIMETER_PER_HOUR - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31]), MILLIMETER_PER_HOUR);
            
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
            
            assertEquals(kilometerPerSecondTestResult, kilometerPerSecondResult);
            assertEquals(hectometerPerSecondTestResult, hectometerPerSecondResult);
            assertEquals(decameterPerSecondTestResult, decameterPerSecondResult);
            assertEquals(meterPerSecondTestResult, meterPerSecondResult);
            assertEquals(decimeterPerSecondTestResult, decimeterPerSecondResult);
            assertEquals(centimeterPerSecondTestResult, centimeterPerSecondResult);
            assertEquals(millimeterPerSecondTestResult, millimeterPerSecondResult);
        } catch (InvalidUnitException e) {
            throw e;
        }
    }
    
    private double getRandomDouble() {
        return random.nextDouble() * 100;
	}
}