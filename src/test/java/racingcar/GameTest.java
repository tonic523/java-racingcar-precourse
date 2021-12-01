package racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GameTest {
	@DisplayName("자동차 참가")
	@Test
	void participate() {
		Game game = new Game();
		Car car = new Car("car");
		game.participate(car);
		assertThat(game.getCars().get(0)).isEqualTo(car);
	}

	@DisplayName("최종 우승자")
	@Test
	void winners() {
		Car winner = new Car("car1");
		Car car = new Car("car2");
		Game game = new Game();
		game.participate(winner);
		game.participate(car);
		winner.move(4);
		assertThat(game.winners().get(0)).isEqualTo(winner);
	}
}
