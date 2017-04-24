package ua.training.notebook_note.service;

import java.util.Objects;
import java.util.Scanner;

import ua.training.notebook_note.model.Model;
import ua.training.notebook_note.model.dto.NoteBookNoteDTO;
import ua.training.notebook_note.model.entity.NoteBookNoteBO;
import ua.training.notebook_note.service.converter.NoteBookNoteBOConverter;
import ua.training.notebook_note.view.View;

public class NoteBookNoteService {

	private Model model;
	private View view;
	private Scanner scanner;

	private NoteBookNoteDTO noteBookNoteDTO;

	private NoteBookNoteService(Model model, View view, Scanner scanner) {
		Objects.requireNonNull(model, "model can't be null");
		Objects.requireNonNull(view, "view can't be null");
		Objects.requireNonNull(scanner, "scanner can't be null");

		this.model = model;
		this.view = view;
		this.scanner = scanner;
	}

	public static void processNoteBookNoteCreation(Model model, View view, Scanner scanner) {
		new NoteBookNoteService(model, view, scanner).processNoteBookNoteCreation();
	}

	private void processNoteBookNoteCreation() {
		noteBookNoteDTO = NoteBookNoteUserInputReader.readNoteBookNoteUserInput(view, scanner);
		addNoteBookNoteToModel();
	}

	private void addNoteBookNoteToModel() {
		final NoteBookNoteBO noteBookNoteBO = createNoteBookNoteBO();

		model.setNoteBookNoteBO(noteBookNoteBO);
	}

	private NoteBookNoteBO createNoteBookNoteBO() {
		return NoteBookNoteBOConverter.fromNoteBookNoteDTO(noteBookNoteDTO);
	}

}
