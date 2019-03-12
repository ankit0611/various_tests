package codility;

import java.util.HashSet;
import java.util.Set;

public class PermMissingElem {
  public static int solution(int[] A) {
    if (A.length == 0) {
      return 1;
    }
    if (A == null || A.length <= 0 || A.length > 1_000_000) {
      return -1;
    }
    Set<Integer> allNumbers = new HashSet<>();

    for (int i = 1; i <= A.length + 1; i++) {
      allNumbers.add(i);
    }

    for (int i : A) {
      allNumbers.remove(i);
    }

    Integer[] leftover = allNumbers.stream().toArray(Integer[]::new);
    if (leftover.length <= 0 || leftover.length > 1) {
      return -1;
    }
    return leftover[0];
  }
}
