package ua.training.notebook_note.model.entity;

import java.util.Objects;

import ua.training.notebook_note.utils.IBuilder;

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

		public Builder(final Address address) {
			Objects.requireNonNull(address, "address can't be null");
			
			setIndex(address.getIndex()).setCity(address.getCity()).setStreet(address.getStreet())
					.setHouseNumber(address.getHouseNumber()).setApartmentNumber(address.getApartmentNumber());

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
		Objects.requireNonNull(builder, "builder can't be null");

		this.index = builder.getIndex();
		this.city = builder.getCity();
		this.street = builder.getStreet();
		this.houseNumber = builder.getHouseNumber();
		this.apartmentNumber = builder.getApartmentNumber();
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
		return "Address [index=" + index + ", city=" + city + ", street=" + street + ", houseNumber=" + houseNumber
				+ ", apartmentNumber=" + apartmentNumber + "]";
	}

}
