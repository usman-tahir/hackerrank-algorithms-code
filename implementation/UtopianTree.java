import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UtopianTree {

  static int calculatedGrowth(int cycles) {
    int growth = 1;
    if (cycles == 0) {
      return growth;
    } else {
      int index;
      for (index = 0; index < cycles; index += 1) {
        if (index % 2 == 0) {
          growth *= 2;
        } else {
          growth += 1;
        }
      }
    }
    return growth;
  }

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    // Get the number of testCases
    System.out.print("Enter the number of test cases: ");
    int t = s.nextInt();

    // Get the number of cycles for each test case
    int[] c = new int[t];
    int i;

    for (i = 0; i < t; i += 1) {
      System.out.print("Enter the number of growth cycles for test case #"
        + (i + 1) + ": ");

      c[i] = s.nextInt();
    }

    int init = 1; // The initial height of the tree
    for (int cycle : c) {
      System.out.println(calculatedGrowth(cycle));
    }
  }

}
