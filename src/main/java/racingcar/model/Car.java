package racingcar.model;

public class Car {

	public static final int MIN_LENGTH_NAME = 1;
	public static final int MAX_LENGTH_NAME = 5;

	private final String name;
	private int position = 0;

	public Car(String name) throws IllegalArgumentException {
		validateLength(name);
		this.name = name;
	}

	public void move() {
		position++;
	}

	public int getPosition() {
		return position;
	}

	public String getName() {
		return name;
	}

	private static void validateLength(String input) throws IllegalArgumentException {
		int length = input.length();
		if (length < MIN_LENGTH_NAME || length > MAX_LENGTH_NAME) {
			throw new IllegalArgumentException(
				String.format("자동차 이름의 길이는 %d ~ %d 여야 한다.",
					MIN_LENGTH_NAME, MAX_LENGTH_NAME)
			);
		}
	}
}
