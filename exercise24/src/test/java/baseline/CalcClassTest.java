/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */
package baseline;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CalcClassTest {

  @Test
  void isAnagramTestTrue() {
    CalcClass calculations = new CalcClass();
    boolean actual = calculations.isAnagram("note", "tone");
    assertTrue(actual);
  }

  @Test
  void isAnagramTestFalse() {
    CalcClass calculations = new CalcClass();
    boolean actual = calculations.isAnagram("hello", "goodbye");
    assertFalse(actual);
  }

  @Test
  void buildOutputStringTestTrue() {
    CalcClass calculations = new CalcClass();
    String expected = "\"note\" and \"tone\" are anagrams.";
    String actual = calculations.buildOutputString("note", "tone", true);
    assertEquals(expected, actual);
  }

  @Test
  void buildOutputStringTestFalse() {
    CalcClass calculations = new CalcClass();
    String expected = "\"hello\" and \"goodbye\" are not anagrams.";
    String actual = calculations.buildOutputString("hello", "goodbye", false);
    assertEquals(expected, actual);
  }


}