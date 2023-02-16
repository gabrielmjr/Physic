package com.gabrielMJr.twaire.physic.kinematics.mru;
 
import com.gabrielMJr.twaire.physic.Physic;

final class Speed3
{
  // This object variable
  private static Speed3 instance; 
  
   // Private constructor to avoid new classe's incence
  private Speed3(){}
  
  // v = (Sf - Si) ÷ ∆t
  protected  String speed(
    double initialDisplacement,
    double finalDisplacement,
    double deltaTime,
    int resultOrStep)
  {
    double step1 = finalDisplacement - initialDisplacement;
    double step2 = step1 / deltaTime;
    String res = "";

    String signal1;
    String signal2;
    
    if (resultOrStep == Physic.GET_RESULT) 
    {
      return String.valueOf (step2);
       
    }
    else if (resultOrStep == Physic.GET_STEP) 
    {

      if (initialDisplacement < 0) 
      {
        signal1 = " ";
      } else {
        signal1 = " - ";
      }

      if (deltaTime < 0)
      {
        signal2 = " ";
      } else {
        signal2 = " - ";
      }
  
      res = "v = ("
          + finalDisplacement
          + "m"
          + signal1
          + initialDisplacement
          + "m) ÷ "
          + deltaTime
          + "s"
          + "\n"
          + "v = "
          + step1 
          + "m ÷ " 
          + deltaTime
          + "s"
          + "\n"
          + "v = " 
          + step2
          + "m/s";

    return res;
    
    }
     else 
    {
      return "Erro 404: fourth parameter not found";
    }
  }
  
  protected  String speed(
    double initialDisplacement,
    String initialDisplacementUnit,
    double finalDisplacement,
    String finalDisplacementUnit,
    double deltaTime,
    String deltaTimeUnit,
    String unitOfResult,
    int resultOrStep)
  {
    return null;
  }
  
  
  // Get class instance object
    public static Speed3 getInstance()
    {
      if(instance == null)
      {
        instance = new Speed3();
      }
      
      return instance;
    }
}
