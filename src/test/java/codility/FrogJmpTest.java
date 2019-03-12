package codility;

import org.junit.Assert;
import org.junit.Test;

public class FrogJmpTest {

  @Test
  public void solution1() {
    Assert.assertEquals(3, FrogJmp.solution(10, 85, 30));
  }

  @Test
  public void solutionXlessThanY() {
    Assert.assertEquals(-1, FrogJmp.solution(86, 85, 30));
  }

  @Test
  public void solutionXoutOfRange() {
    Assert.assertEquals(-1, FrogJmp.solution(1_000_000_001, 85, 30));
  }

  @Test
  public void solution4() {
    Assert.assertEquals(2, FrogJmp.solution(1, 5, 2));
  }
}
