package com.gabrielMJr.twaire.physic.units;

import java.math.BigDecimal;
import java.util.Random;
import org.junit.jupiter.api.Test;

import static com.gabrielMJr.twaire.physic.units.Time.TIME_SCALES;

import static com.gabrielMJr.twaire.physic.units.Time.SECOND;
import static com.gabrielMJr.twaire.physic.units.Time.MINUTE;
import static com.gabrielMJr.twaire.physic.units.Time.HOUR;
import static com.gabrielMJr.twaire.physic.units.Time.DAY;
import static com.gabrielMJr.twaire.physic.units.Time.WEEK;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TimeTest
{
	private final Time time;
	private final Random random;

	public TimeTest ()
	{
		time = Time.getInstance();
		random = new Random();
	}

	@Test 
	public void toSecondTest ()
	{
		double secondValue = getRandomDouble();
		double minuteValue = getRandomDouble();
		double hourValue = getRandomDouble();
		double dayValue = getRandomDouble();
		double weekValue = getRandomDouble();

		BigDecimal secondTestResult = BigDecimal.valueOf(secondValue * TIME_SCALES[SECOND - 21].doubleValue() / TIME_SCALES[SECOND - 21].doubleValue());
		BigDecimal minuteTestResult = BigDecimal.valueOf(minuteValue * TIME_SCALES[MINUTE - 21].doubleValue() / TIME_SCALES[SECOND - 21].doubleValue());
		BigDecimal hourTestResult = BigDecimal.valueOf(hourValue * TIME_SCALES[HOUR - 21].doubleValue() / TIME_SCALES[SECOND - 21].doubleValue());
		BigDecimal dayTestResult = BigDecimal.valueOf(dayValue * TIME_SCALES[DAY - 21].doubleValue() / TIME_SCALES[SECOND - 21].doubleValue());
		BigDecimal weekTestResult = BigDecimal.valueOf(weekValue * TIME_SCALES[WEEK - 21].doubleValue() / TIME_SCALES[SECOND - 21].doubleValue());

		BigDecimal secondResult = time.toSecond(secondValue, SECOND);
		BigDecimal minuteResult = time.toSecond(minuteValue, MINUTE);
		BigDecimal hourResult = time.toSecond(hourValue, HOUR);
		BigDecimal dayResult = time.toSecond(dayValue, DAY);
	    BigDecimal weekResult = time.toSecond(weekValue, WEEK);

		assertEquals(secondTestResult, secondResult);
		assertEquals(minuteTestResult, minuteResult);
		assertEquals(hourTestResult, hourResult);
		assertEquals(dayTestResult, dayResult);
		assertEquals(weekTestResult, weekResult);
	}

	@Test 
	public void toMinuteTest ()
	{
		double secondValue = getRandomDouble();
		double minuteValue = getRandomDouble();
		double hourValue = getRandomDouble();
		double dayValue = getRandomDouble();
		double weekValue = getRandomDouble();

		BigDecimal secondTestResult = BigDecimal.valueOf(secondValue * TIME_SCALES[SECOND - 21].doubleValue() / TIME_SCALES[MINUTE - 21].doubleValue());
		BigDecimal minuteTestResult = BigDecimal.valueOf(minuteValue * TIME_SCALES[MINUTE - 21].doubleValue() / TIME_SCALES[MINUTE - 21].doubleValue());
		BigDecimal hourTestResult = BigDecimal.valueOf(hourValue * TIME_SCALES[HOUR - 21].doubleValue() / TIME_SCALES[MINUTE - 21].doubleValue());
		BigDecimal dayTestResult = BigDecimal.valueOf(dayValue * TIME_SCALES[DAY - 21].doubleValue() / TIME_SCALES[MINUTE - 21].doubleValue());
		BigDecimal weekTestResult = BigDecimal.valueOf(weekValue * TIME_SCALES[WEEK - 21].doubleValue() / TIME_SCALES[MINUTE - 21].doubleValue());
		
		BigDecimal secondResult = time.toMinute(secondValue, SECOND);
		BigDecimal minuteResult = time.toMinute(minuteValue, MINUTE);
		BigDecimal hourResult = time.toMinute(hourValue, HOUR);
		BigDecimal dayResult = time.toMinute(dayValue, DAY);
	    BigDecimal weekResult = time.toMinute(weekValue, WEEK);
		
		assertEquals(secondTestResult, secondResult);
		assertEquals(minuteTestResult, minuteResult);
		assertEquals(hourTestResult, hourResult);
		assertEquals(dayTestResult, dayResult);
		assertEquals(weekTestResult, weekResult);
	}

	@Test 
	public void toHourTest ()
	{
		double secondValue = getRandomDouble();
		double minuteValue = getRandomDouble();
		double hourValue = getRandomDouble();
		double dayValue = getRandomDouble();
		double weekValue = getRandomDouble();

		BigDecimal secondTestResult = BigDecimal.valueOf(secondValue * TIME_SCALES[SECOND - 21].doubleValue() / TIME_SCALES[HOUR - 21].doubleValue());
		BigDecimal minuteTestResult = BigDecimal.valueOf(minuteValue * TIME_SCALES[MINUTE - 21].doubleValue() / TIME_SCALES[HOUR - 21].doubleValue());
		BigDecimal hourTestResult = BigDecimal.valueOf(hourValue * TIME_SCALES[HOUR - 21].doubleValue() / TIME_SCALES[HOUR - 21].doubleValue());
		BigDecimal dayTestResult = BigDecimal.valueOf(dayValue * TIME_SCALES[DAY - 21].doubleValue() / TIME_SCALES[HOUR - 21].doubleValue());
		BigDecimal weekTestResult = BigDecimal.valueOf(weekValue * TIME_SCALES[WEEK - 21].doubleValue() / TIME_SCALES[HOUR - 21].doubleValue());
		
		BigDecimal secondResult = time.toHour(secondValue, SECOND);
		BigDecimal minuteResult = time.toHour(minuteValue, MINUTE);
		BigDecimal hourResult = time.toHour(hourValue, HOUR);
		BigDecimal dayResult = time.toHour(dayValue, DAY);
	    BigDecimal weekResult = time.toHour(weekValue, WEEK);
		
		assertEquals(secondTestResult, secondResult);
		assertEquals(minuteTestResult, minuteResult);
		assertEquals(hourTestResult, hourResult);
		assertEquals(dayTestResult, dayResult);
		assertEquals(weekTestResult, weekResult);
	}

	@Test 
	public void toDayTest ()
	{
		double secondValue = getRandomDouble();
		double minuteValue = getRandomDouble();
		double hourValue = getRandomDouble();
		double dayValue = getRandomDouble();
		double weekValue = getRandomDouble();

		BigDecimal secondTestResult = BigDecimal.valueOf(secondValue * TIME_SCALES[SECOND - 21].doubleValue() / TIME_SCALES[DAY - 21].doubleValue());
		BigDecimal minuteTestResult = BigDecimal.valueOf(minuteValue * TIME_SCALES[MINUTE - 21].doubleValue() / TIME_SCALES[DAY - 21].doubleValue());
		BigDecimal hourTestResult = BigDecimal.valueOf(hourValue * TIME_SCALES[HOUR - 21].doubleValue() / TIME_SCALES[DAY - 21].doubleValue());
		BigDecimal dayTestResult = BigDecimal.valueOf(dayValue * TIME_SCALES[DAY - 21].doubleValue() / TIME_SCALES[DAY - 21].doubleValue());
		BigDecimal weekTestResult = BigDecimal.valueOf(weekValue * TIME_SCALES[WEEK - 21].doubleValue() / TIME_SCALES[DAY - 21].doubleValue());
		
		BigDecimal secondResult = time.toDay(secondValue, SECOND);
		BigDecimal minuteResult = time.toDay(minuteValue, MINUTE);
		BigDecimal hourResult = time.toDay(hourValue, HOUR);
		BigDecimal dayResult = time.toDay(dayValue, DAY);
	    BigDecimal weekResult = time.toDay(weekValue, WEEK);

		assertEquals(secondTestResult, secondResult);
		assertEquals(minuteTestResult, minuteResult);
		assertEquals(hourTestResult, hourResult);
		assertEquals(dayTestResult, dayResult);
		assertEquals(weekTestResult, weekResult);
	}

	@Test 
	public void toWeekTest ()
	{
		double secondValue = getRandomDouble();
		double minuteValue = getRandomDouble();
		double hourValue = getRandomDouble();
		double dayValue = getRandomDouble();
		double weekValue = getRandomDouble();

		BigDecimal secondTestResult = BigDecimal.valueOf(secondValue * TIME_SCALES[SECOND - 21].doubleValue() / TIME_SCALES[WEEK - 21].doubleValue());
		BigDecimal minuteTestResult = BigDecimal.valueOf(minuteValue * TIME_SCALES[MINUTE - 21].doubleValue() / TIME_SCALES[WEEK - 21].doubleValue());
		BigDecimal hourTestResult = BigDecimal.valueOf(hourValue * TIME_SCALES[HOUR - 21].doubleValue() / TIME_SCALES[WEEK - 21].doubleValue());
		BigDecimal dayTestResult = BigDecimal.valueOf(dayValue * TIME_SCALES[DAY - 21].doubleValue() / TIME_SCALES[WEEK - 21].doubleValue());
		BigDecimal weekTestResult = BigDecimal.valueOf(weekValue * TIME_SCALES[WEEK - 21].doubleValue() / TIME_SCALES[WEEK - 21].doubleValue());
		
		BigDecimal secondResult = time.toWeek(secondValue, SECOND);
		BigDecimal minuteResult = time.toWeek(minuteValue, MINUTE);
		BigDecimal hourResult = time.toWeek(hourValue, HOUR);
		BigDecimal dayResult = time.toWeek(dayValue, DAY);
	    BigDecimal weekResult = time.toWeek(weekValue, WEEK);

		assertEquals(secondTestResult, secondResult);
		assertEquals(minuteTestResult, minuteResult);
		assertEquals(hourTestResult, hourResult);
		assertEquals(dayTestResult, dayResult);
		assertEquals(weekTestResult, weekResult);
	}

	private double getRandomDouble ()
	{
		return random.nextDouble() * 100;
	}
}
