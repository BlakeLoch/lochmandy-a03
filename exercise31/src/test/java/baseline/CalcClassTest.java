/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalcClassTest {

  @Test
  void generateHeartRateTableTest() {
    CalcClass calculations = new CalcClass();

    String expected = """
                
        Resting Pulse: 65        Age: 22

        Intensity    | Rate
        -------------|--------
        55%          | 138 bpm
        60%          | 145 bpm
        65%          | 151 bpm
        70%          | 158 bpm
        75%          | 165 bpm
        80%          | 171 bpm
        85%          | 178 bpm
        90%          | 185 bpm
        95%          | 191 bpm
        """;
    String actual = calculations.generateHeartRateTable(65, 22);
    assertEquals(expected, actual);
  }
}