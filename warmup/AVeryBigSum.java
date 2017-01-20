import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AVeryBigSum {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("How many elements will the array have? ");
		int elements = s.nextInt();
		int[] numbers = new int[elements];
		int index;

		long sum = 0;
		for (index = 0; index < elements; index += 1) {
			System.out.print("Please enter element #" + (index + 1) + ": ");
			int number = s.nextInt();
			numbers[index] = number;
			sum += number;
		}
		System.out.println(sum);
	}

}