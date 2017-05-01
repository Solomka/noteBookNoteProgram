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

		if (checkIfNicknameExists(noteBookNoteBO.getNickname())) {
			throw new RepeatedNicknameException(ViewMessage.NICKNAME_EXCEPTION_MESSAGE, noteBookNoteBO.getNickname());
		}
		this.noteBookNoteBO = noteBookNoteBO;
	}

	/**
	 * check if note with such subscriber's nickname already exists in the model
	 * 
	 * @param nickname
	 *            nickname of the adding subscriber's note
	 * @return true if subscriber's note with such subscriber's nickname already
	 *         exists in the model; false otherwise
	 */
	private boolean checkIfNicknameExists(String nickname) {
		for (ModelExistentNickname existentNickname : ModelExistentNickname.values()) {
			if (existentNickname.getValue().equals(nickname)) {
				return true;
			}
		}
		return false;
	}
}
