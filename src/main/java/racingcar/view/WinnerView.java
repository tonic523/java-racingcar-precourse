package racingcar.view;

import java.util.List;

import racingcar.model.Car;

public class WinnerView {

	private static final String WINNER_UI_MESSAGE = "최종 우승자 : ";

	public static void winnerUI(List<Car> cars) {
		System.out.println(WINNER_UI_MESSAGE + formatWinners(cars));
	}

	private static String formatWinners(List<Car> cars) {
		String formatString = "";
		if (cars.size() == 1) {
			return cars.get(0).getName();
		}
		for (Car car : cars) {
			formatString += car.getName() + ", ";
		}
		return formatString.substring(0, formatString.length() - 2);
	}
}
