package com.gabrielMJr.physic.kinematics.muv;

public class MUV implements MUVIF 
{
  private static MUV instance;
  
  private Acceleration1 acceleration1;
  private Acceleration2 acceleration2;
  private Acceleration3 acceleration3;
  private Acceleration4 acceleration4;
  
  private Speed1 speed1;
  private Speed2 speed2;
  private Speed3 speed3;
  private Speed4 speed4;
  
  private Time1 time1;
  private Time2 time2;
  private Time3 time3;
  private Time4 time4;
  
  private Displacement1 displacement1;
  private Displacement2 displacement2;
  
  public MUV()
  {
    acceleration1 = Acceleration1.getInstance();
    acceleration2 = Acceleration2.getInstance();
    acceleration3 = Acceleration3.getInstance();
    acceleration4 = Acceleration4.getInstance();
    
    speed1 = Speed1.getInstance();
    speed2 = Speed2.getInstance();
    speed3 = Speed3.getInstance();
    speed4 = Speed4.getInstance();
    
    time1 = Time1.getInstance();
    time2 = Time2.getInstance();
    time3 = Time3.getInstance();
    time4 = Time4.getInstance();
    
    displacement1 = Displacement1.getInstance();
    displacement2 = Displacement2.getInstance();
  }


  // MUR, primeira fórmula de aceleração: a = delta_speed / delta_time
  @Override
  public String acceleration1(
    double deltaSpeed, 
    double deltaTime)
   {
  
    return acceleration1.acceleration(
    deltaSpeed,
    deltaTime);
  }
  
  @Override
  public String acceleration1(
    double deltaSpeed, 
    String deltaSpeed_unit,
    double deltaTime,
    String deltaTime_unit,
    String unit_of_result)
    {
  
      return acceleration1.acceleration(
        deltaSpeed,
        deltaSpeed_unit,
        deltaTime,
        deltaTime_unit,
        unit_of_result);
  }

  // Segunda fórmula de aceleração: a = (deltaSpeed) / (finalTime - initialTime)
  @Override
  public String acceleration2(
    double deltaSpeed,
    double initialTime,
    double finalTime,
    int resultOrStep)
  {
    
    return acceleration2.acceleration(
      deltaSpeed,
      initialTime,
      finalTime,
      resultOrStep);
  }
  
  @Override
  public String acceleration2(
    double deltaSpeed,
    String deltaSpeed_unit,
    double initialTime,
    String initialTime_unit,
    double finalTime,
    String finalTime_unit,
    String unit_of_result,
    int resultOrStep)
   {
    
    return acceleration2.acceleration(
      deltaSpeed,
      initialTime,
      finalTime,
      resultOrStep);
  }
  
  // Third formula of acceleration, when: a = (vf - vi) / variation_time
  @Override
  public String acceleration3 (
    double initial_speed,
    double final_speed, 
    double variation_time,
    int stepOrResult)
    {
        
    return acceleration3.acceleration(
      initial_speed,
      final_speed,
      variation_time,
      stepOrResult);
    }
  
  @Override 
  public String acceleration3 (
    double initial_speed, 
    String initial_speed_unit, 
    double final_speed, 
    String final_speed_unit, 
    double variation_time, 
    String variation_time_unit, 
    String unit_of_result, 
    int stepOrResult)
    {
    
    return acceleration3.acceleration(
      initial_speed,
      initial_speed_unit,
      final_speed,
      final_speed_unit,
      variation_time, 
      variation_time_unit,
      unit_of_result,
      stepOrResult);
  }
 
  
  // Forth acceleration formula when:
  // a = (final_speed - initial_speed) ÷ (final_time - initial_time)
  @Override
  public String acceleration4 (
    double initial_speed,
    double final_speed,
    double initial_time,
    double final_time,
    int stepOrResult)
    {
    
      return acceleration4.acceleration(
      initial_speed,
      final_speed,
      initial_time,
      final_time,
      stepOrResult);
    }
    
  @Override
  public String acceleration4 (
    double initial_speed, 
    String initial_speed_unit, 
    double final_speed, 
    String final_speed_unit, 
    double initial_time, 
    String initial_time_unit, 
    double final_time, 
    String final_time_unit,
    String unit_of_result, 
    int stepOrResult)
    {
      
      return acceleration4.acceleration(
        initial_speed,
        initial_speed_unit,
        final_speed,
        final_speed_unit,
        initial_time,
        initial_time_unit,
        final_time,
        final_time_unit,
        unit_of_result,
        stepOrResult);
    }
    
    // Speed
    // First speed's formula: ∆v = ∆t * a
  @Override
  public String speed1 (
    double delta_time, 
    double acceleration) {
    
      return speed1.speed(
        delta_time,
        acceleration);
    }
    
  @Override
  public String speed1 (
    double delta_time,
    String delta_time_unit,
    double acceleration,
    String acceleration_unit,
    String unit_of_result) {
    
      return speed1.speed(
        delta_time,
        delta_time_unit,
        acceleration,
        acceleration_unit,
        unit_of_result);
    }
    
    
    // Second speed's formula: ∆v = (tf - ti) * acceleration
  @Override
  public String speed2 (
    double initial_time,
    double final_time, 
    double acceleration,
    int stepOrResult)
    {
      
      return speed2.speed(
        initial_time,
        final_time,
        acceleration,
        stepOrResult);
    }
      
  @Override
  public String speed2 (
      double initial_time,
    String initial_time_unit,
      double final_time, 
    String final_time_unit,
      double acceleration,
      String acceleration_unit,
      String unit_of_result,
      int stepOrResult)
      {
      
        return speed2.speed(
        initial_time,
        initial_time_unit,
        final_time,
        final_time_unit,
        acceleration,
        acceleration_unit,
        unit_of_result,
        stepOrResult);
      }
    
      
      
  // Initial speed: vi = vf - ∆t * a
  @Override
  public String speed3 (
    double final_speed,
    double delta_time,
    double acceleration,
    int stepOrResult) 
    {
        
      return speed3.speed(
        final_speed,
        delta_time,
        acceleration,
        stepOrResult);
      }
      
  @Override
  public String speed3 (
    double final_speed, 
    String final_speed_unit,
    double delta_time, 
    String delta_time_unit,
    double acceleration,  
    String acceleration_unit,
    String unit_of_result,
    int stepOrResult)
    {
      
      return speed3.speed(
        final_speed,
        final_speed_unit,
        delta_time,
        delta_time_unit,
        acceleration,
        acceleration_unit,
        unit_of_result,
        stepOrResult);
    }
      
      
  // Final speed: vf = ∆t * a + vi
  @Override
  public String speed4 (
    double initial_speed,
    double delta_time,
    double acceleration,
    int stepOrResult) 
    {
         
      return speed4.speed(
        initial_speed,
        delta_time,
        acceleration,
        stepOrResult);
    }
      
  // 
  @Override
  public String speed4 (
      double initial_speed, 
      String initial_speed_unit,
      double delta_time, 
      String delta_time_unit,
      double acceleration, 
      String acceleration_unit,
      String unit_of_result,
      int stepOrResult)
    {
      
      return speed4.speed(
        initial_speed,
        initial_speed_unit,
        delta_time,
        delta_time_unit,
        acceleration,
        acceleration_unit,
        unit_of_result,
        stepOrResult);
    }
      
      
  // Time
  // First variation of time: ∆t = ∆v / acceleration
  @Override
  public String time1 (
    double delta_speed, 
    double acceleration) 
    {
      
    return time1.time(
      delta_speed,
      acceleration);
  }
    
  @Override  
  public String time1 (
    double delta_speed,
    String delta_speed_unit, 
    double acceleration,
    String acceleration_unit,
    String unit_of_result)
    {
      
      return time1.time(
        delta_speed,
        delta_speed_unit,
        acceleration,
        acceleration_unit,
        unit_of_result);
      
    }
      
      
  // Second variation of time: ∆t = (vf - vi) / acceleration 
  @Override
  public String time2 (
    double initial_speed, 
    double final_speed,
    double acceleration,
    int stepOrResult) 
    {
          
      return time2.time(
        initial_speed,
        final_speed,
        acceleration,
        stepOrResult);
    }
        
    @Override
    public String time2 (
    double initial_speed, 
    String initial_speed_unit,
    double final_speed, 
    String final_speed_unit,
    double acceleration,
    String acceleration_unit,
    String unit_of_result,
    int stepOrResult)
    {
      return time2.time(
        initial_speed,
        initial_speed_unit,
        final_speed,
        final_speed_unit,
        acceleration,
        acceleration_unit,
        unit_of_result,
        stepOrResult);
    }
        
        
  // Initial time: ti = tf - ∆v / a
  @Override
  public String time3 (
    double final_time,
    double delta_speed,
    double acceleration,
    int stepOrResult)
    {
            
      return time3.time(
        final_time,
        delta_speed,
        acceleration,
        stepOrResult);
      }
          
  @Override
  public String time3 (
    double final_time,
    String final_time_unit,
    double delta_speed, 
    String delta_speed_unit,
    double acceleration, 
    String acceleration_unit,
    String unit_of_result,
    int stepOrResult) 
    {
      return time3.time(
        final_time,
        final_time_unit,
        delta_speed,
        delta_speed_unit,
        acceleration,
        acceleration_unit,
        unit_of_result,
        stepOrResult);
    }
          
          
  // Final time: tf = (∆v / a) + ti
  @Override
  public String time4 (
    double initial_time, 
    double delta_speed, 
    double acceleration, 
    int stepOrResult)
    {
            
    return time4.time(
      initial_time,
      delta_speed,
      acceleration,
      stepOrResult);
  }
  
  @Override
  public String time4 (
    double initial_time, 
    String initial_time_unit,
    double delta_speed, 
    String delta_speed_unit,
    double acceleration,
    String acceleration_unit,
    String unit_of_result,
    int stepOrResult)
    {
      
      return time4.time(
        initial_time,
        initial_time_unit,
        delta_speed,
        delta_speed_unit,
        acceleration,
        acceleration_unit,
        unit_of_result,
        stepOrResult);
    }
          
          
          
  // Displacement 
  // total Displacement: S = si + vi * ∆t + (a * ∆t²) /2
  @Override
  public String displacement1 (
    double initial_displacement,
    double initial_speed,
    double delta_time,
    double acceleration,
    int stepOrResult) 
    {
             
      return displacement1.displacement(
        initial_displacement,
        initial_speed,
        delta_time,
        acceleration,
        stepOrResult);
     }
     
  @Override
  public String displacement1 (
    double initial_displacement,
    String initial_displacement_unit,
    double initial_speed,
    String initial_speed_unit,
    double delta_time,
    String delta_time_unit,
    double acceleration,
    String acceleration_unit,
    String unit_of_result,
    int stepOrResult) 
    {
             
      return displacement1.displacement(
        initial_displacement,
        initial_displacement_unit,
        initial_speed,
        initial_speed_unit,
        delta_time,
        delta_time_unit,
        acceleration,
        acceleration_unit,
        unit_of_result,
        stepOrResult);
     }
            
            
  // Initial displacement: Si = S - [(vi * ∆t) + (a * ∆t²) / 2]
  @Override
  public String displacement2 (
    double initial_speed, 
    double delta_time, 
    double acceleration, 
    double displacement, 
    int stepOrResult)
    {
      return displacement2.displacement(
        initial_speed,
        delta_time,
        acceleration,
        displacement,
        stepOrResult);
    }
    
  @Override
  public String displacement2 (
    double initial_speed, 
    String initial_speed_unit,
    double delta_time, 
    String delta_time_unit,
    double acceleration, 
    String acceleration_unit,
    double displacement, 
    String displacement_unit,
    String unit_of_result,
    int stepOrResult)
    {
      return displacement2.displacement(
        initial_speed,
        initial_speed_unit,
        delta_time,
        delta_time_unit,
        acceleration,
        acceleration_unit,
        displacement,
        displacement_unit,
        unit_of_result,
        stepOrResult);
    }
    
    
    // Get class instance object
    protected static MUV getInstance()
    {
      if(instance == null)
      {
        instance = new MUV();
      }
      
      return instance;
    }
}
