package com.mjrfusion.code.physics.units;

import com.mjrfusion.code.physics.NumberRandomizer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.mjrfusion.code.physics.units.Time.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeTest extends UnitTest {

    private double secondValue;
    private double minuteValue;
    private double hourValue;
    private double dayValue;
    private double weekValue;

    private Time secondTestResult;
    private Time minuteTestResult;
    private Time hourTestResult;
    private Time dayTestResult;
    private Time weekTestResult;

    private Time secondResult;
    private Time minuteResult;
    private Time hourResult;
    private Time dayResult;
    private Time weekResult;

    @BeforeEach
    void setUp() {
        secondValue = NumberRandomizer.getRandomDouble();
        minuteValue = NumberRandomizer.getRandomDouble();
        hourValue = NumberRandomizer.getRandomDouble();
        dayValue = NumberRandomizer.getRandomDouble();
        weekValue = NumberRandomizer.getRandomDouble();
    }

	@Test 
	public void toSecondTest() {
        secondTestResult = convert(secondValue, SECOND, SECOND);
        minuteTestResult = convert(minuteValue, MINUTE, SECOND);
        hourTestResult = convert(hourValue, HOUR, SECOND);
        dayTestResult = convert(dayValue, DAY, SECOND);
        weekTestResult = convert(weekValue, WEEK, SECOND);

        secondResult = toSecond(secondValue, SECOND);
        minuteResult = toSecond(minuteValue, MINUTE);
        hourResult = toSecond(hourValue, HOUR);
        dayResult = toSecond(dayValue, DAY);
        weekResult = toSecond(weekValue, WEEK);

        assertEquals(secondTestResult, secondResult);
        assertEquals(minuteTestResult, minuteResult);
        assertEquals(hourTestResult, hourResult);
        assertEquals(dayTestResult, dayResult);
        assertEquals(weekTestResult, weekResult);
    }

	@Test 
	public void toMinuteTest() {
        secondTestResult = convert(secondValue, SECOND, MINUTE);
        minuteTestResult = convert(minuteValue, MINUTE, MINUTE);
        hourTestResult = convert(hourValue, HOUR, MINUTE);
        dayTestResult = convert(dayValue, DAY, MINUTE);
        weekTestResult = convert(weekValue, WEEK, MINUTE);

        secondResult = toMinute(secondValue, SECOND);
        minuteResult = toMinute(minuteValue, MINUTE);
        hourResult = toMinute(hourValue, HOUR);
        dayResult = toMinute(dayValue, DAY);
        weekResult = toMinute(weekValue, WEEK);

        assertEquals(secondTestResult, secondResult);
        assertEquals(minuteTestResult, minuteResult);
        assertEquals(hourTestResult, hourResult);
        assertEquals(dayTestResult, dayResult);
        assertEquals(weekTestResult, weekResult);
    }

	@Test 
	public void toHourTest() {
        secondTestResult = convert(secondValue, SECOND, HOUR);
        minuteTestResult = convert(minuteValue, MINUTE, HOUR);
        hourTestResult = convert(hourValue, HOUR, HOUR);
        dayTestResult = convert(dayValue, DAY, HOUR);
        weekTestResult = convert(weekValue, WEEK, HOUR);

        secondResult = toHour(secondValue, SECOND);
        minuteResult = toHour(minuteValue, MINUTE);
        hourResult = toHour(hourValue, HOUR);
        dayResult = toHour(dayValue, DAY);
        weekResult = toHour(weekValue, WEEK);

        assertEquals(secondTestResult, secondResult);
        assertEquals(minuteTestResult, minuteResult);
        assertEquals(hourTestResult, hourResult);
        assertEquals(dayTestResult, dayResult);
        assertEquals(weekTestResult, weekResult);
    }

	@Test 
	public void toDayTest() {
        secondTestResult = convert(secondValue, SECOND, DAY);
        minuteTestResult = convert(minuteValue, MINUTE, DAY);
        hourTestResult = convert(hourValue,HOUR , DAY);
        dayTestResult = convert(dayValue, DAY, DAY);
        weekTestResult = convert(weekValue, WEEK, DAY);

        secondResult = toDay(secondValue, SECOND);
        minuteResult = toDay(minuteValue, MINUTE);
        hourResult = toDay(hourValue, HOUR);
        dayResult = toDay(dayValue, DAY);
        weekResult = toDay(weekValue, WEEK);

        assertEquals(secondTestResult, secondResult);
        assertEquals(minuteTestResult, minuteResult);
        assertEquals(hourTestResult, hourResult);
        assertEquals(dayTestResult, dayResult);
        assertEquals(weekTestResult, weekResult);
    }

	@Test 
	public void toWeekTest() {
        secondTestResult = convert(secondValue, SECOND, WEEK);
        minuteTestResult = convert(minuteValue, MINUTE, WEEK);
        hourTestResult = convert(hourValue,HOUR , WEEK);
        dayTestResult = convert(dayValue, DAY, WEEK);
        weekTestResult = convert(weekValue, WEEK, WEEK);

        secondResult = toWeek(secondValue, SECOND);
        minuteResult = toWeek(minuteValue, MINUTE);
        hourResult = toWeek(hourValue, HOUR);
        dayResult = toWeek(dayValue, DAY);
        weekResult = toWeek(weekValue, WEEK);

        assertEquals(secondTestResult, secondResult);
        assertEquals(minuteTestResult, minuteResult);
        assertEquals(hourTestResult, hourResult);
        assertEquals(dayTestResult, dayResult);
        assertEquals(weekTestResult, weekResult);
    }
	
	@Test
	public void toSecondFixedResultTest() {
		secondValue = 1;
		minuteValue = 1;
		hourValue = 1;
		dayValue = 1;
		weekValue = 1;

        secondTestResult = new Time("1.00000000000000000000", SECOND);
        minuteTestResult = new Time("60.00000000000000000000", SECOND);
        hourTestResult = new Time("3600.00000000000000000000", SECOND);
        dayTestResult = new Time("86400.00000000000000000000", SECOND);
        weekTestResult = new Time("604800.00000000000000000000", SECOND);

        secondResult = toSecond(secondValue, SECOND);
        minuteResult = toSecond(minuteValue, MINUTE);
        hourResult = toSecond(hourValue, HOUR);
        dayResult = toSecond(dayValue, DAY);
        weekResult = toSecond(weekValue, WEEK);

        assertEquals(secondTestResult, secondResult);
        assertEquals(minuteTestResult, minuteResult);
        assertEquals(hourTestResult, hourResult);
        assertEquals(dayTestResult, dayResult);
        assertEquals(weekTestResult, weekResult);
    }
	
	@Test
	public void toMinuteFixedResultTest() {
		secondValue = 1;
		minuteValue = 1;
		hourValue = 1;
		dayValue = 1;
		weekValue = 1;

        secondTestResult = new Time("0.01666666666666666667", MINUTE);
        minuteTestResult = new Time("1.00000000000000000000", MINUTE);
        hourTestResult = new Time("60.00000000000000000000", MINUTE);
        dayTestResult = new Time("1440.00000000000000000000", MINUTE);
        weekTestResult = new Time("10080.00000000000000000000", MINUTE);

        secondResult = toMinute(secondValue, SECOND);
        minuteResult = toMinute(minuteValue, MINUTE);
        hourResult = toMinute(hourValue, HOUR);
        dayResult = toMinute(dayValue, DAY);
        weekResult = toMinute(weekValue, WEEK);

        assertEquals(secondTestResult, secondResult);
        assertEquals(minuteTestResult, minuteResult);
        assertEquals(hourTestResult, hourResult);
        assertEquals(dayTestResult, dayResult);
        assertEquals(weekTestResult, weekResult);
    }
	
	@Test
	public void toHourFixedResultTest() {
		secondValue = 1;
		minuteValue = 1;
		hourValue = 1;
		dayValue = 1;
		weekValue = 1;

        secondTestResult = new Time("0.00027777777777777778",HOUR);
        minuteTestResult = new Time("0.01666666666666666667", HOUR);
        hourTestResult = new Time("1.00000000000000000000", HOUR);
        dayTestResult = new Time("24.00000000000000000000", HOUR);
        weekTestResult = new Time("168.00000000000000000000", HOUR);

        secondResult = toHour(secondValue, SECOND);
        minuteResult = toHour(minuteValue, MINUTE);
        hourResult = toHour(hourValue, HOUR);
        dayResult = toHour(dayValue, DAY);
        weekResult = toHour(weekValue, WEEK);

        assertEquals(secondTestResult, secondResult);
        assertEquals(minuteTestResult, minuteResult);
        assertEquals(hourTestResult, hourResult);
        assertEquals(dayTestResult, dayResult);
        assertEquals(weekTestResult, weekResult);
    }
	
	@Test
	public void toDayFixedResultTest() {
		secondValue = 1;
		minuteValue = 1;
		hourValue = 1;
		dayValue = 1;
		weekValue = 1;

        secondTestResult = new Time("0.00001157407407407407",DAY);
        minuteTestResult = new Time("0.00069444444444444444", DAY);
        hourTestResult = new Time("0.04166666666666666667", DAY);
        dayTestResult = new Time("1.00000000000000000000", DAY);
        weekTestResult = new Time("7.00000000000000000000", DAY);

        secondResult = toDay(secondValue, SECOND);
        minuteResult = toDay(minuteValue, MINUTE);
        hourResult = toDay(hourValue, HOUR);
        dayResult = toDay(dayValue, DAY);
        weekResult = toDay(weekValue, WEEK);

        assertEquals(secondTestResult, secondResult);
        assertEquals(minuteTestResult, minuteResult);
        assertEquals(hourTestResult, hourResult);
        assertEquals(dayTestResult, dayResult);
        assertEquals(weekTestResult, weekResult);
    }
	
	@Test
	public void toWeekFixedResultTest() {
		secondValue = 1;
		minuteValue = 1;
		hourValue = 1;
		dayValue = 1;
		weekValue = 1;

        secondTestResult = new Time("0.00000165343915343915",WEEK);
        minuteTestResult = new Time("0.00009920634920634921", WEEK);
        hourTestResult = new Time("0.00595238095238095238", WEEK);
        dayTestResult = new Time("0.14285714285714285714", WEEK);
        weekTestResult = new Time("1.00000000000000000000", WEEK);

        secondResult = toWeek(secondValue, SECOND);
        minuteResult = toWeek(minuteValue, MINUTE);
        hourResult = toWeek(hourValue, HOUR);
        dayResult = toWeek(dayValue, DAY);
        weekResult = toWeek(weekValue, WEEK);

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
