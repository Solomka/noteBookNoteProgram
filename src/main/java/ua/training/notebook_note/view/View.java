package ua.training.notebook_note.view;

import ua.training.notebook_note.model.entity.NoteBookNoteBO;

public class View {	

	public void printMessage(String... messages) {
		String resultedMessage = generateMessageFromParts(messages);
		System.out.println(resultedMessage);
	}

	private String generateMessageFromParts(String... messages) {
		StringBuilder builder = new StringBuilder();

		for (String mgs : messages) {
			builder.append(mgs);
		}
		return builder.toString();
	}

	public void printTypeMessage(String message){
		printMessage(ViewMessage.TYPE, message, ViewMessage.COLON);
	}
	
	public void printWrongInput() {
		printMessage(ViewMessage.WRONG_INPUT);
	}
	
	public void printWrongInput(String message) {
		printMessage(ViewMessage.WRONG_INPUT, ViewMessage.NEW_LINE);
		printTypeMessage(message);
	}

	public void printNoteBookNote(final NoteBookNoteBO note) {
		printMessage(note.toString());
	}

}
