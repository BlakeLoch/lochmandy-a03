/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcClassTest {

  @Test
  void magic8BallTest1() {
    CalcClass calculations = new CalcClass();
    String expected = "Yes.";
    String actual = calculations.magic8Ball(0);
    assertEquals(expected, actual);
  }

  @Test
  void magic8BallTest2() {
    CalcClass calculations = new CalcClass();
    String expected = "No.";
    String actual = calculations.magic8Ball(1);
    assertEquals(expected, actual);
  }

  @Test
  void magic8BallTest3() {
    CalcClass calculations = new CalcClass();
    String expected = "Maybe.";
    String actual = calculations.magic8Ball(2);
    assertEquals(expected, actual);
  }

  @Test
  void magic8BallTest4() {
    CalcClass calculations = new CalcClass();
    String expected = "Ask again later.";
    String actual = calculations.magic8Ball(3);
    assertEquals(expected, actual);
  }

  @Test
  void generateRandomNumber() {
    CalcClass calculations = new CalcClass();
    int randomNumber = calculations.generateRandomNumber();
    assertTrue(0 <= randomNumber && randomNumber <= 4);
  }
}