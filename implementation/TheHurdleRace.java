import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TheHurdleRace {

  static int computeRequiredPotions(int currentJumpHeight, int[] hurdles) {
    int numberOfPotions = 0;
    int length = hurdles.length;
    int i;

    for (i = 0; i < length; i += 1) {
      if (!(currentJumpHeight >= hurdles[i])) {
        numberOfPotions += 1;
      }
    }
    return numberOfPotions;
  }

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    // Get the number of hurdles
    System.out.print("Enter the number of hurdles: ");
    int h = s.nextInt();

    // Get the current maximum jump height;
    System.out.print("Enter the current maximum jump height: ");
    int m = s.nextInt();

    // Get each hurdle height
    int[] a = new int[h];
    int l = a.length;
    int i;

    for (i = 0; i < l; i += 1) {
      System.out.print("Enter the height for hurdle #" + (i + 1) + ": ");
      a[i] = s.nextInt();
    }
    System.out.println("You need " + computeRequiredPotions(m, a)
      + " potions to clear all these hurdles.");

  }

}
