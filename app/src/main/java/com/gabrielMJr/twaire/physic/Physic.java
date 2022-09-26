package com.gabrielMJr.twaire.physic;

import com.gabrielMJr.twaire.tools.Tools;

public class Physic{
  
  private static final String creatorName = "Gabriel MJr";
  private static final String version = "1.0.2";
  
  public static void main(String[] args) {
    return;
  }
  
  // Atalho para normalizar expoente
  protected String expNormalizer(Double value) {
    Tools tools = new Tools();
    Long[] list = tools.expNormalizer(value);
    return tools.normalize(list);
  }
}

  public String getCreatorName() {
    return this.creatorName;
  }

  public String getVersion() {
    return this.version;
  }
