package ua.training.notebook_note.model.entity;

import java.util.Objects;

import ua.training.notebook_note.utils.IBuilder;
import ua.training.notebook_note.view.ViewMessage;

/**
 * immutable class that represents consistent subscriber's Contacts
 * 
 * @author Solomka
 *
 */
public final class Contacts {

	private final String homePhoneNum;
	private final String mobilePhoneNumFirst;
	private final String mobilePhoneNumSecond;
	private final String email;
	private final String skype;

	public static class Builder implements IBuilder<Contacts> {

		private String homePhoneNum;
		private String mobilePhoneNumFirst;
		private String mobilePhoneNumSecond;
		private String email;
		private String skype;

		public Builder() {

		}

		public String getHomePhoneNum() {
			return homePhoneNum;
		}

		public Builder setHomePhoneNum(String homePhoneNum) {
			this.homePhoneNum = homePhoneNum;
			return this;
		}

		public String getMobilePhoneNumFirst() {
			return mobilePhoneNumFirst;
		}

		public Builder setMobilePhoneNumFirst(String mobilePhoneNumFirst) {
			this.mobilePhoneNumFirst = mobilePhoneNumFirst;
			return this;
		}

		public String getMobilePhoneNumSecond() {
			return mobilePhoneNumSecond;
		}

		public Builder setMobilePhoneNumSecond(String mobilePhoneNumSecond) {
			this.mobilePhoneNumSecond = mobilePhoneNumSecond;
			return this;
		}

		public String getEmail() {
			return email;
		}

		public Builder setEmail(String email) {
			this.email = email;
			return this;
		}

		public String getSkype() {
			return skype;
		}

		public Builder setSkype(String skype) {
			this.skype = skype;
			return this;
		}

		@Override
		public Contacts build() {
			return new Contacts(this);
		}

	}

	private Contacts(Builder builder) {
		Objects.requireNonNull(builder);

		this.homePhoneNum = Objects.requireNonNull(builder.getHomePhoneNum());
		this.mobilePhoneNumFirst = Objects.requireNonNull(builder.getMobilePhoneNumFirst());
		this.mobilePhoneNumSecond = Objects.requireNonNull(builder.getMobilePhoneNumSecond());
		this.email = Objects.requireNonNull(builder.getEmail());
		this.skype = Objects.requireNonNull(builder.getSkype());
	}

	public String getHomePhoneNum() {
		return homePhoneNum;
	}

	public String getMobilePhoneNumFirst() {
		return mobilePhoneNumFirst;
	}

	public String getMobilePhoneNumSecond() {
		return mobilePhoneNumSecond;
	}

	public String getEmail() {
		return email;
	}

	public String getSkype() {
		return skype;
	}

	@Override
	public String toString() {

		return new StringBuilder(ViewMessage.CONTACTS).append(ViewMessage.LEFT_PARENTHESIS)
				.append(ViewMessage.EMPTY_STR).append(ViewMessage.HOME_PHONE_NUM).append(ViewMessage.COLON)
				.append(getHomePhoneNum()).append(ViewMessage.COMMA).append(ViewMessage.EMPTY_STR)
				.append(ViewMessage.MOB_PHONE_NUM_1).append(ViewMessage.COLON).append(getMobilePhoneNumFirst())
				.append(ViewMessage.COMMA).append(ViewMessage.EMPTY_STR).append(ViewMessage.MOB_PHONE_NUM_2)
				.append(ViewMessage.COLON).append(getMobilePhoneNumSecond()).append(ViewMessage.COMMA)
				.append(ViewMessage.EMPTY_STR).append(ViewMessage.EMAIL).append(ViewMessage.COLON).append(getEmail())
				.append(ViewMessage.COMMA).append(ViewMessage.EMPTY_STR).append(ViewMessage.SKYPE)
				.append(ViewMessage.COLON).append(getSkype()).append(ViewMessage.EMPTY_STR)
				.append(ViewMessage.RIGHT_PARANTHESIS).toString();
	}

}
