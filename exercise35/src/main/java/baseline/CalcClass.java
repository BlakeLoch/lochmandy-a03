/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

import java.util.Random;

public class CalcClass {

  private static final Random r = new Random();

  //generate random number
  public int generateRandomNumber(String[] names) {
    // Generate random number from 0 to names.length - 1
    return r.nextInt(names.length - 1);
  }

  public String pickWinner(String[] names, int winnerNumber) {
    // Return names[random number]
    return names[winnerNumber];
  }

  public String buildWinnerLine(String winner) {
    // return "The winner is... 'winner'."
    return "The winner is... " + winner + ".";
  }
}
