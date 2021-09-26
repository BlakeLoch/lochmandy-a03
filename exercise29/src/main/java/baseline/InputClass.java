/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

import java.util.Scanner;

public class InputClass {

  private static final Scanner input = new Scanner(System.in);

  public double getRateOfReturnFromUser() {
    // Prompt user for input
    System.out.print("What is the rate of return? ");
    String userInput = input.nextLine();
    // Use loop to validate input
    while (!validateInput(userInput)) {
      System.out.println("Sorry. That's not a valid input.");
      System.out.print("What is the rate of return? ");
      userInput = input.nextLine();
    }
    // Return user input
    return Double.parseDouble(userInput);
  }

  //Check if input is nonzero integer
  private boolean validateInput(String userInput) {
    // if input is non number
    if (!isNumeric(userInput)) {
      //return false
      return false;
    }
    // if input is number
    else {
      // return true if nonzero
      return Double.parseDouble(userInput) != 0;
    }
  }

  // Check if input is numeric
  private boolean isNumeric(String userInput) {
    //try to parse as double
    try {
      Double.parseDouble(userInput);
      //if it succeeds, return true
      return true;
    } catch (NumberFormatException e) {
      // if it fails, return false
      return false;
    }
  }

}
