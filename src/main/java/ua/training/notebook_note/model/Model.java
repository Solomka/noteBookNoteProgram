package ua.training.notebook_note.model;

import java.util.Objects;

import ua.training.notebook_note.model.entity.NoteBookNoteBO;

public class Model {

	private NoteBookNoteBO noteBookNoteBO;

	public Model() {
	}

	public Model(NoteBookNoteBO noteBookNoteBO) {
		setNoteBooNoteBO(noteBookNoteBO);
	}

	public NoteBookNoteBO getNoteBooNoteBO() {
		return noteBookNoteBO;
	}

	public void setNoteBooNoteBO(NoteBookNoteBO noteBookNoteBO) {
		Objects.requireNonNull(noteBookNoteBO, "subscriber note can't be null");

		this.noteBookNoteBO = noteBookNoteBO;
	}

}
