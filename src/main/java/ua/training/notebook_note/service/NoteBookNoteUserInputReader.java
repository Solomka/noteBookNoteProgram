package ua.training.notebook_note.service;

import java.util.Objects;
import java.util.Scanner;

import ua.training.notebook_note.controller.UserInputProcessUtility;
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

	private NoteBookNoteUserInputReader(View view, Scanner scanner) {
		this.view = Objects.requireNonNull(view);
		this.scanner = Objects.requireNonNull(scanner);

		this.noteDTO = new NoteBookNoteDTO();
	}

	/**
	 * Creates instance of this class and starts up reading user's console input
	 * 
	 * @param view
	 *            view that represents data to the user
	 * @param scanner
	 *            simple text scanner which can parse primitive types and
	 *            strings using regular expressions
	 * @return object that contains validated user's input
	 */
	public static NoteBookNoteDTO readNoteBookNoteUserInput(View view, Scanner scanner) {
		return new NoteBookNoteUserInputReader(view, scanner).readNoteBookNoteUserInput();
	}

	/**
	 * reads and validates user's console input and stores it in the
	 * NoteBookNoteDTO object
	 * 
	 * @return
	 */
	private NoteBookNoteDTO readNoteBookNoteUserInput() {

		noteDTO.setFullName(readNoteBookNoteFullNameInput());
		noteDTO.setNickname(UserInputProcessUtility.inputStringValue(scanner, view, ViewMessage.NICKNAME,
				RegexContainer.NICKNAME_REGEX));
		noteDTO.setContacts(readNoteBookNoteContactsInput());
		noteDTO.setComment(UserInputProcessUtility.inputStringValue(scanner, view, ViewMessage.COMMENT,
				RegexContainer.COMMENT_REGEX));
		noteDTO.setAddress(readNoteBookNoteAddressInput());
		noteDTO.setGroup(readNoteBookNoteGroupInput());
		return noteDTO;
	}

	/**
	 * reads subscriber's fullName from console
	 * 
	 * @return object that stores subscriber's fullName
	 */
	private FullNameDTO readNoteBookNoteFullNameInput() {
		FullNameDTO fullName = new FullNameDTO();
		fullName.setName(UserInputProcessUtility.inputStringValue(scanner, view, ViewMessage.NAME,
				RegexContainer.FULLNAME_REGEX));
		fullName.setSurname(UserInputProcessUtility.inputStringValue(scanner, view, ViewMessage.SURNAME,
				RegexContainer.FULLNAME_REGEX));
		fullName.setPatronymic(UserInputProcessUtility.inputStringValue(scanner, view, ViewMessage.PATRONYMIC,
				RegexContainer.FULLNAME_REGEX));

		return fullName;
	}

	/**
	 * reads subscriber's contacts information from console
	 * 
	 * @return object that stores subscriber's contacts
	 */
	private ContactsDTO readNoteBookNoteContactsInput() {
		ContactsDTO contacts = new ContactsDTO();
		contacts.setHomePhoneNum(UserInputProcessUtility.inputStringValue(scanner, view, ViewMessage.HOME_PHONE_NUM,
				RegexContainer.HOME_PHONE_NUM_REGEX));
		contacts.setMobilePhoneNumFirst(UserInputProcessUtility.inputStringValue(scanner, view,
				ViewMessage.MOB_PHONE_NUM_1, RegexContainer.MOB_PHONE_NUM_REGEX));
		contacts.setMobilePhoneNumSecond(UserInputProcessUtility.inputStringValue(scanner, view,
				ViewMessage.MOB_PHONE_NUM_2, RegexContainer.MOB_PHONE_NUM2_REGEX));
		contacts.setEmail(
				UserInputProcessUtility.inputStringValue(scanner, view, ViewMessage.EMAIL, RegexContainer.EMAIL_REGEX));
		contacts.setSkype(
				UserInputProcessUtility.inputStringValue(scanner, view, ViewMessage.SKYPE, RegexContainer.SKYPE_REGEX));

		return contacts;

	}

	/**
	 * reads subscriber's address from console
	 * 
	 * @return object that stores subscriber's address
	 */
	private AddressDTO readNoteBookNoteAddressInput() {
		AddressDTO address = new AddressDTO();
		address.setCity(UserInputProcessUtility.inputStringValue(scanner, view, ViewMessage.ADDRESS_CITY,
				RegexContainer.ADDRESS_CITY_STREET_REGEX));
		address.setStreet(UserInputProcessUtility.inputStringValue(scanner, view, ViewMessage.ADDRESS_STREET,
				RegexContainer.ADDRESS_CITY_STREET_REGEX));
		address.setHouseNumber(UserInputProcessUtility.inputStringValue(scanner, view, ViewMessage.ADDRESS_HOUSE_NUM,
				RegexContainer.ADDRESS_HOUSE_APPART_NUM_REGEX));
		address.setApartmentNumber(UserInputProcessUtility.inputStringValue(scanner, view,
				ViewMessage.ADDRESS_APPART_NUM, RegexContainer.ADDRESS_HOUSE_APPART_NUM_REGEX));
		address.setIndex(UserInputProcessUtility.inputStringValue(scanner, view, ViewMessage.ADDRESS_INDEX,
				RegexContainer.ADDRESS_INDEX_REGEX));

		return address;

	}

	/**
	 * reads sunscriber's group from console
	 * 
	 * @return subscriber's group type
	 */
	private Group readNoteBookNoteGroupInput() {
		int groupValue = UserInputProcessUtility.inputIntValue(scanner, view, ViewMessage.GROUP);
		while (!checkGroupValue(groupValue)) {
			view.printWrongInput();
			groupValue = UserInputProcessUtility.inputIntValue(scanner, view, ViewMessage.GROUP);
		}
		return Group.getGroupByValue(groupValue);
	}

	/**
	 * check correctness of the the input group value
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
