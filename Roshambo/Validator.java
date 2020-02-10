package Roshambo;


import java.util.Scanner;

public class Validator {

	/**
	 * Get any valid integer.
	 */
	public static int getInt(Scanner scnr, String prompt) {
		// This approach use "hasNext" look ahead.
		System.out.print(prompt);
		while (!scnr.hasNextInt()) {
			scnr.nextLine(); // clear bad line.
			System.out.println("Sorry, I can't read that. Enter a whole number, using digits.");
			System.out.println(prompt);
		}
		int result = scnr.nextInt();
		scnr.nextLine(); // clear for next line of input.
		return result;
	}

	/**
	 * Get any valid double.
	 */
	public static String yesOrNo(Scanner scnr, String prompt) {

		boolean isValid = false;

		String input;

		System.out.println(prompt);

		do {

			input = getString(scnr,"");

			if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("n")){

				isValid = true;

			} else {

				System.out.println("Please enter \"Y\" or \"N\". ");

				isValid = false;

			}

		} while (!isValid);

		return input;

	}

	/**

	 * Return a true or a false based on the response for the above Validator

	 */

	public static String goAgain(Scanner scnr) {
		String input;
		boolean loop = true;
		String s="";
		scnr.next();

		input = scnr.next();
		do {
		if (input.equalsIgnoreCase("y")) {
			
			s= "y";
			loop =true;
			;
		}
		else if (input.equalsIgnoreCase("n")){

			s= "n";
			loop = true;
			;
		}
		else { 
			loop = false;
			System.out.println("Please only enter (y/n): ");
		input = scnr.nextLine();
		}
	
		}while (loop);
		return s;
	}
	public static double getDouble(Scanner scnr, String prompt) {
		// This approach use "hasNext" look ahead.
		boolean isValid = false;
		do {
			System.out.print(prompt);
			isValid = scnr.hasNextDouble();
			if (!isValid) {
				scnr.nextLine(); // clear bad line.
				System.out.println("Sorry, I can't read that. Enter a number, using digits.");
			}
		} while (!isValid);

		double number = scnr.nextDouble();
		scnr.nextLine(); // clear for next line of input.
		return number;
	}

	/**
	 * Get any string.
	 */
	public static String getString(Scanner scnr, String prompt) {
		// This approach uses exception handling.
		System.out.print(prompt);
		return scnr.nextLine();
	}

	/**
	 * Get any valid integer between min and max.
	 */
	public static int getInt(Scanner scnr, String prompt, int min, int max) {
		boolean isValid = false;
		int number;
		do {
			number = getInt(scnr, prompt);

			if (number < min) {
				isValid = false;
				System.out.println("The number must be at least " + min);
			} else if (number > max) {
				isValid = false;
				System.out.println("The number must not be larger than " + max);
			} else {
				isValid = true;
			}

		} while (!isValid);
		return number;
	}

	/**
	 * Get any valid double between min and max.
	 */
	public static double getDouble(Scanner scnr, String prompt, double min, double max) {
		boolean isValid = false;
		double number;
		do {
			number = getDouble(scnr, prompt);

			if (number < min) {
				isValid = false;
				System.out.println("The number must be at least " + min);
			} else if (number > max) {
				isValid = false;
				System.out.println("The number must not be larger than " + max);
			} else {
				isValid = true;
			}

		} while (!isValid);
		return number;
	}

	/**
	 * Get a string of input from the user that must match the given regex.
	 */
	public static String getStringMatchingRegex(Scanner scnr, String prompt, String regex) {
		boolean isValid = false;
		String input;
		do {
			input = getString(scnr, prompt);

			if (input.matches(regex)) {
				isValid = true;
			} else {
				System.out.println("Input must match the appropriate format.");
				isValid = false;
			}

		} while (!isValid);
		return input;
	}
	
	/*
	 * 
	 * get a boolean value from the user
	 * 
	 */
	
	public static String getDate(Scanner scnr, String prompt) {
		String regex = "^\\d{2}-\\d{2}-\\d{4}";
		boolean isValid = false;
		String input;
		do {
			input = getString(scnr, prompt);

			if (input.matches(regex)) {
				isValid = true;
			} else {
				System.out.println("Input must match the appropriate format (dd-mm-yyyy");
				isValid = false;
			}

		} while (!isValid);
		return input;
	}
	

	public static String getStringMatchingRegexCustomError1(Scanner scnr, String prompt, String regex, String errorMessage) {

		boolean isValid = false;

		String input;

		do {

			input = getString(scnr, prompt);



			if (input.matches(regex)) {

				isValid = true;

			} else {

				System.err.println(errorMessage);

				isValid = false;

			}



		} while (!isValid);

		return input;

	}
	public static String getRoshambp(Scanner scnr) {
		String regex = "[RrPpSs]";
		boolean isValid = false;
		String input;
		do {
			input = getStringOne(scnr);
			try {
			if (input.matches(regex)) {
				return input;
//			} else {
			}
			}catch (Exception e) {
				System.out.println("Input must match the appropriate format (R/P/S");
//				isValid = false;
			}
			
		} while (!input.equalsIgnoreCase("r") || !input.equalsIgnoreCase("p") || !input.contentEquals("s"));
		return input;
	}

	private static String getStringOne(Scanner scnr) {
		// TODO Auto-generated method stub
		String input = scnr.nextLine();
		return input;
	}
	public static String getStringMatchingRegexCustomError(Scanner scnr, String prompt, String regex, String errorMessage) {

		boolean isValid = false;

		String input;

		do {

			input = getString(scnr, prompt);



			if (input.matches(regex)) {

				isValid = true;

			} else {

				System.err.println(errorMessage);

				isValid = false;

			}



		} while (!isValid);

		return input;

	}
}