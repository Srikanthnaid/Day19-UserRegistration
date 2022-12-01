package Day19.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	static Scanner s = new Scanner(System.in);

	public static void mobileNumberCheck() {

		// Scanner class using to get the first name from the user.
		System.out.print("Enter your E-Mail: ");
		String Email = s.next();

		// pattern class using to set pattern
		Pattern p = Pattern.compile("^[a-zA-Z0-9]+[@][a-zA-Z]+[.][a-z]{2,3}$");
		// Matcher class
		Matcher m = p.matcher(Email);
		boolean result = m.matches();
		if (result) {
			System.out.println("Valid");
		} else {
			System.out.println("!Not valid.  \nEnter Correctly");

		}

	}

	public static void main(String[] args) {

		mobileNumberCheck();
	}

}
