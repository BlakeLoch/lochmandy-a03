/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

import java.util.Scanner;

public class InputClass {

  private static final Scanner input = new Scanner(System.in);

  public double getBalanceFromUser() {
    // Prompt user for input
    System.out.print("What is your balance? ");
    // Return user input
    return input.nextDouble();
  }

  public int getAprFromUser() {
    // Prompt user for input
    System.out.print("What is the APR on the card (as a percent)? ");
    return input.nextInt();
  }

  public double getMonthlyPaymentFromUser() {
    // Prompt user for input
    System.out.print("What is the monthly payment you can make? ");
    // Return user input
    return input.nextDouble();
  }
}
