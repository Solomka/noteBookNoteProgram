package ua.training.notebook_note.model.entity;

import java.util.Objects;

import ua.training.notebook_note.model.entity.types.Group;
import ua.training.notebook_note.utils.DateTime;
import ua.training.notebook_note.utils.IBuilder;

/**
 * immutable class that represents consistent notebook's note
 * 
 * @author Solomka
 *
 */
public final class NoteBookNoteBO {

	private final FullName fullName;
	private final String nickname;
	private final Contacts contacts;
	private final String comment;
	private final Address address;
	private final Group group;

	private final String nameFormatted;
	private final String addressFormatted;

	private final DateTime dateOfCreation;
	private DateTime dateOfUpdate;

	/**
	 * builder class that creates immutable instance of
	 * {@linkplain NoteBookNoteBO}
	 * 
	 * @author Solomka
	 *
	 */
	public static class Builder implements IBuilder<NoteBookNoteBO> {

		private FullName fullName;
		private String nickname;
		private Contacts contacts;
		private String comment;
		private Address address;
		private Group group;

		private String nameFormatted;
		private String addressFormatted;

		private DateTime dateOfCreation;
		private DateTime dateOfUpdate;

		public Builder() {

		}

		public FullName getFullName() {
			return fullName;
		}

		public Builder setFullName(FullName fullName) {
			this.fullName = fullName;
			return this;
		}

		public String getNickname() {
			return nickname;
		}

		public Builder setNickname(String nickname) {
			this.nickname = nickname;
			return this;
		}

		public Contacts getContacts() {
			return contacts;
		}

		public Builder setContacts(Contacts contacts) {
			this.contacts = contacts;
			return this;
		}

		public String getComment() {
			return comment;
		}

		public Builder setComment(String comment) {
			this.comment = comment;
			return this;
		}

		public Address getAddress() {
			return address;
		}

		public Builder setAddress(Address address) {
			this.address = address;
			return this;
		}

		public Group getGroup() {
			return group;
		}

		public Builder setGroup(Group group) {
			this.group = group;
			return this;
		}

		public String getNameFormatted() {
			return nameFormatted;
		}

		public Builder setNameFormatted(String nameFormatted) {
			this.nameFormatted = nameFormatted;
			return this;
		}

		public String getAddressFormatted() {
			return addressFormatted;
		}

		public Builder setAddressFormatted(String addressFormatted) {
			this.addressFormatted = addressFormatted;
			return this;
		}

		public DateTime getDateOfCreation() {
			return dateOfCreation;
		}

		public Builder setDateOfCreation(DateTime dateOfCreation) {
			this.dateOfCreation = dateOfCreation;
			return this;
		}

		public DateTime getDateOfUpdate() {
			return dateOfUpdate;
		}

		public Builder setDateOfUpdate(DateTime dateOfUpdate) {
			this.dateOfUpdate = dateOfUpdate;
			return this;
		}

		@Override
		public NoteBookNoteBO build() {
			return new NoteBookNoteBO(this);
		}

	}

	private NoteBookNoteBO(Builder builder) {
		Objects.requireNonNull(builder);

		this.fullName = builder.getFullName();
		this.nickname = builder.getNickname();
		this.contacts = builder.getContacts();
		this.comment = builder.getComment();
		this.address = builder.getAddress();
		this.group = builder.getGroup();
		this.nameFormatted = builder.getNameFormatted();
		this.addressFormatted = builder.getAddressFormatted();
		this.dateOfCreation = builder.getDateOfCreation();
		this.dateOfUpdate = builder.getDateOfUpdate();

	}

	public DateTime getDateOfCreation() {
		return dateOfCreation;
	}

	public DateTime getDateOfUpdate() {
		return dateOfUpdate;
	}

	public void setDateOfUpdate(DateTime dateOfUpdate) {
		this.dateOfUpdate = dateOfUpdate;
	}

	public FullName getFullName() {
		return fullName;
	}

	public String getNickname() {
		return nickname;
	}

	public Contacts getContacts() {
		return contacts;
	}

	public String getComment() {
		return comment;
	}

	public Address getAddress() {
		return address;
	}

	public Group getGroup() {
		return group;
	}

	public String getNameFormatted() {
		return nameFormatted;
	}

	public String getAddressFormatted() {
		return addressFormatted;
	}

	@Override
	public String toString() {
		return "NoteBookNote { " + '\n' + fullName + ",\nNickname=" + nickname + ",\n" + contacts + ",\nComment="
				+ comment + ",\n" + address + ",\ngroup=" + group + ",\nNameFormatted=" + nameFormatted
				+ ",\nAddressFormatted=" + addressFormatted + ",\nDateOfCreation=" + dateOfCreation + ",\nDateOfUpdate="
				+ dateOfUpdate + "}";
	}

}
