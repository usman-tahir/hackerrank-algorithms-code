import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BeautifulDaysAtTheMovies {

  static int reverse(int n) {
    String converted = n + "";
    String result = "";
    int len = converted.length();
    int i;

    for (i = len - 1; i >= 0; i -= 1) {
      result += converted.charAt(i);
    }
    return Integer.parseInt(result);
  }

  static boolean isDivisible(int n, int divisor) {
    return (Math.abs(n - reverse(n)) % divisor == 0);
  }

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    // Determine the starting day
    System.out.print("Enter the starting day: ");
    int start = s.nextInt();

    // Determine the ending day
    System.out.print("Enter the ending day: ");
    int end = s.nextInt();

    // Determine the divisor
    System.out.print("Enter the divisor: ");
    int divisor = s.nextInt();

    // Determine the number of days that are valid for going to the movies
    int i;
    int count = 0;
    for (i = start; i <= end; i += 1) {
      if (isDivisible(i, divisor)) {
        count += 1;
      }
    }
    System.out.println(count);

  }

}
