package ua.training.notebook_note;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

import ua.training.notebook_note.controller.regex.RegexContainer;

public class RegexContainerTest {

	//@Ignore
	@Test
	public void testFullNameRegexName() {
		String surname = "Bla'Bla-s ";

		boolean actual = surname.matches(RegexContainer.FULLNAME_REGEX);
		boolean expected = true;

		assertEquals(expected, actual);

	}
	//@Ignore
	@Test
	public void testNicknameRegex() {
		String nickname = "987";

		boolean actual = nickname.matches(RegexContainer.NICKNAME_REGEX);
		boolean expected = true;

		assertEquals(expected, actual);

	}
	
	//@Ignore
	@Test
	public void testCommentRegex() {
		String comment = "bla";

		boolean actual = comment.matches(RegexContainer.NICKNAME_REGEX);
		boolean expected = true;

		assertEquals(expected, actual);

	}
	
	//@Ignore
	@Test
	public void testHomePhoneNumRegex() {
		String homePhone = "275-12-59";

		boolean actual = homePhone.matches(RegexContainer.HOME_PHONE_NUM_REGEX);
		boolean expected = true;

		assertEquals(expected, actual);

	}
	
	//@Ignore
	@Test
	public void testMobilePhoneNumRegex() {
		String mobilePhone = "+380-95-805-1883";

		boolean actual = mobilePhone.matches(RegexContainer.MOB_PHONE_NUM_REGEX);
		boolean expected = true;

		assertEquals(expected, actual);

	}
	
	@Test
	public void testMobilePhoneNum2Regex() {
		String mobilePhone = "+380-95-805-1883";

		boolean actual = mobilePhone.matches(RegexContainer.MOB_PHONE_NUM2_REGEX);
		boolean expected = true;

		assertEquals(expected, actual);

	}
	
	//@Ignore
	@Test
	public void testEmailRegex() {
		String email = "_9sol._9yaremo@9gmail.com";

		boolean actual = email.matches(RegexContainer.EMAIL_REGEX);
		boolean expected = true;

		assertEquals(expected, actual);

	}
	
	@Test
	public void testSkypeRegex() {
		String skype = "mija.shu91";

		boolean actual = skype.matches(RegexContainer.SKYPE_REGEX);
		boolean expected = true;

		assertEquals(expected, actual);

	}
	@Test
	public void testAddressIndexRegex() {
		String index = "12345";

		boolean actual = index.matches(RegexContainer.ADDRESS_INDEX_REGEX);
		boolean expected = true;

		assertEquals(expected, actual);

	}
	
	@Test
	public void testAddressCityStreetRegex() {
		String street = "Skovorody str.";

		boolean actual = street.matches(RegexContainer.ADDRESS_CITY_STREET_REGEX);
		boolean expected = true;

		assertEquals(expected, actual);

	}
	
	@Test
	public void testAddressHouseAppNumRegex() {
		String appNum = "14b";

		boolean actual = appNum.matches(RegexContainer.ADDRESS_HOUSE_APPART_NUM_REGEX);
		boolean expected = true;

		assertEquals(expected, actual);

	}
	
	@Test
	public void testGroupValueRegex() {
		String groupValue = "0";

		boolean actual = groupValue.matches(RegexContainer.GROUP_VALUE_REGEX);
		boolean expected = true;

		assertEquals(expected, actual);

	}
	
	
	
	
	

	

}
