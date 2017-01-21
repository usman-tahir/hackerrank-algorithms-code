import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlusMinus {

	static String getParityBreakdown(int[] numbers) {
		int positiveCount = 0, negativeCount = 0, zeroCount = 0;
		double positivePercentage, negativePercentage, zeroPercentage;
		String result = "";

		for (int i : numbers) {
			if (i > 0) {
				positiveCount += 1;
			} else if (i < 0) {
				negativeCount += 1;
			} else {
				zeroCount += 1;
			}
		}

		positivePercentage = (double)positiveCount / numbers.length;
		negativePercentage = (double)negativeCount / numbers.length;
		zeroPercentage = (double)zeroCount / numbers.length;

		return positivePercentage + "\n" + negativePercentage + "\n" + zeroPercentage;

	}
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// Get the number of elements to put into the array
		System.out.print("Enter the number of elements: ");
		int elements = s.nextInt();
		int[] numbers = new int[elements];

		int index;

		// Get input for each element and add it to the array
		for (index = 0; index < elements; index += 1) {
			System.out.print("Enter element #" + (index + 1) + ": ");
			numbers[index] = s.nextInt();
		}

		System.out.println(getParityBreakdown(numbers));
	}

}