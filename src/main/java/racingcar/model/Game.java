package racingcar.model;

import java.util.List;

public class Game {
	private List<Car> cars;

	public Game(List<Car> cars) throws IllegalArgumentException {
		validateLeastTwoCars(cars);
		this.cars = cars;
	}

	private static void validateLeastTwoCars(List<Car> cars) throws IllegalArgumentException {
		if (cars.size() < 2) {
			throw new IllegalArgumentException("참가할 자동차는 최소 2대 이상이다.");
		}
	}
}
