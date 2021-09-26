/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

public class CalcClass {

  public double average(int[] numbers) {
    // sum numbers with loop
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    // divide by numbers.length
    return (double) sum / numbers.length;
  }

  public int min(int[] numbers) {
    // currentMin = numbers[0]
    int currentMin = numbers[0];
    // loop numbers
    for (int number : numbers) {
      // if currentNumber < currentMin
      if (number < currentMin) {
        // currentMin = currentNumber
        currentMin = number;
      }
    }
    //return currentMin
    return currentMin;
  }

  public int max(int[] numbers) {
    // currentMax = numbers[0]
    int currentMax = numbers[0];
    // loop numbers
    for (int number : numbers) {
      // if currentNumber > currentMax
      if (number > currentMax) {
        // currentMax = currentNumber
        currentMax = number;
      }
    }
    //return currentMax
    return currentMax;
  }


  public double std(int[] numbers) {
    // loop numbers
    int result = 0;
    for (int number : numbers) {
      // subtract mean from number, square it, and add to result
      result += Math.pow(number - average(numbers), 2);
    }
    // divide result by numbers.length
    result /= numbers.length;
    // return square root of result
    return Math.round(Math.sqrt(result) * 100) / 100.0;
  }

  public String buildOutputString(double average, int min, int max, double std) {
    // return "The average is 'average'\nThe minimum is 'min'\nThe maximum is 'max'\nThe standard deviation is 'std'"
    return "The average is " + average + "\nThe minimum is " + min + "\nThe maximum is " + max
        + "\nThe standard deviation is " + std + "";
  }
}
