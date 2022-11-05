package com.gabrielMJr.twaire.physic.muv;

import com.gabrielMJr.twaire.physic.MUVIF;
import com.gabrielMJr.twaire.physic.Physic;
import com.gabrielMJr.twaire.physic.muv.Acceleration1;
import com.gabrielMJr.twaire.physic.muv.Acceleration2;
import com.gabrielMJr.twaire.physic.muv.Acceleration3;
import com.gabrielMJr.twaire.physic.muv.Acceleration4;
import com.gabrielMJr.twaire.physic.muv.Speed1;
import com.gabrielMJr.twaire.physic.muv.Speed2;
import com.gabrielMJr.twaire.physic.muv.Speed3;
import com.gabrielMJr.twaire.physic.muv.Speed4;
import com.gabrielMJr.twaire.physic.muv.Time1;
import com.gabrielMJr.twaire.physic.muv.Time2;
import com.gabrielMJr.twaire.physic.muv.Time3;


public class MUV implements MUVIF {

  private static Physic physic;
  
  private static Acceleration1 acceleration1;
  private static Acceleration2 acceleration2;
  private static Acceleration3 acceleration3;
  private static Acceleration4 acceleration4;
  private static Speed1 speed1;
  private static Speed2 speed2;
  private static Speed3 speed3;
  private static Speed4 speed4;
  private static Time1 time1;
  private static Time2 time2;
  private static Time3 time3;
  
  public MUV()
  {
    physic = new Physic();
    
    acceleration1 = new Acceleration1();
    acceleration2 = new Acceleration2();
    acceleration3 = new Acceleration3();
    acceleration4 = new Acceleration4();
    speed1 = new Speed1();
    speed2 = new Speed2();
    speed3 = new Speed3 ();
    speed4 = new Speed4();
    time1 = new Time1();
    time2 = new Time2();
    time3 = new Time3();
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
            double step1 = delta_speed / acceleration;
            double step2 = step1 + initial_time;
            String res;
            
            if (stepOrResult == physic.GET_STEP) {
              
              res = "tf = "
                  + initial_time
                  + "s + ("
                  + delta_speed
                  + "m/s ÷ "
                  + acceleration
                  + "m/s²)"
                  + "\ntf = "
                  + initial_time
                  + "s + "
                  + step1
                  + "s"
                  +"\ntf = "
                  + step2
                  + "s";
                  
              return res;
              
            } else if (stepOrResult == physic.GET_RESULT) {
              
              return String.valueOf(step2);
               
            } else {
              return "Error 404: fourth parameter not found.";
            }
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
              double step1 = initial_speed * delta_time;
              double step11 = Math.pow(delta_time, 2);
              double step2 = initial_displacement + step1;
              double step22 = acceleration * step11;
              double step3 = step22 / 2;
              double step4 = step2 + step3;
              String res;
              
              if (stepOrResult == physic.GET_STEP) {
                
                res = "S = "
                    + initial_displacement
                    + "m + "
                    + initial_speed
                    + "m/s × "
                    + delta_time
                    + "s + ["
                    + acceleration
                    + "m/s² × ("
                    + delta_time
                    + "s)²] ÷ 2"
                    + "\nS = "
                    + initial_displacement
                    + "m + "
                    + step1
                    + "m + ("
                    + acceleration
                    + "m/s² × "
                    + step11
                    + "s²) ÷ 2"
                    + "\nS = "
                    + step2
                    + "m + ("
                    + step22
                    + " ÷ 2) (m×s²)/s²"
                    + "\nS = "
                    + step2
                    + "m + "
                    + step3
                    + "m"
                    + "\nS = "
                    + step4
                    + "m"
                    ;
                
                return res;
                
              } else if (stepOrResult == physic.GET_RESULT) {
               
                return String.valueOf(step4);
                
              } else {
                return "Error 404: fifth parameter not found.";
              }
            }
            
            
            // Initial displacement: Si = S - [(vi * ∆t) + (a * ∆t²) / 2]
            public String displacement2 (
              double initial_speed, 
              double delta_time, 
              double acceleration, 
              double displacement, 
              int stepOrResult)
              {
                double step1 = initial_speed * delta_time;
                double step11 = Math.pow (delta_time, 2);
                double step2 = acceleration * step11;
                double step3 = step2 / 2;
                double step4 = step1 + step3;
                double step5 = displacement - step4;
                String res;
                
                if (stepOrResult == physic.GET_STEP) {
                
                  res = "Si = "
                      + displacement
                      + "m - [("
                      + initial_speed 
                      + "m/s × "
                      + delta_time
                      + "s) + ["
                      + acceleration 
                      + "m/s² × ("
                      + delta_time
                      + "s)²] ÷ 2]"
                      + "\nSi = "
                      + displacement 
                      + "m - ["
                      + step1
                      + "m + ("
                      + acceleration
                      + "m/s² × "
                      + step11
                      + "s²) ÷ 2]"
                      + "\nSi = "
                      + displacement
                      + "m - ["
                      + step1
                      + "m + ("
                      + step2
                      + " ÷ 2)m]"
                      + "\nSi = "
                      + displacement 
                      + "m - ("
                      + step1
                      + "m + "
                      + step3
                      + "m)"
                      + "\nSi = "
                      + displacement 
                      + "m - "
                      + step4
                      + "m \nSi = "
                      + step5
                      + "m";
                      
                    return res;
                  
                } else if (stepOrResult == physic.GET_RESULT) {
                  
                  return String.valueOf(step5);
                  
                } else {
                
                  return "Error 404: fifth parameter not found.";
                }
                
              }
            
}
