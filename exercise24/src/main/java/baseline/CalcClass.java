/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 first_name last_name
 */
package baseline;

import java.util.Arrays;

public class CalcClass {

  public boolean isAnagram(String string1, String string2) {
    // sorted1 = sort string1 alphabetically
    String sorted1 = sortString(string1.toLowerCase());
    // sorted2 = sort string2 alphabetically
    String sorted2 = sortString(string2.toLowerCase());
    // if 'sorted1' = 'sorted2'
    // return true
    // else
    // return false
    return sorted1.equalsIgnoreCase(sorted2);
  }

  private String sortString(String inputString) {
    // Convert 'inputString' to character array 'stringArray'
    char[] stringArray = inputString.toCharArray();
    // Sort 'stringArray' alphabetically
    Arrays.sort(stringArray);
    //  return 'outputString' = Convert 'stringArray' to string
    return Arrays.toString(stringArray);
  }

  public String buildOutputString(String string1, String string2, boolean anagram) {
    // if 'anagram' = true
    if (anagram) {
      // return "'string1' and 'string2' are anagrams."
      return "\"" + string1 + "\" and \"" + string2 + "\" are anagrams.";
    }
    // else
    else {
      // return "'string1' and 'string2' are not anagrams."
      return "\"" + string1 + "\" and \"" + string2 + "\" are not anagrams.";
    }
  }

}
