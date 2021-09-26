/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AddingClassTest {

  @Test
  void sumNumbersTest() {
    AddingClass add = new AddingClass();
    add.setNumbers(1, 2, 3, 4, 5);
    int expected = 15;
    int actual = add.sumNumbers();
    assertEquals(expected, actual);
  }

  @Test
  void buildOutputStringTest() {
    AddingClass add = new AddingClass();
    String expected = "The total is 15.";
    String actual = add.buildOutput(15);
    assertEquals(expected, actual);
  }

  @Test
  void setAndGetNumbersTest() {
    AddingClass add = new AddingClass();
    int[] expected = {1, 2, 3, 4, 5};
    add.setNumbers(1, 2, 3, 4, 5);
    int[] actual = add.getNumbers();
    assertArrayEquals(expected, actual);
  }

}