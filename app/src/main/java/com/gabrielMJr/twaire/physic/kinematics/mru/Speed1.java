package com.gabrielMJr.twaire.physic.kinematics.mru;
 
final class Speed1
{
  // This object variable
  private static Speed1 instance;
  
   // Private constructor to avoid new classe's incence
  private Speed1(){}
  
  // Speed_law:v = ∆S / ∆T
  protected String speed1(
    double deltaDisplacement,
    double deltaTime)
  {
    return String.valueOf(deltaDisplacement / deltaTime);
  }
  
  protected String speed1(
    double deltaDisplacement,
    String deltaDisplacementUnit,
    double deltaTime,
    String deltaTimeUnit,
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
