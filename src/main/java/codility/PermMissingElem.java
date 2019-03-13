package codility;

import java.util.Arrays;

public class PermMissingElem {
  public static int solution(int[] A) {
    if (A.length == 0) {
      return 1;
    }
    if (A == null || A.length <= 0 || A.length > 1_000_000) {
      return -1;
    }

    Arrays.sort(A);

    for (int i = 1; i <= A.length + 1; i++) {
      if (Arrays.binarySearch(A, i) < 0) {
        return i;
      }
    }

    return -1;
  }
}
