package ua.training.notebook_note.controller;

import java.util.Scanner;

import ua.training.notebook_note.controller.converter.NoteBookNoteBOConverter;
import ua.training.notebook_note.controller.regex.RegexContainer;
import ua.training.notebook_note.controller.validation.UserInputValidationUtility;
import ua.training.notebook_note.model.Model;
import ua.training.notebook_note.model.dto.NoteBookNoteDTO;
import ua.training.notebook_note.model.entity.NoteBookNoteBO;
import ua.training.notebook_note.view.View;

public class NoteBookNoteInputService {

	private Model model;
	private View view;
	private Scanner scanner;
	
	private NoteBookNoteDTO noteDTO;

	public NoteBookNoteInputService(Model model, View view, Scanner scanner){
		this.model = model;
		this.view = view;
		this.scanner = scanner;
		
		this.noteDTO = new NoteBookNoteDTO();		
	}
	
	public void processNoteBookNoteCreation (){
		readNoteBookNoteUserInput();
		NoteBookNoteBO noteBO = createNoteBookNoteBO();
		
		addNoteBookNoteToModel(noteBO);
		showAddedNoteBookNote();		
	}
	
	private NoteBookNoteBO createNoteBookNoteBO(){				
		return NoteBookNoteBOConverter.fromNoteBookNoteDTO(noteDTO);		
	}
	
	private void readNoteBookNoteUserInput(){
		/*
		this.name = UserInputValidationUtility.inputStringValue(scanner, view, View.NAME, RegexContainer.FULLNAME_REGEX);
		this.surname = UserInputValidationUtility.inputStringValue(scanner, view, View.SURNAME, RegexContainer.FULLNAME_REGEX);
		this.patronymic = UserInputValidationUtility.inputStringValue(scanner, view, View.PATRONYMIC,
				RegexContainer.FULLNAME_REGEX);
		this.nickname = UserInputValidationUtility.inputStringValue(scanner, view, View.NICKNAME, RegexContainer.FULLNAME_REGEX);
		*/
		
	}

	private void addNoteBookNoteToModel(final NoteBookNoteBO noteBO) {
		model.setNoteBooNoteBO(noteBO);
	}
	
	private void showAddedNoteBookNote(){
		view.printNoteBookNote(model.getNoteBooNoteBO());
		
	}

}
