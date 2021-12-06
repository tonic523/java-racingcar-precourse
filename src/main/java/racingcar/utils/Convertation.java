package racingcar.utils;

import java.util.ArrayList;
import java.util.List;

import racingcar.model.Car;

public class Convertation {
	public static List<Car> namesToCars(String[] names) throws IllegalArgumentException {
		
		List<Car> cars = new ArrayList<>();
		for (String name : names) {
			cars.add(new Car(name));
		}
		return cars;
	}
}
