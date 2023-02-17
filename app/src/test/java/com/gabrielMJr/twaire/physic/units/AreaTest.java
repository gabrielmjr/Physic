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
    double SquareKilometerValue = 374.0;
    double SquareHectometerValue = 826.0;
    double SquareDecameterValue = 628.0;
    double SquareMeterValue = 726.0;
    double SquareDecimeterValue = 688.0;
    double SquareCentimeterValue = 786.0;
    double SquareMillimeterValue = 518.0;
    
    // Results
    double SquareKilometerResult = 374.0;
    double SquareHectometerResult = 8.259999999999998;
    double SquareDecameterResult = 0.0628;
    double SquareMeterResult = 0.000726;
    double SquareDecimeterResult = 6.879999999999999E-6;
    double SquareCentimeterResult = 7.859999999999999E-8;
    double SquareMillimeterResult = 5.18E-10;
    
    // Testing
    assertEquals(SquareKilometerResult, area.toSquareKilometer(SquareKilometerValue, Area.SQUARE_KILOMETER));
    
    assertEquals(SquareHectometerResult, area.toSquareKilometer(SquareHectometerValue, Area.SQUARE_HECTOMETER));
    
    assertEquals(SquareDecameterResult, area.toSquareKilometer(SquareDecameterValue, Area.SQUARE_DECAMETER));
    
    assertEquals(SquareMeterResult, area.toSquareKilometer(SquareMeterValue, Area.SQUARE_METER));
    
    assertEquals(SquareDecimeterResult, area.toSquareKilometer(SquareDecimeterValue, Area.SQUARE_DECIMETER));
    
    assertEquals(SquareCentimeterResult, area.toSquareKilometer(SquareCentimeterValue, Area.SQUARE_CENTIMETER));
    
    assertEquals(SquareMillimeterResult, area.toSquareKilometer(SquareMillimeterValue, Area.SQUARE_MILLIMETER));
  }
  
  
  // Test converter from another units to square kilometer
  @Test 
  public void toSquareHectometerTest()
  {
     // Values to be tested
    double SquareKilometerValue = 374.0;
    double SquareHectometerValue = 826.0;
    double SquareDecameterValue = 628.0;
    double SquareMeterValue = 726.0;
    double SquareDecimeterValue = 688.0;
    double centimeter_value = 786.0;
    double SquareMillimeterValue = 518.0;
    
    // Results
    double SquareKilometerResult = 37400.00000000001;
    double SquareHectometerResult = 826.0;
    double SquareDecameterResult = 6.280000000000001;
    double SquareMeterResult = 0.0726;
    double SquareDecimeterResult = 6.88E-4;
    double SquareCentimeterResult = 7.860000000000001E-6;
    double SquareMillimeterResult = 5.180000000000001E-8;
    
    // Testing
    assertEquals(SquareKilometerResult, area.toSquareHectometer(SquareKilometerValue, Area.SQUARE_KILOMETER));
    
    assertEquals(SquareHectometerResult, area.toSquareHectometer(SquareHectometerValue, Area.SQUARE_HECTOMETER));
    
    assertEquals(SquareDecameterResult, area.toSquareHectometer(SquareDecameterValue, Area.SQUARE_DECAMETER));
    
    assertEquals(SquareMeterResult, area.toSquareHectometer(SquareMeterValue, Area.SQUARE_METER));
    
    assertEquals(SquareDecimeterResult, area.toSquareHectometer(SquareDecimeterValue, Area.SQUARE_DECIMETER));
    
    assertEquals(SquareCentimeterResult, area.toSquareHectometer(centimeter_value, Area.SQUARE_CENTIMETER));
    
    assertEquals(SquareMillimeterResult, area.toSquareHectometer(SquareMillimeterValue, Area.SQUARE_MILLIMETER));
  }
  
  
  // Test converter from another units to square decameter
  @Test 
  public void toSquareDecameterTest()
  {
    // Values to be tested
    double SquareKilometerValue = 374.0;
    double SquareHectometerValue = 826.0;
    double SquareDecameterValue = 628.0;
    double SquareMeterValue = 726.0;
    double SquareDecimeterValue = 688.0;
    double centimeter_value = 786.0;
    double SquareMillimeterValue = 518.0;
    
    
    // Results
    double SquareKilometerResult = 3740000.0000000005;
    double SquareHectometerResult = 82600.0;
    double SquareDecameterResult = 628.0;
    double SquareMeterResult = 7.26;
    double SquareDecimeterResult = 6.88E-2;
    double SquareCentimeterResult = 7.86E-4;
    double SquareMillimeterResult = 5.1799999999999995E-6;
    
    
    // Testing
    assertEquals(SquareKilometerResult, area.toSquareDecameter(SquareKilometerValue, Area.SQUARE_KILOMETER));
    
    assertEquals(SquareHectometerResult, area.toSquareDecameter(SquareHectometerValue, Area.SQUARE_HECTOMETER));
    
    assertEquals(SquareDecameterResult, area.toSquareDecameter(SquareDecameterValue, Area.SQUARE_DECAMETER));
    
    assertEquals(SquareMeterResult, area.toSquareDecameter(SquareMeterValue, Area.SQUARE_METER));
    
    assertEquals(SquareDecimeterResult, area.toSquareDecameter(SquareDecimeterValue, Area.SQUARE_DECIMETER));
    
    assertEquals(SquareCentimeterResult, area.toSquareDecameter(centimeter_value, Area.SQUARE_CENTIMETER));
    
    assertEquals(SquareMillimeterResult, area.toSquareDecameter(SquareMillimeterValue, Area.SQUARE_MILLIMETER));
  }
  
  
  // Test converter from another units to square meter
  @Test 
  public void toSquareMeterTest()
  {
    // Values to be tested
    double SquareKilometerValue = 374.0;
    double SquareHectometerValue = 826.0;
    double SquareDecameterValue = 628.0;
    double SquareMeterValue = 726.0;
    double SquareDecimeterValue = 688.0;
    double centimeter_value = 786.0;
    double SquareMillimeterValue = 518.0;
    
    
    // Results
    double SquareKilometerResult = 374000000.0000000005;
    double SquareHectometerResult = 8260000.0;
    double SquareDecameterResult = 62800.0;
    double SquareMeterResult = 726.0;
    double SquareDecimeterResult = 6.88;
    double SquareCentimeterResult = 7.86E-2;
    double SquareMillimeterResult = 5.18E-4;
    
    
    // Testing
    assertEquals(SquareKilometerResult, area.toSquareMeter(SquareKilometerValue, Area.SQUARE_KILOMETER));
    
    assertEquals(SquareHectometerResult, area.toSquareMeter(SquareHectometerValue, Area.SQUARE_HECTOMETER));
    
    assertEquals(SquareDecameterResult, area.toSquareMeter(SquareDecameterValue, Area.SQUARE_DECAMETER));
    
    assertEquals(SquareMeterResult, area.toSquareMeter(SquareMeterValue, Area.SQUARE_METER));
    
    assertEquals(SquareDecimeterResult, area.toSquareMeter(SquareDecimeterValue, Area.SQUARE_DECIMETER));
    
    assertEquals(SquareCentimeterResult, area.toSquareMeter(centimeter_value, Area.SQUARE_CENTIMETER));
    
    assertEquals(SquareMillimeterResult, area.toSquareMeter(SquareMillimeterValue, Area.SQUARE_MILLIMETER));
  }
  
  
  // Test converter from another units to square decimeter
  @Test 
  public void toSquareDecimeterTest()
  {
    // Values to be tested
    double SquareKilometerValue = 374.0;
    double SquareHectometerValue = 826.0;
    double SquareDecameterValue = 628.0;
    double SquareMeterValue = 726.0;
    double SquareDecimeterValue = 688.0;
    double centimeter_value = 786.0;
    double SquareMillimeterValue = 518.0;
    
    
    // Results
    double SquareKilometerResult = 37400000000.0000000005;
    double SquareHectometerResult = 826000000.0;
    double SquareDecameterResult = 6280000.0;
    double SquareMeterResult = 72600.0;
    double SquareDecimeterResult = 688.0;
    double SquareCentimeterResult = 7.86;
    double SquareMillimeterResult = 5.18E-2;
    
    
    // Testing
    assertEquals(SquareKilometerResult, area.toSquareDecimeter(SquareKilometerValue, Area.SQUARE_KILOMETER));
    
    assertEquals(SquareHectometerResult, area.toSquareDecimeter(SquareHectometerValue, Area.SQUARE_HECTOMETER));
    
    assertEquals(SquareDecameterResult, area.toSquareDecimeter(SquareDecameterValue, Area.SQUARE_DECAMETER));
    
    assertEquals(SquareMeterResult, area.toSquareDecimeter(SquareMeterValue, Area.SQUARE_METER));
    
    assertEquals(SquareDecimeterResult, area.toSquareDecimeter(SquareDecimeterValue, Area.SQUARE_DECIMETER));
    
    assertEquals(SquareCentimeterResult, area.toSquareDecimeter(centimeter_value, Area.SQUARE_CENTIMETER));
    
    assertEquals(SquareMillimeterResult, area.toSquareDecimeter(SquareMillimeterValue, Area.SQUARE_MILLIMETER));
  }
  
  
  // Test converter from another units to square centimeter
  @Test 
  public void toSquareCentimeterTest()
  {
    // Values to be tested
    double SquareKilometerValue = 374.0;
    double SquareHectometerValue = 826.0;
    double SquareDecameterValue = 628.0;
    double SquareMeterValue = 726.0;
    double SquareDecimeterValue = 688.0;
    double SquareCentimeterValue = 786.0;
    double SquareMillimeterValue = 518.0;
    
    
    // Results
    double SquareKilometerResult = 3740000000000.0;
    double SquareHectometerResult = 82600000000.0;
    double SquareDecameterResult = 628000000.0;
    double SquareMeterResult = 7260000.0;
    double SquareDecimeterResult = 68800.0;
    double SquareCentimeterResult = 786.0;
    double SquareMillimeterResult = 5.18;
    
    
    // Testing
    assertEquals(SquareKilometerResult, area.toSquareCentimeter(SquareKilometerValue, Area.SQUARE_KILOMETER));
    
    assertEquals(SquareHectometerResult, area.toSquareCentimeter(SquareHectometerValue, Area.SQUARE_HECTOMETER));
    
    assertEquals(SquareDecameterResult, area.toSquareCentimeter(SquareDecameterValue, Area.SQUARE_DECAMETER));
    
    assertEquals(SquareMeterResult, area.toSquareCentimeter(SquareMeterValue, Area.SQUARE_METER));
    
    assertEquals(SquareDecimeterResult, area.toSquareCentimeter(SquareDecimeterValue, Area.SQUARE_DECIMETER));
    
    assertEquals(SquareCentimeterResult, area.toSquareCentimeter(SquareCentimeterValue, Area.SQUARE_CENTIMETER));
    
    assertEquals(SquareMillimeterResult, area.toSquareCentimeter(SquareMillimeterValue, Area.SQUARE_MILLIMETER));
  }
  
  
  // Test converter from another units to square millimeter
  @Test 
  public void toSquareMillimeterTest()
  {
    // Values to be tested
    double SquareKilometerValue = 374.0;
    double SquareHectometerValue = 826.0;
    double SquareDecameterValue = 628.0;
    double SquareMeterValue = 726.0;
    double SquareDecimeterValue = 688.0;
    double SquareCentimeterValue = 786.0;
    double SquareMillimeterValue = 518.0;
    
    
    // Results
    double SquareKilometerResult = 374000000000000.0;
    double SquareHectometerResult = 8260000000000.0;
    double SquareDecameterResult = 62800000000.0;
    double SquareMeterResult = 726000000.0;
    double SquareDecimeterResult = 6880000.0;
    double SquareCentimeterResult = 78600.0;
    double SquareMillimeterResult = 518.0;
    
    
    // Testing
    assertEquals(SquareKilometerResult, area.toSquareMillimeter(SquareKilometerValue, Area.SQUARE_KILOMETER));
    
    assertEquals(SquareHectometerResult, area.toSquareMillimeter(SquareHectometerValue, Area.SQUARE_HECTOMETER));
    
    assertEquals(SquareDecameterResult, area.toSquareMillimeter(SquareDecameterValue, Area.SQUARE_DECAMETER));
    
    assertEquals(SquareMeterResult, area.toSquareMillimeter(SquareMeterValue, Area.SQUARE_METER));
    
    assertEquals(SquareDecimeterResult, area.toSquareMillimeter(SquareDecimeterValue, Area.SQUARE_DECIMETER));
    
    assertEquals(SquareCentimeterResult, area.toSquareMillimeter(SquareCentimeterValue, Area.SQUARE_CENTIMETER));
    
    assertEquals(SquareMillimeterResult, area.toSquareMillimeter(SquareMillimeterValue, Area.SQUARE_MILLIMETER));
  }
}