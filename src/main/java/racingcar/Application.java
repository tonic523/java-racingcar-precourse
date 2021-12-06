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
		List<Car> cars = InputController.inputCarName();
		int count = InputController.inputCount();
		Game game = new Game(cars);
		PlayController.play(game, count);
		WinnerController.winner(game);
	}
}
