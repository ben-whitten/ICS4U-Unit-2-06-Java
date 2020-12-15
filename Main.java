/*
* The Main program implements an application that
* creates two objects and alters their speeds.
*
* @author  Ben Whitten
* @version 1.0
* @since   2020-12-15
*/

import java.util.Scanner;  // Import the Scanner class

///////////////////////////////////////////////////////////////////////////////

class Main {

  ////////////////////////////////////////////////////////////////////////////

  /**
   * This function handles all the inputs and outputs.
   */
  public static void main(String[] args) {

    // Creating object.
    Airplane biplane = new Airplane();

    // Getting and setting speed.
    biplane.setSpeed(212);
    System.out.println(biplane.getSpeed());
    
    // Creating object.
    Jet boeing = new Jet();
    
    // Getting and setting speed.
    boeing.setSpeed(422);
    System.out.println(boeing.getSpeed());
    
    // Setting x to 0;
    int x = 0;
    
    while (x < 4) {
      boeing.accelerate();
      System.out.println(boeing.getSpeed());
      if (boeing.getSpeed() > 5000) {
        biplane.setSpeed(biplane.getSpeed() * 2);
      } else {
        boeing.accelerate();
      }
      x++;
    }

    System.out.println(biplane.getSpeed());

    ///////////////////////////////////////////////////////////////////////////
  }
}
