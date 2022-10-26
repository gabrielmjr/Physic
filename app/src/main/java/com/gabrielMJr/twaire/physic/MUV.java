package com.gabrielMJr.twaire.physic;

import com.gabrielMJr.twaire.physic.MUVIF;
import com.gabrielMJr.twaire.physic.Physic;

public class MUV implements MUVIF {

  private static final Physic physic = new Physic();


  // MUR, primeira fórmula de aceleração: a = delta_speed / delta_time
  @Override
  public String fAcceleration(double deltaSpeed, double deltaTime) {
    return String.valueOf(deltaSpeed / deltaTime);
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
    if (stepOrResult == physic.GET_STEP) {
      res = "a = ("
               + final_speed
               + "m/s - "
               + initial_speed
               + "m/s) ÷ ("
               + variation_time
               + "s)"
               + "\na = ("
               + step1
               + "m/s) ÷ "
               + variation_time
               + "s"
               + "\na = "
               + step2
               +"m/s²";
      
      return res;
      
    // Else if equals to get result, return result
    } else if (stepOrResult == physic.GET_RESULT) {
      return String.valueOf (step2);
      
    } else {
      return "Error 404: fourth parameter not found.";
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
      if (stepOrResult == physic.GET_STEP) {
        res = "a = ("
            + final_speed
            + "m/s - "
            + initial_speed
            + "m/s) ÷ ("
            + final_time
            + "s - "
            + initial_time
            + "s)"
            + "\na = ("
            + step1
            + "m/s) ÷ "
            + step2
            + "s"
            + "\na = "
            + step3
            + "m/s²";
            
        return res;
        
      } else if (stepOrResult == physic.GET_RESULT) {
        return String.valueOf(step3);
        
      } else {
        return "Error 404: fifth parameter not found.";
      }
    }
    
    
    
    // Speed
    // First speed's formula: ∆v = ∆t * a
    @Override
    public String fVSpeed (double delta_time, double acceleration) {
      return String.valueOf(delta_time * acceleration);
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
        
        if (stepOrResult == physic.GET_STEP) {
          res = "∆v = ("
              + final_time
              + "s - "
              + initial_time
              + "s) × ("
              + acceleration
              + "m/s²)"
              + "\n∆v = "
              + step1
              + "s × ("
              + acceleration
              + "m/s²)"
              + "\n∆v = "
              + step2
              + "m/s";
              
              
          return res;
          
        } else if (stepOrResult == physic.GET_RESULT) {
          return String.valueOf(step2);
          
        } else {
          return "Error 404: fourth parameter not found.";
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
        
        if (stepOrResult == physic.GET_STEP) {
          res = "vi = "
              + final_speed
              + "m/s - "
              + delta_time
              + "s × "
              + acceleration
              + "m/s²"
              + "\nvi = "
              + final_speed
              + "m/s - "
              + step1
              + "m/s"
              +"\nvi = "
              + step2
              + "m/s";
              
          return res;
          
        } else if (stepOrResult == physic.GET_RESULT) {
          return String.valueOf(step2);
          
        } else {
          return "Error 404: fourth parameter not found.";
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
         
         if (stepOrResult == physic.GET_STEP) {
           res = "vf = "
               + delta_time
               + "s × "
               + acceleration
               + "m/s² + "
               + initial_speed
               + "m/s"
               + "\nvf = "
               + step1
               + "m/s + "
               + initial_speed
               + "m/s"
               + "\nvf = "
               + step2
               + "m/s";
               
           return res;             
           
         } else if (stepOrResult == physic.GET_RESULT) {
           return String.valueOf(step2);
           
         } else {
           return "Error 404: fourth parameter not found.";
         }
      }
      
      
      // Time
      // First variation of time: ∆t = ∆v / acceleration
      @Override
      public String fVTime (double delta_speed, double acceleration) 
      {
        return String.valueOf(delta_speed / acceleration);
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
          
          if (stepOrResult == physic.GET_STEP) {
            res = "∆t = ("
                + final_speed
                + "m/s - "
                + initial_speed
                + "m/s) ÷ "
                + acceleration
                + "m/s²"
                + "\n∆t = "
                + step1
                + "m/s ÷ "
                + acceleration
                + "m/s²"
                + "\n∆t = "
                + step2
                + "s";
                
            return res;
            
          } else if (stepOrResult == physic.GET_RESULT) {
            return String.valueOf(step2);
            
          } else {
            return "Error 404: fourth parameter not found.";
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
            
            if (stepOrResult == physic.GET_STEP) {
              res = "ti = "
                  + final_time
                  + "s - "
                  + delta_speed
                  + "m/s ÷ "
                  + acceleration
                  + "m/s²"
                  + "\nti = "
                  + final_time
                  + "s - "
                  + step1
                  + "s"
                  + "\nti = "
                  + step2
                  + "s";
                  
              return res;
               
            } else if (stepOrResult == physic.GET_RESULT) {
              return String.valueOf(step2);
              
            } else {
              return "Error 404: fourth parameter not found.";
            }
          }
          
          
          // Final time: tf = (∆v / a) + ti
          @Override
          public String finalTime (
            double initial_time, 
            double delta_speed, 
            double acceleration, 
            int stepOrResult)
           {
            double step1 = delta_speed / acceleration;
            double step2 = step1 + initial_time;
            String res;
            
            if (stepOrResult == physic.GET_STEP) {
              
              res = "tf = "
                  + initial_time
                  + "s + ("
                  + delta_speed
                  + "m/s ÷ "
                  + acceleration
                  + "m/s²)"
                  + "\ntf = "
                  + initial_time
                  + "s + "
                  + step1
                  + "s"
                  +"\ntf = "
                  + step2
                  + "s";
                  
              return res;
              
            } else if (stepOrResult == physic.GET_RESULT) {
              
              return String.valueOf(step2);
               
            } else {
              return "Error 404: fourth parameter not found.";
            }
          }
          
          
          
          // Displacement 
          // total Displacement: S = si + vi * ∆t + (a * ∆t²) /2
          @Override
          public String totalDisplacement (
            double initial_displacement,
            double initial_speed,
            double delta_time,
            double acceleration,
            int stepOrResult) 
            {
              double step1 = initial_speed * delta_time;
              double step11 = Math.pow(delta_time, 2);
              double step2 = initial_displacement + step1;
              double step22 = acceleration * step11;
              double step3 = step22 / 2;
              double step4 = step2 + step3;
              String res;
              
              if (stepOrResult == physic.GET_STEP) {
                
                res = "S = "
                    + initial_displacement
                    + "m + "
                    + initial_speed
                    + "m/s × "
                    + delta_time
                    + "s + ["
                    + acceleration
                    + "m/s² × ("
                    + delta_time
                    + "s)²] ÷ 2"
                    + "\nS = "
                    + initial_displacement
                    + "m + "
                    + step1
                    + "m + ("
                    + acceleration
                    + "m/s² × "
                    + step11
                    + "s²) ÷ 2"
                    + "\nS = "
                    + step2
                    + "m + ("
                    + step22
                    + " ÷ 2) (m×s²)/s²"
                    + "\nS = "
                    + step2
                    + "m + "
                    + step3
                    + "m"
                    + "\nS = "
                    + step4
                    + "m"
                    ;
                
                return res;
                
              } else if (stepOrResult == physic.GET_RESULT) {
               
                return String.valueOf(step4);
                
              } else {
                return "Error 404: fifth parameter not found.";
              }
            }
            
            
            // Initial displacement: Si = S - [(vi * ∆t) + (a * ∆t²) / 2]
            public String initialDisplacement (
              double initial_speed, 
              double delta_time, 
              double acceleration, 
              double displacement, 
              int stepOrResult)
              {
                double step1 = initial_speed * delta_time;
                double step11 = Math.pow (delta_time, 2);
                double step2 = acceleration * step11;
                double step3 = step2 / 2;
                double step4 = step1 + step3;
                double step5 = displacement - step4;
                String res;
                
                if (stepOrResult == physic.GET_STEP) {
                
                  res = "Si = "
                      + displacement
                      + "m - [("
                      + initial_speed 
                      + "m/s × "
                      + delta_time
                      + "s) + ["
                      + acceleration 
                      + "m/s² × ("
                      + delta_time
                      + "s)²] ÷ 2]"
                      + "\nSi = "
                      + displacement 
                      + "m - ["
                      + step1
                      + "m + ("
                      + acceleration
                      + "m/s² × "
                      + step11
                      + "s²) ÷ 2]"
                      + "\nSi = "
                      + displacement
                      + "m - ["
                      + step1
                      + "m + ("
                      + step2
                      + " ÷ 2)m]"
                      + "\nSi = "
                      + displacement 
                      + "m - ("
                      + step1
                      + "m + "
                      + step3
                      + "m)"
                      + "\nSi = "
                      + displacement 
                      + "m - "
                      + step4
                      + "m \nSi = "
                      + step5
                      + "m";
                      
                    return res;
                  
                } else if (stepOrResult == physic.GET_RESULT) {
                  
                  return String.valueOf(step5);
                  
                } else {
                
                  return "Error 404: fifth parameter not found.";
                }
                
              }
            
}
