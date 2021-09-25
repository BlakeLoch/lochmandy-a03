/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

public class PaymentCalculator {

  private double balance;
  private double apr;
  private double monthlyPayment;

  public PaymentCalculator(double balance, double apr, double monthlyPayment) {
    //Initialize 'balance', 'apr', and 'monthlyPayment'
  }


  public int calculateMonthsUntilPaidOff() {
    // 'dailyApr' = apr / 365
    //return -(1/30) * log(1 + 'balance'/'monthlyPayment' * (1 - (1 + 'dailyApr')^30)) / log(1 + 'dailyApr')

  }

  public String buildOutputString(int monthsUntilPaidOff) {
    // return "It will take you monthsUntilPaidOff' months to pay off this card."
  }
}
