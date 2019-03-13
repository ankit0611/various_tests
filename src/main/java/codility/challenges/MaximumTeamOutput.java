package codility.challenges;

import java.util.Arrays;
import java.util.stream.IntStream;

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

    int[] sortedIntices =
        IntStream.range(0, A.length)
            .boxed()
            .sorted((i, j) -> Math.abs(A[i] - B[i]) < Math.abs(A[j] - B[j]) ? 1 : -1)
            .mapToInt(ele -> ele)
            .toArray();

    int[] outputArray = new int[A.length];

    int aCounter = F;
    int bCounter = A.length - F;

    int currentMax = 0;

    for (int i = 0; i < A.length; i++) {

      if (A[sortedIntices[i]] > B[sortedIntices[i]]) {

        if (aCounter > 0) {
          outputArray[i] = A[sortedIntices[i]];
          aCounter--;
        } else {
          outputArray[i] = B[sortedIntices[i]];
          bCounter--;
        }
      } else if (B[sortedIntices[i]] > A[sortedIntices[i]]) {

        if (bCounter > 0) {
          outputArray[i] = B[sortedIntices[i]];
          bCounter--;
        } else {
          outputArray[i] = A[sortedIntices[i]];
          aCounter--;
        }
      } else if (A[sortedIntices[i]] == B[sortedIntices[i]]) {
        if (i == A.length - 1) {
          if (aCounter > 0) {
            outputArray[i] = A[sortedIntices[i]];
            aCounter--;
          } else {
            outputArray[i] = B[sortedIntices[i]];
            bCounter--;
          }
        } else {
          if (A[i + 1] > B[i + 1]) {
            if (bCounter > 0) {
              outputArray[i] = B[sortedIntices[i]];
              bCounter--;
            } else {
              outputArray[i] = A[sortedIntices[i]];
              aCounter--;
            }
          } else {
            if (aCounter > 0) {
              outputArray[i] = A[sortedIntices[i]];
              aCounter--;
            } else {
              outputArray[i] = B[sortedIntices[i]];
              bCounter--;
            }
          }
        }
      }
    }

    return Arrays.stream(outputArray).sum();
  }
}
