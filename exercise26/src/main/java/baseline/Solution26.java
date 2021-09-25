/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

public class Solution26 {

  public static void main(String[] args) {

    //Link InputClass and OutputClass
    InputClass userInput = new InputClass();
    OutputClass output = new OutputClass();

    // Get 'balance' from user
    double balance = userInput.getBalanceFromUser();
    // Get 'apr' from user
    double apr = userInput.getAprFromUser();
    // Get 'monthlyPayment' from user
    double monthlyPayment = userInput.getMonthlyPaymentFromUser();

    //Link PaymentCalculator class
    PaymentCalculator creditCard = new PaymentCalculator(balance, apr, monthlyPayment);

    // Calculate Months Until Paid Off
    int monthsUntilPaidOff = creditCard.calculateMonthsUntilPaidOff();

    // Build Output String
    String outputString = creditCard.buildOutputString(monthsUntilPaidOff);

    // Print Output String
    output.printOutputString(outputString);

  }

}
