/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

public class EmployeeInfoClass {

  //Store Employee Info as Map

  public void sortTable() {
    // use Map.Entry.comparingByValue() to sort lastName alphabetically
  }

  public String buildTable() {
    // tableString = "Name                | Position          | Separation Date\n--------------------|-------------------|----------------"
    // for each employee
      // run buildRow
    // return tableString
  }

  public void printTable(String outputTable) {
    //print outputTable
  }

  private String buildRow(String firstName, String lastName, String position, String separationDate) {
    // row = ""
    // name = firstName+" "+lastName
    // nameSpaces = 20 - name.length
    // Add name + nameSpaces * " " + "| " to row
    // positionSpaces = 18 - position.length
    // Add position + positionSpaces * " " + "| " to row
    // Add separationDate to row
    // return row
  }

}
