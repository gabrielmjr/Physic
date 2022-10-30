package com.gabrielMJr.twaire.physic;

import com.gabrielMJr.twaire.physic.MRUIF;
import com.gabrielMJr.twaire.physic.Physic;

public class MRU implements MRUIF {

  private static final Physic physic = new Physic();

  /* Deslocamento */
  // Primeira fórmula do deslocamento. ∆S = S_final - S_inicial
  @Override
  public String fVDisplacement(double initial_displacement, double final_displacement) {
    return String.valueOf(final_displacement - initial_displacement);
  }

  // Segunda fórmua de deslocamento: ∆S = ∆t x speed_média
  @Override
  public String sVDisplacement(double variation_time, double media_speed) {
    return String.valueOf(variation_time * media_speed);
  }

  // Terceira fórmula de deslocamento: ∆S = (final_time - initial_time) x media_speed
  @Override
  public String tVDisplacement(
    double initial_time,
    double final_time,
    double media_speed,
    int resultOrStep) {
    double step1 = final_time - initial_time;
    double step2 = step1 * media_speed;
    String res = "";
    String signal;
    
    
      if (resultOrStep == physic.GET_RESULT) {
          return String.valueOf(step2);
          
      } else if (resultOrStep == physic.GET_STEP) {
	      if (initial_time < 0) {
		  	signal = "";
	      } else {
		  	signal = "-";
	      }

	      res =
		      "∆S = ("
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
  
  

  // Deslocamento initial: S_inicial = S_final - ∆S
  @Override
  public String initial_displacement(double variation_displacement, double final_displacement) {
    return String.valueOf(final_displacement - variation_displacement);
  }

  // Deslocamento final: S_final = S_inicial + ∆S
  @Override
  public String final_displacement(double initial_displacement, double variation_displacement) {
    return String.valueOf(initial_displacement + variation_displacement);
  }

  // Lei do espaço: S = S_inicial + speed * ∆t
  @Override
  public String spaceLaw(
    double initial_displacement,
    double speed,
    double variation_time,
    int stepOrResult) 
    {
    double step1 = speed * variation_time;
    double step2 = step1 + initial_displacement;
    String res = "";
    
       if  (stepOrResult == physic.GET_RESULT) {
         return String.valueOf(step2);
         
       } else if (stepOrResult == physic.GET_STEP) {
           res =
             "S = "
             + initial_displacement
             + "m + "
             + speed
             + "m/s x "
             + variation_time
             + "s"
             + "\n"
             + "S = "
             + initial_displacement
             + "m + "
             + step1
             + "m"
             + "\n"
             + "S = " 
             + step2
             + "m";

        return res;
        
      } else {
        return "Erro 404: fourth parameter not found";
      }
    }
    

  /* speed */
  /* Primeira fórmula de speed média / lei da speed: v = ∆S / ∆t
   * Nota: no MRU, lei da speed e speed média usam a mesma fórmula */
  @Override
  public String speedLaw(double variation_displacement, double variation_time) {
    return String.valueOf(variation_displacement / variation_time);
  }

  /* Segunda fórmula de speed média / lei da speed:
   * v = (final_displacement - initial_displacement) / (final_time - initial_time) */
  @Override
  public String speedLaw2(
      double initial_displacement,
      double final_displacement,
      double initial_time,
      double final_time,
      int resultOrStep) {
      
    double step1 = final_displacement - initial_displacement;
    double step2 = final_time - initial_time;
    double step3 = step1 / step2;
    String res = "";

    String signal1;
    String signal2;
    
    if (resultOrStep == physic.GET_RESULT) {
      return String.valueOf (step3);
       
    } else if (resultOrStep == physic.GET_STEP) {

      if (initial_displacement < 0) {
        signal1 = " ";
      } else {
        signal1 = " - ";
      }

      if (initial_time < 0) {
        signal2 = " ";
      } else {
        signal2 = " - ";
      }
  
      res =
          "v = ("
              + final_displacement
              + "m"
              + signal1
              + initial_displacement
              + "m) ÷ ("
              + final_time
              + "s"
              + signal2
              + initial_time
              + "s)"
              + "\n"
              + "v = "
              + step1 
              + "m ÷ " 
              + step2
              + "s"
              + "\n"
              + "v = " 
              + step3
              + "m/s";

      return res;
    
    } else {
      return "Erro 404: fifth parameter not found";
    }
  } 

  /* Tempo */
  // Primeira fórmula de variação do tempo: ∆t = final_time - initial_time
  @Override
  public String fVTime(double initial_time, double final_time) {
    return String.valueOf(final_time - initial_time);
  }

  // Segunda fórmula de variação do tempo: ∆t = ∆S / speed_média
  @Override
  public String sVTime(double variation_displacement, double speed) {
    return String.valueOf(variation_displacement / speed);
  }

  // Terceira fórmula de variação do tempo: ∆t = (final_displacement - initial_displacement) / speed
  @Override
  public String tVTime(
    double initial_displacement,
    double final_displacement,
    double speed,
    int resultOrStep) {
  
    double step1 = final_displacement - initial_displacement;
    double step2 = step1 / speed;
    String res = "";
    String signal;
    
    if (resultOrStep == physic.GET_RESULT) {
      return String.valueOf (step2);
       
    } else if (resultOrStep == physic.GET_STEP) {
    
      if (initial_displacement < 0) {
        signal = " ";
      } else {
        signal = " - ";
      }

      res =
          "∆t = ("
            + String.valueOf(final_displacement)
            + "m"
            + signal
            + String.valueOf(initial_displacement)
            + "m) ÷ ("
            + String.valueOf(speed)
            + "m/s)"
            + "\n"
            + "∆t = "
            + String.valueOf(step1) 
            + "m ÷ (" 
            + String.valueOf(speed) 
            + "m/s)"
            + "\n"
            + "∆t = " 
            + String.valueOf(step2) 
            + "s";
 
      return res;
      
    } else {
      return "Erro 404: fourth parameter not found";
    }
  }

  // Tempo inicial: initial_time = final_time - ∆t
  @Override
  public String initial_time(double variation_time, double final_time) {
    return String.valueOf(final_time - variation_time);
  }

  // Tempo final; final_time = tempo_inicia + ∆t
  @Override
  public String final_time(double initial_time, double variation_time) {
    return String.valueOf(initial_time + variation_time);
  }
}
