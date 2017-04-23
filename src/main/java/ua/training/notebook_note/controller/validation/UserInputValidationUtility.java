package ua.training.notebook_note.controller.validation;

import java.util.Scanner;

import ua.training.notebook_note.model.Model;
import ua.training.notebook_note.view.View;
import ua.training.notebook_note.view.ViewMessage;

public class UserInputValidationUtility {

	public static String inputIntValue(Scanner scanner, View view, String message) {
		view.printMessage(ViewMessage.TYPE, message, ViewMessage.COLON);
		String res = "";
		while(!(scanner.hasNext() && (res = scanner.next()).matches(""))){
			view.printWrongInput();
			view.printMessage(ViewMessage.TYPE, message, ViewMessage.COLON);
		}
		return res;
	}

	public static String inputStringValue(Scanner scanner, View view, String message, String regex) {
		view.printMessage(ViewMessage.TYPE, message, ViewMessage.COLON);
		String res = "";
		while(!(scanner.hasNext() && (res = scanner.next()).matches(regex))){
			view.printWrongInput();
			view.printMessage(ViewMessage.TYPE, message, ViewMessage.COLON);
		}
		return res;
	}

	
	
	
}
