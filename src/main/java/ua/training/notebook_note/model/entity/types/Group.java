package ua.training.notebook_note.model.entity.types;

public enum Group {

	SIMPLE_CLIENT(1), VIP_CLIENT(1);

	private int value;

	Group(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static Group getGroupByValue(int value) {
		for (final Group pred : Group.values()) {
			if (pred.getValue() == value) {
				return pred;
			}
		}
		return null;
	}

}
