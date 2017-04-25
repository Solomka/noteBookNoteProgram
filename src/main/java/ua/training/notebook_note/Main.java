package ua.training.notebook_note;

import ua.training.notebook_note.controller.Controller;
import ua.training.notebook_note.model.Model;
import ua.training.notebook_note.view.View;

/**
 * Main class starts up the program that reads subscriber's information from
 * console, validate it and saves validated information in the Model's
 * notebook's note object
 * 
 * @author Solomka
 * @version 1.0
 * @since 2017-04-25
 *
 */
public class Main {

	public static void main(String[] args) {

		// Initialization
		Model model = new Model();
		View view = new View();
		Controller controller = new Controller(model, view);

		// Start user's interaction
		controller.processUser();

	}

}
