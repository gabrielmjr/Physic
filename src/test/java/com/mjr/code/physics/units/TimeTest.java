package com.mjr.code.physics.units;

import com.mjr.code.physics.NumberRandomizer;
import org.junit.jupiter.api.Test;

import static com.mjr.code.physics.units.Time.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeTest extends UnitTest {
	@Test 
	public void toSecondTest() {
		double secondValue = NumberRandomizer.getRandomDouble();
		double minuteValue = NumberRandomizer.getRandomDouble();
		double hourValue = NumberRandomizer.getRandomDouble();
		double dayValue = NumberRandomizer.getRandomDouble();
		double weekValue = NumberRandomizer.getRandomDouble();

        Time secondTestResult = convert(secondValue, SECOND, SECOND);
        Time minuteTestResult = convert(minuteValue, MINUTE, SECOND);
        Time hourTestResult = convert(hourValue, HOUR, SECOND);
        Time dayTestResult = convert(dayValue, DAY, SECOND);
        Time weekTestResult = convert(weekValue, WEEK, SECOND);

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
    }

	@Test 
	public void toMinuteTest() {
		double secondValue = NumberRandomizer.getRandomDouble();
		double minuteValue = NumberRandomizer.getRandomDouble();
		double hourValue = NumberRandomizer.getRandomDouble();
		double dayValue = NumberRandomizer.getRandomDouble();
		double weekValue = NumberRandomizer.getRandomDouble();

        Time secondTestResult = convert(secondValue, SECOND, MINUTE);
        Time minuteTestResult = convert(minuteValue, MINUTE, MINUTE);
        Time hourTestResult = convert(hourValue, HOUR, MINUTE);
        Time dayTestResult = convert(dayValue, DAY, MINUTE);
        Time weekTestResult = convert(weekValue, WEEK, MINUTE);

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
    }

	@Test 
	public void toHourTest() {
		double secondValue = NumberRandomizer.getRandomDouble();
		double minuteValue = NumberRandomizer.getRandomDouble();
		double hourValue = NumberRandomizer.getRandomDouble();
		double dayValue = NumberRandomizer.getRandomDouble();
		double weekValue = NumberRandomizer.getRandomDouble();

        Time secondTestResult = convert(secondValue, SECOND, HOUR);
        Time minuteTestResult = convert(minuteValue, MINUTE, HOUR);
        Time hourTestResult = convert(hourValue, HOUR, HOUR);
        Time dayTestResult = convert(dayValue, DAY, HOUR);
        Time weekTestResult = convert(weekValue, WEEK, HOUR);

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
    }

	@Test 
	public void toDayTest() {
		double secondValue = NumberRandomizer.getRandomDouble();
		double minuteValue = NumberRandomizer.getRandomDouble();
		double hourValue = NumberRandomizer.getRandomDouble();
		double dayValue = NumberRandomizer.getRandomDouble();
		double weekValue = NumberRandomizer.getRandomDouble();

        Time secondTestResult = convert(secondValue, SECOND, DAY);
        Time minuteTestResult = convert(minuteValue, MINUTE, DAY);
        Time hourTestResult = convert(hourValue,HOUR , DAY);
        Time dayTestResult = convert(dayValue, DAY, DAY);
        Time weekTestResult = convert(weekValue, WEEK, DAY);

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
    }

	@Test 
	public void toWeekTest() {
		double secondValue = NumberRandomizer.getRandomDouble();
		double minuteValue = NumberRandomizer.getRandomDouble();
		double hourValue = NumberRandomizer.getRandomDouble();
        double dayValue = NumberRandomizer.getRandomDouble();
		double weekValue = NumberRandomizer.getRandomDouble();

        Time secondTestResult = convert(secondValue, SECOND, WEEK);
        Time minuteTestResult = convert(minuteValue, MINUTE, WEEK);
        Time hourTestResult = convert(hourValue,HOUR , WEEK);
        Time dayTestResult = convert(dayValue, DAY, WEEK);
        Time weekTestResult = convert(weekValue, WEEK, WEEK);

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
    }
	
	@Test
	public void toSecondFixedResultTest() {
		int secondValue = 1;
		int minuteValue = 1;
		int hourValue = 1;
		int dayValue = 1;
		int weekValue = 1;
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
    }
	
	@Test
	public void toMinuteFixedResultTest() {
		int secondValue = 1;
		int minuteValue = 1;
		int hourValue = 1;
		int dayValue = 1;
		int weekValue = 1;
        Time secondTestResult = new Time("0.01666666666666666667", MINUTE);
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
    }
	
	@Test
	public void toHourFixedResultTest() {
		int secondValue = 1;
		int minuteValue = 1;
		int hourValue = 1;
		int dayValue = 1;
		int weekValue = 1;
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
    }
	
	@Test
	public void toDayFixedResultTest() {
		int secondValue = 1;
		int minuteValue = 1;
		int hourValue = 1;
		int dayValue = 1;
		int weekValue = 1;
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
    }
	
	@Test
	public void toWeekFixedResultTest() {
		int secondValue = 1;
		int minuteValue = 1;
		int hourValue = 1;
		int dayValue = 1;
		int weekValue = 1;
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
    }

    @Override
    public Time convert(double value, int currentUnit, int targetUnit) {
        return new Time(divide(multiply(value, TIME_SCALES[targetUnit - UNIT_SCALE]), TIME_SCALES[currentUnit - UNIT_SCALE]), targetUnit);
    }
}
