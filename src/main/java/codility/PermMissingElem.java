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

    if (allNumbers.size() != A.length) {
      return -1;
    }

    for (int i = 1; i <= A.length + 1; i++) {
      allNumbers.add(i);
    }

    for (int i : A) {
      if (i < 1 || i > (A.length + 1)) {
        return -1;
      }
      allNumbers.remove(i);
    }

    Integer[] leftover = allNumbers.stream().toArray(Integer[]::new);
    if (leftover.length <= 0 || leftover.length > 1) {
      return -1;
    }
    return leftover[0];
  }
}
