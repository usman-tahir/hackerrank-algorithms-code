import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SaveThePrisoner {

  public static int determinePrisonerToWarn(int prisoners, int sweets, int id) {
    int i;

    for (i = 1; i < sweets; i += 1) {
      id += 1;
    }

    if (id < prisoners) {
      return id;
    }
    return (id % prisoners);
  }

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    // Get the number of test cases
    System.out.print("Enter the number of test cases: ");
    int testCases = s.nextInt();

    int index;
    for (index = 0; index < testCases; index += 1) {
      System.out.print("Enter the number of prisoners: ");
      int prisoners = s.nextInt();

      System.out.print("Enter the number of sweets: ");
      int sweets = s.nextInt();

      System.out.print("Enter the ID of the first prisoner who gets sweets: ");
      int id = s.nextInt();

      System.out.println(determinePrisonerToWarn(prisoners, sweets, id));
    }

  }

}
