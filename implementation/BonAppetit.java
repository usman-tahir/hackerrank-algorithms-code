import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BonAppetit {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    // Get the number of food items, and the index of the un-eaten item
    System.out.print("Enter the number of food items purchased: ");
    int n = s.nextInt();

    System.out.print("Enter the index of the un-eaten item: ");
    int u = s.nextInt();

    // Determine how much Anna was charged by Brian
    System.out.print("Enter how much was charged by Brian: ");
    int c = s.nextInt();

    int[] foodItemPrices = new int[n];
    int totalCost = 0;
    int index;

    for (index = 0; index < n; index += 1) {
      System.out.print("Enter the price for food item #" + (index + 1) + ": ");
      foodItemPrices[index] = s.nextInt();
      totalCost += ((index != u) ? foodItemPrices[index] : 0);
    }

    if (totalCost / 2 == c) {
      System.out.println("Bon Appetit");
    } else {
      System.out.println(c - (totalCost / 2));
    }

  }

}
