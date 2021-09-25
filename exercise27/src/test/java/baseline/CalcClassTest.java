/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalcClassTest {

  @Test
  void validateInputTest1() {
    CalcClass calculations = new CalcClass();
    String expected = "The first name must be at least 2 characters long.\nThe last name must be at least 2 characters long.\nThe last name must be filled in.\nThe employee ID must be in the format of AA-1234.\nThe ZIP code must be a 5-digit number.\n";
    String actual = calculations.validateInput("J", "", "ABCDE", "A12-1234");
    assertEquals(expected, actual);
  }

  @Test
  void validateInputTest2() {
    CalcClass calculations = new CalcClass();
    String expected = "There were no errors found.\n";
    String actual = calculations.validateInput("John", "Johnson", "55555", "TK-4321");
    assertEquals(expected, actual);
  }

}