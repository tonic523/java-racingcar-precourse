package racingcar.view;

import java.util.List;

import racingcar.model.Car;

public class PlayView {

	private static final String PLAY_UI_MESSAGE = "실행 결과";

	public static void playUI() {
		System.out.println(PLAY_UI_MESSAGE);
	}

	public static void statusBoardUI(List<Car> cars) {
		for (Car car : cars) {
			System.out.printf("%s : %d\n",
				car.getName(),
				formatPosition(car.getPosition())
			);
		}
	}

	private static String formatPosition(int position) {
		return new String(new char[position]).replace("\0", "-");
	}

}
