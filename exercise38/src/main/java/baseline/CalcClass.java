/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

import java.util.ArrayList;
import java.util.List;

public class CalcClass {

  public int[] filterEvenNumbers(int[] numbers) {
    // create evenNumbers arrayList
    List<Integer> evenNumbersList = new ArrayList<>();
    // for each number in numbers
    for (int number : numbers) {
      // if number % 2 = 0
      if (number % 2 == 0) {
        // add to evenNumbers
        evenNumbersList.add(number);
      }
    }
    // convert evenNumbersList to int array
    int[] evenNumbers = new int[evenNumbersList.size()];
    for (int i = 0; i < evenNumbers.length; i++) {
      evenNumbers[i] = evenNumbersList.get(i);
    }
    return evenNumbers;
  }

  public String buildOutputString(int[] evenNumbers) {
    // outputString = "The even numbers are "
    StringBuilder outputString = new StringBuilder("The even numbers are");
    // loop evenNumbers
    for (int number : evenNumbers) {
      // add evenNumbers[index] + " " to outputString
      outputString.append(" ").append(number);
    }
    outputString.append(".");
    // return outputString
    return outputString.toString();
  }

}
