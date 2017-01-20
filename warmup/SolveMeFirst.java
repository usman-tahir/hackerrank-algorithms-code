import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolveMeFirst {

	static int solveMeFirst(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a, b, sum;

		System.out.print("Enter the first number: ");
		a = s.nextInt();

		System.out.print("Enter the second number: ");
		b = s.nextInt();

		sum = solveMeFirst(a, b);
		System.out.println(a + " + " + b + " = " + sum);

		s.close();

	}

}