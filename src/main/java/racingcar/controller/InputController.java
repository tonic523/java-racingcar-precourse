package racingcar.controller;

import java.util.ArrayList;
import java.util.List;

import racingcar.model.Car;
import racingcar.utils.Validate;

public class InputController {
	public static List<Car> requestCarName(String request) {
		List<Car> cars = new ArrayList<>();
		Validate.containComma(request);
		String[] carNames = request.split(",");
		for (String carName : carNames) {
			cars.add(new Car(carName));
		}
		return cars;
	}

	public static int requestCount(String input) {
		Validate.isNumber(input);
		Validate.isZero(input);
		return Integer.parseInt(input);
	}
}
