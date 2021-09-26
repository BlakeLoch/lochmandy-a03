/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

import java.util.Random;

public class CalcClass {

  private static final Random r = new Random();

  private static final char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
      'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
  private static final char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
  private static final char[] specialChars = {'!', '@', '#', '$', '%', '&', '*', '~', '+', '-', '=',
      '_', '?', '<', '>'};

  public String generatePassword(int minimumLength, int specialCharCount, int numberCount) {
    int length = calcLength(minimumLength, specialCharCount, numberCount);
    // Create char array of length calcLength()
    char[] password = new char[length];
    int trueIndex = 0;
    int sCharIndex = 0;
    // pick 'specialCharCount' special characters
    while (sCharIndex < specialCharCount) {
      password[trueIndex + sCharIndex] = specialChars[r.nextInt(specialChars.length - 1)];
      sCharIndex++;
    }
    trueIndex = sCharIndex;
    // pick 'numberCount' numbers
    int numIndex = 0;
    while (numIndex < numberCount) {
      password[trueIndex + numIndex] = numbers[r.nextInt(numbers.length - 1)];
      numIndex++;
    }
    trueIndex += numIndex;
    // pick 'length' - ('specialCharCount' + 'numberCount') letters
    while (trueIndex < length) {
      password[trueIndex] = letters[r.nextInt(letters.length - 1)];
      trueIndex++;
    }
    // scramble 'password'
    char[] scrambledPassword = scramble(password);

    // return 'password' as string
    return new String(scrambledPassword);
  }

  private char[] scramble(char[] password) {
    // loop characters of password
    for (int i = 0; i < password.length; i++) {
      // generate random index
      int randomIndexToSwap = r.nextInt(password.length);
      // assign the value at the random index to a temporary location
      char temp = password[randomIndexToSwap];
      // store current index value in random index
      password[randomIndexToSwap] = password[i];
      // put value from random index in current index
      password[i] = temp;
    }
    // return password
    return password;
  }

  public String buildOutputString(String password) {
    // return "Your password is 'password'"
    return "Your password is " + password;
  }

  private int calcLength(int minimumLength, int specialCharCount, int numberCount) {
    // minLengthRule = 2 * ('specialCharCount' + 'numberCount')
    int minLengthRule = 2 * (specialCharCount + numberCount);
    //return larger of minLengthRule and minimumLength
    return Math.max(minimumLength, minLengthRule);
  }

}
