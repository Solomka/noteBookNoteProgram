package ua.training.notebook_note.view;

/**
 * interface that represents messages and its parts that are shown to the user
 * 
 * @author Solomka
 *
 */
public interface ViewMessage {

	public String TYPE = "Type ";
	
	public String NOTEBOOK_NOTE = "NOTEBOOK NOTE:";

	public String FULLNAME = "FULLNAME:";
	public String FULLNAME_FORMATTED = "FullName formatted:";
	public String NAME = "Name";
	public String SURNAME = "Surname";
	public String PATRONYMIC = "Patronymic";
	public String NICKNAME = "Nickname";
	public String FULLNAME_LNGTH = " (3-35 symbols)";

	public String COMMENT = "Comment";

	public String CONTACTS = "CONTACTS:";
	public String HOME_PHONE_NUM = "Home Number";
	public String MOB_PHONE_NUM_1 = "Mobile Number1";
	public String MOB_PHONE_NUM_2 = "Mobile Number2";

	public String HOME_PHONE_NUM_FORMAT = " (XXX-XX-XX)";
	public String MOB_PHONE_NUM_FORMAT = " (+380-XX-XXX-XXXX)";

	public String EMAIL = "Email";
	public String SKYPE = "Skype";

	public String GROUP = "Group";
	public String GROUP_FORMAT = " (0 - SIMPLE CLIENT, 1 - VIP CLIENT)";

	public String ADDRESS = "ADDRESS:";
	public String ADDRESS_FORMATTED = "Address Formatted:";
	public String ADDRESS_CITY = "City";
	public String ADDRESS_STREET = "Street";
	public String ADDRESS_LNGTH = " (3-50 symbols)";

	public String ADDRESS_HOUSE_NUM = "House Number";
	public String ADDRESS_APPART_NUM = "Appartment Number";
	public String ADDRESS_INDEX = "Post Index";
	
	public String DATE_OF_CREATION = "Date of Creation:";
	public String DATE_OF_UPDATE = "Date of Update:";

	public String WRONG_INPUT = "Wrong input. Try again!";

	public String NICKNAME_EXCEPTION_MESSAGE = "Subsciber with further nickname already exists";

	public String LEFT_PARENTHESIS = "[ ";
	public String RIGHT_PARANTHESIS = " ]";
	public String COMMA = ", ";
	public String FULL_STOP = ".";
	public String COLON = ": ";
	public String EMPTY_STR = " ";
	public String NEW_LINE = "\n";
	public String BACKSLASH = "/";
	public String SEMICOLON = ";";

}
