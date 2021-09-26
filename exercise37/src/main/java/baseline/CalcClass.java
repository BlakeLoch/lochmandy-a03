package baseline;

public class CalcClass {

  public String generatePassword(int minimumLength, int specialCharCount, int numberCount) {
    // Create char array of length calcLength()
    // pick specialCharCount special characters
    // pick numberCount numbers
    // pick length - (specialCharCount + numberCount) letters
    // scramble them into password
  }

  public String buildOutputString(String password) {
    // return "Your password is 'password'"
  }

  private int calcLength(int minimumLength, int specialCharCount, int numberCount) {
    // minLengthRule = 2 * (specialCharCount + numberCount)
    // if minimumLength > minLengthRule
      // return minimumLength
    //else
      // return minLengthRule
  }

}
