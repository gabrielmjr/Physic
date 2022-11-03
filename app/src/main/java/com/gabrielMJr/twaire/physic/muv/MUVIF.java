package com.gabrielMJr.twaire.physic;

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
    
    
    public abstract String initialSpeed (
    double final_speed, 
    double delta_time, 
    double acceleration, 
    int stepOrResult);
    
    public abstract String initialSpeed (
    double final_speed, 
    String final_speed_unit,
    double delta_time, 
    String delta_time_unit,
    double acceleration, 
    String acceleration_unit,
    String unit_of_result,
    int stepOrResult);
    
    
    public abstract String finalSpeed (
    double initial_speed, 
    double delta_time, 
    double acceleration, 
    int stepOrResult);
    
    
    public abstract String fVTime (
    double delta_speed, 
    double acceleration);
    
    
    public abstract String sVTime (
    double initial_speed, 
    double final_speed, 
    double acceleration, 
    int stepOrResult);
    
    
    public abstract String initialTime (
    double final_time, 
    double delta_speed, 
    double acceleration, 
    int stepOrResult);
    
    
    public abstract String finalTime (
    double initial_time, 
    double delta_speed, 
    double acceleration, 
    int stepOrResult);
    
    
    public abstract String totalDisplacement (
    double initial_displacement, 
    double initial_speed, 
    double delta_time, 
    double acceleration, 
    int stepOrResult);
    
    
    public abstract String initialDisplacement (
    double initial_speed, 
    double delta_time, 
    double acceleration, 
    double displacement, int stepOrResult);
}
