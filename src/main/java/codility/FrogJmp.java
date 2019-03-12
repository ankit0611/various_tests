package codility;

public class FrogJmp {
  public static int solution(int X, int Y, int D) {
    if (X > Y) {
      return -1;
    }

    if (X < 1 || X > 1_000_000_000 || Y < 1 || Y > 1_000_000_000 || D < 1 || D > 1_000_000_000) {
      return -1;
    }

    int remainingDistance = Y - X;
    int remainder = remainingDistance % D;
    int quotient = remainingDistance / D;
    if (remainder > 0) {
      return quotient + 1;
    }
    return quotient;
  }
}
