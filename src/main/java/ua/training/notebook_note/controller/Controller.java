package ua.training.notebook_note.controller;

import java.util.Scanner;

import ua.training.notebook_note.model.Model;
import ua.training.notebook_note.view.View;

public class Controller {

	private Model model;
	private View view;

	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}

	public void processUser() {
		Scanner scanner = new Scanner(System.in);
		new NoteBookNoteInputService(model, view, scanner).processNoteBookNoteCreation();
	}

}
