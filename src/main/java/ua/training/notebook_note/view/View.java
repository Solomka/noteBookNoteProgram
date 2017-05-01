package ua.training.notebook_note.view;

import java.util.Objects;

import ua.training.notebook_note.model.entity.NoteBookNoteBO;

/**
 * 
 * Class that represents View and provides main user interface displaying all of
 * the user actions' related messages
 * 
 * 
 * @author Solomka
 *
 */
public class View {

	/**
	 * Shows constructed message
	 * 
	 * @param messages
	 *            parts of the message (one or many)
	 */
	public void printMessage(String... messages) {
		String resultedMessage = generateMessageFromParts(messages);
		System.out.println(resultedMessage);
	}

	/**
	 * Generates one message from its parts (one or many)
	 * 
	 * @param messages
	 *            parts of the message (one or many)
	 * @return constructed message
	 */
	private String generateMessageFromParts(String... messages) {
		StringBuilder builder = new StringBuilder();

		for (String mgs : messages) {
			builder.append(mgs);
		}
		return builder.toString();
	}

	/**
	 * Shows information about wrong input
	 */
	public void printWrongInput() {
		printMessage(ViewMessage.WRONG_INPUT);
	}

	/**
	 * Show information about added notebook's note
	 * 
	 * @param note
	 *            added notebook's note to show
	 */

	public void printNoteBookNote(final NoteBookNoteBO note) {
		Objects.requireNonNull(note);
		
		printMessage(note.toString());
	}

}
