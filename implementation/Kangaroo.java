import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroo {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// Ask for the first Kangaroo's starting position and velocity
		System.out.print("Enter the first kangaroo's 'x' position: ");
		int firstStart = s.nextInt();

		System.out.print("Enter the first kangaroo's velocity: ");
		int firstVelocity = s.nextInt();

		// Ask for the second Kangaroo's starting position and velocity
		System.out.print("Enter the second kangaroo's 'x' position: ");
		int secondStart = s.nextInt();

		System.out.print("Enter the second kangaroo's velocity: ");
		int secondVelocity = s.nextInt();

		String result = "NO";
    int maximum = 0;

    do {
    	if ((firstStart + firstVelocity) == (secondStart + secondVelocity)) {
    		result = "YES";
    		break;
    	}
    	firstStart += firstVelocity;
    	secondStart += secondVelocity;
    	maximum++;
    } while (maximum <= 10000);

    System.out.println(result);

	}

}