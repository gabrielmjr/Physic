package com.gabrielMJr.physic;

public interface MUVIF {
    public abstract String acceleration1 (
        double deltaSpeed, 
        double deltaTime);
    
    public abstract String acceleration1 (
        double deltaSpeed, 
        String deltaSpeed_unit, 
        double deltaTime, 
        String deltaTime_unit, 
        String unit_of_result);
      
    
    public abstract String acceleration2 (
        double deltaSpeed, 
        double initialTime, 
        double finalTime, 
        int stepOrResult);
    
    public abstract String acceleration2 (
        double deltaSpeed, 
        String deltaSpeed_unit, 
        double initialTime, 
        String initial_time_unit, 
        double finalTime, 
        String finalTime_unit, 
        String unit_of_result, 
        int stepOrResult);
    
    public abstract String acceleration3 (
        double initial_speed, 
        double final_speed, 
        double variation_time, 
        int stepOrResult);
    
    public abstract String acceleration3 (
        double initial_speed, 
        String initial_speed_unit, 
        double final_speed, 
        String final_speed_unit, 
        double variation_time, 
        String variation_time_unit, 
        String unit_of_result, 
        int stepOrResult);
       
    
    public abstract String acceleration4 (
        double nitial_speed, 
        double final_speed, 
        double initial_time, 
        double final_time, 
        int steoOrResult);
    
    public abstract String acceleration4 (
        double initial_speed, 
        String initial_speed_unit, 
        double final_speed, 
        String final_speed_unit, 
        double initial_time, 
        String initial_time_unit, 
        double final_time, 
        String final_time_unit, 
        String unit_of_result, 
        int stepOrResult);
    
    
    public abstract String speed1 (
        double delta_time, 
        double acceleration);
    
    public abstract String speed1 (
        double delta_time, 
        String delta_speed_unit, 
        double acceleration, 
        String acceleration_unit, 
        String unit_of_result);
    
    
    public abstract String speed2 (
        double initial_time, 
        double final_time, 
        double acceleration, 
        int stepOrResult);
    
    public abstract String speed2 (
        double initial_time,
        String initial_time_unit,
        double final_time, 
        String final_time_unit,
        double acceleration,
        String acceleration_unit,
        String unit_of_result,
        int stepOrResult);
    
    
    public abstract String speed3 (
        double final_speed, 
        double delta_time, 
        double acceleration, 
        int stepOrResult);
    
    public abstract String speed3 (
        double final_speed, 
        String final_speed_unit,
        double delta_time, 
        String delta_time_unit,
        double acceleration, 
        String acceleration_unit,
        String unit_of_result,
        int stepOrResult);
    
    
    public abstract String speed4 (
        double initial_speed, 
        double delta_time, 
        double acceleration, 
        int stepOrResult);
    
    public abstract String speed4 (
        double initial_speed, 
        String initial_speed_unit,
        double delta_time, 
        String delta_time_unit,
        double acceleration, 
        String acceleration_unit,
        String unit_of_result,
        int stepOrResult);
    
    
    public abstract String time1 (
        double delta_speed, 
        double acceleration);
    
    public abstract String time1 (
        double delta_speed,
        String delta_speed_unit, 
        double acceleration,
        String acceleration_unit,
        String unit_of_result);
    
    
    public abstract String time2 (
        double initial_speed, 
        double final_speed, 
        double acceleration, 
        int stepOrResult);
    
    public abstract String time2 (
        double initial_speed, 
        String initial_speed_unit,
        double final_speed, 
        String final_speed_unit,
        double acceleration,
        String acceleration_unit,
        String unit_of_result,
        int stepOrResult);
    
    
    public abstract String time3 (
        double final_time, 
        double delta_speed, 
        double acceleration, 
        int stepOrResult);
    
    public abstract String time3 (
        double final_time, 
        String final_time_unit,
        double delta_speed, 
        String delta_speed_unit,
        double acceleration, 
        String acceleration_unit,
        String unit_of_result,
        int stepOrResult);
    
    
    public abstract String time4 (
        double initial_time, 
        double delta_speed, 
        double acceleration, 
        int stepOrResult);
    
    public abstract String time4 (
        double initial_time, 
        String initial_time_unit,
        double delta_speed, 
        String delta_speed_unit,
        double acceleration,
        String acceleration_unit,
        String unit_of_result,
        int stepOrResult);
    
    
    public abstract String displacement1 (
        double initial_displacement, 
        double initial_speed, 
        double delta_time, 
        double acceleration, 
        int stepOrResult);
    
    public abstract String displacement1 (
        double initial_displacement, 
        String initial_displacement_unit,
        double initial_speed, 
        String initial_speed_unit,
        double delta_time, 
        String delta_time_unit,
        double acceleration, 
        String acceleration_unit,
        String unit_of_result,
        int stepOrResult);
    
    
    public abstract String displacement2 (
        double initial_speed, 
        double delta_time, 
        double acceleration, 
        double displacement,
        int stepOrResult);
        
    public abstract String displacement2 (
        double initial_speed, 
        String initial_speed_unit,
        double delta_time, 
        String delta_time_unit,
        double acceleration, 
        String acceleration_unit,
        double displacement,
        String displacement_unit,
        String unit_of_result,
        int stepOrResult);
}
