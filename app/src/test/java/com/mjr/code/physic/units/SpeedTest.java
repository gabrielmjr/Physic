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
        System.err.println(KILOMETER_PER_SECOND);
        try {
            Speed kilometerPerSecondResultTest = new Speed(BigDecimal.valueOf(kilometerPerSecondValue).multiply(SPEED_SCALES[KILOMETER_PER_SECOND - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31]), KILOMETER_PER_SECOND);
			Speed hectometerPerSecondResultTest = new Speed(BigDecimal.valueOf(hectometerPerSecondValue).multiply(SPEED_SCALES[HECTOMETER_PER_SECOND - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31]), HECTOMETER_PER_SECOND);
			Speed decameterPerSecondResultTest = new Speed(BigDecimal.valueOf(decameterPerSecondValue).multiply(SPEED_SCALES[DECAMETER_PER_SECOND - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31]), DECAMETER_PER_SECOND);
			Speed meterPerSecondResultTest = new Speed(BigDecimal.valueOf(meterPerSecondValue).multiply(SPEED_SCALES[METER_PER_SECOND - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31]), METER_PER_SECOND);
			Speed decimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(decimeterPerSecondValue).multiply(SPEED_SCALES[DECIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31]), DECIMETER_PER_SECOND);
			Speed centimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(centimeterPerSecondValue).multiply(SPEED_SCALES[CENTIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31]), CENTIMETER_PER_SECOND);
			Speed millimeterPerSecondResultTest = new Speed(BigDecimal.valueOf(millimeterPerSecondValue).multiply(SPEED_SCALES[MILLIMETER_PER_SECOND - 31]).divide(SPEED_SCALES[KILOMETER_PER_SECOND - 31]), MILLIMETER_PER_SECOND);
			
			Speed kilometerPerSecondResult = toKilometerPerSecond(kilometerPerSecondValue, KILOMETER_PER_SECOND);
			Speed hectometerPerSecondResult = toKilometerPerSecond(hectometerPerSecondValue, HECTOMETER_PER_SECOND);
			Speed decameterPerSecondResult = toKilometerPerSecond(decameterPerSecondValue, DECAMETER_PER_SECOND);
			Speed meterPerSecondResult = toKilometerPerSecond(meterPerSecondValue, METER_PER_SECOND);
			Speed decimeterPerSecondResult = toKilometerPerSecond(decimeterPerSecondValue, DECIMETER_PER_SECOND);
			Speed centimeterPerSecondResult = toKilometerPerSecond(centimeterPerSecondValue, CENTIMETER_PER_SECOND);
			Speed millimeterPerSecondResult = toKilometerPerSecond(millimeterPerSecondValue, MILLIMETER_PER_SECOND);
			
			assertEquals(kilometerPerSecondResult, kilometerPerSecondResultTest);
			assertEquals(hectometerPerSecondResult, hectometerPerSecondResultTest);
			assertEquals(decameterPerSecondResult, decameterPerSecondResultTest);
			assertEquals(meterPerSecondResult, meterPerSecondResultTest);
			assertEquals(decimeterPerSecondResult, decimeterPerSecondResultTest);
			assertEquals(centimeterPerSecondResult, centimeterPerSecondResultTest);
			assertEquals(millimeterPerSecondResult, millimeterPerSecondResultTest);
			
        } catch (InvalidUnitException e) {
            throw e;
        }
    }
    
    private double getRandomDouble() {
        return random.nextDouble() * 100;
	}
}
