import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinMaxSum {

	static long getMax(long[] numbers) {
		if (numbers.length == 1) {
			return numbers[0];
		} else {
			long currentMax = numbers[0];
			int index;

			for (index = 0; index < numbers.length; index += 1) {
				if (numbers[index] >= currentMax) {
					currentMax = numbers[index];
				}
			}
			return currentMax;
		}
	}

	static long getMin(long[] numbers) {
		if (numbers.length == 1) {
			return numbers[0];
		} else {
			long currentMin = numbers[0];
			int index;

			for (index = 0; index < numbers.length; index += 1) {
				if (numbers[index] <= currentMin) {
					currentMin = numbers[index];
				}
			}
			return currentMin;
		}
	}

	static String getMinMaxSum(long[] numbers) {
		long maximum = getMax(numbers), minimum = getMin(numbers);
		long sum = 0;

		for (long l : numbers) {
			sum += l;
		}
		// System.out.println("Sum is " + sum);
		return "" + (sum - maximum) + " " + (sum - minimum) + "";
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		// Get the five integers
		long[] numbers = new long[5];
		int index;

		for (index = 0; index < numbers.length; index += 1) {
			System.out.print("Enter element #" + (index + 1) + ": ");
			numbers[index] = s.nextInt();
		}

		System.out.println(getMinMaxSum(numbers));
	}

}