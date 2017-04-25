package ua.training.notebook_note.controller;

import java.util.Objects;
import java.util.Scanner;

import ua.training.notebook_note.model.Model;
import ua.training.notebook_note.service.NoteBookNoteService;
import ua.training.notebook_note.view.View;

/**
 * Class that represents Controller and starts Service that processes notebook's
 * note creation
 * 
 * @author Solomka
 *
 */
public class Controller {

	private Model model;
	private View view;

	public Controller(Model model, View view) {
		Objects.requireNonNull(model);
		Objects.requireNonNull(view);

		this.model = model;
		this.view = view;
	}

	/**
	 * Starts up NoteBookNoteService that process notebook's note creation
	 */
	public void processUser() {
		Scanner scanner = new Scanner(System.in);

		NoteBookNoteService.processNoteBookNoteCreation(model, view, scanner);
		view.printNoteBookNote(model.getNoteBooNoteBO());
	}

}
