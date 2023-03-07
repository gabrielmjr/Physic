package com.gabrielMJr.twaire.physic.hydrodynamics.fluidflow;

import com.gabrielMJr.twaire.physic.Physic;

final class Speed2 
{
    private static Speed2 instance;
 
    private Speed2(){}

    protected String speed(
      double flowRate, 
      double ray, 
      int resultOrStep)
    {
        Double step1 = Math.pow(ray, 2);
        Double step2 = step1 * 3.14;
        Double step3 = flowRate / step2;
    
        if (resultOrStep == Physic.GET_RESULT)
        {
            return String.valueOf(step3);
        }
        else if (resultOrStep == Physic.GET_STEP)
        {
            String result = "v = " 
                          + flowRate
                          + "m³/s" +  " ÷ [3.14 × (" 
                          + ray
                          + "m)²]"
                          + "\nv = "
                          + flowRate
                          + "m³/s" 
                          + " ÷ (3.14 × " 
                          + step2 
                          + "m²)"
                          + "\nv = " 
                          + "(" 
                          + flowRate
                          + "m³/s) ÷ "
                          + "(" 
                          + step2
                          + "m²)"
                          + "\nv = " 
                          + step3
                          + "m/s";
      
            return result;    
        
        } 
        else
        {
            return "Erro 404: third parameter not found";
        }
    }
    
    protected String speed(
      double flowRate, 
      String flowRateUnit,
      double ray, 
      String rayUnit,
      String unitOfResult,
      int resultOrStep)
    {
        return null;
    }
      
    public static Speed2 getInstance()
    {
        if(instance == null)
        {
            instance = new Speed2();
        }
      return instance;
    }
}
