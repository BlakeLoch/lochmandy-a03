/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

public class CalcClass {

  public int calcYears(double rateOfReturn) {
    // return 72 / rateOfReturn
    return (int) Math.ceil(72 / rateOfReturn);
  }

  public String buildOutputString(int years) {
    // return "It will take 'years' years to double your initial investment."
    return "It will take " + years + " years to double your initial investment.";
  }

}
