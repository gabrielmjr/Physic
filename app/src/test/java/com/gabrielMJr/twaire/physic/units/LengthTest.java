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
    double kilometer_value = 374.0;
    double hectometer_value = 826.0;
    double decameter_value = 628.0;
    double meter_value = 726.0;
    double decimeter_value = 688.0;
    double centimeter_value = 786.0;
    double millimeter_value = 518.0;
    
    // Results
    double kilometer_result = 374.0;
    double hectometer_result = 82.60000000000001;
    double decameter_result = 6.279999999999999;
    double meter_result = 0.726;
    double decimeter_result = 0.0688;
    double centimeter_result = 0.00786;
    double millimeter_result = 0.000518;
  
  // Testing
    assertEquals(kilometer_result, length.toKilometer(kilometer_value, Length.KILOMETER));
    
    assertEquals(hectometer_result, length.toKilometer(hectometer_value, Length.HECTOMETER));
    
    assertEquals(decameter_result, length.toKilometer(decameter_value, Length.DECAMETER));
    
    assertEquals(meter_result, length.toKilometer(meter_value, Length.METER));
    
    assertEquals(decimeter_result, length.toKilometer(decimeter_value, Length.DECIMETER));
    
    assertEquals(centimeter_result, length.toKilometer(centimeter_value, Length.CENTIMETER));
    
    assertEquals(millimeter_result, length.toKilometer(millimeter_value, Length.MILLIMETER));
  }
  
  
  // Test converter from another units to  hectometer
  @Test 
  public void toHectometerTest()
  {
    // Values to be tested 
    double kilometer_value = 374.0;
    double hectometer_value = 826.0;
    double decameter_value = 628.0;
    double meter_value = 726.0;
    double decimeter_value = 688.0;
    double centimeter_value = 786.0;
    double millimeter_value = 518.0;
    
    // Results
    double kilometer_result = 3740.0;
    double hectometer_result = 826.0;
    double decameter_result = 62.8;
    double meter_result = 7.26;
    double decimeter_result = 0.688;
    double centimeter_result = 0.0786;
    double millimeter_result = 0.00518;
    
     assertEquals(kilometer_result, length.toHectometer(kilometer_value, Length.KILOMETER));
    
    assertEquals(hectometer_result, length.toHectometer(hectometer_value, Length.HECTOMETER));
    
    assertEquals(decameter_result, length.toHectometer(decameter_value, Length.DECAMETER));
    
    assertEquals(meter_result, length.toHectometer(meter_value, Length.METER));
    
    assertEquals(decimeter_result, length.toHectometer(decimeter_value, Length.DECIMETER));
    
    assertEquals(centimeter_result, length.toHectometer(centimeter_value, Length.CENTIMETER));
    
    assertEquals(millimeter_result, length.toHectometer(millimeter_value, Length.MILLIMETER));
  }
  
  
  // Test converter from another units to  decameter
  @Test 
  public void toDecameterTest()
  {
    // Values to be tested 
    double kilometer_value = 374.0;
    double hectometer_value = 826.0;
    double decameter_value = 628.0;
    double meter_value = 726.0;
    double decimeter_value = 688.0;
    double centimeter_value = 786.0;
    double millimeter_value = 518.0;
    
    // Results
    double kilometer_result = 37400.0;
    double hectometer_result = 8260.0;
    double decameter_result = 628.0;
    double meter_result = 72.60000000000001;
    double decimeter_result = 6.88;
    double centimeter_result = 0.786;
    double millimeter_result = 0.051800000000000006;
    
     assertEquals(kilometer_result, length.toDecameter(kilometer_value, Length.KILOMETER));
    
    assertEquals(hectometer_result, length.toDecameter(hectometer_value, Length.HECTOMETER));
    
    assertEquals(decameter_result, length.toDecameter(decameter_value, Length.DECAMETER));
    
    assertEquals(meter_result, length.toDecameter(meter_value, Length.METER));
    
    assertEquals(decimeter_result, length.toDecameter(decimeter_value, Length.DECIMETER));
    
    assertEquals(centimeter_result, length.toDecameter(centimeter_value, Length.CENTIMETER));
    
    assertEquals(millimeter_result, length.toDecameter(millimeter_value, Length.MILLIMETER));
  }
  
  
  // Test converter from another units to  meter
  @Test 
  public void toMeterTest()
  {
    // Values to be tested 
    double kilometer_value = 374.0;
    double hectometer_value = 826.0;
    double decameter_value = 628.0;
    double meter_value = 726.0;
    double decimeter_value = 688.0;
    double centimeter_value = 786.0;
    double millimeter_value = 518.0;
    
    // Results
    double kilometer_result = 374000.0;
    double hectometer_result = 82600.0;
    double decameter_result = 6280.0;
    double meter_result = 726.0;
    double decimeter_result = 68.8;
    double centimeter_result = 7.86;
    double millimeter_result = 0.518;
    
     assertEquals(kilometer_result, length.toMeter(kilometer_value, Length.KILOMETER));
    
    assertEquals(hectometer_result, length.toMeter(hectometer_value, Length.HECTOMETER));
    
    assertEquals(decameter_result, length.toMeter(decameter_value, Length.DECAMETER));
    
    assertEquals(meter_result, length.toMeter(meter_value, Length.METER));
    
    assertEquals(decimeter_result, length.toMeter(decimeter_value, Length.DECIMETER));
    
    assertEquals(centimeter_result, length.toMeter(centimeter_value, Length.CENTIMETER));
    
    assertEquals(millimeter_result, length.toMeter(millimeter_value, Length.MILLIMETER));
  }
  
  
  // Test converter from another units to  decimeter
  @Test 
  public void toDecimeterTest()
  {
    // Values to be tested 
    double kilometer_value = 374.0;
    double hectometer_value = 826.0;
    double decameter_value = 628.0;
    double meter_value = 726.0;
    double decimeter_value = 688.0;
    double centimeter_value = 786.0;
    double millimeter_value = 518.0;
    
    // Results
    double kilometer_result = 3740000.0;
    double hectometer_result = 826000.0;
    double decameter_result = 62800.0;
    double meter_result = 7260.0;
    double decimeter_result = 688.0;
    double centimeter_result = 78.6;
    double millimeter_result = 5.18;
    
     assertEquals(kilometer_result, length.toDecimeter(kilometer_value, Length.KILOMETER));
    
    assertEquals(hectometer_result, length.toDecimeter(hectometer_value, Length.HECTOMETER));
    
    assertEquals(decameter_result, length.toDecimeter(decameter_value, Length.DECAMETER));
    
    assertEquals(meter_result, length.toDecimeter(meter_value, Length.METER));
    
    assertEquals(decimeter_result, length.toDecimeter(decimeter_value, Length.DECIMETER));
    
    assertEquals(centimeter_result, length.toDecimeter(centimeter_value, Length.CENTIMETER));
    
    assertEquals(millimeter_result, length.toDecimeter(millimeter_value, Length.MILLIMETER));
  }
  
  
  // Test converter from another units to  centimeter
  @Test 
  public void toCentimeterTest()
  {
    // Values to be tested 
    double kilometer_value = 374.0;
    double hectometer_value = 826.0;
    double decameter_value = 628.0;
    double meter_value = 726.0;
    double decimeter_value = 688.0;
    double centimeter_value = 786.0;
    double millimeter_value = 518.0;
    
    // Results
    double kilometer_result = 37400000.0;
    double hectometer_result = 8260000.0;
    double decameter_result = 628000.0;
    double meter_result = 72600.0;
    double decimeter_result = 6880.0;
    double centimeter_result = 786.0;
    double millimeter_result = 51.8;
    
     assertEquals(kilometer_result, length.toCentimeter(kilometer_value, Length.KILOMETER));
    
    assertEquals(hectometer_result, length.toCentimeter(hectometer_value, Length.HECTOMETER));
    
    assertEquals(decameter_result, length.toCentimeter(decameter_value, Length.DECAMETER));
    
    assertEquals(meter_result, length.toCentimeter(meter_value, Length.METER));
    
    assertEquals(decimeter_result, length.toCentimeter(decimeter_value, Length.DECIMETER));
    
    assertEquals(centimeter_result, length.toCentimeter(centimeter_value, Length.CENTIMETER));
    
    assertEquals(millimeter_result, length.toCentimeter(millimeter_value, Length.MILLIMETER));
  }
  
  
  // Test converter from another units to  millimeter
  @Test 
  public void toMillimterTest()
  {
    // Values to be tested 
    double kilometer_value = 374.0;
    double hectometer_value = 826.0;
    double decameter_value = 628.0;
    double meter_value = 726.0;
    double decimeter_value = 688.0;
    double centimeter_value = 786.0;
    double millimeter_value = 518.0;
    
    // Results
    double kilometer_result = 374000000.0;
    double hectometer_result = 82600000.0;
    double decameter_result = 6280000.0;
    double meter_result = 726000.0;
    double decimeter_result = 68800.0;
    double centimeter_result = 7860.0;
    double millimeter_result = 518.0;
    
     assertEquals(kilometer_result, length.toMillimeter(kilometer_value, Length.KILOMETER));
    
    assertEquals(hectometer_result, length.toMillimeter(hectometer_value, Length.HECTOMETER));
    
    assertEquals(decameter_result, length.toMillimeter(decameter_value, Length.DECAMETER));
    
    assertEquals(meter_result, length.toMillimeter(meter_value, Length.METER));
    
    assertEquals(decimeter_result, length.toMillimeter(decimeter_value, Length.DECIMETER));
    
    assertEquals(centimeter_result, length.toMillimeter(centimeter_value, Length.CENTIMETER));
    
    assertEquals(millimeter_result, length.toMillimeter(millimeter_value, Length.MILLIMETER));
  }
}