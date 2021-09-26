/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

import java.util.Random;
import java.util.Scanner;

public class GameClass {

  private static final Scanner input = new Scanner(System.in);
  private static final Random r = new Random();

  public void play() {
  //do
    do {
      // set the difficulty
      int difficulty = setDifficulty();
      // set the answer
      int answer = setAnswer(difficulty);
      // ask the user to guess
      String guess = getInitialGuess();
      int guessCount = 1;
      // while the answer is incorrect
      while (!checkGuess(guess, answer)) {
        // increment guess count
        guessCount++;
        // print guess guide and ask the user to guess again
        guess = getNextGuess(guideGuess(guess, answer));
      }
      // print "You got it in 'guessCount' guesses!"
      System.out.println("You got it in "+guessCount+" guesses!");
    }
  // while exitGame is false
    while (exitGame());
  }

  private int setDifficulty() {
    // Prompt user to enter difficulty
    System.out.print("Enter the difficulty level (1, 2, or 3): ");
    String difficulty = input.nextLine();
    while (isNotNumber(difficulty)) {
      System.out.println("Invalid input.");
      System.out.print("Enter the difficulty level (1, 2, or 3): ");
      difficulty = input.nextLine();
    }
    // Return user input
    int difficultyLevel = (Integer.parseInt(difficulty));
    //Restrict output to be 0, 1, 2
    difficultyLevel = Math.abs(difficultyLevel) % 3;
    //Adjust output to be 1, 2, or 3
    difficultyLevel = (difficultyLevel == 0) ? 3 : difficultyLevel;
    return difficultyLevel;
  }

  public boolean isNotNumber(String number) {
    //try to parse as int
    try {
      Integer.parseInt(number);
      //if it succeeds, return true
      return false;
    } catch (NumberFormatException e) {
      // if it fails, return false
      return true;
    }
  }

  private int setAnswer(int difficulty) {
    // return random number between 1 and 10 to the power of 'difficulty'
    return r.nextInt( (int) Math.pow(10, difficulty)) + 1;
  }

  private String getInitialGuess(){
    // prompt user for guess
    System.out.print("I have my number. What's your guess? ");
    // return user input
    return input.nextLine();
  }

  public boolean checkGuess(String guess, int answer) {
    // check if not number
    if (isNotNumber(guess)) {
      // if not, return false
      return false;
    }
    // parse as int
    int guessedNumber = Integer.parseInt(guess);
    // return true if user input matches answer
    return guessedNumber == answer;
  }

  public String guideGuess (String guess, int answer){
    // check if not number
    if (isNotNumber(guess)) {
      // return "Invalid input."
      return "Invalid input.";
    }
    // parse as int
    int guessedNumber = Integer.parseInt(guess);
    // if guess is higher
    if (guessedNumber > answer) {
      // return too high
      return "Too high.";
    }
    // if guess is lower
    else {
      // return too low
      return "Too low.";
    }
  }

  private String getNextGuess(String guideGuess){
    // prompt user for guess
    System.out.print(guideGuess+" Guess again: ");
    // return user input
    return input.nextLine();
  }

  private boolean exitGame() {
    // Ask if user wants to play again
    System.out.print("Do you wish to play again (Y/N)? ");
    // Get user input (Y/N)
    String userInput = input.nextLine();
    // loop to restrict input to y or n
    while (!userInput.equalsIgnoreCase("Y") && !userInput.equalsIgnoreCase("N")) {
      System.out.println("Please enter Y or N.");
      userInput = input.nextLine();
    }
    // If Y return true
    return userInput.equalsIgnoreCase("Y");
  }

}
