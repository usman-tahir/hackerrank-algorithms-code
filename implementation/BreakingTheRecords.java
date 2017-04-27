import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BreakingTheRecords {

	public static int[] getBrokenRecordCount(int[] a) {
		int max = a[0], min = a[0];
		int[] brokeHighestAndLowest = {0, 0};

		for (int i : a) {
			if (i > max) {
				max = i;
				brokeHighestAndLowest[0] += 1;
			}

			if (i < min) {
				min = i;
				brokeHighestAndLowest[1] += 1;
			}
		}
		return brokeHighestAndLowest;
	}

	public static void main(String[] args) {

		int n, i, l;
		int[] r;

		Scanner s = new Scanner(System.in);

		// Get the number of scores to be entered by the user
		System.out.print("Enter the number of scores: ");
		n = s.nextInt();
		r = new int[n];
		l = r.length;

		for (i = 0; i < l; i += 1) {
			System.out.print("Enter score #" + (i + 1) + ": ");
			r[i] = s.nextInt();
		}
		int[] brokeHighestAndLowest = getBrokenRecordCount(r);
		System.out.printf("%s %s\n", brokeHighestAndLowest[0], brokeHighestAndLowest[1]);
	}

}