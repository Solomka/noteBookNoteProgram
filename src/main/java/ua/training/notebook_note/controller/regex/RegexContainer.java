package ua.training.notebook_note.controller.regex;

/**
 * Interface that contains all regex for console user's input validation
 * 
 * @author Solomka
 *
 */
public interface RegexContainer {

	String FULLNAME_REGEX = "^[a-zA-Z’'-]{3,35}$";
	String NICKNAME_REGEX = "^[a-zA-Z\\d@#!’'-]{3,15}$";
	String COMMENT_REGEX = "^[[^\\s].]{3,128}$";
	String HOME_PHONE_NUM_REGEX = "(^\\d{3}|\\(\\d{3}\\))-\\d{2}-\\d{2}+$";
	String MOB_PHONE_NUM_REGEX = "^\\+380-\\d{2}-\\d{3}-\\d{4}+$";
	String MOB_PHONE_NUM2_REGEX = "^(\\+380-\\d{2}-\\d{3}-\\d{4}+)|(\\s*)$";
	String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w-]+)*@[A-Za-z\\d-]+(\\.[A-Za-z\\d]+)*(\\.[A-Za-z]{2,})$";
	String SKYPE_REGEX = "^[a-z0-9_.-]{3,35}$";
	String ADDRESS_INDEX_REGEX = "^\\d{5,8}$";
	String ADDRESS_CITY_STREET_REGEX = "^[a-zA-Z\\s.’'-,]{3,50}$";
	String ADDRESS_HOUSE_APPART_NUM_REGEX = "^\\d{1,4}[a-zA-Z]?$";

}
