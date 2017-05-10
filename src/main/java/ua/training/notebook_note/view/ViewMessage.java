package ua.training.notebook_note.view;

/**
 * interface that represents messages and its parts that are shown to the user
 * 
 * @author Solomka
 *
 */
public interface ViewMessage {

	String TYPE = "Type ";

	String NOTEBOOK_NOTE = "NOTEBOOK NOTE:";

	String FULLNAME = "FULLNAME:";
	String FULLNAME_FORMATTED = "FullName formatted:";
	String NAME = "Name";
	String SURNAME = "Surname";
	String PATRONYMIC = "Patronymic";
	String NICKNAME = "Nickname";
	String FULLNAME_LNGTH = " (3-35 symbols)";

	String COMMENT = "Comment";

	String CONTACTS = "CONTACTS:";
	String HOME_PHONE_NUM = "Home Number";
	String MOB_PHONE_NUM_1 = "Mobile Number1";
	String MOB_PHONE_NUM_2 = "Mobile Number2";

	String HOME_PHONE_NUM_FORMAT = " (XXX-XX-XX)";
	String MOB_PHONE_NUM_FORMAT = " (+380-XX-XXX-XXXX)";

	String EMAIL = "Email";
	String SKYPE = "Skype";

	String GROUP = "Group";
	String GROUP_FORMAT = " (0 - SIMPLE CLIENT, 1 - VIP CLIENT)";

	String ADDRESS = "ADDRESS:";
	String ADDRESS_FORMATTED = "Address Formatted:";
	String ADDRESS_CITY = "City";
	String ADDRESS_STREET = "Street";
	String ADDRESS_LNGTH = " (3-50 symbols)";

	String ADDRESS_HOUSE_NUM = "House Number";
	String ADDRESS_APPART_NUM = "Appartment Number";
	String ADDRESS_INDEX = "Post Index";

	String DATE_OF_CREATION = "Date of Creation:";
	String DATE_OF_UPDATE = "Date of Update:";

	String WRONG_INPUT = "Wrong input. Try again!";

	String NICKNAME_EXCEPTION_MESSAGE = "Subsciber with further nickname already exists";

	String LEFT_PARENTHESIS = "[ ";
	String RIGHT_PARANTHESIS = " ]";
	String COMMA = ", ";
	String FULL_STOP = ".";
	String COLON = ": ";
	String EMPTY_STR = " ";
	String NEW_LINE = "\n";
	String BACKSLASH = "/";
	String SEMICOLON = ";";

}
