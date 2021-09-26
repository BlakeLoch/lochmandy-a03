/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

import java.util.Scanner;

public class InputClass {

  private static final Scanner input = new Scanner(System.in);

  public int getMinimumLength() {
    // Prompt user for minimum length
    System.out.print("What's the minimum length? ");
    // return user input
    return Integer.parseInt(input.nextLine());
  }

  public int getSpecialCharCount() {
    // Prompt user for special character count
    System.out.print("How many special characters? ");
    // return user input
    return Integer.parseInt(input.nextLine());
  }

  public int getNumberCount() {
    // Prompt user for number count
    System.out.print("How many numbers? ");
    // return user input
    return Integer.parseInt(input.nextLine());
  }
}
