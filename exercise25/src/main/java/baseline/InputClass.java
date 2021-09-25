/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

import java.util.Scanner;

public class InputClass {

  private static final Scanner input = new Scanner(System.in);

  public String GetPasswordFromUser() {
    //Prompt the user to enter a password
    System.out.println("Enter a password to check its strength");
    // return user input
    return input.nextLine();
  }
}
