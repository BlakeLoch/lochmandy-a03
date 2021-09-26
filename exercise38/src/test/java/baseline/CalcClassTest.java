/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalcClassTest {

  @Test
  void filterEvenNumbers() {
    CalcClass calculations = new CalcClass();
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8,};
    int[] expected = {2, 4, 6, 8};
    int[] actual = calculations.filterEvenNumbers(numbers);
    assertArrayEquals(expected, actual);
  }

  @Test
  void buildOutputString() {
    CalcClass calculations = new CalcClass();
    String expected = "The even numbers are 2 4 6 8.";
    int[] evenNumbers = {2, 4, 6, 8};
    String actual = calculations.buildOutputString(evenNumbers);
    assertEquals(expected, actual);
  }
}