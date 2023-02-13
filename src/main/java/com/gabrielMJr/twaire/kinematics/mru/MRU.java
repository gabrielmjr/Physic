package com.gabrielMJr.twaire.physic.kinematics.mru;
 
public class MRU implements MRUIF 
{
  // This object variable
  private static MRU instance; 

  private Displacement1 displacement1;
  private Displacement2 displacement2;
  private Displacement3 displacement3;
  private Displacement4 displacement4;
  private Displacement5 displacement5;
  private Displacement6 displacement6;
  
  private Speed1 speed1;
  private Speed2 speed2;
  private Speed3 speed3;
  private Speed4 speed4;
  
  private Time1 time1;
  private Time2 time2;
  private Time3 time3;
  private Time4 time4;
  private Time5 time5;
  
  public MRU()
  {
    displacement1 = Displacement1.getInstance();
    displacement2 = Displacement2.getInstance();
    displacement3 = Displacement3.getInstance();
    displacement4 = Displacement4.getInstance();
    displacement5 = Displacement5.getInstance();
    displacement6 = Displacement6.getInstance();
    
    speed1 = Speed1.getInstance();
    speed2 = Speed2.getInstance();
    speed3 = Speed3.getInstance();
    speed4 = Speed4.getInstance();
    
    time1 = Time1.getInstance();
    time2 = Time2.getInstance();
    time3 = Time3.getInstance();
    time4 = Time4.getInstance();
    time5 = Time5.getInstance();
  }

  /* Displacement */
  // Displacement1/delta_displacement: ∆S = Sf - Si
  @Override
  public String displacement1(
    double initial_displacement, 
    double final_displacement) 
  {
    return displacement1.displacement(
      initial_displacement,
      final_displacement);
  }
  
  @Override
  public String displacement1(
    double initial_displacement,
    String initial_displacement_unit, 
    double final_displacement,
    String final_displacement_unit,
    String unit_of_result)
  {
      return displacement1.displacement(
        initial_displacement,
        initial_displacement_unit,
        final_displacement,
        final_displacement_unit,
        unit_of_result);
  }
  
  // Displacement2/delta_displacement: ∆S = ∆t x speed_média
  @Override
  public String displacement2(
    double variation_time, 
    double media_speed)
  {
    return displacement2.displacement(
      variation_time,
      media_speed);
  }
  
  @Override
  public String displacement2(
    double variation_time,
    String variation_time_unit, 
    double media_speed,
    String media_speed_unit,
    String unit_of_result)
  {
    return displacement2.displacement(
      variation_time,
      variation_time_unit,
      media_speed,
      media_speed_unit,
      unit_of_result);
  }
  
  // Displacement3/delta_displacement: ∆S = (final_time - initial_time) x media_speed
  @Override
  public String displacement3(
    double initial_time,
    double final_time,
    double media_speed,
    int resultOrStep)
  {
    return displacement3.displacement(
      initial_time,
      final_time,
      media_speed,
      resultOrStep);
  }
  
   @Override
  public String displacement3(
    double initial_time,
    String initial_time_unit,
    double final_time,
    String final_time_unit,
    double media_speed,
    String media_speed_unit,
    String unit_of_result,
    int resultOrStep)
  {
    return displacement3.displacement(
      initial_time,
      initial_time_unit,
      final_time,
      final_time_unit,
      media_speed,
      media_speed_unit,
      unit_of_result,
      resultOrStep);
  }

  // Displacement4/initial_displacement: S_inicial = S_final - ∆S
  @Override
  public String displacement4(
    double variation_displacement,
    double final_displacement) 
  {
    return displacement4.displacement(
      variation_displacement,
      final_displacement);
  }
  
  @Override
  public String displacement4(
    double variation_displacement,
    String variation_displacement_unit,
    double final_displacement,
    String final_displacement_unit,
    String unit_of_result) 
  {
    return displacement4.displacement(
      variation_displacement,
      variation_displacement_unit,
      final_displacement,
      final_displacement_unit,
      unit_of_result);
  }

  // Displacement5/final_displacement: S_final = S_inicial + ∆S
  @Override
  public String displacement5(
    double initial_displacement, 
    double variation_displacement)
  {
    return displacement5.displacement(
      initial_displacement,
      variation_displacement);
  }
  
  @Override
  public String displacement5(
    double initial_displacement, 
    String initial_displacement_unit,
    double variation_displacement,
    String variation_displacement_unit,
    String unit_of_result)
  {
    return displacement5.displacement(
      initial_displacement,
      initial_displacement_unit,
      variation_displacement,
      variation_displacement_unit,
      unit_of_result);
  }

  // Displacement6/displacement_law: S = S_inicial + speed * ∆t
  @Override
  public String displacement6(
    double initial_displacement,
    double speed,
    double variation_time,
    int stepOrResult) 
  {
    return displacement6.displacement(
      initial_displacement,
      speed,
      variation_time,
      stepOrResult);
  }
    
  @Override
  public String displacement6(
    double initial_displacement,
    String initial_displacement_unit,
    double speed,
    String speed_unit,
    double variation_time,
    String variation_time_unit,
    String unit_of_result,
    int stepOrResult) 
  {
    return displacement6.displacement(
      initial_displacement,
      initial_displacement_unit,
      speed,
      speed_unit,
      variation_time,
      variation_time_unit,
      unit_of_result,
      stepOrResult);
  }

  /* speed */
  /* Speed1/speed_law: v = ∆S / ∆t
   * Nota: On MRU, media speed and speed law uses the same formula */
  @Override
  public String speed1(
    double variation_displacement,
    double variation_time)
  {
    return speed1.speed1(
      variation_displacement,
      variation_time);
  }
  
  @Override
  public String speed1(
    double variation_displacement,
    String variation_displacement_unit,
    double variation_time,
    String variation_time_unit,
    String unit_of_result)
  {
    return speed1.speed1(
      variation_displacement,
      variation_displacement_unit,
      variation_time,
      variation_time_unit,
      unit_of_result);
  }

  /* Displacement2/speed_law:
   * v = (final_displacement - initial_displacement) / (final_time - initial_time) */
  @Override
  public String speed2(
    double initial_displacement,
    double final_displacement,
    double initial_time,
    double final_time,
    int resultOrStep) 
  {
    return  speed2.speed(
      initial_displacement,
      final_displacement,
      initial_time,
      final_time,
      resultOrStep);
  }
  
    @Override
  public String speed2(
    double initial_displacement,
    String initial_displacement_unit,
    double final_displacement,
    String final_displacement_unit,
    double initial_time,
    String initial_time_unit,
    double final_time,
    String final_time_unit,
    String unit_of_result,
    int resultOrStep) 
  {
    return speed2.speed(
      initial_displacement,
      initial_displacement_unit,
      final_displacement,
      final_displacement_unit,
      initial_time,
      initial_time_unit,
      final_time,
      final_time_unit,
      unit_of_result,
      resultOrStep);
  }
  
  /* Displacement3/speed_law:
   * v = (final_displacement - initial_displacement) / delta_time */
  @Override
  public String speed3(
    double initial_displacement,
    double final_displacement,
    double delta_time,
    int resultOrStep) 
  {
    return speed3.speed(
      initial_displacement,
      final_displacement,
      delta_time,
      resultOrStep);
  } 
  
  @Override
  public String speed3(
    double initial_displacement,
    String initial_displacement_unit,
    double final_displacement,
    String final_displacement_unit,
    double delta_time,
    String delta_time_unit,
    String unit_of_result,
    int resultOrStep) 
  {
    return speed3.speed(
      initial_displacement,
      initial_displacement_unit,
      final_displacement,
      final_displacement_unit,
      delta_time,
      delta_time_unit,
      unit_of_result,
      resultOrStep);
  }
 
  
  /* Speed4/speed_law:
   * v = (delta_displacement / (final_time - initial_time) */
  @Override
  public String speed4(
    double delta_displacement,
    double initial_time,
    double final_time,
    int resultOrStep) 
  {
    return speed4.speed(
      delta_displacement,
      initial_time,
      final_time,
      resultOrStep);
  } 
  
  @Override
  public String speed4(
    double delta_displacement,
    String delta_displacement_unit,
    double initial_time,
    String initial_time_unit,
    double final_time,
    String final_time_unit,
    String unit_of_result,
    int resultOrStep) 
  {
    return speed4.speed(
      delta_displacement,
      delta_displacement_unit,
      initial_time,
      initial_time_unit,
      final_time,
      final_time_unit,
      unit_of_result,
      resultOrStep);
  }

  /* Tempo */
  // Delta time: ∆t = final_time - initial_time
  @Override
  public String time1(
    double initial_time,
    double final_time)
  {
    return time1.time(
      initial_time,
      final_time);
  }
  
  @Override
  public String time1(
    double initial_time,
    String initial_time_unit,
    double final_time,
    String final_time_unit,
    String unit_of_result)
  {
    return time1.time(
      initial_time,
      initial_time_unit,
      final_time,
      final_time_unit,
      unit_of_result);
  }

  // Delta time: ∆t = ∆S / speed_média
  @Override
  public String time2(
    double variation_displacement, 
    double speed) 
  {
    return time2.time(
      variation_displacement,
      speed);
  }
  
  public String time2(
    double variation_displacement, 
    String variation_displacement_unit,
    double speed,
    String speed_unit,
    String unit_of_result)
  {
    return time2.time(
      variation_displacement,
      variation_displacement_unit,
      speed,
      speed_unit,
      unit_of_result);
  }

  // Delta time: ∆t = (final_displacement - initial_displacement) / speed
  @Override
  public String time3(
    double initial_displacement,
    double final_displacement,
    double speed,
    int resultOrStep)
  {
    return time3.time(
      initial_displacement,
      final_displacement,
      speed,
      resultOrStep);
  }
  
   @Override
  public String time3(
    double initial_displacement,
    String initial_displacement_unit,
    double final_displacement,
    String final_displacement_unit,
    double speed,
    String speed_unit,
    String unit_of_result,
    int resultOrStep)
  {
    return time3.time(
      initial_displacement,
      initial_displacement_unit,
      final_displacement,
      final_displacement_unit,
      speed,
      speed_unit,
      unit_of_result,
      resultOrStep);
  }
  
  

  // Initial time: initial_time = final_time - ∆t
  @Override
  public String time4(
    double variation_time, 
    double final_time) 
  {
    return time4.time(
      variation_time,
      final_time);
  }
  
  @Override
  public String time4(
    double variation_time, 
    String variation_time_unit,
    double final_time,
    String final_time_unit,
    String unit_of_result) 
  {
    return time4.time(
      variation_time,
      variation_time_unit,
      final_time,
      final_time_unit,
      unit_of_result);
  }
  
  // Tempo final; final_time = tempo_inicia + ∆t
  @Override
  public String time5(
    double initial_time, 
    double variation_time) 
  {
    return time5.time(
      initial_time,
      variation_time);
  }
  
  @Override
  public String time5(
    double initial_time,
    String initial_time_unit, 
    double variation_time,
    String variation_time_unit,
    String unit_of_result) 
  {
    return time5.time(
      initial_time,
      initial_time_unit,
      variation_time,
      variation_time_unit,
      unit_of_result);
  }
  
  // Get class instance object
    protected static MRU getInstance()
    {
      if(instance == null)
      {
        instance = new MRU();
      }
      
      return instance;
    }
}
