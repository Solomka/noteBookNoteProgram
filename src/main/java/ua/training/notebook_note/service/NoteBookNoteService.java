package ua.training.notebook_note.service;

import java.util.Objects;

import ua.training.notebook_note.exception.RepeatedNicknameException;
import ua.training.notebook_note.model.Model;
import ua.training.notebook_note.model.dto.NoteBookNoteDTO;
import ua.training.notebook_note.model.entity.NoteBookNoteBO;
import ua.training.notebook_note.service.converter.NoteBookNoteBOConverter;

/**
 * Class that processes noteBooks' note creation
 * <p>
 * It invokes Service that provides validated subscriber's information as
 * NoteBookNoteDTO object from console, invokes Converter that generates
 * validated consistent NoteBookNoteBo object and fulfills its addition to the
 * Model
 * 
 * @author Solomka
 *
 */
public class NoteBookNoteService {

	private Model model;

	private NoteBookNoteDTO noteBookNoteDTO;

	private NoteBookNoteService(NoteBookNoteDTO noteBookNoteDTO) {
		this.noteBookNoteDTO = Objects.requireNonNull(noteBookNoteDTO);
		this.model = new Model();
	}

	public static void processNoteBookNoteModelAddition(NoteBookNoteDTO noteBookNoteDTO) throws RepeatedNicknameException {
		new NoteBookNoteService(noteBookNoteDTO).processNoteBookNoteModelAddition();
	}

	private void processNoteBookNoteModelAddition() throws RepeatedNicknameException {
		final NoteBookNoteBO noteBookNoteBO = createNoteBookNoteBO();
		model.setNoteBookNoteBO(noteBookNoteBO);
	}

	private NoteBookNoteBO createNoteBookNoteBO() {
		return NoteBookNoteBOConverter.fromNoteBookNoteDTO(noteBookNoteDTO);
	}

}
