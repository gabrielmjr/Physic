package com.gabrielMJr.twaire.physic;

public interface MRUIF {
	public abstract String fVDisplacement(double deslocamento_inicial, double deslocamento_final);
	public abstract String sVDisplacement(double variacao_tempo, double velocidade_media);
	public abstract String[] tVDisplacement(double tempo_inicial, double tempo_final, double velocidade_media);
	public abstract String final_displacement(double deslocamento_inicial, double variacao_deslocamento);
	public abstract String[] spaceLaw(double deslocamento_inicial, double velocidade, double variacao_tempo);
	public abstract String speedLaw(double variacao_deslocamento, double variacao_tempo);
	public abstract String[] speedLaw2(double deslocamento_inicial, double deslocamento_final,
					   double tempo_inicial, double tempo_final);
	public abstract String fVTime(double tempo_inicial, double tempo_final);
	public abstract String sVTime(double variacao_deslocamento, double velocidade);
	public abstract String[] tVTime(double deslocamento_inicial, double deslocamento_final, double velocidade);
	public abstract String initial_time(double variacao_tempo, double tempo_final);
	public abstract String final_time(double tempo_inicial, double variacao_tempo);
}
