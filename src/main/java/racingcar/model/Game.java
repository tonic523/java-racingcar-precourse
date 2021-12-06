package racingcar.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

import camp.nextstep.edu.missionutils.Randoms;

public class Game {
	private List<Car> cars;
	private Supplier<Integer> moveValue = () -> Randoms.pickNumberInRange(1, 9);
	private Predicate<Integer> moveCondition = i -> i >= 4;

	public Game(List<Car> cars) throws IllegalArgumentException {
		this.cars = cars;
	}

	public void play() {
		for (Car car : cars) {
			if (moveCondition.test(moveValue.get())) {
				car.move();
			}
		}
	}

	public List<Car> winners() {
		List<Car> winners = new ArrayList<>();
		Collections.sort(cars);
		int max_position = cars.get(0).getPosition();
		for (Car car : cars) {
			if (car.getPosition() == max_position) {
				winners.add(car);
			}
		}
		return winners;
	}

	public List<Car> getCars() {
		return cars;
	}
}
