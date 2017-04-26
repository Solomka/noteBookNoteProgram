package ua.training.notebook_note.controller;

import java.util.Scanner;

import ua.training.notebook_note.view.View;
import ua.training.notebook_note.view.ViewMessage;

/**
 * Utility class that provides methods for validated user's input from console
 * 
 * @author Solomka
 *
 */
public final class UserInputProcessUtility {

	private UserInputProcessUtility() {
		throw new RuntimeException();
	}

	/**
	 * Reads int value from console
	 * 
	 * @param scanner
	 *            simple text scanner which can parse primitive types and
	 *            strings using regular expressions
	 * @param view
	 *            view that represents data to the user
	 * @param message
	 *            main informative part of the message that will be represented
	 *            to the user
	 * @return
	 */
	public static int inputIntValue(Scanner scanner, View view, String message) {
		view.printMessage(ViewMessage.TYPE, message, ViewMessage.COLON);
		while (!(scanner.hasNextInt())) {
			view.printWrongInput();
			view.printMessage(ViewMessage.TYPE, message, ViewMessage.COLON);
			scanner.next();
		}

		int result = scanner.nextInt();

		// consume the last newline character of the user's int input
		scanner.nextLine();

		return result;
	}

	/**
	 * Reads String value from console that matches to the provided regex
	 * expression
	 * 
	 * @param scanner
	 *            simple text scanner which can parse primitive types and
	 *            strings using regular expressions
	 * @param view
	 *            view that represents data to the user
	 * @param message
	 *            main informative part of the message that will be represented
	 *            to the user
	 * @param regex
	 *            regex expression which the user String input has to match
	 * @return
	 */
	public static String inputStringValue(Scanner scanner, View view, String message, String regex) {
		view.printMessage(ViewMessage.TYPE, message, ViewMessage.COLON);

		String res = "";
		while (!(scanner.hasNextLine() && (res = scanner.nextLine()).matches(regex))) {
			view.printWrongInput();
			view.printMessage(ViewMessage.TYPE, message, ViewMessage.COLON);
		}

		return res;
	}
}
