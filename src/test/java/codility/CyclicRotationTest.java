package codility;

import org.junit.Assert;
import org.junit.Test;

public class CyclicRotationTest {
  @Test
  public void solution1() throws Exception {
    Assert.assertArrayEquals(
        CyclicRotation.solution(new int[] {3, 8, 9, 7, 6}, 3), new int[] {9, 7, 6, 3, 8});
  }

  @Test
  public void solution2() throws Exception {
    Assert.assertArrayEquals(
        CyclicRotation.solution(new int[] {3, 8, 9, 7, 6}, 1), new int[] {6, 3, 8, 9, 7});
  }

  @Test
  public void solution3() throws Exception {
    Assert.assertArrayEquals(
        CyclicRotation.solution(new int[] {3, 8, 9, 7, 6}, 2), new int[] {7, 6, 3, 8, 9});
  }

  @Test
  public void solution4() throws Exception {
    Assert.assertArrayEquals(CyclicRotation.solution(new int[] {0, 0, 0}, 1), new int[] {0, 0, 0});
  }

  @Test
  public void solution5() throws Exception {
    Assert.assertArrayEquals(
        CyclicRotation.solution(new int[] {1, 2, 3, 4}, 4), new int[] {1, 2, 3, 4});
  }

  @Test
  public void solution6() throws Exception {
    Assert.assertArrayEquals(CyclicRotation.solution(new int[] {}, 4), new int[] {});
  }
}
