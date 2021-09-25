package baseline;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PaymentCalculatorTest {

  @Test
  void calculateMonthsUntilPaidOff() {
    PaymentCalculator creditCard = new PaymentCalculator(5000, 12, 100);
    double expected = 70;
    double actual = creditCard.calculateMonthsUntilPaidOff();
    assertEquals(expected, actual);
  }

  @Test
  void buildOutputString() {
    PaymentCalculator creditCard = new PaymentCalculator(5000, 12, 100);
    String expected = "It will take you 70 months to pay off this card.";
    String actual = creditCard.buildOutputString(70);
    assertEquals(expected, actual);
  }
}