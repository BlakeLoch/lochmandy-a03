/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

public class CalcClass {

  public String validateInput(String firstName, String lastName, String zipCode,
      String employeeId) {
    // check inputs against rules
    boolean rule1 = isFirstNameFilledIn(firstName);
    boolean rule2 = isLastNameFilledIn(lastName);
    boolean rule3 = areFirstAndLastNamesAtLeastTwoCharacters(firstName, lastName);
    boolean rule4 = isEmployeeIdInFormat(employeeId);
    boolean rule5 = isZipCodeFiveDigitNumber(zipCode);

    // if all true
    if (rule1 && rule2 && rule3 && rule4 && rule5) {
      // return "There were no errors found.\n"
      return "There were no errors found.\n";
    }
    // else
    else {
      // create 'returnString'
      String returnString = "";
      // if violates Rule 3
      if (!rule3) {
        // add "The first name must be at least 2 characters long.\nThe last name must be at least 2 characters long.\n" to 'returnString'
        returnString += "The first name must be at least 2 characters long.\nThe last name must be at least 2 characters long.\n";
      }
      // if violates Rule 1
      if (!rule1) {
        // add "The first name must be filled in.\n" to 'returnString'
        returnString += "The first name must be filled in.\n";
      }
      // if violates Rule 2
      if (!rule2) {
        // add "The last name must be filled in.\n" to 'returnString'
        returnString += "The last name must be filled in.\n";
      }
      // if violates Rule 4
      if (!rule4) {
        // add "The employee ID must be in the format of AA-1234.\n" to 'returnString'
        returnString += "The employee ID must be in the format of AA-1234.\n";
      }
      // if violates Rule 5
      if (!rule5) {
        // add "The ZIP code must be a 5 digit number.\n" to 'returnString'
        returnString += "The ZIP code must be a 5-digit number.\n";
      }
      // return 'returnString'
      return returnString;
    }
  }

  //Rule 1
  private boolean isFirstNameFilledIn(String firstName) {
    // return true if length of 'firstName' is greater than zero
    return (firstName.length() > 0);
  }

  //Rule 2
  private boolean isLastNameFilledIn(String lastName) {
    // return true if length of 'lastName' is greater than zero
    return (lastName.length() > 0);
  }

  //Rule 3
  private boolean areFirstAndLastNamesAtLeastTwoCharacters(String firstName, String lastName) {
    // return true if length of 'firstName' and 'lastName' are both greater than two
    return (firstName.length() > 2 && lastName.length() > 2);
  }

  //Rule 4
  private boolean isEmployeeIdInFormat(String employeeId) {
    //  return true if 'employeeId' length is 7,
    return employeeId.length() == 7 &&
        // if the first 2 characters are letters
        ((employeeId.charAt(0) >= 65 && employeeId.charAt(0) <= 90) ||
            (employeeId.charAt(0) >= 97 && employeeId.charAt(0) <= 122)) &&
        ((employeeId.charAt(1) >= 65 && employeeId.charAt(1) <= 90) ||
            (employeeId.charAt(1) >= 97 && employeeId.charAt(1) <= 122)) &&
        // the 3rd character is a hyphen,
        employeeId.charAt(2) == 45 &&
        // and the fourth through seventh characters are numbers
        employeeId.charAt(3) >= 48 && employeeId.charAt(3) <= 57 &&
        employeeId.charAt(4) >= 48 && employeeId.charAt(4) <= 57 &&
        employeeId.charAt(5) >= 48 && employeeId.charAt(5) <= 57 &&
        employeeId.charAt(6) >= 48 && employeeId.charAt(6) <= 57;

  }

  //Rule 5
  private boolean isZipCodeFiveDigitNumber(String zipCode) {
    // return true if zipCode length is 5,
    return zipCode.length() == 5 &&
        //and all five characters are numbers
        zipCode.charAt(0) >= 48 && zipCode.charAt(0) <= 57 &&
        zipCode.charAt(1) >= 48 && zipCode.charAt(1) <= 57 &&
        zipCode.charAt(2) >= 48 && zipCode.charAt(2) <= 57 &&
        zipCode.charAt(3) >= 48 && zipCode.charAt(3) <= 57 &&
        zipCode.charAt(4) >= 48 && zipCode.charAt(4) <= 57;
  }

}

