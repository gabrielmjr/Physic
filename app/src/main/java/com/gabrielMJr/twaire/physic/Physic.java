package com.gabrielMJr.twaire.physic;

import com.gabrielMJr.twaire.tools.Tools;

public class Physic{

  public static final String version = "1.0.3";
  public static final String creator = "Gabriel MJr";
  
  public static void main(String[] args) {
    return;
  }
  
  // Atalho para normalizar expoente
  protected String expNormalizer(double value) {
    Tools tools = new Tools();
    Long[] list = tools.expNormalizer(value);
    return tools.normalize(list);
  }
  
  public String getVersion () {
    return version;
  }
  
  public String getCreator () {
    return creator;
  }
}
