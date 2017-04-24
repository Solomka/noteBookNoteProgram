package ua.training.notebook_note.model.entity;

public final class FullName {

	private final String name;
	private final String surname;
	private final String patronymic;

	public FullName(String name, String surname, String patronymic) {

		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getPatronymic() {
		return patronymic;
	}

	@Override
	public String toString() {
		return "FullName { name=" + name + ", surname=" + surname + ", patronymic=" + patronymic + " }";
	}

}
