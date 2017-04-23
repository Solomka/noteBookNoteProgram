package ua.training.notebook_note.controller;

import java.util.Scanner;

import ua.training.notebook_note.model.Model;
import ua.training.notebook_note.model.dto.NoteBookNoteDTO;
import ua.training.notebook_note.service.NoteBookNoteService;
import ua.training.notebook_note.view.View;

public class Controller {

	private NoteBookNoteService noteService;
	private View view;

	public Controller(NoteBookNoteService noteService, View view) {
		this.noteService = noteService;
		this.view = view;
	}

	public void processUser() {
		Scanner scanner = new Scanner(System.in);
		NoteBookNoteDTO noteBookNoteDTO = NoteBookNoteInputController.processNoteBookNoteUserInput(noteService, view, scanner);
		noteService.addNoteBookNoteToModel(noteBookNoteDTO);
		view.printNoteBookNote(noteService.getNoteBooNote());
	}

}
