import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SockMerchant {

  static int getMatchingPairs(int[] pile) {
    int count = 0, len = pile.length;
    int swap = -1; // Swap out matching pairs to prevent 'bad' matches
    int i, j;

    for (i = 0; i < len; i += 1) {
      for (j = 0; j < len; j += 1) {
        if ((i < j) && (pile[i] == pile[j])) {
          if (pile[i] != swap && pile[j] != swap) {
            count += 1;
            pile[i] = swap;
            pile[j] = swap;
          }
        }
      }
    }
    return count;
  }

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    // Get the number of socks in the pile
    System.out.print("Enter the number of socks in the pile: ");
    int n = s.nextInt();

    int[] p = new int[n];
    int index;

    for (index = 0; index < n; index += 1) {
      System.out.print("Enter the color (int) value for sock #"
        + (index + 1) + ": ");
        
      p[index] = s.nextInt();
    }
    System.out.println(getMatchingPairs(p));

  }

}
