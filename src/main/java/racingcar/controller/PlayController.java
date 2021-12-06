package racingcar.controller;

import racingcar.model.Game;
import racingcar.view.PlayView;

public class PlayController {
	public static void play(Game game, int count) {
		PlayView.playUI();
		for (int i = 0; i < count; i++) {
			game.play();
			PlayView.resultUI(game.getCars());
		}
	}
}
