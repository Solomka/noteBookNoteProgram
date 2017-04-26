package ua.training.notebook_note.controller;

import java.util.Objects;
import java.util.Scanner;

import ua.training.notebook_note.exception.RepeatedNicknameException;
import ua.training.notebook_note.model.Model;
import ua.training.notebook_note.model.dto.NoteBookNoteDTO;
import ua.training.notebook_note.service.NoteBookNoteService;
import ua.training.notebook_note.view.View;

/**
 * Class that represents Controller and starts up Service that processes
 * notebook's note creation
 * 
 * @author Solomka
 *
 */
public class Controller {

	private Model model;
	private View view;

	public Controller(Model model, View view) {

		this.model = Objects.requireNonNull(model);
		this.view = Objects.requireNonNull(view);
	}

	/**
	 * Starts up NoteBookNoteService that process notebook's note creation
	 */
	public void processUser() {
		Scanner scanner = new Scanner(System.in);
		
		NoteBookNoteDTO noteBookNoteDTO = NoteBookNoteUserInputReader.readNoteBookNoteUserInput(view, scanner);
		try {
			NoteBookNoteService.processNoteBookNoteModelAddition(noteBookNoteDTO);
		} catch (RepeatedNicknameException e) {
			//System.err.println(e.getMessage());
			noteBookNoteDTO = NoteBookNoteUserInputReader.readNoteBookNoteUserInput(view, scanner, noteBookNoteDTO);
			NoteBookNoteService.processNoteBookNoteModelAddition(noteBookNoteDTO);
		}

		
		view.printNoteBookNote(model.getNoteBooNoteBO());
	}

}
