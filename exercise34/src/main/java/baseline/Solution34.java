/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

public class Solution34 {

  public static void main(String[] args) {

    //Link EmployeeListClass
    EmployeeListClass list = new EmployeeListClass();

    //Print List of Employees
    list.printEmployees();

    //Get name of employee to remove
    String employeeToRemove = list.getEmployeeToRemoveFromUser();

    //Remove employee
    list.removeEmployee(employeeToRemove);

    //Print List of Employees
    list.printEmployees();
  }

}
