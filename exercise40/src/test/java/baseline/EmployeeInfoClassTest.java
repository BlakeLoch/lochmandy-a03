package baseline;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeInfoClassTest {

  @Test
  void buildTable() {
    EmployeeInfoClass table = new EmployeeInfoClass();

    String expected = """
        Name                | Position          | Separation Date
        --------------------|-------------------|----------------
        Jacquelyn Jackson   | DBA               |\s
        Jake Jacobson       | Programmer        |\s
        """;

    String actual = table.buildTable("Jac");

    assertEquals(expected, actual);
  }
}