import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CircularArrayRotation {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Enter element one: ");
		int n = s.nextInt();

		System.out.print("Enter element two: ");
		int k = s.nextInt();

		System.out.print("Enter element three: ");
		int q = s.nextInt();

		// Set up the array
		int[] numbers = new int[n];
		int i;

		for (i = 0; i < n; i += 1) {
			System.out.print("Enter element #" + (i + 1) + ": ");
			numbers[i] = s.nextInt();
		}

		int rotation = k % n;
		for (i = 0; i < q; i += 1) {
			System.out.print("Enter an index: ");
			int index = s.nextInt();

			if (index - rotation >= 0) {
				System.out.println(numbers[index - rotation]);
			} else {
				System.out.println(numbers[index - rotation + numbers.length]);
			}
		}

	}

}