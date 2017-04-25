package ua.training.notebook_note;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ua.training.notebook_note.model.Model;
import ua.training.notebook_note.model.entity.Address;
import ua.training.notebook_note.model.entity.Contacts;
import ua.training.notebook_note.model.entity.FullName;
import ua.training.notebook_note.model.entity.NoteBookNoteBO;
import ua.training.notebook_note.model.entity.types.Group;
import ua.training.notebook_note.utils.DateTime;

public class ModelTest {

	@Test(expected = NullPointerException.class)
	public void testMainConstructorWithParams() {
		new Model(null);
	}

	@Test
	public void testSetNoteBookNoteBO() {

		Model model = new Model();
		NoteBookNoteBO expectedNoteBO = generateTestNoteBookNoteBO();
		model.setNoteBookNoteBO(expectedNoteBO);

		NoteBookNoteBO actualNoteBO = model.getNoteBooNoteBO();

		assertEquals(expectedNoteBO, actualNoteBO);
	}

	@Test(expected = NullPointerException.class)
	public void testSetNoteBookNoteBONullPointerException() {

		Model model = new Model();
		model.setNoteBookNoteBO(null);
	}

	private NoteBookNoteBO generateTestNoteBookNoteBO() {

		String nickName = "test@test";
		String comment = "fine";
		String fullNameF = "Test T.";
		String addressF = "05678, Lviv, Klonovycha str., 14/6";
		DateTime dateTime = new DateTime();

		NoteBookNoteBO noteBO = new NoteBookNoteBO.Builder().setFullName(generateFullName()).setNickname(nickName)
				.setContacts(generateContacts()).setAddress(generateAddress()).setFullNameFormatted(fullNameF)
				.setAddressFormatted(addressF).setComment(comment).setGroup(Group.SIMPLE_CLIENT)
				.setDateOfCreation(dateTime).setDateOfUpdate(dateTime).build();
		return noteBO;
	}

	private FullName generateFullName() {
		return new FullName("Test", "Test", "Test");
	}

	private Contacts generateContacts() {
		return new Contacts.Builder().setHomePhoneNum("273-12-23").setMobilePhoneNumFirst("+380-67-567-1223")
				.setMobilePhoneNumSecond("").setEmail("test@gmail.com").setSkype("test.test").build();
	}

	private Address generateAddress() {
		return new Address.Builder().setCity("Lviv").setStreet("I. Franks str.").setHouseNumber("12c")
				.setApartmentNumber("2").setIndex("12345").build();

	}

}
