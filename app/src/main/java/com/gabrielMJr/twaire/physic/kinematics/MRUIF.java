package com.gabrielMJr.twaire.physic;

public interface MRUIF {
  public abstract String fVDisplacement(double initial_displacement, double final_displacement);

  public abstract String sVDisplacement(double time_variation, double media_speed);

  public abstract String tVDisplacement(
      double tempo_inicial, double final_time, double media_speed, int resultOrStep);

  public abstract String initial_displacement(
      double variation_displacement, double final_displacement);

  public abstract String final_displacement(
      double initial_displacement, double variation_displacement);

  public abstract String spaceLaw(
      double initial_displacement, double speed, double variation_time, int resultOrStep);

  public abstract String speedLaw(double variaion_displacement, double variation_time);

  public abstract String speedLaw2(
      double initial_displacement,
      double final_displacement,
      double initial_time,
      double final_time,
      int stepOrResult);

  public abstract String fVTime(double initia_time, double final_time);

  public abstract String sVTime(double variation_displacement, double speed);

  public abstract String tVTime(
      double deslocamento_inicial, double final_displacement, double speed, int stepOrResult);

  public abstract String initial_time(double variation_time, double initial_time);

  public abstract String final_time(double initial_time, double variation_time);
}
