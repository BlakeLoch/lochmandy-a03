/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

public class Solution27 {

  public static void main(String[] args) {

    // Link Helper Classes
    InputClass userInput = new InputClass();
    CalcClass calculations = new CalcClass();
    OutputClass output = new OutputClass();

    // Get firstName, lastName, zipCode, and employeeId from user
    String firstName = userInput.getFirstNameFromUser();
    String lastName = userInput.getLastNameFromUser();
    String zipCode = userInput.getZipCodeFromUser();
    String employeeId = userInput.getEmployeeIdFromUser();

    // Validate input and create output string
    String outputString = calculations.validateInput(firstName, lastName, zipCode, employeeId);

    // Print Output String
    output.printOutputString(outputString);
  }

}
