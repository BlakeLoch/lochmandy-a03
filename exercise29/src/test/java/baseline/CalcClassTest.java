/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalcClassTest {

  @Test
  void calcYearsTest() {
    CalcClass calculations = new CalcClass();
    int expected = 18;
    int actual = calculations.calcYears(4);
    assertEquals(expected, actual);
  }

  @Test
  void buildOutputStringTest() {
    CalcClass calculations = new CalcClass();
    String expected = "It will take 18 years to double your initial investment.";
    String actual = calculations.buildOutputString(18);
    assertEquals(expected, actual);
  }
}