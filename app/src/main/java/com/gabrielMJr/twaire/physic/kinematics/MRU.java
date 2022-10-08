 package com.gabrielMJr.twaire.physic;

import com.gabrielMJr.twaire.physic.MRUIF;
import com.gabrielMJr.twaire.physic.Physic;

public class MRU implements MRUIF {

  private static final Physic physic = new Physic();
  public static final int GET_RESULT = 1;
  public static final int GET_STEP = 2;

  /* Deslocamento */
  // Primeira fórmula do deslocamento. ∆S = S_final - S_inicial
  @Override
  public String fVDisplacement(double initial_displacement, double final_displacement) {
    return physic.expNormalizer(final_displacement - initial_displacement);
  }

  // Segunda fórmua de deslocamento: ∆S = ∆t x speed_média
  @Override
  public String sVDisplacement(double variation_time, double media_speed) {
    return physic.expNormalizer(variation_time * media_speed);
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
    
    
      if (resultOrStep == GET_RESULT) {
          return String.valueOf(step2);
          
      } else if (resultOrStep == GET_STEP) {
	      if (initial_time < 0) {
		  	signal = "";
	      } else {
		  	signal = "-";
	      }

	      res =
		      "∆S = ("
                	+ physic.expNormalizer(final_time)
        	        + "s "
      	          + signal
         	       + physic.expNormalizer(initial_time)
        	        + "s ) x ("
         	       + physic.expNormalizer(media_speed)
              	  + "m/s)";

	      res +=
     	     "\n"
       	         + "∆S = "
        	        + physic.expNormalizer(step1)
        	        + "s x ("
              	  + physic.expNormalizer(media_speed)
          	      + "m/s)";

  	    res += 
    	      "\n"
       	         + "∆S = "
          	      + physic.expNormalizer(step2) +
           	     "m";
	
  	      return res;
  	      
  	  } else {
  	    return "Erro 404: fourth parameter not found";
  	  
	} 
  }
  
  

  // Deslocamento initial: S_inicial = S_final - ∆S
  @Override
  public String initial_displacement(double variation_displacement, double final_displacement) {
    return physic.expNormalizer(final_displacement - variation_displacement);
  }

  // Deslocamento final: S_final = S_inicial + ∆S
  @Override
  public String final_displacement(double initial_displacement, double variation_displacement) {
    return physic.expNormalizer(initial_displacement + variation_displacement);
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
    
       if  (stepOrResult == GET_RESULT) {
         return String.valueOf(step2);
         
       } else if (stepOrResult == GET_STEP) {
           res =
             "S = "
             + physic.expNormalizer(initial_displacement)
             + "m + "
             + physic.expNormalizer(speed)
             + "m/s x "
             + physic.expNormalizer(variation_time)
             + "s";

        res += "\n"
            + "S = "
            + physic.expNormalizer(initial_displacement)
            + "m + "
            + physic.expNormalizer(step1)
            + "m";

        res += "\n"
            + "S = " 
            + physic.expNormalizer(step2) 
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
    return physic.expNormalizer(variation_displacement / variation_time);
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
    
    if (resultOrStep == GET_RESULT) {
      return String.valueOf (step3);
       
    } else if (resultOrStep == GET_STEP) {

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
              + physic.expNormalizer(final_displacement)
              + "m"
              + signal1
              + physic.expNormalizer(initial_displacement)
              + "m) ÷ ("
              + physic.expNormalizer(final_time)
              + "s"
              + signal2
              + physic.expNormalizer(initial_time)
              + "s)";

      res +=
            "\n"
            + "v = "
            + physic.expNormalizer(step1) 
            + "m ÷ " 
            + physic.expNormalizer(step2) 
            + "s";

      res +=
           "\n" 
           + "v = " 
           + physic.expNormalizer(step3) 
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
    return physic.expNormalizer(final_time - initial_time);
  }

  // Segunda fórmula de variação do tempo: ∆t = ∆S / speed_média
  @Override
  public String sVTime(double variation_displacement, double speed) {
    return physic.expNormalizer(variation_displacement / speed);
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
    
    if (resultOrStep == GET_RESULT) {
      return String.valueOf (step2);
       
    } else if (resultOrStep == GET_STEP) {
    
      if (initial_displacement < 0) {
        signal = " ";
      } else {
        signal = " - ";
      }

      res =
          "∆t = ("
            + physic.expNormalizer(final_displacement)
            + "m"
            + signal
            + physic.expNormalizer(initial_displacement)
            + "m) ÷ ("
            + physic.expNormalizer(speed)
            + "m/s)";

      res += "\n"
          + "∆t = "
          + physic.expNormalizer(step1) 
          + "m ÷ (" 
          + physic.expNormalizer(speed) 
          + "m/s)";

      res += "\n"
          + "∆t = " 
          + physic.expNormalizer(step2) 
          + "s";
 
      return res;
      
    } else {
      return "Erro 404: fourth parameter not found";
    }
  }

  // Tempo inicial: initial_time = final_time - ∆t
  @Override
  public String initial_time(double variation_time, double final_time) {
    return physic.expNormalizer(final_time - variation_time);
  }

  // Tempo final; final_time = tempo_inicia + ∆t
  @Override
  public String final_time(double initial_time, double variation_time) {
    return physic.expNormalizer(initial_time + variation_time);
  }
}
