/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

public class Solution37 {

  public static void main(String[] args) {

    // Link Helper Classes
    InputClass userInput = new InputClass();
    CalcClass calculations = new CalcClass();
    OutputClass output = new OutputClass();

    // Get Minimum Length From User
    int minimumLength = userInput.getMinimumLength();
    // Get Special Character Count From User
    int specialCharCount = userInput.getSpecialCharCount();
    // Get Number Count From User
    int numberCount = userInput.getNumberCount();

    // Generate password
    String password = calculations.generatePassword(minimumLength, specialCharCount, numberCount);

    //Print output string
    String outputString = calculations.buildOutputString(password);

    //Print output string
    output.printOutputString(outputString);


  }

}
