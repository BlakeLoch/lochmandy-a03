/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

public class Solution39 {

  public static void main(String[] args) {
    //Link EmployeeInfoClass
    EmployeeInfoClass table = new EmployeeInfoClass();

    // Sort table by lastName
    table.sortTable();

    // Build table
    String outputTable = table.buildTable();

    // Print table
    table.printTable(outputTable);



  }



}
