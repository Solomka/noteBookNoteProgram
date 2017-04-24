package ua.training.notebook_note.controller.regex;

public interface RegexContainer {
	
	 String FULLNAME_REGEX = "^[a-zA-Z\\s.’'\\-,]{3,32}$";
	 String NICKNAME_REGEX = "^[a-zA-Z\\d\\s.’'\\-,@]{3,15}$";
	 String COMMENT_REGEX = "^[a-zA-Z\\d\\s.’'\\-,@.]{3,512}$";
	 String HOME_PHONE_NUM_REGEX = "(^\\d{3}|\\(\\d{3}\\))-\\d{2}-\\d{2}+$";
	 String MOB_PHONE_NUM_REGEX = "^\\+380-\\d{2}-\\d{3}-\\d{4}+$";
	 String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w-]+)*@[A-Za-z\\d-]+(\\.[A-Za-z\\d]+)*(\\.[A-Za-z]{2,})$";
	 String SKYPE_REGEX = "^[a-z0-9_.-]{3,15}$";
	 String ADDRESS_INDEX_REGEX = "^\\d{5,8}$";
	 String ADDRESS_CITY_STREET_REGEX = "^[a-zA-Z\\s.’'\\-,]{3,50}$";
	 String ADDRESS_HOUSE_APPART_NUM_REGEX = "^[a-zA-Z\\d]{1,5}$";
	 String GROUP_VALUE_REGEX = "^[01]$";
	
}
