package racingcar.controller;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.model.Game;
import racingcar.model.Movable;
import racingcar.view.PlayView;

import static racingcar.model.Car.*;

public class PlayController {

	private static Movable movable = new Movable() {
		@Override
		public int move() {
			return Randoms.pickNumberInRange(MOVE_RANGE_MIN, MOVE_RANGE_MAX);
		}
	};

	public static void play(Game game, int count) {
		PlayView.playUI();
		for (int i = 0; i < count; i++) {
			game.play(movable);
			PlayView.statusBoardUI(game.getCars());
		}
	}
}
