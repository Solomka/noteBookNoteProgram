package ua.training.notebook_note.service;

import java.util.Objects;

import ua.training.notebook_note.controller.converter.NoteBookNoteBOConverter;
import ua.training.notebook_note.model.Model;
import ua.training.notebook_note.model.dto.NoteBookNoteDTO;
import ua.training.notebook_note.model.entity.NoteBookNoteBO;

public class NoteBookNoteServiceImpl implements NoteBookNoteService {

	private Model model;

	public NoteBookNoteServiceImpl(Model model) {
		Objects.requireNonNull(model, "model can't be null");
		this.model = model;
	}

	public void addNoteBookNoteToModel(final NoteBookNoteDTO noteDTO) {
		Objects.requireNonNull(noteDTO, "noteBookNoteDTO can't be null");

		final NoteBookNoteBO noteBookNoteBO = createNoteBookNoteBO(noteDTO);
		model.setNoteBookNoteBO(noteBookNoteBO);
	}

	private NoteBookNoteBO createNoteBookNoteBO(final NoteBookNoteDTO noteDTO) {
		return NoteBookNoteBOConverter.fromNoteBookNoteDTO(noteDTO);
	}

	public NoteBookNoteBO getModelNoteBookNote() {
		return model.getNoteBooNoteBO();
	}

}
