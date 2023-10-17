package com.mjr.code.physics.units;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.mjr.code.physics.NumberRandomizer;
import org.junit.jupiter.api.Test;

import static com.mjr.code.physics.NumberRandomizer.getRandomDouble;
import static com.mjr.code.physics.Physic.ROUND_SCALE;
import static com.mjr.code.physics.units.Time.toSecond;
import static com.mjr.code.physics.units.Time.toMinute;
import static com.mjr.code.physics.units.Time.toHour;
import static com.mjr.code.physics.units.Time.toDay;
import static com.mjr.code.physics.units.Time.toWeek;
import static com.mjr.code.physics.units.Time.TIME_SCALES;
import static com.mjr.code.physics.units.Time.SECOND;
import static com.mjr.code.physics.units.Time.MINUTE;
import static com.mjr.code.physics.units.Time.HOUR;
import static com.mjr.code.physics.units.Time.DAY;
import static com.mjr.code.physics.units.Time.WEEK;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeTest {
	@Test 
	public void toSecondTest() throws IllegalArgumentException {
		double secondValue = NumberRandomizer.getRandomDouble();
		double minuteValue = NumberRandomizer.getRandomDouble();
		double hourValue = NumberRandomizer.getRandomDouble();
		double dayValue = NumberRandomizer.getRandomDouble();
		double weekValue = NumberRandomizer.getRandomDouble();

        try {
            Time secondTestResult = new Time(BigDecimal.valueOf(secondValue).multiply(TIME_SCALES[SECOND - 21]).divide(TIME_SCALES[SECOND - 21], ROUND_SCALE, RoundingMode.HALF_UP), SECOND);
            Time minuteTestResult = new Time(BigDecimal.valueOf(minuteValue).multiply(TIME_SCALES[SECOND - 21]).divide(TIME_SCALES[MINUTE - 21], ROUND_SCALE, RoundingMode.HALF_UP), SECOND);
            Time hourTestResult = new Time(BigDecimal.valueOf(hourValue).multiply(TIME_SCALES[SECOND - 21]).divide(TIME_SCALES[HOUR - 21], ROUND_SCALE, RoundingMode.HALF_UP), SECOND);
            Time dayTestResult = new Time(BigDecimal.valueOf(dayValue).multiply(TIME_SCALES[SECOND - 21]).divide(TIME_SCALES[DAY - 21], ROUND_SCALE, RoundingMode.HALF_UP), SECOND);
            Time weekTestResult = new Time(BigDecimal.valueOf(weekValue).multiply(TIME_SCALES[SECOND - 21]).divide(TIME_SCALES[WEEK - 21], ROUND_SCALE, RoundingMode.HALF_UP), SECOND);

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
        } catch (IllegalArgumentException e) {
            throw e;
        }
	}

	@Test 
	public void toMinuteTest() throws IllegalArgumentException {
		double secondValue = NumberRandomizer.getRandomDouble();
		double minuteValue = NumberRandomizer.getRandomDouble();
		double hourValue = NumberRandomizer.getRandomDouble();
		double dayValue = NumberRandomizer.getRandomDouble();
		double weekValue = NumberRandomizer.getRandomDouble();

        try {
            Time secondTestResult = new Time(BigDecimal.valueOf(secondValue).multiply(TIME_SCALES[MINUTE - 21]).divide(TIME_SCALES[SECOND - 21], ROUND_SCALE, RoundingMode.HALF_UP), MINUTE);
            Time minuteTestResult = new Time(BigDecimal.valueOf(minuteValue).multiply(TIME_SCALES[MINUTE - 21]).divide(TIME_SCALES[MINUTE - 21], ROUND_SCALE, RoundingMode.HALF_UP), MINUTE);
            Time hourTestResult = new Time(BigDecimal.valueOf(hourValue).multiply(TIME_SCALES[MINUTE - 21]).divide(TIME_SCALES[HOUR - 21], ROUND_SCALE, RoundingMode.HALF_UP), MINUTE);
            Time dayTestResult = new Time(BigDecimal.valueOf(dayValue).multiply(TIME_SCALES[MINUTE - 21]).divide(TIME_SCALES[DAY - 21], ROUND_SCALE, RoundingMode.HALF_UP), MINUTE);
            Time weekTestResult = new Time(BigDecimal.valueOf(weekValue).multiply(TIME_SCALES[MINUTE - 21]).divide(TIME_SCALES[WEEK - 21], ROUND_SCALE, RoundingMode.HALF_UP), MINUTE);

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
        } catch (IllegalArgumentException e) {
            throw e;
        }
	}

	@Test 
	public void toHourTest() throws IllegalArgumentException {
		double secondValue = NumberRandomizer.getRandomDouble();
		double minuteValue = NumberRandomizer.getRandomDouble();
		double hourValue = NumberRandomizer.getRandomDouble();
		double dayValue = NumberRandomizer.getRandomDouble();
		double weekValue = NumberRandomizer.getRandomDouble();

        try {
            Time secondTestResult = new Time(BigDecimal.valueOf(secondValue).multiply(TIME_SCALES[HOUR - 21]).divide(TIME_SCALES[SECOND - 21], ROUND_SCALE, RoundingMode.HALF_UP), HOUR);
            Time minuteTestResult = new Time(BigDecimal.valueOf(minuteValue).multiply(TIME_SCALES[HOUR - 21]).divide(TIME_SCALES[MINUTE - 21], ROUND_SCALE, RoundingMode.HALF_UP), HOUR);
            Time hourTestResult = new Time(BigDecimal.valueOf(hourValue).multiply(TIME_SCALES[HOUR - 21]).divide(TIME_SCALES[HOUR - 21], ROUND_SCALE, RoundingMode.HALF_UP), HOUR);
            Time dayTestResult = new Time(BigDecimal.valueOf(dayValue).multiply(TIME_SCALES[HOUR - 21]).divide(TIME_SCALES[DAY - 21], ROUND_SCALE, RoundingMode.HALF_UP), HOUR);
            Time weekTestResult = new Time(BigDecimal.valueOf(weekValue).multiply(TIME_SCALES[HOUR - 21]).divide(TIME_SCALES[WEEK - 21], ROUND_SCALE, RoundingMode.HALF_UP), HOUR);

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
        } catch (IllegalArgumentException e) {
            throw e;
        }
	}

	@Test 
	public void toDayTest() throws IllegalArgumentException {
		double secondValue = NumberRandomizer.getRandomDouble();
		double minuteValue = NumberRandomizer.getRandomDouble();
		double hourValue = NumberRandomizer.getRandomDouble();
		double dayValue = NumberRandomizer.getRandomDouble();
		double weekValue = NumberRandomizer.getRandomDouble();

        try {
            Time secondTestResult = new Time(BigDecimal.valueOf(secondValue).multiply(TIME_SCALES[DAY - 21]).divide(TIME_SCALES[SECOND - 21], ROUND_SCALE, RoundingMode.HALF_UP), DAY);
            Time minuteTestResult = new Time(BigDecimal.valueOf(minuteValue).multiply(TIME_SCALES[DAY - 21]).divide(TIME_SCALES[MINUTE - 21], ROUND_SCALE, RoundingMode.HALF_UP), DAY);
            Time hourTestResult = new Time(BigDecimal.valueOf(hourValue).multiply(TIME_SCALES[DAY - 21]).divide(TIME_SCALES[HOUR - 21], ROUND_SCALE, RoundingMode.HALF_UP), DAY);
            Time dayTestResult = new Time(BigDecimal.valueOf(dayValue).multiply(TIME_SCALES[DAY - 21]).divide(TIME_SCALES[DAY - 21], ROUND_SCALE, RoundingMode.HALF_UP), DAY);
            Time weekTestResult = new Time(BigDecimal.valueOf(weekValue).multiply(TIME_SCALES[DAY - 21]).divide(TIME_SCALES[WEEK - 21], ROUND_SCALE, RoundingMode.HALF_UP), DAY);

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
        } catch (IllegalArgumentException e) {
            throw e;
        }
	}

	@Test 
	public void toWeekTest() throws IllegalArgumentException {
		double secondValue = NumberRandomizer.getRandomDouble();
		double minuteValue = NumberRandomizer.getRandomDouble();
		double hourValue = NumberRandomizer.getRandomDouble();
        double dayValue = NumberRandomizer.getRandomDouble();
		double weekValue = NumberRandomizer.getRandomDouble();

        try {
            Time secondTestResult = new Time(BigDecimal.valueOf(secondValue).multiply(TIME_SCALES[WEEK - 21]).divide(TIME_SCALES[SECOND - 21], ROUND_SCALE, RoundingMode.HALF_UP), WEEK);
            Time minuteTestResult = new Time(BigDecimal.valueOf(minuteValue).multiply(TIME_SCALES[WEEK - 21]).divide(TIME_SCALES[MINUTE - 21], ROUND_SCALE, RoundingMode.HALF_UP), WEEK);
            Time hourTestResult = new Time(BigDecimal.valueOf(hourValue).multiply(TIME_SCALES[WEEK - 21]).divide(TIME_SCALES[HOUR - 21], ROUND_SCALE, RoundingMode.HALF_UP), WEEK);
            Time dayTestResult = new Time(BigDecimal.valueOf(dayValue).multiply(TIME_SCALES[WEEK - 21]).divide(TIME_SCALES[DAY - 21], ROUND_SCALE, RoundingMode.HALF_UP), WEEK);
            Time weekTestResult = new Time(BigDecimal.valueOf(weekValue).multiply(TIME_SCALES[WEEK - 21]).divide(TIME_SCALES[WEEK - 21], ROUND_SCALE, RoundingMode.HALF_UP), WEEK);

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
        } catch (IllegalArgumentException e) {
            throw e;
        }
	}
	
	@Test
	public void toSecondFixedResultTest() throws IllegalArgumentException {
		int secondValue = 1;
		int minuteValue = 1;
		int hourValue = 1;
		int dayValue = 1;
		int weekValue = 1;
		try {
			Time secondTestResult = new Time("1.00000000000000000000", SECOND);
			Time minuteTestResult = new Time("60.00000000000000000000", SECOND);
			Time hourTestResult = new Time("3600.00000000000000000000", SECOND);
			Time dayTestResult = new Time("86400.00000000000000000000", SECOND);
			Time weekTestResult = new Time("604800.00000000000000000000", SECOND);

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
		} catch (IllegalArgumentException e) {
			throw e;
		}
	}
	
	@Test
	public void toMinuteFixedResultTest() throws IllegalArgumentException {
		int secondValue = 1;
		int minuteValue = 1;
		int hourValue = 1;
		int dayValue = 1;
		int weekValue = 1;
		try {
			Time secondTestResult = new Time("0.01666666666666666667",MINUTE);
			Time minuteTestResult = new Time("1.00000000000000000000", MINUTE);
			Time hourTestResult = new Time("60.00000000000000000000", MINUTE);
			Time dayTestResult = new Time("1440.00000000000000000000", MINUTE);
			Time weekTestResult = new Time("10080.00000000000000000000", MINUTE);

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
		} catch (IllegalArgumentException e) {
			throw e;
		}
	}
	
	@Test
	public void toHourFixedResultTest() throws IllegalArgumentException {
		int secondValue = 1;
		int minuteValue = 1;
		int hourValue = 1;
		int dayValue = 1;
		int weekValue = 1;
		try {
			Time secondTestResult = new Time("0.00027777777777777778",HOUR);
			Time minuteTestResult = new Time("0.01666666666666666667", HOUR);
			Time hourTestResult = new Time("1.00000000000000000000", HOUR);
			Time dayTestResult = new Time("24.00000000000000000000", HOUR);
			Time weekTestResult = new Time("168.00000000000000000000", HOUR);

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
		} catch (IllegalArgumentException e) {
			throw e;
		}
	}
	
	@Test
	public void toDayFixedResultTest() throws IllegalArgumentException {
		int secondValue = 1;
		int minuteValue = 1;
		int hourValue = 1;
		int dayValue = 1;
		int weekValue = 1;
		try {
			Time secondTestResult = new Time("0.00001157407407407407",DAY);
			Time minuteTestResult = new Time("0.00069444444444444444", DAY);
			Time hourTestResult = new Time("0.04166666666666666667", DAY);
			Time dayTestResult = new Time("1.00000000000000000000", DAY);
			Time weekTestResult = new Time("7.00000000000000000000", DAY);

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
		} catch (IllegalArgumentException e) {
			throw e;
		}
	}
	
	@Test
	public void toWeekFixedResultTest() throws IllegalArgumentException {
		int secondValue = 1;
		int minuteValue = 1;
		int hourValue = 1;
		int dayValue = 1;
		int weekValue = 1;
		try {
			Time secondTestResult = new Time("0.00000165343915343915",WEEK);
			Time minuteTestResult = new Time("0.00009920634920634921", WEEK);
			Time hourTestResult = new Time("0.00595238095238095238", WEEK);
			Time dayTestResult = new Time("0.14285714285714285714", WEEK);
			Time weekTestResult = new Time("1.00000000000000000000", WEEK);

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
		} catch (IllegalArgumentException e) {
			throw e;
		}
	}
}
