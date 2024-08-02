package com.mjrfusion.code.physics.units;

import com.mjrfusion.code.physics.NumberRandomizer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static com.mjrfusion.code.physics.Physic.ROUND_SCALE;
import static com.mjrfusion.code.physics.units.SquaredTime.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquaredTimeTest {

    private double squaredSecondValue;
    private double squaredMinuteValue;
    private double squaredHourValue;
    private double squaredDayValue;
    private double squaredWeekValue;

    private SquaredTime squaredSecondTestResult;
    private SquaredTime squaredMinuteTestResult;
    private SquaredTime squaredHourTestResult;
    private SquaredTime squaredDayTestResult;
    private SquaredTime squaredWeekTestResult;

    private SquaredTime squaredSecondResult;
    private SquaredTime squaredMinuteResult;
    private SquaredTime squaredHourResult;
    private SquaredTime squaredDayResult;
    private SquaredTime squaredWeekResult;

    @BeforeEach
    void setUp() {
        squaredSecondValue = NumberRandomizer.getRandomDouble();
        squaredMinuteValue = NumberRandomizer.getRandomDouble();
        squaredHourValue = NumberRandomizer.getRandomDouble();
        squaredDayValue = NumberRandomizer.getRandomDouble();
        squaredWeekValue = NumberRandomizer.getRandomDouble();
    }

	@Test
	public void toSquaredSecondTest() throws IllegalArgumentException {
       squaredSecondTestResult = new SquaredTime(BigDecimal.valueOf(squaredSecondValue).multiply(SQUARED_TIME_SCALES[SQUARED_SECOND - 26]).divide(SQUARED_TIME_SCALES[SQUARED_SECOND - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_SECOND);
       squaredMinuteTestResult = new SquaredTime(BigDecimal.valueOf(squaredMinuteValue).multiply(SQUARED_TIME_SCALES[SQUARED_SECOND - 26]).divide(SQUARED_TIME_SCALES[SQUARED_MINUTE - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_SECOND);
       squaredHourTestResult = new SquaredTime(BigDecimal.valueOf(squaredHourValue).multiply(SQUARED_TIME_SCALES[SQUARED_SECOND - 26]).divide(SQUARED_TIME_SCALES[SQUARED_HOUR - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_SECOND);
       squaredDayTestResult = new SquaredTime(BigDecimal.valueOf(squaredDayValue).multiply(SQUARED_TIME_SCALES[SQUARED_SECOND - 26]).divide(SQUARED_TIME_SCALES[SQUARED_DAY - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_SECOND);
       squaredWeekTestResult = new SquaredTime(BigDecimal.valueOf(squaredWeekValue).multiply(SQUARED_TIME_SCALES[SQUARED_SECOND - 26]).divide(SQUARED_TIME_SCALES[SQUARED_WEEK - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_SECOND);

       squaredSecondResult = toSquaredSecond(squaredSecondValue, SQUARED_SECOND);
       squaredMinuteResult = toSquaredSecond(squaredMinuteValue, SQUARED_MINUTE);
       squaredHourResult = toSquaredSecond(squaredHourValue, SQUARED_HOUR);
       squaredDayResult = toSquaredSecond(squaredDayValue, SQUARED_DAY);
       squaredWeekResult = toSquaredSecond(squaredWeekValue, SQUARED_WEEK);

        assertEquals(squaredSecondTestResult, squaredSecondResult);
        assertEquals(squaredMinuteTestResult, squaredMinuteResult);
        assertEquals(squaredHourTestResult, squaredHourResult);
        assertEquals(squaredDayTestResult, squaredDayResult);
        assertEquals(squaredWeekTestResult, squaredWeekResult);
    }
	
	@Test
	public void toSquaredMinuteTest() throws IllegalArgumentException {
        squaredSecondTestResult = new SquaredTime(BigDecimal.valueOf(squaredSecondValue).multiply(SQUARED_TIME_SCALES[SQUARED_MINUTE - 26]).divide(SQUARED_TIME_SCALES[SQUARED_SECOND - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_MINUTE);
        squaredMinuteTestResult = new SquaredTime(BigDecimal.valueOf(squaredMinuteValue).multiply(SQUARED_TIME_SCALES[SQUARED_MINUTE - 26]).divide(SQUARED_TIME_SCALES[SQUARED_MINUTE - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_MINUTE);
        squaredHourTestResult = new SquaredTime(BigDecimal.valueOf(squaredHourValue).multiply(SQUARED_TIME_SCALES[SQUARED_MINUTE - 26]).divide(SQUARED_TIME_SCALES[SQUARED_HOUR - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_MINUTE);
        squaredDayTestResult = new SquaredTime(BigDecimal.valueOf(squaredDayValue).multiply(SQUARED_TIME_SCALES[SQUARED_MINUTE - 26]).divide(SQUARED_TIME_SCALES[SQUARED_DAY - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_MINUTE);
        squaredWeekTestResult = new SquaredTime(BigDecimal.valueOf(squaredWeekValue).multiply(SQUARED_TIME_SCALES[SQUARED_MINUTE - 26]).divide(SQUARED_TIME_SCALES[SQUARED_WEEK - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_MINUTE);

        squaredSecondResult = toSquaredMinute(squaredSecondValue, SQUARED_SECOND);
        squaredMinuteResult = toSquaredMinute(squaredMinuteValue, SQUARED_MINUTE);
        squaredHourResult = toSquaredMinute(squaredHourValue, SQUARED_HOUR);
        squaredDayResult = toSquaredMinute(squaredDayValue, SQUARED_DAY);
        squaredWeekResult = toSquaredMinute(squaredWeekValue, SQUARED_WEEK);

        assertEquals(squaredSecondTestResult, squaredSecondResult);
        assertEquals(squaredMinuteTestResult, squaredMinuteResult);
        assertEquals(squaredHourTestResult, squaredHourResult);
        assertEquals(squaredDayTestResult, squaredDayResult);
        assertEquals(squaredWeekTestResult, squaredWeekResult);
    }
	
	@Test
	public void toSquaredHourTest() throws IllegalArgumentException {
        squaredSecondTestResult = new SquaredTime(BigDecimal.valueOf(squaredSecondValue).multiply(SQUARED_TIME_SCALES[SQUARED_HOUR - 26]).divide(SQUARED_TIME_SCALES[SQUARED_SECOND - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_HOUR);
        squaredMinuteTestResult = new SquaredTime(BigDecimal.valueOf(squaredMinuteValue).multiply(SQUARED_TIME_SCALES[SQUARED_HOUR - 26]).divide(SQUARED_TIME_SCALES[SQUARED_MINUTE - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_HOUR);
        squaredHourTestResult = new SquaredTime(BigDecimal.valueOf(squaredHourValue).multiply(SQUARED_TIME_SCALES[SQUARED_HOUR - 26]).divide(SQUARED_TIME_SCALES[SQUARED_HOUR - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_HOUR);
        squaredDayTestResult = new SquaredTime(BigDecimal.valueOf(squaredDayValue).multiply(SQUARED_TIME_SCALES[SQUARED_HOUR - 26]).divide(SQUARED_TIME_SCALES[SQUARED_DAY - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_HOUR);
        squaredWeekTestResult = new SquaredTime(BigDecimal.valueOf(squaredWeekValue).multiply(SQUARED_TIME_SCALES[SQUARED_HOUR - 26]).divide(SQUARED_TIME_SCALES[SQUARED_WEEK - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_HOUR);

        squaredSecondResult = toSquaredHour(squaredSecondValue, SQUARED_SECOND);
        squaredMinuteResult = toSquaredHour(squaredMinuteValue, SQUARED_MINUTE);
        squaredHourResult = toSquaredHour(squaredHourValue, SQUARED_HOUR);
        squaredDayResult = toSquaredHour(squaredDayValue, SQUARED_DAY);
        squaredWeekResult = toSquaredHour(squaredWeekValue, SQUARED_WEEK);

        assertEquals(squaredSecondTestResult, squaredSecondResult);
        assertEquals(squaredMinuteTestResult, squaredMinuteResult);
        assertEquals(squaredHourTestResult, squaredHourResult);
        assertEquals(squaredDayTestResult, squaredDayResult);
        assertEquals(squaredWeekTestResult, squaredWeekResult);
    }
	
	@Test
	public void toSquaredDayTest() throws IllegalArgumentException {squaredSecondTestResult = new SquaredTime(BigDecimal.valueOf(squaredSecondValue).multiply(SQUARED_TIME_SCALES[SQUARED_DAY - 26]).divide(SQUARED_TIME_SCALES[SQUARED_SECOND - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_DAY);
        squaredMinuteTestResult = new SquaredTime(BigDecimal.valueOf(squaredMinuteValue).multiply(SQUARED_TIME_SCALES[SQUARED_DAY - 26]).divide(SQUARED_TIME_SCALES[SQUARED_MINUTE - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_DAY);
        squaredHourTestResult = new SquaredTime(BigDecimal.valueOf(squaredHourValue).multiply(SQUARED_TIME_SCALES[SQUARED_DAY - 26]).divide(SQUARED_TIME_SCALES[SQUARED_HOUR - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_DAY);
        squaredDayTestResult = new SquaredTime(BigDecimal.valueOf(squaredDayValue).multiply(SQUARED_TIME_SCALES[SQUARED_DAY - 26]).divide(SQUARED_TIME_SCALES[SQUARED_DAY - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_DAY);
        squaredWeekTestResult = new SquaredTime(BigDecimal.valueOf(squaredWeekValue).multiply(SQUARED_TIME_SCALES[SQUARED_DAY - 26]).divide(SQUARED_TIME_SCALES[SQUARED_WEEK - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_DAY);

        squaredSecondResult = toSquaredDay(squaredSecondValue, SQUARED_SECOND);
        squaredMinuteResult = toSquaredDay(squaredMinuteValue, SQUARED_MINUTE);
        squaredHourResult = toSquaredDay(squaredHourValue, SQUARED_HOUR);
        squaredDayResult = toSquaredDay(squaredDayValue, SQUARED_DAY);
        squaredWeekResult = toSquaredDay(squaredWeekValue, SQUARED_WEEK);

        assertEquals(squaredSecondTestResult, squaredSecondResult);
        assertEquals(squaredMinuteTestResult, squaredMinuteResult);
        assertEquals(squaredHourTestResult, squaredHourResult);
        assertEquals(squaredDayTestResult, squaredDayResult);
        assertEquals(squaredWeekTestResult, squaredWeekResult);
    }
	
	@Test
	public void toSquaredWeekTest() throws IllegalArgumentException {
        squaredSecondTestResult = new SquaredTime(BigDecimal.valueOf(squaredSecondValue).multiply(SQUARED_TIME_SCALES[SQUARED_WEEK - 26]).divide(SQUARED_TIME_SCALES[SQUARED_SECOND - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_WEEK);
        squaredMinuteTestResult = new SquaredTime(BigDecimal.valueOf(squaredMinuteValue).multiply(SQUARED_TIME_SCALES[SQUARED_WEEK - 26]).divide(SQUARED_TIME_SCALES[SQUARED_MINUTE - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_WEEK);
        squaredHourTestResult = new SquaredTime(BigDecimal.valueOf(squaredHourValue).multiply(SQUARED_TIME_SCALES[SQUARED_WEEK - 26]).divide(SQUARED_TIME_SCALES[SQUARED_HOUR - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_WEEK);
        squaredDayTestResult = new SquaredTime(BigDecimal.valueOf(squaredDayValue).multiply(SQUARED_TIME_SCALES[SQUARED_WEEK - 26]).divide(SQUARED_TIME_SCALES[SQUARED_DAY - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_WEEK);
        squaredWeekTestResult = new SquaredTime(BigDecimal.valueOf(squaredWeekValue).multiply(SQUARED_TIME_SCALES[SQUARED_WEEK - 26]).divide(SQUARED_TIME_SCALES[SQUARED_WEEK - 26], ROUND_SCALE, RoundingMode.HALF_UP), SQUARED_WEEK);

        squaredSecondResult = toSquaredWeek(squaredSecondValue, SQUARED_SECOND);
        squaredMinuteResult = toSquaredWeek(squaredMinuteValue, SQUARED_MINUTE);
        squaredHourResult = toSquaredWeek(squaredHourValue, SQUARED_HOUR);
        squaredDayResult = toSquaredWeek(squaredDayValue, SQUARED_DAY);
        squaredWeekResult = toSquaredWeek(squaredWeekValue, SQUARED_WEEK);

        assertEquals(squaredSecondTestResult, squaredSecondResult);
        assertEquals(squaredMinuteTestResult, squaredMinuteResult);
        assertEquals(squaredHourTestResult, squaredHourResult);
        assertEquals(squaredDayTestResult, squaredDayResult);
        assertEquals(squaredWeekTestResult, squaredWeekResult);
    }
	
	
	@Test
	public void toSquaredSecondFixedResultTest() throws IllegalArgumentException {
		squaredSecondValue = 1;
		squaredMinuteValue = 1;
		squaredHourValue = 1;
		squaredDayValue = 1;
		squaredWeekValue = 1;

        squaredSecondTestResult = new SquaredTime("1.00000000000000000000", SQUARED_SECOND);
        squaredMinuteTestResult = new SquaredTime("3600.00000000000000000000", SQUARED_SECOND);
        squaredHourTestResult = new SquaredTime("12960000.00000000000000000000", SQUARED_SECOND);
        squaredDayTestResult = new SquaredTime("7464960000.00000000000000000000", SQUARED_SECOND);
        squaredWeekTestResult = new SquaredTime("365783040000.00000000000000000000", SQUARED_SECOND);

        squaredSecondResult = toSquaredSecond(squaredSecondValue, SQUARED_SECOND);
        squaredMinuteResult = toSquaredSecond(squaredMinuteValue, SQUARED_MINUTE);
        squaredHourResult = toSquaredSecond(squaredHourValue, SQUARED_HOUR);
        squaredDayResult = toSquaredSecond(squaredDayValue, SQUARED_DAY);
        squaredWeekResult = toSquaredSecond(squaredWeekValue, SQUARED_WEEK);

        assertEquals(squaredSecondTestResult, squaredSecondResult);
        assertEquals(squaredMinuteTestResult, squaredMinuteResult);
        assertEquals(squaredHourTestResult, squaredHourResult);
        assertEquals(squaredDayTestResult, squaredDayResult);
        assertEquals(squaredWeekTestResult, squaredWeekResult);
    }
	
	@Test
	public void toSquaredMinuteFixedResultTest() throws IllegalArgumentException {
		squaredSecondValue = 1;
		squaredMinuteValue = 1;
		squaredHourValue = 1;
		squaredDayValue = 1;
		squaredWeekValue = 1;

        squaredSecondTestResult = new SquaredTime("0.00027777777777777778", SQUARED_MINUTE);
        squaredMinuteTestResult = new SquaredTime("1.00000000000000000000", SQUARED_MINUTE);
        squaredHourTestResult = new SquaredTime("3600.00000000000000000000", SQUARED_MINUTE);
        squaredDayTestResult = new SquaredTime("2073600.00000000000000000000", SQUARED_MINUTE);
        squaredWeekTestResult = new SquaredTime("101606400.00000000000000000000", SQUARED_MINUTE);

        squaredSecondResult = toSquaredMinute(squaredSecondValue, SQUARED_SECOND);
        squaredMinuteResult = toSquaredMinute(squaredMinuteValue, SQUARED_MINUTE);
        squaredHourResult = toSquaredMinute(squaredHourValue, SQUARED_HOUR);
        squaredDayResult = toSquaredMinute(squaredDayValue, SQUARED_DAY);
        squaredWeekResult = toSquaredMinute(squaredWeekValue, SQUARED_WEEK);

        assertEquals(squaredSecondTestResult, squaredSecondResult);
        assertEquals(squaredMinuteTestResult, squaredMinuteResult);
        assertEquals(squaredHourTestResult, squaredHourResult);
        assertEquals(squaredDayTestResult, squaredDayResult);
        assertEquals(squaredWeekTestResult, squaredWeekResult);
    }
	
	@Test
	public void toSquaredHourFixedResultTest() throws IllegalArgumentException {
		squaredSecondValue = 1;
		squaredMinuteValue = 1;
		squaredHourValue = 1;
		squaredDayValue = 1;
		squaredWeekValue = 1;

        squaredSecondTestResult = new SquaredTime("0.00000007716049382716", SQUARED_HOUR);
        squaredMinuteTestResult = new SquaredTime("0.00027777777777777778", SQUARED_HOUR);
        squaredHourTestResult = new SquaredTime("1.00000000000000000000", SQUARED_HOUR);
        squaredDayTestResult = new SquaredTime("576.00000000000000000000", SQUARED_HOUR);
        squaredWeekTestResult = new SquaredTime("28224.00000000000000000000", SQUARED_HOUR);

        squaredSecondResult = toSquaredHour(squaredSecondValue, SQUARED_SECOND);
        squaredMinuteResult = toSquaredHour(squaredMinuteValue, SQUARED_MINUTE);
        squaredHourResult = toSquaredHour(squaredHourValue, SQUARED_HOUR);
        squaredDayResult = toSquaredHour(squaredDayValue, SQUARED_DAY);
        squaredWeekResult = toSquaredHour(squaredWeekValue, SQUARED_WEEK);

        assertEquals(squaredSecondTestResult, squaredSecondResult);
        assertEquals(squaredMinuteTestResult, squaredMinuteResult);
        assertEquals(squaredHourTestResult, squaredHourResult);
        assertEquals(squaredDayTestResult, squaredDayResult);
        assertEquals(squaredWeekTestResult, squaredWeekResult);
    }
	
	@Test
	public void toSquaredDayFixedResultTest() throws IllegalArgumentException {
		squaredSecondValue = 1;
		squaredMinuteValue = 1;
		squaredHourValue = 1;
		squaredDayValue = 1;
		squaredWeekValue = 1;

        squaredSecondTestResult = new SquaredTime("0.00000000013395919067", SQUARED_DAY);
        squaredMinuteTestResult = new SquaredTime("0.00000048225308641975", SQUARED_DAY);
        squaredHourTestResult = new SquaredTime("0.00173611111111111111", SQUARED_DAY);
        squaredDayTestResult = new SquaredTime("1.00000000000000000000", SQUARED_DAY);
        squaredWeekTestResult = new SquaredTime("49.00000000000000000000", SQUARED_DAY);

        squaredSecondResult = toSquaredDay(squaredSecondValue, SQUARED_SECOND);
        squaredMinuteResult = toSquaredDay(squaredMinuteValue, SQUARED_MINUTE);
        squaredHourResult = toSquaredDay(squaredHourValue, SQUARED_HOUR);
        squaredDayResult = toSquaredDay(squaredDayValue, SQUARED_DAY);
        squaredWeekResult = toSquaredDay(squaredWeekValue, SQUARED_WEEK);

        assertEquals(squaredSecondTestResult, squaredSecondResult);
        assertEquals(squaredMinuteTestResult, squaredMinuteResult);
        assertEquals(squaredHourTestResult, squaredHourResult);
        assertEquals(squaredDayTestResult, squaredDayResult);
        assertEquals(squaredWeekTestResult, squaredWeekResult);
    }
	
	@Test
	public void toSquaredWeekFixedResultTest() throws IllegalArgumentException {
		squaredSecondValue = 1;
		squaredMinuteValue = 1;
		squaredHourValue = 1;
		squaredDayValue = 1;
		squaredWeekValue = 1;

        squaredSecondTestResult = new SquaredTime("0.00000000000273386103", SQUARED_WEEK);
        squaredMinuteTestResult = new SquaredTime("0.00000000984189972285", SQUARED_WEEK);
        squaredHourTestResult = new SquaredTime("0.00003543083900226757", SQUARED_WEEK);
        squaredDayTestResult = new SquaredTime("0.02040816326530612245", SQUARED_WEEK);
        squaredWeekTestResult = new SquaredTime("1.00000000000000000000", SQUARED_WEEK);

        squaredSecondResult = toSquaredWeek(squaredSecondValue, SQUARED_SECOND);
        squaredMinuteResult = toSquaredWeek(squaredMinuteValue, SQUARED_MINUTE);
        squaredHourResult = toSquaredWeek(squaredHourValue, SQUARED_HOUR);
        squaredDayResult = toSquaredWeek(squaredDayValue, SQUARED_DAY);
        squaredWeekResult = toSquaredWeek(squaredWeekValue, SQUARED_WEEK);

        assertEquals(squaredSecondTestResult, squaredSecondResult);
        assertEquals(squaredMinuteTestResult, squaredMinuteResult);
        assertEquals(squaredHourTestResult, squaredHourResult);
        assertEquals(squaredDayTestResult, squaredDayResult);
        assertEquals(squaredWeekTestResult, squaredWeekResult);
    }
}
