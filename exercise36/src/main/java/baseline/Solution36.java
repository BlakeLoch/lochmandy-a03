/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

public class Solution36 {

  public static void main(String[] args) {

    // Link Helper Classes
    InputClass userInput = new InputClass();
    CalcClass calculations = new CalcClass();
    OutputClass output = new OutputClass();

    // Get Numbers From User
    int[] numbers = userInput.getNumbersFromUser();

    // Calculate average
    double average = calculations.average(numbers);
    // Calculate min
    int min = calculations.min(numbers);
    // Calculate max
    int max = calculations.max(numbers);
    // Calculate std
    double std = calculations.std(numbers);

    // Build outputString
    String outputString = calculations.buildOutputString(average, min, max, std);

    // Print outputString
    output.printOutputString(outputString);

  }

}
