package racingcar;

import java.util.List;

import racingcar.controller.InputController;
import racingcar.controller.PlayController;
import racingcar.controller.WinnerController;
import racingcar.model.Car;
import racingcar.model.Game;

public class Application {
	public static void main(String[] args) {
		// TODO 구현 진행
		Game game = new Game();
		List<Car> cars = InputController.requestCarsName();
		int gameCount = InputController.requestCount();
		game.participate(cars);
		PlayController.play(game, gameCount);
		WinnerController.winner(game);
	}
}
