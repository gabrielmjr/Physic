package com.gabrielMJr.twaire.physic.units;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthTest
{
	// Distance object
	private Length length;

	// Constructir
	public LengthTest()
	{
		// initialize the variable
		length = Length.getInstance();
	}

	// Test conversor from another units to  kilometer
	@Test 
	public void toKilometerTest()
	{
		// Values to be tested 
		double kilometerValue = 374.0;
		double hectometerValue = 826.0;
		double decameterValue = 628.0;
		double meterValue = 726.0;
		double decimeterValue = 688.0;
		double centimeterValue = 786.0;
		double millimeterValue = 518.0;

		// Results
		double kilometerResult = 374.0;
		double hectometerResult = 82.60000000000001;
		double decameterResult = 6.279999999999999;
		double meterResult = 0.726;
		double decimeterResult = 0.0688;
		double centimeterResult = 0.00786;
		double millimeterResult = 0.000518;

		// Testing
		assertEquals(kilometerResult, length.toKilometer(kilometerValue, Length.KILOMETER));

		assertEquals(hectometerResult, length.toKilometer(hectometerValue, Length.HECTOMETER));

		assertEquals(decameterResult, length.toKilometer(decameterValue, Length.DECAMETER));

		assertEquals(meterResult, length.toKilometer(meterValue, Length.METER));

		assertEquals(decimeterResult, length.toKilometer(decimeterValue, Length.DECIMETER));

		assertEquals(centimeterResult, length.toKilometer(centimeterValue, Length.CENTIMETER));

		assertEquals(millimeterResult, length.toKilometer(millimeterValue, Length.MILLIMETER));
	}


	// Test converter from another units to  hectometer
	@Test 
	public void toHectometerTest()
	{
		// Values to be tested 
		double kilometerValue = 374.0;
		double hectometerValue = 826.0;
		double decameterValue = 628.0;
		double meterValue = 726.0;
		double decimeterValue = 688.0;
		double centimeterValue = 786.0;
		double millimeterValue = 518.0;

		// Results
		double kilometerResult = 3740.0;
		double hectometerResult = 826.0;
		double decameterResult = 62.8;
		double meterResult = 7.26;
		double decimeterResult = 0.688;
		double centimeterResult = 0.0786;
		double millimeterResult = 0.00518;

		assertEquals(kilometerResult, length.toHectometer(kilometerValue, Length.KILOMETER));

		assertEquals(hectometerResult, length.toHectometer(hectometerValue, Length.HECTOMETER));

		assertEquals(decameterResult, length.toHectometer(decameterValue, Length.DECAMETER));

		assertEquals(meterResult, length.toHectometer(meterValue, Length.METER));

		assertEquals(decimeterResult, length.toHectometer(decimeterValue, Length.DECIMETER));

		assertEquals(centimeterResult, length.toHectometer(centimeterValue, Length.CENTIMETER));

		assertEquals(millimeterResult, length.toHectometer(millimeterValue, Length.MILLIMETER));
	}


	// Test converter from another units to  decameter
	@Test 
	public void toDecameterTest()
	{
		// Values to be tested 
		double kilometerValue = 374.0;
		double hectometerValue = 826.0;
		double decameterValue = 628.0;
		double meterValue = 726.0;
		double decimeterValue = 688.0;
		double centimeterValue = 786.0;
		double millimeterValue = 518.0;

		// Results
		double kilometerResult = 37400.0;
		double hectometerResult = 8260.0;
		double decameterResult = 628.0;
		double meterResult = 72.60000000000001;
		double decimeterResult = 6.88;
		double centimeterResult = 0.786;
		double millimeterResult = 0.051800000000000006;

		assertEquals(kilometerResult, length.toDecameter(kilometerValue, Length.KILOMETER));

		assertEquals(hectometerResult, length.toDecameter(hectometerValue, Length.HECTOMETER));

		assertEquals(decameterResult, length.toDecameter(decameterValue, Length.DECAMETER));

		assertEquals(meterResult, length.toDecameter(meterValue, Length.METER));

		assertEquals(decimeterResult, length.toDecameter(decimeterValue, Length.DECIMETER));

		assertEquals(centimeterResult, length.toDecameter(centimeterValue, Length.CENTIMETER));

		assertEquals(millimeterResult, length.toDecameter(millimeterValue, Length.MILLIMETER));
	}


	// Test converter from another units to  meter
	@Test 
	public void toMeterTest()
	{
		// Values to be tested 
		double kilometerValue = 374.0;
		double hectometerValue = 826.0;
		double decameterValue = 628.0;
		double meterValue = 726.0;
		double decimeterValue = 688.0;
		double centimeterValue = 786.0;
		double millimeterValue = 518.0;

		// Results
		double kilometerResult = 374000.0;
		double hectometerResult = 82600.0;
		double decameterResult = 6280.0;
		double meterResult = 726.0;
		double decimeterResult = 68.8;
		double centimeterResult = 7.86;
		double millimeterResult = 0.518;

		assertEquals(kilometerResult, length.toMeter(kilometerValue, Length.KILOMETER));

		assertEquals(hectometerResult, length.toMeter(hectometerValue, Length.HECTOMETER));

		assertEquals(decameterResult, length.toMeter(decameterValue, Length.DECAMETER));

		assertEquals(meterResult, length.toMeter(meterValue, Length.METER));

		assertEquals(decimeterResult, length.toMeter(decimeterValue, Length.DECIMETER));

		assertEquals(centimeterResult, length.toMeter(centimeterValue, Length.CENTIMETER));

		assertEquals(millimeterResult, length.toMeter(millimeterValue, Length.MILLIMETER));
	}


	// Test converter from another units to  decimeter
	@Test 
	public void toDecimeterTest()
	{
		// Values to be tested 
		double kilometerValue = 374.0;
		double hectometerValue = 826.0;
		double decameterValue = 628.0;
		double meterValue = 726.0;
		double decimeterValue = 688.0;
		double centimeterValue = 786.0;
		double millimeterValue = 518.0;

		// Results
		double kilometerResult = 3740000.0;
		double hectometerResult = 826000.0;
		double decameterResult = 62800.0;
		double meterResult = 7260.0;
		double decimeterResult = 688.0;
		double centimeterResult = 78.6;
		double millimeterResult = 5.18;

		assertEquals(kilometerResult, length.toDecimeter(kilometerValue, Length.KILOMETER));

		assertEquals(hectometerResult, length.toDecimeter(hectometerValue, Length.HECTOMETER));

		assertEquals(decameterResult, length.toDecimeter(decameterValue, Length.DECAMETER));

		assertEquals(meterResult, length.toDecimeter(meterValue, Length.METER));

		assertEquals(decimeterResult, length.toDecimeter(decimeterValue, Length.DECIMETER));

		assertEquals(centimeterResult, length.toDecimeter(centimeterValue, Length.CENTIMETER));

		assertEquals(millimeterResult, length.toDecimeter(millimeterValue, Length.MILLIMETER));
	}


	// Test converter from another units to  centimeter
	@Test 
	public void toCentimeterTest()
	{
		// Values to be tested 
		double kilometerValue = 374.0;
		double hectometerValue = 826.0;
		double decameterValue = 628.0;
		double meterValue = 726.0;
		double decimeterValue = 688.0;
		double centimeterValue = 786.0;
		double millimeterValue = 518.0;

		// Results
		double kilometerResult = 37400000.0;
		double hectometerResult = 8260000.0;
		double decameterResult = 628000.0;
		double meterResult = 72600.0;
		double decimeterResult = 6880.0;
		double centimeterResult = 786.0;
		double millimeterResult = 51.8;

		assertEquals(kilometerResult, length.toCentimeter(kilometerValue, Length.KILOMETER));

		assertEquals(hectometerResult, length.toCentimeter(hectometerValue, Length.HECTOMETER));

		assertEquals(decameterResult, length.toCentimeter(decameterValue, Length.DECAMETER));

		assertEquals(meterResult, length.toCentimeter(meterValue, Length.METER));

		assertEquals(decimeterResult, length.toCentimeter(decimeterValue, Length.DECIMETER));

		assertEquals(centimeterResult, length.toCentimeter(centimeterValue, Length.CENTIMETER));

		assertEquals(millimeterResult, length.toCentimeter(millimeterValue, Length.MILLIMETER));
	}


	// Test converter from another units to  millimeter
	@Test 
	public void toMillimterTest()
	{
		// Values to be tested 
		double kilometerValue = 374.0;
		double hectometerValue = 826.0;
		double decameterValue = 628.0;
		double meterValue = 726.0;
		double decimeterValue = 688.0;
		double centimeterValue = 786.0;
		double millimeterValue = 518.0;

		// Results
		double kilometerResult = 374000000.0;
		double hectometerResult = 82600000.0;
		double decameterResult = 6280000.0;
		double meterResult = 726000.0;
		double decimeterResult = 68800.0;
		double centimeterResult = 7860.0;
		double millimeterResult = 518.0;

		assertEquals(kilometerResult, length.toMillimeter(kilometerValue, Length.KILOMETER));

		assertEquals(hectometerResult, length.toMillimeter(hectometerValue, Length.HECTOMETER));

		assertEquals(decameterResult, length.toMillimeter(decameterValue, Length.DECAMETER));

		assertEquals(meterResult, length.toMillimeter(meterValue, Length.METER));

		assertEquals(decimeterResult, length.toMillimeter(decimeterValue, Length.DECIMETER));

		assertEquals(centimeterResult, length.toMillimeter(centimeterValue, Length.CENTIMETER));

		assertEquals(millimeterResult, length.toMillimeter(millimeterValue, Length.MILLIMETER));
	}
}
