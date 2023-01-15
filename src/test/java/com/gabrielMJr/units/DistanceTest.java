package com.gabrielMJr.physic.units;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistanceTest
{
  // Distance object
  private Distance distance;
  
  // Constructir
  public DistanceTest()
  {
    // initialize the variable
    distance = Distance.getInstance();
  }
  
  // Test converter from another units to  kilometer
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
    assertEquals(kilometer_result, distance.toKilometer(kilometer_value, distance.KILOMETER));
    
    assertEquals(hectometer_result, distance.toKilometer(hectometer_value, distance.HECTOMETER));
    
    assertEquals(decameter_result, distance.toKilometer(decameter_value, distance.DECAMETER));
    
    assertEquals(meter_result, distance.toKilometer(meter_value, distance.METER));
    
    assertEquals(decimeter_result, distance.toKilometer(decimeter_value, distance.DECIMETER));
    
    assertEquals(centimeter_result, distance.toKilometer(centimeter_value, distance.CENTIMETER));
    
    assertEquals(millimeter_result, distance.toKilometer(millimeter_value, Distance.MILLIMETER));
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
    
     assertEquals(kilometer_result, distance.toHectometer(kilometer_value, distance.KILOMETER));
    
    assertEquals(hectometer_result, distance.toHectometer(hectometer_value, distance.HECTOMETER));
    
    assertEquals(decameter_result, distance.toHectometer(decameter_value, distance.DECAMETER));
    
    assertEquals(meter_result, distance.toHectometer(meter_value, distance.METER));
    
    assertEquals(decimeter_result, distance.toHectometer(decimeter_value, distance.DECIMETER));
    
    assertEquals(centimeter_result, distance.toHectometer(centimeter_value, distance.CENTIMETER));
    
    assertEquals(millimeter_result, distance.toHectometer(millimeter_value, Distance.MILLIMETER));
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
    
     assertEquals(kilometer_result, distance.toDecameter(kilometer_value, distance.KILOMETER));
    
    assertEquals(hectometer_result, distance.toDecameter(hectometer_value, distance.HECTOMETER));
    
    assertEquals(decameter_result, distance.toDecameter(decameter_value, distance.DECAMETER));
    
    assertEquals(meter_result, distance.toDecameter(meter_value, distance.METER));
    
    assertEquals(decimeter_result, distance.toDecameter(decimeter_value, distance.DECIMETER));
    
    assertEquals(centimeter_result, distance.toDecameter(centimeter_value, distance.CENTIMETER));
    
    assertEquals(millimeter_result, distance.toDecameter(millimeter_value, Distance.MILLIMETER));
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
    
     assertEquals(kilometer_result, distance.toMeter(kilometer_value, distance.KILOMETER));
    
    assertEquals(hectometer_result, distance.toMeter(hectometer_value, distance.HECTOMETER));
    
    assertEquals(decameter_result, distance.toMeter(decameter_value, distance.DECAMETER));
    
    assertEquals(meter_result, distance.toMeter(meter_value, distance.METER));
    
    assertEquals(decimeter_result, distance.toMeter(decimeter_value, distance.DECIMETER));
    
    assertEquals(centimeter_result, distance.toMeter(centimeter_value, distance.CENTIMETER));
    
    assertEquals(millimeter_result, distance.toMeter(millimeter_value, Distance.MILLIMETER));
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
    
     assertEquals(kilometer_result, distance.toDecimeter(kilometer_value, distance.KILOMETER));
    
    assertEquals(hectometer_result, distance.toDecimeter(hectometer_value, distance.HECTOMETER));
    
    assertEquals(decameter_result, distance.toDecimeter(decameter_value, distance.DECAMETER));
    
    assertEquals(meter_result, distance.toDecimeter(meter_value, distance.METER));
    
    assertEquals(decimeter_result, distance.toDecimeter(decimeter_value, distance.DECIMETER));
    
    assertEquals(centimeter_result, distance.toDecimeter(centimeter_value, distance.CENTIMETER));
    
    assertEquals(millimeter_result, distance.toDecimeter(millimeter_value, Distance.MILLIMETER));
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
    
     assertEquals(kilometer_result, distance.toCentimeter(kilometer_value, distance.KILOMETER));
    
    assertEquals(hectometer_result, distance.toCentimeter(hectometer_value, distance.HECTOMETER));
    
    assertEquals(decameter_result, distance.toCentimeter(decameter_value, distance.DECAMETER));
    
    assertEquals(meter_result, distance.toCentimeter(meter_value, distance.METER));
    
    assertEquals(decimeter_result, distance.toCentimeter(decimeter_value, distance.DECIMETER));
    
    assertEquals(centimeter_result, distance.toCentimeter(centimeter_value, distance.CENTIMETER));
    
    assertEquals(millimeter_result, distance.toCentimeter(millimeter_value, Distance.MILLIMETER));
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
    
     assertEquals(kilometer_result, distance.toMillimeter(kilometer_value, distance.KILOMETER));
    
    assertEquals(hectometer_result, distance.toMillimeter(hectometer_value, distance.HECTOMETER));
    
    assertEquals(decameter_result, distance.toMillimeter(decameter_value, distance.DECAMETER));
    
    assertEquals(meter_result, distance.toMillimeter(meter_value, distance.METER));
    
    assertEquals(decimeter_result, distance.toMillimeter(decimeter_value, distance.DECIMETER));
    
    assertEquals(centimeter_result, distance.toMillimeter(centimeter_value, distance.CENTIMETER));
    
    assertEquals(millimeter_result, distance.toMillimeter(millimeter_value, Distance.MILLIMETER));
  }
}