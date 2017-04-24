package ua.training.notebook_note.controller.validation;

import java.util.Scanner;

import ua.training.notebook_note.model.Model;
import ua.training.notebook_note.view.View;
import ua.training.notebook_note.view.ViewMessage;

public final class UserInputValidationUtility {
	
	private UserInputValidationUtility(){
		throw new RuntimeException();
	}

	public static int inputIntValue(Scanner scanner, View view, String message) {
		view.printMessage(ViewMessage.TYPE, message, ViewMessage.COLON);		
		while(!(scanner.hasNextInt())){
			view.printWrongInput();
			view.printMessage(ViewMessage.TYPE, message, ViewMessage.COLON);
			scanner.next();
		}
		return scanner.nextInt();
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
