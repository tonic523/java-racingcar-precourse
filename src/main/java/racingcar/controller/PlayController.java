package racingcar.controller;

import racingcar.model.Game;
import racingcar.view.PlayView;

public class PlayController {
	public static void play(Game game) {
		PlayView.playUI();
		PlayView.resultUI(game.getCars());
	}
}
