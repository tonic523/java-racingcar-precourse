package racingcar.model;

public class Car implements Comparable<Car> {

	public static final int MOVE_RANGE_MIN = 0;
	public static final int MOVE_RANGE_MAX = 9;
	private static final int MOVE_CONDITION = 4;
	private static final String NAME_ERROR = "자동차 이름은 1~5자여야 한다.";

	private final String name;
	private int position = 0;

	public Car(String name) throws IllegalArgumentException {
		validateName(name);
		this.name = name;
	}

	private void validateName(String name) throws IllegalArgumentException {
		if (name.isEmpty() || name.length() > 5) {
			throw new IllegalArgumentException(NAME_ERROR);
		}
	}

	public void moveForward(int number) {
		if (number >= MOVE_CONDITION) {
			position++;
		}
	}

	public String getName() {
		return name;
	}

	public int getPosition() {
		return position;
	}

	@Override
	public int compareTo(Car c) {
		return (this.position - c.position) * -1;
	}
}
