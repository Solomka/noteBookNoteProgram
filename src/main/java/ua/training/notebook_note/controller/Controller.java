package ua.training.notebook_note.controller;

import java.util.Objects;
import java.util.Scanner;

import ua.training.notebook_note.model.dto.NoteBookNoteDTO;
import ua.training.notebook_note.service.NoteBookNoteService;
import ua.training.notebook_note.view.View;

public class Controller {

	private NoteBookNoteService noteBookNoteService;
	private View view;

	public Controller(NoteBookNoteService noteService, View view) {
		Objects.requireNonNull(noteService, "noteBookNoteService can't be null");
		Objects.requireNonNull(view, "view can't be null");

		this.noteBookNoteService = noteService;
		this.view = view;
	}

	public void processUser() {
		Scanner scanner = new Scanner(System.in);
		
		final NoteBookNoteDTO noteBookNoteDTO = NoteBookNoteUserInputReader.readNoteBookNoteUserInput(view, scanner);
		//System.out.println("NoteBookNoteDTO: " + noteBookNoteDTO.toString());
		noteBookNoteService.addNoteBookNoteToModel(noteBookNoteDTO);
		view.printNoteBookNote(noteBookNoteService.getModelNoteBookNote());
	}

}
