/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

public class Solution33 {

  public static void main(String[] args) {

    // Link Helper Classes
    InputClass userInput = new InputClass();
    CalcClass calculations = new CalcClass();
    OutputClass output = new OutputClass();

    // Prompt the user for a question
    userInput.getQuestionFromUser();

    // Get Response From Magic 8 Ball
    int randomNumber = calculations.generateRandomNumber();
    String response = calculations.magic8Ball(randomNumber);

    // Print response
    output.printResponse(response);

  }


}
