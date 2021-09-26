/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalcClassTest {

  @Test
  void averageTest() {
    CalcClass calculations = new CalcClass();
    int[] numbers = {100, 200, 1000, 300};
    double expected = 400.0;
    double actual = calculations.average(numbers);
    assertEquals(expected, actual);
  }

  @Test
  void minTest() {
    CalcClass calculations = new CalcClass();
    int[] numbers = {100, 200, 1000, 300};
    int expected = 100;
    int actual = calculations.min(numbers);
    assertEquals(expected, actual);
  }

  @Test
  void maxTest() {
    CalcClass calculations = new CalcClass();
    int[] numbers = {100, 200, 1000, 300};
    int expected = 1000;
    int actual = calculations.max(numbers);
    assertEquals(expected, actual);
  }

  @Test
  void stdTest() {
    CalcClass calculations = new CalcClass();
    int[] numbers = {100, 200, 1000, 300};
    double expected = 353.55;
    double actual = calculations.std(numbers);
    assertEquals(expected, actual);
  }

  @Test
  void buildOutputStringTest() {
    CalcClass calculations = new CalcClass();
    String expected = """
        The average is 400.0
        The minimum is 100
        The maximum is 1000
        The standard deviation is 353.55""";
    String actual = calculations.buildOutputString(400.0, 100, 1000, 353.55);
    assertEquals(expected, actual);
  }
}