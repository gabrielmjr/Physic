package com.gabrielMJr.twaire.physic;

import com.gabrielMJr.twaire.physic.MRUIF;
import com.gabrielMJr.twaire.physic.Physic;

public class MRU implements MRUIF{

	private static final Physic physic = new Physic();

	/* Deslocamento */
	// Primeira fórmula do deslocamento. ∆S = S_final - S_inicial
	@Override
	public String fVDisplacement(double deslocamento_inicial, double deslocamento_final) {
		  return physic.expNormalizer(deslocamento_final - deslocamento_inicial);
	}
	
	// Segunda fórmua de deslocamento: ∆S = ∆t x velocidade_média
	@Override
	public String sVDisplacement(double variacao_tempo, double velocidade_media) {
		return physic.expNormalizer(variacao_tempo * velocidade_media);  
	}
	
	// Terceira fórmula de deslocamento: ∆S = (tempo_final - tempo_inicial) x velocidade_media
	@Override
	public String[] tVDisplacement(double tempo_inicial, double tempo_final, double velocidade_media) {
		double step1 = tempo_final - tempo_inicial;
		double step2 = step1 * velocidade_media;
		String[] res = new String[4];
		String signal;
		
		if (tempo_inicial < 0) {
		  signal = "";
		} else {
		  signal = "-";
}
		
		res[0] = "∆S = ("
		       + physic.expNormalizer(tempo_final)
		       + "s "
		       + signal
		       + physic.expNormalizer(tempo_inicial)
		       + "s ) x ("
		       + physic.expNormalizer(velocidade_media)
		       + "m/s)";
		       
		res[1] = "∆S = "
			   + physic.expNormalizer(step1)
			   + "s x ("
			   + physic.expNormalizer(velocidade_media)
			   + "m/s)";
			   
		res[2] = "∆S = "
			   + physic.expNormalizer(step2)
			   + "m";
			   
		res[3] = String.valueOf(step2);	   
		return res;       
	}
	
	
	// Deslocamento final: S_final = S_inicial + ∆S
	@Override
	public String final_displacement(double deslocamento_inicial, double variacao_deslocamento) {
		return physic.expNormalizer(deslocamento_inicial + variacao_deslocamento);
	}
	
	
	// Lei do espaço: S = S_inicial + velocidade * ∆t
	@Override
	public String[] spaceLaw(double deslocamento_inicial, double velocidade, double variacao_tempo) {
		double step1 = velocidade * variacao_tempo;
		double step2 = step1 + deslocamento_inicial;
		String[] res = new String[4];
		
		res[0] = "S = "
			   + physic.expNormalizer(deslocamento_inicial)
			   + "m + "
			   + physic.expNormalizer(velocidade)
			   + "m/s x "
			   + physic.expNormalizer(variacao_tempo)		
			   + "s";
			     
		res[1] = "S = "
			   + physic.expNormalizer(deslocamento_inicial)
			   + "m + "
			   + physic.expNormalizer(step1)
			   + "m";
			   
		res[2] = "S = "
			   + physic.expNormalizer(step2)
			   + "m";
		
		res[3] = String.valueOf(step2);
		return res;
	}
	
	
	/* Velocidade */
	/* Primeira fórmula de Velocidade média / lei da velocidade: v = ∆S / ∆t
 	* Nota: no MRU, lei da elocidade e velocidade média usam a mesma fórmula */
	public String speedLaw(double variacao_deslocamento, double variacao_tempo) {
		return physic.expNormalizer(variacao_deslocamento / variacao_tempo);
	}
	
	/* Segunda fórmula de Velocidade média / lei da velocidade:
 	* v = (deslocamento_final - deslocamento_inicial) / (tempo_final - tempo_inicial) */
	public String[] speedLaw2(double deslocamento_inicial, double deslocamento_final,
					   double tempo_inicial, double tempo_final) {
		double step1 = deslocamento_final - deslocamento_inicial;
		double step2 = tempo_final - tempo_inicial;
		double step3 = step1 / step2;
		String[] res = new String[4];
		
		String signal1;
		String signal2;
		
		if (deslocamento_inicial < 0) {
			signal1 = " ";
		} else {
			signal1 = " - ";
		}
		
		if (tempo_inicial < 0) {
			signal2 = " ";
		} else {
			signal2 = " - ";
		}
		
		res[0] = "v = ("
			   + physic.expNormalizer(deslocamento_final)
			   + "m"
			   + signal1
			   + physic.expNormalizer(deslocamento_inicial)
			   + "m) / ("
			   + physic.expNormalizer(tempo_final)
			   + "s"
			   + signal2
			   + physic.expNormalizer(tempo_inicial)
			   + "s)";
			   
		res[1] = "v = "
			   + physic.expNormalizer(step1)
			   + "m / "
			   + physic.expNormalizer(step2)
			   + "s";
			   
		res[2] = "v = "
			   + physic.expNormalizer(step3)
			   + "m/s";
			   
		res[3] = String.valueOf(step3);
			   
		return res;
	}
	
	
	/* Tempo */
	// Primeira fórmula de variação do tempo: ∆t = tempo_final - tempo_inicial
	@Override
	public String fVTime(double tempo_inicial, double tempo_final) {
		return physic.expNormalizer(tempo_final - tempo_inicial);
	}
	
	// Segunda fórmula de variação do tempo: ∆t = ∆S / velocidade_média
	@Override
	public String sVTime(double variacao_deslocamento, double velocidade) {
		return physic.expNormalizer(variacao_deslocamento / velocidade);
	}
	
	// Segunda fórmula de variação do tempo: ∆t = (deslocamento_final - deslocamento_inicial) / velocidade
	@Override
	public String[] tVTime(double deslocamento_inicial, double deslocamento_final, double velocidade) {
		double step1 = deslocamento_final - deslocamento_inicial;
		double step2 = step1 / velocidade;
		String[] res = new String[4];
		String signal;
	  
		if (deslocamento_inicial < 0) {
			signal = " ";
		} else {
			signal = " - ";
		}
		
		res[0] = "∆t = ("
			   + physic.expNormalizer(deslocamento_final)
			   + "m"
			   + signal
			   + physic.expNormalizer(deslocamento_inicial)
			   + "m) / ("
			   + physic.expNormalizer(velocidade)
			   + "m/s)";
			   
		res[1] = "∆t = "
			   + physic.expNormalizer(step1)
			   + "m / ("
			   + physic.expNormalizer(velocidade)
			   + "m/s)";
			   
		res[2] = "∆t = "
			   + physic.expNormalizer(step2)
			   + "s";
			   
		res[3] = String.valueOf(step2);
		return res;
	}
	
		// Tempo inicial: tempo_inicial = tempo_final - ∆t
	@Override
	public String initial_time(double variacao_tempo, double tempo_final) {
		return physic.expNormalizer(tempo_final - variacao_tempo);
	}	
	
	// Tempo final; tempo_final = tempo_inicia + ∆t
	@Override
	public String final_time(double tempo_inicial, double variacao_tempo) {
		return physic.expNormalizer(tempo_inicial + variacao_tempo);
	}
}

