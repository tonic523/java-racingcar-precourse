package racingcar.model;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

import camp.nextstep.edu.missionutils.Randoms;

public class Game {
	private List<Car> cars;
	private Supplier<Integer> moveValue = () -> Randoms.pickNumberInRange(1, 9);
	private Predicate<Integer> moveCondition = i -> i >= 4;

	public Game(List<Car> cars) throws IllegalArgumentException {
		validateLeastTwoCars(cars);
		this.cars = cars;
	}

	public void play() {
		for (Car car : cars) {
			if (moveCondition.test(moveValue.get())) {
				car.move();
			}
		}
	}

	public List<Car> getCars() {
		return cars;
	}

	private static void validateLeastTwoCars(List<Car> cars) throws IllegalArgumentException {
		if (cars.size() < 2) {
			throw new IllegalArgumentException("참가할 자동차는 최소 2대 이상이다.");
		}
	}
}
