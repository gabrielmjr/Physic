package com.gabrielMJr.twaire.physic;

public interface MURIF {
    public abstract String fAcceleration (double deltaSpeed, double deltaTime);
    
    public abstract String sAcceleration (double deltaSpeed, double initialTime, double finalTime, int stepOrResult);
    
    public abstract String tAcceleration (double initial_speed, double final_speed, double variation_time, int stepOrResult);
    
    public abstract String foAcceleration (double initial_speed, double final_speed, double initial_time, double final_time, int steoOrResult);
    
    public abstract String fVSpeed (double delta_time, double acceleration);
    
    public abstract String sVSpeed (double initial_time, double final_time, double acceleration, int stepOrResult);
    
    public abstract String initialSpeed (double final_speed, double delta_time, double acceleration, int stepOrResult);
    
    public abstract String finalSpeed (double initial_speed, double delta_time, double acceleration, int stepOrResult);
    
    public abstract String fVTime (double delta_speed, double acceleration);
    
    public abstract String sVTime (double initial_speed, double final_speed, double acceleration, int stepOrResult);
    
    public abstract String initialTime (double final_time, double delta_speed, double acceleration, int stepOrResult);
    
    public abstract String finalTime (double initial_time, double delta_speed, double acceleration , int stepOrResult);
    
    public abstract String totalDisplacement (double initial_displacement, double initial_speed, double delta_time, double acceleration, int stepOrResult);
    
    public abstract String initialDisplacement (double initial_speed, double delta_time, double acceleration, double displacement, int stepOrResult);
}
