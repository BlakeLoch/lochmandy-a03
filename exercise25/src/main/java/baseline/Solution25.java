/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

public class Solution25 {

  public static void main(String[] args) {

    //Link Helper Classes
    InputClass userInput = new InputClass();
    CalcClass calculations = new CalcClass();
    OutputClass output = new OutputClass();

    //Get password from user
    String password = userInput.GetPasswordFromUser();

    //Calculate password strength
    int passwordStrength = calculations.passwordValidator(password);

    //Build output string
    String outputString = calculations.buildOutputString(password, passwordStrength);

    //Print output string
    output.printOutputString(outputString);

  }

}
