package racingcar.controller;

import java.util.ArrayList;
import java.util.List;

import camp.nextstep.edu.missionutils.Console;
import racingcar.model.Car;
import racingcar.utils.Validation;
import racingcar.view.InputView;

public class InputController {

	private static final String ERROR_MESSAGE = "[ERROR]";

	public static List<Car> requestCarsName() {
		try {
			InputView.carNameUI();
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

	public static int requestCount() {
		try {
			InputView.countUI();
			String input = Console.readLine();
			Validation.isNumber(input);
			return Integer.parseInt(input);
		} catch (IllegalArgumentException e) {
			e.getMessage();
			return requestCount();
		}
	}
}
