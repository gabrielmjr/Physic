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
}