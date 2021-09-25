/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

public class CalcClass {

  public String validateInput(String firstName, String lastName, String zipCode, String employeeId) {
    // check inputs against rules
    // if all true
    // return "There were no errors found."
    // else
    // create 'returnString'
    // if violates Rule 1
      // add "The first name must be filled in.\n" to 'returnString'
    // if violates Rule 2
      // add "The last name must be filled in.\n" to 'returnString'
    // if violates Rule 3
      // add "The first name must be at least 2 characters long.\nThe last name must be at least 2 characters long.\n" to 'returnString'
    // if violates Rule 4
      // add "The employee ID must be in the format of AA-1234.\n" to 'returnString'
    // if violates Rule 5
      // add "The ZIP code must be a 5-digit number.\n" to 'returnString'
  }

  //Rule 1
  private boolean isFirstNameFilledIn(String firstName) {
    // return true if length of 'firstName' is greater than zero
  }

  //Rule 2
  private boolean isLastNameFilledIn(String lastName) {
    // return true if length of 'lastName' is greater than zero
  }

  //Rule 3
  private boolean areFirstAndLastNamesAtLeastTwoCharacters(String firstName, String lastName) {
    // return true if length of 'firstName' and 'lastName' are both greater than two
  }

  //Rule 4
  private boolean isEmployeeIdInFormat(String employeeId) {
    // if 'employeeId' length is 7
      // if first 2 characters are letters
        // if 3rd character is hyphen
          // if characters 4 - 7 are numbers
            // return true
    // else
      // return false
  }

  //Rule 5
  private boolean isZipCodeFiveDigitNumber(String zipCode) {
    // if zipCode length is 5
      // if all 5 characters are numbers
        // return true
    // else
      // return false
  }

}

