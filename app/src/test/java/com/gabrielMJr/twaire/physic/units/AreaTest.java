package com.gabrielMJr.twaire.physic.units;

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
    area = Area.getInstance();
  }
  
  // Test converter from another units to square kilometer
  @Test 
  public void toSquareKilometerTest()
  {
    // Values to be tested
    double square_kilometer_value = 374.0;
    double square_hectometer_value = 826.0;
    double square_decameter_value = 628.0;
    double square_meter_value = 726.0;
    double square_decimeter_value = 688.0;
    double square_centimeter_value = 786.0;
    double square_millimeter_value = 518.0;
    
    // Results
    double square_kilometer_result = 374.0;
    double square_hectometer_result = 8.259999999999998;
    double square_decameter_result = 0.0628;
    double square_meter_result = 0.000726;
    double square_decimeter_result = 6.879999999999999E-6;
    double square_centimeter_result = 7.859999999999999E-8;
    double square_millimeter_result = 5.18E-10;
    
    // Testing
    assertEquals(square_kilometer_result, area.toSquareKilometer(square_kilometer_value, Area.SQUARE_KILOMETER));
    
    assertEquals(square_hectometer_result, area.toSquareKilometer(square_hectometer_value, Area.SQUARE_HECTOMETER));
    
    assertEquals(square_decameter_result, area.toSquareKilometer(square_decameter_value, Area.SQUARE_DECAMETER));
    
    assertEquals(square_meter_result, area.toSquareKilometer(square_meter_value, Area.SQUARE_METER));
    
    assertEquals(square_decimeter_result, area.toSquareKilometer(square_decimeter_value, Area.SQUARE_DECIMETER));
    
    assertEquals(square_centimeter_result, area.toSquareKilometer(square_centimeter_value, Area.SQUARE_CENTIMETER));
    
    assertEquals(square_millimeter_result, area.toSquareKilometer(square_millimeter_value, Area.SQUARE_MILLIMETER));
  }
  
  
  // Test converter from another units to square kilometer
  @Test 
  public void toSquareHectometerTest()
  {
     // Values to be tested
    double square_kilometer_value = 374.0;
    double square_hectometer_value = 826.0;
    double square_decameter_value = 628.0;
    double square_meter_value = 726.0;
    double square_decimeter_value = 688.0;
    double centimeter_value = 786.0;
    double square_millimeter_value = 518.0;
    
    // Results
    double square_kilometer_result = 37400.00000000001;
    double square_hectometer_result = 826.0;
    double square_decameter_result = 6.280000000000001;
    double square_meter_result = 0.0726;
    double square_decimeter_result = 6.88E-4;
    double square_centimeter_result = 7.860000000000001E-6;
    double square_millimeter_result = 5.180000000000001E-8;
    
    // Testing
    assertEquals(square_kilometer_result, area.toSquareHectometer(square_kilometer_value, Area.SQUARE_KILOMETER));
    
    assertEquals(square_hectometer_result, area.toSquareHectometer(square_hectometer_value, Area.SQUARE_HECTOMETER));
    
    assertEquals(square_decameter_result, area.toSquareHectometer(square_decameter_value, Area.SQUARE_DECAMETER));
    
    assertEquals(square_meter_result, area.toSquareHectometer(square_meter_value, Area.SQUARE_METER));
    
    assertEquals(square_decimeter_result, area.toSquareHectometer(square_decimeter_value, Area.SQUARE_DECIMETER));
    
    assertEquals(square_centimeter_result, area.toSquareHectometer(centimeter_value, Area.SQUARE_CENTIMETER));
    
    assertEquals(square_millimeter_result, area.toSquareHectometer(square_millimeter_value, Area.SQUARE_MILLIMETER));
  }
  
  
  // Test converter from another units to square decameter
  @Test 
  public void toSquareDecameterTest()
  {
    // Values to be tested
    double square_kilometer_value = 374.0;
    double square_hectometer_value = 826.0;
    double square_decameter_value = 628.0;
    double square_meter_value = 726.0;
    double square_decimeter_value = 688.0;
    double centimeter_value = 786.0;
    double square_millimeter_value = 518.0;
    
    
    // Results
    double square_kilometer_result = 3740000.0000000005;
    double square_hectometer_result = 82600.0;
    double square_decameter_result = 628.0;
    double square_meter_result = 7.26;
    double square_decimeter_result = 6.88E-2;
    double square_centimeter_result = 7.86E-4;
    double square_millimeter_result = 5.1799999999999995E-6;
    
    
    // Testing
    assertEquals(square_kilometer_result, area.toSquareDecameter(square_kilometer_value, Area.SQUARE_KILOMETER));
    
    assertEquals(square_hectometer_result, area.toSquareDecameter(square_hectometer_value, Area.SQUARE_HECTOMETER));
    
    assertEquals(square_decameter_result, area.toSquareDecameter(square_decameter_value, Area.SQUARE_DECAMETER));
    
    assertEquals(square_meter_result, area.toSquareDecameter(square_meter_value, Area.SQUARE_METER));
    
    assertEquals(square_decimeter_result, area.toSquareDecameter(square_decimeter_value, Area.SQUARE_DECIMETER));
    
    assertEquals(square_centimeter_result, area.toSquareDecameter(centimeter_value, Area.SQUARE_CENTIMETER));
    
    assertEquals(square_millimeter_result, area.toSquareDecameter(square_millimeter_value, Area.SQUARE_MILLIMETER));
  }
  
  
  // Test converter from another units to square meter
  @Test 
  public void toSquareMeterTest()
  {
    // Values to be tested
    double square_kilometer_value = 374.0;
    double square_hectometer_value = 826.0;
    double square_decameter_value = 628.0;
    double square_meter_value = 726.0;
    double square_decimeter_value = 688.0;
    double centimeter_value = 786.0;
    double square_millimeter_value = 518.0;
    
    
    // Results
    double square_kilometer_result = 374000000.0000000005;
    double square_hectometer_result = 8260000.0;
    double square_decameter_result = 62800.0;
    double square_meter_result = 726.0;
    double square_decimeter_result = 6.88;
    double square_centimeter_result = 7.86E-2;
    double square_millimeter_result = 5.18E-4;
    
    
    // Testing
    assertEquals(square_kilometer_result, area.toSquareMeter(square_kilometer_value, Area.SQUARE_KILOMETER));
    
    assertEquals(square_hectometer_result, area.toSquareMeter(square_hectometer_value, Area.SQUARE_HECTOMETER));
    
    assertEquals(square_decameter_result, area.toSquareMeter(square_decameter_value, Area.SQUARE_DECAMETER));
    
    assertEquals(square_meter_result, area.toSquareMeter(square_meter_value, Area.SQUARE_METER));
    
    assertEquals(square_decimeter_result, area.toSquareMeter(square_decimeter_value, Area.SQUARE_DECIMETER));
    
    assertEquals(square_centimeter_result, area.toSquareMeter(centimeter_value, Area.SQUARE_CENTIMETER));
    
    assertEquals(square_millimeter_result, area.toSquareMeter(square_millimeter_value, Area.SQUARE_MILLIMETER));
  }
  
  
  // Test converter from another units to square decimeter
  @Test 
  public void toSquareDecimeterTest()
  {
    // Values to be tested
    double square_kilometer_value = 374.0;
    double square_hectometer_value = 826.0;
    double square_decameter_value = 628.0;
    double square_meter_value = 726.0;
    double square_decimeter_value = 688.0;
    double centimeter_value = 786.0;
    double square_millimeter_value = 518.0;
    
    
    // Results
    double square_kilometer_result = 37400000000.0000000005;
    double square_hectometer_result = 826000000.0;
    double square_decameter_result = 6280000.0;
    double square_meter_result = 72600.0;
    double square_decimeter_result = 688.0;
    double square_centimeter_result = 7.86;
    double square_millimeter_result = 5.18E-2;
    
    
    // Testing
    assertEquals(square_kilometer_result, area.toSquareDecimeter(square_kilometer_value, Area.SQUARE_KILOMETER));
    
    assertEquals(square_hectometer_result, area.toSquareDecimeter(square_hectometer_value, Area.SQUARE_HECTOMETER));
    
    assertEquals(square_decameter_result, area.toSquareDecimeter(square_decameter_value, Area.SQUARE_DECAMETER));
    
    assertEquals(square_meter_result, area.toSquareDecimeter(square_meter_value, Area.SQUARE_METER));
    
    assertEquals(square_decimeter_result, area.toSquareDecimeter(square_decimeter_value, Area.SQUARE_DECIMETER));
    
    assertEquals(square_centimeter_result, area.toSquareDecimeter(centimeter_value, Area.SQUARE_CENTIMETER));
    
    assertEquals(square_millimeter_result, area.toSquareDecimeter(square_millimeter_value, Area.SQUARE_MILLIMETER));
  }
  
  
  // Test converter from another units to square centimeter
  @Test 
  public void toSquareCentimeterTest()
  {
    // Values to be tested
    double square_kilometer_value = 374.0;
    double square_hectometer_value = 826.0;
    double square_decameter_value = 628.0;
    double square_meter_value = 726.0;
    double square_decimeter_value = 688.0;
    double square_centimeter_value = 786.0;
    double square_millimeter_value = 518.0;
    
    
    // Results
    double square_kilometer_result = 3740000000000.0;
    double square_hectometer_result = 82600000000.0;
    double square_decameter_result = 628000000.0;
    double square_meter_result = 7260000.0;
    double square_decimeter_result = 68800.0;
    double square_centimeter_result = 786.0;
    double square_millimeter_result = 5.18;
    
    
    // Testing
    assertEquals(square_kilometer_result, area.toSquareCentimeter(square_kilometer_value, Area.SQUARE_KILOMETER));
    
    assertEquals(square_hectometer_result, area.toSquareCentimeter(square_hectometer_value, Area.SQUARE_HECTOMETER));
    
    assertEquals(square_decameter_result, area.toSquareCentimeter(square_decameter_value, Area.SQUARE_DECAMETER));
    
    assertEquals(square_meter_result, area.toSquareCentimeter(square_meter_value, Area.SQUARE_METER));
    
    assertEquals(square_decimeter_result, area.toSquareCentimeter(square_decimeter_value, Area.SQUARE_DECIMETER));
    
    assertEquals(square_centimeter_result, area.toSquareCentimeter(square_centimeter_value, Area.SQUARE_CENTIMETER));
    
    assertEquals(square_millimeter_result, area.toSquareCentimeter(square_millimeter_value, Area.SQUARE_MILLIMETER));
  }
  
  
  // Test converter from another units to square millimeter
  @Test 
  public void toSquareMillimeterTest()
  {
    // Values to be tested
    double square_kilometer_value = 374.0;
    double square_hectometer_value = 826.0;
    double square_decameter_value = 628.0;
    double square_meter_value = 726.0;
    double square_decimeter_value = 688.0;
    double square_centimeter_value = 786.0;
    double square_millimeter_value = 518.0;
    
    
    // Results
    double square_kilometer_result = 374000000000000.0;
    double square_hectometer_result = 8260000000000.0;
    double square_decameter_result = 62800000000.0;
    double square_meter_result = 726000000.0;
    double square_decimeter_result = 6880000.0;
    double square_centimeter_result = 78600.0;
    double square_millimeter_result = 518.0;
    
    
    // Testing
    assertEquals(square_kilometer_result, area.toSquareMillimeter(square_kilometer_value, Area.SQUARE_KILOMETER));
    
    assertEquals(square_hectometer_result, area.toSquareMillimeter(square_hectometer_value, Area.SQUARE_HECTOMETER));
    
    assertEquals(square_decameter_result, area.toSquareMillimeter(square_decameter_value, Area.SQUARE_DECAMETER));
    
    assertEquals(square_meter_result, area.toSquareMillimeter(square_meter_value, Area.SQUARE_METER));
    
    assertEquals(square_decimeter_result, area.toSquareMillimeter(square_decimeter_value, Area.SQUARE_DECIMETER));
    
    assertEquals(square_centimeter_result, area.toSquareMillimeter(square_centimeter_value, Area.SQUARE_CENTIMETER));
    
    assertEquals(square_millimeter_result, area.toSquareMillimeter(square_millimeter_value, Area.SQUARE_MILLIMETER));
  }
}