package dcp;

import java.util.Arrays;

public class MaximumTeamOutput {

  public static void main(String[] args) {
    int[] A = {7, 1, 4, 4};
    int[] B = {5, 3, 4, 3};
    int F = 2;
    solution(A, B, F);
  }

  public static int solution(int[] A, int[] B, int F) {
    int[] outputArray1 = new int[A.length];
    int[] outputArray2 = new int[A.length];
    int[] outputArray = new int[A.length];

    for (int i = 0; i < A.length; i++) {
      for (int j = 0; i + j < A.length; j++) {
        if (outputArray1[j] < A[i + j]) {
          outputArray1[j] = A[i + j];
        }

        if (outputArray2[j] < B[i + j]) {
          outputArray2[j] = B[i + j];
        }
      }
    }

    for (int i = 0; i < B.length - (B.length - F); i++) {}

    return Arrays.stream(outputArray).sum();
  }
}
