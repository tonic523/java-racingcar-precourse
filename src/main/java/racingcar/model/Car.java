package racingcar.model;

import racingcar.utils.Validate;

public class Car {
	private final String name;
	private int position = 0;

	public Car(String name) {
		Validate.correctLength(name);
		this.name = name;
	}

	// 추가 기능 구현
}
