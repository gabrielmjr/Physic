package com.mjr.code.physic.units;

import com.mjr.code.physic.PhysicException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import org.junit.jupiter.api.Test;

import static com.mjr.code.physic.Physic.ROUND_SCALE;
import static com.mjr.code.physic.units.Time.toSquareSecond;
import static com.mjr.code.physic.units.Time.toSquareMinute;
import static com.mjr.code.physic.units.Time.toSquareHour;
import static com.mjr.code.physic.units.Time.toSquareDay;
import static com.mjr.code.physic.units.Time.toSquareWeek;
import static com.mjr.code.physic.units.Time.SQUARE_TIME_SCALES;
import static com.mjr.code.physic.units.Time.SQUARE_SECOND;
import static com.mjr.code.physic.units.Time.SQUARE_MINUTE;
import static com.mjr.code.physic.units.Time.SQUARE_HOUR;
import static com.mjr.code.physic.units.Time.SQUARE_DAY;
import static com.mjr.code.physic.units.Time.SQUARE_WEEK;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTimeTest {
	private Random random;
	
	public SquareTimeTest() {
		random = new Random();
	}
	
	@Test
	public void toSquareSecondTest() throws PhysicException {
		double squareSecondValue = getRandomDouble();
		double squareMinuteValue = getRandomDouble();
		double squareHourValue = getRandomDouble();
		double squareDayValue = getRandomDouble();
		double squareWeekValue = getRandomDouble();
		try {
			Time squareSecondTestResult = new Time(BigDecimal.valueOf(squareSecondValue).multiply(SQUARE_TIME_SCALES[SQUARE_SECOND - 26]).divide(SQUARE_TIME_SCALES[SQUARE_SECOND - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_SECOND);
			Time squareMinuteTestResult = new Time(BigDecimal.valueOf(squareMinuteValue).multiply(SQUARE_TIME_SCALES[SQUARE_SECOND - 26]).divide(SQUARE_TIME_SCALES[SQUARE_MINUTE - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_MINUTE);
			Time squareHourTestResult = new Time(BigDecimal.valueOf(squareHourValue).multiply(SQUARE_TIME_SCALES[SQUARE_SECOND - 26]).divide(SQUARE_TIME_SCALES[SQUARE_HOUR - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_HOUR);
			Time squareDayTestResult = new Time(BigDecimal.valueOf(squareDayValue).multiply(SQUARE_TIME_SCALES[SQUARE_SECOND - 26]).divide(SQUARE_TIME_SCALES[SQUARE_DAY - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_DAY);
			Time squareWeekTestResult = new Time(BigDecimal.valueOf(squareWeekValue).multiply(SQUARE_TIME_SCALES[SQUARE_SECOND - 26]).divide(SQUARE_TIME_SCALES[SQUARE_WEEK - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_WEEK);
			
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
		} catch (PhysicException e) {
			throw e;
		}
	}
	
	@Test
	public void toSquareMinuteTest() throws PhysicException {
		double squareSecondValue = getRandomDouble();
		double squareMinuteValue = getRandomDouble();
		double squareHourValue = getRandomDouble();
		double squareDayValue = getRandomDouble();
		double squareWeekValue = getRandomDouble();
		try {
			Time squareSecondTestResult = new Time(BigDecimal.valueOf(squareSecondValue).multiply(SQUARE_TIME_SCALES[SQUARE_MINUTE - 26]).divide(SQUARE_TIME_SCALES[SQUARE_SECOND - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_SECOND);
			Time squareMinuteTestResult = new Time(BigDecimal.valueOf(squareMinuteValue).multiply(SQUARE_TIME_SCALES[SQUARE_MINUTE - 26]).divide(SQUARE_TIME_SCALES[SQUARE_MINUTE - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_MINUTE);
			Time squareHourTestResult = new Time(BigDecimal.valueOf(squareHourValue).multiply(SQUARE_TIME_SCALES[SQUARE_MINUTE - 26]).divide(SQUARE_TIME_SCALES[SQUARE_HOUR - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_HOUR);
			Time squareDayTestResult = new Time(BigDecimal.valueOf(squareDayValue).multiply(SQUARE_TIME_SCALES[SQUARE_MINUTE - 26]).divide(SQUARE_TIME_SCALES[SQUARE_DAY - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_DAY);
			Time squareWeekTestResult = new Time(BigDecimal.valueOf(squareWeekValue).multiply(SQUARE_TIME_SCALES[SQUARE_MINUTE - 26]).divide(SQUARE_TIME_SCALES[SQUARE_WEEK - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_WEEK);

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
		} catch (PhysicException e) {
			throw e;
		}
	}
	
	@Test
	public void toSquareHourTest() throws PhysicException {
		double squareSecondValue = getRandomDouble();
		double squareMinuteValue = getRandomDouble();
		double squareHourValue = getRandomDouble();
		double squareDayValue = getRandomDouble();
		double squareWeekValue = getRandomDouble();
		try {
			Time squareSecondTestResult = new Time(BigDecimal.valueOf(squareSecondValue).multiply(SQUARE_TIME_SCALES[SQUARE_HOUR - 26]).divide(SQUARE_TIME_SCALES[SQUARE_SECOND - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_SECOND);
			Time squareMinuteTestResult = new Time(BigDecimal.valueOf(squareMinuteValue).multiply(SQUARE_TIME_SCALES[SQUARE_HOUR - 26]).divide(SQUARE_TIME_SCALES[SQUARE_MINUTE - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_MINUTE);
			Time squareHourTestResult = new Time(BigDecimal.valueOf(squareHourValue).multiply(SQUARE_TIME_SCALES[SQUARE_HOUR - 26]).divide(SQUARE_TIME_SCALES[SQUARE_HOUR - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_HOUR);
			Time squareDayTestResult = new Time(BigDecimal.valueOf(squareDayValue).multiply(SQUARE_TIME_SCALES[SQUARE_HOUR - 26]).divide(SQUARE_TIME_SCALES[SQUARE_DAY - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_DAY);
			Time squareWeekTestResult = new Time(BigDecimal.valueOf(squareWeekValue).multiply(SQUARE_TIME_SCALES[SQUARE_HOUR - 26]).divide(SQUARE_TIME_SCALES[SQUARE_WEEK - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_WEEK);

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
		} catch (PhysicException e) {
			throw e;
		}
	}
	
	@Test
	public void toSquareDayTest() throws PhysicException {
		double squareSecondValue = getRandomDouble();
		double squareMinuteValue = getRandomDouble();
		double squareHourValue = getRandomDouble();
		double squareDayValue = getRandomDouble();
		double squareWeekValue = getRandomDouble();
		try {
			Time squareSecondTestResult = new Time(BigDecimal.valueOf(squareSecondValue).multiply(SQUARE_TIME_SCALES[SQUARE_DAY - 26]).divide(SQUARE_TIME_SCALES[SQUARE_SECOND - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_SECOND);
			Time squareMinuteTestResult = new Time(BigDecimal.valueOf(squareMinuteValue).multiply(SQUARE_TIME_SCALES[SQUARE_DAY - 26]).divide(SQUARE_TIME_SCALES[SQUARE_MINUTE - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_MINUTE);
			Time squareHourTestResult = new Time(BigDecimal.valueOf(squareHourValue).multiply(SQUARE_TIME_SCALES[SQUARE_DAY - 26]).divide(SQUARE_TIME_SCALES[SQUARE_HOUR - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_HOUR);
			Time squareDayTestResult = new Time(BigDecimal.valueOf(squareDayValue).multiply(SQUARE_TIME_SCALES[SQUARE_DAY - 26]).divide(SQUARE_TIME_SCALES[SQUARE_DAY - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_DAY);
			Time squareWeekTestResult = new Time(BigDecimal.valueOf(squareWeekValue).multiply(SQUARE_TIME_SCALES[SQUARE_DAY - 26]).divide(SQUARE_TIME_SCALES[SQUARE_WEEK - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_WEEK);

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
		} catch (PhysicException e) {
			throw e;
		}
	}
	
	@Test
	public void toSquareWeekTest() throws PhysicException {
		double squareSecondValue = getRandomDouble();
		double squareMinuteValue = getRandomDouble();
		double squareHourValue = getRandomDouble();
		double squareDayValue = getRandomDouble();
		double squareWeekValue = getRandomDouble();
		try {
			Time squareSecondTestResult = new Time(BigDecimal.valueOf(squareSecondValue).multiply(SQUARE_TIME_SCALES[SQUARE_WEEK - 26]).divide(SQUARE_TIME_SCALES[SQUARE_SECOND - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_SECOND);
			Time squareMinuteTestResult = new Time(BigDecimal.valueOf(squareMinuteValue).multiply(SQUARE_TIME_SCALES[SQUARE_WEEK - 26]).divide(SQUARE_TIME_SCALES[SQUARE_MINUTE - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_MINUTE);
			Time squareHourTestResult = new Time(BigDecimal.valueOf(squareHourValue).multiply(SQUARE_TIME_SCALES[SQUARE_WEEK - 26]).divide(SQUARE_TIME_SCALES[SQUARE_HOUR - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_HOUR);
			Time squareDayTestResult = new Time(BigDecimal.valueOf(squareDayValue).multiply(SQUARE_TIME_SCALES[SQUARE_WEEK - 26]).divide(SQUARE_TIME_SCALES[SQUARE_DAY - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARE_DAY);
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
		} catch (PhysicException e) {
			throw e;
		}
	}
	
	
	@Test
	public void toSquareSecondFixedResultTest() throws PhysicException {
		int squareSecondValue = 1;
		int squareMinuteValue = 1;
		int squareHourValue = 1;
		int squareDayValue = 1;
		int squareWeekValue = 1;
		try {
			Time squareSecondTestResult = new Time("1.00000000000000000000", SQUARE_SECOND);
			Time squareMinuteTestResult = new Time("3600.00000000000000000000", SQUARE_MINUTE);
			Time squareHourTestResult = new Time("12960000.00000000000000000000", SQUARE_HOUR);
			Time squareDayTestResult = new Time("7464960000.00000000000000000000", SQUARE_DAY);
			Time squareWeekTestResult = new Time("365783040000.00000000000000000000", SQUARE_WEEK);

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
		} catch (PhysicException e) {
			throw e;
		}
	}
	
	private double getRandomDouble() {
		return random.nextDouble();
	}
}
