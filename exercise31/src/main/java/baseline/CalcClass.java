package baseline;

public class CalcClass {

  public String generateHeartRateTable(int restingHR, int age) {
    // create string heartRateTable = "Intensity    | Rate\n-------------|--------\n"
    // Loop from 55 to 95 incrementing by 5
      // Add rows with buildRow()
    // return heartRateTable
  }

  private int calcHeartRate(int restingHR, int age, int intensity) {
    // 'intensityPercent' = 'intensity' / 100
    // return (((220 − 'age') − 'restingHR') * 'intensityPercent') + 'restingHR'
  }

  private String buildRow(int intensity, int targetHeartRate) {
    // return "'intensity'%          | 'targetHeartRate' bpm"
  }

}
