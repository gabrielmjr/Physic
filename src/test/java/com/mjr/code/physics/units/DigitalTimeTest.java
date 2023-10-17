package com.mjr.code.physics.units;

public class DigitalTimeTest {
	/*private static final String FORMAT = "hh:mm:ss";
	
	private Random random;
	
    public DigitalTimeTest() {
		random = new Random();
	}
	
	//@Test
	public void digitalRandomTest() throws IllegalArgumentException {
		int secondValue = getRandomInteger();
		int minuteValue = getRandomInteger();
		int hourValue = getRandomInteger();
		int dayValue = getRandomInteger();
		int weekValue = getRandomInteger();
		
		try {
			String secondTestResult = getConvertedFrom(secondValue, SECOND);
			String minuteTestResult = getConvertedFrom(secondValue, MINUTE);
			String hourTestResult = getConvertedFrom(secondValue, HOUR);
			String dayTestResult = getConvertedFrom(secondValue, DAY);
			String weekTestResult = getConvertedFrom(secondValue, WEEK);
			
			String secondResult = new Time(secondValue, SECOND).toDigital().getToFormat(FORMAT);
			String minuteResult = new Time(minuteValue, MINUTE).toDigital().getToFormat(FORMAT);
			String hourResult = new Time(hourValue, HOUR).toDigital().getToFormat(FORMAT);
			String dayResult = new Time(dayValue, DAY).toDigital().getToFormat(FORMAT);
			String weekResult = new Time(weekValue, WEEK).toDigital().getToFormat(FORMAT);
			
			assertEquals(secondTestResult, secondResult);
			assertEquals(minuteTestResult, minuteResult);
			assertEquals(hourTestResult, hourResult);
			assertEquals(dayTestResult, dayResult);
			assertEquals(weekTestResult, weekResult);
		} catch (IllegalArgumentException e) {
			throw e;
		}
	}
	
	private String getConvertedFrom(int value, int unit) throws IllegalArgumentException {
		BigInteger second;
		BigInteger minute = BigInteger.ZERO;
		BigInteger hour = BigInteger.ZERO;
		String secondString;
		String minuteString;
		String hourString;
		
		try {
		    second = toSecond(value, unit).getValue().toBigInteger();
			while (second.max(SIXTY) == SIXTY) {
				minute.add(BigInteger.ONE);
				second.subtract(SIXTY);
			}
			while (minute.max(SIXTY) == SIXTY) {
				hour.add(BigInteger.ONE);
				minute.subtract(SIXTY);
			}
			if (second.max(BigInteger.TEN) != BigInteger.TEN) {
				secondString = "0" + second;
			} else {
				secondString = second.toString();
			}
			if (minute.max(BigInteger.TEN) != BigInteger.TEN) {
				minuteString = "0" + minute;
			} else {
				minuteString = minute.toString();
			}
			if (hour.max(BigInteger.TEN) != BigInteger.TEN) {
				hourString = "0" + hour.toString();
			} else {
				hourString = hour.toString();
			}
			return FORMAT.replaceFirst("hh", hourString).replaceFirst("mm", minuteString).replaceFirst("ss", secondString);
		} catch (IllegalArgumentException e) {
			throw e;
		}
	}
	
	private int getRandomInteger() {
		int randomInteger = Double.valueOf(random.nextDouble() * 1000).intValue();
		return (randomInteger < 0) ? - randomInteger : randomInteger;
	}*/
}
