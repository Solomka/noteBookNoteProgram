package ua.training.notebook_note;

import ua.training.notebook_note.controller.Controller;
import ua.training.notebook_note.model.Model;
import ua.training.notebook_note.service.NoteBookNoteService;
import ua.training.notebook_note.service.NoteBookNoteServiceImpl;
import ua.training.notebook_note.utils.DateTime;
import ua.training.notebook_note.view.View;

public class Main {

	public static void main(String[] args) {

		// Initialization
		NoteBookNoteService noteService = new NoteBookNoteServiceImpl(new Model());
		View view = new View();
		Controller controller = new Controller(noteService, view);

		// Start user's interaction
		 controller.processUser();

		//DateTime dateTime = new DateTime();
		//System.out.println("DateTime: " + dateTime.getShortFormattedLocalDateTime());
	}

}
