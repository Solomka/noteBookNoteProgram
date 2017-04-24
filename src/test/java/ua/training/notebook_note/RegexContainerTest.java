package ua.training.notebook_note;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ua.training.notebook_note.controller.regex.RegexContainer;

public class RegexContainerTest {

	@Test
	public void testFullNameRegex() {
		String surname = "O'Connel-Malley";

		boolean actual = surname.matches(RegexContainer.FULLNAME_REGEX);
		boolean expected = true;

		assertEquals(expected, actual);
	}

	@Test
	public void testFullNameRegexEmpty() {
		String surname = "";

		boolean actual = surname.matches(RegexContainer.FULLNAME_REGEX);
		boolean expected = false;

		assertEquals(expected, actual);
	}

	@Test
	public void testFullNameRegexDigit() {
		String surname = "O'Connel-Malley9";

		boolean actual = surname.matches(RegexContainer.FULLNAME_REGEX);
		boolean expected = false;

		assertEquals(expected, actual);
	}

	@Test
	public void testFullNameRegexSpace() {
		String surname = "O'Connel-Malley9 ";

		boolean actual = surname.matches(RegexContainer.FULLNAME_REGEX);
		boolean expected = false;

		assertEquals(expected, actual);
	}

	@Test
	public void testNicknameRegex() {
		String nickname = "#solomka@sol23!";

		boolean actual = nickname.matches(RegexContainer.NICKNAME_REGEX);
		boolean expected = true;

		assertEquals(expected, actual);

	}

	@Test
	public void testNicknameRegexEmpty() {
		String nickname = "";

		boolean actual = nickname.matches(RegexContainer.NICKNAME_REGEX);
		boolean expected = false;

		assertEquals(expected, actual);

	}

	@Test
	public void testNicknameRegexEmptyWrongSymbol() {
		String nickname = "solom(k)a@sol23";

		boolean actual = nickname.matches(RegexContainer.NICKNAME_REGEX);
		boolean expected = false;

		assertEquals(expected, actual);

	}

	@Test
	public void testCommentRegex() {
		String comment = "good";

		boolean actual = comment.matches(RegexContainer.COMMENT_REGEX);
		boolean expected = true;

		assertEquals(expected, actual);

	}

	@Test
	public void testCommentRegexEmpty() {
		String comment = "";

		boolean actual = comment.matches(RegexContainer.COMMENT_REGEX);
		boolean expected = false;

		assertEquals(expected, actual);

	}

	@Test
	public void testCommentRegexShort() {
		String comment = ".";

		boolean actual = comment.matches(RegexContainer.COMMENT_REGEX);
		boolean expected = false;

		assertEquals(expected, actual);

	}

	@Test
	public void testCommentRegexSpace() {
		String comment = "   ";

		boolean actual = comment.matches(RegexContainer.COMMENT_REGEX);
		boolean expected = false;

		assertEquals(expected, actual);

	}

	@Test
	public void testHomePhoneNumRegex() {
		String homePhone = "275-12-59";

		boolean actual = homePhone.matches(RegexContainer.HOME_PHONE_NUM_REGEX);
		boolean expected = true;

		assertEquals(expected, actual);

	}

	@Test
	public void testHomePhoneNumRegexEmpty() {
		String homePhone = "";

		boolean actual = homePhone.matches(RegexContainer.HOME_PHONE_NUM_REGEX);
		boolean expected = false;

		assertEquals(expected, actual);

	}

	@Test
	public void testHomePhoneNumRegexWrongFormat() {
		String homePhone = "27512-592";

		boolean actual = homePhone.matches(RegexContainer.HOME_PHONE_NUM_REGEX);
		boolean expected = false;

		assertEquals(expected, actual);

	}

	@Test
	public void testMobilePhoneNumRegex() {
		String mobilePhone = "+380-95-805-1883";

		boolean actual = mobilePhone.matches(RegexContainer.MOB_PHONE_NUM_REGEX);
		boolean expected = true;

		assertEquals(expected, actual);

	}

	@Test
	public void testMobilePhoneNumRegexEmpty() {
		String mobilePhone = "";

		boolean actual = mobilePhone.matches(RegexContainer.MOB_PHONE_NUM_REGEX);
		boolean expected = false;

		assertEquals(expected, actual);

	}

	@Test
	public void testMobilePhoneNumRegexWrongFormat() {
		String mobilePhone = "+380-95-8051883";

		boolean actual = mobilePhone.matches(RegexContainer.MOB_PHONE_NUM_REGEX);
		boolean expected = false;

		assertEquals(expected, actual);

	}

	@Test
	public void testMobilePhoneNum2RegexEmpty() {
		String mobilePhone = "";

		boolean actual = mobilePhone.matches(RegexContainer.MOB_PHONE_NUM2_REGEX);
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

	@Test
	public void testMobilePhoneNum2RegexWrongFormat() {
		String mobilePhone = "095-805-1883";

		boolean actual = mobilePhone.matches(RegexContainer.MOB_PHONE_NUM2_REGEX);
		boolean expected = false;

		assertEquals(expected, actual);

	}

	@Test
	public void testEmailRegex() {
		String email = "bla@gmail.com";

		boolean actual = email.matches(RegexContainer.EMAIL_REGEX);
		boolean expected = true;

		assertEquals(expected, actual);

	}

	@Test
	public void testEmailRegexEmpty() {
		String email = "";

		boolean actual = email.matches(RegexContainer.EMAIL_REGEX);
		boolean expected = false;

		assertEquals(expected, actual);

	}

	@Test
	public void testEmailRegexWrongFormat() {
		String email = "blagmail.com";

		boolean actual = email.matches(RegexContainer.EMAIL_REGEX);
		boolean expected = false;

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
	public void testSkypeRegexEmpty() {
		String skype = "";

		boolean actual = skype.matches(RegexContainer.SKYPE_REGEX);
		boolean expected = false;

		assertEquals(expected, actual);

	}

	@Test
	public void testSkypeRegexWongFormat() {
		String skype = "mija!shu91";

		boolean actual = skype.matches(RegexContainer.SKYPE_REGEX);
		boolean expected = false;

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
	public void testAddressIndexRegexEmpty() {
		String index = "";

		boolean actual = index.matches(RegexContainer.ADDRESS_INDEX_REGEX);
		boolean expected = false;

		assertEquals(expected, actual);

	}

	@Test
	public void testAddressIndexRegexWrongInput() {
		String index = "123ww";

		boolean actual = index.matches(RegexContainer.ADDRESS_INDEX_REGEX);
		boolean expected = false;

		assertEquals(expected, actual);

	}

	@Test
	public void testAddressCityStreetRegex() {
		String street = "A. Skovorody str.";

		boolean actual = street.matches(RegexContainer.ADDRESS_CITY_STREET_REGEX);
		boolean expected = true;

		assertEquals(expected, actual);

	}

	@Test
	public void testAddressCityStreetRegexEmpty() {
		String street = "";

		boolean actual = street.matches(RegexContainer.ADDRESS_CITY_STREET_REGEX);
		boolean expected = false;

		assertEquals(expected, actual);

	}

	@Test
	public void testAddressCityStreetRegexWrongInput() {
		String street = "123";

		boolean actual = street.matches(RegexContainer.ADDRESS_CITY_STREET_REGEX);
		boolean expected = false;

		assertEquals(expected, actual);

	}

	@Test
	public void testAddressHouseAppNumRegex() {
		String appNum = "14";

		boolean actual = appNum.matches(RegexContainer.ADDRESS_HOUSE_APPART_NUM_REGEX);
		boolean expected = true;

		assertEquals(expected, actual);

	}

	@Test
	public void testAddressHouseAppNumRegexWithSymbol() {
		String appNum = "14b";

		boolean actual = appNum.matches(RegexContainer.ADDRESS_HOUSE_APPART_NUM_REGEX);
		boolean expected = true;

		assertEquals(expected, actual);

	}

	@Test
	public void testAddressHouseAppNumRegexEmpty() {
		String appNum = "";

		boolean actual = appNum.matches(RegexContainer.ADDRESS_HOUSE_APPART_NUM_REGEX);
		boolean expected = false;

		assertEquals(expected, actual);

	}

	@Test
	public void testAddressHouseAppNumRegexWrongFormat() {
		String appNum = "b";

		boolean actual = appNum.matches(RegexContainer.ADDRESS_HOUSE_APPART_NUM_REGEX);
		boolean expected = false;

		assertEquals(expected, actual);

	}

}
