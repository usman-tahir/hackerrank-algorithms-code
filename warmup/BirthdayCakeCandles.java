import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthdayCakeCandles {

	public static int maximum(int[] a) {
		int max = a[0];

		for (int i : a) {
			max = (i > max) ? (i) : (max);
		}
		return max;
	}

	public static int getNumberOfCandlesToBlowOut(int[] a) {
		int max = maximum(a);
		int count = 0;

		for (int i : a) {
			if (i == max) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n, l, i, c;
		int[] h;

		// Get the number of candles
		System.out.print("Enter the number of candles: ");
		n = s.nextInt();

		// Enter the heights of the 'n' individual candles
		h = new int[n];
		l = h.length;
		
		for (i = 0; i < l; i += 1) {
			System.out.print("Enter the height for candle #" + (i + 1) + ": ");
			h[i] = s.nextInt();
		}

		// Determine how many candles can be blown out
		c = getNumberOfCandlesToBlowOut(h);
		System.out.println("The number of candles to blow out is: " + c);

	}

}