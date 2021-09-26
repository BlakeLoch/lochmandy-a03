/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalcClassTest {

  @Test
  void passwordValidatorTestVeryWeak() {
    CalcClass calculations = new CalcClass();
    int expected = 1;
    int actual = calculations.passwordValidator("12345");
    assertEquals(expected, actual);
  }

  @Test
  void passwordValidatorTestWeak() {
    CalcClass calculations = new CalcClass();
    int expected = 2;
    int actual = calculations.passwordValidator("abcdef");
    assertEquals(expected, actual);
  }

  @Test
  void passwordValidatorTestStrong() {
    CalcClass calculations = new CalcClass();
    int expected = 3;
    int actual = calculations.passwordValidator("abc123xyz");
    assertEquals(expected, actual);
  }

  @Test
  void passwordValidatorTestVeryStrong() {
    CalcClass calculations = new CalcClass();
    int expected = 4;
    int actual = calculations.passwordValidator("1337h@xor!");
    assertEquals(expected, actual);
  }

  @Test
  void passwordValidatorTestUnknown() {
    CalcClass calculations = new CalcClass();
    int expected = 0;
    int actual = calculations.passwordValidator("a1!");
    assertEquals(expected, actual);
  }

  @Test
  void buildOutputString1() {
    CalcClass calculations = new CalcClass();
    String expected = "The password '12345' is a very weak password.";
    String actual = calculations.buildOutputString("12345", 1);
    assertEquals(expected, actual);
  }

  @Test
  void buildOutputString2() {
    CalcClass calculations = new CalcClass();
    String expected = "The password 'abcdef' is a weak password.";
    String actual = calculations.buildOutputString("abcdef", 2);
    assertEquals(expected, actual);
  }

  @Test
  void buildOutputString3() {
    CalcClass calculations = new CalcClass();
    String expected = "The password 'abc123xyz' is a strong password.";
    String actual = calculations.buildOutputString("abc123xyz", 3);
    assertEquals(expected, actual);
  }

  @Test
  void buildOutputString4() {
    CalcClass calculations = new CalcClass();
    String expected = "The password '1337h@xor!' is a very strong password.";
    String actual = calculations.buildOutputString("1337h@xor!", 4);
    assertEquals(expected, actual);
  }

  @Test
  void buildOutputString5() {
    CalcClass calculations = new CalcClass();
    String expected = "The password 'a1!' is of unknown strength.";
    String actual = calculations.buildOutputString("a1!", 0);
    assertEquals(expected, actual);
  }


}