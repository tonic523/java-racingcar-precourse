package racingcar.view;

import java.util.List;

import racingcar.model.Car;

public class PlayView {

	public static void playUI() {
		System.out.println("실행 결과");
	}

	public static void resultUI(List<Car> cars) {
		for (Car car : cars) {
			System.out.printf("%s : %d",
				car.getName(),
				formatPosition(car.getPosition()));
		}
		System.out.println();
	}

	private static String formatPosition(int position) {
		return new String(new char[position]).replace("\0", "-");
	}
}
