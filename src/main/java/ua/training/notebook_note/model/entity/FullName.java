package ua.training.notebook_note.model.entity;

import java.util.Objects;

import ua.training.notebook_note.view.ViewMessage;

/**
 * immutable class that represents consistent subscriber's FullName
 * 
 * @author Solomka
 *
 */
public final class FullName {

	private final String name;
	private final String surname;
	private final String patronymic;

	public FullName(String name, String surname, String patronymic) {

		this.name = Objects.requireNonNull(name);
		this.surname = Objects.requireNonNull(surname);
		this.patronymic = Objects.requireNonNull(patronymic);
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
		return new StringBuilder(ViewMessage.FULLNAME).append(ViewMessage.LEFT_PARENTHESIS)
				.append(ViewMessage.EMPTY_STR).append(ViewMessage.NAME).append(ViewMessage.COLON).append(getName())
				.append(ViewMessage.COMMA).append(ViewMessage.EMPTY_STR).append(ViewMessage.SURNAME)
				.append(ViewMessage.COLON).append(getSurname()).append(ViewMessage.COMMA).append(ViewMessage.EMPTY_STR)
				.append(ViewMessage.PATRONYMIC).append(ViewMessage.COLON).append(getPatronymic())
				.append(ViewMessage.EMPTY_STR).append(ViewMessage.RIGHT_PARANTHESIS)
				.toString();
	}

}
