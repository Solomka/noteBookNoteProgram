package ua.training.notebook_note.model;

public enum ModelExistentNickname {

	SOLOMKA("solomka"), LORA("lora");

	private String value;

	ModelExistentNickname(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	/**
	 * Return existent nickname for a given string value
	 * 
	 * @param value
	 * @return
	 */

	public static ModelExistentNickname forValue(String value) {
		for (final ModelExistentNickname nickname : ModelExistentNickname.values()) {
			if (nickname.getValue() == value) {
				return nickname;
			}
		}
		return null;

	}

}
