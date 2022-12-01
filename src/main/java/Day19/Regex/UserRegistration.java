package Day19.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	static Scanner s = new Scanner(System.in);

	public static void nameCheck() {

		// Scanner class using to get the first name from the user.
		System.out.print("Enter your Last name: ");
		String Last_Name = s.next();

		// pattern using
		Pattern p = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");

		Matcher m = p.matcher(Last_Name);

		if (m.matches()) {
			System.out.println("Valid");
		} else {
			System.out.println("!Not valid.  \nEnter Correctly");
		}

	}

	public static void main(String[] args) {

		nameCheck();
	}

}
