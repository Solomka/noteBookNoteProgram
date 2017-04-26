package ua.training.notebook_note.model;

import java.util.Objects;

import ua.training.notebook_note.exception.RepeatedNicknameException;
import ua.training.notebook_note.model.entity.NoteBookNoteBO;
import ua.training.notebook_note.view.ViewMessage;

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

	public Model(NoteBookNoteBO noteBookNoteBO) throws RepeatedNicknameException {
		setNoteBookNoteBO(noteBookNoteBO);
	}

	public NoteBookNoteBO getNoteBooNoteBO() {
		return noteBookNoteBO;
	}

	public void setNoteBookNoteBO(NoteBookNoteBO noteBookNoteBO) throws RepeatedNicknameException {
		Objects.requireNonNull(noteBookNoteBO);

		if (noteBookNoteBO.getNickname().equals(ModelExistentNickname.SOLOMKA.getValue())) {
			throw new RepeatedNicknameException(ViewMessage.NICKNAME_EXCEPTION_MESSAGE);
		} else {
			this.noteBookNoteBO = noteBookNoteBO;
		}
	}

}
