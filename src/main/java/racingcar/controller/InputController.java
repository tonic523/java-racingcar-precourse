package racingcar.controller;

import java.util.List;

import camp.nextstep.edu.missionutils.Console;
import racingcar.model.Car;
import racingcar.utils.Convertation;
import racingcar.utils.Validate;

import static racingcar.view.InputView.*;

public class InputController {

	private static final String ERROR_MESSAGE = "[ERROR]";

	public static List<Car> inputCarName() {
		try {
			carNameUI();
			String input = Console.readLine();
			Validate.containComma(input);
			return Convertation.namesToCars(input.split(","));
		} catch (IllegalArgumentException e) {
			System.out.println(ERROR_MESSAGE + " " + e.getMessage());
			return inputCarName();
		}
	}

	public static int inputCount() {
		try {
			countUI();
			String input = Console.readLine();
			Validate.isNumber(input);
			Validate.isZero(input);
			return Integer.parseInt(input);
		} catch (IllegalArgumentException e) {
			System.out.println(ERROR_MESSAGE + " " + e.getMessage());
			return inputCount();
		}
	}
}
