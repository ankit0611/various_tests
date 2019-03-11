package gfg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOperations {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    System.out.println(t);
    while (t-- > 0) {
      // Declaring ArrayList
      ArrayList<Character> clist = new ArrayList<>();

      int q = sc.nextInt();

      // Looping for queries
      while (q-- > 0) {
        char ch = sc.next().charAt(q);
        ManualArrayList obj = new ManualArrayList();

        if (ch == 'i') {
          char c = sc.next().charAt(q);
          obj.insert(clist, c);
        }

        if (ch == 'f') {
          char c = sc.next().charAt(q);
          obj.freq(clist, c);
        }
      }
    }
  }
}

class ManualArrayList {
  // Function to insert element
  public static void insert(ArrayList<Character> clist, char c) {
    clist.add(c);
  }

  // Function to count frequency of element
  public static void freq(ArrayList<Character> clist, char c) {

    if (clist.contains(c)) {
      System.out.println(Collections.frequency(clist, c));
    } else {
      System.out.println("Not Present");
    }
  }
}
