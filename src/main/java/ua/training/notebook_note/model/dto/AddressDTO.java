package ua.training.notebook_note.model.dto;

public class AddressDTO {
	
	private String index;
	private String city;
	private String street;
	private int homeNumber;
	private int apartmentNumber;
	
	
	public AddressDTO() {
		
	}


	public AddressDTO(String index, String city, String street, int homeNumber, int apartmentNumber) {
		
		this.index = index;
		this.city = city;
		this.street = street;
		this.homeNumber = homeNumber;
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


	public int getHomeNumber() {
		return homeNumber;
	}


	public void setHomeNumber(int homeNumber) {
		this.homeNumber = homeNumber;
	}


	public int getApartmentNumber() {
		return apartmentNumber;
	}


	public void setApartmentNumber(int apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}
	
	
	
	

}
