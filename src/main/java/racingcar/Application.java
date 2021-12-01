package racingcar;

import java.util.ArrayList;
import java.util.List;

import camp.nextstep.edu.missionutils.Console;
import racingcar.utils.Validate;

public class Application {
	public static void main(String[] args) {
		// TODO 구현 진행
		// 경주할 자동차 이름 입력 및 게임 참가
		Game game = new Game();
		List<Car> cars = getCarList();
		for (Car car : cars) {
			game.participate(car);
		}
		// 시도할 회수 입력
		int playCount = getPlayCount();
		// 실행 결과 현황판
		View.result();
		for (int play = 0; play < playCount; play++) {
			game.play();
			View.resultBoard(game.getCars());
		}
		// 우승자 출력
		View.winner(game.winners());
	}

	public static List<Car> getCarList() {
		try {
			List<Car> cars = new ArrayList<>();
			View.inputCarName();
			String[] nameList = Console.readLine().split(",");
			for (String carName : nameList) {
				cars.add(new Car(carName));
			}
			return cars;
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			return getCarList();
		}
	}

	public static int getPlayCount() {
		try {
			View.inputCount();
			String input = Console.readLine();
			Validate.isNumber(input);
			return Integer.parseInt(input);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			return getPlayCount();
		}
	}
}
