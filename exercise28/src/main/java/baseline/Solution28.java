/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

public class Solution28 {

  public static void main(String[] args) {

    // Import AddingClass
    AddingClass add = new AddingClass();

    // Get user input
    add.getNumbersFromUser();

    // Add numbers together
    int sum = add.sumNumbers();

    // Build outputString
    String outputString = add.buildOutput(sum);

    // Print result
    add.printSum(outputString);


  }

}
