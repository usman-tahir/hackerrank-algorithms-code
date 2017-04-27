import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GradingStudents {

  static int roundGrade(int grade) {
    int remainder = grade % 10, roundedGrade = grade;
    System.out.println(remainder);

    if (remainder > 5) {
      roundedGrade = ((10 - remainder) < 3) ? (grade + (10 - remainder)) : roundedGrade;
    } else {
      roundedGrade = ((5 - remainder) < 3) ? (grade + (5 - remainder)) : roundedGrade;
    }
    return (grade < 38) ? grade : roundedGrade;
  }

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    // Get the number of students
    System.out.print("Enter the number of students: ");
    int n = s.nextInt();

    int i;
    for (i = 0; i < n; i += 1) {
      System.out.print("Please enter grade #" + (i + 1) + ": ");
      int g = s.nextInt();
      System.out.println("Your grade: " + roundGrade(g));
    }

  }

}
