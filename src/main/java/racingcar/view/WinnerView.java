package racingcar.view;

import java.util.List;

import racingcar.model.Car;

public class WinnerView {
	public static void winnerUI(List<Car> winners) {
		System.out.println("최종 우승자 : " + formatWinners(winners));
	}

	private static String formatWinners(List<Car> winners) {
		String winnersText = "";
		winnersText += winners.get(0).getName();
		if (winners.size() == 1) {
			return winnersText;
		}
		for (int i = 1; i < winners.size(); i++) {
			winnersText += ", " + winners.get(i).getName();
		}
		return winnersText;
	}
}
