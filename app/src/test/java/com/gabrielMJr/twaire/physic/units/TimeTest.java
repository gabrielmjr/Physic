package com.gabrielmjr.twaire.physic.units;

import com.gabrielmjr.twaire.physic.PhysicException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import org.junit.jupiter.api.Test;

import static com.gabrielmjr.twaire.physic.units.Time.toSecond;
import static com.gabrielmjr.twaire.physic.units.Time.toMinute;
import static com.gabrielmjr.twaire.physic.units.Time.toHour;
import static com.gabrielmjr.twaire.physic.units.Time.toDay;
import static com.gabrielmjr.twaire.physic.units.Time.toWeek;
import static com.gabrielmjr.twaire.physic.units.Time.TIME_SCALES;
import static com.gabrielmjr.twaire.physic.units.Time.SECOND;
import static com.gabrielmjr.twaire.physic.units.Time.MINUTE;
import static com.gabrielmjr.twaire.physic.units.Time.HOUR;
import static com.gabrielmjr.twaire.physic.units.Time.DAY;
import static com.gabrielmjr.twaire.physic.units.Time.WEEK;
import static java.math.RoundingMode.HALF_UP;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeTest {
	private final Random random;

	public TimeTest() {
		random = new Random();
	}

	@Test 
	public void toSecondTest() throws PhysicException {
		double secondValue = getRandomDouble() * 6;
		double minuteValue = getRandomDouble();
		double hourValue = getRandomDouble();
		double dayValue = getRandomDouble();
		double weekValue = getRandomDouble();

        try {
            Time secondTestResult = new Time(BigDecimal.valueOf(secondValue).multiply(TIME_SCALES[SECOND - 21]).divide(TIME_SCALES[SECOND - 21], 10, HALF_UP), SECOND);
            Time minuteTestResult = new Time(BigDecimal.valueOf(minuteValue).multiply(TIME_SCALES[MINUTE - 21]).divide(TIME_SCALES[SECOND - 21], 10, HALF_UP), MINUTE);
            Time hourTestResult = new Time(BigDecimal.valueOf(hourValue).multiply(TIME_SCALES[HOUR - 21]).divide(TIME_SCALES[SECOND - 21], 10, HALF_UP), HOUR);
            Time dayTestResult = new Time(BigDecimal.valueOf(dayValue).multiply(TIME_SCALES[DAY - 21]).divide(TIME_SCALES[SECOND - 21], 10, HALF_UP), DAY);
            Time weekTestResult = new Time(BigDecimal.valueOf(weekValue).multiply(TIME_SCALES[WEEK - 21]).divide(TIME_SCALES[SECOND - 21], 10, HALF_UP), WEEK);

            Time secondResult = toSecond(secondValue, SECOND);
            Time minuteResult = toSecond(minuteValue, MINUTE);
            Time hourResult = toSecond(hourValue, HOUR);
            Time dayResult = toSecond(dayValue, DAY);
            Time weekResult = toSecond(weekValue, WEEK);

            assertEquals(secondTestResult, secondResult);
            assertEquals(minuteTestResult, minuteResult);
            assertEquals(hourTestResult, hourResult);
            assertEquals(dayTestResult, dayResult);
            assertEquals(weekTestResult, weekResult);
        } catch (InvalidUnitException e) {
            throw e;
        }
	}

	@Test 
	public void toMinuteTest() throws PhysicException {
		double secondValue = getRandomDouble() * 6;
		double minuteValue = getRandomDouble();
		double hourValue = getRandomDouble();
		double dayValue = getRandomDouble();
		double weekValue = getRandomDouble();

        try {
            Time secondTestResult = new Time(BigDecimal.valueOf(secondValue).multiply(TIME_SCALES[SECOND - 21]).divide(TIME_SCALES[MINUTE - 21], 10, HALF_UP), SECOND);
            Time minuteTestResult = new Time(BigDecimal.valueOf(minuteValue).multiply(TIME_SCALES[MINUTE - 21]).divide(TIME_SCALES[MINUTE - 21], 10, HALF_UP), MINUTE);
            Time hourTestResult = new Time(BigDecimal.valueOf(hourValue).multiply(TIME_SCALES[HOUR - 21]).divide(TIME_SCALES[MINUTE - 21], 10, HALF_UP), HOUR);
            Time dayTestResult = new Time(BigDecimal.valueOf(dayValue).multiply(TIME_SCALES[DAY - 21]).divide(TIME_SCALES[MINUTE - 21], 10, HALF_UP), DAY);
            Time weekTestResult = new Time(BigDecimal.valueOf(weekValue).multiply(TIME_SCALES[WEEK - 21]).divide(TIME_SCALES[MINUTE - 21], 10, HALF_UP), WEEK);

            Time secondResult = toMinute(secondValue, SECOND);
            Time minuteResult = toMinute(minuteValue, MINUTE);
            Time hourResult = toMinute(hourValue, HOUR);
            Time dayResult = toMinute(dayValue, DAY);
            Time weekResult = toMinute(weekValue, WEEK);

            assertEquals(secondTestResult, secondResult);
            assertEquals(minuteTestResult, minuteResult);
            assertEquals(hourTestResult, hourResult);
            assertEquals(dayTestResult, dayResult);
            assertEquals(weekTestResult, weekResult);
        } catch (InvalidUnitException e) {
            throw e;
        }
	}

	@Test 
	public void toHourTest() throws PhysicException {
		double secondValue = getRandomDouble() * 6;
		double minuteValue = getRandomDouble();
		double hourValue = getRandomDouble();
		double dayValue = getRandomDouble();
		double weekValue = getRandomDouble();

        try {
            Time secondTestResult = new Time(BigDecimal.valueOf(secondValue).multiply(TIME_SCALES[SECOND - 21]).divide(TIME_SCALES[HOUR - 21], 10, HALF_UP), SECOND);
            Time minuteTestResult = new Time(BigDecimal.valueOf(minuteValue).multiply(TIME_SCALES[MINUTE - 21]).divide(TIME_SCALES[HOUR - 21], 10, HALF_UP), MINUTE);
            Time hourTestResult = new Time(BigDecimal.valueOf(hourValue).multiply(TIME_SCALES[HOUR - 21]).divide(TIME_SCALES[HOUR - 21], 10, HALF_UP), HOUR);
            Time dayTestResult = new Time(BigDecimal.valueOf(dayValue).multiply(TIME_SCALES[DAY - 21]).divide(TIME_SCALES[HOUR - 21], 10, HALF_UP), DAY);
            Time weekTestResult = new Time(BigDecimal.valueOf(weekValue).multiply(TIME_SCALES[WEEK - 21]).divide(TIME_SCALES[HOUR - 21], 10, HALF_UP), WEEK);

            Time secondResult = toHour(secondValue, SECOND);
            Time minuteResult = toHour(minuteValue, MINUTE);
            Time hourResult = toHour(hourValue, HOUR);
            Time dayResult = toHour(dayValue, DAY);
            Time weekResult = toHour(weekValue, WEEK);

            assertEquals(secondTestResult, secondResult);
            assertEquals(minuteTestResult, minuteResult);
            assertEquals(hourTestResult, hourResult);
            assertEquals(dayTestResult, dayResult);
            assertEquals(weekTestResult, weekResult);
        } catch (InvalidUnitException e) {
            throw e;
        }
	}

	@Test 
	public void toDayTest() throws PhysicException {
		double secondValue = getRandomDouble();
		double minuteValue = getRandomDouble();
		double hourValue = getRandomDouble();
		double dayValue = getRandomDouble();
		double weekValue = getRandomDouble();

        try {
            Time secondTestResult = new Time(BigDecimal.valueOf(secondValue).multiply(TIME_SCALES[SECOND - 21]).divide(TIME_SCALES[DAY - 21], 10, HALF_UP), SECOND);
            Time minuteTestResult = new Time(BigDecimal.valueOf(minuteValue).multiply(TIME_SCALES[MINUTE - 21]).divide(TIME_SCALES[DAY - 21], 10, HALF_UP), MINUTE);
            Time hourTestResult = new Time(BigDecimal.valueOf(hourValue).multiply(TIME_SCALES[HOUR - 21]).divide(TIME_SCALES[DAY - 21], 10, HALF_UP), HOUR);
            Time dayTestResult = new Time(BigDecimal.valueOf(dayValue).multiply(TIME_SCALES[DAY - 21]).divide(TIME_SCALES[DAY - 21], 10, HALF_UP), DAY);
            Time weekTestResult = new Time(BigDecimal.valueOf(weekValue).multiply(TIME_SCALES[WEEK - 21]).divide(TIME_SCALES[DAY - 21], 10, HALF_UP), WEEK);

            Time secondResult = toDay(secondValue, SECOND);
            Time minuteResult = toDay(minuteValue, MINUTE);
            Time hourResult = toDay(hourValue, HOUR);
            Time dayResult = toDay(dayValue, DAY);
            Time weekResult = toDay(weekValue, WEEK);

            assertEquals(secondTestResult, secondResult);
            assertEquals(minuteTestResult, minuteResult);
            assertEquals(hourTestResult, hourResult);
            assertEquals(dayTestResult, dayResult);
            assertEquals(weekTestResult, weekResult);
        } catch (InvalidUnitException e) {
            throw e;
        }
	}

	@Test 
	public void toWeekTest() throws PhysicException {
		double secondValue = 10000000;
		double minuteValue = getRandomDouble();
		double hourValue = getRandomDouble();
        double dayValue = getRandomDouble();
		double weekValue = getRandomDouble() / 9;

        try {
            Time secondTestResult = new Time(BigDecimal.valueOf(secondValue).multiply(TIME_SCALES[SECOND - 21]).divide(TIME_SCALES[WEEK - 21], 10, HALF_UP), SECOND);
            Time minuteTestResult = new Time(BigDecimal.valueOf(minuteValue).multiply(TIME_SCALES[MINUTE - 21]).divide(TIME_SCALES[WEEK - 21], 10, HALF_UP), MINUTE);
            Time hourTestResult = new Time(BigDecimal.valueOf(hourValue).multiply(TIME_SCALES[HOUR - 21]).divide(TIME_SCALES[WEEK - 21], 10, HALF_UP), HOUR);
            Time dayTestResult = new Time(BigDecimal.valueOf(dayValue).multiply(TIME_SCALES[DAY - 21]).divide(TIME_SCALES[WEEK - 21], 10, HALF_UP), DAY);
            Time weekTestResult = new Time(BigDecimal.valueOf(weekValue).multiply(TIME_SCALES[WEEK - 21]).divide(TIME_SCALES[WEEK - 21], 10, HALF_UP), WEEK);

            Time secondResult = toWeek(secondValue, SECOND);
            Time minuteResult = toWeek(minuteValue, MINUTE);
            Time hourResult = toWeek(hourValue, HOUR);
            Time dayResult = toWeek(dayValue, DAY);
            Time weekResult = toWeek(weekValue, WEEK);

            assertEquals(secondTestResult, secondResult);
            assertEquals(minuteTestResult, minuteResult);
            assertEquals(hourTestResult, hourResult);
            assertEquals(dayTestResult, dayResult);
            assertEquals(weekTestResult, weekResult);
        } catch (InvalidUnitException e) {
            throw e;
        }
	}

	private double getRandomDouble() {
		return random.nextDouble();
	}
}
