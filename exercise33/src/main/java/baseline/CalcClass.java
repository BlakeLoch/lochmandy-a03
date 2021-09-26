/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

import java.util.Random;

public class CalcClass {

  private static final Random r = new Random();

  // Create response array
  private static final String[] responses = {"Yes.", "No.", "Maybe.", "Ask again later."};

  public String magic8Ball(int responseNumber) {
    return responses[responseNumber];
  }

  public int generateRandomNumber() {
    // Generate random number from 0 to responses.length - 1
    return r.nextInt(responses.length - 1);
  }

}
