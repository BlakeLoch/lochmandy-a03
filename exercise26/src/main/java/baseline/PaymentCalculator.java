/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

public class PaymentCalculator {

  private final double balance;
  private final double apr;
  private final double monthlyPayment;

  public PaymentCalculator(double balance, int aprInt, double monthlyPayment) {
    //Initialize 'balance', 'apr', and 'monthlyPayment'
    this.balance = balance;
    this.apr = aprInt / 100.0;
    this.monthlyPayment = monthlyPayment;
  }


  public int calculateMonthsUntilPaidOff() {
    // 'dailyRate' = apr / 365
    double dailyRate = apr / 365;
    //Round fractions of a cent up to the next cent for internal calculations
    double balanceDividedByMonthlyPayment = Math.ceil(balance/monthlyPayment * 100) / 100;
    //return -(1/30) * log(1 + 'balanceDividedByMonthlyPayment' * (1 - (1 + 'dailyRate')^30)) / log(1 + 'dailyRate')
    return (int) Math.ceil(-(1.0/30.0) * Math.log10(1 + balanceDividedByMonthlyPayment * (1 - Math.pow((1 + dailyRate), 30))) / Math.log10(1 + dailyRate));
  }

  public String buildOutputString(int monthsUntilPaidOff) {
    // return "It will take you 'monthsUntilPaidOff' months to pay off this card."
    return "It will take you "+monthsUntilPaidOff+" months to pay off this card.";
  }
}
