package com.gabrielMJr.physic.kinematics.mru;
 
import com.gabrielMJr.physic.Physic;

final class Displacement3
{
  // This object variable
  private static Displacement3 instance; 
  
   // Private constructor to avoid new classe's incence
  private Displacement3(){}
 
  // Displacement: ∆S = (tf - ti) × media_speed
  protected String displacement(
    double initial_time,
    double final_time,
    double media_speed,
    int resultOrStep)
  {
    double step1 = final_time - initial_time;
    double step2 = step1 * media_speed;
    String res = "";
    String signal;
    
    if (resultOrStep == Physic.GET_RESULT) 
    {
      return String.valueOf(step2);        
    } 
    else if (resultOrStep == Physic.GET_STEP) 
    {
    
      if (initial_time < 0)
      {
        signal = "";
	  }
	  else 
	  {
  	  signal = "-";
	  }
	  
	  res = "∆S = ("
      	+ final_time
          + "s "
          + signal
          + initial_time
          + "s ) x ("
          + media_speed
          + "m/s)"
     	 + "\n"
          + "∆S = "
          + step1
          + "s x ("
          + media_speed
          + "m/s)"
          + "\n"
          + "∆S = "
          + step2
          + "m";
	
      return res;
  	      
  	} else {
  	  return "Erro 404: fourth parameter not found";
  	  
	} 
  }
  
  protected String displacement (
    double initial_time,
    String initial_time_unit,
    double final_time,
    String final_time_unit,
    double media_speed,
    String media_speed_unit,
    String unit_of_result,
    int resultOrStep)
  {
    return null;
  }
  
  
  // Get class instance object
    public static Displacement3 getInstance()
    {
      if(instance == null)
      {
        instance = new Displacement3();
      }
      
      return instance;
    }
}
