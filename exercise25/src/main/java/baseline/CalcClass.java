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
    if (password.length() < 8) {
      // if 'letters' and 'specialChars' are 0
      if (letters == 0 && specialChars == 0) {
        // return 1
        return 1;
      }
      // if 'numbers' and 'specialChars' are 0
      else if (numbers == 0 && specialChars == 0) {
        // return 2
        return 2;
      }
      // else
      else {
        //return 0
        return 0;
      }
    }
    // if password length is greater than or equal to 8
    else {
      // if 'numbers' is greater than 0, 'letters' is greater than 0, and 'specialChars' is 0
      if (numbers > 0 && letters > 0 && specialChars == 0) {
        // return 3
        return 3;
      }
      // if 'numbers' 'letters', and 'specialChars' are all greater than 0
      else if (numbers > 0 && letters > 0 && specialChars > 0) {
        // return 4
        return 4;
      }
      // else
      else {
        // return 0
        return 0;
      }
    }
  }

  private int countNumbers(String password) {
    // create counter variable
    int count = 0;
    // use loop to iterate through 'password'
    for (int i = 0; i < password.length(); i++) {
      // if character is number
      if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
        // increment counter variable
        count++;
      }
    }
    return count;
  }

  private int countLetters(String password) {
    // create counter variable
    int count = 0;
    // use loop to iterate through 'password'
    for (int i = 0; i < password.length(); i++) {
      // if character is uppercase letter
      if (password.charAt(i) >= 65 && password.charAt(i) <= 90) {
        // increment counter variable
        count++;
      }
      // if character is lowercase letter
      if (password.charAt(i) >= 97 && password.charAt(i) <= 122) {
        // increment counter variable
        count++;
      }
    }
    return count;
  }

  private int countSpecialChars(String password) {
    // create counter variable
    int count = 0;
    // use loop to iterate through 'password'
    for (int i = 0; i < password.length(); i++) {
      // if character is special character (set 1)
      if (password.charAt(i) >= 33 && password.charAt(i) <= 47) {
        // increment counter variable
        count++;
      }

      // if character is special character (set 2)
      if (password.charAt(i) >= 58 && password.charAt(i) <= 64) {
        // increment counter variable
        count++;
      }

      // if character is special character (set 3)
      if (password.charAt(i) >= 91 && password.charAt(i) <= 96) {
        // increment counter variable
        count++;
      }

      // if character is special character (set 4)
      if (password.charAt(i) >= 123 && password.charAt(i) <= 126) {
        // increment counter variable
        count++;
      }
    }
    return count;
  }

  public String buildOutputString(String password, int passwordStrength) {
    // switch on passwordStrength
    String start = "The password '";
    return switch (passwordStrength) {
      // case 1 = "The password 'password' is a very weak password."
      case 1 -> start + password + "' is a very weak password.";
      // case 2 = "The password 'password' is a weak password."
      case 2 -> start + password + "' is a weak password.";
      // case 3 = "The password 'password' is a strong password."
      case 3 -> start + password + "' is a strong password.";
      // case 4 = "The password 'password' is a very strong password."
      case 4 -> start + password + "' is a very strong password.";
      // default = "The password 'password' is of unknown strength."
      default -> start + password + "' is of unknown strength.";
    };
  }

}
