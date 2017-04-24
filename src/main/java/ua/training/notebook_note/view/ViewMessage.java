package ua.training.notebook_note.view;

public interface ViewMessage {

	public String TYPE = "Type ";
	
	public String NAME = "name";
	public String SURNAME = "surname";
	public String PATRONYMIC = "patronymic";
	public String NICKNAME = "nickname";
	
	public String COMMENT = "comment";
	
	public String HOME_PHONE_NUM = "home phone number";
	public String MOB_PHONE_NUM_1 = "first mopile phone number";
	public String MOB_PHONE_NUM_2 = "second mopile phone number";
	public String EMAIL = "email";
	public String SKYPE = "skype";
	
	public String GROUP = "group (0 - SIMPLE CLIENT, 1 - VIP CLIENT)";
	
	public String ADDRESS_CITY = "city";	
	public String ADDRESS_STREET = "street";	
	public String ADDRESS_HOUSE_NUM= "house number";	
	public String ADDRESS_APPART_NUM = "appartment number";	
	public String ADDRESS_INDEX = "post index";	

	public String WRONG_INPUT = "Wrong input. Try again!";

	public String LEFT_PARENTHESIS = "[ ";
	public String RIGHT_PARANTHESIS = " ]";
	public String COMMA = ", ";
	public String FULL_STOP = ". ";
	public String COLON = ": ";
	public String EMPTY_STR = " ";
	public String NEW_LINE = "\n";

}
