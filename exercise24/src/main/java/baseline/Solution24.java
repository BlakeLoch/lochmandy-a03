/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */
package baseline;

public class Solution24 {

  public static void main(String[] args) {
    InputClass userInput = new InputClass();
    CalcClass calculations = new CalcClass();
    OutputClass output = new OutputClass();

    // Print Welcome Message
    userInput.printWelcomeLine();

    // Get user input for string1 and string 2
    String string1 = userInput.getFirstInputFromUser();
    String string2 = userInput.getSecondInputFromUser();

    // Check if strings are anagrams
    boolean anagram = calculations.isAnagram(string1, string2);

    // Print output statement
    String outputString = calculations.buildOutputString(string1, string2, anagram);
    output.printOutputString(outputString);
  }

}
