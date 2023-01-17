package com.gabrielMJr.physic.units;

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
    double cube_kilometer_value = 1.0;
    double cube_hectometer_value = 1.0;
    double cube_decameter_value = 1.0;
    double cube_meter_value = 1.0;
    double cube_decimeter_value = 1.0;
    double cube_centimeter_value = 1.0;
    double cube_millimeter_value = 1.0;
    
    // Result Values
    Double cube_kilometer_result = 1.0;
    Double cube_hectometer_result = 0.001;
    Double cube_decameter_result = 0.000001;
    Double cube_meter_result = 0.000000001;
    Double cube_decimeter_result = 0.000000000001;
    Double cube_centimeter_result = 0.000000000000001;
    Double cube_millimeter_result = 0.000000000000000001;
    
    // Testing
    assertEquals(cube_kilometer_result, volume.toCubeKilometer(cube_kilometer_value, Volume.CUBE_KILOMETER));
    
    assertEquals(cube_hectometer_result, volume.toCubeKilometer(cube_hectometer_value, Volume.CUBE_HECTOMETER));
    
    assertEquals(cube_decameter_result, volume.toCubeKilometer(cube_decameter_value, Volume.CUBE_DECAMETER));
    
    assertEquals(cube_meter_result, volume.toCubeKilometer(cube_meter_value, Volume.CUBE_METER));
    
    assertEquals(cube_decimeter_result, volume.toCubeKilometer(cube_decimeter_value, Volume.CUBE_DECIMETER));
    
    assertEquals(cube_centimeter_result, volume.toCubeKilometer(cube_centimeter_value, Volume.CUBE_CENTIMETER));
    
    assertEquals(cube_millimeter_result, volume.toCubeKilometer(cube_millimeter_value, Volume.CUBE_MILLIMETER));
    
  }
  
  
  // Test conversor from another units to hectometer 
  @Test
  public void toCubeHectometerTest()
  {
    // Values to be testes
    double cube_kilometer_value = 1.0;
    double cube_hectometer_value = 1.0;
    double cube_decameter_value = 1.0;
    double cube_meter_value = 1.0;
    double cube_decimeter_value = 1.0;
    double cube_centimeter_value = 1.0;
    double cube_millimeter_value = 1.0;
    
    // Result Values
    Double cube_kilometer_result = 999.9999999999999;
    Double cube_hectometer_result = 1.0;
    Double cube_decameter_result = 0.001;
    Double cube_meter_result = 0.000001;
    Double cube_decimeter_result = 0.0000000009999999999999999;
    Double cube_centimeter_result = 0.000000000001;
    Double cube_millimeter_result = 0.0000000000000009999999999999999;
    
    // Testing
    assertEquals(cube_kilometer_result, volume.toCubeHectometer(cube_kilometer_value, Volume.CUBE_KILOMETER));
    
    assertEquals(cube_hectometer_result, volume.toCubeHectometer(cube_hectometer_value, Volume.CUBE_HECTOMETER));
    
    assertEquals(cube_decameter_result, volume.toCubeHectometer(cube_decameter_value, Volume.CUBE_DECAMETER));
    
    assertEquals(cube_meter_result, volume.toCubeHectometer(cube_meter_value, Volume.CUBE_METER));
    
    assertEquals(cube_decimeter_result, volume.toCubeHectometer(cube_decimeter_value, Volume.CUBE_DECIMETER));
    
    assertEquals(cube_centimeter_result, volume.toCubeHectometer(cube_centimeter_value, Volume.CUBE_CENTIMETER));
    
    assertEquals(cube_millimeter_result, volume.toCubeHectometer(cube_millimeter_value, Volume.CUBE_MILLIMETER));
  }
}