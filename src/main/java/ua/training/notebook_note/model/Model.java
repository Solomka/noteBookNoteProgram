package ua.training.notebook_note.model;

import java.util.Objects;

import ua.training.notebook_note.model.entity.NoteBookNoteBO;

/**
 * Class that represents Model and contains information about NoteBook note
 * (NoteBookNoteBO) and provides methods for its setting and obtaining
 * 
 * @author Solomka
 *
 */
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
		this.noteBookNoteBO = Objects.requireNonNull(noteBookNoteBO);
	}

}
