/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

public class MultiplicationClass {

  public String generateTimesTable() {

    int product;
    String timesTable = "";

    // Loop from 1 to 12
    for (int i = 1; i <= 12; i++) {
      // Loop from 1 to 12
      for (int j = 1; j <= 12; j++) {
        // multiply index of loop 1 by index of loop 2
        product = i * j;
        // if 'product' is less than 10
        if (product < 10) {
          // print "     'product'"
          timesTable += "    "+product;
        }
        // if number is greater than 99
        else if (product > 99) {
          // print "   'product'"
          timesTable += "  "+product;
        }
        // if number is between 10 and 99
        else {
          // print "    'product'"
          timesTable += "   "+product;
        }
      }
      //print newline
      timesTable += "\n";
    }

    //return 'timesTable'
    return timesTable;
  }

  public void printTimesTable(String timesTable) {
    // print 'timesTable'
    System.out.print(timesTable);
  }
}
