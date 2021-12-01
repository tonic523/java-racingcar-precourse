package racingcar;

import java.util.ArrayList;
import java.util.List;

import camp.nextstep.edu.missionutils.Console;
import racingcar.utils.Validate;

public class Application {
	public static void main(String[] args) {
		// TODO 구현 진행
		// 경주할 자동차 이름 입력 및 게임 참가
		Game game;
		while (true) {
			try {
				game = new Game();
				View.inputCarName();
				String[] nameList = Console.readLine().split(",");
				for (String carName : nameList) {
					game.participate(new Car(carName));
				}
				break;
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		// 시도할 회수 입력
		String playCount;
		while (true) {
			try {
				View.inputCount();
				playCount = Console.readLine();
				Validate.isNumber(playCount);
				break;
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		// 실행 결과 현황판
		View.result();
		for (int play = 0; play < Integer.parseInt(playCount); play++) {
			game.play();
			View.resultBoard(game.getCars());
		}
		// 우승자 출력
		View.winner(game.winners());
	}

	public static void participateGame(String nameList) {
		List<Car> cars = new ArrayList<>();

	}
}
