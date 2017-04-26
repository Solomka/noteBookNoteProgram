package ua.training.notebook_note.service;

import java.util.Objects;

import ua.training.notebook_note.exception.RepeatedNicknameException;
import ua.training.notebook_note.model.Model;
import ua.training.notebook_note.model.dto.NoteBookNoteDTO;
import ua.training.notebook_note.model.entity.NoteBookNoteBO;
import ua.training.notebook_note.service.converter.NoteBookNoteBOConverter;

/**
 * Class that processes noteBooks' note adding to the model
 * 
 * @author Solomka
 *
 */
public class NoteBookNoteService {

	private Model model;

	private NoteBookNoteDTO noteBookNoteDTO;

	private NoteBookNoteService(Model model, NoteBookNoteDTO noteBookNoteDTO) {
		
		this.noteBookNoteDTO = Objects.requireNonNull(noteBookNoteDTO);
		this.model = Objects.requireNonNull(model);
	}

	public static void processNoteBookNoteModelAddition(Model model, NoteBookNoteDTO noteBookNoteDTO)
			throws RepeatedNicknameException {
		new NoteBookNoteService(model, noteBookNoteDTO).processNoteBookNoteModelAddition();
	}

	private void processNoteBookNoteModelAddition() throws RepeatedNicknameException {
		final NoteBookNoteBO noteBookNoteBO = createNoteBookNoteBO();
		
		model.setNoteBookNoteBO(noteBookNoteBO);
	}

	private NoteBookNoteBO createNoteBookNoteBO() {
		return NoteBookNoteBOConverter.fromNoteBookNoteDTO(noteBookNoteDTO);
	}

}
