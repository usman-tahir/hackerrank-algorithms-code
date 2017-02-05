import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DivisibleSumPairs {

  static int computeDivisiblePairSums(int[] elements, int divisor) {
    int count = 0, length = elements.length;
    int i, j;

    for (i = 0; i < length; i += 1) {
      for (j = 0; j < length; j += 1) {
        if ((i < j) && ((elements[i] + elements[j]) % divisor == 0)) {
          count += 1;
        }
      }
    }

    return count;
  }

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Enter the number of elements: ");
    int n = s.nextInt();

    System.out.print("Enter a divisor: ");
    int d = s.nextInt();

    int[] elements = new int[n];
    int index;

    for (index = 0; index < n; index += 1) {
      System.out.print("Enter element " + (index + 1) + ": ");
      elements[index] = s.nextInt();
    }

    System.out.println(computeDivisiblePairSums(elements, d));

  }

}
