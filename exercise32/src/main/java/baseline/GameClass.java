/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

public class GameClass {

  public void play() {
  //do
    // set the difficulty
    // set the answer
    // ask the user to guess
      // while the answer is incorrect
      // increment guess count
      // print guess guide
      // ask the user to guess again
    // print "You got it in 'guessCount' guesses!"
  // while exitGame is false
  }

  private int setDifficulty() {
    // Prompt user to enter difficulty
    // Loop to make sure user input is number
    // Return user input (mod 3 + 1)
  }

  private int isNumber(int number){
    // Try to parse as int
      // If success
        // return true
      // else
        // return false
  }

  private int setAnswer(int difficulty) {
    // return random number between 1 and 10 to the power of 'difficulty'
  }

  private String getGuess(){
    // prompt user for guess
    // return user input
  }

  private boolean checkGuess(String guess, int answer) {
    // check if number
      // if not, return false
    // parse as int
    // if user input matches answer
      // return true
    // else
      // return false
  }

  private String guideGuess (String guess, int answer){
    // check if number
    // if not, return ""
    // parse as int
    // if guess is higher
    // return too high
    // if guess is lower
    // return too low
  }

  private boolean exitGame() {
    // Ask if user wants to play again
    // Get user input (Y/N)
      // If Y return true
      // If N return false
  }

}
