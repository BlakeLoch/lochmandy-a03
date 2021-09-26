/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcClassTest {

  @Test
  void pickWinnerTest() {
    CalcClass calculations = new CalcClass();
    String[] test = {"A", "B", "C"};
    String expected = "B";
    String actual = calculations.pickWinner(test, 1);
    assertEquals(expected, actual);
  }

  @Test
  void buildWinnerLineTest() {
    CalcClass calculations = new CalcClass();
    String expected = "The winner is... Maggie.";
    String actual = calculations.buildWinnerLine("Maggie");
    assertEquals(expected, actual);
  }
}