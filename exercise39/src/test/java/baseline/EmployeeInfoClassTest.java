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
        John Johnson        | Manager           | 2016-12-31
        Michaela Michaelson | District Manager  | 2015-12-19
        Sally Webber        | Web Developer     | 2015-12-18
        Tou Xiong           | Software Engineer | 2016-10-05
        """;

    String actual = table.buildTable();

    assertEquals(expected, actual);

  }
}