package ua.training.notebook_note.model.dto;

/**
 * Class that represents subscriber's address dto object that contains
 * information about subscriber address received from the console input
 * 
 * @author Solomka
 *
 */
public class AddressDTO {
	
	private String index;
	private String city;
	private String street;
	private String houseNumber;
	private String apartmentNumber;

	public AddressDTO() {

	}

	public AddressDTO(String index, String city, String street, String houseNumber, String apartmentNumber) {
		
		this.index = index;
		this.city = city;
		this.street = street;
		this.houseNumber = houseNumber;
		this.apartmentNumber = apartmentNumber;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getApartmentNumber() {
		return apartmentNumber;
	}

	public void setApartmentNumber(String apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}
}
