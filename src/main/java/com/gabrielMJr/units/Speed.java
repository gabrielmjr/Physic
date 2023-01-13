package com.gabrielMJr.physic.units;

import com.gabrielMJr.physic.units.Distance;
import com.gabrielMJr.physic.units.Time;

public class Speed implements SpeedIF
{

  private final Distance distance = new Distance();
  private final Time time = new Time();

  // Those constants were used to tell to the program the unit that must use to calculate something
  // Also used to tell the unit from the variables as parameter
  // For distance per second
  public static final String KILOMETER_PER_SECOND = "0.001/1";
  public static final String HECTOMETER_PER_SECOND = "0.01/1";
  public static final String DECAMETER_PER_SECOND = "0.1/1";
  public static final String METER_PER_SECOND = "1/1";
  public static final String DECIMETER_PER_SECOND = "10/1";
  public static final String CENTIMETER_PER_SECOND = "100/1";
  public static final String MILLIMETER_PER_SECOND = "1000/1";
  
  // Distance per minute
  public static final String KILOMETER_PER_MINUTE = "0.001/0.016666666666666666";
  public static final String HECTOMETER_PER_MINUTE = "0.01/0.016666666666666666";
  public static final String DECAMETER_PER_MINUTE = "0.1/0.016666666666666666";
  public static final String METER_PER_MINUTE = "1/0.016666666666666666";
  public static final String DECIMETER_PER_MINUTE = "10/0.016666666666666666";
  public static final String CENTIMETER_PER_MINUTE = "100/0.016666666666666666";
  public static final String MILLIMETER_PER_MINUTE = "1000/0.016666666666666666";
  
  // Distance per hour
  public static final String KILOMETER_PER_HOUR = "0.001/0.0002777777777777778";
  public static final String HECTOMETER_PER_HOUR = "0.01/0.0002777777777777778";
  public static final String DECAMETER_PER_HOUR = "0.1/0.0002777777777777778";
  public static final String METER_PER_HOUR = "1/0.0002777777777777778";
  public static final String DECIMETER_PER_HOUR = "10/0.0002777777777777778";
  public static final String CENTIMETER_PER_HOUR = "100/0.0002777777777777778";
  public static final String MILLIMETER_PER_HOUR = "1000/0.0002777777777777778";
  
  // Converter
  // From anothers to second
  // From anothers to kilometer
  @Override
  public Double toKilometerPerSecond(double value, String unit)
  {
    String[] units = unit.split("/");
    
    Double new_distance = distance.toKilometer(value, units[0]);
    Double new_time = time.toSecond(1.0, units[1]);
    return new_distance / new_time;
  }
  
  // From anothers to hectometer
  @Override
  public Double toHectometerPerSecond(double value, String unit)
  {
    String[] units = unit.split("/");
    
    Double new_distance = distance.toHectometer(value, units[0]);
    Double new_time = time.toSecond(1.0, units[1]);
    return new_distance / new_time;
  }
  
  // From anothers to decameter
  @Override
  public Double toDecameterPerSecond(double value, String unit)
  {
    String[] units = unit.split("/");
    
    Double new_distance = distance.toDecameter(value, units[0]);
    Double new_time = time.toSecond(1.0, units[1]);
    return new_distance / new_time;
  }
  
  // From anothers to meter
  @Override
  public Double toMeterPerSecond(double value, String unit)
  {
    String[] units = unit.split("/");
    
    Double new_distance = distance.toMeter(value, units[0]);
    Double new_time = time.toSecond(1.0, units[1]);
    return new_distance / new_time;
  }
  
  // From anothers to decimeter
  @Override
  public Double toDecimeterPerSecond(double value, String unit)
  {
    String[] units = unit.split("/");
    
    Double new_distance = distance.toDecimeter(value, units[0]);
    Double new_time = time.toSecond(1.0, units[1]);
    return new_distance / new_time;
  }
  
  // From anothers to centimeter
  @Override
  public Double toCentimeterPerSecond(double value, String unit)
  {
    String[] units = unit.split("/");
    
    Double new_distance = distance.toCentimeter(value, units[0]);
    Double new_time = time.toSecond(1.0, units[1]);
    return new_distance / new_time;
  }
  
  // From anothers to millimeter
  @Override
  public Double toMillimeterPerSecond(double value, String unit)
  {
    String[] units = unit.split("/");
    
    Double new_distance = distance.toMillimeter(value, units[0]);
    Double new_time = time.toSecond(1.0, units[1]);
    return new_distance / new_time;
  }
  
  
  
  // From anothers to minute
  // From anothers to kilometer
  @Override
  public Double toKilometerPerMinute(double value, String unit)
  {
    String[] units = unit.split("/");
    
    Double new_distance = distance.toKilometer(value, units[0]);
    Double new_time = time.toMinute(1.0, units[1]);
    return new_distance / new_time;
  }
  
  // From anothers to hectometer
  @Override
  public Double toHectometerPerMinute(double value, String unit)
  {
    String[] units = unit.split("/");
    
    Double new_distance = distance.toHectometer(value, units[0]);
    Double new_time = time.toMinute(1.0, units[1]);
    return new_distance / new_time;
  }
  
  // From anothers to decameter
  @Override
  public Double toDecameterPerMinute(double value, String unit)
  {
    String[] units = unit.split("/");
    
    Double new_distance = distance.toDecameter(value, units[0]);
    Double new_time = time.toMinute(1.0, units[1]);
    return new_distance / new_time;
  }
  
  // From anothers to meter
  @Override
  public Double toMeterPerMinute(double value, String unit)
  {
    String[] units = unit.split("/");
    
    Double new_distance = distance.toMeter(value, units[0]);
    Double new_time = time.toMinute(1.0, units[1]);
    return new_distance / new_time;
  }
  
  // From anothers to decimeter
  @Override
  public Double toDecimeterPerMinute(double value, String unit)
  {
    String[] units = unit.split("/");
    
    Double new_distance = distance.toDecimeter(value, units[0]);
    Double new_time = time.toMinute(1.0, units[1]);
    return new_distance / new_time;
  }
  
  // From anothers to centimeter
  @Override
  public Double toCentimeterPerMinute(double value, String unit)
  {
    String[] units = unit.split("/");
    
    Double new_distance = distance.toCentimeter(value, units[0]);
    Double new_time = time.toMinute(1.0, units[1]);
    return new_distance / new_time;
  }
  
  // From anothers to millimeter
  @Override
  public Double toMillimeterPerMinute(double value, String unit)
  {
    String[] units = unit.split("/");
    
    Double new_distance = distance.toMillimeter(value, units[0]);
    Double new_time = time.toMinute(1.0, units[1]);
    return new_distance / new_time;
  }
  
  
  
  // From anothers to hour
  // From anothers to kilometer
  @Override
  public Double toKilometerPerHour(double value, String unit)
  {
    String[] units = unit.split("/");
    
    Double new_distance = distance.toKilometer(value, units[0]);
    Double new_time = time.toHour(1.0, units[1]);
    return new_distance / new_time;
  }
  
  // From anothers to hectometer
  @Override
  public Double toHectometerPerHour(double value, String unit)
  {
    String[] units = unit.split("/");
    
    Double new_distance = distance.toHectometer(value, units[0]);
    Double new_time = time.toHour(1.0, units[1]);
    return new_distance / new_time;
  }
  
  // From anothers to decameter
  @Override
  public Double toDecameterPerHour(double value, String unit)
  {
    String[] units = unit.split("/");
    
    Double new_distance = distance.toDecameter(value, units[0]);
    Double new_time = time.toHour(1.0, units[1]);
    return new_distance / new_time;
  }
  
  // From anothers to meter
  @Override
  public Double toMeterPerHour(double value, String unit)
  {
    String[] units = unit.split("/");
    
    Double new_distance = distance.toMeter(value, units[0]);
    Double new_time = time.toHour(1.0, units[1]);
    return new_distance / new_time;
  }
  
  // From anothers to decimeter
  @Override
  public Double toDecimeterPerHour(double value, String unit)
  {
    String[] units = unit.split("/");
    
    Double new_distance = distance.toDecimeter(value, units[0]);
    Double new_time = time.toHour(1.0, units[1]);
    return new_distance / new_time;
  }
  
  // From anothers to centimeter
  @Override
  public Double toCentimeterPerHour(double value, String unit)
  {
    String[] units = unit.split("/");
    
    Double new_distance = distance.toCentimeter(value, units[0]);
    Double new_time = time.toHour(1.0, units[1]);
    return new_distance / new_time;
  }
  
  // From anothers to millimeter
  @Override
  public Double toMillimeterPerHour(double value, String unit)
  {
    String[] units = unit.split("/");
    
    Double new_distance = distance.toMillimeter(value, units[0]);
    Double new_time = time.toHour(1.0, units[1]);
    return new_distance / new_time;
  }
}
