package com.gabrielMJr.twaire.physic;

import com.gabrielMJr.twaire.tools.Tools;

public class Physic{

  private static final String version = "1.0.3";
  private static final String creator = "Gabriel MJr";
  
  // Those constants were used to tell to the program if you want only results or steps
  public final int GET_RESULT = 0;
  public final int GET_STEP = 1;
  
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
