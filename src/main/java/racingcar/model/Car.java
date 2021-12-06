package racingcar.model;

import racingcar.utils.Validate;

public class Car {
	private final String name;
	private int position = 0;

	public Car(String name) {
		Validate.correctLength(name);
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
}
