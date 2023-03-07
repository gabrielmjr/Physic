package com.gabrielMJr.twaire.physic.kinematics.mru;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static com.gabrielMJr.twaire.physic.Physic.GET_RESULT;

/*
 This class tests the mru >> Speed3.class
*/
public class Speed4Test
{
  // MRU object
  MRU mru;
  
  public Speed4Test()
  {
    mru = MRU.getInstance();
  }
  
  
  /*
     This method tests Speed3 class
  */
  @Test
  public void speed4Test()
  {
     // The value to be tested:
     double deltaDisplacement = 3.0;
     double initialTime = 2.5;
     double finalTime = 8.5;
     
     // The result need to be:
     String result = "0.5";
     
     // Testing
     assertEquals(result, mru.speed4(deltaDisplacement, initialTime, finalTime, GET_RESULT));
  }
}