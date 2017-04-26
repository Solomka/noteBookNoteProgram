package ua.training.notebook_note.model.dto;

/**
 * Class that represents subscriber's contacts dto object that contains
 * information about subscriber contacts received from the console input
 * 
 * @author Solomka
 *
 */
public class ContactsDTO {
	
	private String homePhoneNum;
	private String mobilePhoneNumFirst;
	private String mobilePhoneNumSecond;
	private String email;
	private String skype;

	public ContactsDTO() {

	}

	public ContactsDTO(String homePhoneNum, String mobilePhoneNumFirst, String mobilePhoneNumSecond, String email,
			String skype) {
		
		this.homePhoneNum = homePhoneNum;
		this.mobilePhoneNumFirst = mobilePhoneNumFirst;
		this.mobilePhoneNumSecond = mobilePhoneNumSecond;
		this.email = email;
		this.skype = skype;
	}

	public String getHomePhoneNum() {
		return homePhoneNum;
	}

	public void setHomePhoneNum(String homePhoneNum) {
		this.homePhoneNum = homePhoneNum;
	}

	public String getMobilePhoneNumFirst() {
		return mobilePhoneNumFirst;
	}

	public void setMobilePhoneNumFirst(String mobilePhoneNumFirst) {
		this.mobilePhoneNumFirst = mobilePhoneNumFirst;
	}

	public String getMobilePhoneNumSecond() {
		return mobilePhoneNumSecond;
	}

	public void setMobilePhoneNumSecond(String mobilePhoneNumSecond) {
		this.mobilePhoneNumSecond = mobilePhoneNumSecond;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSkype() {
		return skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}
}
