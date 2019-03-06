/*
 * Created: 06.03.2019 / srivastava
 */
package gfg;

import java.util.Scanner;

public class FirstNonRepeatingCharInString {
  public static String getFirstNonRepeatingChar(String input) {

    int length = input.length();
    char[] charArray = input.toCharArray();

    for (int i = 0; i < length; i++) {
      if (input.indexOf(charArray[i]) == input.lastIndexOf(charArray[i])) {
        return Character.toString(charArray[i]);
      }
    }
    return "-1";
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = Integer.parseInt(sc.next());
    while (t != 0) {
      int length = Integer.parseInt(sc.next());
      String testString = sc.next();
      System.out.println(getFirstNonRepeatingChar(testString));

      t--;
    }
  }
}
