package racingcar.controller;

import java.util.ArrayList;
import java.util.List;

import camp.nextstep.edu.missionutils.Console;
import racingcar.model.Car;

public class InputController {

	private static final String ERROR_MESSAGE = "[ERROR]";

	public static List<Car> requestCarsName() {
		try {
			String[] carNames = Console.readLine().split(",");
			List<Car> cars = new ArrayList<>();
			for (String carName : carNames) {
				cars.add(new Car(carName));
			}
			return cars;
		} catch (IllegalArgumentException e) {
			System.out.println(ERROR_MESSAGE + " " + e.getMessage());
			return requestCarsName();
		}
	}
}
