/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

import java.util.Scanner;

public class AddingClass {

  private static final Scanner input = new Scanner(System.in);

  // Create array of 5 numbers
  private final int[] numbers = new int[5];

  public void getNumbersFromUser() {
    // For each element of 'numbers'
    for (int i = 0; i < numbers.length; i++) {
      // Prompt user to enter a number
      System.out.print("Enter a number: ");
      // Store the number in 'numbers'
      this.numbers[i] = input.nextInt();
    }
  }

  public int sumNumbers() {
    // Initialize sum
    int sum = 0;
    // For each element of 'numbers'
    for (int num : numbers) {
      // Add value to sum
      sum += num;
    }
    // Return sum
    return sum;
  }

  public String buildOutput(int sum) {
    return "The total is " + sum + ".";
  }

  public void printSum(String output) {
    // print sum
    System.out.println(output);
  }

  /* TESTING METHODS */

  //Initialize 'numbers' for testing
  public void setNumbers(int num1, int num2, int num3, int num4, int num5) {
    //Place 5 numbers in array
    numbers[0] = num1;
    numbers[1] = num2;
    numbers[2] = num3;
    numbers[3] = num4;
    numbers[4] = num5;
  }

  //Get array for comparison
  public int[] getNumbers() {
    return numbers;
  }

}
