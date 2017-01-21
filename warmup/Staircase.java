import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

	// Create the padding based on the amount needed
	static String createPadding(int paddingAmount) {
		String output = "";
		int i;

		for (i = 0; i < paddingAmount; i += 1) {
			output += " ";
		}
		return output;
	}

	static String createStaircase(int height, String symbol) {
		String currentIteration = "", output = "";
		int i;

		for (i = height - 1; i >= 0; i -= 1) {
			currentIteration += symbol;
			output += createPadding(i) + currentIteration;

			if (i != 0) {
				output += "\n";
			}
		}
		return output;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// Get the height of the staircase
		System.out.print("Enter the height of the staircase: ");
		int height = s.nextInt();

		// Print out the staircase
		System.out.println(createStaircase(height, "#"));
	}

}