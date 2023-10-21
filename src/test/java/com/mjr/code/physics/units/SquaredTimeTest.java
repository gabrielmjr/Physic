package com.mjr.code.physics.units;

import com.mjr.code.physics.NumberRandomizer;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static com.mjr.code.physics.Physic.ROUND_SCALE;
import static com.mjr.code.physics.units.SquaredTime.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquaredTimeTest {
	@Test
	public void toSquaredSecondTest() throws IllegalArgumentException {
		double squaredSecondValue = NumberRandomizer.getRandomDouble();
		double squaredMinuteValue = NumberRandomizer.getRandomDouble();
		double squaredHourValue = NumberRandomizer.getRandomDouble();
		double squaredDayValue = NumberRandomizer.getRandomDouble();
		double squaredWeekValue = NumberRandomizer.getRandomDouble();
        SquaredTime squaredSecondTestResult = new SquaredTime(BigDecimal.valueOf(squaredSecondValue).multiply(SQUAREDD_TIME_SCALES[SQUARED_SECOND - 26]).divide(SQUAREDD_TIME_SCALES[SQUARED_SECOND - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_SECOND);
        SquaredTime squaredMinuteTestResult = new SquaredTime(BigDecimal.valueOf(squaredMinuteValue).multiply(SQUAREDD_TIME_SCALES[SQUARED_SECOND - 26]).divide(SQUAREDD_TIME_SCALES[SQUARED_MINUTE - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_SECOND);
        SquaredTime squaredHourTestResult = new SquaredTime(BigDecimal.valueOf(squaredHourValue).multiply(SQUAREDD_TIME_SCALES[SQUARED_SECOND - 26]).divide(SQUAREDD_TIME_SCALES[SQUARED_HOUR - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_SECOND);
        SquaredTime squaredDayTestResult = new SquaredTime(BigDecimal.valueOf(squaredDayValue).multiply(SQUAREDD_TIME_SCALES[SQUARED_SECOND - 26]).divide(SQUAREDD_TIME_SCALES[SQUARED_DAY - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_SECOND);
        SquaredTime squaredWeekTestResult = new SquaredTime(BigDecimal.valueOf(squaredWeekValue).multiply(SQUAREDD_TIME_SCALES[SQUARED_SECOND - 26]).divide(SQUAREDD_TIME_SCALES[SQUARED_WEEK - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_SECOND);

        SquaredTime squaredSecondResult = toSquaredSecond(squaredSecondValue, SQUARED_SECOND);
        SquaredTime squaredMinuteResult = toSquaredSecond(squaredMinuteValue, SQUARED_MINUTE);
        SquaredTime squaredHourResult = toSquaredSecond(squaredHourValue, SQUARED_HOUR);
        SquaredTime squaredDayResult = toSquaredSecond(squaredDayValue, SQUARED_DAY);
        SquaredTime squaredWeekResult = toSquaredSecond(squaredWeekValue, SQUARED_WEEK);

        assertEquals(squaredSecondTestResult, squaredSecondResult);
        assertEquals(squaredMinuteTestResult, squaredMinuteResult);
        assertEquals(squaredHourTestResult, squaredHourResult);
        assertEquals(squaredDayTestResult, squaredDayResult);
        assertEquals(squaredWeekTestResult, squaredWeekResult);
    }
	
	@Test
	public void toSquaredMinuteTest() throws IllegalArgumentException {
		double squaredSecondValue = NumberRandomizer.getRandomDouble();
		double squaredMinuteValue = NumberRandomizer.getRandomDouble();
		double squaredHourValue = NumberRandomizer.getRandomDouble();
		double squaredDayValue = NumberRandomizer.getRandomDouble();
		double squaredWeekValue = NumberRandomizer.getRandomDouble();
        SquaredTime squaredSecondTestResult = new SquaredTime(BigDecimal.valueOf(squaredSecondValue).multiply(SQUAREDD_TIME_SCALES[SQUARED_MINUTE - 26]).divide(SQUAREDD_TIME_SCALES[SQUARED_SECOND - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_MINUTE);
        SquaredTime squaredMinuteTestResult = new SquaredTime(BigDecimal.valueOf(squaredMinuteValue).multiply(SQUAREDD_TIME_SCALES[SQUARED_MINUTE - 26]).divide(SQUAREDD_TIME_SCALES[SQUARED_MINUTE - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_MINUTE);
        SquaredTime squaredHourTestResult = new SquaredTime(BigDecimal.valueOf(squaredHourValue).multiply(SQUAREDD_TIME_SCALES[SQUARED_MINUTE - 26]).divide(SQUAREDD_TIME_SCALES[SQUARED_HOUR - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_MINUTE);
        SquaredTime squaredDayTestResult = new SquaredTime(BigDecimal.valueOf(squaredDayValue).multiply(SQUAREDD_TIME_SCALES[SQUARED_MINUTE - 26]).divide(SQUAREDD_TIME_SCALES[SQUARED_DAY - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_MINUTE);
        SquaredTime squaredWeekTestResult = new SquaredTime(BigDecimal.valueOf(squaredWeekValue).multiply(SQUAREDD_TIME_SCALES[SQUARED_MINUTE - 26]).divide(SQUAREDD_TIME_SCALES[SQUARED_WEEK - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_MINUTE);

        SquaredTime squaredSecondResult = toSquaredMinute(squaredSecondValue, SQUARED_SECOND);
        SquaredTime squaredMinuteResult = toSquaredMinute(squaredMinuteValue, SQUARED_MINUTE);
        SquaredTime squaredHourResult = toSquaredMinute(squaredHourValue, SQUARED_HOUR);
        SquaredTime squaredDayResult = toSquaredMinute(squaredDayValue, SQUARED_DAY);
        SquaredTime squaredWeekResult = toSquaredMinute(squaredWeekValue, SQUARED_WEEK);

        assertEquals(squaredSecondTestResult, squaredSecondResult);
        assertEquals(squaredMinuteTestResult, squaredMinuteResult);
        assertEquals(squaredHourTestResult, squaredHourResult);
        assertEquals(squaredDayTestResult, squaredDayResult);
        assertEquals(squaredWeekTestResult, squaredWeekResult);
    }
	
	@Test
	public void toSquaredHourTest() throws IllegalArgumentException {
		double squaredSecondValue = NumberRandomizer.getRandomDouble();
		double squaredMinuteValue = NumberRandomizer.getRandomDouble();
		double squaredHourValue = NumberRandomizer.getRandomDouble();
		double squaredDayValue = NumberRandomizer.getRandomDouble();
		double squaredWeekValue = NumberRandomizer.getRandomDouble();
        SquaredTime squaredSecondTestResult = new SquaredTime(BigDecimal.valueOf(squaredSecondValue).multiply(SQUAREDD_TIME_SCALES[SQUARED_HOUR - 26]).divide(SQUAREDD_TIME_SCALES[SQUARED_SECOND - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_HOUR);
        SquaredTime squaredMinuteTestResult = new SquaredTime(BigDecimal.valueOf(squaredMinuteValue).multiply(SQUAREDD_TIME_SCALES[SQUARED_HOUR - 26]).divide(SQUAREDD_TIME_SCALES[SQUARED_MINUTE - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_HOUR);
        SquaredTime squaredHourTestResult = new SquaredTime(BigDecimal.valueOf(squaredHourValue).multiply(SQUAREDD_TIME_SCALES[SQUARED_HOUR - 26]).divide(SQUAREDD_TIME_SCALES[SQUARED_HOUR - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_HOUR);
        SquaredTime squaredDayTestResult = new SquaredTime(BigDecimal.valueOf(squaredDayValue).multiply(SQUAREDD_TIME_SCALES[SQUARED_HOUR - 26]).divide(SQUAREDD_TIME_SCALES[SQUARED_DAY - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_HOUR);
        SquaredTime squaredWeekTestResult = new SquaredTime(BigDecimal.valueOf(squaredWeekValue).multiply(SQUAREDD_TIME_SCALES[SQUARED_HOUR - 26]).divide(SQUAREDD_TIME_SCALES[SQUARED_WEEK - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_HOUR);

        SquaredTime squaredSecondResult = toSquaredHour(squaredSecondValue, SQUARED_SECOND);
        SquaredTime squaredMinuteResult = toSquaredHour(squaredMinuteValue, SQUARED_MINUTE);
        SquaredTime squaredHourResult = toSquaredHour(squaredHourValue, SQUARED_HOUR);
        SquaredTime squaredDayResult = toSquaredHour(squaredDayValue, SQUARED_DAY);
        SquaredTime squaredWeekResult = toSquaredHour(squaredWeekValue, SQUARED_WEEK);

        assertEquals(squaredSecondTestResult, squaredSecondResult);
        assertEquals(squaredMinuteTestResult, squaredMinuteResult);
        assertEquals(squaredHourTestResult, squaredHourResult);
        assertEquals(squaredDayTestResult, squaredDayResult);
        assertEquals(squaredWeekTestResult, squaredWeekResult);
    }
	
	@Test
	public void toSquaredDayTest() throws IllegalArgumentException {
		double squaredSecondValue = NumberRandomizer.getRandomDouble();
		double squaredMinuteValue = NumberRandomizer.getRandomDouble();
		double squaredHourValue = NumberRandomizer.getRandomDouble();
		double squaredDayValue = NumberRandomizer.getRandomDouble();
		double squaredWeekValue = NumberRandomizer.getRandomDouble();
        SquaredTime squaredSecondTestResult = new SquaredTime(BigDecimal.valueOf(squaredSecondValue).multiply(SQUAREDD_TIME_SCALES[SQUARED_DAY - 26]).divide(SQUAREDD_TIME_SCALES[SQUARED_SECOND - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_DAY);
        SquaredTime squaredMinuteTestResult = new SquaredTime(BigDecimal.valueOf(squaredMinuteValue).multiply(SQUAREDD_TIME_SCALES[SQUARED_DAY - 26]).divide(SQUAREDD_TIME_SCALES[SQUARED_MINUTE - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_DAY);
        SquaredTime squaredHourTestResult = new SquaredTime(BigDecimal.valueOf(squaredHourValue).multiply(SQUAREDD_TIME_SCALES[SQUARED_DAY - 26]).divide(SQUAREDD_TIME_SCALES[SQUARED_HOUR - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_DAY);
        SquaredTime squaredDayTestResult = new SquaredTime(BigDecimal.valueOf(squaredDayValue).multiply(SQUAREDD_TIME_SCALES[SQUARED_DAY - 26]).divide(SQUAREDD_TIME_SCALES[SQUARED_DAY - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_DAY);
        SquaredTime squaredWeekTestResult = new SquaredTime(BigDecimal.valueOf(squaredWeekValue).multiply(SQUAREDD_TIME_SCALES[SQUARED_DAY - 26]).divide(SQUAREDD_TIME_SCALES[SQUARED_WEEK - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_DAY);

        SquaredTime squaredSecondResult = toSquaredDay(squaredSecondValue, SQUARED_SECOND);
        SquaredTime squaredMinuteResult = toSquaredDay(squaredMinuteValue, SQUARED_MINUTE);
        SquaredTime squaredHourResult = toSquaredDay(squaredHourValue, SQUARED_HOUR);
        SquaredTime squaredDayResult = toSquaredDay(squaredDayValue, SQUARED_DAY);
        SquaredTime squaredWeekResult = toSquaredDay(squaredWeekValue, SQUARED_WEEK);

        assertEquals(squaredSecondTestResult, squaredSecondResult);
        assertEquals(squaredMinuteTestResult, squaredMinuteResult);
        assertEquals(squaredHourTestResult, squaredHourResult);
        assertEquals(squaredDayTestResult, squaredDayResult);
        assertEquals(squaredWeekTestResult, squaredWeekResult);
    }
	
	@Test
	public void toSquaredWeekTest() throws IllegalArgumentException {
		double squaredSecondValue = NumberRandomizer.getRandomDouble();
		double squaredMinuteValue = NumberRandomizer.getRandomDouble();
		double squaredHourValue = NumberRandomizer.getRandomDouble();
		double squaredDayValue = NumberRandomizer.getRandomDouble();
		double squaredWeekValue = NumberRandomizer.getRandomDouble();
        SquaredTime squaredSecondTestResult = new SquaredTime(BigDecimal.valueOf(squaredSecondValue).multiply(SQUAREDD_TIME_SCALES[SQUARED_WEEK - 26]).divide(SQUAREDD_TIME_SCALES[SQUARED_SECOND - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_WEEK);
        SquaredTime squaredMinuteTestResult = new SquaredTime(BigDecimal.valueOf(squaredMinuteValue).multiply(SQUAREDD_TIME_SCALES[SQUARED_WEEK - 26]).divide(SQUAREDD_TIME_SCALES[SQUARED_MINUTE - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_WEEK);
        SquaredTime squaredHourTestResult = new SquaredTime(BigDecimal.valueOf(squaredHourValue).multiply(SQUAREDD_TIME_SCALES[SQUARED_WEEK - 26]).divide(SQUAREDD_TIME_SCALES[SQUARED_HOUR - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_WEEK);
        SquaredTime squaredDayTestResult = new SquaredTime(BigDecimal.valueOf(squaredDayValue).multiply(SQUAREDD_TIME_SCALES[SQUARED_WEEK - 26]).divide(SQUAREDD_TIME_SCALES[SQUARED_DAY - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_WEEK);
        SquaredTime squaredWeekTestResult = new SquaredTime(BigDecimal.valueOf(squaredWeekValue).multiply(SQUAREDD_TIME_SCALES[SQUARED_WEEK - 26]).divide(SQUAREDD_TIME_SCALES[SQUARED_WEEK - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_WEEK);

        SquaredTime squaredSecondResult = toSquaredWeek(squaredSecondValue, SQUARED_SECOND);
        SquaredTime squaredMinuteResult = toSquaredWeek(squaredMinuteValue, SQUARED_MINUTE);
        SquaredTime squaredHourResult = toSquaredWeek(squaredHourValue, SQUARED_HOUR);
        SquaredTime squaredDayResult = toSquaredWeek(squaredDayValue, SQUARED_DAY);
        SquaredTime squaredWeekResult = toSquaredWeek(squaredWeekValue, SQUARED_WEEK);

        assertEquals(squaredSecondTestResult, squaredSecondResult);
        assertEquals(squaredMinuteTestResult, squaredMinuteResult);
        assertEquals(squaredHourTestResult, squaredHourResult);
        assertEquals(squaredDayTestResult, squaredDayResult);
        assertEquals(squaredWeekTestResult, squaredWeekResult);
    }
	
	
	@Test
	public void toSquaredSecondFixedResultTest() throws IllegalArgumentException {
		int squaredSecondValue = 1;
		int squaredMinuteValue = 1;
		int squaredHourValue = 1;
		int squaredDayValue = 1;
		int squaredWeekValue = 1;
        SquaredTime squaredSecondTestResult = new SquaredTime("1.00000000000000000000", SQUARED_SECOND);
        SquaredTime squaredMinuteTestResult = new SquaredTime("3600.00000000000000000000", SQUARED_SECOND);
        SquaredTime squaredHourTestResult = new SquaredTime("12960000.00000000000000000000", SQUARED_SECOND);
        SquaredTime squaredDayTestResult = new SquaredTime("7464960000.00000000000000000000", SQUARED_SECOND);
        SquaredTime squaredWeekTestResult = new SquaredTime("365783040000.00000000000000000000", SQUARED_SECOND);

        SquaredTime squaredSecondResult = toSquaredSecond(squaredSecondValue, SQUARED_SECOND);
        SquaredTime squaredMinuteResult = toSquaredSecond(squaredMinuteValue, SQUARED_MINUTE);
        SquaredTime squaredHourResult = toSquaredSecond(squaredHourValue, SQUARED_HOUR);
        SquaredTime squaredDayResult = toSquaredSecond(squaredDayValue, SQUARED_DAY);
        SquaredTime squaredWeekResult = toSquaredSecond(squaredWeekValue, SQUARED_WEEK);

        assertEquals(squaredSecondTestResult, squaredSecondResult);
        assertEquals(squaredMinuteTestResult, squaredMinuteResult);
        assertEquals(squaredHourTestResult, squaredHourResult);
        assertEquals(squaredDayTestResult, squaredDayResult);
        assertEquals(squaredWeekTestResult, squaredWeekResult);
    }
	
	@Test
	public void toSquaredMinuteFixedResultTest() throws IllegalArgumentException {
		int squaredSecondValue = 1;
		int squaredMinuteValue = 1;
		int squaredHourValue = 1;
		int squaredDayValue = 1;
		int squaredWeekValue = 1;
        SquaredTime squaredSecondTestResult = new SquaredTime("0.00027777777777777778", SQUARED_MINUTE);
        SquaredTime squaredMinuteTestResult = new SquaredTime("1.00000000000000000000", SQUARED_MINUTE);
        SquaredTime squaredHourTestResult = new SquaredTime("3600.00000000000000000000", SQUARED_MINUTE);
        SquaredTime squaredDayTestResult = new SquaredTime("2073600.00000000000000000000", SQUARED_MINUTE);
        SquaredTime squaredWeekTestResult = new SquaredTime("101606400.00000000000000000000", SQUARED_MINUTE);

        SquaredTime squaredSecondResult = toSquaredMinute(squaredSecondValue, SQUARED_SECOND);
        SquaredTime squaredMinuteResult = toSquaredMinute(squaredMinuteValue, SQUARED_MINUTE);
        SquaredTime squaredHourResult = toSquaredMinute(squaredHourValue, SQUARED_HOUR);
        SquaredTime squaredDayResult = toSquaredMinute(squaredDayValue, SQUARED_DAY);
        SquaredTime squaredWeekResult = toSquaredMinute(squaredWeekValue, SQUARED_WEEK);

        assertEquals(squaredSecondTestResult, squaredSecondResult);
        assertEquals(squaredMinuteTestResult, squaredMinuteResult);
        assertEquals(squaredHourTestResult, squaredHourResult);
        assertEquals(squaredDayTestResult, squaredDayResult);
        assertEquals(squaredWeekTestResult, squaredWeekResult);
    }
	
	@Test
	public void toSquaredHourFixedResultTest() throws IllegalArgumentException {
		int squaredSecondValue = 1;
		int squaredMinuteValue = 1;
		int squaredHourValue = 1;
		int squaredDayValue = 1;
		int squaredWeekValue = 1;
        SquaredTime squaredSecondTestResult = new SquaredTime("0.00000007716049382716", SQUARED_HOUR);
        SquaredTime squaredMinuteTestResult = new SquaredTime("0.00027777777777777778", SQUARED_HOUR);
        SquaredTime squaredHourTestResult = new SquaredTime("1.00000000000000000000", SQUARED_HOUR);
        SquaredTime squaredDayTestResult = new SquaredTime("576.00000000000000000000", SQUARED_HOUR);
        SquaredTime squaredWeekTestResult = new SquaredTime("28224.00000000000000000000", SQUARED_HOUR);

        SquaredTime squaredSecondResult = toSquaredHour(squaredSecondValue, SQUARED_SECOND);
        SquaredTime squaredMinuteResult = toSquaredHour(squaredMinuteValue, SQUARED_MINUTE);
        SquaredTime squaredHourResult = toSquaredHour(squaredHourValue, SQUARED_HOUR);
        SquaredTime squaredDayResult = toSquaredHour(squaredDayValue, SQUARED_DAY);
        SquaredTime squaredWeekResult = toSquaredHour(squaredWeekValue, SQUARED_WEEK);

        assertEquals(squaredSecondTestResult, squaredSecondResult);
        assertEquals(squaredMinuteTestResult, squaredMinuteResult);
        assertEquals(squaredHourTestResult, squaredHourResult);
        assertEquals(squaredDayTestResult, squaredDayResult);
        assertEquals(squaredWeekTestResult, squaredWeekResult);
    }
	
	@Test
	public void toSquaredDayFixedResultTest() throws IllegalArgumentException {
		int squaredSecondValue = 1;
		int squaredMinuteValue = 1;
		int squaredHourValue = 1;
		int squaredDayValue = 1;
		int squaredWeekValue = 1;
        SquaredTime squaredSecondTestResult = new SquaredTime("0.00000000013395919067", SQUARED_DAY);
        SquaredTime squaredMinuteTestResult = new SquaredTime("0.00000048225308641975", SQUARED_DAY);
        SquaredTime squaredHourTestResult = new SquaredTime("0.00173611111111111111", SQUARED_DAY);
        SquaredTime squaredDayTestResult = new SquaredTime("1.00000000000000000000", SQUARED_DAY);
        SquaredTime squaredWeekTestResult = new SquaredTime("49.00000000000000000000", SQUARED_DAY);

        SquaredTime squaredSecondResult = toSquaredDay(squaredSecondValue, SQUARED_SECOND);
        SquaredTime squaredMinuteResult = toSquaredDay(squaredMinuteValue, SQUARED_MINUTE);
        SquaredTime squaredHourResult = toSquaredDay(squaredHourValue, SQUARED_HOUR);
        SquaredTime squaredDayResult = toSquaredDay(squaredDayValue, SQUARED_DAY);
        SquaredTime squaredWeekResult = toSquaredDay(squaredWeekValue, SQUARED_WEEK);

        assertEquals(squaredSecondTestResult, squaredSecondResult);
        assertEquals(squaredMinuteTestResult, squaredMinuteResult);
        assertEquals(squaredHourTestResult, squaredHourResult);
        assertEquals(squaredDayTestResult, squaredDayResult);
        assertEquals(squaredWeekTestResult, squaredWeekResult);
    }
	
	@Test
	public void toSquaredWeekFixedResultTest() throws IllegalArgumentException {
		int squaredSecondValue = 1;
		int squaredMinuteValue = 1;
		int squaredHourValue = 1;
		int squaredDayValue = 1;
		int squaredWeekValue = 1;
        SquaredTime squaredSecondTestResult = new SquaredTime("0.00000000000273386103", SQUARED_WEEK);
        SquaredTime squaredMinuteTestResult = new SquaredTime("0.00000000984189972285", SQUARED_WEEK);
        SquaredTime squaredHourTestResult = new SquaredTime("0.00003543083900226757", SQUARED_WEEK);
        SquaredTime squaredDayTestResult = new SquaredTime("0.02040816326530612245", SQUARED_WEEK);
        SquaredTime squaredWeekTestResult = new SquaredTime("1.00000000000000000000", SQUARED_WEEK);

        SquaredTime squaredSecondResult = toSquaredWeek(squaredSecondValue, SQUARED_SECOND);
        SquaredTime squaredMinuteResult = toSquaredWeek(squaredMinuteValue, SQUARED_MINUTE);
        SquaredTime squaredHourResult = toSquaredWeek(squaredHourValue, SQUARED_HOUR);
        SquaredTime squaredDayResult = toSquaredWeek(squaredDayValue, SQUARED_DAY);
        SquaredTime squaredWeekResult = toSquaredWeek(squaredWeekValue, SQUARED_WEEK);

        assertEquals(squaredSecondTestResult, squaredSecondResult);
        assertEquals(squaredMinuteTestResult, squaredMinuteResult);
        assertEquals(squaredHourTestResult, squaredHourResult);
        assertEquals(squaredDayTestResult, squaredDayResult);
        assertEquals(squaredWeekTestResult, squaredWeekResult);
    }
}
