package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Game {

	private List<Car> cars = new ArrayList<>();

	public void participate(Car car) {
		cars.add(car);
	}

	public List<Car> getCars() {
		return cars;
	}
}
