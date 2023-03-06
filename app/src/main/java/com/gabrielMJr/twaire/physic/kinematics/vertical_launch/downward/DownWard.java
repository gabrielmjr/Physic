package com.gabrielMJr.twaire.physic.kinematics.vertical_launch.downward;

public class DownWard implements DownWardIF
{
    private static DownWard instance;
    
    private Height height;
    
    
    public DownWard() 
    {
        height = Height.getInstance();
    }
    
    
    @Override
    public String height(
        double initialHeight,
        double initialVelocity,
        double time,
        double gravity, 
        int resultOrStep)
        {
            return height.calculateHeight(
                initialHeight,
                initialVelocity,
                time,
                gravity,
                resultOrStep);
        }
    
    @Override
    public String height(
        double initialHeight, String initialHeightUnit,
        double initialVelocity, String initialVelocityUnit,
        double time, String timeUnit,
        double gravity, String gravityUnit,
        String unitOfResult,
        int resultOrStep)
        {
            return height.calculateHeight(
                initialHeight, initialHeightUnit,
                initialVelocity, initialVelocityUnit,
                time, timeUnit,
                gravity, gravityUnit,
                unitOfResult,
                resultOrStep);
        }
    
    
    protected static DownWard getInstance()
    {
        if (instance == null)
            instance = new DownWard();
        return instance;
    }
}
