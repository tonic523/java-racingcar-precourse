package racingcar;

import static racingcar.Car.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import camp.nextstep.edu.missionutils.Randoms;

public class Game {

	private List<Car> cars = new ArrayList<>();

	public void participate(Car car) {
		cars.add(car);
	}

	public List<Car> getCars() {
		return cars;
	}

	public void play() {
		for (Car car : cars) {
			car.move(Randoms.pickNumberInRange(MOVE_MIN_VALUE, MOVE_MAX_VALUE));
		}
	}

	public List<Car> winners() {
		List<Car> winners = new ArrayList<>();
		Collections.sort(cars);
		int maxPosition = cars.get(0).getPosition();
		Iterator<Car> iterator = cars.iterator();
		while (iterator.hasNext()) {
			Car car = iterator.next();
			if (car.getPosition() != maxPosition) {
				break;
			}
			winners.add(car);
		}
		return winners;
	}
}