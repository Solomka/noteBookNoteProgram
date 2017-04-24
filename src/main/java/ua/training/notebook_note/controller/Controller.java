package ua.training.notebook_note.controller;

import java.util.Objects;
import java.util.Scanner;

import ua.training.notebook_note.model.Model;
import ua.training.notebook_note.service.NoteBookNoteService;
import ua.training.notebook_note.view.View;

public class Controller {

	private Model model;
	private View view;

	public Controller(Model model, View view) {
		Objects.requireNonNull(model, "model can't be null");
		Objects.requireNonNull(view, "view can't be null");

		this.model = model;
		this.view = view;
	}

	public void processUser() {
		Scanner scanner = new Scanner(System.in);
		
		NoteBookNoteService.processNoteBookNoteCreation(model, view, scanner);
		view.printNoteBookNote(model.getNoteBooNoteBO());
	}

}
