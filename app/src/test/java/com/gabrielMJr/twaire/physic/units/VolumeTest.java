package com.gabrielMJr.twaire.physic.units;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VolumeTest
{
  // Volume object
  private Volume volume;
  
  // Constructor
  public VolumeTest()
  {
    // Initialize the variable
    volume = Volume.getInstance();
  }
  
  
  // Test conversor from another units to kilometer 
  @Test
  public void toCubeKilometerTest()
  {
    // Values to be testes
    double cubeKilometerValue = 1.0;
    double cubeHectometerValue = 1.0;
    double cubeDecameterValue = 1.0;
    double cubeMeterValue = 1.0;
    double cubeDecimeterValue = 1.0;
    double cubeCentimeterValue = 1.0;
    double cubeMillimeterValue = 1.0;
    
    // Result Values
    Double cubeKilometerResult = 1.0;
    Double cubeHectometerResult = 0.001;
    Double cubeDecameterResult = 0.000001;
    Double cubeMeterResult = 0.000000001;
    Double cubeDecimeterResult = 0.000000000001;
    Double cubeCentimeterResult = 0.000000000000001;
    Double cubeMillimeterResult = 0.000000000000000001;
    
    // Testing
    assertEquals(cubeKilometerResult, volume.toCubeKilometer(cubeKilometerValue, Volume.CUBE_KILOMETER));
    
    assertEquals(cubeHectometerResult, volume.toCubeKilometer(cubeHectometerValue, Volume.CUBE_HECTOMETER));
    
    assertEquals(cubeDecameterResult, volume.toCubeKilometer(cubeDecameterValue, Volume.CUBE_DECAMETER));
    
    assertEquals(cubeMeterResult, volume.toCubeKilometer(cubeMeterValue, Volume.CUBE_METER));
    
    assertEquals(cubeDecimeterResult, volume.toCubeKilometer(cubeDecimeterValue, Volume.CUBE_DECIMETER));
    
    assertEquals(cubeCentimeterResult, volume.toCubeKilometer(cubeCentimeterValue, Volume.CUBE_CENTIMETER));
    
    assertEquals(cubeMillimeterResult, volume.toCubeKilometer(cubeMillimeterValue, Volume.CUBE_MILLIMETER));
  }
  
  
  // Test conversor from another units to hectometer 
  @Test
  public void toCubeHectometerTest()
  {
    // Values to be testes
    double cubeKilometerValue = 1.0;
    double cubeHectometerValue = 1.0;
    double cubeDecameterValue = 1.0;
    double cubeMeterValue = 1.0;
    double cubeDecimeterValue = 1.0;
    double cubeCentimeterValue = 1.0;
    double cubeMillimeterValue = 1.0;
    
    // Result Values
    Double cubeKilometerResult = 999.9999999999999;
    Double cubeHectometerResult = 1.0;
    Double cubeDecameterResult = 0.001;
    Double cubeMeterResult = 0.000001;
    Double cubeDecimeterResult = 0.0000000009999999999999999;
    Double cubeCentimeterResult = 0.000000000001;
    Double cubeMillimeterResult = 0.0000000000000009999999999999999;
    
    // Testing
    assertEquals(cubeKilometerResult, volume.toCubeHectometer(cubeKilometerValue, Volume.CUBE_KILOMETER));
    
    assertEquals(cubeHectometerResult, volume.toCubeHectometer(cubeHectometerValue, Volume.CUBE_HECTOMETER));
    
    assertEquals(cubeDecameterResult, volume.toCubeHectometer(cubeDecameterValue, Volume.CUBE_DECAMETER));
    
    assertEquals(cubeMeterResult, volume.toCubeHectometer(cubeMeterValue, Volume.CUBE_METER));
    
    assertEquals(cubeDecimeterResult, volume.toCubeHectometer(cubeDecimeterValue, Volume.CUBE_DECIMETER));
    
    assertEquals(cubeCentimeterResult, volume.toCubeHectometer(cubeCentimeterValue, Volume.CUBE_CENTIMETER));
    
    assertEquals(cubeMillimeterResult, volume.toCubeHectometer(cubeMillimeterValue, Volume.CUBE_MILLIMETER));
  }
  
  
  // Test conversor from another units to decameter 
  @Test
  public void toCubeDecameterTest()
  {
    // Values to be testes
    double cubeKilometerValue = 1.0;
    double cubeHectometerValue = 1.0;
    double cubeDecameterValue = 1.0;
    double cubeMeterValue = 1.0;
    double cubeDecimeterValue = 1.0;
    double cubeCentimeterValue = 1.0;
    double cubeMillimeterValue = 1.0;
    
    // Result Values
    Double cubeKilometerResult = 1000000.0;
    Double cubeHectometerResult = 1000.0000000000001;
    Double cubeDecameterResult = 1.0;
    Double cubeMeterResult = 0.001;
    Double cubeDecimeterResult = 0.000001;
    Double cubeCentimeterResult = 0.000000001;
    Double cubeMillimeterResult = 0.000000000001;;
    
    // Testing
    assertEquals(cubeKilometerResult, volume.toCubeDecameter(cubeKilometerValue, Volume.CUBE_KILOMETER));
    
    assertEquals(cubeHectometerResult, volume.toCubeDecameter(cubeHectometerValue, Volume.CUBE_HECTOMETER));
    
    assertEquals(cubeDecameterResult, volume.toCubeDecameter(cubeDecameterValue, Volume.CUBE_DECAMETER));
    
    assertEquals(cubeMeterResult, volume.toCubeDecameter(cubeMeterValue, Volume.CUBE_METER));
    
    assertEquals(cubeDecimeterResult, volume.toCubeDecameter(cubeDecimeterValue, Volume.CUBE_DECIMETER));
    
    assertEquals(cubeCentimeterResult, volume.toCubeDecameter(cubeCentimeterValue, Volume.CUBE_CENTIMETER));
    
    assertEquals(cubeMillimeterResult, volume.toCubeDecameter(cubeMillimeterValue, Volume.CUBE_MILLIMETER));
  }
  
  
  // Test conversor from another units to meter 
  @Test
  public void toCubeMeterTest()
  {
    // Values to be testes
    double cubeKilometerValue = 1.0;
    double cubeHectometerValue = 1.0;
    double cubeDecameterValue = 1.0;
    double cubeMeterValue = 1.0;
    double cubeDecimeterValue = 1.0;
    double cubeCentimeterValue = 1.0;
    double cubeMillimeterValue = 1.0;
    
    // Result Values
    Double cubeKilometerResult = 9.999999999999999E8;
    Double cubeHectometerResult = 1000000.0000000000001;
    Double cubeDecameterResult = 1000.0;
    Double cubeMeterResult = 1.0;
    Double cubeDecimeterResult = 0.001;
    Double cubeCentimeterResult = 0.000001;
    Double cubeMillimeterResult = 0.000000001;;
    
    // Testing
    assertEquals(cubeKilometerResult, volume.toCubeMeter(cubeKilometerValue, Volume.CUBE_KILOMETER));
    
    assertEquals(cubeHectometerResult, volume.toCubeMeter(cubeHectometerValue, Volume.CUBE_HECTOMETER));
    
    assertEquals(cubeDecameterResult, volume.toCubeMeter(cubeDecameterValue, Volume.CUBE_DECAMETER));
    
    assertEquals(cubeMeterResult, volume.toCubeMeter(cubeMeterValue, Volume.CUBE_METER));
    
    assertEquals(cubeDecimeterResult, volume.toCubeMeter(cubeDecimeterValue, Volume.CUBE_DECIMETER));
    
    assertEquals(cubeCentimeterResult, volume.toCubeMeter(cubeCentimeterValue, Volume.CUBE_CENTIMETER));
    
    assertEquals(cubeMillimeterResult, volume.toCubeMeter(cubeMillimeterValue, Volume.CUBE_MILLIMETER));
  }
  
  
   // Test conversor from another units to decimeter 
  @Test
  public void toCubeDecimeterTest()
  {
    // Values to be testes
    double cubeKilometerValue = 1.0;
    double cubeHectometerValue = 1.0;
    double cubeDecameterValue = 1.0;
    double cubeMeterValue = 1.0;
    double cubeDecimeterValue = 1.0;
    double cubeCentimeterValue = 1.0;
    double cubeMillimeterValue = 1.0;
    
    // Result Values
    Double cubeKilometerResult = 9.999999999999999E11;
    Double cubeHectometerResult = 1000000000.0;
    Double cubeDecameterResult = 1000000.0;
    Double cubeMeterResult = 1000.0;
    Double cubeDecimeterResult = 1.0;
    Double cubeCentimeterResult = 0.001;
    Double cubeMillimeterResult = 0.000001;;
    
    // Testing
    assertEquals(cubeKilometerResult, volume.toCubeDecimeter(cubeKilometerValue, Volume.CUBE_KILOMETER));
    
    assertEquals(cubeHectometerResult, volume.toCubeDecimeter(cubeHectometerValue, Volume.CUBE_HECTOMETER));
    
    assertEquals(cubeDecameterResult, volume.toCubeDecimeter(cubeDecameterValue, Volume.CUBE_DECAMETER));
    
    assertEquals(cubeMeterResult, volume.toCubeDecimeter(cubeMeterValue, Volume.CUBE_METER));
    
    assertEquals(cubeDecimeterResult, volume.toCubeDecimeter(cubeDecimeterValue, Volume.CUBE_DECIMETER));
    
    assertEquals(cubeCentimeterResult, volume.toCubeDecimeter(cubeCentimeterValue, Volume.CUBE_CENTIMETER));
    
    assertEquals(cubeMillimeterResult, volume.toCubeDecimeter(cubeMillimeterValue, Volume.CUBE_MILLIMETER));
  }
  
  
  // Test conversor from another units to meter 
  @Test
  public void toCubeCentimeterTest()
  {
    // Values to be testes
    double cubeKilometerValue = 1.0;
    double cubeHectometerValue = 1.0;
    double cubeDecameterValue = 1.0;
    double cubeMeterValue = 1.0;
    double cubeDecimeterValue = 1.0;
    double cubeCentimeterValue = 1.0;
    double cubeMillimeterValue = 1.0;
    
    // Result Values
    Double cubeKilometerResult = 1000000000000000.0;
    Double cubeHectometerResult = 1000000000000.0;
    Double cubeDecameterResult = 1000000000.0;
    Double cubeMeterResult = 1000000.0;
    Double cubeDecimeterResult = 1000.0;
    Double cubeCentimeterResult = 1.0;
    Double cubeMillimeterResult = 0.001;;
    
    // Testing
    assertEquals(cubeKilometerResult, volume.toCubeCentimeter(cubeKilometerValue, Volume.CUBE_KILOMETER));
    
    assertEquals(cubeHectometerResult, volume.toCubeCentimeter(cubeHectometerValue, Volume.CUBE_HECTOMETER));
    
    assertEquals(cubeDecameterResult, volume.toCubeCentimeter(cubeDecameterValue, Volume.CUBE_DECAMETER));
    
    assertEquals(cubeMeterResult, volume.toCubeCentimeter(cubeMeterValue, Volume.CUBE_METER));
    
    assertEquals(cubeDecimeterResult, volume.toCubeCentimeter(cubeDecimeterValue, Volume.CUBE_DECIMETER));
    
    assertEquals(cubeCentimeterResult, volume.toCubeCentimeter(cubeCentimeterValue, Volume.CUBE_CENTIMETER));
    
    assertEquals(cubeMillimeterResult, volume.toCubeCentimeter(cubeMillimeterValue, Volume.CUBE_MILLIMETER));
  }
  
  
   // Test conversor from another units to meter 
  @Test
  public void toCubeMillimeterTest()
  {
    // Values to be testes
    double cubeKilometerValue = 1.0;
    double cubeHectometerValue = 1.0;
    double cubeDecameterValue = 1.0;
    double cubeMeterValue = 1.0;
    double cubeDecimeterValue = 1.0;
    double cubeCentimeterValue = 1.0;
    double cubeMillimeterValue = 1.0;
    
    // Result Values
    Double cubeKilometerResult = 1000000000000000000.0;
    Double cubeHectometerResult = 1000000000000000.0;
    Double cubeDecameterResult = 1000000000000.0;
    Double cubeMeterResult = 1000000000.0;
    Double cubeDecimeterResult = 1000000.0;
    Double cubeCentimeterResult = 1000.0;
    Double cubeMillimeterResult = 1.0;
    
    // Testing
    assertEquals(cubeKilometerResult, volume.toCubeMillimeter(cubeKilometerValue, Volume.CUBE_KILOMETER));
    
    assertEquals(cubeHectometerResult, volume.toCubeMillimeter(cubeHectometerValue, Volume.CUBE_HECTOMETER));
    
    assertEquals(cubeDecameterResult, volume.toCubeMillimeter(cubeDecameterValue, Volume.CUBE_DECAMETER));
    
    assertEquals(cubeMeterResult, volume.toCubeMillimeter(cubeMeterValue, Volume.CUBE_METER));
    
    assertEquals(cubeDecimeterResult, volume.toCubeMillimeter(cubeDecimeterValue, Volume.CUBE_DECIMETER));
    
    assertEquals(cubeCentimeterResult, volume.toCubeMillimeter(cubeCentimeterValue, Volume.CUBE_CENTIMETER));
    
    assertEquals(cubeMillimeterResult, volume.toCubeMillimeter(cubeMillimeterValue, Volume.CUBE_MILLIMETER));
  }
}