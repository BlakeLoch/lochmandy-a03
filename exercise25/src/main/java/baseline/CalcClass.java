/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

public class CalcClass {

  public int passwordValidator(String password) {
    // numbers = count number of numbers in 'password'
    int numbers = countNumbers(password);
    // letters = count number of letters in 'password'
    int letters = countLetters(password);
    // specialChars = count number of special characters in 'password'
    int specialChars = countSpecialChars(password);

    // if password length is less than 8
      // if 'letters' and 'specialChars' are 0
        // return 1
      // if 'numbers' and 'specialChars' are 0
        // return 2
      // else
        //return 0
    // if password length is greater than or equal to 8
      // if 'numbers' is greater than 0, 'letters' is greater than 0, and 'specialChars' is 0
        // return 3
      // if 'numbers' 'letters', and 'specialChars' are all greater than 0
        // return 4
      // else
        // return 0
  }

  private int countNumbers(String password) {
    // create counter variable
    // use loop to iterate through 'password'
      // if character is number
        // increment counter variable
  }

  private int countLetters(String password) {
    // create counter variable
    // use loop to iterate through 'password'
      // if character is letter
        // increment counter variable
  }

  private int countSpecialChars(String password) {
    // create counter variable
    // use loop to iterate through 'password'
      // if character is special character
        // increment counter variable
  }

  public String buildOutputString(String password, int passwordStrength) {
    // switch on passwordStrength
    // case 1 = "The password 'password' is a very weak password.
    // case 2 = "The password 'password' is a weak password.
    // case 3 = "The password 'password' is a strong password.
    // case 4 = "The password 'password' is a very strong password.
    // default = "The password 'password' is of unknown strength.
  }

}
