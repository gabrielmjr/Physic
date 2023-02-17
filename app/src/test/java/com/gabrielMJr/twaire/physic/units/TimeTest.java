package com.gabrielMJr.twaire.physic.units;

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
    double secondValue = 60.0;
    double minuteValue = 60.0;
    double hourValue = 24.0;
    double dayValue = 7.0;
    double weekValue = 1.0;
    
    // Result Values
    Double secondResult = 60.0;
    Double minuteResult = 3600.0;
    Double hourResult = 86400.0;
    Double dayResult = 604800.0;
    Double weekResult = 604800.0;
    
    // Testing
    assertEquals(secondResult, time.toSecond(secondValue, Time.SECOND));
    
    assertEquals(minuteResult, time.toSecond(minuteValue, Time.MINUTE));
    
    assertEquals(hourResult, time.toSecond(hourValue, Time.HOUR));
    
    assertEquals(weekResult, time.toSecond(weekValue, Time.WEEK));
  }
  
  
  // Test conversor from another units to minute
  @Test
  public void toMinuteTest()
  {
    // Values to be testes
    double secondValue = 60.0;
    double minuteValue = 60.0;
    double hourValue = 24.0;
    double dayValue = 1.0;
    double weekValue = 1.0;
    
    // Result Values
    Double secondResult = 1.0;
    Double minuteResult = 60.0;
    Double hourResult = 1440.0;
    Double dayResult = 10080.0;
    Double weekResult = 10080.0;
    
    // Testing
    assertEquals(secondResult, time.toMinute(secondValue, Time.SECOND));
    
    assertEquals(minuteResult, time.toMinute(minuteValue, Time.MINUTE));
    
    assertEquals(hourResult, time.toMinute(hourValue, Time.HOUR));
    
    assertEquals(weekResult, time.toMinute(weekValue, Time.WEEK));
  }
  
  
  // Test conversor from another units to hour
  @Test
  public void toHourTest()
  {
    // Values to be testes
    double secondValue = 60.0;
    double minuteValue = 60.0;
    double hourValue = 24.0;
    double dayValue = 1.0;
    double weekValue = 1.0;
    
    // Result Values
    Double secondResult = 0.016666666666666666;
    Double minuteResult = 1.0;
    Double hourResult = 24.0;
    Double dayResult = 168.0; 
    Double weekResult = 168.0;
    
    // Testing
    assertEquals(secondResult, time.toHour(secondValue, Time.SECOND));
    
    assertEquals(minuteResult, time.toHour(minuteValue, Time.MINUTE));
    
    assertEquals(hourResult, time.toHour(hourValue, Time.HOUR));
    
    assertEquals(weekResult, time.toHour(weekValue, Time.WEEK));
  }
  
  
  // Test conversor from another units to week
  @Test
  public void toWeekTest()
  {
    // Values to be testes
    double secondValue = 60.0;
    double minuteValue = 60.0;
    double hourValue = 24.0;
    double dayValue = 1.0;
    double weekValue = 1.0;
    
    // Result Values
    Double secondResult = 9.92063492063492E-05;
    Double minuteResult = 0.005952380952380952;
    Double hourResult = 0.14285714285714285;
    Double dayResult = 1.0;
    Double weekResult = 1.0;
    
    // Testing
    assertEquals(secondResult, time.toWeek(secondValue, Time.SECOND));
    
    assertEquals(minuteResult, time.toWeek(minuteValue, Time.MINUTE));
    
    assertEquals(hourResult, time.toWeek(hourValue, Time.HOUR));
    
    assertEquals(weekResult, time.toWeek(weekValue, Time.WEEK));
  }
  
}