/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EmployeeInfoClass {

  private static final Scanner input = new Scanner(System.in);

  //Store Info As ArrayList

  //Declare fields
  private static final String FIRST_NAME = "firstName";
  private static final String LAST_NAME = "LastName";
  private static final String POSITION = "position";
  private static final String SEPARATION_DATE = "separationDate";

  //Initialize employee 1
  private static final Map<String, String> employee1Info = new HashMap<>();
  //Initialize employee 2
  private static final Map<String, String> employee2Info = new HashMap<>();
  //Initialize employee 3
  private static final Map<String, String> employee3Info = new HashMap<>();
  //Initialize employee 4
  private static final Map<String, String> employee4Info = new HashMap<>();
  //Initialize employee 5
  private static final Map<String, String> employee5Info = new HashMap<>();
  //Initialize employee 6
  private static final Map<String, String> employee6Info = new HashMap<>();
  //Create list of maps
  static List<Map<String, String>> employeeList = new ArrayList<>();

  static {
    employee1Info.put(FIRST_NAME, "John");
    employee1Info.put(LAST_NAME, "Johnson");
    employee1Info.put(POSITION, "Manager");
    employee1Info.put(SEPARATION_DATE, "2016-12-31");
  }

  static {
    employee2Info.put(FIRST_NAME, "Tou");
    employee2Info.put(LAST_NAME, "Xiong");
    employee2Info.put(POSITION, "Software Engineer");
    employee2Info.put(SEPARATION_DATE, "2016-10-05");
  }

  static {
    employee3Info.put(FIRST_NAME, "Michaela");
    employee3Info.put(LAST_NAME, "Michaelson");
    employee3Info.put(POSITION, "District Manager");
    employee3Info.put(SEPARATION_DATE, "2015-12-19");
  }

  static {
    employee4Info.put(FIRST_NAME, "Jake");
    employee4Info.put(LAST_NAME, "Jacobson");
    employee4Info.put(POSITION, "Programmer");
    employee4Info.put(SEPARATION_DATE, "");
  }

  static {
    employee5Info.put(FIRST_NAME, "Jacquelyn");
    employee5Info.put(LAST_NAME, "Jackson");
    employee5Info.put(POSITION, "DBA");
    employee5Info.put(SEPARATION_DATE, "");
  }

  static {
    employee6Info.put(FIRST_NAME, "Sally");
    employee6Info.put(LAST_NAME, "Webber");
    employee6Info.put(POSITION, "Web Developer");
    employee6Info.put(SEPARATION_DATE, "2015-12-18");
  }

  static {
    //Add employee maps to list
    employeeList.add(employee1Info);
    employeeList.add(employee2Info);
    employeeList.add(employee3Info);
    employeeList.add(employee4Info);
    employeeList.add(employee5Info);
    employeeList.add(employee6Info);
  }


  public String getSearchTermFromUser() {
    //Prompt user for string
    System.out.print("Enter a search string: ");
    //Return user input
    return input.nextLine();
  }

  private void sortTable() {
    // Compare last names to sort alphabetically by last name
    Comparator<Map<String, String>> mapComparator = Comparator.comparing(m -> m.get(LAST_NAME));
    // Sort alphabetically by last name
    employeeList.sort(mapComparator);
  }

  public String buildTable(String searchTerm) {
    sortTable();
    // tableString = "Name                | Position          | Separation Date\n--------------------|-------------------|----------------\n"
    StringBuilder tableString = new StringBuilder(
        "Name                | Position          | Separation Date\n--------------------|-------------------|----------------\n");
    // for each employee
    for (Map<String, String> employee : employeeList) {
      // if contains searchTerm in name
      if (employee.get(FIRST_NAME).contains(searchTerm) || employee.get(LAST_NAME)
          .contains(searchTerm)) {
        // tableString += buildRow
        tableString.append(buildRow(employee.get(FIRST_NAME), employee.get(LAST_NAME), employee.get(
            POSITION), employee.get(SEPARATION_DATE)));
      }
    }
    // return tableString
    return tableString.toString();
  }

  public void printTable(String outputTable) {
    //print outputTable
    System.out.println(outputTable);
  }

  private String buildRow(String firstName, String lastName, String position,
      String separationDate) {
    // return firstName+" "+lastName+"\t| "+ position + "\t| "+separationDate
    return String.format("%-20s| %-18s| %s%n", firstName + " " + lastName, position,
        separationDate);
  }

}
