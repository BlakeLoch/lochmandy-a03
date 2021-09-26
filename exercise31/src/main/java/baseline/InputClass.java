/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

import java.util.Scanner;

public class InputClass {

  private static final Scanner input = new Scanner(System.in);

  public int getRestingHRFromUser() {
    // Prompt user to enter heart rate
    System.out.print("Enter your resting heart rate: ");
    // Loop to validate input
    while (!input.hasNextInt()) {
      System.out.println("Please enter a number.");
      System.out.print("Enter your resting heart rate: ");
      input.nextLine();
    }
    // return user input
    return Integer.parseInt(input.nextLine());
  }

  public int getAgeFromUser() {
    // Prompt user to enter age
    System.out.print("Enter your age: ");
    // Loop to validate input
    while (!input.hasNextInt()) {
      System.out.println("Please enter a number.");
      System.out.print("Enter your age: ");
      input.nextLine();
    }
    // return user input
    return Integer.parseInt(input.nextLine());
  }
}
