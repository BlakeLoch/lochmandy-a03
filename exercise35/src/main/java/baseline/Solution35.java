/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

public class Solution35 {

  public static void main(String[] args) {

    // Link Helper Classes
    InputClass userInput = new InputClass();
    CalcClass calculations = new CalcClass();
    OutputClass output = new OutputClass();

    //Get Names From User
    String[] names = userInput.getNamesFromUser();

    //Pick Winner
    String winner = calculations.pickWinner(names);

    //Build WinnerLine
    String winnerLine = calculations.buildWinnerLine(winner);

    //Print WinnerLine
    output.printWinnerLine(winnerLine);

  }

}
