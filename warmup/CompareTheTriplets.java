import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CompareTheTriplets {

	static int[] getScores(int numberOfScores) {
		Scanner s = new Scanner(System.in);

		int[] scores = new int[numberOfScores];
		int length = scores.length, index;

		for (index = 0; index < length; index += 1) {
			System.out.print("Score #" + (index + 1) + ": ");
			scores[index] = s.nextInt();
		}
		return scores;

	}

	static String compareScores(int[] a, int[] b, int numberOfScores) {
		int[] aScores = new int[numberOfScores];
		int[] bScores = new int[numberOfScores];
		int aTotal = 0, bTotal = 0;
		String result = "";
		int index;
		for (index = 0; index < numberOfScores; index += 1) {
			if (a[index] > b[index]) {
				aTotal += 1;
			} else if (a[index] < b[index]) {
				bTotal += 1;
			}
		}

		result = aTotal + " " + bTotal;
		return result;
	}

	public static void main(String[] args) {
		
		// First set of scores
		System.out.println("--- Person 1 ---");
		int[] a = getScores(3);

		// Second set of scores
		System.out.println("\n--- Person 2 ---");
		int[] b = getScores(3);

		// Compare the scores
		String result = compareScores(a, b, 3);
		System.out.println(result);

	}

}