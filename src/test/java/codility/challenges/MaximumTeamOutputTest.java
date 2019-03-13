package codility.challenges;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTeamOutputTest {

  @Test
  public void solution1() {
    Assert.assertEquals(
        10, MaximumTeamOutput.solution(new int[] {4, 2, 1}, new int[] {2, 5, 3}, 2));
  }

  @Test
  public void solution2() {
    Assert.assertEquals(
        18, MaximumTeamOutput.solution(new int[] {7, 1, 4, 4}, new int[] {5, 3, 4, 3}, 2));
  }

  @Test
  public void solution3() {
    Assert.assertEquals(
        15, MaximumTeamOutput.solution(new int[] {5, 5, 5}, new int[] {5, 5, 5}, 2));
  }

  @Test
  public void solutionEmpty() {
    Assert.assertEquals(-1, MaximumTeamOutput.solution(new int[] {}, new int[] {}, 0));
  }

  @Test
  public void solutionFmoreThanLength() {
    Assert.assertEquals(-1, MaximumTeamOutput.solution(new int[] {1}, new int[] {1}, 2));
  }

  @Test
  public void solutionOnlyOneElement() {
    Assert.assertEquals(1, MaximumTeamOutput.solution(new int[] {1}, new int[] {3}, 1));
  }

  @Test
  public void solution4() {
    Assert.assertEquals(
        13, MaximumTeamOutput.solution(new int[] {5, 5, 5}, new int[] {4, 3, 4}, 1));
  }

  @Test
  public void solution5() {
    Assert.assertEquals(
        13, MaximumTeamOutput.solution(new int[] {4, 3, 7}, new int[] {5, 1, 3}, 1));
  }

  @Test
  public void solutionAAlwaysBigger() {
    Assert.assertEquals(
        75,
        MaximumTeamOutput.solution(
            new int[] {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5},
            new int[] {4, 4, 4, 4, 4, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
            5));
  }
}
