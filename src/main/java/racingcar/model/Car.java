package racingcar.model;

public class Car {
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
}
