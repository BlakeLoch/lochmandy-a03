/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Blake Lochmandy
 */

package baseline;

public class CalcClass {

  public String generateHeartRateTable(int restingHR, int age) {
    // create string heartRateTable = "Resting Pulse: 'restingHR'        Age: 'age'\n\nIntensity    | Rate\n-------------|--------\n"
    String heartRateTable = "\nResting Pulse: "+restingHR+"        Age: "+age+"\n\nIntensity    | Rate\n-------------|--------\n";
    // Loop from 55 to 95 incrementing by 5
    for (int i = 55; i <= 95 ; i+=5) {
      // Add rows with buildRow()
      heartRateTable += buildRow(i, calcHeartRate(restingHR, age, i));
    }
    // return heartRateTable
    return heartRateTable;
  }

  private int calcHeartRate(int restingHR, int age, int intensity) {
    // 'intensityPercent' = 'intensity' / 100
    double intensityPercent = intensity / 100.0;
    // return (((220 − 'age') − 'restingHR') * 'intensityPercent') + 'restingHR'
    return (int) Math.round(((220 - age) - restingHR) * intensityPercent) + restingHR;
  }

  private String buildRow(int intensity, int targetHeartRate) {
    // return "'intensity'%          | 'targetHeartRate' bpm\n"
    return intensity+"%          | "+targetHeartRate+" bpm\n";
  }

}
