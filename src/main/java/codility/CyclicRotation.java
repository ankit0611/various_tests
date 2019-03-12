package codility;

public class CyclicRotation {
  public static int[] solution(int[] A, int K) {
    int[] B = new int[A.length];
    if (A == null || A.length <= 0 || A.length > 100 || K < 0 || K > 100) {
      return B;
    }

    int actualRotation = K % A.length;

    int counter = A.length - actualRotation;
    for (int i = 0; i < B.length; i++) {
      if (counter == A.length) {
        counter = 0;
      }
      if (A[counter] < -1000 || A[counter] > 1000) {
        return B;
      }
      B[i] = A[counter];
      counter++;
    }
    return B;
  }
}
