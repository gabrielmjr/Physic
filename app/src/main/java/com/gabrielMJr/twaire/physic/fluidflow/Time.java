package com.gabrielMJr.twaire.physic.fluidflow;

class Time {

  protected String time(double volume, double fluidFlow)
  {
    return String.valueOf(volume / fluidFlow);
  }
}
