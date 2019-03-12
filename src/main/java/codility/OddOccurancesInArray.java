package codility;

import java.util.HashSet;

public class OddOccurancesInArray {

  public static int solution(int[] A) {

    if (A == null || A.length <= 0 || A.length > 1_000_000 || (A.length % 2) == 0) {
      return -1;
    }

    HashSet<Integer> uniqueNumbers = new HashSet<>();
    for (int i : A) {
      if (i < 1 || i > 1_000_000_000) {
        return -1;
      }
      if (uniqueNumbers.contains(i)) {
        uniqueNumbers.remove(i);
      } else {
        uniqueNumbers.add(i);
      }
    }

    if (uniqueNumbers.size() > 1) {
      return -1;
    }
    return (int) uniqueNumbers.stream().toArray()[0];
  }
}
