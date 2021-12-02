package racingcar.model;

public class Car {

	private static final int MOVE_RANGE_MIN = 0;
	private static final int MOVE_RANGE_MAX = 9;
	private static final int MOVE_CONDITION = 4;

	private final String name;
	private int position = 0;

	public Car(String name) throws IllegalArgumentException {
		validateName(name);
		this.name = name;
	}

	private void validateName(String name) throws IllegalArgumentException {
		if (name.isEmpty() || name.length() > 5) {
			throw new IllegalArgumentException();
		}
	}

	public void moveForward(int number) {
		if (number >= MOVE_CONDITION) {
			position++;
		}
	}

	public int getPosition() {
		return position;
	}
}
