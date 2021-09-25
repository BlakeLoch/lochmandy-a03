/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

import java.util.Scanner;

public class InputClass {

  private static final Scanner input = new Scanner(System.in);

  public String getFirstNameFromUser() {
    // Prompt user for first name
    System.out.print("Enter the first name: ");
    // return user input
    return input.nextLine();
  }

  public String getLastNameFromUser() {
    // Prompt user for last name
    System.out.print("Enter the last name: ");
    // return user input
    return input.nextLine();
  }

  public String getZipCodeFromUser() {
    // Prompt user for zip code
    System.out.print("Enter the ZIP code: ");
    // return user input
    return input.nextLine();
  }

  public String getEmployeeIdFromUser() {
    // Prompt user for employee id
    System.out.print("Enter the employee ID: ");
    // return user input
    return input.nextLine();
  }
}
