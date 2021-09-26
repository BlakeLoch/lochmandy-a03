/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class EmployeeListClassTest {

  @Test
  void removeEmployeeTest() {
    EmployeeListClass list = new EmployeeListClass();
    String[] expected = {"John Smith", "Jackie Jackson", "Amanda Cullen", "Jeremy Goodwin"};
    String[] actual = list.removeEmployee("Chris Jones");
    assertArrayEquals(expected, actual);
  }

  @Test
  void getEmployees() {
    EmployeeListClass list = new EmployeeListClass();
    String[] expected = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen",
        "Jeremy Goodwin"};
    String[] actual = list.getEmployees();
    assertArrayEquals(expected, actual);
  }
}