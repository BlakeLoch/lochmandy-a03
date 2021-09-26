/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

public class Solution29 {

  public static void main(String[] args) {

    // Link Helper Classes
    InputClass userInput = new InputClass();
    CalcClass calculations = new CalcClass();
    OutputClass output = new OutputClass();

    // Get input from user
    double rateOfReturn = userInput.getRateOfReturnFromUser();

    // Calculate years
    int years = calculations.calcYears(rateOfReturn);

    // Build output string
    String outputString = calculations.buildOutputString(years);

    // Print Output
    output.printOutputString(outputString);

  }


}
