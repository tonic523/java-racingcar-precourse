package racingcar.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {

	private List<Car> cars = new ArrayList<>();

	public void participate(List<Car> cars) {
		this.cars = cars;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void play(Movable movable) {
		for (Car car : cars) {
			car.moveForward(movable.move());
		}
	}

	public void rankInOrder() {
		Collections.sort(cars);
	}
}
