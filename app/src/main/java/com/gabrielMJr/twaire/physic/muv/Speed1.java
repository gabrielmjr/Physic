package com.gabrielMJr.twaire.physic.muv;

final class Speed1 {

    protected String speed (
    double delta_time, 
    double acceleration)
    {
    
      return String.valueOf(delta_time * acceleration);
    }

    public String speed (
    double delta_time,
    String delta_time_unit,
    double acceleration,
    String acceleration_unit,
    String unit_of_result) 
    {
    
      return null;
    }
}
