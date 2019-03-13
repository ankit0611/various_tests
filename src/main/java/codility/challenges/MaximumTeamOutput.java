package codility.challenges;

import java.util.Arrays;

public class MaximumTeamOutput {

  public static int solution(int[] A, int[] B, int F) {
    if (A == null
        || A.length <= 0
        || A.length > 2_000_000
        || B == null
        || B.length <= 0
        || B.length > 2_000_000) {
      return -1;
    }
    if (A.length != B.length) {
      return -1;
    }

    if (A.length < F) {
      return -1;
    }

    int[] diffs = new int[A.length];
    Integer[] sortedIntices = new Integer[A.length];
    for (int i = 0; i < A.length; i++) {
      diffs[i] = Math.abs(A[i] - B[i]);
      sortedIntices[i] = i;
    }

    Arrays.sort(sortedIntices, (i, j) -> diffs[i] < diffs[j] ? 1 : -1);

    int[] outputArray = new int[A.length];

    int aCounter = F;
    int bCounter = A.length - F;

    int currentMax = 0;

    for (int i = 0; i < A.length; i++) {

      if (A[sortedIntices[i]] >= B[sortedIntices[i]]) {
        if (aCounter > 0) {
          outputArray[i] = A[sortedIntices[i]];
          aCounter--;
        } else {
          outputArray[i] = B[sortedIntices[i]];
          bCounter--;
        }
      } else {
        if (bCounter > 0) {
          outputArray[i] = B[sortedIntices[i]];
          bCounter--;
        } else {
          outputArray[i] = A[sortedIntices[i]];
          aCounter--;
        }
      }
    }

    return Arrays.stream(outputArray).sum();
  }
}
