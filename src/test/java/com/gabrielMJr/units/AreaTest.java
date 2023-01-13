package com.gabrielMJr.physic.units;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaTest
{
  // Area Object
  private Area area;
  
  // Constructor
  public AreaTest()
  {
    // Initialize the variable
    area = new Area();
  }
  
  // Test converter from another units to square kilometer
  @Test 
  public void toSquareKilometerTest()
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
    double hectometer_result = 8.259999999999998;
    double decameter_result = 0.0628;
    double meter_result = 0.000726;
    double decimeter_result = 6.879999999999999E-6;
    double centimeter_result = 7.859999999999999E-8;
    double millimeter_result = 5.18E-10;
    
    // Testing
    assertEquals(kilometer_result, area.toSquareKilometer(kilometer_value, Area.SQUARE_KILOMETER));
    
    assertEquals(hectometer_result, area.toSquareKilometer(hectometer_value, Area.SQUARE_HECTOMETER));
    
    assertEquals(decameter_result, area.toSquareKilometer(decameter_value, Area.SQUARE_DECAMETER));
    
    assertEquals(meter_result, area.toSquareKilometer(meter_value, Area.SQUARE_METER));
    
    assertEquals(decimeter_result, area.toSquareKilometer(decimeter_value, Area.SQUARE_DECIMETER));
    
    assertEquals(centimeter_result, area.toSquareKilometer(centimeter_value, Area.SQUARE_CENTIMETER));
    
    assertEquals(millimeter_result, area.toSquareKilometer(millimeter_value, Area.SQUARE_MILLIMETER));
  }
  
  
  // Test converter from another units to square kilometer
  @Test 
  public void toSquareHectometerTest()
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
    double kilometer_result = 37400.00000000001;
    double hectometer_result = 826.0;
    double decameter_result = 6.280000000000001;
    double meter_result = 0.0726;
    double decimeter_result = 6.88E-4;
    double centimeter_result = 7.860000000000001E-6;
    double millimeter_result = 5.180000000000001E-8;
    
    // Testing
    assertEquals(kilometer_result, area.toSquareHectometer(kilometer_value, Area.SQUARE_KILOMETER));
    
    assertEquals(hectometer_result, area.toSquareHectometer(hectometer_value, Area.SQUARE_HECTOMETER));
    
    assertEquals(decameter_result, area.toSquareHectometer(decameter_value, Area.SQUARE_DECAMETER));
    
    assertEquals(meter_result, area.toSquareHectometer(meter_value, Area.SQUARE_METER));
    
    assertEquals(decimeter_result, area.toSquareHectometer(decimeter_value, Area.SQUARE_DECIMETER));
    
    assertEquals(centimeter_result, area.toSquareHectometer(centimeter_value, Area.SQUARE_CENTIMETER));
    
    assertEquals(millimeter_result, area.toSquareHectometer(millimeter_value, Area.SQUARE_MILLIMETER));
  }
  
  
  // Test converter from another units to square decameter
  @Test 
  public void toSquareDecameterTest()
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
    double kilometer_result = 3740000.0000000005;
    double hectometer_result = 82600.0;
    double decameter_result = 628.0;
    double meter_result = 7.26;
    double decimeter_result = 6.88E-2;
    double centimeter_result = 7.86E-4;
    double millimeter_result = 5.1799999999999995E-6;
    
    
    // Testing
    assertEquals(kilometer_result, area.toSquareDecameter(kilometer_value, Area.SQUARE_KILOMETER));
    
    assertEquals(hectometer_result, area.toSquareDecameter(hectometer_value, Area.SQUARE_HECTOMETER));
    
    assertEquals(decameter_result, area.toSquareDecameter(decameter_value, Area.SQUARE_DECAMETER));
    
    assertEquals(meter_result, area.toSquareDecameter(meter_value, Area.SQUARE_METER));
    
    assertEquals(decimeter_result, area.toSquareDecameter(decimeter_value, Area.SQUARE_DECIMETER));
    
    assertEquals(centimeter_result, area.toSquareDecameter(centimeter_value, Area.SQUARE_CENTIMETER));
    
    assertEquals(millimeter_result, area.toSquareDecameter(millimeter_value, Area.SQUARE_MILLIMETER));
  }
  
  
  // Test converter from another units to square meter
  @Test 
  public void toSquareMeterTest()
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
    double kilometer_result = 374000000.0000000005;
    double hectometer_result = 8260000.0;
    double decameter_result = 62800.0;
    double meter_result = 726.0;
    double decimeter_result = 6.88;
    double centimeter_result = 7.86E-2;
    double millimeter_result = 5.18E-4;
    
    
    // Testing
    assertEquals(kilometer_result, area.toSquareMeter(kilometer_value, Area.SQUARE_KILOMETER));
    
    assertEquals(hectometer_result, area.toSquareMeter(hectometer_value, Area.SQUARE_HECTOMETER));
    
    assertEquals(decameter_result, area.toSquareMeter(decameter_value, Area.SQUARE_DECAMETER));
    
    assertEquals(meter_result, area.toSquareMeter(meter_value, Area.SQUARE_METER));
    
    assertEquals(decimeter_result, area.toSquareMeter(decimeter_value, Area.SQUARE_DECIMETER));
    
    assertEquals(centimeter_result, area.toSquareMeter(centimeter_value, Area.SQUARE_CENTIMETER));
    
    assertEquals(millimeter_result, area.toSquareMeter(millimeter_value, Area.SQUARE_MILLIMETER));
  }
  
  
  // Test converter from another units to square decimeter
  @Test 
  public void toSquareDecimeterTest()
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
    double kilometer_result = 37400000000.0000000005;
    double hectometer_result = 826000000.0;
    double decameter_result = 6280000.0;
    double meter_result = 72600.0;
    double decimeter_result = 688.0;
    double centimeter_result = 7.86;
    double millimeter_result = 5.18E-2;
    
    
    // Testing
    assertEquals(kilometer_result, area.toSquareDecimeter(kilometer_value, Area.SQUARE_KILOMETER));
    
    assertEquals(hectometer_result, area.toSquareDecimeter(hectometer_value, Area.SQUARE_HECTOMETER));
    
    assertEquals(decameter_result, area.toSquareDecimeter(decameter_value, Area.SQUARE_DECAMETER));
    
    assertEquals(meter_result, area.toSquareDecimeter(meter_value, Area.SQUARE_METER));
    
    assertEquals(decimeter_result, area.toSquareDecimeter(decimeter_value, Area.SQUARE_DECIMETER));
    
    assertEquals(centimeter_result, area.toSquareDecimeter(centimeter_value, Area.SQUARE_CENTIMETER));
    
    assertEquals(millimeter_result, area.toSquareDecimeter(millimeter_value, Area.SQUARE_MILLIMETER));
  }
}