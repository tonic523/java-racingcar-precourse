package racingcar;

import java.util.Collections;
import java.util.List;

public class View {

	private static final String INPUT_CAR_NAME = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	private static final String INPUT_COUNT = "시도할 회수는 몇회인가요?";
	private static final String RESULT = "실행 결과";

	public static void inputCarName() {
		System.out.println(INPUT_CAR_NAME);
	}

	public static void inputCount() {
		System.out.println(INPUT_COUNT);
	}

	public static void result() {
		System.out.println(RESULT);
	}

	public static void resultBoard(List<Car> cars) {
		for (Car car : cars) {
			String distance = new String(new char[car.getPosition()])
				.replace("\0", "-");
			System.out.printf(car.getName() + " : " + distance + "\n");
		}
		System.out.println();
	}

	public static void winner(List<Car> winners) {
		System.out.println("최종 우승자 : " +
			winners.toString()
				.replace("[", "")
				.replace("]", ""));
	}
}
