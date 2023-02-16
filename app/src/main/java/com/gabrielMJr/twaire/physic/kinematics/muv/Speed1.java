package com.gabrielMJr.twaire.physic.kinematics
.muv;

final class Speed1
{
  // This object variable
  private static Speed1 instance; 
  
   // Private constructor to avoid new classe's incence
  private Speed1(){}

    protected String speed (
    double deltaTime, 
    double acceleration)
    {
    
      return String.valueOf(deltaTime * acceleration);
    }

    public String speed (
    double deltaTime,
    String deltaTimeUnit,
    double acceleration,
    String accelerationUnit,
    String unitOfResult) 
    {
    
      return null;
    }
    
    
    // Get class instance object
    public static Speed1 getInstance()
    {
      if(instance == null)
      {
        instance = new Speed1();
      }
      
      return instance;
    }
}
