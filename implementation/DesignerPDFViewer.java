import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DesignerPDFViewer {
	static Scanner s = new Scanner(System.in);

	static int getMax(int[] numbers) {
		int currentMax = numbers[0];
		int i;

		for (i = 0; i < numbers.length; i += 1) {
			if (numbers[i] >= currentMax) {
				currentMax = numbers[i];
			}
		}
		return currentMax;
	}

	static int[] getLetterHeights() {
		int[] heights = new int[26];
		String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", 
			"n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		int index;

		for (index = 0; index < letters.length; index += 1) {
			System.out.print("Enter a height for '" + letters[index] + "': ");
			heights[index] = s.nextInt();
		}
		return heights;
	}

	static int getPosition(String letter) {
		String letters = "abcdefghijklmnopqrstuvwxyz";
		return letters.indexOf(letter);
	}

	static int getHighlightedStringArea(String letters, int[] letterHeights) {
		String[] atomicLetters = letters.split("");
		int[] heights = new int[letters.length()];
		int i;

		for (i = 0; i < atomicLetters.length; i += 1) {
			heights[i] = letterHeights[getPosition(atomicLetters[i])];
		}

		int maxLetterLength = getMax(heights);
		return (maxLetterLength * letters.length() * 1);
	}

	public static void main(String[] args) {

		int[] letterHeights = getLetterHeights();
		int num = getHighlightedStringArea("abc", letterHeights);
		System.out.println(num);
	}

}