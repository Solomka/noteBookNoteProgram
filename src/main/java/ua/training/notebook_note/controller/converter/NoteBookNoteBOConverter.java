package ua.training.notebook_note.controller.converter;

import ua.training.notebook_note.model.dto.AddressDTO;
import ua.training.notebook_note.model.dto.ContactsDTO;
import ua.training.notebook_note.model.dto.FullNameDTO;
import ua.training.notebook_note.model.dto.NoteBookNoteDTO;
import ua.training.notebook_note.model.entity.Address;
import ua.training.notebook_note.model.entity.Contacts;
import ua.training.notebook_note.model.entity.FullName;
import ua.training.notebook_note.model.entity.NoteBookNoteBO;
import ua.training.notebook_note.utils.DateTime;
import ua.training.notebook_note.view.ViewMessage;

public final class NoteBookNoteBOConverter {

	private NoteBookNoteBOConverter() {
		throw new RuntimeException();
	}

	public static NoteBookNoteBO fromNoteBookNoteDTO(final NoteBookNoteDTO noteDTO) {

		return new NoteBookNoteBO.Builder().setFullName(generateFullName(noteDTO.getFullName()))
				.setNickname(noteDTO.getNickname()).setContacts(generateContacts(noteDTO.getContacts()))
				.setComment(noteDTO.getComment()).setAddress(generateAddress(noteDTO.getAddress()))
				.setGroup(noteDTO.getGroup()).setNameFormatted(generateNoteFormatedFullName(noteDTO.getFullName()))
				.setAddressFormatted(generateNoteFormattedAddress(noteDTO.getAddress()))
				.setDateOfCreation(new DateTime()).setDateOfUpdate(new DateTime()).build();
	}

	private static FullName generateFullName(FullNameDTO fullNameDTO) {
		return new FullName(fullNameDTO.getName(), fullNameDTO.getSurname(), fullNameDTO.getPatronymic());

	}

	private static Contacts generateContacts(final ContactsDTO contactsDTO) {
		return new Contacts.Builder().setHomePhoneNum(contactsDTO.getHomePhoneNum())
				.setMobilePhoneNumFirst(contactsDTO.getMobilePhoneNumFirst())
				.setMobilePhoneNumSecond(contactsDTO.getMobilePhoneNumSecond()).setEmail(contactsDTO.getEmail())
				.setSkype(contactsDTO.getSkype()).build();

	}

	private static Address generateAddress(final AddressDTO addressDTO) {
		return new Address.Builder().setCity(addressDTO.getCity()).setStreet(addressDTO.getStreet())
				.setHouseNumber(addressDTO.getHouseNumber()).setApartmentNumber(addressDTO.getApartmentNumber())
				.setIndex(addressDTO.getIndex()).build();

	}

	private static String generateNoteFormatedFullName(FullNameDTO fullNameDTO) {
		return fullNameDTO.getSurname() + ViewMessage.EMPTY_STR + fullNameDTO.getName().substring(0, 1)
				+ ViewMessage.FULL_STOP;

	}

	private static String generateNoteFormattedAddress(AddressDTO addressDTO) {
		return addressDTO.toString();

	}

}
