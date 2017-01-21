import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDifference {

	static int getDiagonalDifference(int[][] matrix) {
		int diagonalOneSum = 0, diagonalTwoSum = 0;
		int i, j;

		// Get the diagonal one sum
		for (i = 0; i < matrix.length; i += 1) {
			diagonalOneSum += matrix[i][i];
		}

		// Get the diagonal two sum
		for (j = 0; j < matrix.length; j += 1) {
			diagonalTwoSum += matrix[j][matrix.length - 1 - j];
		}
		return (Math.abs(diagonalOneSum - diagonalTwoSum));
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int size, i, j;
		int counter = 0;

		System.out.print("Enter the size of the matrix: ");
		size = s.nextInt();

		int[][] matrix = new int[size][size];

		for (i = 0; i < size; i += 1) {
			for (j = 0; j < size; j += 1) {
				counter += 1;
				System.out.print("Enter a value for cell " + (counter) + ": ");
				matrix[i][j] = s.nextInt();
			}
		}
		int diagonalDifference = getDiagonalDifference(matrix);
		System.out.println(diagonalDifference);
	}

}