package codility;

import org.junit.Assert;
import org.junit.Test;

public class OddOccurancesInArrayTest {

  @Test
  public void solution1() {
    Assert.assertEquals(-1, OddOccurancesInArray.solution(new int[] {1, 1, 2, 2, 0}));
  }

  @Test
  public void solution2() {
    Assert.assertEquals(7, OddOccurancesInArray.solution(new int[] {9, 3, 9, 3, 9, 7, 9}));
  }

  @Test
  public void solution3() {
    Assert.assertEquals(-1, OddOccurancesInArray.solution(new int[100001]));
  }

  @Test
  public void solution4() {
    Assert.assertEquals(-1, OddOccurancesInArray.solution(new int[] {1, 2}));
  }

  @Test
  public void solution5() {
    Assert.assertEquals(-1, OddOccurancesInArray.solution(new int[] {9, 3, 9, 3, 9, 7, 9, 8, 2}));
  }
}
