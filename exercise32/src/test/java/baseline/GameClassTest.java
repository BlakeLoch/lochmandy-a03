/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class GameClassTest {

  @Test
  void isNotNumberTest1() {
    GameClass guessingGame = new GameClass();
    boolean actual = guessingGame.isNotNumber("a");
    assertTrue(actual);
  }

  @Test
  void isNotNumberTest2() {
    GameClass guessingGame = new GameClass();
    boolean actual = guessingGame.isNotNumber("1");
    assertFalse(actual);
  }

  @Test
  void checkGuessTest1() {
    GameClass guessingGame = new GameClass();
    boolean actual = guessingGame.checkGuess("5", 5);
    assertTrue(actual);
  }

  @Test
  void checkGuessTest2() {
    GameClass guessingGame = new GameClass();
    boolean actual = guessingGame.checkGuess("5", 10);
    assertFalse(actual);
  }

  @Test
  void guideGuessTest1() {
    GameClass guessingGame = new GameClass();
    String expected = "Too high.";
    String actual = guessingGame.guideGuess("5", 1);
    assertEquals(expected, actual);
  }

  @Test
  void guideGuessTest2() {
    GameClass guessingGame = new GameClass();
    String expected = "Too low.";
    String actual = guessingGame.guideGuess("5", 10);
    assertEquals(expected, actual);
  }

}