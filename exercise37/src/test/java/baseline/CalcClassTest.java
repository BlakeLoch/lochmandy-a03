/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalcClassTest {

  @Test
  void generatePasswordTest() {
    CalcClass calculations = new CalcClass();
    int expected = 8;
    int actual = calculations.generatePassword(8, 2, 2).length();
    assertEquals(expected, actual);
  }

  @Test
  void buildOutputString() {
    CalcClass calculations = new CalcClass();
    String expected = "Your password is aurn2$1s#";
    String actual = calculations.buildOutputString("aurn2$1s#");
    assertEquals(expected, actual);
  }
}