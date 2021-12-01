package racingcar;

import static racingcar.Car.*;

import java.util.ArrayList;
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
			car.move(Randoms.pickNumberInRange(MOVE_MAX_VALUE, MOVE_MAX_VALUE));
		}
	}
}
