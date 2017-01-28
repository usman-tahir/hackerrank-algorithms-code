import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AppleAndOrange {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int appleCounter = 0, orangeCounter = 0;

		// Get the x values for the house
		System.out.print("Enter value 'a' for the house: ");
		int houseBegin = s.nextInt();

		System.out.print("Enter value 'b' for the house: ");
		int houseEnd = s.nextInt();

		// Get the x value of the apple tree
		System.out.print("Enter the apple tree's 'x' value (position): ");
		int appleTreePosition = s.nextInt();

		// Get the x value of the orange tree
		System.out.print("Enter the orange tree's 'x' value (position): ");
		int orangeTreePosition = s.nextInt();

		// Get the number of fruit that fell from each tree
		System.out.print("Enter the number of apples that fell: ");
		int fallenApples = s.nextInt();

		System.out.print("Enter the number of oranges that fell: ");
		int fallenOranges = s.nextInt();

		int index;

		for (index = 0; index < fallenApples; index += 1) {
			System.out.print("Enter the position of fallen apple #" + (index + 1) + ": ");
			int a = s.nextInt();

			boolean boundaryFall = (((a + appleTreePosition) >= houseBegin) && ((a + appleTreePosition) <= houseEnd));
			
			if (boundaryFall) {
				appleCounter += 1;
			}
		}

		for (index = 0; index < fallenOranges; index += 1) {
			System.out.print("Enter the position of fallen orange #" + (index + 1) + ": ");
			int b = s.nextInt();

			boolean boundaryFall = (((b + orangeTreePosition) <= houseEnd) && ((b + orangeTreePosition) >= houseBegin));
			
			if (boundaryFall) {
				orangeCounter += 1;
			}
		}

		System.out.println("Apple counter: " + appleCounter + "\nOrange counter: " + orangeCounter);
	}

}