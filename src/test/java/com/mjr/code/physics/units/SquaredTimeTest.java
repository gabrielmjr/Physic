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
	public void toSquareSecondTest() throws IllegalArgumentException {
		double squareSecondValue = NumberRandomizer.getRandomDouble();
		double squareMinuteValue = NumberRandomizer.getRandomDouble();
		double squareHourValue = NumberRandomizer.getRandomDouble();
		double squareDayValue = NumberRandomizer.getRandomDouble();
		double squareWeekValue = NumberRandomizer.getRandomDouble();
        SquaredTime squareSecondTestResult = new SquaredTime(BigDecimal.valueOf(squareSecondValue).multiply(SQUARED_TIME_SCALES[SQUARE_SECOND - 26]).divide(SQUARED_TIME_SCALES[SQUARE_SECOND - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_SECOND);
        SquaredTime squareMinuteTestResult = new SquaredTime(BigDecimal.valueOf(squareMinuteValue).multiply(SQUARED_TIME_SCALES[SQUARE_SECOND - 26]).divide(SQUARED_TIME_SCALES[SQUARE_MINUTE - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_SECOND);
        SquaredTime squareHourTestResult = new SquaredTime(BigDecimal.valueOf(squareHourValue).multiply(SQUARED_TIME_SCALES[SQUARE_SECOND - 26]).divide(SQUARED_TIME_SCALES[SQUARE_HOUR - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_SECOND);
        SquaredTime squareDayTestResult = new SquaredTime(BigDecimal.valueOf(squareDayValue).multiply(SQUARED_TIME_SCALES[SQUARE_SECOND - 26]).divide(SQUARED_TIME_SCALES[SQUARE_DAY - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_SECOND);
        SquaredTime squareWeekTestResult = new SquaredTime(BigDecimal.valueOf(squareWeekValue).multiply(SQUARED_TIME_SCALES[SQUARE_SECOND - 26]).divide(SQUARED_TIME_SCALES[SQUARE_WEEK - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_SECOND);

        SquaredTime squareSecondResult = toSquareSecond(squareSecondValue, SQUARE_SECOND);
        SquaredTime squareMinuteResult = toSquareSecond(squareMinuteValue, SQUARE_MINUTE);
        SquaredTime squareHourResult = toSquareSecond(squareHourValue, SQUARE_HOUR);
        SquaredTime squareDayResult = toSquareSecond(squareDayValue, SQUARE_DAY);
        SquaredTime squareWeekResult = toSquareSecond(squareWeekValue, SQUARE_WEEK);

        assertEquals(squareSecondTestResult, squareSecondResult);
        assertEquals(squareMinuteTestResult, squareMinuteResult);
        assertEquals(squareHourTestResult, squareHourResult);
        assertEquals(squareDayTestResult, squareDayResult);
        assertEquals(squareWeekTestResult, squareWeekResult);
    }
	
	@Test
	public void toSquareMinuteTest() throws IllegalArgumentException {
		double squareSecondValue = NumberRandomizer.getRandomDouble();
		double squareMinuteValue = NumberRandomizer.getRandomDouble();
		double squareHourValue = NumberRandomizer.getRandomDouble();
		double squareDayValue = NumberRandomizer.getRandomDouble();
		double squareWeekValue = NumberRandomizer.getRandomDouble();
        SquaredTime squareSecondTestResult = new SquaredTime(BigDecimal.valueOf(squareSecondValue).multiply(SQUARED_TIME_SCALES[SQUARE_MINUTE - 26]).divide(SQUARED_TIME_SCALES[SQUARE_SECOND - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_MINUTE);
        SquaredTime squareMinuteTestResult = new SquaredTime(BigDecimal.valueOf(squareMinuteValue).multiply(SQUARED_TIME_SCALES[SQUARE_MINUTE - 26]).divide(SQUARED_TIME_SCALES[SQUARE_MINUTE - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_MINUTE);
        SquaredTime squareHourTestResult = new SquaredTime(BigDecimal.valueOf(squareHourValue).multiply(SQUARED_TIME_SCALES[SQUARE_MINUTE - 26]).divide(SQUARED_TIME_SCALES[SQUARE_HOUR - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_MINUTE);
        SquaredTime squareDayTestResult = new SquaredTime(BigDecimal.valueOf(squareDayValue).multiply(SQUARED_TIME_SCALES[SQUARE_MINUTE - 26]).divide(SQUARED_TIME_SCALES[SQUARE_DAY - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_MINUTE);
        SquaredTime squareWeekTestResult = new SquaredTime(BigDecimal.valueOf(squareWeekValue).multiply(SQUARED_TIME_SCALES[SQUARE_MINUTE - 26]).divide(SQUARED_TIME_SCALES[SQUARE_WEEK - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_MINUTE);

        SquaredTime squareSecondResult = toSquareMinute(squareSecondValue, SQUARE_SECOND);
        SquaredTime squareMinuteResult = toSquareMinute(squareMinuteValue, SQUARE_MINUTE);
        SquaredTime squareHourResult = toSquareMinute(squareHourValue, SQUARE_HOUR);
        SquaredTime squareDayResult = toSquareMinute(squareDayValue, SQUARE_DAY);
        SquaredTime squareWeekResult = toSquareMinute(squareWeekValue, SQUARE_WEEK);

        assertEquals(squareSecondTestResult, squareSecondResult);
        assertEquals(squareMinuteTestResult, squareMinuteResult);
        assertEquals(squareHourTestResult, squareHourResult);
        assertEquals(squareDayTestResult, squareDayResult);
        assertEquals(squareWeekTestResult, squareWeekResult);
    }
	
	@Test
	public void toSquareHourTest() throws IllegalArgumentException {
		double squareSecondValue = NumberRandomizer.getRandomDouble();
		double squareMinuteValue = NumberRandomizer.getRandomDouble();
		double squareHourValue = NumberRandomizer.getRandomDouble();
		double squareDayValue = NumberRandomizer.getRandomDouble();
		double squareWeekValue = NumberRandomizer.getRandomDouble();
        SquaredTime squareSecondTestResult = new SquaredTime(BigDecimal.valueOf(squareSecondValue).multiply(SQUARED_TIME_SCALES[SQUARE_HOUR - 26]).divide(SQUARED_TIME_SCALES[SQUARE_SECOND - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_HOUR);
        SquaredTime squareMinuteTestResult = new SquaredTime(BigDecimal.valueOf(squareMinuteValue).multiply(SQUARED_TIME_SCALES[SQUARE_HOUR - 26]).divide(SQUARED_TIME_SCALES[SQUARE_MINUTE - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_HOUR);
        SquaredTime squareHourTestResult = new SquaredTime(BigDecimal.valueOf(squareHourValue).multiply(SQUARED_TIME_SCALES[SQUARE_HOUR - 26]).divide(SQUARED_TIME_SCALES[SQUARE_HOUR - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_HOUR);
        SquaredTime squareDayTestResult = new SquaredTime(BigDecimal.valueOf(squareDayValue).multiply(SQUARED_TIME_SCALES[SQUARE_HOUR - 26]).divide(SQUARED_TIME_SCALES[SQUARE_DAY - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_HOUR);
        SquaredTime squareWeekTestResult = new SquaredTime(BigDecimal.valueOf(squareWeekValue).multiply(SQUARED_TIME_SCALES[SQUARE_HOUR - 26]).divide(SQUARED_TIME_SCALES[SQUARE_WEEK - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_HOUR);

        SquaredTime squareSecondResult = toSquareHour(squareSecondValue, SQUARE_SECOND);
        SquaredTime squareMinuteResult = toSquareHour(squareMinuteValue, SQUARE_MINUTE);
        SquaredTime squareHourResult = toSquareHour(squareHourValue, SQUARE_HOUR);
        SquaredTime squareDayResult = toSquareHour(squareDayValue, SQUARE_DAY);
        SquaredTime squareWeekResult = toSquareHour(squareWeekValue, SQUARE_WEEK);

        assertEquals(squareSecondTestResult, squareSecondResult);
        assertEquals(squareMinuteTestResult, squareMinuteResult);
        assertEquals(squareHourTestResult, squareHourResult);
        assertEquals(squareDayTestResult, squareDayResult);
        assertEquals(squareWeekTestResult, squareWeekResult);
    }
	
	@Test
	public void toSquareDayTest() throws IllegalArgumentException {
		double squareSecondValue = NumberRandomizer.getRandomDouble();
		double squareMinuteValue = NumberRandomizer.getRandomDouble();
		double squareHourValue = NumberRandomizer.getRandomDouble();
		double squareDayValue = NumberRandomizer.getRandomDouble();
		double squareWeekValue = NumberRandomizer.getRandomDouble();
        SquaredTime squareSecondTestResult = new SquaredTime(BigDecimal.valueOf(squareSecondValue).multiply(SQUARED_TIME_SCALES[SQUARE_DAY - 26]).divide(SQUARED_TIME_SCALES[SQUARE_SECOND - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_DAY);
        SquaredTime squareMinuteTestResult = new SquaredTime(BigDecimal.valueOf(squareMinuteValue).multiply(SQUARED_TIME_SCALES[SQUARE_DAY - 26]).divide(SQUARED_TIME_SCALES[SQUARE_MINUTE - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_DAY);
        SquaredTime squareHourTestResult = new SquaredTime(BigDecimal.valueOf(squareHourValue).multiply(SQUARED_TIME_SCALES[SQUARE_DAY - 26]).divide(SQUARED_TIME_SCALES[SQUARE_HOUR - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_DAY);
        SquaredTime squareDayTestResult = new SquaredTime(BigDecimal.valueOf(squareDayValue).multiply(SQUARED_TIME_SCALES[SQUARE_DAY - 26]).divide(SQUARED_TIME_SCALES[SQUARE_DAY - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_DAY);
        SquaredTime squareWeekTestResult = new SquaredTime(BigDecimal.valueOf(squareWeekValue).multiply(SQUARED_TIME_SCALES[SQUARE_DAY - 26]).divide(SQUARED_TIME_SCALES[SQUARE_WEEK - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_DAY);

        SquaredTime squareSecondResult = toSquareDay(squareSecondValue, SQUARE_SECOND);
        SquaredTime squareMinuteResult = toSquareDay(squareMinuteValue, SQUARE_MINUTE);
        SquaredTime squareHourResult = toSquareDay(squareHourValue, SQUARE_HOUR);
        SquaredTime squareDayResult = toSquareDay(squareDayValue, SQUARE_DAY);
        SquaredTime squareWeekResult = toSquareDay(squareWeekValue, SQUARE_WEEK);

        assertEquals(squareSecondTestResult, squareSecondResult);
        assertEquals(squareMinuteTestResult, squareMinuteResult);
        assertEquals(squareHourTestResult, squareHourResult);
        assertEquals(squareDayTestResult, squareDayResult);
        assertEquals(squareWeekTestResult, squareWeekResult);
    }
	
	@Test
	public void toSquareWeekTest() throws IllegalArgumentException {
		double squareSecondValue = NumberRandomizer.getRandomDouble();
		double squareMinuteValue = NumberRandomizer.getRandomDouble();
		double squareHourValue = NumberRandomizer.getRandomDouble();
		double squareDayValue = NumberRandomizer.getRandomDouble();
		double squareWeekValue = NumberRandomizer.getRandomDouble();
        SquaredTime squareSecondTestResult = new SquaredTime(BigDecimal.valueOf(squareSecondValue).multiply(SQUARED_TIME_SCALES[SQUARE_WEEK - 26]).divide(SQUARED_TIME_SCALES[SQUARE_SECOND - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_WEEK);
        SquaredTime squareMinuteTestResult = new SquaredTime(BigDecimal.valueOf(squareMinuteValue).multiply(SQUARED_TIME_SCALES[SQUARE_WEEK - 26]).divide(SQUARED_TIME_SCALES[SQUARE_MINUTE - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_WEEK);
        SquaredTime squareHourTestResult = new SquaredTime(BigDecimal.valueOf(squareHourValue).multiply(SQUARED_TIME_SCALES[SQUARE_WEEK - 26]).divide(SQUARED_TIME_SCALES[SQUARE_HOUR - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_WEEK);
        SquaredTime squareDayTestResult = new SquaredTime(BigDecimal.valueOf(squareDayValue).multiply(SQUARED_TIME_SCALES[SQUARE_WEEK - 26]).divide(SQUARED_TIME_SCALES[SQUARE_DAY - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_WEEK);
        SquaredTime squareWeekTestResult = new SquaredTime(BigDecimal.valueOf(squareWeekValue).multiply(SQUARED_TIME_SCALES[SQUARE_WEEK - 26]).divide(SQUARED_TIME_SCALES[SQUARE_WEEK - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_WEEK);

        SquaredTime squareSecondResult = toSquareWeek(squareSecondValue, SQUARE_SECOND);
        SquaredTime squareMinuteResult = toSquareWeek(squareMinuteValue, SQUARE_MINUTE);
        SquaredTime squareHourResult = toSquareWeek(squareHourValue, SQUARE_HOUR);
        SquaredTime squareDayResult = toSquareWeek(squareDayValue, SQUARE_DAY);
        SquaredTime squareWeekResult = toSquareWeek(squareWeekValue, SQUARE_WEEK);

        assertEquals(squareSecondTestResult, squareSecondResult);
        assertEquals(squareMinuteTestResult, squareMinuteResult);
        assertEquals(squareHourTestResult, squareHourResult);
        assertEquals(squareDayTestResult, squareDayResult);
        assertEquals(squareWeekTestResult, squareWeekResult);
    }
	
	
	@Test
	public void toSquareSecondFixedResultTest() throws IllegalArgumentException {
		int squareSecondValue = 1;
		int squareMinuteValue = 1;
		int squareHourValue = 1;
		int squareDayValue = 1;
		int squareWeekValue = 1;
        SquaredTime squareSecondTestResult = new SquaredTime("1.00000000000000000000", SQUARE_SECOND);
        SquaredTime squareMinuteTestResult = new SquaredTime("3600.00000000000000000000", SQUARE_SECOND);
        SquaredTime squareHourTestResult = new SquaredTime("12960000.00000000000000000000", SQUARE_SECOND);
        SquaredTime squareDayTestResult = new SquaredTime("7464960000.00000000000000000000", SQUARE_SECOND);
        SquaredTime squareWeekTestResult = new SquaredTime("365783040000.00000000000000000000", SQUARE_SECOND);

        SquaredTime squareSecondResult = toSquareSecond(squareSecondValue, SQUARE_SECOND);
        SquaredTime squareMinuteResult = toSquareSecond(squareMinuteValue, SQUARE_MINUTE);
        SquaredTime squareHourResult = toSquareSecond(squareHourValue, SQUARE_HOUR);
        SquaredTime squareDayResult = toSquareSecond(squareDayValue, SQUARE_DAY);
        SquaredTime squareWeekResult = toSquareSecond(squareWeekValue, SQUARE_WEEK);

        assertEquals(squareSecondTestResult, squareSecondResult);
        assertEquals(squareMinuteTestResult, squareMinuteResult);
        assertEquals(squareHourTestResult, squareHourResult);
        assertEquals(squareDayTestResult, squareDayResult);
        assertEquals(squareWeekTestResult, squareWeekResult);
    }
	
	@Test
	public void toSquareMinuteFixedResultTest() throws IllegalArgumentException {
		int squareSecondValue = 1;
		int squareMinuteValue = 1;
		int squareHourValue = 1;
		int squareDayValue = 1;
		int squareWeekValue = 1;
        SquaredTime squareSecondTestResult = new SquaredTime("0.00027777777777777778", SQUARE_MINUTE);
        SquaredTime squareMinuteTestResult = new SquaredTime("1.00000000000000000000", SQUARE_MINUTE);
        SquaredTime squareHourTestResult = new SquaredTime("3600.00000000000000000000", SQUARE_MINUTE);
        SquaredTime squareDayTestResult = new SquaredTime("2073600.00000000000000000000", SQUARE_MINUTE);
        SquaredTime squareWeekTestResult = new SquaredTime("101606400.00000000000000000000", SQUARE_MINUTE);

        SquaredTime squareSecondResult = toSquareMinute(squareSecondValue, SQUARE_SECOND);
        SquaredTime squareMinuteResult = toSquareMinute(squareMinuteValue, SQUARE_MINUTE);
        SquaredTime squareHourResult = toSquareMinute(squareHourValue, SQUARE_HOUR);
        SquaredTime squareDayResult = toSquareMinute(squareDayValue, SQUARE_DAY);
        SquaredTime squareWeekResult = toSquareMinute(squareWeekValue, SQUARE_WEEK);

        assertEquals(squareSecondTestResult, squareSecondResult);
        assertEquals(squareMinuteTestResult, squareMinuteResult);
        assertEquals(squareHourTestResult, squareHourResult);
        assertEquals(squareDayTestResult, squareDayResult);
        assertEquals(squareWeekTestResult, squareWeekResult);
    }
	
	@Test
	public void toSquareHourFixedResultTest() throws IllegalArgumentException {
		int squareSecondValue = 1;
		int squareMinuteValue = 1;
		int squareHourValue = 1;
		int squareDayValue = 1;
		int squareWeekValue = 1;
        SquaredTime squareSecondTestResult = new SquaredTime("0.00000007716049382716", SQUARE_HOUR);
        SquaredTime squareMinuteTestResult = new SquaredTime("0.00027777777777777778", SQUARE_HOUR);
        SquaredTime squareHourTestResult = new SquaredTime("1.00000000000000000000", SQUARE_HOUR);
        SquaredTime squareDayTestResult = new SquaredTime("576.00000000000000000000", SQUARE_HOUR);
        SquaredTime squareWeekTestResult = new SquaredTime("28224.00000000000000000000", SQUARE_HOUR);

        SquaredTime squareSecondResult = toSquareHour(squareSecondValue, SQUARE_SECOND);
        SquaredTime squareMinuteResult = toSquareHour(squareMinuteValue, SQUARE_MINUTE);
        SquaredTime squareHourResult = toSquareHour(squareHourValue, SQUARE_HOUR);
        SquaredTime squareDayResult = toSquareHour(squareDayValue, SQUARE_DAY);
        SquaredTime squareWeekResult = toSquareHour(squareWeekValue, SQUARE_WEEK);

        assertEquals(squareSecondTestResult, squareSecondResult);
        assertEquals(squareMinuteTestResult, squareMinuteResult);
        assertEquals(squareHourTestResult, squareHourResult);
        assertEquals(squareDayTestResult, squareDayResult);
        assertEquals(squareWeekTestResult, squareWeekResult);
    }
	
	@Test
	public void toSquareDayFixedResultTest() throws IllegalArgumentException {
		int squareSecondValue = 1;
		int squareMinuteValue = 1;
		int squareHourValue = 1;
		int squareDayValue = 1;
		int squareWeekValue = 1;
        SquaredTime squareSecondTestResult = new SquaredTime("0.00000000013395919067", SQUARE_DAY);
        SquaredTime squareMinuteTestResult = new SquaredTime("0.00000048225308641975", SQUARE_DAY);
        SquaredTime squareHourTestResult = new SquaredTime("0.00173611111111111111", SQUARE_DAY);
        SquaredTime squareDayTestResult = new SquaredTime("1.00000000000000000000", SQUARE_DAY);
        SquaredTime squareWeekTestResult = new SquaredTime("49.00000000000000000000", SQUARE_DAY);

        SquaredTime squareSecondResult = toSquareDay(squareSecondValue, SQUARE_SECOND);
        SquaredTime squareMinuteResult = toSquareDay(squareMinuteValue, SQUARE_MINUTE);
        SquaredTime squareHourResult = toSquareDay(squareHourValue, SQUARE_HOUR);
        SquaredTime squareDayResult = toSquareDay(squareDayValue, SQUARE_DAY);
        SquaredTime squareWeekResult = toSquareDay(squareWeekValue, SQUARE_WEEK);

        assertEquals(squareSecondTestResult, squareSecondResult);
        assertEquals(squareMinuteTestResult, squareMinuteResult);
        assertEquals(squareHourTestResult, squareHourResult);
        assertEquals(squareDayTestResult, squareDayResult);
        assertEquals(squareWeekTestResult, squareWeekResult);
    }
	
	@Test
	public void toSquareWeekFixedResultTest() throws IllegalArgumentException {
		int squareSecondValue = 1;
		int squareMinuteValue = 1;
		int squareHourValue = 1;
		int squareDayValue = 1;
		int squareWeekValue = 1;
        SquaredTime squareSecondTestResult = new SquaredTime("0.00000000000273386103", SQUARE_WEEK);
        SquaredTime squareMinuteTestResult = new SquaredTime("0.00000000984189972285", SQUARE_WEEK);
        SquaredTime squareHourTestResult = new SquaredTime("0.00003543083900226757", SQUARE_WEEK);
        SquaredTime squareDayTestResult = new SquaredTime("0.02040816326530612245", SQUARE_WEEK);
        SquaredTime squareWeekTestResult = new SquaredTime("1.00000000000000000000", SQUARE_WEEK);

        SquaredTime squareSecondResult = toSquareWeek(squareSecondValue, SQUARE_SECOND);
        SquaredTime squareMinuteResult = toSquareWeek(squareMinuteValue, SQUARE_MINUTE);
        SquaredTime squareHourResult = toSquareWeek(squareHourValue, SQUARE_HOUR);
        SquaredTime squareDayResult = toSquareWeek(squareDayValue, SQUARE_DAY);
        SquaredTime squareWeekResult = toSquareWeek(squareWeekValue, SQUARE_WEEK);

        assertEquals(squareSecondTestResult, squareSecondResult);
        assertEquals(squareMinuteTestResult, squareMinuteResult);
        assertEquals(squareHourTestResult, squareHourResult);
        assertEquals(squareDayTestResult, squareDayResult);
        assertEquals(squareWeekTestResult, squareWeekResult);
    }
}
