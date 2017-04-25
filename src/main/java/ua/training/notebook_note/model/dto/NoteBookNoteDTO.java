package ua.training.notebook_note.model.dto;

import ua.training.notebook_note.model.entity.types.Group;

/**
 * Class that represents notebook's note dto object that contains all the
 * information about subscriber received from the console input
 * 
 * @author Solomka
 *
 */
public class NoteBookNoteDTO {

	private FullNameDTO fullName;
	private String nickname;
	private ContactsDTO contacts;
	private String comment;
	private AddressDTO address;
	private Group group;

	public NoteBookNoteDTO() {

	}

	public NoteBookNoteDTO(FullNameDTO fullName, String nickname, ContactsDTO contacts, String comment,
			AddressDTO address, Group group) {

		this.fullName = fullName;
		this.nickname = nickname;
		this.contacts = contacts;
		this.comment = comment;
		this.address = address;
		this.group = group;
	}

	public FullNameDTO getFullName() {
		return fullName;
	}

	public void setFullName(FullNameDTO fullName) {
		this.fullName = fullName;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public ContactsDTO getContacts() {
		return contacts;
	}

	public void setContacts(ContactsDTO contacts) {
		this.contacts = contacts;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

}
