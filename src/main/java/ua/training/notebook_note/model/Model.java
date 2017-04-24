package ua.training.notebook_note.model;

import java.util.Objects;

import ua.training.notebook_note.model.entity.NoteBookNoteBO;

public class Model {

	private NoteBookNoteBO noteBookNoteBO;

	public Model() {
	}

	public Model(NoteBookNoteBO noteBookNoteBO) {
		setNoteBookNoteBO(noteBookNoteBO);
	}

	public NoteBookNoteBO getNoteBooNoteBO() {
		return noteBookNoteBO;
	}

	public void setNoteBookNoteBO(NoteBookNoteBO noteBookNoteBO) {
		Objects.requireNonNull(noteBookNoteBO, "noteBookNote can't be null");

		this.noteBookNoteBO = noteBookNoteBO;
	}

}
