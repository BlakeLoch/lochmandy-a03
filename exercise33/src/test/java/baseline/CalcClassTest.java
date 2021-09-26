package baseline;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcClassTest {

  @Test
  void magic8BallTest1() {
    CalcClass calculations = new CalcClass();
    String expected = "Yes.";
    String actual = calculations.magic8Ball(0);
  }

  @Test
  void magic8BallTest2() {
    CalcClass calculations = new CalcClass();
    String expected = "Yes.";
    String actual = calculations.magic8Ball(1);
  }

  @Test
  void magic8BallTest3() {
    CalcClass calculations = new CalcClass();
    String expected = "Yes.";
    String actual = calculations.magic8Ball(2);
  }

  @Test
  void magic8BallTest4() {
    CalcClass calculations = new CalcClass();
    String expected = "Yes.";
    String actual = calculations.magic8Ball(3);
  }

  @Test
  void generateRandomNumber() {
    CalcClass calculations = new CalcClass();
    int randomNumber = calculations.generateRandomNumber();
    assertTrue(0 <= randomNumber && randomNumber <= 4);
  }
}