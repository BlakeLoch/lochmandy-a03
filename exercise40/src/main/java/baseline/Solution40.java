/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

public class Solution40 {

  public static void main(String[] args) {

    //Link EmployeeInfoClass
    EmployeeInfoClass table = new EmployeeInfoClass();

    // Get search term
    String searchTerm = table.getSearchTermFromUser();

    // Build table
    String outputTable = table.buildTable(searchTerm);

    // Print table
    table.printTable(outputTable);

  }

}
