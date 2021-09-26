/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

public class Solution31 {

  public static void main(String[] args) {
    // Link Helper Classes
    InputClass userInput = new InputClass();
    CalcClass calculations = new CalcClass();
    OutputClass output = new OutputClass();

    // Get heart rate from user
    int restingHR = userInput.getRestingHRFromUser();
    // Get age from user
    int age = userInput.getAgeFromUser();

    // Generate table
    String heartRateTable = calculations.generateHeartRateTable(restingHR, age);

    //Print table
    output.printHeartRateTable(heartRateTable);


  }

}
