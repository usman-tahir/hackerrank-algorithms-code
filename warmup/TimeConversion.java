import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

	static String buildTimeString(String[] timeElements) {
		String output = "";
		int i;

		for (i = 0; i < timeElements.length; i += 1) {
			if (i == timeElements.length - 1) {
				output += timeElements[i].substring(0, 2);
			} else {
				output += timeElements[i] + ":";
			}
		}
		return output;
	}

	static String timeConverter(String time) {
		boolean timeIsAM = (time.indexOf("AM") != -1);
		String output = "";
		int i;

		if (timeIsAM) {
			String[] elements = time.split(":");
			if (elements[0].equals("12")) {
				elements[0] = "00";
			}
			output = buildTimeString(elements);

		} else {
			String[] elements = time.split(":");
			int hours = Integer.parseInt(elements[0]);

			if (hours == 12) {
				elements[0] = (hours + "");
			} else {
				elements[0] = (hours + 12 + "");
			}

			output = buildTimeString(elements);
		}
		return output;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// Ask the user for the time
		System.out.print("Enter the time: ");
		String time = s.next();
		System.out.println(timeConverter(time));
	}

}