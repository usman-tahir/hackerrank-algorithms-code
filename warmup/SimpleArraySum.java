import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SimpleArraySum {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n, sum, array_index;

		System.out.print("Enter the size of the array: ");
		n = s.nextInt();

		int[] numbers = new int[n];
		sum = 0;
		for (array_index = 0; array_index < n; array_index += 1) {

			System.out.print("Enter a number: ");
			numbers[array_index] = s.nextInt();
			sum += numbers[array_index];
		}
		System.out.println(sum);
	}

}