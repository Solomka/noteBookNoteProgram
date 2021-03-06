package ua.training.notebook_note.model.entity;

import java.util.Objects;

import ua.training.notebook_note.model.entity.types.Group;
import ua.training.notebook_note.utils.DateTime;
import ua.training.notebook_note.utils.IBuilder;
import ua.training.notebook_note.view.ViewMessage;

/**
 * immutable class that represents consistent notebook's note object that
 * contains all the information about subscriber
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
	private final DateTime dateOfUpdate;

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

		public Builder setFullNameFormatted(String nameFormatted) {
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

		this.fullName = Objects.requireNonNull(builder.getFullName());
		this.nickname = Objects.requireNonNull(builder.getNickname());
		this.contacts = Objects.requireNonNull(builder.getContacts());
		this.comment = Objects.requireNonNull(builder.getComment());
		this.address = Objects.requireNonNull(builder.getAddress());
		this.group = Objects.requireNonNull(builder.getGroup());
		this.nameFormatted = Objects.requireNonNull(builder.getNameFormatted());
		this.addressFormatted = Objects.requireNonNull(builder.getAddressFormatted());
		this.dateOfCreation = Objects.requireNonNull(builder.getDateOfCreation());
		this.dateOfUpdate = Objects.requireNonNull(builder.getDateOfUpdate());

	}

	public DateTime getDateOfCreation() {
		return dateOfCreation;
	}

	public DateTime getDateOfUpdate() {
		return dateOfUpdate;
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
		return new StringBuilder(ViewMessage.NOTEBOOK_NOTE).append(ViewMessage.LEFT_PARENTHESIS)
				.append(ViewMessage.NEW_LINE).append(getFullName()).append(ViewMessage.COMMA)
				.append(ViewMessage.NEW_LINE).append(ViewMessage.NICKNAME).append(ViewMessage.COLON)
				.append(getNickname()).append(ViewMessage.COMMA).append(ViewMessage.NEW_LINE).append(getContacts())
				.append(ViewMessage.COMMA).append(ViewMessage.NEW_LINE).append(ViewMessage.COMMENT)
				.append(ViewMessage.COLON).append(getComment()).append(ViewMessage.COMMA).append(ViewMessage.NEW_LINE)
				.append(getAddress()).append(ViewMessage.COMMA).append(ViewMessage.NEW_LINE).append(ViewMessage.GROUP)
				.append(ViewMessage.COLON).append(getGroup()).append(ViewMessage.COMMA).append(ViewMessage.NEW_LINE)
				.append(ViewMessage.FULLNAME_FORMATTED).append(ViewMessage.COLON).append(getNameFormatted())
				.append(ViewMessage.COMMA).append(ViewMessage.NEW_LINE).append(ViewMessage.ADDRESS_FORMATTED)
				.append(ViewMessage.COLON).append(getAddressFormatted()).append(ViewMessage.COMMA)
				.append(ViewMessage.NEW_LINE).append(ViewMessage.DATE_OF_CREATION).append(ViewMessage.COLON)
				.append(getDateOfCreation()).append(ViewMessage.COMMA).append(ViewMessage.NEW_LINE)
				.append(ViewMessage.DATE_OF_UPDATE).append(ViewMessage.COLON).append(getDateOfUpdate())
				.append(ViewMessage.RIGHT_PARANTHESIS).toString();

	}

}
