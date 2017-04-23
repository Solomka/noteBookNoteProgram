package ua.training.notebook_note.model.dto;

import ua.training.notebook_note.model.entity.types.Group;

public class NoteBookNoteDTO {

	private FullNameDTO fullName;
	private String nickname;
	private String comment;
	private AddressDTO addressDTO;

	private Group group;

	public NoteBookNoteDTO() {

	}

	public NoteBookNoteDTO(FullNameDTO fullName, String nickname, String comment, AddressDTO addressDTO, Group group) {

		this.fullName = fullName;
		this.nickname = nickname;
		this.comment = comment;
		this.addressDTO = addressDTO;
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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public AddressDTO getAddressDTO() {
		return addressDTO;
	}

	public void setAddressDTO(AddressDTO addressDTO) {
		this.addressDTO = addressDTO;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

}
