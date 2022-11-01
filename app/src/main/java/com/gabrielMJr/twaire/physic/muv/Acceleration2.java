package com.gabrielMJr.twaire.physic.muv;

import com.gabrielMJr.twaire.physic.Physic;

final class Acceleration2 {

  private static Physic physic;

  protected Acceleration2()
  {
    physic = new Physic();
  }

  protected String acceleration(
       double deltaSpeed,
       double initialTime,
       double finalTime,
       int stepOrResult) {
       
    double step1 = finalTime - initialTime;
    double step2 = deltaSpeed / step1;
    String res = "a = (";

    if (stepOrResult == physic.GET_STEP) {
    
      res += deltaSpeed
           + "m/s) ÷ ("
           + finalTime
           + " s - "
           + initialTime
           + "s)"
           + "\na = ("
           + deltaSpeed
           + "m/s) ÷ ("
           + step1
           + "s)"
           + "\n"
           + "a = "
           + step2
           + "m/s²";
           
       return res;
       
    } else if (stepOrResult == physic.GET_RESULT) {
      return String.valueOf((deltaSpeed) / (finalTime - initialTime));
      
    } else {
      return "Error 404: fourth parameter not found.";
    }
  }
}
