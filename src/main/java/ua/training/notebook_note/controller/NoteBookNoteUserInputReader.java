package ua.training.notebook_note.controller;

import java.util.Objects;
import java.util.Scanner;

import ua.training.notebook_note.controller.regex.RegexContainer;
import ua.training.notebook_note.model.dto.AddressDTO;
import ua.training.notebook_note.model.dto.ContactsDTO;
import ua.training.notebook_note.model.dto.FullNameDTO;
import ua.training.notebook_note.model.dto.NoteBookNoteDTO;
import ua.training.notebook_note.model.entity.types.Group;
import ua.training.notebook_note.view.View;
import ua.training.notebook_note.view.ViewMessage;

/**
 * Class that handles user's console input
 * <p>
 * This class reads user's input from console and returns it saved in a
 * NoteBookNoteDTO object
 * 
 * @author Solomka
 *
 */
public class NoteBookNoteUserInputReader {
	
	private View view;
	private Scanner scanner;
	private NoteBookNoteDTO noteDTO;

	private NoteBookNoteUserInputReader(View view, Scanner scanner, NoteBookNoteDTO noteDTO) {
		
		this.view = Objects.requireNonNull(view);
		this.scanner = Objects.requireNonNull(scanner);
		this.noteDTO = Objects.requireNonNull(noteDTO);
	}

	public static NoteBookNoteDTO readNoteBookNoteUserInput(View view, Scanner scanner) {
		return new NoteBookNoteUserInputReader(view, scanner, new NoteBookNoteDTO()).readNoteBookNoteUserInput();
	}

	public static NoteBookNoteDTO readNoteBookNoteUserInput(View view, Scanner scanner, NoteBookNoteDTO noteDTO) {
		return new NoteBookNoteUserInputReader(view, scanner, noteDTO).repeatNicknameUserInput();
	}

	private NoteBookNoteDTO repeatNicknameUserInput() {
		view.printMessage(ViewMessage.NICKNAME_EXCEPTION_MESSAGE);
		noteDTO.setNickname(UserInputProcessUtility.inputStringValue(scanner, view,
				ViewMessage.NICKNAME + ViewMessage.FULLNAME_LNGTH, RegexContainer.NICKNAME_REGEX));
		return noteDTO;
	}

	private NoteBookNoteDTO readNoteBookNoteUserInput() {
		noteDTO.setFullName(readNoteBookNoteFullNameInput());
		noteDTO.setNickname(UserInputProcessUtility.inputStringValue(scanner, view,
				ViewMessage.NICKNAME + ViewMessage.FULLNAME_LNGTH, RegexContainer.NICKNAME_REGEX));
		noteDTO.setContacts(readNoteBookNoteContactsInput());
		noteDTO.setComment(UserInputProcessUtility.inputStringValue(scanner, view, ViewMessage.COMMENT,
				RegexContainer.COMMENT_REGEX));
		noteDTO.setAddress(readNoteBookNoteAddressInput());
		noteDTO.setGroup(readNoteBookNoteGroupInput());
		return noteDTO;
	}

	private FullNameDTO readNoteBookNoteFullNameInput() {
		FullNameDTO fullName = new FullNameDTO();

		fullName.setName(UserInputProcessUtility.inputStringValue(scanner, view,
				ViewMessage.NAME + ViewMessage.FULLNAME_LNGTH, RegexContainer.FULLNAME_REGEX));
		fullName.setSurname(UserInputProcessUtility.inputStringValue(scanner, view,
				ViewMessage.SURNAME + ViewMessage.FULLNAME_LNGTH, RegexContainer.FULLNAME_REGEX));
		fullName.setPatronymic(UserInputProcessUtility.inputStringValue(scanner, view,
				ViewMessage.PATRONYMIC + ViewMessage.FULLNAME_LNGTH, RegexContainer.FULLNAME_REGEX));

		return fullName;
	}

	private ContactsDTO readNoteBookNoteContactsInput() {
		ContactsDTO contacts = new ContactsDTO();

		contacts.setHomePhoneNum(UserInputProcessUtility.inputStringValue(scanner, view,
				ViewMessage.HOME_PHONE_NUM + ViewMessage.HOME_PHONE_NUM_FORMAT, RegexContainer.HOME_PHONE_NUM_REGEX));
		contacts.setMobilePhoneNumFirst(UserInputProcessUtility.inputStringValue(scanner, view,
				ViewMessage.MOB_PHONE_NUM_1 + ViewMessage.MOB_PHONE_NUM_FORMAT, RegexContainer.MOB_PHONE_NUM_REGEX));
		contacts.setMobilePhoneNumSecond(UserInputProcessUtility.inputStringValue(scanner, view,
				ViewMessage.MOB_PHONE_NUM_2 + ViewMessage.MOB_PHONE_NUM_FORMAT, RegexContainer.MOB_PHONE_NUM2_REGEX));
		contacts.setEmail(
				UserInputProcessUtility.inputStringValue(scanner, view, ViewMessage.EMAIL, RegexContainer.EMAIL_REGEX));
		contacts.setSkype(
				UserInputProcessUtility.inputStringValue(scanner, view, ViewMessage.SKYPE, RegexContainer.SKYPE_REGEX));

		return contacts;

	}

	private AddressDTO readNoteBookNoteAddressInput() {
		AddressDTO address = new AddressDTO();

		address.setCity(UserInputProcessUtility.inputStringValue(scanner, view,
				ViewMessage.ADDRESS_CITY + ViewMessage.ADDRESS_LNGTH, RegexContainer.ADDRESS_CITY_STREET_REGEX));
		address.setStreet(UserInputProcessUtility.inputStringValue(scanner, view,
				ViewMessage.ADDRESS_STREET + ViewMessage.ADDRESS_LNGTH, RegexContainer.ADDRESS_CITY_STREET_REGEX));
		address.setHouseNumber(UserInputProcessUtility.inputStringValue(scanner, view, ViewMessage.ADDRESS_HOUSE_NUM,
				RegexContainer.ADDRESS_HOUSE_APPART_NUM_REGEX));
		address.setApartmentNumber(UserInputProcessUtility.inputStringValue(scanner, view,
				ViewMessage.ADDRESS_APPART_NUM, RegexContainer.ADDRESS_HOUSE_APPART_NUM_REGEX));
		address.setIndex(UserInputProcessUtility.inputStringValue(scanner, view, ViewMessage.ADDRESS_INDEX,
				RegexContainer.ADDRESS_INDEX_REGEX));

		return address;

	}

	private Group readNoteBookNoteGroupInput() {
		int groupValue = UserInputProcessUtility.inputIntValue(scanner, view,
				ViewMessage.GROUP + ViewMessage.GROUP_FORMAT);
		while (!checkGroupValue(groupValue)) {
			view.printWrongInput();
			groupValue = UserInputProcessUtility.inputIntValue(scanner, view,
					ViewMessage.GROUP + ViewMessage.GROUP_FORMAT);
		}
		return Group.getGroupByValue(groupValue);
	}

	/**
	 * check correctness of the int input group value
	 * 
	 * @param groupValue
	 *            value of the group type
	 * @return true if it's some group's value; false otherwise
	 */
	private boolean checkGroupValue(int groupValue) {
		if ((groupValue < 0) || (groupValue > 1)) {
			return false;
		}
		return true;
	}
}
