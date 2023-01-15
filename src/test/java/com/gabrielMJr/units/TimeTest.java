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
    double day_value = 7.0;
    double week_value = 1.0;
    
    // Result Values
    Double second_result = 60.0;
    Double minute_result = 3600.0;
    Double hour_result = 86400.0;
    Double day_result = 604800.0;
    Double week_result = 604800.0;
    
    // Testing
    assertEquals(second_result, time.toSecond(second_value, Time.SECOND));
    
    assertEquals(minute_result, time.toSecond(minute_value, Time.MINUTE));
    
    assertEquals(hour_result, time.toSecond(hour_value, Time.HOUR));
    
    assertEquals(week_result, time.toSecond(week_value, Time.WEEK));
  }
  
  
  // Test conversor from another units to minute
  @Test
  public void toMinuteTest()
  {
    // Values to be testes
    double second_value = 60.0;
    double minute_value = 60.0;
    double hour_value = 24.0;
    double day_value = 1.0;
    double week_value = 1.0;
    
    // Result Values
    Double second_result = 1.0;
    Double minute_result = 60.0;
    Double hour_result = 1440.0;
    Double day_result = 10080.0;
    Double week_result = 10080.0;
    
    // Testing
    assertEquals(second_result, time.toMinute(second_value, Time.SECOND));
    
    assertEquals(minute_result, time.toMinute(minute_value, Time.MINUTE));
    
    assertEquals(hour_result, time.toMinute(hour_value, Time.HOUR));
    
    assertEquals(week_result, time.toMinute(week_value, Time.WEEK));
  }
  
  
  // Test conversor from another units to hour
  @Test
  public void toHourTest()
  {
    // Values to be testes
    double second_value = 60.0;
    double minute_value = 60.0;
    double hour_value = 24.0;
    double day_value = 1.0;
    double week_value = 1.0;
    
    // Result Values
    Double second_result = 0.016666666666666666;
    Double minute_result = 1.0;
    Double hour_result = 24.0;
    Double day_result = 168.0; 
    Double week_result = 168.0;
    
    // Testing
    assertEquals(second_result, time.toHour(second_value, Time.SECOND));
    
    assertEquals(minute_result, time.toHour(minute_value, Time.MINUTE));
    
    assertEquals(hour_result, time.toHour(hour_value, Time.HOUR));
    
    assertEquals(week_result, time.toHour(week_value, Time.WEEK));
  }
  
  
  // Test conversor from another units to week
  @Test
  public void toWeekTest()
  {
    // Values to be testes
    double second_value = 60.0;
    double minute_value = 60.0;
    double hour_value = 24.0;
    double day_value = 1.0;
    double week_value = 1.0;
    
    // Result Values
    Double second_result = 9.92063492063492E-05;
    Double minute_result = 0.005952380952380952;
    Double hour_result = 0.14285714285714285;
    Double day_result = 1.0;
    Double week_result = 1.0;
    
    // Testing
    assertEquals(second_result, time.toWeek(second_value, Time.SECOND));
    
    assertEquals(minute_result, time.toWeek(minute_value, Time.MINUTE));
    
    assertEquals(hour_result, time.toWeek(hour_value, Time.HOUR));
    
    assertEquals(week_result, time.toWeek(week_value, Time.WEEK));
  }
  
}