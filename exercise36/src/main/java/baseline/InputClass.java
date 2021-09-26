/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputClass {

  private static final Scanner input = new Scanner(System.in);

  public int[] getNumbersFromUser() {
    // Create arrayList 'numbers'
    List<String> numbers = new ArrayList<>();
    String userInput;
    // do
    do {
      // Prompt user to enter a number
      System.out.print("Enter a number: ");
      // Get user input
      userInput = input.nextLine();
      // Validate with isInputInvalid()
      if (isInputValid(userInput)) {
        // if valid add to arraylist
        numbers.add(userInput);
      }
    }
    // while user input is not 'done'
    while (!userInput.equalsIgnoreCase("done"));

    // remove "done"
    int done = numbers.size() - 1;
    numbers.remove(done);

    //loop numbers into int array
    int[] numberArray = new int[numbers.size()];
    int index = 0;
    for (String number : numbers) {
      numberArray[index] = Integer.parseInt(number);
      index++;
    }

    // return as int array
    return numberArray;
  }

  private boolean isInputValid(String input) {
    // if input is "done" or number, return true
    return input.equalsIgnoreCase("done") || isNumber(input);
  }

  public boolean isNumber(String number) {
    //try to parse as int
    try {
      Integer.parseInt(number);
      //if it succeeds, return true
      return true;
    } catch (NumberFormatException e) {
      // if it fails, return false
      return false;
    }
  }

}
