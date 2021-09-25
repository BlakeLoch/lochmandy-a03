/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */
package baseline;

import java.util.Scanner;

public class InputClass {

  private static final Scanner input = new Scanner(System.in);

  public void printWelcomeLine() {
    // print "Enter two strings, and I'll tell you if they are anagrams:"
    System.out.println("Enter two strings, and I'll tell you if they are anagrams:");
  }

  public String getFirstInputFromUser() {
    // print "Enter the first string:"
    System.out.print("Enter the first string: ");
    // return user input
    return input.nextLine();
  }

  public String getSecondInputFromUser() {
    // print "Enter the second string:"
    System.out.print("Enter the second string: ");
    // return user input
    return input.nextLine();
  }

}
