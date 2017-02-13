import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AngryProfessor {

  static String getCancelledClassStatus(int[] arrivalTimes, int threshold) {
    int current = 0, len = arrivalTimes.length;
    int i;

    for (i = 0; i < len; i += 1) {
      if (arrivalTimes[i] <= 0) {
        current += 1;
      }
    }
    return ((current >= threshold) ? "NO" : "YES");
  }

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    // Get the number of test cases
    System.out.print("Enter the number of test cases: ");
    int testCases = s.nextInt();

    // For each test case, determine the number of students in the class,
    // The attendance threshold, and the arrival time of the students.
    // Then, determine whether or not class was cancelled.
    int i;

    for (i = 0; i < testCases; i += 1) {
      System.out.print("Please enter the class size: ");
      int classSize = s.nextInt();

      System.out.print("Please enter the attendance threshold: ");
      int attendance = s.nextInt();

      int[] arrivalTimes = new int[classSize];
      int j;

      for (j = 0; j < classSize; j += 1) {
        System.out.print("Enter the arrival time for student #"
          + (j + 1) + ": ");
        arrivalTimes[j] = s.nextInt();
      }
      System.out.println(getCancelledClassStatus(arrivalTimes, attendance));
    }

  }

}
