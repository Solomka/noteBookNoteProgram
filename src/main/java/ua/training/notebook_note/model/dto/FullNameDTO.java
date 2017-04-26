package ua.training.notebook_note.model.dto;

/**
 * Class that represents subscriber's fullname dto object that contains
 * information about subscriber fullname received from the console input
 * 
 * @author Solomka
 *
 */
public class FullNameDTO {
	
	private String name;
	private String surname;
	private String patronymic;

	public FullNameDTO() {

	}

	public FullNameDTO(String name, String surname, String patronymic) {
		
		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}
}
