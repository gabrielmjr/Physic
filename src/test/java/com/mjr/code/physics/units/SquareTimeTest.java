package com.mjr.code.physics.physics.units;

import com.mjr.code.physics.physics.NumberRandomizer;
import com.mjr.code.physics.units.Time;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static com.mjr.code.physics.physics.NumberRandomizer.getRandomDouble;
import static com.mjr.code.physics.Physic.ROUND_SCALE;
import static com.mjr.code.physics.units.Time.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTimeTest {
	@Test
	public void toSquareSecondTest() throws IllegalArgumentException {
		double squareSecondValue = NumberRandomizer.getRandomDouble();
		double squareMinuteValue = NumberRandomizer.getRandomDouble();
		double squareHourValue = NumberRandomizer.getRandomDouble();
		double squareDayValue = NumberRandomizer.getRandomDouble();
		double squareWeekValue = NumberRandomizer.getRandomDouble();
		try {
			Time squareSecondTestResult = new Time(BigDecimal.valueOf(squareSecondValue).multiply(SQUARE_TIME_SCALES[SQUARE_SECOND - 26]).divide(SQUARE_TIME_SCALES[SQUARE_SECOND - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_SECOND);
			Time squareMinuteTestResult = new Time(BigDecimal.valueOf(squareMinuteValue).multiply(SQUARE_TIME_SCALES[SQUARE_SECOND - 26]).divide(SQUARE_TIME_SCALES[SQUARE_MINUTE - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_SECOND);
			Time squareHourTestResult = new Time(BigDecimal.valueOf(squareHourValue).multiply(SQUARE_TIME_SCALES[SQUARE_SECOND - 26]).divide(SQUARE_TIME_SCALES[SQUARE_HOUR - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_SECOND);
			Time squareDayTestResult = new Time(BigDecimal.valueOf(squareDayValue).multiply(SQUARE_TIME_SCALES[SQUARE_SECOND - 26]).divide(SQUARE_TIME_SCALES[SQUARE_DAY - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_SECOND);
			Time squareWeekTestResult = new Time(BigDecimal.valueOf(squareWeekValue).multiply(SQUARE_TIME_SCALES[SQUARE_SECOND - 26]).divide(SQUARE_TIME_SCALES[SQUARE_WEEK - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_SECOND);
			
			Time squareSecondResult = toSquareSecond(squareSecondValue, SQUARE_SECOND);
			Time squareMinuteResult = toSquareSecond(squareMinuteValue, SQUARE_MINUTE);
			Time squareHourResult = toSquareSecond(squareHourValue, SQUARE_HOUR);
			Time squareDayResult = toSquareSecond(squareDayValue, SQUARE_DAY);
			Time squareWeekResult = toSquareSecond(squareWeekValue, SQUARE_WEEK);
			
			assertEquals(squareSecondTestResult, squareSecondResult);
			assertEquals(squareMinuteTestResult, squareMinuteResult);
			assertEquals(squareHourTestResult, squareHourResult);
			assertEquals(squareDayTestResult, squareDayResult);
			assertEquals(squareWeekTestResult, squareWeekResult);
		} catch (IllegalArgumentException e) {
			throw e;
		}
	}
	
	@Test
	public void toSquareMinuteTest() throws IllegalArgumentException {
		double squareSecondValue = NumberRandomizer.getRandomDouble();
		double squareMinuteValue = NumberRandomizer.getRandomDouble();
		double squareHourValue = NumberRandomizer.getRandomDouble();
		double squareDayValue = NumberRandomizer.getRandomDouble();
		double squareWeekValue = NumberRandomizer.getRandomDouble();
		try {
			Time squareSecondTestResult = new Time(BigDecimal.valueOf(squareSecondValue).multiply(SQUARE_TIME_SCALES[SQUARE_MINUTE - 26]).divide(SQUARE_TIME_SCALES[SQUARE_SECOND - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_MINUTE);
			Time squareMinuteTestResult = new Time(BigDecimal.valueOf(squareMinuteValue).multiply(SQUARE_TIME_SCALES[SQUARE_MINUTE - 26]).divide(SQUARE_TIME_SCALES[SQUARE_MINUTE - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_MINUTE);
			Time squareHourTestResult = new Time(BigDecimal.valueOf(squareHourValue).multiply(SQUARE_TIME_SCALES[SQUARE_MINUTE - 26]).divide(SQUARE_TIME_SCALES[SQUARE_HOUR - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_MINUTE);
			Time squareDayTestResult = new Time(BigDecimal.valueOf(squareDayValue).multiply(SQUARE_TIME_SCALES[SQUARE_MINUTE - 26]).divide(SQUARE_TIME_SCALES[SQUARE_DAY - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_MINUTE);
			Time squareWeekTestResult = new Time(BigDecimal.valueOf(squareWeekValue).multiply(SQUARE_TIME_SCALES[SQUARE_MINUTE - 26]).divide(SQUARE_TIME_SCALES[SQUARE_WEEK - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_MINUTE);

			Time squareSecondResult = toSquareMinute(squareSecondValue, SQUARE_SECOND);
			Time squareMinuteResult = toSquareMinute(squareMinuteValue, SQUARE_MINUTE);
			Time squareHourResult = toSquareMinute(squareHourValue, SQUARE_HOUR);
			Time squareDayResult = toSquareMinute(squareDayValue, SQUARE_DAY);
			Time squareWeekResult = toSquareMinute(squareWeekValue, SQUARE_WEEK);

			assertEquals(squareSecondTestResult, squareSecondResult);
			assertEquals(squareMinuteTestResult, squareMinuteResult);
			assertEquals(squareHourTestResult, squareHourResult);
			assertEquals(squareDayTestResult, squareDayResult);
			assertEquals(squareWeekTestResult, squareWeekResult);
		} catch (IllegalArgumentException e) {
			throw e;
		}
	}
	
	@Test
	public void toSquareHourTest() throws IllegalArgumentException {
		double squareSecondValue = NumberRandomizer.getRandomDouble();
		double squareMinuteValue = NumberRandomizer.getRandomDouble();
		double squareHourValue = NumberRandomizer.getRandomDouble();
		double squareDayValue = NumberRandomizer.getRandomDouble();
		double squareWeekValue = NumberRandomizer.getRandomDouble();
		try {
			Time squareSecondTestResult = new Time(BigDecimal.valueOf(squareSecondValue).multiply(SQUARE_TIME_SCALES[SQUARE_HOUR - 26]).divide(SQUARE_TIME_SCALES[SQUARE_SECOND - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_HOUR);
			Time squareMinuteTestResult = new Time(BigDecimal.valueOf(squareMinuteValue).multiply(SQUARE_TIME_SCALES[SQUARE_HOUR - 26]).divide(SQUARE_TIME_SCALES[SQUARE_MINUTE - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_HOUR);
			Time squareHourTestResult = new Time(BigDecimal.valueOf(squareHourValue).multiply(SQUARE_TIME_SCALES[SQUARE_HOUR - 26]).divide(SQUARE_TIME_SCALES[SQUARE_HOUR - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_HOUR);
			Time squareDayTestResult = new Time(BigDecimal.valueOf(squareDayValue).multiply(SQUARE_TIME_SCALES[SQUARE_HOUR - 26]).divide(SQUARE_TIME_SCALES[SQUARE_DAY - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_HOUR);
			Time squareWeekTestResult = new Time(BigDecimal.valueOf(squareWeekValue).multiply(SQUARE_TIME_SCALES[SQUARE_HOUR - 26]).divide(SQUARE_TIME_SCALES[SQUARE_WEEK - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_HOUR);

			Time squareSecondResult = toSquareHour(squareSecondValue, SQUARE_SECOND);
			Time squareMinuteResult = toSquareHour(squareMinuteValue, SQUARE_MINUTE);
			Time squareHourResult = toSquareHour(squareHourValue, SQUARE_HOUR);
			Time squareDayResult = toSquareHour(squareDayValue, SQUARE_DAY);
			Time squareWeekResult = toSquareHour(squareWeekValue, SQUARE_WEEK);

			assertEquals(squareSecondTestResult, squareSecondResult);
			assertEquals(squareMinuteTestResult, squareMinuteResult);
			assertEquals(squareHourTestResult, squareHourResult);
			assertEquals(squareDayTestResult, squareDayResult);
			assertEquals(squareWeekTestResult, squareWeekResult);
		} catch (IllegalArgumentException e) {
			throw e;
		}
	}
	
	@Test
	public void toSquareDayTest() throws IllegalArgumentException {
		double squareSecondValue = NumberRandomizer.getRandomDouble();
		double squareMinuteValue = NumberRandomizer.getRandomDouble();
		double squareHourValue = NumberRandomizer.getRandomDouble();
		double squareDayValue = NumberRandomizer.getRandomDouble();
		double squareWeekValue = NumberRandomizer.getRandomDouble();
		try {
			Time squareSecondTestResult = new Time(BigDecimal.valueOf(squareSecondValue).multiply(SQUARE_TIME_SCALES[SQUARE_DAY - 26]).divide(SQUARE_TIME_SCALES[SQUARE_SECOND - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_DAY);
			Time squareMinuteTestResult = new Time(BigDecimal.valueOf(squareMinuteValue).multiply(SQUARE_TIME_SCALES[SQUARE_DAY - 26]).divide(SQUARE_TIME_SCALES[SQUARE_MINUTE - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_DAY);
			Time squareHourTestResult = new Time(BigDecimal.valueOf(squareHourValue).multiply(SQUARE_TIME_SCALES[SQUARE_DAY - 26]).divide(SQUARE_TIME_SCALES[SQUARE_HOUR - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_DAY);
			Time squareDayTestResult = new Time(BigDecimal.valueOf(squareDayValue).multiply(SQUARE_TIME_SCALES[SQUARE_DAY - 26]).divide(SQUARE_TIME_SCALES[SQUARE_DAY - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_DAY);
			Time squareWeekTestResult = new Time(BigDecimal.valueOf(squareWeekValue).multiply(SQUARE_TIME_SCALES[SQUARE_DAY - 26]).divide(SQUARE_TIME_SCALES[SQUARE_WEEK - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_DAY);

			Time squareSecondResult = toSquareDay(squareSecondValue, SQUARE_SECOND);
			Time squareMinuteResult = toSquareDay(squareMinuteValue, SQUARE_MINUTE);
			Time squareHourResult = toSquareDay(squareHourValue, SQUARE_HOUR);
			Time squareDayResult = toSquareDay(squareDayValue, SQUARE_DAY);
			Time squareWeekResult = toSquareDay(squareWeekValue, SQUARE_WEEK);

			assertEquals(squareSecondTestResult, squareSecondResult);
			assertEquals(squareMinuteTestResult, squareMinuteResult);
			assertEquals(squareHourTestResult, squareHourResult);
			assertEquals(squareDayTestResult, squareDayResult);
			assertEquals(squareWeekTestResult, squareWeekResult);
		} catch (IllegalArgumentException e) {
			throw e;
		}
	}
	
	@Test
	public void toSquareWeekTest() throws IllegalArgumentException {
		double squareSecondValue = NumberRandomizer.getRandomDouble();
		double squareMinuteValue = NumberRandomizer.getRandomDouble();
		double squareHourValue = NumberRandomizer.getRandomDouble();
		double squareDayValue = NumberRandomizer.getRandomDouble();
		double squareWeekValue = NumberRandomizer.getRandomDouble();
		try {
			Time squareSecondTestResult = new Time(BigDecimal.valueOf(squareSecondValue).multiply(SQUARE_TIME_SCALES[SQUARE_WEEK - 26]).divide(SQUARE_TIME_SCALES[SQUARE_SECOND - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_WEEK);
			Time squareMinuteTestResult = new Time(BigDecimal.valueOf(squareMinuteValue).multiply(SQUARE_TIME_SCALES[SQUARE_WEEK - 26]).divide(SQUARE_TIME_SCALES[SQUARE_MINUTE - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_WEEK);
			Time squareHourTestResult = new Time(BigDecimal.valueOf(squareHourValue).multiply(SQUARE_TIME_SCALES[SQUARE_WEEK - 26]).divide(SQUARE_TIME_SCALES[SQUARE_HOUR - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_WEEK);
			Time squareDayTestResult = new Time(BigDecimal.valueOf(squareDayValue).multiply(SQUARE_TIME_SCALES[SQUARE_WEEK - 26]).divide(SQUARE_TIME_SCALES[SQUARE_DAY - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_WEEK);
			Time squareWeekTestResult = new Time(BigDecimal.valueOf(squareWeekValue).multiply(SQUARE_TIME_SCALES[SQUARE_WEEK - 26]).divide(SQUARE_TIME_SCALES[SQUARE_WEEK - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_WEEK);

			Time squareSecondResult = toSquareWeek(squareSecondValue, SQUARE_SECOND);
			Time squareMinuteResult = toSquareWeek(squareMinuteValue, SQUARE_MINUTE);
			Time squareHourResult = toSquareWeek(squareHourValue, SQUARE_HOUR);
			Time squareDayResult = toSquareWeek(squareDayValue, SQUARE_DAY);
			Time squareWeekResult = toSquareWeek(squareWeekValue, SQUARE_WEEK);

			assertEquals(squareSecondTestResult, squareSecondResult);
			assertEquals(squareMinuteTestResult, squareMinuteResult);
			assertEquals(squareHourTestResult, squareHourResult);
			assertEquals(squareDayTestResult, squareDayResult);
			assertEquals(squareWeekTestResult, squareWeekResult);
		} catch (IllegalArgumentException e) {
			throw e;
		}
	}
	
	
	@Test
	public void toSquareSecondFixedResultTest() throws IllegalArgumentException {
		int squareSecondValue = 1;
		int squareMinuteValue = 1;
		int squareHourValue = 1;
		int squareDayValue = 1;
		int squareWeekValue = 1;
		try {
			Time squareSecondTestResult = new Time("1.00000000000000000000", SQUARE_SECOND);
			Time squareMinuteTestResult = new Time("3600.00000000000000000000", SQUARE_SECOND);
			Time squareHourTestResult = new Time("12960000.00000000000000000000", SQUARE_SECOND);
			Time squareDayTestResult = new Time("7464960000.00000000000000000000", SQUARE_SECOND);
			Time squareWeekTestResult = new Time("365783040000.00000000000000000000", SQUARE_SECOND);

			Time squareSecondResult = toSquareSecond(squareSecondValue, SQUARE_SECOND);
			Time squareMinuteResult = toSquareSecond(squareMinuteValue, SQUARE_MINUTE);
			Time squareHourResult = toSquareSecond(squareHourValue, SQUARE_HOUR);
			Time squareDayResult = toSquareSecond(squareDayValue, SQUARE_DAY);
			Time squareWeekResult = toSquareSecond(squareWeekValue, SQUARE_WEEK);

			assertEquals(squareSecondTestResult, squareSecondResult);
			assertEquals(squareMinuteTestResult, squareMinuteResult);
			assertEquals(squareHourTestResult, squareHourResult);
			assertEquals(squareDayTestResult, squareDayResult);
			assertEquals(squareWeekTestResult, squareWeekResult);
		} catch (IllegalArgumentException e) {
			throw e;
		}
	}
	
	@Test
	public void toSquareMinuteFixedResultTest() throws IllegalArgumentException {
		int squareSecondValue = 1;
		int squareMinuteValue = 1;
		int squareHourValue = 1;
		int squareDayValue = 1;
		int squareWeekValue = 1;
		try {
			Time squareSecondTestResult = new Time("0.00027777777777777778", SQUARE_MINUTE);
			Time squareMinuteTestResult = new Time("1.00000000000000000000", SQUARE_MINUTE);
			Time squareHourTestResult = new Time("3600.00000000000000000000", SQUARE_MINUTE);
			Time squareDayTestResult = new Time("2073600.00000000000000000000", SQUARE_MINUTE);
			Time squareWeekTestResult = new Time("101606400.00000000000000000000", SQUARE_MINUTE);

			Time squareSecondResult = toSquareMinute(squareSecondValue, SQUARE_SECOND);
			Time squareMinuteResult = toSquareMinute(squareMinuteValue, SQUARE_MINUTE);
			Time squareHourResult = toSquareMinute(squareHourValue, SQUARE_HOUR);
			Time squareDayResult = toSquareMinute(squareDayValue, SQUARE_DAY);
			Time squareWeekResult = toSquareMinute(squareWeekValue, SQUARE_WEEK);

			assertEquals(squareSecondTestResult, squareSecondResult);
			assertEquals(squareMinuteTestResult, squareMinuteResult);
			assertEquals(squareHourTestResult, squareHourResult);
			assertEquals(squareDayTestResult, squareDayResult);
			assertEquals(squareWeekTestResult, squareWeekResult);
		} catch (IllegalArgumentException e) {
			throw e;
		}
	}
	
	@Test
	public void toSquareHourFixedResultTest() throws IllegalArgumentException {
		int squareSecondValue = 1;
		int squareMinuteValue = 1;
		int squareHourValue = 1;
		int squareDayValue = 1;
		int squareWeekValue = 1;
		try {
			Time squareSecondTestResult = new Time("0.00000007716049382716", SQUARE_HOUR);
			Time squareMinuteTestResult = new Time("0.00027777777777777778", SQUARE_HOUR);
			Time squareHourTestResult = new Time("1.00000000000000000000", SQUARE_HOUR);
			Time squareDayTestResult = new Time("576.00000000000000000000", SQUARE_HOUR);
			Time squareWeekTestResult = new Time("28224.00000000000000000000", SQUARE_HOUR);

			Time squareSecondResult = toSquareHour(squareSecondValue, SQUARE_SECOND);
			Time squareMinuteResult = toSquareHour(squareMinuteValue, SQUARE_MINUTE);
			Time squareHourResult = toSquareHour(squareHourValue, SQUARE_HOUR);
			Time squareDayResult = toSquareHour(squareDayValue, SQUARE_DAY);
			Time squareWeekResult = toSquareHour(squareWeekValue, SQUARE_WEEK);

			assertEquals(squareSecondTestResult, squareSecondResult);
			assertEquals(squareMinuteTestResult, squareMinuteResult);
			assertEquals(squareHourTestResult, squareHourResult);
			assertEquals(squareDayTestResult, squareDayResult);
			assertEquals(squareWeekTestResult, squareWeekResult);
		} catch (IllegalArgumentException e) {
			throw e;
		}
	}
	
	@Test
	public void toSquareDayFixedResultTest() throws IllegalArgumentException {
		int squareSecondValue = 1;
		int squareMinuteValue = 1;
		int squareHourValue = 1;
		int squareDayValue = 1;
		int squareWeekValue = 1;
		try {
			Time squareSecondTestResult = new Time("0.00000000013395919067", SQUARE_DAY);
			Time squareMinuteTestResult = new Time("0.00000048225308641975", SQUARE_DAY);
			Time squareHourTestResult = new Time("0.00173611111111111111", SQUARE_DAY);
			Time squareDayTestResult = new Time("1.00000000000000000000", SQUARE_DAY);
			Time squareWeekTestResult = new Time("49.00000000000000000000", SQUARE_DAY);

			Time squareSecondResult = toSquareDay(squareSecondValue, SQUARE_SECOND);
			Time squareMinuteResult = toSquareDay(squareMinuteValue, SQUARE_MINUTE);
			Time squareHourResult = toSquareDay(squareHourValue, SQUARE_HOUR);
			Time squareDayResult = toSquareDay(squareDayValue, SQUARE_DAY);
			Time squareWeekResult = toSquareDay(squareWeekValue, SQUARE_WEEK);

			assertEquals(squareSecondTestResult, squareSecondResult);
			assertEquals(squareMinuteTestResult, squareMinuteResult);
			assertEquals(squareHourTestResult, squareHourResult);
			assertEquals(squareDayTestResult, squareDayResult);
			assertEquals(squareWeekTestResult, squareWeekResult);
		} catch (IllegalArgumentException e) {
			throw e;
		}
	}
	
	@Test
	public void toSquareWeekFixedResultTest() throws IllegalArgumentException {
		int squareSecondValue = 1;
		int squareMinuteValue = 1;
		int squareHourValue = 1;
		int squareDayValue = 1;
		int squareWeekValue = 1;
		try {
			Time squareSecondTestResult = new Time("0.00000000000273386103", SQUARE_WEEK);
			Time squareMinuteTestResult = new Time("0.00000000984189972285", SQUARE_WEEK);
			Time squareHourTestResult = new Time("0.00003543083900226757", SQUARE_WEEK);
			Time squareDayTestResult = new Time("0.02040816326530612245", SQUARE_WEEK);
			Time squareWeekTestResult = new Time("1.00000000000000000000", SQUARE_WEEK);

			Time squareSecondResult = toSquareWeek(squareSecondValue, SQUARE_SECOND);
			Time squareMinuteResult = toSquareWeek(squareMinuteValue, SQUARE_MINUTE);
			Time squareHourResult = toSquareWeek(squareHourValue, SQUARE_HOUR);
			Time squareDayResult = toSquareWeek(squareDayValue, SQUARE_DAY);
			Time squareWeekResult = toSquareWeek(squareWeekValue, SQUARE_WEEK);

			assertEquals(squareSecondTestResult, squareSecondResult);
			assertEquals(squareMinuteTestResult, squareMinuteResult);
			assertEquals(squareHourTestResult, squareHourResult);
			assertEquals(squareDayTestResult, squareDayResult);
			assertEquals(squareWeekTestResult, squareWeekResult);
		} catch (IllegalArgumentException e) {
			throw e;
		}
	}
}
