/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

public class Solution38 {

  public static void main(String[] args) {

    // Link Helper Classes
    InputClass userInput = new InputClass();
    CalcClass calculations = new CalcClass();
    OutputClass output = new OutputClass();

    // Get user input
    int[] numbers = userInput.getNumbers();

    // Find even numbers
    int[] evenNumbers = calculations.filterEvenNumbers(numbers);

    // build outputString
    String outputString = calculations.buildOutputString(evenNumbers);

    // print outputString
    output.printOutputString(outputString);

  }

}
