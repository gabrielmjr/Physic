package com.gabrielMJr.twaire.physic;

import com.gabrielMJr.twaire.tools.Tools;

public class Physic{
  
  public static void main(String[] args) {
    return;
  }
  
  // Atalho para normalizar expoente
  protected String expNormalizer(double value) {
    Tools tools = new Tools();
    Long[] list = tools.expNormalizer(value);
    return tools.normalize(list);
  }
}
