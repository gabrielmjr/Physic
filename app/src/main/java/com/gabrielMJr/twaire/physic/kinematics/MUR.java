package com.gabrielMJr.twaire.physic;

import com.gabrielMJr.twaire.physic.MURIF;
import com.gabrielMJr.twaire.physic.Physic;

public class MUR implements MURIF {

  public static final int GET_RESULT = 1;
  public static final int GET_STEP = 2;
  private static final Physic physic = new Physic();

  // MUR, primeira fórmula de aceleração: a = delta_speed / delta_time
  @Override
  public String fAcceleration(double deltaSpeed, double deltaTime) {
    return physic.expNormalizer(deltaSpeed / deltaTime);
  }

  // Segunda fórmula de aceleração: a = (deltaSpeed) / (finalTime - initialTime)
  @Override
  public String sAcceleration(
       double deltaSpeed,
       double initialTime,
       double finalTime,
       int stepOrResult) {
       
    double step1 = finalTime - initialTime;
    double step2 = deltaSpeed / step1;
    String res = "a = (";

    if (stepOrResult == GET_STEP) {
    
      res += physic.expNormalizer(deltaSpeed)
           + "m/s) ÷ ("
           + physic.expNormalizer(finalTime)
           + " s - "
           + physic.expNormalizer(initialTime)
           + "s)";
           
       res += "\na = ("
           + physic.expNormalizer(deltaSpeed)
           + "m/s) ÷ ("
           + physic.expNormalizer(step1)
           + "s)";
       
       res += "\n"
           + "a = "
           + physic.expNormalizer(step2)
           + "m/s²";
           
       return res;
       
    } else if (stepOrResult == GET_RESULT) {
      return physic.expNormalizer((deltaSpeed) / (finalTime - initialTime));
      
    } else {
      return "Error: fourth parameter not found.";
    }
  }
  
  
  // Third formula of acceleration, when: a = (vf - vi) / variation_time
  @Override
  public String tAcceleration (
      double initial_speed,
      double final_speed, 
      double variation_time,
      int stepOrResult
  ) {
    
    // Attributes 
    double step1 = final_speed - initial_speed;
    double step2 = step1 / variation_time;
    String res; 
    
    // If the user want the steps, return the steps
    if (stepOrResult == GET_STEP) {
      res = "a = ("
               + physic.expNormalizer(final_speed)
               + "m/s - "
               + physic.expNormalizer(initial_speed)
               + "m/s) ÷ ("
               + physic.expNormalizer(variation_time)
               + "s)";
               
      res += "\na = ("
           + physic.expNormalizer(step1)
           + "m/s) ÷ "
           + physic.expNormalizer(variation_time)
           + "s";
           
      res += "\na = "
          + physic.expNormalizer(step2)
          +"m/s²";
      
      return res;
      
    // Else if equals to get result, return result
    } else if (stepOrResult == GET_RESULT) {
      return String.valueOf (step2);
      
    } else {
      return "Error: fourth parameter not found.";
    }
  }
  
  
  // Forth acceleration formula when:
  // a = (final_speed - initial_speed) ÷ (final_time - initial_time)
  @Override
  public String foAcceleration (
    double initial_speed,
    double final_speed,
    double initial_time,
    double final_time,
    int stepOrResult)
    {
      
      // Attributes 
      double step1 = final_speed - initial_speed;
      double step2 = final_time - initial_time;
      double step3 = step1 / step2;
      String res;
      
      // if stepOrResult.equals (getStep)
      if (stepOrResult == GET_STEP) {
        res = "a = ("
            + physic.expNormalizer(final_speed)
            + "m/s - "
            + physic.expNormalizer(initial_speed)
            + "m/s) ÷ ("
            + physic.expNormalizer(final_time)
            + "s - "
            + physic.expNormalizer(initial_time)
            + "s)";
            
        res += "\na = ("
            + physic.expNormalizer(step1)
            + "m/s) ÷ "
            + physic.expNormalizer(step2)
            + "s";
            
        res += "\na = "
            + physic.expNormalizer(step3)
            + "m/s²";
            
        return res;
        
      } else if (stepOrResult == GET_RESULT) {
        return physic.expNormalizer(step3);
        
      } else {
        return "Error: fifth parameter not found.";
      }
    }
    
    
    
    // Speed
    // First speed's formula: ∆v = ∆t * a
    @Override
    public String fVSpeed (double delta_time, double acceleration) {
      return physic.expNormalizer(delta_time * acceleration);
    }
    
    
    // Second speed's formula: ∆v = (tf - ti) * acceleration
    @Override
    public String sVSpeed (
      double initial_time,
      double final_time, 
      double acceleration,
      int stepOrResult)
      {
        double step1 = final_time - initial_time;
        double step2 = step1 * acceleration;
        String res;
        
        if (stepOrResult == GET_STEP) {
          res = "∆v = ("
              + physic.expNormalizer(final_time)
              + "s - "
              + physic.expNormalizer(initial_time)
              + "s) × ("
              + physic.expNormalizer(acceleration)
              + "m/s²)";
              
          res += "\n∆v = "
              + physic.expNormalizer(step1)
              + "s × ("
              + physic.expNormalizer(acceleration)
              + "m/s²)";
              
          res += "\n∆v = "
              + physic.expNormalizer(step2)
              + "m/s";
              
              
          return res;
          
        } else if (stepOrResult == GET_RESULT) {
          return physic.expNormalizer (step2);
          
        } else {
          return "Error: fourth parameter not found.";
        }
      }
    
      
      
      // Initial speed: vi = vf - ∆t * a
      @Override
      public String initialSpeed (
      double final_speed,
      double delta_time,
      double acceleration,
      int stepOrResult) 
      {
        
        double step1 = delta_time * acceleration;
        double step2 = final_speed - step1;
        String res;
        
        if (stepOrResult == GET_STEP) {
          res = "vi = "
              + physic.expNormalizer(final_speed)
              + "m/s - "
              + physic.expNormalizer(delta_time)
              + "s × "
              + physic.expNormalizer(acceleration)
              + "m/s²";
              
          res += "\nvi = "
              + physic.expNormalizer(final_speed)
              + "m/s - "
              + physic.expNormalizer(step1)
              + "m/s";
              
          res += "\nvi = "
              + physic.expNormalizer(step2)
              + "m/s";
              
          return res;
          
        } else if (stepOrResult == GET_RESULT) {
          return physic.expNormalizer (step2);
          
        } else {
          return "Error: fourth parameter not found.";
        }
      }
      
      
      // Final speed: vf = ∆t * a + vi
      @Override
      public String finalSpeed (
        double initial_speed,
        double delta_time,
        double acceleration,
        int stepOrResult) 
      {
         
         double step1 = delta_time * acceleration;
         double step2 = step1 + initial_speed;
         String res;
         
         if (stepOrResult == GET_STEP) {
           res = "vf = "
               + delta_time
               + "s × "
               + acceleration 
               + "m/s² + "
               + initial_speed
               + "m/s";
               
           res += "\nvf = "
               + step1 
               + "m/s + "
               + initial_speed
               + "m/s";
               
           res += "\nvf = "
               + step2
               + "m/s";
               
           return res;             
           
         } else if (stepOrResult == GET_RESULT) {
           return physic.expNormalizer (step2);
           
         } else {
           return "Error: fourth parameter not found.";
         }
      }
      
      
      // Time
      // First variation of time: ∆t = ∆v / acceleration
      @Override
      public String fVTime (double delta_speed, double acceleration) 
      {
        return physic.expNormalizer(delta_speed / acceleration);
      }
      
      
      // Second variation of time: ∆t = (vf - vi) / acceleration 
      @Override
      public String sVTime (
        double initial_speed, 
        double final_speed,
        double acceleration,
        int stepOrResult) 
        {
          
          double step1 = final_speed - initial_speed;
          double step2 = step1 / acceleration;
          String res;
          
          if (stepOrResult == GET_STEP) {
            res = "∆t = ("
                + final_speed
                + "m/s - "
                + initial_speed
                + "m/s) ÷ "
                + acceleration 
                + "m/s²";
                
            res += "\n∆t = "
                + step1
                + "m/s ÷ "
                + acceleration 
                + "m/s²";
                
            res += "\n∆t = "
                + step2
                + "s";
                
            return res;
            
          } else if (stepOrResult == GET_RESULT) {
            return physic.expNormalizer (step2);
            
          } else {
            return "Error: fourth parameter not found.";
          }
        }
        
        
        // Initial time: ti = tf - ∆v / a
        @Override
        public String initialTime (
          double final_time,
          double delta_speed,
          double acceleration,
          int stepOrResult)
          {
            double step1 = delta_speed / acceleration;
            double step2 = final_time - step1;
            String res;
            
            if (stepOrResult == GET_STEP) {
              res = "ti = "
                  + final_time
                  + "s - "
                  + delta_speed
                  + "m/s ÷ "
                  + acceleration 
                  + "m/s²";
                  
              res += "\nti = "
                  + final_time
                  + "s - "
                  + step1
                  + "s";
                  
              res += "\nti = "
                  + step2
                  + "s";
                  
              return res;
               
            } else if (stepOrResult == GET_RESULT) {
              return physic.expNormalizer (step2);
              
            } else {
              return "Error: fourth parameter not found.";
            }
          }
}
