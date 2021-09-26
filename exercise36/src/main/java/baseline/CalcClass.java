/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

public class CalcClass {

  public double average(int[] numbers) {
    // sum numbers with loop
    // divide by numbers.length
  }

  public int min(int[] numbers) {
    // currentMin = int[0]
    // loop numbers
      // if currentNumber < currentMin
        // currentMin = currentNumber
    //return currentMin
  }

  public int max(int[] numbers) {
    // currentMax = int[0]
    // loop numbers
      // if currentNumber > currentMax
        // currentMax = currentNumber
    // return currentMax
  }


  public double std(int[] numbers) {
    // loop numbers
      // subtract mean from number and square result
      // add result to sum
    // divide sum by numbers.length
    // square root result
  }

  public String buildOutputString(double average, int min, int max, double std) {
    // return "The average is average
    //The minimum is min
    //The maximum is max
    //The standard deviation is std"
  }
}
