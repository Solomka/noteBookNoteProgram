package ua.training.notebook_note;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

import ua.training.notebook_note.model.dto.AddressDTO;
import ua.training.notebook_note.model.dto.ContactsDTO;
import ua.training.notebook_note.model.dto.FullNameDTO;
import ua.training.notebook_note.model.dto.NoteBookNoteDTO;
import ua.training.notebook_note.model.entity.Address;
import ua.training.notebook_note.model.entity.Contacts;
import ua.training.notebook_note.model.entity.FullName;
import ua.training.notebook_note.model.entity.NoteBookNoteBO;
import ua.training.notebook_note.model.entity.types.Group;
import ua.training.notebook_note.service.converter.NoteBookNoteBOConverter;
import ua.training.notebook_note.utils.DateTime;

public class NoteBookNoteBOConverterTest {

	private NoteBookNoteDTO noteDTO;

	@Test(expected = NullPointerException.class)
	public void fromNoteBookNoteDTOTestNullPointerException() {
		NoteBookNoteBOConverter.fromNoteBookNoteDTO(null);
	}

	//@Ignore
	@Test
	public void fromNoteBookNoteDTOTest() {
		noteDTO = generateTestNoteBookNoteDTO();

		NoteBookNoteBO expectedNoteBookNoteBO = generateTestNoteBookNoteBO();
		NoteBookNoteBO actualNoteBookNoteBO = NoteBookNoteBOConverter.fromNoteBookNoteDTO(noteDTO);

		assertEquals(expectedNoteBookNoteBO, actualNoteBookNoteBO);

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

	private NoteBookNoteDTO generateTestNoteBookNoteDTO() {

		String nickName = "test@test";
		String comment = "fine";
		
		NoteBookNoteDTO noteDTO = new NoteBookNoteDTO();

		noteDTO.setFullName(generateFullNameDTO());
		noteDTO.setNickname(nickName);
		noteDTO.setContacts(generateContactsDTO());
		noteDTO.setAddress(generateAddressDTO());
		noteDTO.setComment(comment);
		noteDTO.setGroup(Group.SIMPLE_CLIENT);
		return noteDTO;
	}

	private FullNameDTO generateFullNameDTO() {
		return new FullNameDTO("Test", "Test", "Test");
	}

	private ContactsDTO generateContactsDTO() {
		ContactsDTO contactsDTO = new ContactsDTO();
		contactsDTO.setHomePhoneNum("273-12-23");
		contactsDTO.setMobilePhoneNumFirst("+380-67-567-1223");
		contactsDTO.setMobilePhoneNumSecond("");
		contactsDTO.setEmail("test@gmail.com");
		contactsDTO.setSkype("test.test");

		return contactsDTO;
	}

	private AddressDTO generateAddressDTO() {
		AddressDTO addressDTO = new AddressDTO();
		addressDTO.setCity("Lviv");
		addressDTO.setStreet("I. Franks str.");
		addressDTO.setHouseNumber("12c");
		addressDTO.setApartmentNumber("2");
		addressDTO.setIndex("12345");
		
		return addressDTO;
	
	}

}
