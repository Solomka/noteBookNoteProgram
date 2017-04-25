package ua.training.notebook_note.model.entity.types;

/**
 * Enum that represents subscriber's group type
 * 
 * @author Solomka
 *
 */
public enum Group {

	SIMPLE_CLIENT(0), VIP_CLIENT(1);

	private int value;

	Group(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	/**
	 * Provides Group for a given int value
	 * 
	 * @param value
	 *            value describing Group
	 * @return Group or null if appropriate group wasn't found
	 */
	public static Group getGroupByValue(int value) {
		for (final Group pred : Group.values()) {
			if (pred.getValue() == value) {
				return pred;
			}
		}
		return null;
	}

}
