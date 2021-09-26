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

  public String[] getNamesFromUser() {
    //Initialize Array List
    List<String> names = new ArrayList<>();

    System.out.print("Enter a name: ");
    String userInput = input.nextLine();
    names.add(userInput);
    while (!userInput.isEmpty()) {
      //Prompt user to enter name
      System.out.print("Enter a name: ");
      // get user input
      userInput = input.nextLine();
      //add name to list
      names.add(userInput);
    }

    //delete final blank item
    int index = names.size() - 1;
    names.remove(index);

    //return arraylist as string array
    return names.toArray(new String[0]);
  }

}
