package ua.training.notebook_note.exception;

public class RepeatedNicknameException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nickname;

	public RepeatedNicknameException(String message) {
		super(message);
	}

	public RepeatedNicknameException(String message, String nickname) {
		super(message);
		this.nickname = nickname;
	}

	public String getNickname() {
		return nickname;
	}

}
