package codility;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class PermMissingElemTest {

  @Test
  public void solution() {
    Assert.assertEquals(4, PermMissingElem.solution(new int[] {2, 3, 1, 5}));
  }

  @Test
  public void solutionNSingle() {
    Assert.assertEquals(-1, PermMissingElem.solution(new int[] {0}));
  }

  @Test
  public void solutionNSingle2() {
    Assert.assertEquals(2, PermMissingElem.solution(new int[] {1}));
  }

  @Test
  @Ignore
  public void solutionAllDistinctElements() {
    Assert.assertEquals(-1, PermMissingElem.solution(new int[] {1, 2, 2}));
  }

  @Test
  public void solutionElementsoutOfRange() {
    Assert.assertEquals(-1, PermMissingElem.solution(new int[] {5, 2, 3}));
  }

  @Test
  public void solutionEmpty() {
    Assert.assertEquals(1, PermMissingElem.solution(new int[] {}));
  }

  @Test
  public void solutionOnlyOneElement() {
    Assert.assertEquals(2, PermMissingElem.solution(new int[] {1}));
  }
}
