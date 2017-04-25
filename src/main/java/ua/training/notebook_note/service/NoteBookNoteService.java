package ua.training.notebook_note.service;

import java.util.Objects;
import java.util.Scanner;

import ua.training.notebook_note.model.Model;
import ua.training.notebook_note.model.dto.NoteBookNoteDTO;
import ua.training.notebook_note.model.entity.NoteBookNoteBO;
import ua.training.notebook_note.service.converter.NoteBookNoteBOConverter;
import ua.training.notebook_note.view.View;

/**
 * Class that processes noteBook note creation
 * <p>
 * It invokes service that provides validated subscriber's information from
 * console and fulfill its adding to the model
 * 
 * @author Solomka
 *
 */
public class NoteBookNoteService {

	private Model model;
	private View view;
	private Scanner scanner;

	private NoteBookNoteDTO noteBookNoteDTO;

	private NoteBookNoteService(Model model, View view, Scanner scanner) {
		Objects.requireNonNull(model);
		Objects.requireNonNull(view);
		Objects.requireNonNull(scanner);

		this.model = model;
		this.view = view;
		this.scanner = scanner;
	}

	/**
	 * Creates instance of this class and starts up noteBook note creation
	 * process
	 * 
	 * @param model
	 *            model that contains validated noteBook's note's information
	 * @param view
	 *            view that represents data to the user
	 * @param scanner
	 *            simple text scanner which can parse primitive types and
	 *            strings using regular expressions
	 */
	public static void processNoteBookNoteCreation(Model model, View view, Scanner scanner) {
		new NoteBookNoteService(model, view, scanner).processNoteBookNoteCreation();
	}

	/**
	 * receives validated user's input from NoteBookNoteUserInputReader and
	 * invokes method that passes it to the model
	 */
	private void processNoteBookNoteCreation() {
		noteBookNoteDTO = NoteBookNoteUserInputReader.readNoteBookNoteUserInput(view, scanner);
		addNoteBookNoteToModel();
	}

	/**
	 * invokes method that creates consistent noteBook's note object and saves
	 * it to the model
	 */
	private void addNoteBookNoteToModel() {
		final NoteBookNoteBO noteBookNoteBO = createNoteBookNoteBO();

		model.setNoteBookNoteBO(noteBookNoteBO);
	}

	/**
	 * creates validated consistent noteBook's note object
	 * 
	 * @return validated consistent noteBook's note object
	 */
	private NoteBookNoteBO createNoteBookNoteBO() {
		return NoteBookNoteBOConverter.fromNoteBookNoteDTO(noteBookNoteDTO);
	}

}
