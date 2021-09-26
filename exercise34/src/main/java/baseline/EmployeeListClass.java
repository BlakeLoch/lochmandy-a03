/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

import java.util.Scanner;

public class EmployeeListClass {

  private static final Scanner input = new Scanner(System.in);

  // Initialize Employee Array
  private String[] employees = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen",
      "Jeremy Goodwin"};

  public void printEmployees(String[] employees) {
    // Print "There are employees.length employees:"
    System.out.println("There are "+employees.length+" employees:");
    // For each employee
    for (String employee : employees) {
      // Print name
      System.out.println(employee);
    }
  }

  public String getEmployeeToRemoveFromUser() {
    // Prompt user for employee to remove
    System.out.print("Enter an employee name to remove: ");
    // Return user input
    return input.nextLine();
  }

  public String[] removeEmployee(String employeeToRemove) {
    // Make temporary array
    String[] tempArray = new String[4];
    // Iterate through employee array
    int tempArrayIndex = 0;
    for (String employee : employees) {
      // if employee does not match employeeToRemove
      if (!employee.equals(employeeToRemove)) {
        //  store employee in temporary array
        tempArray[tempArrayIndex] = employee;
        tempArrayIndex++;
      }
    }
    // override employee array to be the same as the temporary array
    employees = tempArray;
    return employees;
  }

  public String[] getEmployees() {
    return employees;
  }
}
