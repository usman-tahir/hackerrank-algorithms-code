import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MigratoryBirds {

  static int getModeFromTypes(int[] types) {
    int globalMode = types[0];
    int globalModeCount = 0;
    int i, j, l = types.length;

    for (i = 0; i < l; i += 1) {
      int mode = types[i];
      int count = 0;
      for (j = 0; j < l; j += 1) {
        if (types[j] == mode) {
          count += 1;
        }
      }
      if (count > globalModeCount) {
        globalMode = mode;
        globalModeCount = count;
      }
    }
    return globalMode;
  }

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int n, i;
    int[] b;

    int n = s.nextInt(); // Number of birds
    b = new int[n]; // Contains the type of each bird

    for (i = 0; i < n; i += 1) {
      b[i] = s.nextInt(); // Gather the types of birds
    }

    System.out.println(globalMode(b));
  }

}
