package codility;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class PermMissingElem {
  public static int solution(int[] A) {
    if (A.length == 0) {
      return 1;
    }
    if (A == null || A.length <= 0 || A.length > 1_000_000) {
      return -1;
    }
    Set<Integer> allNumbers = Arrays.stream(A).boxed().collect(Collectors.toSet());

    for (int i = 1; i <= A.length + 1; i++) {
      if (!allNumbers.remove(i)) {
        return i;
      }
    }

    return -1;
  }
}
