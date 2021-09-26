/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

import java.util.Scanner;

public class InputClass {

  private static final Scanner input = new Scanner(System.in);

  public void getQuestionFromUser() {
    // Print "What's your question?\n> "
    System.out.print("What's your question?\n> ");
    // Get user input
    input.nextLine();
  }
}
