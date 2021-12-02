package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Game {

	private List<Car> cars = new ArrayList<>();

	public void participate(List<Car> cars) {
		this.cars = cars;
	}

	public List<Car> getCars() {
		return cars;
	}
}
