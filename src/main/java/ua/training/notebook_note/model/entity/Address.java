package ua.training.notebook_note.model.entity;

import java.util.Objects;

import ua.training.notebook_note.utils.IBuilder;
import ua.training.notebook_note.view.ViewMessage;

/**
 * immutable class that represents consistent subscriber's Address
 * 
 * @author Solomka
 *
 */
public final class Address {

	private final String index;
	private final String city;
	private final String street;
	private final String houseNumber;
	private final String apartmentNumber;

	public static class Builder implements IBuilder<Address> {

		private String index;
		private String city;
		private String street;
		private String houseNumber;
		private String apartmentNumber;

		public Builder() {

		}

		public String getIndex() {
			return index;
		}

		public Builder setIndex(String index) {
			this.index = index;
			return this;
		}

		public String getCity() {
			return city;
		}

		public Builder setCity(String city) {
			this.city = city;
			return this;
		}

		public String getStreet() {
			return street;
		}

		public Builder setStreet(String street) {
			this.street = street;
			return this;
		}

		public String getHouseNumber() {
			return houseNumber;
		}

		public Builder setHouseNumber(String houseNumber) {
			this.houseNumber = houseNumber;
			return this;
		}

		public String getApartmentNumber() {
			return apartmentNumber;
		}

		public Builder setApartmentNumber(String apartmentNumber) {
			this.apartmentNumber = apartmentNumber;
			return this;
		}

		@Override
		public Address build() {
			return new Address(this);
		}
	}

	private Address(Builder builder) {
		Objects.requireNonNull(builder);

		this.index = Objects.requireNonNull(builder.getIndex());
		this.city = Objects.requireNonNull(builder.getCity());
		this.street = Objects.requireNonNull(builder.getStreet());
		this.houseNumber = Objects.requireNonNull(builder.getHouseNumber());
		this.apartmentNumber = Objects.requireNonNull(builder.getApartmentNumber());
	}

	public String getIndex() {
		return index;
	}

	public String getCity() {
		return city;
	}

	public String getStreet() {
		return street;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public String getApartmentNumber() {
		return apartmentNumber;
	}

	@Override
	public String toString() {
		return new StringBuilder(ViewMessage.ADDRESS).append(ViewMessage.LEFT_PARENTHESIS).append(ViewMessage.EMPTY_STR)
				.append(ViewMessage.ADDRESS_INDEX).append(ViewMessage.COLON).append(getIndex())
				.append(ViewMessage.COMMA).append(ViewMessage.EMPTY_STR).append(ViewMessage.ADDRESS_CITY)
				.append(ViewMessage.COLON).append(getCity()).append(ViewMessage.COMMA).append(ViewMessage.EMPTY_STR)
				.append(ViewMessage.ADDRESS_STREET).append(ViewMessage.COLON).append(getCity())
				.append(ViewMessage.COMMA).append(ViewMessage.EMPTY_STR).append(ViewMessage.ADDRESS_HOUSE_NUM)
				.append(ViewMessage.COLON).append(getHouseNumber()).append(ViewMessage.COMMA)
				.append(ViewMessage.EMPTY_STR).append(ViewMessage.ADDRESS_APPART_NUM).append(ViewMessage.COLON)
				.append(getApartmentNumber()).append(ViewMessage.EMPTY_STR).append(ViewMessage.RIGHT_PARANTHESIS)
				.toString();
	}

}
