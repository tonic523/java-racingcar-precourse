package racingcar.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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

	public List<Car> winners() {
		List<Car> winners = new ArrayList<>();
		rankInOrder();
		Car winner;
		Iterator<Car> carIterator = cars.iterator();
		if (!(carIterator.hasNext())) {
			return winners;
		}
		winner = carIterator.next();
		winners.add(winner);
		while (carIterator.hasNext()) {
			Car car = carIterator.next();
			if (winner.compareTo(car) == 0) {
				winners.add(car);
			}
		}
		return winners;
	}
}
