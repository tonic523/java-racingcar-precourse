package racingcar.controller;

import racingcar.model.Game;
import racingcar.view.WinnerView;

public class WinnerController {
	public static void winner(Game game) {
		WinnerView.winnerUI(game.winners());
	}
}
