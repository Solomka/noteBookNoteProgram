package ua.training.notebook_note.controller;

import java.util.Scanner;

import ua.training.notebook_note.controller.regex.RegexContainer;
import ua.training.notebook_note.controller.validation.UserInputValidationUtility;
import ua.training.notebook_note.model.dto.FullNameDTO;
import ua.training.notebook_note.model.dto.NoteBookNoteDTO;
import ua.training.notebook_note.view.View;
import ua.training.notebook_note.view.ViewMessage;

public class NoteBookNoteUserInputReader {

	private View view;
	private Scanner scanner;

	private NoteBookNoteDTO noteDTO;

	private NoteBookNoteUserInputReader(View view, Scanner scanner) {

		this.view = view;
		this.scanner = scanner;

		this.noteDTO = new NoteBookNoteDTO();
	}

	public static NoteBookNoteDTO readNoteBookNoteUserInput(View view, Scanner scanner) {
		return new NoteBookNoteUserInputReader(view, scanner).readNoteBookNoteUserInput();
	}

	private NoteBookNoteDTO readNoteBookNoteUserInput() {

		noteDTO.setFullName(readNoteBookNoteUserFullName());
		noteDTO.setNickname(UserInputValidationUtility.inputStringValue(scanner, view, ViewMessage.NICKNAME,
				RegexContainer.FULLNAME_REGEX));
		noteDTO.setComment("");
		return noteDTO;
	}

	private FullNameDTO readNoteBookNoteUserFullName() {
		FullNameDTO fullName = new FullNameDTO();
		fullName.setName(UserInputValidationUtility.inputStringValue(scanner, view, ViewMessage.NAME,
				RegexContainer.FULLNAME_REGEX));
		fullName.setSurname(UserInputValidationUtility.inputStringValue(scanner, view, ViewMessage.SURNAME,
				RegexContainer.FULLNAME_REGEX));
		fullName.setPatronymic(UserInputValidationUtility.inputStringValue(scanner, view, ViewMessage.PATRONYMIC,
				RegexContainer.FULLNAME_REGEX));
		return fullName;
	}

}
