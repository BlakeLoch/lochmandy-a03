/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

public class Solution30 {

  public static void main(String[] args) {
    // Link Multiplication Class
    MultiplicationClass times = new MultiplicationClass();

    // Generate Times Table
    String timesTable = times.generateTimesTable();

    //Print Times Table
    times.printTimesTable(timesTable);
  }

}
