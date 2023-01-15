package com.gabrielMJr.physic.kinematics.mru;
 
public interface MRUIF {
    // Displacement1/delta_displacement:
    public abstract String displacement1(
        double initial_displacement, 
        double final_displacement);
        
    public abstract String displacement1(
        double initial_displacement,
        String initial_displacement_unit, 
        double final_displacement,
        String final_displacement_unit,
        String unit_of_result);

    // Displacement2/delta_displacement:
    public abstract String displacement2(
        double time_variation,
        double media_speed);
        
    public abstract String displacement2(
        double time_variation,
        String time_variation_unit,
        double media_speed,
        String media_speed_unit,
        String unit_of_result);
        
    // Displacement3/delta_displacement:
    public abstract String displacement3(
        double intial_time, 
        double final_time, 
        double media_speed, 
        int resultOrStep);
        
    public abstract String displacement3(
        double initial_time, 
        String initial_time_unit,
        double final_time, 
        String final_time_unit,
        double media_speed,
        String media_speed_unit, 
        String unit_pf_result,
        int resultOrStep);

    // Displacement4/initial_displacement
    public abstract String displacement4(
        double variation_displacement, 
        double final_displacement);
     
    public abstract String displacement4(
        double variation_displacement, 
        String variation_displacement_unit,
        double final_displacement,
        String final_displacement_unit,
        String unit_of_result);

    // Displacement5/final_displacement:
    public abstract String displacement5(
        double initial_displacement, 
        double variation_displacement);
        
    public abstract String displacement5(
        double initial_displacement, 
        String initial_displacement_unit,
        double variation_displacement,
        String variation_displacement_unit,
        String unit_of_result);

    // Displacement6/displacement_law:
    public abstract String displacement6(
        double initial_displacement, 
        double speed, 
        double variation_time, 
        int resultOrStep);
        
    public abstract String displacement6(
        double initial_displacement, 
        String initial_displacement_unit,
        double speed, 
        String speed_unit,
        double variation_time, 
        String variation_time_unit,
        String unit_of_result,
        int resultOrStep);
    

    // Speed1/speed_law:
    public abstract String speed1(
        double variaion_displacement,
        double variation_time);
        
   public abstract String speed1(
        double variaion_displacement,
        String variation_displacement_unit,
        double variation_time,
        String variation_time_unit,
        String unit_of_result);

    // Speed2/speed_law:
    public abstract String speed2(
        double initial_displacement,
        double final_displacement,
        double initial_time,
        double final_time,
        int stepOrResult);
      
    public abstract String speed2(
        double initial_displacement,
        String initial_displacement_unit,
        double final_displacement,
        String final_displacement_unit,
        double initial_time,
        String initial_time_unit,
        double final_time,
        String final_time_unit,
        String unit_of_result,
        int stepOrResult);

    // Time1/delta_time
    public abstract String time1(
        double initial_time, 
        double final_time);
        
    public abstract String time1(
        double initial_time, 
        String initial_time_unit,
        double final_time,
        String final_time_unit,
        String unit_of_time);
 
    // Time2/delta_time:
    public abstract String time2(
        double variation_displacement, 
        double speed);
        
    public abstract String time2(
        double variation_displacement,
        String variation_displacement_unit, 
        double speed,
        String speed_unit,
        String unit_of_result);

    // Time3/delta_time:
    public abstract String time3(
        double initial_displacement, 
        double final_displacement, 
        double speed, 
        int stepOrResult);
        
    public abstract String time3(
        double initial_displacement, 
        String initial_displacement_unit,
        double final_displacement,
        String final_displacement_unit, 
        double speed,
        String speed_unit,
        String unit_of_result, 
        int stepOrResult);
       
    // Time4/initial_time: ti = tf - ∆t
    public abstract String time4(
        double variation_time, 
        double initial_time);
        
    public abstract String time4(
        double variation_time, 
        String variation_time_unit,
        double initial_time,
        String initial_time_unit,
        String unit_of_result);

    // Time5/final_time: tf = ti + ∆t
    public abstract String time5(
        double initial_time, 
        double variation_time);
        
    public abstract String time5(
        double initial_time, 
        String initial_time_unit,
        double variation_time,
        String variation_time_unit,
        String unit_of_result);
}
