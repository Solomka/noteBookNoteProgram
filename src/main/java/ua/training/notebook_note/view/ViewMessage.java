package ua.training.notebook_note.view;

/**
 * interface that represents messages and its parts that are shown to the user
 * 
 * @author Solomka
 *
 */
public interface ViewMessage {

	public String TYPE = "Type ";

	public String NAME = "name (3-35 symbols)";
	public String SURNAME = "surname (3-35 symbols)";
	public String PATRONYMIC = "patronymic (3-35 symbols)";
	public String NICKNAME = "nickname (3-35 symbols)";

	public String COMMENT = "comment";

	public String HOME_PHONE_NUM = "home phone number (XXX-XX-XX)";
	public String MOB_PHONE_NUM_1 = "first mopile phone number (+380-XX-XXX-XXXX)";
	public String MOB_PHONE_NUM_2 = "second mopile phone number (+380-XX-XXX-XXXX | empty )";
	public String EMAIL = "email";
	public String SKYPE = "skype";

	public String GROUP = "group (0 - SIMPLE CLIENT, 1 - VIP CLIENT)";

	public String ADDRESS_CITY = "city (3-50 symbols)";
	public String ADDRESS_STREET = "street (3-50 symbols)";
	public String ADDRESS_HOUSE_NUM = "house number";
	public String ADDRESS_APPART_NUM = "appartment number";
	public String ADDRESS_INDEX = "post index";

	public String WRONG_INPUT = "Wrong input. Try again!";

	public String LEFT_PARENTHESIS = "[ ";
	public String RIGHT_PARANTHESIS = " ]";
	public String COMMA = ", ";
	public String FULL_STOP = ".";
	public String COLON = ": ";
	public String EMPTY_STR = " ";
	public String NEW_LINE = "\n";
	public String BACKSLASH = "\\";

}
