package racingcar;

public class Car implements Comparable<Car> {

	private static String nameErrorMessage = "[ERROR] 이름은 1자 이상 5자 이하여야 합니다.";
	private static int MOVABLE_MIN_VALUE = 4;
	public static int MOVE_MIN_VALUE = 0;
	public static int MOVE_MAX_VALUE = 9;

	private final String name;
	private int position = 0;

	public Car(String name) throws IllegalArgumentException {
		validateName(name);
		this.name = name;
	}

	public void move(int moveValue) {
		if (moveValue >= MOVABLE_MIN_VALUE) {
			position++;
		}
	}

	public int getPosition() {
		return position;
	}

	public String getName() {
		return name;
	}

	private void validateName(String name) throws IllegalArgumentException {
		if (name.isEmpty() || name.length() > 5) {
			throw new IllegalArgumentException(nameErrorMessage);
		}
	}

	@Override
	public int compareTo(Car c) {
		if (position < c.position) {
			return 1;
		}
		return -1;
	}

	@Override
	public String toString() {
		return name;
	}
}