import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ViralAdvertising {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    // Get the number of Days the advertisement was sent it
    System.out.print("Enter the number of days the advertisement was sent: ");
    int days = s.nextInt();

    int totalPeople = 0;
    int people = 5;
    int i;

    for (i = 0; i < days; i += 1) {
      people = (int)Math.floor(people / 2);
      totalPeople += people;
      people *= 3;
    }
    System.out.println(totalPeople);

  }

}
