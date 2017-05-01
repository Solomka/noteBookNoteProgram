package ua.training.notebook_note.controller;

import java.util.Objects;
import java.util.Scanner;

import ua.training.notebook_note.exception.RepeatedNicknameException;
import ua.training.notebook_note.model.Model;
import ua.training.notebook_note.model.dto.NoteBookNoteDTO;
import ua.training.notebook_note.service.NoteBookNoteService;
import ua.training.notebook_note.view.View;
import ua.training.notebook_note.view.ViewMessage;

/**
 * Class that represents Controller and handles user's notebook's note input and
 * its further adding process to the model
 *
 * 
 * @author Solomka
 *
 */
public class Controller {

	private View view;
	private Model model;
	private Scanner scanner;
	private NoteBookNoteDTO noteBookNoteDTO;

	public Controller(Model model, View view) {

		this.view = Objects.requireNonNull(view);
		this.model = Objects.requireNonNull(model);
		this.scanner = new Scanner(System.in);
		this.noteBookNoteDTO = new NoteBookNoteDTO();
	}

	public void processUser() {
		noteBookNoteDTO = NoteBookNoteUserInputReader.readNoteBookNoteUserInput(view, scanner);

		addNoteBookNoteToModel();
		view.printNoteBookNote(model.getNoteBooNoteBO());
	}

	private void addNoteBookNoteToModel() {
		try {
			NoteBookNoteService.processNoteBookNoteModelAddition(model, noteBookNoteDTO);
		} catch (RepeatedNicknameException e) {
			// System.err.println(e.getMessage());
			view.printMessage(e.getMessage() + ViewMessage.COLON + e.getNickname());
			repeatNoteNicknameUserInput();
		}
	}

	private void repeatNoteNicknameUserInput() {
		
		noteBookNoteDTO = NoteBookNoteUserInputReader.readNoteBookNoteUserInput(view, scanner, noteBookNoteDTO);

		addNoteBookNoteToModel();
	}

}
