/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EmployeeInfoClassTest {

  @Test
  void buildTable() {
    EmployeeInfoClass table = new EmployeeInfoClass();

    String expected = """
        Name                | Position          | Separation Date
        --------------------|-------------------|----------------
        Jacquelyn Jackson   | DBA               |\s
        Jake Jacobson       | Programmer        |\s
        """;

    String actual = table.buildTable("Jac");

    assertEquals(expected, actual);
  }
}