import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BetweenTwoSets {

  static int greatestCommonDenominator(int a, int b) {
    while (b > 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }

  static int greatestCommonDenominator(int[] input) {
    int result = input[0];
    int index;

    for (index = 1; index < input.length; index += 1) {
      result = greatestCommonDenominator(result, input[index]);
    }
    return result;
  }

  static int leastCommonDenominator(int a, int b) {
    return a * (b / greatestCommonDenominator(a, b));
  }

  static int leastCommonDenominator(int[] input) {
    int result = input[0];
    int index;

    for (index = 1; index < input.length; index += 1) {
      result = leastCommonDenominator(result, input[index]);
    }
    return result;
  }

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    // Get the number of elements in the two lists
    System.out.print("Enter the number of elements in 'A': ");
    int a = s.nextInt();

    System.out.print("Enter the number of elements in 'B': ");
    int b = s.nextInt();

    int[] arrayA = new int[a], arrayB = new int[b];

    // Get the elements for each list
    int index;
    int lengthA = arrayA.length, lengthB = arrayB.length;

    for (index = 0; index < lengthA; index += 1) {
      System.out.print("Enter element #" + (index + 1)
        + " for 'A': ");
      arrayA[index] = s.nextInt();
    }

    System.out.println();

    for (index = 0; index < lengthB; index += 1) {
      System.out.print("Enter element #" + (index + 1)
        + " for 'B': ");
      arrayB[index] = s.nextInt();
    }

    int first = leastCommonDenominator(arrayA);
    int last = greatestCommonDenominator(arrayB);
    int count = 0;

    int i, j;
    for (i = first; i <= last; i += first) {
      if (last % i == 0) {
        count += 1;
      }
    }
    System.out.println(count);
  }

}
