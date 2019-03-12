package codility;

import org.junit.Assert;
import org.junit.Test;

public class BinaryGap {
  public static String getBinaryString(int N) {
    return Integer.toBinaryString(N);
  }

  public static int solution(int N) {
    if (N < 1 || N > 2_147_483_647) {
      return 0;
    }
    String binString = getBinaryString(N);
    char[] binArray = binString.toCharArray();

    int start = 0;
    int end = binString.length();
    int finalGap = 0;
    int currentGap = 0;
    boolean foundOne = false;

    while (start < end) {
      if (binArray[start] == '0' && foundOne) {
        currentGap++;
      } else {
        foundOne = true;
        if (currentGap > finalGap) {
          finalGap = currentGap;
        }
        currentGap = 0;
      }
      start++;
    }

    return finalGap;
  }

  @Test
  public void testSolution() {
    Assert.assertEquals(solution(9), 2);
    Assert.assertEquals(solution(529), 4);
    Assert.assertEquals(solution(20), 1);
    Assert.assertEquals(solution(15), 0);
    Assert.assertEquals(solution(1041), 5);
    Assert.assertEquals(solution(32), 0);
  }

  @Test
  public void testBinaryString() {
    Assert.assertEquals("1001", getBinaryString(9));
    Assert.assertEquals("1000010001", getBinaryString(529));
    Assert.assertEquals("10100", getBinaryString(20));
    Assert.assertEquals("1111", getBinaryString(15));
    Assert.assertEquals("100000", getBinaryString(32));
    Assert.assertEquals("10000010001", getBinaryString(1041));
  }
}
