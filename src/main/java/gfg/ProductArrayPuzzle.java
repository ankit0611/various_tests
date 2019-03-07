package gfg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ProductArrayPuzzle {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    while (t != 0) {
      int length = Integer.parseInt(br.readLine());
      String testString = br.readLine();
      int[] spitted = Arrays.stream(testString.split(" ")).mapToInt(Integer::parseInt).toArray();

      int[] result = getProductArray(spitted, length);
      Arrays.stream(result).forEach(s -> System.out.print(s + " "));
      System.out.println();
      t--;
    }
  }

  private static int[] getProductArray(int[] input, int length) {
    int[] product = new int[length];
    int temp = 1;

    for (int i = 0; i < length; i++) {
      product[i] = temp;
      temp *= input[i];
    }

    temp = 1;
    for (int i = length - 1; i >= 0; i--) {
      product[i] *= temp;
      temp *= input[i];
    }

    return product;
  }
}
