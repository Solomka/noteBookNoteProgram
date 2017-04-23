package ua.training.notebook_note.model.entity;

public class NoteBookNoteBO {
	
	private String name;
	private String surname;
	private String patronymic;
	private String nickname;
	
	
	public NoteBookNoteBO() {
		super();
	}
	public NoteBookNoteBO(String name, String surname, String patronymic, String nickname) {
		super();
		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
		this.nickname = nickname;
	}
	@Override
	public String toString() {
		return "NoteBO [name=" + name + ", surname=" + surname + ", patronymic=" + patronymic + ", nickname=" + nickname
				+ "]";
	}
	
	

}
