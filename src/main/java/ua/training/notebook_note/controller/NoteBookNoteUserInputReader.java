package ua.training.notebook_note.controller;

import java.util.Scanner;

import ua.training.notebook_note.controller.regex.RegexContainer;
import ua.training.notebook_note.controller.validation.UserInputValidationUtility;
import ua.training.notebook_note.model.dto.AddressDTO;
import ua.training.notebook_note.model.dto.ContactsDTO;
import ua.training.notebook_note.model.dto.FullNameDTO;
import ua.training.notebook_note.model.dto.NoteBookNoteDTO;
import ua.training.notebook_note.model.entity.types.Group;
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

		noteDTO.setFullName(readNoteBookNoteFullNameInput());
		noteDTO.setNickname(UserInputValidationUtility.inputStringValue(scanner, view, ViewMessage.NICKNAME,
				RegexContainer.NICKNAME_REGEX));
		noteDTO.setContacts(readNoteBookNoteContactsInput());
		noteDTO.setComment(UserInputValidationUtility.inputStringValue(scanner, view, ViewMessage.COMMENT,
				RegexContainer.COMMENT_REGEX));
		noteDTO.setAddress(readNoteBookNoteAddressInput());
		noteDTO.setGroup(readNoteBookNoteGroupInput());
		return noteDTO;
	}

	private FullNameDTO readNoteBookNoteFullNameInput() {
		FullNameDTO fullName = new FullNameDTO();
		fullName.setName(UserInputValidationUtility.inputStringValue(scanner, view, ViewMessage.NAME,
				RegexContainer.FULLNAME_REGEX));
		fullName.setSurname(UserInputValidationUtility.inputStringValue(scanner, view, ViewMessage.SURNAME,
				RegexContainer.FULLNAME_REGEX));
		fullName.setPatronymic(UserInputValidationUtility.inputStringValue(scanner, view, ViewMessage.PATRONYMIC,
				RegexContainer.FULLNAME_REGEX));

		return fullName;
	}

	private ContactsDTO readNoteBookNoteContactsInput() {
		ContactsDTO contacts = new ContactsDTO();
		contacts.setHomePhoneNum(UserInputValidationUtility.inputStringValue(scanner, view, ViewMessage.HOME_PHONE_NUM,
				RegexContainer.HOME_PHONE_NUM_REGEX));
		contacts.setMobilePhoneNumFirst(UserInputValidationUtility.inputStringValue(scanner, view, ViewMessage.MOB_PHONE_NUM_1,
				RegexContainer.MOB_PHONE_NUM_REGEX));
		contacts.setMobilePhoneNumSecond(UserInputValidationUtility.inputStringValue(scanner, view, ViewMessage.MOB_PHONE_NUM_2,
				RegexContainer.MOB_PHONE_NUM2_REGEX));
		contacts.setEmail(UserInputValidationUtility.inputStringValue(scanner, view, ViewMessage.EMAIL,
				RegexContainer.EMAIL_REGEX));
		contacts.setSkype(UserInputValidationUtility.inputStringValue(scanner, view, ViewMessage.SKYPE,
				RegexContainer.SKYPE_REGEX));

		return contacts;

	}

	private AddressDTO readNoteBookNoteAddressInput() {
		AddressDTO address = new AddressDTO();
		address.setCity(UserInputValidationUtility.inputStringValue(scanner, view, ViewMessage.ADDRESS_CITY,
				RegexContainer.ADDRESS_CITY_STREET_REGEX));
		address.setStreet(UserInputValidationUtility.inputStringValue(scanner, view, ViewMessage.ADDRESS_STREET,
				RegexContainer.ADDRESS_CITY_STREET_REGEX));
		address.setHouseNumber(UserInputValidationUtility.inputStringValue(scanner, view, ViewMessage.ADDRESS_HOUSE_NUM,
				RegexContainer.ADDRESS_HOUSE_APPART_NUM_REGEX));
		address.setApartmentNumber(UserInputValidationUtility.inputStringValue(scanner, view, ViewMessage.ADDRESS_APPART_NUM,
				RegexContainer.ADDRESS_HOUSE_APPART_NUM_REGEX));
		address.setIndex(UserInputValidationUtility.inputStringValue(scanner, view, ViewMessage.ADDRESS_INDEX,
				RegexContainer.ADDRESS_INDEX_REGEX));

		return address;

	}

	private Group readNoteBookNoteGroupInput() {
		int groupValue = UserInputValidationUtility.inputIntValue(scanner, view, ViewMessage.GROUP);
		if(! checkGroupValue(groupValue)){
			groupValue = UserInputValidationUtility.inputIntValue(scanner, view, ViewMessage.WRONG_INPUT + ViewMessage.NEW_LINE + ViewMessage.GROUP);
		}
		return Group.getGroupByValue(groupValue);
	}

	private boolean checkGroupValue(int groupValue) {
		if ((groupValue < 0) || (groupValue > 1)) {
			return false;
		}
		return true;
	}

}
