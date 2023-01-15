package com.gabrielMJr.physic.units;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeTest
{
  // Time Object
  private Time time;
  
  // Constructor
  public TimeTest()
  {
    // Initialize the variable
    time = Time.getInstance();
  }
  
  
  // Test conversor from another units to second
  @Test
  public void toSecondTest()
  {
    // Values to be testes
    double second_value = 60.0;
    double minute_value = 60.0;
    double hour_value = 24.0;
    double week_value = 1.0;
    
    // Result Values
    Double second_result = 60.0;
    Double minute_result = 3600.0;
    Double hour_result = 86400.0;
    Double week_result = 604800.0;
    
    // Testing
    assertEquals(second_result, time.toSecond(second_value, Time.SECOND));
    
    assertEquals(minute_result, time.toSecond(minute_value, Time.MINUTE));
    
    assertEquals(hour_result, time.toSecond(hour_value, Time.HOUR));
    
    assertEquals(week_result, time.toSecond(week_value, Time.WEEK));
  }
  
}