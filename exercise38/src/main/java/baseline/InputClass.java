/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

import java.util.Scanner;

public class InputClass {

  private static final Scanner input = new Scanner(System.in);

  public int[] getNumbers() {
    //Prompt the user to enter numbers separated by spaces
    System.out.print("Enter a list of numbers, separated by spaces: ");
    // get user input
    String userInput = input.nextLine();
    // separate numbers
    String[] numberStrings = userInput.split(" ");
    // store in array
    int[] numbers = new int[numberStrings.length];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = Integer.parseInt(numberStrings[i]);
    }
    // return array
    return numbers;
  }

}
