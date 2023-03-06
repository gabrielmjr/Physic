package com.gabrielMJr.twaire.physic.units;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
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
	private final NumberFormat formatter;
	private final Time time;
	private final Random random;

	public TimeTest ()
	{
		formatter = new DecimalFormat("#00.000");
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

		BigDecimal secondTestResult = BigDecimal.valueOf(secondValue).multiply(TIME_SCALES[SECOND - 21]).divide(TIME_SCALES[SECOND - 21]);
		BigDecimal minuteTestResult = BigDecimal.valueOf(minuteValue).multiply(TIME_SCALES[MINUTE - 21]).divide(TIME_SCALES[SECOND - 21]);
		BigDecimal hourTestResult = BigDecimal.valueOf(hourValue).multiply(TIME_SCALES[HOUR - 21]).divide(TIME_SCALES[SECOND - 21]);
		BigDecimal dayTestResult = BigDecimal.valueOf(dayValue).multiply(TIME_SCALES[DAY - 21]).divide(TIME_SCALES[SECOND - 21]);
		BigDecimal weekTestResult = BigDecimal.valueOf(weekValue).multiply(TIME_SCALES[WEEK - 21]).divide(TIME_SCALES[SECOND - 21]);

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

		BigDecimal secondTestResult = BigDecimal.valueOf(secondValue).multiply(TIME_SCALES[SECOND - 21]).divide(TIME_SCALES[MINUTE - 21]);
		BigDecimal minuteTestResult = BigDecimal.valueOf(minuteValue).multiply(TIME_SCALES[MINUTE - 21]).divide(TIME_SCALES[MINUTE - 21]);
		BigDecimal hourTestResult = BigDecimal.valueOf(hourValue).multiply(TIME_SCALES[HOUR - 21]).divide(TIME_SCALES[MINUTE - 21]);
		BigDecimal dayTestResult = BigDecimal.valueOf(dayValue).multiply(TIME_SCALES[DAY - 21]).divide(TIME_SCALES[MINUTE - 21]);
		BigDecimal weekTestResult = BigDecimal.valueOf(weekValue).multiply(TIME_SCALES[WEEK - 21]).divide(TIME_SCALES[MINUTE - 21]);
		
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

		BigDecimal secondTestResult = BigDecimal.valueOf(secondValue).multiply(TIME_SCALES[SECOND - 21]).divide(TIME_SCALES[HOUR - 21]);
		BigDecimal minuteTestResult = BigDecimal.valueOf(minuteValue).multiply(TIME_SCALES[MINUTE - 21]).divide(TIME_SCALES[HOUR - 21]);
		BigDecimal hourTestResult = BigDecimal.valueOf(hourValue).multiply(TIME_SCALES[HOUR - 21]).divide(TIME_SCALES[HOUR - 21]);
		BigDecimal dayTestResult = BigDecimal.valueOf(dayValue).multiply(TIME_SCALES[DAY - 21]).divide(TIME_SCALES[HOUR - 21]);
		BigDecimal weekTestResult = BigDecimal.valueOf(weekValue).multiply(TIME_SCALES[WEEK - 21]).divide(TIME_SCALES[HOUR - 21]);
		
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

		BigDecimal secondTestResult = BigDecimal.valueOf(secondValue).multiply(TIME_SCALES[SECOND - 21]).divide(TIME_SCALES[DAY - 21]);
		BigDecimal minuteTestResult = BigDecimal.valueOf(minuteValue).multiply(TIME_SCALES[MINUTE - 21]).divide(TIME_SCALES[DAY - 21]);
		BigDecimal hourTestResult = BigDecimal.valueOf(hourValue).multiply(TIME_SCALES[HOUR - 21]).divide(TIME_SCALES[DAY - 21]);
		BigDecimal dayTestResult = BigDecimal.valueOf(dayValue).multiply(TIME_SCALES[DAY - 21]).divide(TIME_SCALES[DAY - 21]);
		BigDecimal weekTestResult = BigDecimal.valueOf(weekValue).multiply(TIME_SCALES[WEEK - 21]).divide(TIME_SCALES[DAY - 21]);
		
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

		BigDecimal secondTestResult = BigDecimal.valueOf(secondValue).multiply(TIME_SCALES[SECOND - 21]).divide(TIME_SCALES[WEEK - 21]);
		BigDecimal minuteTestResult = BigDecimal.valueOf(minuteValue).multiply(TIME_SCALES[MINUTE - 21]).divide(TIME_SCALES[WEEK - 21]);
		BigDecimal hourTestResult = BigDecimal.valueOf(hourValue).multiply(TIME_SCALES[HOUR - 21]).divide(TIME_SCALES[WEEK - 21]);
		BigDecimal dayTestResult = BigDecimal.valueOf(dayValue).multiply(TIME_SCALES[DAY - 21]).divide(TIME_SCALES[WEEK - 21]);
		BigDecimal weekTestResult = BigDecimal.valueOf(weekValue).multiply(TIME_SCALES[WEEK - 21]).divide(TIME_SCALES[WEEK - 21]);
		
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
		return Double.valueOf(formatter.format(random.nextDouble() * 100));
	}
}
